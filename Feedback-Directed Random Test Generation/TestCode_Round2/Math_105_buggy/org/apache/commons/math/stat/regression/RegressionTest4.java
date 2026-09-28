package org.apache.commons.math.stat.regression;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        long long56 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 5L + "'", long56 == 5L);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getMeanSquareError();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getTotalSumSquares();
        long long10 = simpleRegression0.getN();
        double double11 = simpleRegression0.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression12 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double13 = simpleRegression12.getIntercept();
        double double14 = simpleRegression12.getMeanSquareError();
        simpleRegression12.clear();
        double double16 = simpleRegression12.getSumSquaredErrors();
        simpleRegression12.addData((double) (byte) 0, (double) 1.0f);
        double double20 = simpleRegression12.getRSquare();
        double double21 = simpleRegression12.getRSquare();
        simpleRegression12.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression23 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double24 = simpleRegression23.getMeanSquareError();
        double double25 = simpleRegression23.getSumSquaredErrors();
        double double26 = simpleRegression23.getSlopeStdErr();
        double double27 = simpleRegression23.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double29 = simpleRegression28.getMeanSquareError();
        double double30 = simpleRegression28.getSumSquaredErrors();
        double double32 = simpleRegression28.predict((double) (short) -1);
        double double33 = simpleRegression28.getIntercept();
        double double34 = simpleRegression28.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression35 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double37 = simpleRegression36.getMeanSquareError();
        double[] doubleArray40 = new double[] { 100.0f, 100L };
        double[] doubleArray43 = new double[] { 100.0f, 100L };
        double[] doubleArray46 = new double[] { 100.0f, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray40, doubleArray43, doubleArray46 };
        simpleRegression36.addData(doubleArray47);
        simpleRegression35.addData(doubleArray47);
        simpleRegression28.addData(doubleArray47);
        simpleRegression23.addData(doubleArray47);
        simpleRegression12.addData(doubleArray47);
        simpleRegression0.addData(doubleArray47);
        double double54 = simpleRegression0.getRSquare();
        double double55 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getTotalSumSquares();
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getSlope();
        double double13 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double14 = simpleRegression0.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double16 = simpleRegression15.getMeanSquareError();
        double double17 = simpleRegression15.getSumSquaredErrors();
        double double19 = simpleRegression15.predict((double) (short) -1);
        long long20 = simpleRegression15.getN();
        double double21 = simpleRegression15.getIntercept();
        simpleRegression15.clear();
        long long23 = simpleRegression15.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression24 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double26 = simpleRegression25.getMeanSquareError();
        double[] doubleArray29 = new double[] { 100.0f, 100L };
        double[] doubleArray32 = new double[] { 100.0f, 100L };
        double[] doubleArray35 = new double[] { 100.0f, 100L };
        double[][] doubleArray36 = new double[][] { doubleArray29, doubleArray32, doubleArray35 };
        simpleRegression25.addData(doubleArray36);
        simpleRegression24.addData(doubleArray36);
        simpleRegression15.addData(doubleArray36);
        simpleRegression0.addData(doubleArray36);
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
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        double double31 = simpleRegression0.getInterceptStdErr();
        long long32 = simpleRegression0.getN();
        double double33 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3L + "'", long32 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        double double18 = simpleRegression0.getMeanSquareError();
        double double19 = simpleRegression0.getRSquare();
        double double21 = simpleRegression0.predict(40.9370377213051d);
        double double22 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getSumSquaredErrors();
        long long15 = simpleRegression0.getN();
        double double17 = simpleRegression0.predict(27.77777777777778d);
        double double18 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        double double16 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData((double) 1L, (double) 0L);
        double double20 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        double double16 = simpleRegression0.getTotalSumSquares();
        double double17 = simpleRegression0.getRSquare();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        double double12 = simpleRegression11.getMeanSquareError();
        double double13 = simpleRegression11.getSlopeStdErr();
        double double14 = simpleRegression11.getSumSquaredErrors();
        double double15 = simpleRegression11.getRSquare();
        long long16 = simpleRegression11.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double18 = simpleRegression17.getIntercept();
        double double19 = simpleRegression17.getMeanSquareError();
        double double21 = simpleRegression17.predict((double) 10.0f);
        double double22 = simpleRegression17.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression23 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double24 = simpleRegression23.getMeanSquareError();
        double double25 = simpleRegression23.getSumSquaredErrors();
        double double27 = simpleRegression23.predict((double) (short) -1);
        double double28 = simpleRegression23.getIntercept();
        double double29 = simpleRegression23.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression30 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression31 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double32 = simpleRegression31.getMeanSquareError();
        double[] doubleArray35 = new double[] { 100.0f, 100L };
        double[] doubleArray38 = new double[] { 100.0f, 100L };
        double[] doubleArray41 = new double[] { 100.0f, 100L };
        double[][] doubleArray42 = new double[][] { doubleArray35, doubleArray38, doubleArray41 };
        simpleRegression31.addData(doubleArray42);
        simpleRegression30.addData(doubleArray42);
        simpleRegression23.addData(doubleArray42);
        simpleRegression17.addData(doubleArray42);
        simpleRegression11.addData(doubleArray42);
        simpleRegression0.addData(doubleArray42);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getSumSquaredErrors();
        double double12 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long4 = simpleRegression0.getN();
        simpleRegression0.addData(40.5d, (double) (short) -1);
        long long8 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double10 = simpleRegression9.getMeanSquareError();
        double[] doubleArray13 = new double[] { 100.0f, 100L };
        double[] doubleArray16 = new double[] { 100.0f, 100L };
        double[] doubleArray19 = new double[] { 100.0f, 100L };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray16, doubleArray19 };
        simpleRegression9.addData(doubleArray20);
        double double22 = simpleRegression9.getR();
        double double23 = simpleRegression9.getRSquare();
        double double24 = simpleRegression9.getSumSquaredErrors();
        double double25 = simpleRegression9.getInterceptStdErr();
        simpleRegression9.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression27 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double28 = simpleRegression27.getMeanSquareError();
        double double29 = simpleRegression27.getSlopeStdErr();
        double double30 = simpleRegression27.getSumSquaredErrors();
        double double31 = simpleRegression27.getSumSquaredErrors();
        double double32 = simpleRegression27.getTotalSumSquares();
        double double33 = simpleRegression27.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double35 = simpleRegression34.getMeanSquareError();
        double double36 = simpleRegression34.getSumSquaredErrors();
        double double38 = simpleRegression34.predict((double) (short) -1);
        double double39 = simpleRegression34.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression40 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double41 = simpleRegression40.getIntercept();
        double double42 = simpleRegression40.getMeanSquareError();
        long long43 = simpleRegression40.getN();
        double double44 = simpleRegression40.getSumSquaredErrors();
        double double45 = simpleRegression40.getR();
        double[] doubleArray52 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray59 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray60 = new double[][] { doubleArray52, doubleArray59 };
        simpleRegression40.addData(doubleArray60);
        simpleRegression34.addData(doubleArray60);
        simpleRegression27.addData(doubleArray60);
        simpleRegression9.addData(doubleArray60);
        simpleRegression0.addData(doubleArray60);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        double double87 = simpleRegression0.getSlopeConfidenceInterval();
        double double88 = simpleRegression0.getRSquare();
        double double90 = simpleRegression0.predict(40.5d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double90));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.predict((double) (-1.0f));
        double double12 = simpleRegression0.predict((-12.222222222222221d));
        long long13 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression7.addData((double) 0L, (double) 10.0f);
        simpleRegression7.clear();
        double double13 = simpleRegression7.predict((double) (byte) 0);
        long long14 = simpleRegression7.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double16 = simpleRegression15.getIntercept();
        double double17 = simpleRegression15.getMeanSquareError();
        long long18 = simpleRegression15.getN();
        double double19 = simpleRegression15.getSumSquaredErrors();
        double double21 = simpleRegression15.predict((-1.4010282776350316d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double23 = simpleRegression22.getMeanSquareError();
        double double24 = simpleRegression22.getSumSquaredErrors();
        double double25 = simpleRegression22.getMeanSquareError();
        double double26 = simpleRegression22.getInterceptStdErr();
        double double27 = simpleRegression22.getRegressionSumSquares();
        simpleRegression22.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double30 = simpleRegression29.getMeanSquareError();
        double double31 = simpleRegression29.getSumSquaredErrors();
        double double33 = simpleRegression29.predict((double) (short) -1);
        double double34 = simpleRegression29.getIntercept();
        double double35 = simpleRegression29.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression37 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double38 = simpleRegression37.getMeanSquareError();
        double[] doubleArray41 = new double[] { 100.0f, 100L };
        double[] doubleArray44 = new double[] { 100.0f, 100L };
        double[] doubleArray47 = new double[] { 100.0f, 100L };
        double[][] doubleArray48 = new double[][] { doubleArray41, doubleArray44, doubleArray47 };
        simpleRegression37.addData(doubleArray48);
        simpleRegression36.addData(doubleArray48);
        simpleRegression29.addData(doubleArray48);
        simpleRegression22.addData(doubleArray48);
        simpleRegression15.addData(doubleArray48);
        simpleRegression7.addData(doubleArray48);
        simpleRegression0.addData(doubleArray48);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getRSquare();
        long long7 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlopeStdErr();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getSlope();
        double double9 = simpleRegression0.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression10 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double11 = simpleRegression10.getIntercept();
        double double12 = simpleRegression10.getMeanSquareError();
        simpleRegression10.clear();
        double double14 = simpleRegression10.getSumSquaredErrors();
        simpleRegression10.addData((double) (byte) 0, (double) 1.0f);
        double double18 = simpleRegression10.getR();
        double double20 = simpleRegression10.predict((double) (-1L));
        double double21 = simpleRegression10.getMeanSquareError();
        double double22 = simpleRegression10.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression23 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double24 = simpleRegression23.getIntercept();
        double double25 = simpleRegression23.getMeanSquareError();
        long long26 = simpleRegression23.getN();
        double double27 = simpleRegression23.getSumSquaredErrors();
        double double28 = simpleRegression23.getR();
        double[] doubleArray35 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray42 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray43 = new double[][] { doubleArray35, doubleArray42 };
        simpleRegression23.addData(doubleArray43);
        double double45 = simpleRegression23.getSumSquaredErrors();
        double double46 = simpleRegression23.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression47 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double48 = simpleRegression47.getMeanSquareError();
        double double49 = simpleRegression47.getSumSquaredErrors();
        double double50 = simpleRegression47.getMeanSquareError();
        double double51 = simpleRegression47.getInterceptStdErr();
        double double52 = simpleRegression47.getRegressionSumSquares();
        simpleRegression47.clear();
        double double54 = simpleRegression47.getInterceptStdErr();
        simpleRegression47.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression56 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double57 = simpleRegression56.getMeanSquareError();
        double double58 = simpleRegression56.getSumSquaredErrors();
        double double60 = simpleRegression56.predict((double) (short) -1);
        double double61 = simpleRegression56.getIntercept();
        double double62 = simpleRegression56.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression63 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression64 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double65 = simpleRegression64.getMeanSquareError();
        double[] doubleArray68 = new double[] { 100.0f, 100L };
        double[] doubleArray71 = new double[] { 100.0f, 100L };
        double[] doubleArray74 = new double[] { 100.0f, 100L };
        double[][] doubleArray75 = new double[][] { doubleArray68, doubleArray71, doubleArray74 };
        simpleRegression64.addData(doubleArray75);
        simpleRegression63.addData(doubleArray75);
        simpleRegression56.addData(doubleArray75);
        simpleRegression47.addData(doubleArray75);
        simpleRegression23.addData(doubleArray75);
        simpleRegression10.addData(doubleArray75);
        simpleRegression0.addData(doubleArray75);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        double double32 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double14 = simpleRegression13.getMeanSquareError();
        simpleRegression13.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double18 = simpleRegression17.getMeanSquareError();
        double[] doubleArray21 = new double[] { 100.0f, 100L };
        double[] doubleArray24 = new double[] { 100.0f, 100L };
        double[] doubleArray27 = new double[] { 100.0f, 100L };
        double[][] doubleArray28 = new double[][] { doubleArray21, doubleArray24, doubleArray27 };
        simpleRegression17.addData(doubleArray28);
        simpleRegression16.addData(doubleArray28);
        simpleRegression13.addData(doubleArray28);
        simpleRegression0.addData(doubleArray28);
        double double33 = simpleRegression0.getIntercept();
        double double34 = simpleRegression0.getInterceptStdErr();
        long long35 = simpleRegression0.getN();
        double double36 = simpleRegression0.getSignificance();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 6L + "'", long35 == 6L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getRegressionSumSquares();
        double double8 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double10 = simpleRegression9.getMeanSquareError();
        double double11 = simpleRegression9.getSumSquaredErrors();
        double double12 = simpleRegression9.getSlopeStdErr();
        double double13 = simpleRegression9.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double15 = simpleRegression14.getIntercept();
        double double16 = simpleRegression14.getMeanSquareError();
        simpleRegression14.clear();
        double double18 = simpleRegression14.getTotalSumSquares();
        double double19 = simpleRegression14.getSumSquaredErrors();
        simpleRegression14.addData((double) (byte) 0, Double.NaN);
        long long23 = simpleRegression14.getN();
        double double24 = simpleRegression14.getRegressionSumSquares();
        double double25 = simpleRegression14.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        double double31 = simpleRegression26.getIntercept();
        long long32 = simpleRegression26.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression33 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double34 = simpleRegression33.getMeanSquareError();
        double double35 = simpleRegression33.getSumSquaredErrors();
        double double37 = simpleRegression33.predict((double) (short) -1);
        double double38 = simpleRegression33.getMeanSquareError();
        double double39 = simpleRegression33.getSlopeStdErr();
        double double41 = simpleRegression33.predict((double) (byte) 1);
        double[] doubleArray48 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray55 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray62 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray69 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray76 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray77 = new double[][] { doubleArray48, doubleArray55, doubleArray62, doubleArray69, doubleArray76 };
        simpleRegression33.addData(doubleArray77);
        simpleRegression26.addData(doubleArray77);
        simpleRegression14.addData(doubleArray77);
        simpleRegression9.addData(doubleArray77);
        simpleRegression0.addData(doubleArray77);
        double double84 = simpleRegression0.predict((double) (short) -1);
        simpleRegression0.addData(0.010000000000000009d, 40.9370377213051d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getRegressionSumSquares();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 0);
        simpleRegression0.clear();
        double double11 = simpleRegression0.predict((double) 10);
        double double12 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double15 = simpleRegression14.getMeanSquareError();
        double double16 = simpleRegression14.getSumSquaredErrors();
        double double18 = simpleRegression14.predict((double) 'a');
        double double19 = simpleRegression14.getSlope();
        double double21 = simpleRegression14.predict((double) (byte) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double23 = simpleRegression22.getMeanSquareError();
        double double24 = simpleRegression22.getSumSquaredErrors();
        double double26 = simpleRegression22.predict((double) (short) -1);
        double double27 = simpleRegression22.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double29 = simpleRegression28.getIntercept();
        double double30 = simpleRegression28.getMeanSquareError();
        long long31 = simpleRegression28.getN();
        double double32 = simpleRegression28.getSumSquaredErrors();
        double double33 = simpleRegression28.getR();
        double[] doubleArray40 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray47 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray48 = new double[][] { doubleArray40, doubleArray47 };
        simpleRegression28.addData(doubleArray48);
        simpleRegression22.addData(doubleArray48);
        double double51 = simpleRegression22.getRegressionSumSquares();
        double double52 = simpleRegression22.getIntercept();
        double double53 = simpleRegression22.getSlopeStdErr();
        double double54 = simpleRegression22.getInterceptStdErr();
        double double55 = simpleRegression22.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression56 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double57 = simpleRegression56.getMeanSquareError();
        double[] doubleArray60 = new double[] { 100.0f, 100L };
        double[] doubleArray63 = new double[] { 100.0f, 100L };
        double[] doubleArray66 = new double[] { 100.0f, 100L };
        double[][] doubleArray67 = new double[][] { doubleArray60, doubleArray63, doubleArray66 };
        simpleRegression56.addData(doubleArray67);
        double double69 = simpleRegression56.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression70 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression71 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double72 = simpleRegression71.getMeanSquareError();
        double[] doubleArray75 = new double[] { 100.0f, 100L };
        double[] doubleArray78 = new double[] { 100.0f, 100L };
        double[] doubleArray81 = new double[] { 100.0f, 100L };
        double[][] doubleArray82 = new double[][] { doubleArray75, doubleArray78, doubleArray81 };
        simpleRegression71.addData(doubleArray82);
        simpleRegression70.addData(doubleArray82);
        double double85 = simpleRegression70.getSignificance();
        double[][] doubleArray86 = new double[][] {};
        simpleRegression70.addData(doubleArray86);
        simpleRegression56.addData(doubleArray86);
        simpleRegression22.addData(doubleArray86);
        simpleRegression14.addData(doubleArray86);
        simpleRegression0.addData(doubleArray86);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[][] {});
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        double double16 = simpleRegression0.getSlope();
        double double17 = simpleRegression0.getInterceptStdErr();
        double double18 = simpleRegression0.getSlope();
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
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        simpleRegression0.clear();
        double double36 = simpleRegression0.getSumSquaredErrors();
        double double37 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double39 = simpleRegression0.getSlopeConfidenceInterval((double) 100.0f);
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
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        double[] doubleArray76 = new double[] { (short) -1, (byte) 10 };
        double[] doubleArray79 = new double[] { (short) -1, (byte) 10 };
        double[] doubleArray82 = new double[] { (short) -1, (byte) 10 };
        double[] doubleArray85 = new double[] { (short) -1, (byte) 10 };
        double[] doubleArray88 = new double[] { (short) -1, (byte) 10 };
        double[][] doubleArray89 = new double[][] { doubleArray76, doubleArray79, doubleArray82, doubleArray85, doubleArray88 };
        simpleRegression0.addData(doubleArray89);
        double double92 = simpleRegression0.predict((double) ' ');
        double double93 = simpleRegression0.getR();
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
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 93.16554809843402d + "'", double92 == 93.16554809843402d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.8617651986444268d + "'", double93 == 0.8617651986444268d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getSumSquaredErrors();
        long long9 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        long long16 = simpleRegression0.getN();
        double double17 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double19 = simpleRegression0.getRegressionSumSquares();
        long long20 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
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
        double double33 = simpleRegression0.getSlopeStdErr();
        double double34 = simpleRegression0.getIntercept();
        long long35 = simpleRegression0.getN();
        double double36 = simpleRegression0.getR();
        double double37 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 4L + "'", long35 == 4L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData((double) 2L, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval((double) (-1.0f));
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
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict((double) (byte) -1);
        double double7 = simpleRegression0.predict((double) ' ');
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        double double11 = simpleRegression0.getRSquare();
        double double12 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSlope();
        double double15 = simpleRegression0.getSlopeConfidenceInterval();
        double double17 = simpleRegression0.predict(2.0d);
        double double19 = simpleRegression0.predict(7650.749999999999d);
        double double20 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getRSquare();
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval(73.154564255329d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.predict(55.98564498564499d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double17 = simpleRegression16.getMeanSquareError();
        double double18 = simpleRegression16.getSumSquaredErrors();
        double double19 = simpleRegression16.getMeanSquareError();
        double double21 = simpleRegression16.predict((double) 10);
        simpleRegression16.clear();
        double[] doubleArray28 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray34 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray35 = new double[][] { doubleArray28, doubleArray34 };
        simpleRegression16.addData(doubleArray35);
        simpleRegression0.addData(doubleArray35);
        double double38 = simpleRegression0.getR();
        double double39 = simpleRegression0.getSlopeStdErr();
        double double40 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 5070.0d + "'", double40 == 5070.0d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        double double35 = simpleRegression13.getSumSquaredErrors();
        double double36 = simpleRegression13.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression37 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double38 = simpleRegression37.getMeanSquareError();
        double double39 = simpleRegression37.getSumSquaredErrors();
        double double40 = simpleRegression37.getMeanSquareError();
        double double41 = simpleRegression37.getInterceptStdErr();
        double double42 = simpleRegression37.getRegressionSumSquares();
        simpleRegression37.clear();
        double double44 = simpleRegression37.getInterceptStdErr();
        simpleRegression37.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double47 = simpleRegression46.getMeanSquareError();
        double double48 = simpleRegression46.getSumSquaredErrors();
        double double50 = simpleRegression46.predict((double) (short) -1);
        double double51 = simpleRegression46.getIntercept();
        double double52 = simpleRegression46.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression53 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression54 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double55 = simpleRegression54.getMeanSquareError();
        double[] doubleArray58 = new double[] { 100.0f, 100L };
        double[] doubleArray61 = new double[] { 100.0f, 100L };
        double[] doubleArray64 = new double[] { 100.0f, 100L };
        double[][] doubleArray65 = new double[][] { doubleArray58, doubleArray61, doubleArray64 };
        simpleRegression54.addData(doubleArray65);
        simpleRegression53.addData(doubleArray65);
        simpleRegression46.addData(doubleArray65);
        simpleRegression37.addData(doubleArray65);
        simpleRegression13.addData(doubleArray65);
        simpleRegression0.addData(doubleArray65);
        double double73 = simpleRegression0.predict(0.08135267920672046d);
        double double74 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
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
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0805391524146533d + "'", double73 == 1.0805391524146533d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getMeanSquareError();
        double double10 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((double) 10.0f);
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getRSquare();
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.predict((double) 100);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        double double88 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(0.0d, (double) 1L);
        double double92 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double92));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        double double46 = simpleRegression0.getSlopeConfidenceInterval();
        double double47 = simpleRegression0.getRSquare();
        double double48 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double4 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.predict(100.0d);
        double double11 = simpleRegression0.getRegressionSumSquares();
        double double12 = simpleRegression0.getMeanSquareError();
        double double13 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double14 = simpleRegression0.predict((double) 10);
        double double16 = simpleRegression0.predict((double) 1L);
        double double17 = simpleRegression0.getIntercept();
        double double19 = simpleRegression0.predict((double) '#');
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        double double12 = simpleRegression0.getSumSquaredErrors();
        double double13 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        double double24 = simpleRegression0.predict((double) ' ');
        double double25 = simpleRegression0.getIntercept();
        double double26 = simpleRegression0.getTotalSumSquares();
        double double27 = simpleRegression0.getMeanSquareError();
        double double28 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        simpleRegression0.clear();
        double double10 = simpleRegression0.getR();
        simpleRegression0.addData(1.0101010101010102d, (-686.4999999999999d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        long long16 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double18 = simpleRegression17.getMeanSquareError();
        double double19 = simpleRegression17.getSumSquaredErrors();
        double double21 = simpleRegression17.predict((double) (short) -1);
        long long22 = simpleRegression17.getN();
        double double23 = simpleRegression17.getIntercept();
        simpleRegression17.clear();
        long long25 = simpleRegression17.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression27 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double28 = simpleRegression27.getMeanSquareError();
        double[] doubleArray31 = new double[] { 100.0f, 100L };
        double[] doubleArray34 = new double[] { 100.0f, 100L };
        double[] doubleArray37 = new double[] { 100.0f, 100L };
        double[][] doubleArray38 = new double[][] { doubleArray31, doubleArray34, doubleArray37 };
        simpleRegression27.addData(doubleArray38);
        simpleRegression26.addData(doubleArray38);
        simpleRegression17.addData(doubleArray38);
        simpleRegression0.addData(doubleArray38);
        double double43 = simpleRegression0.getTotalSumSquares();
        double double44 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData((double) 2L, 0.0d);
        double double13 = simpleRegression0.getIntercept();
        double double14 = simpleRegression0.getR();
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getTotalSumSquares();
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getRegressionSumSquares();
        double double12 = simpleRegression0.getSlopeStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double7 = simpleRegression0.predict((double) (byte) 1);
        simpleRegression0.clear();
        double double9 = simpleRegression0.getInterceptStdErr();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getR();
        double double8 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.predict(100.0d);
        simpleRegression0.addData((double) (-1L), 0.9984957532976854d);
        java.lang.Class<?> wildcardClass14 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        double double17 = simpleRegression0.getMeanSquareError();
        double double18 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double10 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.predict(6942.857142857143d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlope();
        double double14 = simpleRegression0.getInterceptStdErr();
        double double15 = simpleRegression0.getSignificance();
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
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getIntercept();
        long long13 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getIntercept();
        double double3 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        double double40 = simpleRegression0.getSignificance();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double43 = simpleRegression0.getSlopeConfidenceInterval((double) 1);
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
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        simpleRegression0.addData((double) 'a', (double) 10L);
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
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getTotalSumSquares();
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getRegressionSumSquares();
        double double12 = simpleRegression0.getRSquare();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        double double48 = simpleRegression0.getSlopeConfidenceInterval(0.026087457669492504d);
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
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.predict((double) (byte) 10);
        simpleRegression0.clear();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.predict((double) 10.0f);
        double double6 = simpleRegression0.predict((double) 1L);
        double double7 = simpleRegression0.getRegressionSumSquares();
        double double8 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        long long6 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double8 = simpleRegression7.getMeanSquareError();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) (short) -1);
        double double12 = simpleRegression7.getMeanSquareError();
        double double13 = simpleRegression7.getSlopeStdErr();
        double double15 = simpleRegression7.predict((double) (byte) 1);
        double[] doubleArray22 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray29 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray36 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray43 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray50 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray51 = new double[][] { doubleArray22, doubleArray29, doubleArray36, doubleArray43, doubleArray50 };
        simpleRegression7.addData(doubleArray51);
        simpleRegression0.addData(doubleArray51);
        double double54 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double56 = simpleRegression0.getSlope();
        long long57 = simpleRegression0.getN();
        double double58 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        simpleRegression0.addData((double) 'a', (double) 10L);
        double double11 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double14 = simpleRegression13.getMeanSquareError();
        double double15 = simpleRegression13.getSumSquaredErrors();
        double double17 = simpleRegression13.predict((double) (short) -1);
        double double18 = simpleRegression13.getMeanSquareError();
        double double19 = simpleRegression13.getSlopeStdErr();
        double double21 = simpleRegression13.predict((double) (byte) 1);
        simpleRegression13.addData(Double.NaN, (double) (byte) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double26 = simpleRegression25.getMeanSquareError();
        double double27 = simpleRegression25.getSumSquaredErrors();
        double double28 = simpleRegression25.getMeanSquareError();
        double double29 = simpleRegression25.getInterceptStdErr();
        double double30 = simpleRegression25.getRegressionSumSquares();
        simpleRegression25.clear();
        double double32 = simpleRegression25.getInterceptStdErr();
        simpleRegression25.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double35 = simpleRegression34.getMeanSquareError();
        double double36 = simpleRegression34.getSumSquaredErrors();
        double double38 = simpleRegression34.predict((double) (short) -1);
        double double39 = simpleRegression34.getIntercept();
        double double40 = simpleRegression34.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression41 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression42 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double43 = simpleRegression42.getMeanSquareError();
        double[] doubleArray46 = new double[] { 100.0f, 100L };
        double[] doubleArray49 = new double[] { 100.0f, 100L };
        double[] doubleArray52 = new double[] { 100.0f, 100L };
        double[][] doubleArray53 = new double[][] { doubleArray46, doubleArray49, doubleArray52 };
        simpleRegression42.addData(doubleArray53);
        simpleRegression41.addData(doubleArray53);
        simpleRegression34.addData(doubleArray53);
        simpleRegression25.addData(doubleArray53);
        simpleRegression13.addData(doubleArray53);
        simpleRegression0.addData(doubleArray53);
        double double60 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) 8L, 4050.0d);
        long long64 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 5761.908586063494d + "'", double60 == 5761.908586063494d);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 6L + "'", long64 == 6L);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getMeanSquareError();
        double double16 = simpleRegression0.getSlope();
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
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        double double22 = simpleRegression0.getMeanSquareError();
        double double23 = simpleRegression0.getTotalSumSquares();
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
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        double double13 = simpleRegression0.getRSquare();
        double double14 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getMeanSquareError();
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
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getR();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        long long19 = simpleRegression0.getN();
        double double20 = simpleRegression0.getSlopeStdErr();
        double double21 = simpleRegression0.getSumSquaredErrors();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData((double) 2L, 0.0d);
        double double13 = simpleRegression0.getIntercept();
        double double14 = simpleRegression0.getR();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getIntercept();
        double double17 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getRegressionSumSquares();
        double double3 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double14 = simpleRegression0.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double17 = simpleRegression16.getMeanSquareError();
        double[] doubleArray20 = new double[] { 100.0f, 100L };
        double[] doubleArray23 = new double[] { 100.0f, 100L };
        double[] doubleArray26 = new double[] { 100.0f, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray20, doubleArray23, doubleArray26 };
        simpleRegression16.addData(doubleArray27);
        simpleRegression15.addData(doubleArray27);
        double double30 = simpleRegression15.getTotalSumSquares();
        simpleRegression15.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression32 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double33 = simpleRegression32.getMeanSquareError();
        double[] doubleArray36 = new double[] { 100.0f, 100L };
        double[] doubleArray39 = new double[] { 100.0f, 100L };
        double[] doubleArray42 = new double[] { 100.0f, 100L };
        double[][] doubleArray43 = new double[][] { doubleArray36, doubleArray39, doubleArray42 };
        simpleRegression32.addData(doubleArray43);
        double double45 = simpleRegression32.getR();
        double double46 = simpleRegression32.getSignificance();
        double double47 = simpleRegression32.getR();
        double double48 = simpleRegression32.getR();
        double double49 = simpleRegression32.getRegressionSumSquares();
        double double50 = simpleRegression32.getSlopeConfidenceInterval();
        double double52 = simpleRegression32.predict(93.16554809843402d);
        simpleRegression32.addData((double) 0, 1.0d);
        double double56 = simpleRegression32.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression57 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double58 = simpleRegression57.getMeanSquareError();
        double double59 = simpleRegression57.getSumSquaredErrors();
        double double61 = simpleRegression57.predict((double) (short) -1);
        double double62 = simpleRegression57.getIntercept();
        double double63 = simpleRegression57.getSlope();
        double[][] doubleArray64 = new double[][] {};
        simpleRegression57.addData(doubleArray64);
        simpleRegression32.addData(doubleArray64);
        simpleRegression15.addData(doubleArray64);
        simpleRegression0.addData(doubleArray64);
        double double69 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 7350.75d + "'", double56 == 7350.75d);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[][] {});
        org.junit.Assert.assertTrue(Double.isNaN(double69));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getIntercept();
        double double13 = simpleRegression0.getSlope();
        double double15 = simpleRegression0.predict((double) 100L);
        simpleRegression0.addData((double) 10L, 7500.000000000001d);
        double double19 = simpleRegression0.getInterceptStdErr();
        double double20 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSlopeStdErr();
        double double7 = simpleRegression4.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        simpleRegression8.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression12 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double13 = simpleRegression12.getMeanSquareError();
        double[] doubleArray16 = new double[] { 100.0f, 100L };
        double[] doubleArray19 = new double[] { 100.0f, 100L };
        double[] doubleArray22 = new double[] { 100.0f, 100L };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray19, doubleArray22 };
        simpleRegression12.addData(doubleArray23);
        simpleRegression11.addData(doubleArray23);
        simpleRegression8.addData(doubleArray23);
        double double27 = simpleRegression8.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double29 = simpleRegression28.getMeanSquareError();
        double[] doubleArray32 = new double[] { 100.0f, 100L };
        double[] doubleArray35 = new double[] { 100.0f, 100L };
        double[] doubleArray38 = new double[] { 100.0f, 100L };
        double[][] doubleArray39 = new double[][] { doubleArray32, doubleArray35, doubleArray38 };
        simpleRegression28.addData(doubleArray39);
        simpleRegression8.addData(doubleArray39);
        simpleRegression4.addData(doubleArray39);
        simpleRegression0.addData(doubleArray39);
        double double44 = simpleRegression0.getSumSquaredErrors();
        double double45 = simpleRegression0.getRSquare();
        double double46 = simpleRegression0.getSlopeConfidenceInterval();
        double double47 = simpleRegression0.getR();
        double double48 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double14 = simpleRegression0.getSlope();
        double double15 = simpleRegression0.getRSquare();
        double double16 = simpleRegression0.getSlopeStdErr();
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
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSumSquaredErrors();
        double double9 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.predict(100.0d);
        double double11 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getR();
        double double17 = simpleRegression0.getSumSquaredErrors();
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
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 0);
        simpleRegression0.clear();
        double double11 = simpleRegression0.predict((double) 10);
        double double12 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.getR();
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
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) 0, Double.NaN);
        double double19 = simpleRegression0.getSignificance();
        double double20 = simpleRegression0.getTotalSumSquares();
        double double21 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        double double15 = simpleRegression0.getInterceptStdErr();
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
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double15 = simpleRegression0.predict((double) (byte) -1);
        double double16 = simpleRegression0.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double18 = simpleRegression17.getMeanSquareError();
        double double19 = simpleRegression17.getSumSquaredErrors();
        double double20 = simpleRegression17.getMeanSquareError();
        double double21 = simpleRegression17.getInterceptStdErr();
        double double22 = simpleRegression17.getRegressionSumSquares();
        simpleRegression17.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression24 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double25 = simpleRegression24.getMeanSquareError();
        double double26 = simpleRegression24.getSumSquaredErrors();
        double double28 = simpleRegression24.predict((double) (short) -1);
        double double29 = simpleRegression24.getIntercept();
        double double30 = simpleRegression24.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression31 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression32 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double33 = simpleRegression32.getMeanSquareError();
        double[] doubleArray36 = new double[] { 100.0f, 100L };
        double[] doubleArray39 = new double[] { 100.0f, 100L };
        double[] doubleArray42 = new double[] { 100.0f, 100L };
        double[][] doubleArray43 = new double[][] { doubleArray36, doubleArray39, doubleArray42 };
        simpleRegression32.addData(doubleArray43);
        simpleRegression31.addData(doubleArray43);
        simpleRegression24.addData(doubleArray43);
        simpleRegression17.addData(doubleArray43);
        simpleRegression0.addData(doubleArray43);
        long long49 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 6L + "'", long49 == 6L);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        double double33 = simpleRegression0.getTotalSumSquares();
        double double35 = simpleRegression0.predict((double) (byte) 100);
        double double36 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.addData((double) (short) 10, (double) ' ');
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getSumSquaredErrors();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double11 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        double double24 = simpleRegression0.predict((double) ' ');
        double double25 = simpleRegression0.getIntercept();
        double double27 = simpleRegression0.predict((-1.4010282776350316d));
        double double28 = simpleRegression0.getSignificance();
        double double29 = simpleRegression0.getSlopeStdErr();
        double double30 = simpleRegression0.getSumSquaredErrors();
        double double31 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getSlopeStdErr();
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.getSignificance();
        simpleRegression0.addData(1.0d, (double) 1);
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
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        double double27 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(0.0d, 515.3034511711904d);
        // The following exception was thrown during execution in test generation
        try {
            double double32 = simpleRegression0.getSlopeConfidenceInterval(43.810058489328185d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        long long25 = simpleRegression0.getN();
        double double26 = simpleRegression0.getRSquare();
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3L + "'", long25 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        double double17 = simpleRegression0.getInterceptStdErr();
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
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression5 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double6 = simpleRegression5.getMeanSquareError();
        double double7 = simpleRegression5.getSumSquaredErrors();
        double double9 = simpleRegression5.predict((double) (short) -1);
        double double10 = simpleRegression5.getIntercept();
        double double11 = simpleRegression5.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression12 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double14 = simpleRegression13.getMeanSquareError();
        double[] doubleArray17 = new double[] { 100.0f, 100L };
        double[] doubleArray20 = new double[] { 100.0f, 100L };
        double[] doubleArray23 = new double[] { 100.0f, 100L };
        double[][] doubleArray24 = new double[][] { doubleArray17, doubleArray20, doubleArray23 };
        simpleRegression13.addData(doubleArray24);
        simpleRegression12.addData(doubleArray24);
        simpleRegression5.addData(doubleArray24);
        simpleRegression0.addData(doubleArray24);
        double double29 = simpleRegression0.getSignificance();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double26 = simpleRegression25.getMeanSquareError();
        double double27 = simpleRegression25.getSumSquaredErrors();
        double double29 = simpleRegression25.predict((double) (short) -1);
        double double30 = simpleRegression25.getIntercept();
        double double31 = simpleRegression25.getSlope();
        double[][] doubleArray32 = new double[][] {};
        simpleRegression25.addData(doubleArray32);
        simpleRegression0.addData(doubleArray32);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression35 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double36 = simpleRegression35.getMeanSquareError();
        double double37 = simpleRegression35.getSumSquaredErrors();
        double double39 = simpleRegression35.predict((double) (short) -1);
        double double40 = simpleRegression35.getRegressionSumSquares();
        double double41 = simpleRegression35.getSumSquaredErrors();
        long long42 = simpleRegression35.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression43 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double44 = simpleRegression43.getMeanSquareError();
        double double45 = simpleRegression43.getSumSquaredErrors();
        double double46 = simpleRegression43.getMeanSquareError();
        double double47 = simpleRegression43.getInterceptStdErr();
        double double48 = simpleRegression43.getRegressionSumSquares();
        simpleRegression43.clear();
        double double50 = simpleRegression43.getInterceptStdErr();
        simpleRegression43.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression52 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double53 = simpleRegression52.getMeanSquareError();
        double double54 = simpleRegression52.getSumSquaredErrors();
        double double56 = simpleRegression52.predict((double) (short) -1);
        double double57 = simpleRegression52.getIntercept();
        double double58 = simpleRegression52.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression59 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression60 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double61 = simpleRegression60.getMeanSquareError();
        double[] doubleArray64 = new double[] { 100.0f, 100L };
        double[] doubleArray67 = new double[] { 100.0f, 100L };
        double[] doubleArray70 = new double[] { 100.0f, 100L };
        double[][] doubleArray71 = new double[][] { doubleArray64, doubleArray67, doubleArray70 };
        simpleRegression60.addData(doubleArray71);
        simpleRegression59.addData(doubleArray71);
        simpleRegression52.addData(doubleArray71);
        simpleRegression43.addData(doubleArray71);
        simpleRegression35.addData(doubleArray71);
        simpleRegression0.addData(doubleArray71);
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
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[][] {});
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        double double16 = simpleRegression0.getRSquare();
        double double17 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.predict((double) 10.0f);
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval(3468.0000000000005d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getRegressionSumSquares();
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
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        double double24 = simpleRegression0.getTotalSumSquares();
        double double25 = simpleRegression0.getSlopeStdErr();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        double double28 = simpleRegression0.predict((double) 10);
        double double29 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        double double34 = simpleRegression0.getInterceptStdErr();
        double double35 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData((-590.279642058169d), 3.9430031671875E7d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        long long19 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double18 = simpleRegression0.predict((double) (short) 1);
        long long19 = simpleRegression0.getN();
        double double20 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval(0.99d);
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
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double16 = simpleRegression15.getMeanSquareError();
        double[] doubleArray19 = new double[] { 100.0f, 100L };
        double[] doubleArray22 = new double[] { 100.0f, 100L };
        double[] doubleArray25 = new double[] { 100.0f, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray19, doubleArray22, doubleArray25 };
        simpleRegression15.addData(doubleArray26);
        simpleRegression14.addData(doubleArray26);
        double double29 = simpleRegression14.getSignificance();
        double[][] doubleArray30 = new double[][] {};
        simpleRegression14.addData(doubleArray30);
        simpleRegression0.addData(doubleArray30);
        long long33 = simpleRegression0.getN();
        double double34 = simpleRegression0.getSumSquaredErrors();
        double double35 = simpleRegression0.getInterceptStdErr();
        double double36 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[][] {});
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 3L + "'", long33 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        simpleRegression0.clear();
        double double19 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression21 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double22 = simpleRegression21.getMeanSquareError();
        double[] doubleArray25 = new double[] { 100.0f, 100L };
        double[] doubleArray28 = new double[] { 100.0f, 100L };
        double[] doubleArray31 = new double[] { 100.0f, 100L };
        double[][] doubleArray32 = new double[][] { doubleArray25, doubleArray28, doubleArray31 };
        simpleRegression21.addData(doubleArray32);
        simpleRegression20.addData(doubleArray32);
        double double35 = simpleRegression20.getSumSquaredErrors();
        double double36 = simpleRegression20.getSlopeStdErr();
        double double37 = simpleRegression20.getRegressionSumSquares();
        double double38 = simpleRegression20.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression39 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double40 = simpleRegression39.getIntercept();
        double double41 = simpleRegression39.getMeanSquareError();
        simpleRegression39.clear();
        double double43 = simpleRegression39.getTotalSumSquares();
        double double44 = simpleRegression39.getIntercept();
        double double45 = simpleRegression39.getSlopeStdErr();
        long long46 = simpleRegression39.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression47 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double48 = simpleRegression47.getMeanSquareError();
        double[] doubleArray51 = new double[] { 100.0f, 100L };
        double[] doubleArray54 = new double[] { 100.0f, 100L };
        double[] doubleArray57 = new double[] { 100.0f, 100L };
        double[][] doubleArray58 = new double[][] { doubleArray51, doubleArray54, doubleArray57 };
        simpleRegression47.addData(doubleArray58);
        long long60 = simpleRegression47.getN();
        double double61 = simpleRegression47.getRSquare();
        double double62 = simpleRegression47.getR();
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
        simpleRegression47.addData(doubleArray82);
        simpleRegression39.addData(doubleArray82);
        simpleRegression20.addData(doubleArray82);
        simpleRegression0.addData(doubleArray82);
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
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 3L + "'", long60 == 3L);
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
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        double double11 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        double double13 = simpleRegression0.getSumSquaredErrors();
        double double14 = simpleRegression0.getIntercept();
        double double15 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        double double34 = simpleRegression0.getIntercept();
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
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((double) 0L, (double) 10.0f);
        simpleRegression0.clear();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getRegressionSumSquares();
        double double8 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getRSquare();
        double double6 = simpleRegression0.predict((double) 3L);
        simpleRegression0.clear();
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
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getIntercept();
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.getSignificance();
        simpleRegression0.addData((double) (short) -1, (double) 7L);
        double double21 = simpleRegression0.getRegressionSumSquares();
        double double23 = simpleRegression0.predict(1712042.9489795922d);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6486.750000000001d + "'", double21 == 6486.750000000001d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1576443.5074762583d + "'", double23 == 1576443.5074762583d);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        long long6 = simpleRegression0.getN();
        double double8 = simpleRegression0.predict((-989.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getIntercept();
        double double10 = simpleRegression8.getMeanSquareError();
        simpleRegression8.clear();
        double double13 = simpleRegression8.predict((double) (byte) 10);
        double double14 = simpleRegression8.getSumSquaredErrors();
        double double15 = simpleRegression8.getRegressionSumSquares();
        double double16 = simpleRegression8.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double18 = simpleRegression17.getMeanSquareError();
        double double19 = simpleRegression17.getSumSquaredErrors();
        double double21 = simpleRegression17.predict((double) (short) -1);
        long long22 = simpleRegression17.getN();
        double double23 = simpleRegression17.getTotalSumSquares();
        double double24 = simpleRegression17.getMeanSquareError();
        double double25 = simpleRegression17.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getIntercept();
        double double28 = simpleRegression26.getMeanSquareError();
        simpleRegression26.clear();
        double double30 = simpleRegression26.getTotalSumSquares();
        double double31 = simpleRegression26.getIntercept();
        double double32 = simpleRegression26.getSlopeStdErr();
        long long33 = simpleRegression26.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double35 = simpleRegression34.getMeanSquareError();
        double[] doubleArray38 = new double[] { 100.0f, 100L };
        double[] doubleArray41 = new double[] { 100.0f, 100L };
        double[] doubleArray44 = new double[] { 100.0f, 100L };
        double[][] doubleArray45 = new double[][] { doubleArray38, doubleArray41, doubleArray44 };
        simpleRegression34.addData(doubleArray45);
        long long47 = simpleRegression34.getN();
        double double48 = simpleRegression34.getRSquare();
        double double49 = simpleRegression34.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression50 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double51 = simpleRegression50.getMeanSquareError();
        double double52 = simpleRegression50.getSumSquaredErrors();
        double double53 = simpleRegression50.getMeanSquareError();
        double double55 = simpleRegression50.predict((double) 10);
        simpleRegression50.clear();
        double[] doubleArray62 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray68 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray69 = new double[][] { doubleArray62, doubleArray68 };
        simpleRegression50.addData(doubleArray69);
        simpleRegression34.addData(doubleArray69);
        simpleRegression26.addData(doubleArray69);
        simpleRegression17.addData(doubleArray69);
        simpleRegression8.addData(doubleArray69);
        simpleRegression0.addData(doubleArray69);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 3L + "'", long47 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict((double) (byte) -1);
        double double6 = simpleRegression0.getRSquare();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getMeanSquareError();
        double double8 = simpleRegression0.getRSquare();
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
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        double double18 = simpleRegression0.getMeanSquareError();
        double double19 = simpleRegression0.getR();
        double double20 = simpleRegression0.getSlope();
        double double21 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        double double16 = simpleRegression0.getRSquare();
        double double17 = simpleRegression0.getR();
        double double18 = simpleRegression0.getSignificance();
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
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        double double17 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (-1), 93.16554809843402d);
        double double21 = simpleRegression0.getInterceptStdErr();
        double double22 = simpleRegression0.getTotalSumSquares();
        double double23 = simpleRegression0.getRSquare();
        double double24 = simpleRegression0.getR();
        simpleRegression0.clear();
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.03229959611417d + "'", double22 == 35.03229959611417d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        double double18 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 7500.000000000001d + "'", double18 == 7500.000000000001d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0101010101010104d) + "'", double19 == (-1.0101010101010104d));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        double double16 = simpleRegression0.getSignificance();
        double double17 = simpleRegression0.getRegressionSumSquares();
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
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        simpleRegression0.clear();
        double double14 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getMeanSquareError();
        long long7 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double15 = simpleRegression0.predict((double) (byte) -1);
        double double16 = simpleRegression0.getRSquare();
        double double17 = simpleRegression0.getInterceptStdErr();
        double double18 = simpleRegression0.getSlopeConfidenceInterval();
        long long19 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        long long25 = simpleRegression0.getN();
        double double26 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression27 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double28 = simpleRegression27.getMeanSquareError();
        double[] doubleArray31 = new double[] { 100.0f, 100L };
        double[] doubleArray34 = new double[] { 100.0f, 100L };
        double[] doubleArray37 = new double[] { 100.0f, 100L };
        double[][] doubleArray38 = new double[][] { doubleArray31, doubleArray34, doubleArray37 };
        simpleRegression27.addData(doubleArray38);
        double double40 = simpleRegression27.getTotalSumSquares();
        double double41 = simpleRegression27.getRSquare();
        double double42 = simpleRegression27.getInterceptStdErr();
        double double43 = simpleRegression27.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression44 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double45 = simpleRegression44.getMeanSquareError();
        double[] doubleArray48 = new double[] { 100.0f, 100L };
        double[] doubleArray51 = new double[] { 100.0f, 100L };
        double[] doubleArray54 = new double[] { 100.0f, 100L };
        double[][] doubleArray55 = new double[][] { doubleArray48, doubleArray51, doubleArray54 };
        simpleRegression44.addData(doubleArray55);
        double double57 = simpleRegression44.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression58 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression59 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double60 = simpleRegression59.getMeanSquareError();
        double[] doubleArray63 = new double[] { 100.0f, 100L };
        double[] doubleArray66 = new double[] { 100.0f, 100L };
        double[] doubleArray69 = new double[] { 100.0f, 100L };
        double[][] doubleArray70 = new double[][] { doubleArray63, doubleArray66, doubleArray69 };
        simpleRegression59.addData(doubleArray70);
        simpleRegression58.addData(doubleArray70);
        double double73 = simpleRegression58.getSignificance();
        double[][] doubleArray74 = new double[][] {};
        simpleRegression58.addData(doubleArray74);
        simpleRegression44.addData(doubleArray74);
        simpleRegression27.addData(doubleArray74);
        simpleRegression0.addData(doubleArray74);
        double double79 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3L + "'", long25 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[][] {});
        org.junit.Assert.assertTrue(Double.isNaN(double79));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double14 = simpleRegression0.getR();
        double double15 = simpleRegression0.getSlopeConfidenceInterval();
        double double16 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.clear();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        double double18 = simpleRegression0.getTotalSumSquares();
        double double20 = simpleRegression0.getSlopeConfidenceInterval(0.19906283479973047d);
        double double21 = simpleRegression0.getSlopeStdErr();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        long long30 = simpleRegression0.getN();
        double double31 = simpleRegression0.getTotalSumSquares();
        double double32 = simpleRegression0.getIntercept();
        double double33 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double35 = simpleRegression0.getSlopeConfidenceInterval(12000.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((double) 0L, (double) 10.0f);
        simpleRegression0.clear();
        double double6 = simpleRegression0.predict((double) (byte) 0);
        java.lang.Class<?> wildcardClass7 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        simpleRegression0.addData(2.0914007576402587d, 99.10891089108911d);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression19 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double20 = simpleRegression19.getMeanSquareError();
        double double21 = simpleRegression19.getSumSquaredErrors();
        double double22 = simpleRegression19.getMeanSquareError();
        double double24 = simpleRegression19.predict((double) 10);
        double double25 = simpleRegression19.getSlopeStdErr();
        double double26 = simpleRegression19.getSlope();
        double double27 = simpleRegression19.getRSquare();
        double double28 = simpleRegression19.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double30 = simpleRegression29.getMeanSquareError();
        double[] doubleArray33 = new double[] { 100.0f, 100L };
        double[] doubleArray36 = new double[] { 100.0f, 100L };
        double[] doubleArray39 = new double[] { 100.0f, 100L };
        double[][] doubleArray40 = new double[][] { doubleArray33, doubleArray36, doubleArray39 };
        simpleRegression29.addData(doubleArray40);
        double double42 = simpleRegression29.getTotalSumSquares();
        double double43 = simpleRegression29.getSignificance();
        double double44 = simpleRegression29.getSignificance();
        double double45 = simpleRegression29.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double47 = simpleRegression46.getMeanSquareError();
        double double48 = simpleRegression46.getSumSquaredErrors();
        double double49 = simpleRegression46.getMeanSquareError();
        double double51 = simpleRegression46.predict((double) 10);
        simpleRegression46.clear();
        double[] doubleArray58 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray64 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray65 = new double[][] { doubleArray58, doubleArray64 };
        simpleRegression46.addData(doubleArray65);
        simpleRegression29.addData(doubleArray65);
        simpleRegression19.addData(doubleArray65);
        simpleRegression0.addData(doubleArray65);
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
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getR();
        long long7 = simpleRegression0.getN();
        double double9 = simpleRegression0.predict(1.0d);
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.predict((double) (byte) 10);
        simpleRegression0.clear();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getIntercept();
        long long12 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        double double6 = simpleRegression0.getTotalSumSquares();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double6 = simpleRegression0.predict((double) 0L);
        double double7 = simpleRegression0.getIntercept();
        double double8 = simpleRegression0.getInterceptStdErr();
        double double9 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass10 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        double double17 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double14 = simpleRegression0.getSumSquaredErrors();
        long long15 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        long long74 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 9L + "'", long74 == 9L);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(100.0d, (double) (byte) 10);
        double double7 = simpleRegression0.getIntercept();
        double double8 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.predict(10.0d);
        double double11 = simpleRegression0.getRSquare();
        double double12 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        long long83 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        double double46 = simpleRegression0.getSlopeConfidenceInterval();
        double double47 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((-1.0101010101010104d), (-99.0d));
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
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        double double9 = simpleRegression0.getInterceptStdErr();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getSlope();
        double double13 = simpleRegression0.predict(497004.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        double double21 = simpleRegression0.getInterceptStdErr();
        long long22 = simpleRegression0.getN();
        simpleRegression0.addData(6.185682326621923d, (double) 0L);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getInterceptStdErr();
        double double3 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double9 = simpleRegression0.predict((-989.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData((double) 2L, 0.0d);
        double double13 = simpleRegression0.getIntercept();
        double double14 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval((-99.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        double double35 = simpleRegression13.getSumSquaredErrors();
        double double36 = simpleRegression13.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression37 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double38 = simpleRegression37.getMeanSquareError();
        double double39 = simpleRegression37.getSumSquaredErrors();
        double double40 = simpleRegression37.getMeanSquareError();
        double double41 = simpleRegression37.getInterceptStdErr();
        double double42 = simpleRegression37.getRegressionSumSquares();
        simpleRegression37.clear();
        double double44 = simpleRegression37.getInterceptStdErr();
        simpleRegression37.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double47 = simpleRegression46.getMeanSquareError();
        double double48 = simpleRegression46.getSumSquaredErrors();
        double double50 = simpleRegression46.predict((double) (short) -1);
        double double51 = simpleRegression46.getIntercept();
        double double52 = simpleRegression46.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression53 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression54 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double55 = simpleRegression54.getMeanSquareError();
        double[] doubleArray58 = new double[] { 100.0f, 100L };
        double[] doubleArray61 = new double[] { 100.0f, 100L };
        double[] doubleArray64 = new double[] { 100.0f, 100L };
        double[][] doubleArray65 = new double[][] { doubleArray58, doubleArray61, doubleArray64 };
        simpleRegression54.addData(doubleArray65);
        simpleRegression53.addData(doubleArray65);
        simpleRegression46.addData(doubleArray65);
        simpleRegression37.addData(doubleArray65);
        simpleRegression13.addData(doubleArray65);
        simpleRegression0.addData(doubleArray65);
        double double72 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass73 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
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
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        double double13 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval(0.7957957196470231d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        double double17 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (-1), 93.16554809843402d);
        double double21 = simpleRegression0.getInterceptStdErr();
        double double22 = simpleRegression0.getTotalSumSquares();
        double double23 = simpleRegression0.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression24 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double25 = simpleRegression24.getMeanSquareError();
        double double26 = simpleRegression24.getSumSquaredErrors();
        double double27 = simpleRegression24.getInterceptStdErr();
        double double28 = simpleRegression24.getSumSquaredErrors();
        double double29 = simpleRegression24.getSumSquaredErrors();
        long long30 = simpleRegression24.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression31 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double32 = simpleRegression31.getIntercept();
        double double33 = simpleRegression31.getMeanSquareError();
        simpleRegression31.clear();
        double double35 = simpleRegression31.getTotalSumSquares();
        double double36 = simpleRegression31.getSumSquaredErrors();
        simpleRegression31.addData((double) (byte) 0, Double.NaN);
        long long40 = simpleRegression31.getN();
        simpleRegression31.addData((double) (byte) 1, (-1.0d));
        long long44 = simpleRegression31.getN();
        double double45 = simpleRegression31.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double47 = simpleRegression46.getMeanSquareError();
        double double48 = simpleRegression46.getSumSquaredErrors();
        double double49 = simpleRegression46.getSlopeStdErr();
        double double50 = simpleRegression46.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression51 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double52 = simpleRegression51.getMeanSquareError();
        double double53 = simpleRegression51.getSumSquaredErrors();
        double double55 = simpleRegression51.predict((double) (short) -1);
        double double56 = simpleRegression51.getIntercept();
        double double57 = simpleRegression51.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression58 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression59 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double60 = simpleRegression59.getMeanSquareError();
        double[] doubleArray63 = new double[] { 100.0f, 100L };
        double[] doubleArray66 = new double[] { 100.0f, 100L };
        double[] doubleArray69 = new double[] { 100.0f, 100L };
        double[][] doubleArray70 = new double[][] { doubleArray63, doubleArray66, doubleArray69 };
        simpleRegression59.addData(doubleArray70);
        simpleRegression58.addData(doubleArray70);
        simpleRegression51.addData(doubleArray70);
        simpleRegression46.addData(doubleArray70);
        simpleRegression31.addData(doubleArray70);
        simpleRegression24.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.03229959611417d + "'", double22 == 35.03229959611417d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 2L + "'", long44 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        double double6 = simpleRegression0.getTotalSumSquares();
        double double7 = simpleRegression0.getTotalSumSquares();
        double double8 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        double double22 = simpleRegression0.getMeanSquareError();
        double double23 = simpleRegression0.getSumSquaredErrors();
        double double24 = simpleRegression0.getMeanSquareError();
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
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        double double33 = simpleRegression0.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double35 = simpleRegression34.getMeanSquareError();
        double double36 = simpleRegression34.getSumSquaredErrors();
        double double38 = simpleRegression34.predict((double) (short) -1);
        double double39 = simpleRegression34.getIntercept();
        double double41 = simpleRegression34.predict(0.0d);
        long long42 = simpleRegression34.getN();
        long long43 = simpleRegression34.getN();
        double double44 = simpleRegression34.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression45 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double46 = simpleRegression45.getMeanSquareError();
        double double47 = simpleRegression45.getSumSquaredErrors();
        double double49 = simpleRegression45.predict((double) (short) -1);
        long long50 = simpleRegression45.getN();
        double double51 = simpleRegression45.getIntercept();
        simpleRegression45.clear();
        long long53 = simpleRegression45.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression54 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression55 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double56 = simpleRegression55.getMeanSquareError();
        double[] doubleArray59 = new double[] { 100.0f, 100L };
        double[] doubleArray62 = new double[] { 100.0f, 100L };
        double[] doubleArray65 = new double[] { 100.0f, 100L };
        double[][] doubleArray66 = new double[][] { doubleArray59, doubleArray62, doubleArray65 };
        simpleRegression55.addData(doubleArray66);
        simpleRegression54.addData(doubleArray66);
        simpleRegression45.addData(doubleArray66);
        simpleRegression34.addData(doubleArray66);
        simpleRegression0.addData(doubleArray66);
        double double72 = simpleRegression0.getSignificance();
        double double73 = simpleRegression0.getSlopeStdErr();
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((double) 0L, (double) 10.0f);
        simpleRegression0.clear();
        double double6 = simpleRegression0.predict((double) (byte) 0);
        double double7 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSlope();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.predict(3.552713678800501E-15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double16 = simpleRegression15.getMeanSquareError();
        double[] doubleArray19 = new double[] { 100.0f, 100L };
        double[] doubleArray22 = new double[] { 100.0f, 100L };
        double[] doubleArray25 = new double[] { 100.0f, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray19, doubleArray22, doubleArray25 };
        simpleRegression15.addData(doubleArray26);
        simpleRegression14.addData(doubleArray26);
        double double29 = simpleRegression14.getSignificance();
        double[][] doubleArray30 = new double[][] {};
        simpleRegression14.addData(doubleArray30);
        simpleRegression0.addData(doubleArray30);
        long long33 = simpleRegression0.getN();
        double double34 = simpleRegression0.getSumSquaredErrors();
        double double35 = simpleRegression0.getSignificance();
        double double36 = simpleRegression0.getRegressionSumSquares();
        double double37 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double39 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData((-12.222222222222221d), 55.98564498564499d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[][] {});
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 3L + "'", long33 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.predict((double) 10.0f);
        double double5 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double double10 = simpleRegression8.getSumSquaredErrors();
        double double11 = simpleRegression8.getInterceptStdErr();
        double double13 = simpleRegression8.predict((double) 10.0f);
        double double14 = simpleRegression8.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double16 = simpleRegression15.getMeanSquareError();
        double double17 = simpleRegression15.getSumSquaredErrors();
        double double19 = simpleRegression15.predict((double) (short) -1);
        double double20 = simpleRegression15.getIntercept();
        double double22 = simpleRegression15.predict(0.0d);
        long long23 = simpleRegression15.getN();
        long long24 = simpleRegression15.getN();
        double double25 = simpleRegression15.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        long long31 = simpleRegression26.getN();
        double double32 = simpleRegression26.getIntercept();
        simpleRegression26.clear();
        long long34 = simpleRegression26.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression35 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double37 = simpleRegression36.getMeanSquareError();
        double[] doubleArray40 = new double[] { 100.0f, 100L };
        double[] doubleArray43 = new double[] { 100.0f, 100L };
        double[] doubleArray46 = new double[] { 100.0f, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray40, doubleArray43, doubleArray46 };
        simpleRegression36.addData(doubleArray47);
        simpleRegression35.addData(doubleArray47);
        simpleRegression26.addData(doubleArray47);
        simpleRegression15.addData(doubleArray47);
        simpleRegression8.addData(doubleArray47);
        simpleRegression0.addData(doubleArray47);
        simpleRegression0.addData(55.98564498564499d, 1851.4285714285716d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        simpleRegression0.addData(doubleArray36);
        simpleRegression0.addData(0.010000000000000009d, (-1.4010282776350316d));
        double double42 = simpleRegression0.getRSquare();
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.946429539719462d + "'", double42 == 0.946429539719462d);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        double double72 = simpleRegression0.getR();
        double double74 = simpleRegression0.predict((double) (-1.0f));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression75 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression76 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double77 = simpleRegression76.getMeanSquareError();
        double[] doubleArray80 = new double[] { 100.0f, 100L };
        double[] doubleArray83 = new double[] { 100.0f, 100L };
        double[] doubleArray86 = new double[] { 100.0f, 100L };
        double[][] doubleArray87 = new double[][] { doubleArray80, doubleArray83, doubleArray86 };
        simpleRegression76.addData(doubleArray87);
        simpleRegression75.addData(doubleArray87);
        simpleRegression0.addData(doubleArray87);
        java.lang.Class<?> wildcardClass91 = doubleArray87.getClass();
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
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.010000000000000009d + "'", double74 == 0.010000000000000009d);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getRSquare();
        simpleRegression0.addData(55.98564498564499d, 2.7181208053691277d);
        double double12 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        long long78 = simpleRegression0.getN();
        double double79 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 8L + "'", long78 == 8L);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.9654384461585247d + "'", double79 == 0.9654384461585247d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getSlope();
        long long13 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double15 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double17 = simpleRegression16.getMeanSquareError();
        double double18 = simpleRegression16.getSumSquaredErrors();
        double double20 = simpleRegression16.predict((double) (short) -1);
        double double21 = simpleRegression16.getRegressionSumSquares();
        double double22 = simpleRegression16.getSlopeStdErr();
        double double24 = simpleRegression16.predict((double) (byte) 0);
        simpleRegression16.clear();
        double double27 = simpleRegression16.predict((double) 10);
        double double28 = simpleRegression16.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double30 = simpleRegression29.getIntercept();
        double double31 = simpleRegression29.getMeanSquareError();
        simpleRegression29.clear();
        double double33 = simpleRegression29.getSumSquaredErrors();
        simpleRegression29.addData((double) (byte) 0, (double) 1.0f);
        double double37 = simpleRegression29.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression38 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double39 = simpleRegression38.getMeanSquareError();
        double double40 = simpleRegression38.getSumSquaredErrors();
        double double42 = simpleRegression38.predict((double) (short) -1);
        double double43 = simpleRegression38.getIntercept();
        double double44 = simpleRegression38.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression45 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double47 = simpleRegression46.getMeanSquareError();
        double[] doubleArray50 = new double[] { 100.0f, 100L };
        double[] doubleArray53 = new double[] { 100.0f, 100L };
        double[] doubleArray56 = new double[] { 100.0f, 100L };
        double[][] doubleArray57 = new double[][] { doubleArray50, doubleArray53, doubleArray56 };
        simpleRegression46.addData(doubleArray57);
        simpleRegression45.addData(doubleArray57);
        simpleRegression38.addData(doubleArray57);
        simpleRegression29.addData(doubleArray57);
        simpleRegression16.addData(doubleArray57);
        simpleRegression0.addData(doubleArray57);
        double double64 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double6 = simpleRegression0.getR();
        double double7 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getInterceptStdErr();
        double double10 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRSquare();
        simpleRegression0.addData(0.9980093716520023d, (-99.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        // The following exception was thrown during execution in test generation
        try {
            double double78 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.4010282776350316d) + "'", double76 == (-1.4010282776350316d));
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        double double46 = simpleRegression0.getSlopeConfidenceInterval();
        double double47 = simpleRegression0.getSlope();
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
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getSlope();
        double double13 = simpleRegression0.getInterceptStdErr();
        double double14 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double16 = simpleRegression15.getMeanSquareError();
        double[] doubleArray19 = new double[] { 100.0f, 100L };
        double[] doubleArray22 = new double[] { 100.0f, 100L };
        double[] doubleArray25 = new double[] { 100.0f, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray19, doubleArray22, doubleArray25 };
        simpleRegression15.addData(doubleArray26);
        simpleRegression14.addData(doubleArray26);
        double double29 = simpleRegression14.getSignificance();
        double[][] doubleArray30 = new double[][] {};
        simpleRegression14.addData(doubleArray30);
        simpleRegression0.addData(doubleArray30);
        double double33 = simpleRegression0.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double35 = simpleRegression34.getIntercept();
        double double36 = simpleRegression34.getMeanSquareError();
        long long37 = simpleRegression34.getN();
        double double38 = simpleRegression34.getSumSquaredErrors();
        double double39 = simpleRegression34.getR();
        double[] doubleArray46 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray53 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray54 = new double[][] { doubleArray46, doubleArray53 };
        simpleRegression34.addData(doubleArray54);
        double double56 = simpleRegression34.getSumSquaredErrors();
        double double57 = simpleRegression34.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression58 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double59 = simpleRegression58.getIntercept();
        double double60 = simpleRegression58.getMeanSquareError();
        simpleRegression58.clear();
        double double62 = simpleRegression58.getSumSquaredErrors();
        simpleRegression58.addData((double) (byte) 0, (double) 1.0f);
        double double66 = simpleRegression58.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression67 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double68 = simpleRegression67.getMeanSquareError();
        double double69 = simpleRegression67.getSumSquaredErrors();
        double double71 = simpleRegression67.predict((double) (short) -1);
        double double72 = simpleRegression67.getIntercept();
        double double73 = simpleRegression67.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression74 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression75 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double76 = simpleRegression75.getMeanSquareError();
        double[] doubleArray79 = new double[] { 100.0f, 100L };
        double[] doubleArray82 = new double[] { 100.0f, 100L };
        double[] doubleArray85 = new double[] { 100.0f, 100L };
        double[][] doubleArray86 = new double[][] { doubleArray79, doubleArray82, doubleArray85 };
        simpleRegression75.addData(doubleArray86);
        simpleRegression74.addData(doubleArray86);
        simpleRegression67.addData(doubleArray86);
        simpleRegression58.addData(doubleArray86);
        simpleRegression34.addData(doubleArray86);
        simpleRegression0.addData(doubleArray86);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[][] {});
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray86);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getR();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getTotalSumSquares();
        double double8 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        double double15 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getSlopeStdErr();
        double double16 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression17.addData((double) 0L, (double) 10.0f);
        simpleRegression17.clear();
        double double23 = simpleRegression17.predict((double) (byte) 0);
        long long24 = simpleRegression17.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double26 = simpleRegression25.getIntercept();
        double double27 = simpleRegression25.getMeanSquareError();
        long long28 = simpleRegression25.getN();
        double double29 = simpleRegression25.getSumSquaredErrors();
        double double31 = simpleRegression25.predict((-1.4010282776350316d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression32 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double33 = simpleRegression32.getMeanSquareError();
        double double34 = simpleRegression32.getSumSquaredErrors();
        double double35 = simpleRegression32.getMeanSquareError();
        double double36 = simpleRegression32.getInterceptStdErr();
        double double37 = simpleRegression32.getRegressionSumSquares();
        simpleRegression32.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression39 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double40 = simpleRegression39.getMeanSquareError();
        double double41 = simpleRegression39.getSumSquaredErrors();
        double double43 = simpleRegression39.predict((double) (short) -1);
        double double44 = simpleRegression39.getIntercept();
        double double45 = simpleRegression39.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression47 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double48 = simpleRegression47.getMeanSquareError();
        double[] doubleArray51 = new double[] { 100.0f, 100L };
        double[] doubleArray54 = new double[] { 100.0f, 100L };
        double[] doubleArray57 = new double[] { 100.0f, 100L };
        double[][] doubleArray58 = new double[][] { doubleArray51, doubleArray54, doubleArray57 };
        simpleRegression47.addData(doubleArray58);
        simpleRegression46.addData(doubleArray58);
        simpleRegression39.addData(doubleArray58);
        simpleRegression32.addData(doubleArray58);
        simpleRegression25.addData(doubleArray58);
        simpleRegression17.addData(doubleArray58);
        simpleRegression0.addData(doubleArray58);
        double double66 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double68 = simpleRegression0.getSlopeConfidenceInterval(8694.444444444443d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double16 = simpleRegression15.getMeanSquareError();
        double[] doubleArray19 = new double[] { 100.0f, 100L };
        double[] doubleArray22 = new double[] { 100.0f, 100L };
        double[] doubleArray25 = new double[] { 100.0f, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray19, doubleArray22, doubleArray25 };
        simpleRegression15.addData(doubleArray26);
        simpleRegression14.addData(doubleArray26);
        double double29 = simpleRegression14.getSignificance();
        double[][] doubleArray30 = new double[][] {};
        simpleRegression14.addData(doubleArray30);
        simpleRegression0.addData(doubleArray30);
        double double33 = simpleRegression0.getInterceptStdErr();
        double double34 = simpleRegression0.getSlopeStdErr();
        double double35 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[][] {});
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        long long19 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getR();
        simpleRegression0.clear();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        double double9 = simpleRegression0.getSlopeStdErr();
        java.lang.Class<?> wildcardClass10 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        double double16 = simpleRegression0.getSignificance();
        double double17 = simpleRegression0.getR();
        double double18 = simpleRegression0.getTotalSumSquares();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double15 = simpleRegression0.predict((double) (byte) -1);
        double double16 = simpleRegression0.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double18 = simpleRegression17.getMeanSquareError();
        simpleRegression17.clear();
        double double20 = simpleRegression17.getRSquare();
        long long21 = simpleRegression17.getN();
        double double22 = simpleRegression17.getMeanSquareError();
        double double24 = simpleRegression17.predict((double) (short) 100);
        double double25 = simpleRegression17.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        simpleRegression26.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression30 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double31 = simpleRegression30.getMeanSquareError();
        double[] doubleArray34 = new double[] { 100.0f, 100L };
        double[] doubleArray37 = new double[] { 100.0f, 100L };
        double[] doubleArray40 = new double[] { 100.0f, 100L };
        double[][] doubleArray41 = new double[][] { doubleArray34, doubleArray37, doubleArray40 };
        simpleRegression30.addData(doubleArray41);
        simpleRegression29.addData(doubleArray41);
        simpleRegression26.addData(doubleArray41);
        simpleRegression17.addData(doubleArray41);
        simpleRegression0.addData(doubleArray41);
        double double47 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSlope();
        double double15 = simpleRegression0.getSlope();
        double double17 = simpleRegression0.predict(0.99d);
        double double18 = simpleRegression0.getIntercept();
        double double19 = simpleRegression0.getSumSquaredErrors();
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
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        simpleRegression0.clear();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData(4.721238667553156E-7d, (double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        double double25 = simpleRegression0.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        double double31 = simpleRegression26.getRegressionSumSquares();
        double double32 = simpleRegression26.getSumSquaredErrors();
        long long33 = simpleRegression26.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double35 = simpleRegression34.getMeanSquareError();
        double double36 = simpleRegression34.getSumSquaredErrors();
        double double37 = simpleRegression34.getMeanSquareError();
        double double38 = simpleRegression34.getInterceptStdErr();
        double double39 = simpleRegression34.getRegressionSumSquares();
        simpleRegression34.clear();
        double double41 = simpleRegression34.getInterceptStdErr();
        simpleRegression34.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression43 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double44 = simpleRegression43.getMeanSquareError();
        double double45 = simpleRegression43.getSumSquaredErrors();
        double double47 = simpleRegression43.predict((double) (short) -1);
        double double48 = simpleRegression43.getIntercept();
        double double49 = simpleRegression43.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression50 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression51 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double52 = simpleRegression51.getMeanSquareError();
        double[] doubleArray55 = new double[] { 100.0f, 100L };
        double[] doubleArray58 = new double[] { 100.0f, 100L };
        double[] doubleArray61 = new double[] { 100.0f, 100L };
        double[][] doubleArray62 = new double[][] { doubleArray55, doubleArray58, doubleArray61 };
        simpleRegression51.addData(doubleArray62);
        simpleRegression50.addData(doubleArray62);
        simpleRegression43.addData(doubleArray62);
        simpleRegression34.addData(doubleArray62);
        simpleRegression26.addData(doubleArray62);
        simpleRegression0.addData(doubleArray62);
        double double69 = simpleRegression0.getInterceptStdErr();
        double double70 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.99d + "'", double25 == 0.99d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        long long24 = simpleRegression0.getN();
        double[][] doubleArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleRegression0.addData(doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict((double) (byte) -1);
        double double6 = simpleRegression0.getRSquare();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getSumSquaredErrors();
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData((double) 2L, 0.0d);
        simpleRegression0.clear();
        double double14 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSlopeStdErr();
        double double15 = simpleRegression0.getInterceptStdErr();
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
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        double double17 = simpleRegression0.predict((double) (short) -1);
        double double18 = simpleRegression0.getRegressionSumSquares();
        double double20 = simpleRegression0.predict(99.10891089108911d);
        double double21 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        simpleRegression0.addData((double) 0L, Double.NaN);
        double double38 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue(Double.isNaN(double38));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        double double17 = simpleRegression0.predict((double) (short) -1);
        double double18 = simpleRegression0.getSlopeStdErr();
        double double19 = simpleRegression0.getRSquare();
        long long20 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        double double16 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.4643473350751623d, (double) 1);
        double double20 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7350.750000000001d + "'", double20 == 7350.750000000001d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getMeanSquareError();
        double double14 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double16 = simpleRegression15.getIntercept();
        double double17 = simpleRegression15.getMeanSquareError();
        simpleRegression15.clear();
        simpleRegression15.clear();
        double double20 = simpleRegression15.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression21 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double22 = simpleRegression21.getMeanSquareError();
        double double23 = simpleRegression21.getSumSquaredErrors();
        double double25 = simpleRegression21.predict((double) (short) -1);
        double double26 = simpleRegression21.getIntercept();
        double double27 = simpleRegression21.getSlope();
        double double28 = simpleRegression21.getMeanSquareError();
        simpleRegression21.addData((double) 10L, (double) 3L);
        long long32 = simpleRegression21.getN();
        double double33 = simpleRegression21.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double35 = simpleRegression34.getIntercept();
        double double36 = simpleRegression34.getMeanSquareError();
        simpleRegression34.clear();
        double double38 = simpleRegression34.getSumSquaredErrors();
        simpleRegression34.addData((double) (byte) 0, (double) 1.0f);
        double double42 = simpleRegression34.getRSquare();
        double double43 = simpleRegression34.getRSquare();
        double double44 = simpleRegression34.getTotalSumSquares();
        double double45 = simpleRegression34.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double47 = simpleRegression46.getIntercept();
        double double48 = simpleRegression46.getMeanSquareError();
        long long49 = simpleRegression46.getN();
        double double50 = simpleRegression46.getSumSquaredErrors();
        double double51 = simpleRegression46.getR();
        double[] doubleArray58 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray65 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray66 = new double[][] { doubleArray58, doubleArray65 };
        simpleRegression46.addData(doubleArray66);
        simpleRegression34.addData(doubleArray66);
        simpleRegression21.addData(doubleArray66);
        simpleRegression15.addData(doubleArray66);
        simpleRegression0.addData(doubleArray66);
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
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
        // The following exception was thrown during execution in test generation
        try {
            double double60 = simpleRegression0.getSlopeConfidenceInterval((double) 100.0f);
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
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        java.lang.Class<?> wildcardClass33 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getSumSquaredErrors();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getMeanSquareError();
        double double16 = simpleRegression0.getSlopeConfidenceInterval();
        double double17 = simpleRegression0.getR();
        double double18 = simpleRegression0.getSlopeStdErr();
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
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        long long6 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double8 = simpleRegression7.getMeanSquareError();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) (short) -1);
        double double12 = simpleRegression7.getMeanSquareError();
        double double13 = simpleRegression7.getSlopeStdErr();
        double double15 = simpleRegression7.predict((double) (byte) 1);
        double[] doubleArray22 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray29 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray36 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray43 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray50 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray51 = new double[][] { doubleArray22, doubleArray29, doubleArray36, doubleArray43, doubleArray50 };
        simpleRegression7.addData(doubleArray51);
        simpleRegression0.addData(doubleArray51);
        double double54 = simpleRegression0.getR();
        simpleRegression0.addData(7.723752285129835E-8d, 0.946429539719462d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        double double44 = simpleRegression0.getSlopeStdErr();
        double double45 = simpleRegression0.getIntercept();
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
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSlope();
        double double11 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval(7.723752285129835E-8d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getTotalSumSquares();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getMeanSquareError();
        double double17 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
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
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        double double16 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(515.3034511711904d, 100.0d);
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
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) (byte) 10, (double) (short) 1);
        double double6 = simpleRegression0.getR();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        double double42 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        double double44 = simpleRegression0.getTotalSumSquares();
        double double45 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        simpleRegression0.clear();
        simpleRegression0.addData(2.7181208053691277d, 60.5d);
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
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        long long5 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getInterceptStdErr();
        double double9 = simpleRegression6.getRSquare();
        double double11 = simpleRegression6.predict(100.0d);
        double double12 = simpleRegression6.getSlope();
        double double13 = simpleRegression6.getInterceptStdErr();
        double double14 = simpleRegression6.getMeanSquareError();
        long long15 = simpleRegression6.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double17 = simpleRegression16.getMeanSquareError();
        double double18 = simpleRegression16.getSumSquaredErrors();
        double double20 = simpleRegression16.predict((double) (short) -1);
        double double21 = simpleRegression16.getIntercept();
        long long22 = simpleRegression16.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression23 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double24 = simpleRegression23.getMeanSquareError();
        double double25 = simpleRegression23.getSumSquaredErrors();
        double double27 = simpleRegression23.predict((double) (short) -1);
        double double28 = simpleRegression23.getMeanSquareError();
        double double29 = simpleRegression23.getSlopeStdErr();
        double double31 = simpleRegression23.predict((double) (byte) 1);
        double[] doubleArray38 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray45 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray52 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray59 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray66 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray67 = new double[][] { doubleArray38, doubleArray45, doubleArray52, doubleArray59, doubleArray66 };
        simpleRegression23.addData(doubleArray67);
        simpleRegression16.addData(doubleArray67);
        simpleRegression6.addData(doubleArray67);
        simpleRegression0.addData(doubleArray67);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        double double46 = simpleRegression0.getSumSquaredErrors();
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
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        double double88 = simpleRegression0.getSlopeStdErr();
        double double90 = simpleRegression0.predict(0.0d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double90));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(1.1274394311116123d, (double) 8L);
        long long13 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double15 = simpleRegression0.predict(0.0d);
        double double16 = simpleRegression0.getSlopeStdErr();
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
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData((double) (byte) 1, 0.026087457669492504d);
        java.lang.Class<?> wildcardClass14 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        double double18 = simpleRegression0.getInterceptStdErr();
        double double19 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double4 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        long long17 = simpleRegression0.getN();
        simpleRegression0.clear();
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.predict(1926.8750000000073d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        double double31 = simpleRegression0.getInterceptStdErr();
        double double32 = simpleRegression0.getRSquare();
        double double33 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getRSquare();
        long long7 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getTotalSumSquares();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getR();
        double double18 = simpleRegression0.predict((-99.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        simpleRegression0.addData((double) 'a', (double) 10L);
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double14 = simpleRegression13.getIntercept();
        double double15 = simpleRegression13.getMeanSquareError();
        simpleRegression13.clear();
        double double18 = simpleRegression13.predict((double) (byte) 10);
        double double19 = simpleRegression13.getRSquare();
        double double20 = simpleRegression13.getMeanSquareError();
        double double21 = simpleRegression13.getRSquare();
        double double22 = simpleRegression13.getTotalSumSquares();
        double double23 = simpleRegression13.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression24 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double26 = simpleRegression25.getMeanSquareError();
        double[] doubleArray29 = new double[] { 100.0f, 100L };
        double[] doubleArray32 = new double[] { 100.0f, 100L };
        double[] doubleArray35 = new double[] { 100.0f, 100L };
        double[][] doubleArray36 = new double[][] { doubleArray29, doubleArray32, doubleArray35 };
        simpleRegression25.addData(doubleArray36);
        simpleRegression24.addData(doubleArray36);
        double double39 = simpleRegression24.getSumSquaredErrors();
        double double40 = simpleRegression24.getIntercept();
        double double41 = simpleRegression24.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression42 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double43 = simpleRegression42.getMeanSquareError();
        double double44 = simpleRegression42.getSlopeStdErr();
        double double45 = simpleRegression42.getSumSquaredErrors();
        double double46 = simpleRegression42.getSumSquaredErrors();
        double double47 = simpleRegression42.getTotalSumSquares();
        double double48 = simpleRegression42.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression49 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double50 = simpleRegression49.getMeanSquareError();
        double double51 = simpleRegression49.getSumSquaredErrors();
        double double53 = simpleRegression49.predict((double) (short) -1);
        double double54 = simpleRegression49.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression55 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double56 = simpleRegression55.getIntercept();
        double double57 = simpleRegression55.getMeanSquareError();
        long long58 = simpleRegression55.getN();
        double double59 = simpleRegression55.getSumSquaredErrors();
        double double60 = simpleRegression55.getR();
        double[] doubleArray67 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray74 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray75 = new double[][] { doubleArray67, doubleArray74 };
        simpleRegression55.addData(doubleArray75);
        simpleRegression49.addData(doubleArray75);
        simpleRegression42.addData(doubleArray75);
        simpleRegression24.addData(doubleArray75);
        simpleRegression13.addData(doubleArray75);
        simpleRegression0.addData(doubleArray75);
        double double82 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.5d + "'", double12 == 40.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 5.810176128929871d + "'", double82 == 5.810176128929871d);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getIntercept();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double8 = simpleRegression7.getMeanSquareError();
        simpleRegression7.clear();
        double double10 = simpleRegression7.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getIntercept();
        double double13 = simpleRegression11.getMeanSquareError();
        long long14 = simpleRegression11.getN();
        double double15 = simpleRegression11.getSumSquaredErrors();
        double double17 = simpleRegression11.predict((-1.4010282776350316d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double19 = simpleRegression18.getMeanSquareError();
        double double20 = simpleRegression18.getSumSquaredErrors();
        double double21 = simpleRegression18.getMeanSquareError();
        double double22 = simpleRegression18.getInterceptStdErr();
        double double23 = simpleRegression18.getRegressionSumSquares();
        simpleRegression18.clear();
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
        simpleRegression18.addData(doubleArray44);
        simpleRegression11.addData(doubleArray44);
        simpleRegression7.addData(doubleArray44);
        simpleRegression0.addData(doubleArray44);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
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
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        long long9 = simpleRegression0.getN();
        simpleRegression0.addData((double) (byte) 1, (-1.0d));
        double double13 = simpleRegression0.getRSquare();
        double double14 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass15 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getInterceptStdErr();
        double double13 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getIntercept();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(0.8617651986444268d, 40.9370377213051d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) 3L, 10756.8d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(100.0d, (double) (byte) 10);
        simpleRegression0.addData((-1.0d), (double) 100.0f);
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99.10891089108911d + "'", double10 == 99.10891089108911d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4050.0d + "'", double11 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(100.0d, (double) (byte) 10);
        simpleRegression0.addData((double) (short) 0, (double) (-1.0f));
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 60.5d + "'", double11 == 60.5d);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        long long41 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass42 = simpleRegression0.getClass();
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
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 3L + "'", long41 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getTotalSumSquares();
        double double8 = simpleRegression0.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double10 = simpleRegression9.getMeanSquareError();
        double double11 = simpleRegression9.getSumSquaredErrors();
        double double13 = simpleRegression9.predict((double) (short) -1);
        double double14 = simpleRegression9.getMeanSquareError();
        double double15 = simpleRegression9.getSlopeStdErr();
        double double16 = simpleRegression9.getInterceptStdErr();
        double double17 = simpleRegression9.getTotalSumSquares();
        double double18 = simpleRegression9.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression19 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double20 = simpleRegression19.getMeanSquareError();
        double double21 = simpleRegression19.getSlopeStdErr();
        double double22 = simpleRegression19.getSumSquaredErrors();
        double double23 = simpleRegression19.getRSquare();
        double double24 = simpleRegression19.getRSquare();
        double double25 = simpleRegression19.getSumSquaredErrors();
        double double27 = simpleRegression19.predict((double) 100);
        double double28 = simpleRegression19.getIntercept();
        double double29 = simpleRegression19.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression30 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double31 = simpleRegression30.getIntercept();
        double double32 = simpleRegression30.getMeanSquareError();
        simpleRegression30.clear();
        double double34 = simpleRegression30.getTotalSumSquares();
        double double35 = simpleRegression30.getSumSquaredErrors();
        simpleRegression30.addData((double) (byte) 0, Double.NaN);
        simpleRegression30.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression40 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double41 = simpleRegression40.getMeanSquareError();
        double[] doubleArray44 = new double[] { 100.0f, 100L };
        double[] doubleArray47 = new double[] { 100.0f, 100L };
        double[] doubleArray50 = new double[] { 100.0f, 100L };
        double[][] doubleArray51 = new double[][] { doubleArray44, doubleArray47, doubleArray50 };
        simpleRegression40.addData(doubleArray51);
        double double53 = simpleRegression40.getSlopeConfidenceInterval();
        double double54 = simpleRegression40.getSumSquaredErrors();
        double double55 = simpleRegression40.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression56 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double57 = simpleRegression56.getMeanSquareError();
        double double58 = simpleRegression56.getSumSquaredErrors();
        double double59 = simpleRegression56.getMeanSquareError();
        double double60 = simpleRegression56.getInterceptStdErr();
        double double61 = simpleRegression56.getRegressionSumSquares();
        simpleRegression56.clear();
        double double63 = simpleRegression56.getInterceptStdErr();
        simpleRegression56.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression65 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double66 = simpleRegression65.getMeanSquareError();
        double double67 = simpleRegression65.getSumSquaredErrors();
        double double69 = simpleRegression65.predict((double) (short) -1);
        double double70 = simpleRegression65.getIntercept();
        double double71 = simpleRegression65.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression72 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression73 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double74 = simpleRegression73.getMeanSquareError();
        double[] doubleArray77 = new double[] { 100.0f, 100L };
        double[] doubleArray80 = new double[] { 100.0f, 100L };
        double[] doubleArray83 = new double[] { 100.0f, 100L };
        double[][] doubleArray84 = new double[][] { doubleArray77, doubleArray80, doubleArray83 };
        simpleRegression73.addData(doubleArray84);
        simpleRegression72.addData(doubleArray84);
        simpleRegression65.addData(doubleArray84);
        simpleRegression56.addData(doubleArray84);
        simpleRegression40.addData(doubleArray84);
        simpleRegression30.addData(doubleArray84);
        simpleRegression19.addData(doubleArray84);
        simpleRegression9.addData(doubleArray84);
        simpleRegression0.addData(doubleArray84);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray84);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        double double16 = simpleRegression0.getRSquare();
        double double17 = simpleRegression0.getSlopeStdErr();
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
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double6 = simpleRegression0.predict((-1.4010282776350316d));
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.predict(7.123825503355704d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double16 = simpleRegression15.getIntercept();
        double double17 = simpleRegression15.getMeanSquareError();
        simpleRegression15.clear();
        double double20 = simpleRegression15.predict((double) (byte) 10);
        double double21 = simpleRegression15.getRSquare();
        double double22 = simpleRegression15.getMeanSquareError();
        double double23 = simpleRegression15.getRSquare();
        double double24 = simpleRegression15.getTotalSumSquares();
        long long25 = simpleRegression15.getN();
        double double26 = simpleRegression15.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression27 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double28 = simpleRegression27.getIntercept();
        double double29 = simpleRegression27.getMeanSquareError();
        simpleRegression27.clear();
        double double31 = simpleRegression27.getSumSquaredErrors();
        simpleRegression27.addData((double) (byte) 0, (double) 1.0f);
        double double35 = simpleRegression27.getRSquare();
        double double36 = simpleRegression27.getRSquare();
        simpleRegression27.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression38 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double39 = simpleRegression38.getMeanSquareError();
        double double40 = simpleRegression38.getSumSquaredErrors();
        double double41 = simpleRegression38.getSlopeStdErr();
        double double42 = simpleRegression38.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression43 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double44 = simpleRegression43.getMeanSquareError();
        double double45 = simpleRegression43.getSumSquaredErrors();
        double double47 = simpleRegression43.predict((double) (short) -1);
        double double48 = simpleRegression43.getIntercept();
        double double49 = simpleRegression43.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression50 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression51 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double52 = simpleRegression51.getMeanSquareError();
        double[] doubleArray55 = new double[] { 100.0f, 100L };
        double[] doubleArray58 = new double[] { 100.0f, 100L };
        double[] doubleArray61 = new double[] { 100.0f, 100L };
        double[][] doubleArray62 = new double[][] { doubleArray55, doubleArray58, doubleArray61 };
        simpleRegression51.addData(doubleArray62);
        simpleRegression50.addData(doubleArray62);
        simpleRegression43.addData(doubleArray62);
        simpleRegression38.addData(doubleArray62);
        simpleRegression27.addData(doubleArray62);
        simpleRegression15.addData(doubleArray62);
        simpleRegression0.addData(doubleArray62);
        double double70 = simpleRegression0.getR();
        double double71 = simpleRegression0.getTotalSumSquares();
        double double72 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((double) 0L, (double) 10.0f);
        simpleRegression0.clear();
        double double6 = simpleRegression0.predict((double) (byte) 0);
        double double7 = simpleRegression0.getTotalSumSquares();
        double double8 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double10 = simpleRegression0.getTotalSumSquares();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getSlope();
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
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getIntercept();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlope();
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
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getRegressionSumSquares();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getR();
        double double5 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getIntercept();
        double double12 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double16 = simpleRegression15.getMeanSquareError();
        double[] doubleArray19 = new double[] { 100.0f, 100L };
        double[] doubleArray22 = new double[] { 100.0f, 100L };
        double[] doubleArray25 = new double[] { 100.0f, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray19, doubleArray22, doubleArray25 };
        simpleRegression15.addData(doubleArray26);
        simpleRegression14.addData(doubleArray26);
        double double29 = simpleRegression14.getSignificance();
        double[][] doubleArray30 = new double[][] {};
        simpleRegression14.addData(doubleArray30);
        simpleRegression0.addData(doubleArray30);
        long long33 = simpleRegression0.getN();
        double double34 = simpleRegression0.getSumSquaredErrors();
        long long35 = simpleRegression0.getN();
        double double36 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[][] {});
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 3L + "'", long33 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 3L + "'", long35 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.predict((double) 10.0f);
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double8 = simpleRegression7.getMeanSquareError();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) (short) -1);
        double double12 = simpleRegression7.getIntercept();
        double double14 = simpleRegression7.predict(0.0d);
        long long15 = simpleRegression7.getN();
        long long16 = simpleRegression7.getN();
        double double17 = simpleRegression7.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double19 = simpleRegression18.getMeanSquareError();
        double double20 = simpleRegression18.getSumSquaredErrors();
        double double22 = simpleRegression18.predict((double) (short) -1);
        long long23 = simpleRegression18.getN();
        double double24 = simpleRegression18.getIntercept();
        simpleRegression18.clear();
        long long26 = simpleRegression18.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression27 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double29 = simpleRegression28.getMeanSquareError();
        double[] doubleArray32 = new double[] { 100.0f, 100L };
        double[] doubleArray35 = new double[] { 100.0f, 100L };
        double[] doubleArray38 = new double[] { 100.0f, 100L };
        double[][] doubleArray39 = new double[][] { doubleArray32, doubleArray35, doubleArray38 };
        simpleRegression28.addData(doubleArray39);
        simpleRegression27.addData(doubleArray39);
        simpleRegression18.addData(doubleArray39);
        simpleRegression7.addData(doubleArray39);
        simpleRegression0.addData(doubleArray39);
        double double45 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        double double25 = simpleRegression0.getTotalSumSquares();
        double double26 = simpleRegression0.getRSquare();
        double double27 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        double double18 = simpleRegression0.getRSquare();
        double double19 = simpleRegression0.getRSquare();
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        long long6 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double8 = simpleRegression7.getMeanSquareError();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) (short) -1);
        double double12 = simpleRegression7.getMeanSquareError();
        double double13 = simpleRegression7.getSlopeStdErr();
        double double15 = simpleRegression7.predict((double) (byte) 1);
        double[] doubleArray22 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray29 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray36 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray43 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray50 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray51 = new double[][] { doubleArray22, doubleArray29, doubleArray36, doubleArray43, doubleArray50 };
        simpleRegression7.addData(doubleArray51);
        simpleRegression0.addData(doubleArray51);
        double double54 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double56 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getInterceptStdErr();
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
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        long long24 = simpleRegression0.getN();
        double double25 = simpleRegression0.getR();
        double double26 = simpleRegression0.getIntercept();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        double double50 = simpleRegression0.getSlopeConfidenceInterval();
        double double51 = simpleRegression0.getSlopeConfidenceInterval();
        double double52 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getSlopeStdErr();
        double double16 = simpleRegression0.getSlope();
        double double17 = simpleRegression0.getRegressionSumSquares();
        double double18 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.getSlopeStdErr();
        double double18 = simpleRegression0.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression19 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double20 = simpleRegression19.getMeanSquareError();
        double double21 = simpleRegression19.getSlopeStdErr();
        double double22 = simpleRegression19.getSumSquaredErrors();
        double double23 = simpleRegression19.getRSquare();
        long long24 = simpleRegression19.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double26 = simpleRegression25.getIntercept();
        double double27 = simpleRegression25.getMeanSquareError();
        double double29 = simpleRegression25.predict((double) 10.0f);
        double double30 = simpleRegression25.getRSquare();
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
        simpleRegression25.addData(doubleArray50);
        simpleRegression19.addData(doubleArray50);
        simpleRegression0.addData(doubleArray50);
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
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
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        long long6 = simpleRegression0.getN();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getRSquare();
        double double13 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        double double17 = simpleRegression0.getTotalSumSquares();
        double double18 = simpleRegression0.getInterceptStdErr();
        double double20 = simpleRegression0.predict((double) 2L);
        double double21 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        double double68 = simpleRegression0.getRSquare();
        double double69 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.clear();
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
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        simpleRegression0.addData(7.669773800646322d, (double) 0L);
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict((double) (byte) -1);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double10 = simpleRegression9.getMeanSquareError();
        double[] doubleArray13 = new double[] { 100.0f, 100L };
        double[] doubleArray16 = new double[] { 100.0f, 100L };
        double[] doubleArray19 = new double[] { 100.0f, 100L };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray16, doubleArray19 };
        simpleRegression9.addData(doubleArray20);
        simpleRegression8.addData(doubleArray20);
        double double23 = simpleRegression8.getSignificance();
        double[][] doubleArray24 = new double[][] {};
        simpleRegression8.addData(doubleArray24);
        simpleRegression0.addData(doubleArray24);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[][] {});
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getR();
        double double17 = simpleRegression0.getRegressionSumSquares();
        double double18 = simpleRegression0.getR();
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
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        simpleRegression0.addData(2.0914007576402587d, 99.10891089108911d);
        double double19 = simpleRegression0.getSlopeConfidenceInterval();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = simpleRegression0.getSlopeConfidenceInterval(1921.0823693230564d);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.346750666049495E-10d + "'", double19 == 5.346750666049495E-10d);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getRegressionSumSquares();
        double double8 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.predict((double) (short) 100);
        double double8 = simpleRegression0.getIntercept();
        double double9 = simpleRegression0.getMeanSquareError();
        double double10 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        double double50 = simpleRegression0.getSlopeConfidenceInterval();
        simpleRegression0.addData((double) ' ', 4900.5d);
        double double54 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 4.0481897072402534E-5d + "'", double54 == 4.0481897072402534E-5d);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getTotalSumSquares();
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        double double18 = simpleRegression0.getTotalSumSquares();
        double double20 = simpleRegression0.getSlopeConfidenceInterval(0.19906283479973047d);
        double double21 = simpleRegression0.getSumSquaredErrors();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        double double17 = simpleRegression0.getMeanSquareError();
        double double18 = simpleRegression0.getSumSquaredErrors();
        double double19 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        double double13 = simpleRegression0.getMeanSquareError();
        double double14 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double6 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getInterceptStdErr();
        long long15 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        long long25 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2L + "'", long25 == 2L);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression5 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double6 = simpleRegression5.getMeanSquareError();
        double double7 = simpleRegression5.getSumSquaredErrors();
        double double9 = simpleRegression5.predict((double) (short) -1);
        double double10 = simpleRegression5.getIntercept();
        double double11 = simpleRegression5.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression12 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double14 = simpleRegression13.getMeanSquareError();
        double[] doubleArray17 = new double[] { 100.0f, 100L };
        double[] doubleArray20 = new double[] { 100.0f, 100L };
        double[] doubleArray23 = new double[] { 100.0f, 100L };
        double[][] doubleArray24 = new double[][] { doubleArray17, doubleArray20, doubleArray23 };
        simpleRegression13.addData(doubleArray24);
        simpleRegression12.addData(doubleArray24);
        simpleRegression5.addData(doubleArray24);
        simpleRegression0.addData(doubleArray24);
        double double29 = simpleRegression0.getSumSquaredErrors();
        double double30 = simpleRegression0.getInterceptStdErr();
        double double31 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.4807692307692307d, 6.185682326621923d);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression35 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double36 = simpleRegression35.getMeanSquareError();
        double[] doubleArray39 = new double[] { 100.0f, 100L };
        double[] doubleArray42 = new double[] { 100.0f, 100L };
        double[] doubleArray45 = new double[] { 100.0f, 100L };
        double[][] doubleArray46 = new double[][] { doubleArray39, doubleArray42, doubleArray45 };
        simpleRegression35.addData(doubleArray46);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression48 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double49 = simpleRegression48.getMeanSquareError();
        double double50 = simpleRegression48.getSumSquaredErrors();
        double double51 = simpleRegression48.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression52 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double53 = simpleRegression52.getMeanSquareError();
        double double54 = simpleRegression52.getSumSquaredErrors();
        double double55 = simpleRegression52.getMeanSquareError();
        double double57 = simpleRegression52.predict((double) 10);
        simpleRegression52.clear();
        double[] doubleArray64 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray70 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray71 = new double[][] { doubleArray64, doubleArray70 };
        simpleRegression52.addData(doubleArray71);
        simpleRegression48.addData(doubleArray71);
        simpleRegression35.addData(doubleArray71);
        simpleRegression0.addData(doubleArray71);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlope();
        double double14 = simpleRegression0.getInterceptStdErr();
        double double15 = simpleRegression0.getR();
        double double17 = simpleRegression0.predict(4900.5d);
        simpleRegression0.addData((double) 10L, 20910.817457456804d);
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
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getInterceptStdErr();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSlope();
        double double15 = simpleRegression0.getSumSquaredErrors();
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
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
        double double15 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        long long27 = simpleRegression0.getN();
        long long28 = simpleRegression0.getN();
        double double30 = simpleRegression0.predict(10.0d);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        double double13 = simpleRegression0.getSumSquaredErrors();
        long long14 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval(0.99d);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        double double25 = simpleRegression0.getIntercept();
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
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        simpleRegression0.addData((double) (-1.0f), (double) (short) -1);
        double double12 = simpleRegression0.getTotalSumSquares();
        long long13 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        simpleRegression0.addData((double) 1, 0.0d);
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double72 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double8 = simpleRegression7.getMeanSquareError();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double10 = simpleRegression7.getInterceptStdErr();
        double double12 = simpleRegression7.predict((double) 10.0f);
        double double13 = simpleRegression7.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double15 = simpleRegression14.getMeanSquareError();
        double double16 = simpleRegression14.getSumSquaredErrors();
        double double18 = simpleRegression14.predict((double) (short) -1);
        double double19 = simpleRegression14.getIntercept();
        double double21 = simpleRegression14.predict(0.0d);
        long long22 = simpleRegression14.getN();
        long long23 = simpleRegression14.getN();
        double double24 = simpleRegression14.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double26 = simpleRegression25.getMeanSquareError();
        double double27 = simpleRegression25.getSumSquaredErrors();
        double double29 = simpleRegression25.predict((double) (short) -1);
        long long30 = simpleRegression25.getN();
        double double31 = simpleRegression25.getIntercept();
        simpleRegression25.clear();
        long long33 = simpleRegression25.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression35 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double36 = simpleRegression35.getMeanSquareError();
        double[] doubleArray39 = new double[] { 100.0f, 100L };
        double[] doubleArray42 = new double[] { 100.0f, 100L };
        double[] doubleArray45 = new double[] { 100.0f, 100L };
        double[][] doubleArray46 = new double[][] { doubleArray39, doubleArray42, doubleArray45 };
        simpleRegression35.addData(doubleArray46);
        simpleRegression34.addData(doubleArray46);
        simpleRegression25.addData(doubleArray46);
        simpleRegression14.addData(doubleArray46);
        simpleRegression7.addData(doubleArray46);
        simpleRegression0.addData(doubleArray46);
        double double53 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, 7500.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.predict((double) 10.0f);
        double double6 = simpleRegression0.predict((double) 1L);
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getInterceptStdErr();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getMeanSquareError();
        long long5 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression6.addData((double) 0L, (double) 10.0f);
        simpleRegression6.clear();
        double double12 = simpleRegression6.predict((double) (byte) 0);
        long long13 = simpleRegression6.getN();
        double double14 = simpleRegression6.getInterceptStdErr();
        double double15 = simpleRegression6.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double17 = simpleRegression16.getMeanSquareError();
        double double18 = simpleRegression16.getSlopeStdErr();
        double double19 = simpleRegression16.getSumSquaredErrors();
        double double20 = simpleRegression16.getRSquare();
        long long21 = simpleRegression16.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double23 = simpleRegression22.getIntercept();
        double double24 = simpleRegression22.getMeanSquareError();
        double double26 = simpleRegression22.predict((double) 10.0f);
        double double27 = simpleRegression22.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double29 = simpleRegression28.getMeanSquareError();
        double double30 = simpleRegression28.getSumSquaredErrors();
        double double32 = simpleRegression28.predict((double) (short) -1);
        double double33 = simpleRegression28.getIntercept();
        double double34 = simpleRegression28.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression35 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double37 = simpleRegression36.getMeanSquareError();
        double[] doubleArray40 = new double[] { 100.0f, 100L };
        double[] doubleArray43 = new double[] { 100.0f, 100L };
        double[] doubleArray46 = new double[] { 100.0f, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray40, doubleArray43, doubleArray46 };
        simpleRegression36.addData(doubleArray47);
        simpleRegression35.addData(doubleArray47);
        simpleRegression28.addData(doubleArray47);
        simpleRegression22.addData(doubleArray47);
        simpleRegression16.addData(doubleArray47);
        double double54 = simpleRegression16.predict((double) (short) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression55 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double56 = simpleRegression55.getIntercept();
        double double57 = simpleRegression55.getMeanSquareError();
        simpleRegression55.clear();
        double double59 = simpleRegression55.getMeanSquareError();
        simpleRegression55.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression61 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double62 = simpleRegression61.getMeanSquareError();
        simpleRegression61.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression64 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression65 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double66 = simpleRegression65.getMeanSquareError();
        double[] doubleArray69 = new double[] { 100.0f, 100L };
        double[] doubleArray72 = new double[] { 100.0f, 100L };
        double[] doubleArray75 = new double[] { 100.0f, 100L };
        double[][] doubleArray76 = new double[][] { doubleArray69, doubleArray72, doubleArray75 };
        simpleRegression65.addData(doubleArray76);
        simpleRegression64.addData(doubleArray76);
        simpleRegression61.addData(doubleArray76);
        double double80 = simpleRegression61.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression81 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double82 = simpleRegression81.getMeanSquareError();
        double[] doubleArray85 = new double[] { 100.0f, 100L };
        double[] doubleArray88 = new double[] { 100.0f, 100L };
        double[] doubleArray91 = new double[] { 100.0f, 100L };
        double[][] doubleArray92 = new double[][] { doubleArray85, doubleArray88, doubleArray91 };
        simpleRegression81.addData(doubleArray92);
        simpleRegression61.addData(doubleArray92);
        simpleRegression55.addData(doubleArray92);
        simpleRegression16.addData(doubleArray92);
        simpleRegression6.addData(doubleArray92);
        simpleRegression0.addData(doubleArray92);
        double double99 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertTrue(Double.isNaN(double99));
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        double double15 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        double double32 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double33 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2L + "'", long31 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        double double25 = simpleRegression0.getMeanSquareError();
        double double27 = simpleRegression0.predict(0.4934704231712311d);
        double double28 = simpleRegression0.getSlope();
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
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.predict((double) 10.0f);
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
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
        simpleRegression0.addData(476.8680089485456d, 515.3034511711904d);
        double double28 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double19 = simpleRegression18.getIntercept();
        double double20 = simpleRegression18.getMeanSquareError();
        simpleRegression18.clear();
        double double23 = simpleRegression18.predict((double) (byte) 10);
        double double24 = simpleRegression18.getRSquare();
        double double25 = simpleRegression18.getIntercept();
        simpleRegression18.clear();
        double double27 = simpleRegression18.getInterceptStdErr();
        double double28 = simpleRegression18.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double30 = simpleRegression29.getIntercept();
        double double31 = simpleRegression29.getMeanSquareError();
        simpleRegression29.clear();
        double double33 = simpleRegression29.getTotalSumSquares();
        double double34 = simpleRegression29.getSumSquaredErrors();
        simpleRegression29.addData((double) (byte) 0, Double.NaN);
        simpleRegression29.clear();
        double double39 = simpleRegression29.getSumSquaredErrors();
        double double40 = simpleRegression29.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression41 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double42 = simpleRegression41.getIntercept();
        double double43 = simpleRegression41.getMeanSquareError();
        simpleRegression41.clear();
        double double46 = simpleRegression41.predict((double) (byte) 10);
        double double47 = simpleRegression41.getRSquare();
        double double48 = simpleRegression41.getIntercept();
        simpleRegression41.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression50 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double51 = simpleRegression50.getMeanSquareError();
        double double52 = simpleRegression50.getSumSquaredErrors();
        double double53 = simpleRegression50.getMeanSquareError();
        double double55 = simpleRegression50.predict((double) 10);
        simpleRegression50.clear();
        double[] doubleArray62 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray68 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray69 = new double[][] { doubleArray62, doubleArray68 };
        simpleRegression50.addData(doubleArray69);
        simpleRegression41.addData(doubleArray69);
        simpleRegression29.addData(doubleArray69);
        simpleRegression18.addData(doubleArray69);
        simpleRegression0.addData(doubleArray69);
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getRegressionSumSquares();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getTotalSumSquares();
        java.lang.Class<?> wildcardClass5 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        double double25 = simpleRegression0.getR();
        simpleRegression0.clear();
        double double27 = simpleRegression0.getRSquare();
        double double28 = simpleRegression0.getSlopeStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        double double16 = simpleRegression0.getSlope();
        double double17 = simpleRegression0.getR();
        long long18 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        double double57 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
        double double58 = simpleRegression0.getR();
        double double59 = simpleRegression0.getIntercept();
        long long60 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 5L + "'", long60 == 5L);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getMeanSquareError();
        long long9 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getInterceptStdErr();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getSlope();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.predict(100.0d);
        double double8 = simpleRegression0.getIntercept();
        double double9 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        double double72 = simpleRegression0.getR();
        double double73 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData((double) (short) 10, 1.0101010101010102d);
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
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 7350.75d + "'", double73 == 7350.75d);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) 0, Double.NaN);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression19 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double20 = simpleRegression19.getMeanSquareError();
        double[] doubleArray23 = new double[] { 100.0f, 100L };
        double[] doubleArray26 = new double[] { 100.0f, 100L };
        double[] doubleArray29 = new double[] { 100.0f, 100L };
        double[][] doubleArray30 = new double[][] { doubleArray23, doubleArray26, doubleArray29 };
        simpleRegression19.addData(doubleArray30);
        double double32 = simpleRegression19.getSlopeConfidenceInterval();
        double double33 = simpleRegression19.getSumSquaredErrors();
        double double34 = simpleRegression19.getSlope();
        double double35 = simpleRegression19.getSignificance();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double37 = simpleRegression36.getIntercept();
        double double38 = simpleRegression36.getMeanSquareError();
        simpleRegression36.clear();
        double double40 = simpleRegression36.getTotalSumSquares();
        double double41 = simpleRegression36.getSumSquaredErrors();
        simpleRegression36.addData((double) (byte) 0, Double.NaN);
        simpleRegression36.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double47 = simpleRegression46.getMeanSquareError();
        double[] doubleArray50 = new double[] { 100.0f, 100L };
        double[] doubleArray53 = new double[] { 100.0f, 100L };
        double[] doubleArray56 = new double[] { 100.0f, 100L };
        double[][] doubleArray57 = new double[][] { doubleArray50, doubleArray53, doubleArray56 };
        simpleRegression46.addData(doubleArray57);
        double double59 = simpleRegression46.getSlopeConfidenceInterval();
        double double60 = simpleRegression46.getSumSquaredErrors();
        double double61 = simpleRegression46.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression62 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double63 = simpleRegression62.getMeanSquareError();
        double double64 = simpleRegression62.getSumSquaredErrors();
        double double65 = simpleRegression62.getMeanSquareError();
        double double66 = simpleRegression62.getInterceptStdErr();
        double double67 = simpleRegression62.getRegressionSumSquares();
        simpleRegression62.clear();
        double double69 = simpleRegression62.getInterceptStdErr();
        simpleRegression62.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression71 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double72 = simpleRegression71.getMeanSquareError();
        double double73 = simpleRegression71.getSumSquaredErrors();
        double double75 = simpleRegression71.predict((double) (short) -1);
        double double76 = simpleRegression71.getIntercept();
        double double77 = simpleRegression71.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression78 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression79 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double80 = simpleRegression79.getMeanSquareError();
        double[] doubleArray83 = new double[] { 100.0f, 100L };
        double[] doubleArray86 = new double[] { 100.0f, 100L };
        double[] doubleArray89 = new double[] { 100.0f, 100L };
        double[][] doubleArray90 = new double[][] { doubleArray83, doubleArray86, doubleArray89 };
        simpleRegression79.addData(doubleArray90);
        simpleRegression78.addData(doubleArray90);
        simpleRegression71.addData(doubleArray90);
        simpleRegression62.addData(doubleArray90);
        simpleRegression46.addData(doubleArray90);
        simpleRegression36.addData(doubleArray90);
        simpleRegression19.addData(doubleArray90);
        simpleRegression0.addData(doubleArray90);
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
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray90);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        double double16 = simpleRegression0.getRSquare();
        double double17 = simpleRegression0.getMeanSquareError();
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
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double15 = simpleRegression0.predict((double) (byte) -1);
        double double16 = simpleRegression0.getSignificance();
        double double17 = simpleRegression0.getSumSquaredErrors();
        double double18 = simpleRegression0.getSumSquaredErrors();
        double double19 = simpleRegression0.getTotalSumSquares();
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double14 = simpleRegression0.predict((double) 10);
        double double15 = simpleRegression0.getMeanSquareError();
        double double16 = simpleRegression0.getTotalSumSquares();
        double double17 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getMeanSquareError();
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(40.5d, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
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
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double double10 = simpleRegression8.getSumSquaredErrors();
        double double11 = simpleRegression8.getMeanSquareError();
        double double13 = simpleRegression8.predict((double) 10);
        simpleRegression8.clear();
        double[] doubleArray20 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray26 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray27 = new double[][] { doubleArray20, doubleArray26 };
        simpleRegression8.addData(doubleArray27);
        simpleRegression0.addData(doubleArray27);
        double double31 = simpleRegression0.predict((double) ' ');
        long long32 = simpleRegression0.getN();
        double double33 = simpleRegression0.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double35 = simpleRegression34.getMeanSquareError();
        double double36 = simpleRegression34.getSumSquaredErrors();
        double double38 = simpleRegression34.predict((double) (short) -1);
        double double39 = simpleRegression34.getRegressionSumSquares();
        double double40 = simpleRegression34.getSumSquaredErrors();
        long long41 = simpleRegression34.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression42 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double43 = simpleRegression42.getMeanSquareError();
        double double44 = simpleRegression42.getSumSquaredErrors();
        double double45 = simpleRegression42.getMeanSquareError();
        double double46 = simpleRegression42.getInterceptStdErr();
        double double47 = simpleRegression42.getRegressionSumSquares();
        simpleRegression42.clear();
        double double49 = simpleRegression42.getInterceptStdErr();
        simpleRegression42.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression51 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double52 = simpleRegression51.getMeanSquareError();
        double double53 = simpleRegression51.getSumSquaredErrors();
        double double55 = simpleRegression51.predict((double) (short) -1);
        double double56 = simpleRegression51.getIntercept();
        double double57 = simpleRegression51.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression58 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression59 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double60 = simpleRegression59.getMeanSquareError();
        double[] doubleArray63 = new double[] { 100.0f, 100L };
        double[] doubleArray66 = new double[] { 100.0f, 100L };
        double[] doubleArray69 = new double[] { 100.0f, 100L };
        double[][] doubleArray70 = new double[][] { doubleArray63, doubleArray66, doubleArray69 };
        simpleRegression59.addData(doubleArray70);
        simpleRegression58.addData(doubleArray70);
        simpleRegression51.addData(doubleArray70);
        simpleRegression42.addData(doubleArray70);
        simpleRegression34.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2L + "'", long32 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.predict(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval((double) 8L);
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
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.predict(1851.4285714285716d);
        long long5 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        double double18 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
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
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        double double42 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        double double44 = simpleRegression0.getMeanSquareError();
        double double45 = simpleRegression0.getRSquare();
        double double47 = simpleRegression0.predict(12000.0d);
        double double48 = simpleRegression0.getSlope();
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
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
        double double24 = simpleRegression0.predict((double) ' ');
        double double25 = simpleRegression0.getIntercept();
        double double26 = simpleRegression0.getTotalSumSquares();
        double double27 = simpleRegression0.getInterceptStdErr();
        double double28 = simpleRegression0.getR();
        double double29 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getIntercept();
        double double13 = simpleRegression0.getSlope();
        double double14 = simpleRegression0.getTotalSumSquares();
        double double15 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getSlopeStdErr();
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
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double double10 = simpleRegression8.getSumSquaredErrors();
        double double11 = simpleRegression8.getMeanSquareError();
        double double13 = simpleRegression8.predict((double) 10);
        simpleRegression8.clear();
        double[] doubleArray20 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray26 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray27 = new double[][] { doubleArray20, doubleArray26 };
        simpleRegression8.addData(doubleArray27);
        simpleRegression0.addData(doubleArray27);
        double double30 = simpleRegression0.getIntercept();
        double double31 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSlope();
        double double15 = simpleRegression0.getSlopeConfidenceInterval();
        double double16 = simpleRegression0.getSlope();
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
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval(476.8680089485456d);
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
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getRSquare();
        double double16 = simpleRegression0.predict(0.9984957532976854d);
        double double17 = simpleRegression0.getTotalSumSquares();
        double double18 = simpleRegression0.getSumSquaredErrors();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData(7350.75d, 7500.0d);
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getSlope();
        simpleRegression0.clear();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) 1);
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
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getIntercept();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getMeanSquareError();
        simpleRegression6.clear();
        double double9 = simpleRegression6.getRSquare();
        long long10 = simpleRegression6.getN();
        double double11 = simpleRegression6.getRegressionSumSquares();
        simpleRegression6.addData((double) 10L, (double) (byte) -1);
        double double16 = simpleRegression6.predict(99.10891089108911d);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double18 = simpleRegression17.getMeanSquareError();
        double double19 = simpleRegression17.getSlopeStdErr();
        double double20 = simpleRegression17.getSumSquaredErrors();
        double double21 = simpleRegression17.getSumSquaredErrors();
        double double22 = simpleRegression17.getTotalSumSquares();
        double double23 = simpleRegression17.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression24 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double25 = simpleRegression24.getMeanSquareError();
        double double26 = simpleRegression24.getSumSquaredErrors();
        double double28 = simpleRegression24.predict((double) (short) -1);
        double double29 = simpleRegression24.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression30 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double31 = simpleRegression30.getIntercept();
        double double32 = simpleRegression30.getMeanSquareError();
        long long33 = simpleRegression30.getN();
        double double34 = simpleRegression30.getSumSquaredErrors();
        double double35 = simpleRegression30.getR();
        double[] doubleArray42 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray49 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray50 = new double[][] { doubleArray42, doubleArray49 };
        simpleRegression30.addData(doubleArray50);
        simpleRegression24.addData(doubleArray50);
        simpleRegression17.addData(doubleArray50);
        simpleRegression6.addData(doubleArray50);
        simpleRegression0.addData(doubleArray50);
        // The following exception was thrown during execution in test generation
        try {
            double double56 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getTotalSumSquares();
        double double8 = simpleRegression0.getSlope();
        simpleRegression0.addData(1.0d, 0.0d);
        double double12 = simpleRegression0.getSumSquaredErrors();
        double double13 = simpleRegression0.getIntercept();
        double double14 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.predict((double) (byte) 10);
        simpleRegression0.clear();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        double double35 = simpleRegression0.getInterceptStdErr();
        double double36 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.predict((double) 3L);
        simpleRegression0.addData((double) (short) 100, 0.0d);
        simpleRegression0.addData(93.16554809843402d, 6075.0d);
        long long16 = simpleRegression0.getN();
        double double18 = simpleRegression0.predict(0.4807692307692307d);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression19 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double21 = simpleRegression20.getMeanSquareError();
        double[] doubleArray24 = new double[] { 100.0f, 100L };
        double[] doubleArray27 = new double[] { 100.0f, 100L };
        double[] doubleArray30 = new double[] { 100.0f, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray24, doubleArray27, doubleArray30 };
        simpleRegression20.addData(doubleArray31);
        simpleRegression19.addData(doubleArray31);
        double double34 = simpleRegression19.getSumSquaredErrors();
        double double35 = simpleRegression19.getSlopeStdErr();
        double double36 = simpleRegression19.getRegressionSumSquares();
        double double37 = simpleRegression19.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression38 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double39 = simpleRegression38.getIntercept();
        double double40 = simpleRegression38.getMeanSquareError();
        simpleRegression38.clear();
        double double42 = simpleRegression38.getTotalSumSquares();
        double double43 = simpleRegression38.getIntercept();
        double double44 = simpleRegression38.getSlopeStdErr();
        long long45 = simpleRegression38.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double47 = simpleRegression46.getMeanSquareError();
        double[] doubleArray50 = new double[] { 100.0f, 100L };
        double[] doubleArray53 = new double[] { 100.0f, 100L };
        double[] doubleArray56 = new double[] { 100.0f, 100L };
        double[][] doubleArray57 = new double[][] { doubleArray50, doubleArray53, doubleArray56 };
        simpleRegression46.addData(doubleArray57);
        long long59 = simpleRegression46.getN();
        double double60 = simpleRegression46.getRSquare();
        double double61 = simpleRegression46.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression62 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double63 = simpleRegression62.getMeanSquareError();
        double double64 = simpleRegression62.getSumSquaredErrors();
        double double65 = simpleRegression62.getMeanSquareError();
        double double67 = simpleRegression62.predict((double) 10);
        simpleRegression62.clear();
        double[] doubleArray74 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray80 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray81 = new double[][] { doubleArray74, doubleArray80 };
        simpleRegression62.addData(doubleArray81);
        simpleRegression46.addData(doubleArray81);
        simpleRegression38.addData(doubleArray81);
        simpleRegression19.addData(doubleArray81);
        simpleRegression0.addData(doubleArray81);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 88460.54308825397d + "'", double18 == 88460.54308825397d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 3L + "'", long59 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
    }
}

