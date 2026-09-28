package org.apache.commons.math3.stat.inference;

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
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray3 = new double[] { 12.0d, 14.5d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray10 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray15 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double16 = mannWhitneyUTest5.mannWhitneyUTest(doubleArray10, doubleArray15);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray22 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray27 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double28 = mannWhitneyUTest17.mannWhitneyUTest(doubleArray22, doubleArray27);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray34 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray39 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double40 = mannWhitneyUTest29.mannWhitneyUTest(doubleArray34, doubleArray39);
        double double41 = mannWhitneyUTest5.mannWhitneyU(doubleArray27, doubleArray34);
        double[] doubleArray48 = new double[] { (short) 100, 100L, (short) 10, 0.0f, 0.8064959405073401d, 9.5d };
        double double49 = mannWhitneyUTest4.mannWhitneyU(doubleArray27, doubleArray48);
        double double50 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray3, doubleArray27);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray56 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray61 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double62 = mannWhitneyUTest51.mannWhitneyUTest(doubleArray56, doubleArray61);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray68 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray73 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double74 = mannWhitneyUTest63.mannWhitneyUTest(doubleArray68, doubleArray73);
        double double75 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray61, doubleArray68);
        java.lang.Class<?> wildcardClass76 = doubleArray68.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 12.0d, 14.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6650055421020291d + "'", double16 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.6650055421020291d + "'", double28 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.6650055421020291d + "'", double40 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 9.5d + "'", double41 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d, 100.0d, 10.0d, 0.0d, 0.8064959405073401d, 9.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 14.5d + "'", double49 == 14.5d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.3545394797735012d + "'", double50 == 0.3545394797735012d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.6650055421020291d + "'", double62 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.6650055421020291d + "'", double74 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.6650055421020291d + "'", double75 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double12 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray6, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray30 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray35 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double36 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray30, doubleArray35);
        double double37 = mannWhitneyUTest1.mannWhitneyU(doubleArray23, doubleArray30);
        double[] doubleArray44 = new double[] { (short) 100, 100L, (short) 10, 0.0f, 0.8064959405073401d, 9.5d };
        double double45 = mannWhitneyUTest0.mannWhitneyU(doubleArray23, doubleArray44);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray56 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double57 = mannWhitneyUTest46.mannWhitneyUTest(doubleArray51, doubleArray56);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray68 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double69 = mannWhitneyUTest58.mannWhitneyUTest(doubleArray63, doubleArray68);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray75 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray80 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double81 = mannWhitneyUTest70.mannWhitneyUTest(doubleArray75, doubleArray80);
        double double82 = mannWhitneyUTest46.mannWhitneyU(doubleArray68, doubleArray75);
        double[] doubleArray83 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double84 = mannWhitneyUTest0.mannWhitneyU(doubleArray68, doubleArray83);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6650055421020291d + "'", double12 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.6650055421020291d + "'", double36 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 9.5d + "'", double37 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 100.0d, 10.0d, 0.0d, 0.8064959405073401d, 9.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 14.5d + "'", double45 == 14.5d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.6650055421020291d + "'", double57 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.6650055421020291d + "'", double69 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.6650055421020291d + "'", double81 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 9.5d + "'", double82 == 9.5d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray2 = new double[] { (byte) 0 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { 100.0f, 13.5d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest7 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest8 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest9 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray14 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray19 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double20 = mannWhitneyUTest9.mannWhitneyUTest(doubleArray14, doubleArray19);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest21 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray26 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray31 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double32 = mannWhitneyUTest21.mannWhitneyUTest(doubleArray26, doubleArray31);
        double double33 = mannWhitneyUTest8.mannWhitneyU(doubleArray14, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest34 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest35 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray40 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray45 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double46 = mannWhitneyUTest35.mannWhitneyUTest(doubleArray40, doubleArray45);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray57 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double58 = mannWhitneyUTest47.mannWhitneyUTest(doubleArray52, doubleArray57);
        double double59 = mannWhitneyUTest34.mannWhitneyU(doubleArray40, doubleArray52);
        double double60 = mannWhitneyUTest7.mannWhitneyUTest(doubleArray26, doubleArray40);
        double double61 = mannWhitneyUTest3.mannWhitneyU(doubleArray6, doubleArray26);
        double double62 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray2, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest64 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest65 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray70 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray75 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double76 = mannWhitneyUTest65.mannWhitneyUTest(doubleArray70, doubleArray75);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest77 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray82 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray87 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double88 = mannWhitneyUTest77.mannWhitneyUTest(doubleArray82, doubleArray87);
        double double89 = mannWhitneyUTest64.mannWhitneyU(doubleArray70, doubleArray82);
        double[] doubleArray95 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double96 = mannWhitneyUTest63.mannWhitneyUTest(doubleArray82, doubleArray95);
        double[] doubleArray97 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double98 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray82, doubleArray97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 13.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6650055421020291d + "'", double20 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.6650055421020291d + "'", double32 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 8.0d + "'", double33 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.6650055421020291d + "'", double46 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.6650055421020291d + "'", double58 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 8.0d + "'", double59 == 8.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 5.5d + "'", double61 == 5.5d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.4795001221869535d + "'", double62 == 0.4795001221869535d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.6650055421020291d + "'", double76 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.6650055421020291d + "'", double88 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 8.0d + "'", double89 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertArrayEquals(doubleArray95, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.8064959405073401d + "'", double96 == 0.8064959405073401d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double13 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray7, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray19);
        double[] doubleArray32 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double33 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray19, doubleArray32);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest34 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray39 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray44 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double45 = mannWhitneyUTest34.mannWhitneyUTest(doubleArray39, doubleArray44);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray57 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double58 = mannWhitneyUTest47.mannWhitneyUTest(doubleArray52, doubleArray57);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray64 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray69 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double70 = mannWhitneyUTest59.mannWhitneyUTest(doubleArray64, doubleArray69);
        double double71 = mannWhitneyUTest46.mannWhitneyU(doubleArray52, doubleArray64);
        double double72 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray39, doubleArray64);
        java.lang.Class<?> wildcardClass73 = doubleArray64.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6650055421020291d + "'", double13 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.0d + "'", double26 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.8064959405073401d + "'", double33 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.6650055421020291d + "'", double45 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.6650055421020291d + "'", double58 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.6650055421020291d + "'", double70 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 8.0d + "'", double71 == 8.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray3 = new double[] { 12.0d, 14.5d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray10 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray15 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double16 = mannWhitneyUTest5.mannWhitneyUTest(doubleArray10, doubleArray15);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray22 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray27 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double28 = mannWhitneyUTest17.mannWhitneyUTest(doubleArray22, doubleArray27);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray34 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray39 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double40 = mannWhitneyUTest29.mannWhitneyUTest(doubleArray34, doubleArray39);
        double double41 = mannWhitneyUTest5.mannWhitneyU(doubleArray27, doubleArray34);
        double[] doubleArray48 = new double[] { (short) 100, 100L, (short) 10, 0.0f, 0.8064959405073401d, 9.5d };
        double double49 = mannWhitneyUTest4.mannWhitneyU(doubleArray27, doubleArray48);
        double double50 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray3, doubleArray27);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray56 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray61 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double62 = mannWhitneyUTest51.mannWhitneyUTest(doubleArray56, doubleArray61);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray68 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray73 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double74 = mannWhitneyUTest63.mannWhitneyUTest(doubleArray68, doubleArray73);
        double double75 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray61, doubleArray68);
        java.lang.Class<?> wildcardClass76 = doubleArray61.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 12.0d, 14.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6650055421020291d + "'", double16 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.6650055421020291d + "'", double28 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.6650055421020291d + "'", double40 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 9.5d + "'", double41 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d, 100.0d, 10.0d, 0.0d, 0.8064959405073401d, 9.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 14.5d + "'", double49 == 14.5d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.3545394797735012d + "'", double50 == 0.3545394797735012d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.6650055421020291d + "'", double62 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.6650055421020291d + "'", double74 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.6650055421020291d + "'", double75 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double12 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray6, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        double double25 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray18);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray38 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double39 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray33, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray50 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double51 = mannWhitneyUTest40.mannWhitneyUTest(doubleArray45, doubleArray50);
        double double52 = mannWhitneyUTest27.mannWhitneyU(doubleArray33, doubleArray45);
        double[] doubleArray58 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double59 = mannWhitneyUTest26.mannWhitneyUTest(doubleArray45, doubleArray58);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest60 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray65 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray70 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double71 = mannWhitneyUTest60.mannWhitneyUTest(doubleArray65, doubleArray70);
        double double72 = mannWhitneyUTest0.mannWhitneyU(doubleArray45, doubleArray65);
        double[] doubleArray73 = null;
        double[] doubleArray74 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double75 = mannWhitneyUTest0.mannWhitneyU(doubleArray73, doubleArray74);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6650055421020291d + "'", double12 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.0d + "'", double25 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.6650055421020291d + "'", double39 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.6650055421020291d + "'", double51 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 8.0d + "'", double52 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.8064959405073401d + "'", double59 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.6650055421020291d + "'", double71 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 8.0d + "'", double72 == 8.0d);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray3 = new double[] { 12.0d, 14.5d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray10 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray15 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double16 = mannWhitneyUTest5.mannWhitneyUTest(doubleArray10, doubleArray15);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray22 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray27 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double28 = mannWhitneyUTest17.mannWhitneyUTest(doubleArray22, doubleArray27);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray34 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray39 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double40 = mannWhitneyUTest29.mannWhitneyUTest(doubleArray34, doubleArray39);
        double double41 = mannWhitneyUTest5.mannWhitneyU(doubleArray27, doubleArray34);
        double[] doubleArray48 = new double[] { (short) 100, 100L, (short) 10, 0.0f, 0.8064959405073401d, 9.5d };
        double double49 = mannWhitneyUTest4.mannWhitneyU(doubleArray27, doubleArray48);
        double double50 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray3, doubleArray27);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray56 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray61 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double62 = mannWhitneyUTest51.mannWhitneyUTest(doubleArray56, doubleArray61);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray68 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray73 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double74 = mannWhitneyUTest63.mannWhitneyUTest(doubleArray68, doubleArray73);
        double double75 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray61, doubleArray68);
        java.lang.Class<?> wildcardClass76 = mannWhitneyUTest0.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 12.0d, 14.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6650055421020291d + "'", double16 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.6650055421020291d + "'", double28 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.6650055421020291d + "'", double40 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 9.5d + "'", double41 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d, 100.0d, 10.0d, 0.0d, 0.8064959405073401d, 9.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 14.5d + "'", double49 == 14.5d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.3545394797735012d + "'", double50 == 0.3545394797735012d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.6650055421020291d + "'", double62 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.6650055421020291d + "'", double74 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.6650055421020291d + "'", double75 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double13 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray7, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray19);
        double[] doubleArray33 = new double[] { 10, 0.0f, (byte) 10, (byte) 10, (short) -1, (byte) -1 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest34 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray39 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray44 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double45 = mannWhitneyUTest34.mannWhitneyUTest(doubleArray39, doubleArray44);
        double double46 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray33, doubleArray44);
        double[] doubleArray52 = new double[] { (-1.0d), 100.0d, 8.0d, (-1), (byte) 0 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray59 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray64 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double65 = mannWhitneyUTest54.mannWhitneyUTest(doubleArray59, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray71 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray76 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double77 = mannWhitneyUTest66.mannWhitneyUTest(doubleArray71, doubleArray76);
        double double78 = mannWhitneyUTest53.mannWhitneyU(doubleArray59, doubleArray71);
        double double79 = mannWhitneyUTest1.mannWhitneyU(doubleArray52, doubleArray71);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest80 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray85 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray90 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double91 = mannWhitneyUTest80.mannWhitneyUTest(doubleArray85, doubleArray90);
        double double92 = mannWhitneyUTest0.mannWhitneyU(doubleArray52, doubleArray90);
        double[] doubleArray96 = new double[] { 0.4795001221869535d, 0.14891467317876583d, (short) -1 };
        double[] doubleArray97 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double98 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray96, doubleArray97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6650055421020291d + "'", double13 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.0d + "'", double26 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d, 0.0d, 10.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.6650055421020291d + "'", double45 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.5940323405990415d + "'", double46 == 0.5940323405990415d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { (-1.0d), 100.0d, 8.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.6650055421020291d + "'", double65 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.6650055421020291d + "'", double77 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 8.0d + "'", double78 == 8.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 13.5d + "'", double79 == 13.5d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.6650055421020291d + "'", double91 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 12.0d + "'", double92 == 12.0d);
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertArrayEquals(doubleArray96, new double[] { 0.4795001221869535d, 0.14891467317876583d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray30 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray35 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double36 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray30, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray42 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray47 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double48 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray42, doubleArray47);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray54 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray59 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double60 = mannWhitneyUTest49.mannWhitneyUTest(doubleArray54, doubleArray59);
        double double61 = mannWhitneyUTest25.mannWhitneyU(doubleArray47, doubleArray54);
        double double62 = mannWhitneyUTest12.mannWhitneyU(doubleArray23, doubleArray47);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest64 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray69 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray74 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double75 = mannWhitneyUTest64.mannWhitneyUTest(doubleArray69, doubleArray74);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest76 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray81 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray86 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double87 = mannWhitneyUTest76.mannWhitneyUTest(doubleArray81, doubleArray86);
        double double88 = mannWhitneyUTest63.mannWhitneyU(doubleArray69, doubleArray81);
        double double89 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray23, doubleArray69);
        double[] doubleArray90 = null;
        double[] doubleArray92 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            double double93 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray90, doubleArray92);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.6650055421020291d + "'", double36 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.6650055421020291d + "'", double48 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.6650055421020291d + "'", double60 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 9.5d + "'", double61 == 9.5d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 8.0d + "'", double62 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.6650055421020291d + "'", double75 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.6650055421020291d + "'", double87 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 8.0d + "'", double88 == 8.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.6650055421020291d + "'", double89 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double13 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray7, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray19);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray38 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double39 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray33, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray50 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double51 = mannWhitneyUTest40.mannWhitneyUTest(doubleArray45, doubleArray50);
        double double52 = mannWhitneyUTest27.mannWhitneyU(doubleArray33, doubleArray45);
        double double53 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray19, doubleArray33);
        double[] doubleArray54 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest55 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest56 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray61 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray66 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double67 = mannWhitneyUTest56.mannWhitneyUTest(doubleArray61, doubleArray66);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest68 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray73 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray78 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double79 = mannWhitneyUTest68.mannWhitneyUTest(doubleArray73, doubleArray78);
        double double80 = mannWhitneyUTest55.mannWhitneyU(doubleArray61, doubleArray73);
        // The following exception was thrown during execution in test generation
        try {
            double double81 = mannWhitneyUTest0.mannWhitneyU(doubleArray54, doubleArray73);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6650055421020291d + "'", double13 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.0d + "'", double26 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.6650055421020291d + "'", double39 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.6650055421020291d + "'", double51 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 8.0d + "'", double52 == 8.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.6650055421020291d + "'", double67 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.6650055421020291d + "'", double79 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 8.0d + "'", double80 == 8.0d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        double[] doubleArray3 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray10 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray15 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double16 = mannWhitneyUTest5.mannWhitneyUTest(doubleArray10, doubleArray15);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest19 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest20 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray25 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray30 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double31 = mannWhitneyUTest20.mannWhitneyUTest(doubleArray25, doubleArray30);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray42 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double43 = mannWhitneyUTest32.mannWhitneyUTest(doubleArray37, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray54 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double55 = mannWhitneyUTest44.mannWhitneyUTest(doubleArray49, doubleArray54);
        double double56 = mannWhitneyUTest20.mannWhitneyU(doubleArray42, doubleArray49);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray68 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double69 = mannWhitneyUTest58.mannWhitneyUTest(doubleArray63, doubleArray68);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray75 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray80 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double81 = mannWhitneyUTest70.mannWhitneyUTest(doubleArray75, doubleArray80);
        double double82 = mannWhitneyUTest57.mannWhitneyU(doubleArray63, doubleArray75);
        double double83 = mannWhitneyUTest19.mannWhitneyUTest(doubleArray49, doubleArray75);
        double[] doubleArray87 = new double[] { 0.8064959405073401d, 8.0d, '#' };
        double double88 = mannWhitneyUTest18.mannWhitneyU(doubleArray75, doubleArray87);
        double[] doubleArray95 = new double[] { 10.0d, 0.14891467317876583d, 4.0d, 0.6547208460185768d, 0.7133031738784575d, 10L };
        double double96 = mannWhitneyUTest17.mannWhitneyU(doubleArray87, doubleArray95);
        double double97 = mannWhitneyUTest4.mannWhitneyUTest(doubleArray10, doubleArray87);
        // The following exception was thrown during execution in test generation
        try {
            double double98 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray3, doubleArray87);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6650055421020291d + "'", double16 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.6650055421020291d + "'", double31 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.6650055421020291d + "'", double43 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.6650055421020291d + "'", double55 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 9.5d + "'", double56 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.6650055421020291d + "'", double69 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.6650055421020291d + "'", double81 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 8.0d + "'", double82 == 8.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { 0.8064959405073401d, 8.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 6.0d + "'", double88 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertArrayEquals(doubleArray95, new double[] { 10.0d, 0.14891467317876583d, 4.0d, 0.6547208460185768d, 0.7133031738784575d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 13.0d + "'", double96 == 13.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 1.0d + "'", double97 == 1.0d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        double[] doubleArray12 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray30 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray35 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double36 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray30, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray42 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray47 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double48 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray42, doubleArray47);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray54 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray59 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double60 = mannWhitneyUTest49.mannWhitneyUTest(doubleArray54, doubleArray59);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest62 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray67 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray72 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double73 = mannWhitneyUTest62.mannWhitneyUTest(doubleArray67, doubleArray72);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest74 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray79 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray84 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double85 = mannWhitneyUTest74.mannWhitneyUTest(doubleArray79, doubleArray84);
        double double86 = mannWhitneyUTest61.mannWhitneyU(doubleArray67, doubleArray79);
        double double87 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray59, doubleArray67);
        double double88 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray35, doubleArray67);
        // The following exception was thrown during execution in test generation
        try {
            double double89 = mannWhitneyUTest0.mannWhitneyU(doubleArray12, doubleArray67);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.6650055421020291d + "'", double36 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.6650055421020291d + "'", double48 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.6650055421020291d + "'", double60 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.6650055421020291d + "'", double73 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.6650055421020291d + "'", double85 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 8.0d + "'", double86 == 8.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.6650055421020291d + "'", double87 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.6650055421020291d + "'", double88 == 0.6650055421020291d);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double12 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray6, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray30 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray35 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double36 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray30, doubleArray35);
        double double37 = mannWhitneyUTest1.mannWhitneyU(doubleArray23, doubleArray30);
        double[] doubleArray41 = new double[] { (byte) 0, 0.37109336952269745d, (short) -1 };
        double double42 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray23, doubleArray41);
        double[] doubleArray43 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray56 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double57 = mannWhitneyUTest46.mannWhitneyUTest(doubleArray51, doubleArray56);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray68 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double69 = mannWhitneyUTest58.mannWhitneyUTest(doubleArray63, doubleArray68);
        double double70 = mannWhitneyUTest45.mannWhitneyU(doubleArray51, doubleArray63);
        double[] doubleArray76 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double77 = mannWhitneyUTest44.mannWhitneyUTest(doubleArray63, doubleArray76);
        // The following exception was thrown during execution in test generation
        try {
            double double78 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray43, doubleArray76);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6650055421020291d + "'", double12 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.6650055421020291d + "'", double36 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 9.5d + "'", double37 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, 0.37109336952269745d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.2159249389401403d + "'", double42 == 0.2159249389401403d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.6650055421020291d + "'", double57 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.6650055421020291d + "'", double69 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 8.0d + "'", double70 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.8064959405073401d + "'", double77 == 0.8064959405073401d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double12 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray6, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray31 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray36 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double37 = mannWhitneyUTest26.mannWhitneyUTest(doubleArray31, doubleArray36);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray43 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray48 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double49 = mannWhitneyUTest38.mannWhitneyUTest(doubleArray43, doubleArray48);
        double double50 = mannWhitneyUTest25.mannWhitneyU(doubleArray31, doubleArray43);
        double[] doubleArray57 = new double[] { 10, 0.0f, (byte) 10, (byte) 10, (short) -1, (byte) -1 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray68 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double69 = mannWhitneyUTest58.mannWhitneyUTest(doubleArray63, doubleArray68);
        double double70 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray57, doubleArray68);
        double double71 = mannWhitneyUTest1.mannWhitneyU(doubleArray18, doubleArray68);
        double[] doubleArray72 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double73 = mannWhitneyUTest0.mannWhitneyU(doubleArray18, doubleArray72);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6650055421020291d + "'", double12 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.6650055421020291d + "'", double37 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.6650055421020291d + "'", double49 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 8.0d + "'", double50 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 10.0d, 0.0d, 10.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.6650055421020291d + "'", double69 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.5940323405990415d + "'", double70 == 0.5940323405990415d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 9.5d + "'", double71 == 9.5d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double13 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray7, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray19);
        double[] doubleArray32 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double33 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray19, doubleArray32);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest34 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest35 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray40 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray45 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double46 = mannWhitneyUTest35.mannWhitneyUTest(doubleArray40, doubleArray45);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray57 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double58 = mannWhitneyUTest47.mannWhitneyUTest(doubleArray52, doubleArray57);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray64 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray69 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double70 = mannWhitneyUTest59.mannWhitneyUTest(doubleArray64, doubleArray69);
        double double71 = mannWhitneyUTest35.mannWhitneyU(doubleArray57, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest72 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray77 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray82 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double83 = mannWhitneyUTest72.mannWhitneyUTest(doubleArray77, doubleArray82);
        double double84 = mannWhitneyUTest34.mannWhitneyU(doubleArray57, doubleArray77);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest85 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray90 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray95 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double96 = mannWhitneyUTest85.mannWhitneyUTest(doubleArray90, doubleArray95);
        double double97 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray77, doubleArray95);
        java.lang.Class<?> wildcardClass98 = doubleArray95.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6650055421020291d + "'", double13 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.0d + "'", double26 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.8064959405073401d + "'", double33 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.6650055421020291d + "'", double46 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.6650055421020291d + "'", double58 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.6650055421020291d + "'", double70 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 9.5d + "'", double71 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.6650055421020291d + "'", double83 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 9.5d + "'", double84 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertArrayEquals(doubleArray95, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.6650055421020291d + "'", double96 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.6650055421020291d + "'", double97 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray30 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray35 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double36 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray30, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray42 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray47 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double48 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray42, doubleArray47);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray54 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray59 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double60 = mannWhitneyUTest49.mannWhitneyUTest(doubleArray54, doubleArray59);
        double double61 = mannWhitneyUTest25.mannWhitneyU(doubleArray47, doubleArray54);
        double double62 = mannWhitneyUTest12.mannWhitneyU(doubleArray23, doubleArray47);
        double[] doubleArray69 = new double[] { 'a', ' ', 0, 100L, (byte) -1, 0.0f };
        double double70 = mannWhitneyUTest0.mannWhitneyU(doubleArray47, doubleArray69);
        double[] doubleArray71 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest72 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray78 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray83 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double84 = mannWhitneyUTest73.mannWhitneyUTest(doubleArray78, doubleArray83);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest85 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray90 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray95 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double96 = mannWhitneyUTest85.mannWhitneyUTest(doubleArray90, doubleArray95);
        double double97 = mannWhitneyUTest72.mannWhitneyU(doubleArray78, doubleArray90);
        // The following exception was thrown during execution in test generation
        try {
            double double98 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray71, doubleArray78);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.6650055421020291d + "'", double36 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.6650055421020291d + "'", double48 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.6650055421020291d + "'", double60 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 9.5d + "'", double61 == 9.5d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 8.0d + "'", double62 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 97.0d, 32.0d, 0.0d, 100.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 13.5d + "'", double70 == 13.5d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.6650055421020291d + "'", double84 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertArrayEquals(doubleArray95, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.6650055421020291d + "'", double96 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 8.0d + "'", double97 == 8.0d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double13 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray7, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray19);
        double[] doubleArray32 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double33 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray19, doubleArray32);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest34 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest35 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray40 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray45 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double46 = mannWhitneyUTest35.mannWhitneyUTest(doubleArray40, doubleArray45);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray57 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double58 = mannWhitneyUTest47.mannWhitneyUTest(doubleArray52, doubleArray57);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray64 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray69 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double70 = mannWhitneyUTest59.mannWhitneyUTest(doubleArray64, doubleArray69);
        double double71 = mannWhitneyUTest35.mannWhitneyU(doubleArray57, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest72 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray77 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray82 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double83 = mannWhitneyUTest72.mannWhitneyUTest(doubleArray77, doubleArray82);
        double double84 = mannWhitneyUTest34.mannWhitneyU(doubleArray57, doubleArray77);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest85 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray90 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray95 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double96 = mannWhitneyUTest85.mannWhitneyUTest(doubleArray90, doubleArray95);
        double double97 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray77, doubleArray95);
        java.lang.Class<?> wildcardClass98 = mannWhitneyUTest0.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6650055421020291d + "'", double13 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.0d + "'", double26 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.8064959405073401d + "'", double33 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.6650055421020291d + "'", double46 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.6650055421020291d + "'", double58 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.6650055421020291d + "'", double70 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 9.5d + "'", double71 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.6650055421020291d + "'", double83 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 9.5d + "'", double84 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertArrayEquals(doubleArray95, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.6650055421020291d + "'", double96 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.6650055421020291d + "'", double97 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double13 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray7, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray31 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray36 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double37 = mannWhitneyUTest26.mannWhitneyUTest(doubleArray31, doubleArray36);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray43 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray48 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double49 = mannWhitneyUTest38.mannWhitneyUTest(doubleArray43, doubleArray48);
        double double50 = mannWhitneyUTest14.mannWhitneyU(doubleArray36, doubleArray43);
        double double51 = mannWhitneyUTest1.mannWhitneyU(doubleArray12, doubleArray43);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray57 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray62 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double63 = mannWhitneyUTest52.mannWhitneyUTest(doubleArray57, doubleArray62);
        double double64 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray12, doubleArray62);
        double[] doubleArray65 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray77 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double78 = mannWhitneyUTest67.mannWhitneyUTest(doubleArray72, doubleArray77);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest79 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray84 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray89 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double90 = mannWhitneyUTest79.mannWhitneyUTest(doubleArray84, doubleArray89);
        double double91 = mannWhitneyUTest66.mannWhitneyU(doubleArray72, doubleArray84);
        // The following exception was thrown during execution in test generation
        try {
            double double92 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray65, doubleArray84);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6650055421020291d + "'", double13 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.6650055421020291d + "'", double37 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.6650055421020291d + "'", double49 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 9.5d + "'", double50 == 9.5d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 9.5d + "'", double51 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.6650055421020291d + "'", double63 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.6650055421020291d + "'", double78 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.6650055421020291d + "'", double90 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 8.0d + "'", double91 == 8.0d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray10 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray15 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double16 = mannWhitneyUTest5.mannWhitneyUTest(doubleArray10, doubleArray15);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray22 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray27 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double28 = mannWhitneyUTest17.mannWhitneyUTest(doubleArray22, doubleArray27);
        double double29 = mannWhitneyUTest4.mannWhitneyU(doubleArray10, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray36 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray41 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double42 = mannWhitneyUTest31.mannWhitneyUTest(doubleArray36, doubleArray41);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray48 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray53 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double54 = mannWhitneyUTest43.mannWhitneyUTest(doubleArray48, doubleArray53);
        double double55 = mannWhitneyUTest30.mannWhitneyU(doubleArray36, doubleArray48);
        double double56 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray22, doubleArray36);
        double[] doubleArray63 = new double[] { 2.0d, 100, 1L, 7.0d, 0.0f, 0.8064959405073401d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest64 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest65 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray70 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray75 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double76 = mannWhitneyUTest65.mannWhitneyUTest(doubleArray70, doubleArray75);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest77 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray82 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray87 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double88 = mannWhitneyUTest77.mannWhitneyUTest(doubleArray82, doubleArray87);
        double double89 = mannWhitneyUTest64.mannWhitneyU(doubleArray70, doubleArray82);
        double double90 = mannWhitneyUTest3.mannWhitneyU(doubleArray63, doubleArray82);
        double[] doubleArray91 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double92 = mannWhitneyUTest2.mannWhitneyU(doubleArray82, doubleArray91);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6650055421020291d + "'", double16 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.6650055421020291d + "'", double28 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 8.0d + "'", double29 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.6650055421020291d + "'", double42 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.6650055421020291d + "'", double54 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 8.0d + "'", double55 == 8.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 2.0d, 100.0d, 1.0d, 7.0d, 0.0d, 0.8064959405073401d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.6650055421020291d + "'", double76 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.6650055421020291d + "'", double88 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 8.0d + "'", double89 == 8.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 12.5d + "'", double90 == 12.5d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double12 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray6, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        double double25 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray18);
        double[] doubleArray32 = new double[] { 10, 0.0f, (byte) 10, (byte) 10, (short) -1, (byte) -1 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest33 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray43 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double44 = mannWhitneyUTest33.mannWhitneyUTest(doubleArray38, doubleArray43);
        double double45 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray32, doubleArray43);
        double[] doubleArray50 = new double[] { 0.37109336952269745d, 100L, 11.0d, 0.14891467317876583d };
        double[] doubleArray54 = new double[] { (-1), 0.0d, 8.0d };
        double double55 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray50, doubleArray54);
        double[] doubleArray56 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray62 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray67 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double68 = mannWhitneyUTest57.mannWhitneyUTest(doubleArray62, doubleArray67);
        // The following exception was thrown during execution in test generation
        try {
            double double69 = mannWhitneyUTest0.mannWhitneyU(doubleArray56, doubleArray67);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6650055421020291d + "'", double12 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.0d + "'", double25 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d, 0.0d, 10.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.6650055421020291d + "'", double44 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.5940323405990415d + "'", double45 == 0.5940323405990415d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 0.37109336952269745d, 100.0d, 11.0d, 0.14891467317876583d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { (-1.0d), 0.0d, 8.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.15729920705028488d + "'", double55 == 0.15729920705028488d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.6650055421020291d + "'", double68 == 0.6650055421020291d);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray17 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray22 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double23 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray17, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray30 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray35 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double36 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray30, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray42 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray47 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double48 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray42, doubleArray47);
        double double49 = mannWhitneyUTest24.mannWhitneyU(doubleArray30, doubleArray42);
        double[] doubleArray56 = new double[] { 10, 0.0f, (byte) 10, (byte) 10, (short) -1, (byte) -1 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray62 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray67 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double68 = mannWhitneyUTest57.mannWhitneyUTest(doubleArray62, doubleArray67);
        double double69 = mannWhitneyUTest24.mannWhitneyUTest(doubleArray56, doubleArray67);
        double double70 = mannWhitneyUTest0.mannWhitneyU(doubleArray17, doubleArray67);
        double[] doubleArray71 = null;
        double[] doubleArray72 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double73 = mannWhitneyUTest0.mannWhitneyU(doubleArray71, doubleArray72);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6650055421020291d + "'", double23 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.6650055421020291d + "'", double36 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.6650055421020291d + "'", double48 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 8.0d + "'", double49 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 10.0d, 0.0d, 10.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.6650055421020291d + "'", double68 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.5940323405990415d + "'", double69 == 0.5940323405990415d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 9.5d + "'", double70 == 9.5d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double13 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray7, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray19);
        double[] doubleArray32 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double33 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray19, doubleArray32);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest34 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest35 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray40 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray45 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double46 = mannWhitneyUTest35.mannWhitneyUTest(doubleArray40, doubleArray45);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray57 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double58 = mannWhitneyUTest47.mannWhitneyUTest(doubleArray52, doubleArray57);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray64 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray69 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double70 = mannWhitneyUTest59.mannWhitneyUTest(doubleArray64, doubleArray69);
        double double71 = mannWhitneyUTest35.mannWhitneyU(doubleArray57, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest72 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray77 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray82 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double83 = mannWhitneyUTest72.mannWhitneyUTest(doubleArray77, doubleArray82);
        double double84 = mannWhitneyUTest34.mannWhitneyU(doubleArray57, doubleArray77);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest85 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray90 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray95 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double96 = mannWhitneyUTest85.mannWhitneyUTest(doubleArray90, doubleArray95);
        double double97 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray77, doubleArray95);
        java.lang.Class<?> wildcardClass98 = doubleArray77.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6650055421020291d + "'", double13 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.0d + "'", double26 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.8064959405073401d + "'", double33 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.6650055421020291d + "'", double46 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.6650055421020291d + "'", double58 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.6650055421020291d + "'", double70 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 9.5d + "'", double71 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.6650055421020291d + "'", double83 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 9.5d + "'", double84 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertArrayEquals(doubleArray95, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.6650055421020291d + "'", double96 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.6650055421020291d + "'", double97 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double13 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray7, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray25 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double26 = mannWhitneyUTest15.mannWhitneyUTest(doubleArray20, doubleArray25);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray32 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray37 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double38 = mannWhitneyUTest27.mannWhitneyUTest(doubleArray32, doubleArray37);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest39 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray44 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray49 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double50 = mannWhitneyUTest39.mannWhitneyUTest(doubleArray44, doubleArray49);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray56 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray61 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double62 = mannWhitneyUTest51.mannWhitneyUTest(doubleArray56, doubleArray61);
        double double63 = mannWhitneyUTest27.mannWhitneyU(doubleArray49, doubleArray56);
        double double64 = mannWhitneyUTest14.mannWhitneyU(doubleArray25, doubleArray49);
        double[] doubleArray71 = new double[] { 'a', ' ', 0, 100L, (byte) -1, 0.0f };
        double double72 = mannWhitneyUTest2.mannWhitneyU(doubleArray49, doubleArray71);
        // The following exception was thrown during execution in test generation
        try {
            double double73 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray1, doubleArray49);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6650055421020291d + "'", double13 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6650055421020291d + "'", double26 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.6650055421020291d + "'", double38 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.6650055421020291d + "'", double50 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.6650055421020291d + "'", double62 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 9.5d + "'", double63 == 9.5d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 8.0d + "'", double64 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 97.0d, 32.0d, 0.0d, 100.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 13.5d + "'", double72 == 13.5d);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray17 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray22 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double23 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray17, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray29 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray34 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double35 = mannWhitneyUTest24.mannWhitneyUTest(doubleArray29, doubleArray34);
        double double36 = mannWhitneyUTest0.mannWhitneyU(doubleArray22, doubleArray29);
        double[] doubleArray37 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray43 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray48 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double49 = mannWhitneyUTest38.mannWhitneyUTest(doubleArray43, doubleArray48);
        // The following exception was thrown during execution in test generation
        try {
            double double50 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray37, doubleArray43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6650055421020291d + "'", double23 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.6650055421020291d + "'", double35 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 9.5d + "'", double36 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.6650055421020291d + "'", double49 == 0.6650055421020291d);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray2 = new double[] { 12.5d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray14 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double15 = mannWhitneyUTest4.mannWhitneyUTest(doubleArray9, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray26 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double27 = mannWhitneyUTest16.mannWhitneyUTest(doubleArray21, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray38 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double39 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray33, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray50 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double51 = mannWhitneyUTest40.mannWhitneyUTest(doubleArray45, doubleArray50);
        double double52 = mannWhitneyUTest16.mannWhitneyU(doubleArray38, doubleArray45);
        double double53 = mannWhitneyUTest3.mannWhitneyU(doubleArray14, doubleArray45);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray59 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray64 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double65 = mannWhitneyUTest54.mannWhitneyUTest(doubleArray59, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray77 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double78 = mannWhitneyUTest67.mannWhitneyUTest(doubleArray72, doubleArray77);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest79 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray84 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray89 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double90 = mannWhitneyUTest79.mannWhitneyUTest(doubleArray84, doubleArray89);
        double double91 = mannWhitneyUTest66.mannWhitneyU(doubleArray72, doubleArray84);
        double double92 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray59, doubleArray72);
        double double93 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray2, doubleArray72);
        java.lang.Class<?> wildcardClass94 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 12.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6650055421020291d + "'", double15 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.6650055421020291d + "'", double27 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.6650055421020291d + "'", double39 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.6650055421020291d + "'", double51 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 9.5d + "'", double52 == 9.5d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 9.5d + "'", double53 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.6650055421020291d + "'", double65 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.6650055421020291d + "'", double78 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.6650055421020291d + "'", double90 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 8.0d + "'", double91 == 8.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1.0d + "'", double92 == 1.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1.0d + "'", double93 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray2 = new double[] { 12.5d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray14 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double15 = mannWhitneyUTest4.mannWhitneyUTest(doubleArray9, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray26 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double27 = mannWhitneyUTest16.mannWhitneyUTest(doubleArray21, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray38 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double39 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray33, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray50 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double51 = mannWhitneyUTest40.mannWhitneyUTest(doubleArray45, doubleArray50);
        double double52 = mannWhitneyUTest16.mannWhitneyU(doubleArray38, doubleArray45);
        double double53 = mannWhitneyUTest3.mannWhitneyU(doubleArray14, doubleArray45);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray59 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray64 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double65 = mannWhitneyUTest54.mannWhitneyUTest(doubleArray59, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray77 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double78 = mannWhitneyUTest67.mannWhitneyUTest(doubleArray72, doubleArray77);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest79 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray84 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray89 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double90 = mannWhitneyUTest79.mannWhitneyUTest(doubleArray84, doubleArray89);
        double double91 = mannWhitneyUTest66.mannWhitneyU(doubleArray72, doubleArray84);
        double double92 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray59, doubleArray72);
        double double93 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray2, doubleArray72);
        java.lang.Class<?> wildcardClass94 = mannWhitneyUTest0.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 12.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6650055421020291d + "'", double15 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.6650055421020291d + "'", double27 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.6650055421020291d + "'", double39 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.6650055421020291d + "'", double51 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 9.5d + "'", double52 == 9.5d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 9.5d + "'", double53 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.6650055421020291d + "'", double65 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.6650055421020291d + "'", double78 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.6650055421020291d + "'", double90 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 8.0d + "'", double91 == 8.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1.0d + "'", double92 == 1.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1.0d + "'", double93 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        double[] doubleArray12 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        double[] doubleArray31 = new double[] { 10.0f, (short) 10, 0, 0.16491482255330125d, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray42 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double43 = mannWhitneyUTest32.mannWhitneyUTest(doubleArray37, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray54 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double55 = mannWhitneyUTest44.mannWhitneyUTest(doubleArray49, doubleArray54);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest56 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray62 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray67 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double68 = mannWhitneyUTest57.mannWhitneyUTest(doubleArray62, doubleArray67);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest69 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray74 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray79 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double80 = mannWhitneyUTest69.mannWhitneyUTest(doubleArray74, doubleArray79);
        double double81 = mannWhitneyUTest56.mannWhitneyU(doubleArray62, doubleArray74);
        double double82 = mannWhitneyUTest32.mannWhitneyUTest(doubleArray54, doubleArray62);
        double double83 = mannWhitneyUTest14.mannWhitneyU(doubleArray31, doubleArray54);
        double[] doubleArray85 = new double[] { 5.0d };
        double double86 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray54, doubleArray85);
        // The following exception was thrown during execution in test generation
        try {
            double double87 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray12, doubleArray85);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, 10.0d, 0.0d, 0.16491482255330125d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.6650055421020291d + "'", double43 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.6650055421020291d + "'", double55 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.6650055421020291d + "'", double68 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.6650055421020291d + "'", double80 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 8.0d + "'", double81 == 8.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.6650055421020291d + "'", double82 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 11.0d + "'", double83 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 5.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1.0d + "'", double86 == 1.0d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double12 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray6, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        double double25 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray18);
        double[] doubleArray32 = new double[] { 10, 0.0f, (byte) 10, (byte) 10, (short) -1, (byte) -1 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest33 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray43 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double44 = mannWhitneyUTest33.mannWhitneyUTest(doubleArray38, doubleArray43);
        double double45 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray32, doubleArray43);
        double[] doubleArray50 = new double[] { 0.37109336952269745d, 100L, 11.0d, 0.14891467317876583d };
        double[] doubleArray54 = new double[] { (-1), 0.0d, 8.0d };
        double double55 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray50, doubleArray54);
        double[] doubleArray56 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray68 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double69 = mannWhitneyUTest58.mannWhitneyUTest(doubleArray63, doubleArray68);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray75 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray80 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double81 = mannWhitneyUTest70.mannWhitneyUTest(doubleArray75, doubleArray80);
        double double82 = mannWhitneyUTest57.mannWhitneyU(doubleArray63, doubleArray75);
        // The following exception was thrown during execution in test generation
        try {
            double double83 = mannWhitneyUTest0.mannWhitneyU(doubleArray56, doubleArray63);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6650055421020291d + "'", double12 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.0d + "'", double25 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d, 0.0d, 10.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.6650055421020291d + "'", double44 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.5940323405990415d + "'", double45 == 0.5940323405990415d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 0.37109336952269745d, 100.0d, 11.0d, 0.14891467317876583d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { (-1.0d), 0.0d, 8.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.15729920705028488d + "'", double55 == 0.15729920705028488d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.6650055421020291d + "'", double69 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.6650055421020291d + "'", double81 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 8.0d + "'", double82 == 8.0d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray2 = new double[] { 12.5d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray14 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double15 = mannWhitneyUTest4.mannWhitneyUTest(doubleArray9, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray26 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double27 = mannWhitneyUTest16.mannWhitneyUTest(doubleArray21, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray38 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double39 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray33, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray50 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double51 = mannWhitneyUTest40.mannWhitneyUTest(doubleArray45, doubleArray50);
        double double52 = mannWhitneyUTest16.mannWhitneyU(doubleArray38, doubleArray45);
        double double53 = mannWhitneyUTest3.mannWhitneyU(doubleArray14, doubleArray45);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray59 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray64 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double65 = mannWhitneyUTest54.mannWhitneyUTest(doubleArray59, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray77 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double78 = mannWhitneyUTest67.mannWhitneyUTest(doubleArray72, doubleArray77);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest79 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray84 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray89 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double90 = mannWhitneyUTest79.mannWhitneyUTest(doubleArray84, doubleArray89);
        double double91 = mannWhitneyUTest66.mannWhitneyU(doubleArray72, doubleArray84);
        double double92 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray59, doubleArray72);
        double double93 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray2, doubleArray72);
        java.lang.Class<?> wildcardClass94 = doubleArray72.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 12.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6650055421020291d + "'", double15 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.6650055421020291d + "'", double27 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.6650055421020291d + "'", double39 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.6650055421020291d + "'", double51 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 9.5d + "'", double52 == 9.5d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 9.5d + "'", double53 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.6650055421020291d + "'", double65 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.6650055421020291d + "'", double78 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.6650055421020291d + "'", double90 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 8.0d + "'", double91 == 8.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1.0d + "'", double92 == 1.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1.0d + "'", double93 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray17 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray22 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double23 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray17, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray29 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray34 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double35 = mannWhitneyUTest24.mannWhitneyUTest(doubleArray29, doubleArray34);
        double double36 = mannWhitneyUTest0.mannWhitneyU(doubleArray22, doubleArray29);
        double[] doubleArray43 = new double[] { 1, 0.16491482255330125d, 10L, 0.8551321405847059d, ' ', 13.0d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray54 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double55 = mannWhitneyUTest44.mannWhitneyUTest(doubleArray49, doubleArray54);
        double double56 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray43, doubleArray54);
        double[] doubleArray61 = new double[] { 2.0d, 7.0d, (byte) -1, (short) 100 };
        double[] doubleArray62 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double63 = mannWhitneyUTest0.mannWhitneyU(doubleArray61, doubleArray62);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6650055421020291d + "'", double23 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.6650055421020291d + "'", double35 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 9.5d + "'", double36 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.0d, 0.16491482255330125d, 10.0d, 0.8551321405847059d, 32.0d, 13.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.6650055421020291d + "'", double55 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 2.0d, 7.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double13 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray7, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray19);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray34 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray39 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double40 = mannWhitneyUTest29.mannWhitneyUTest(doubleArray34, doubleArray39);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest41 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray46 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray51 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double52 = mannWhitneyUTest41.mannWhitneyUTest(doubleArray46, doubleArray51);
        double double53 = mannWhitneyUTest28.mannWhitneyU(doubleArray34, doubleArray46);
        double[] doubleArray59 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double60 = mannWhitneyUTest27.mannWhitneyUTest(doubleArray46, doubleArray59);
        double[] doubleArray65 = new double[] { (-1.0d), 1, (short) -1, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray71 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray76 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double77 = mannWhitneyUTest66.mannWhitneyUTest(doubleArray71, doubleArray76);
        double double78 = mannWhitneyUTest27.mannWhitneyUTest(doubleArray65, doubleArray71);
        double double79 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray19, doubleArray65);
        double[] doubleArray86 = new double[] { (short) 1, 100.0f, 0.4385780260809997d, 14.0d, 13.5d, 12.5d };
        double[] doubleArray91 = new double[] { 0.4532547047537364d, 1.0d, 1, 0.6547208460185768d };
        double double92 = mannWhitneyUTest0.mannWhitneyU(doubleArray86, doubleArray91);
        double[] doubleArray93 = null;
        double[] doubleArray94 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double95 = mannWhitneyUTest0.mannWhitneyU(doubleArray93, doubleArray94);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6650055421020291d + "'", double13 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.0d + "'", double26 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.6650055421020291d + "'", double40 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.6650055421020291d + "'", double52 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 8.0d + "'", double53 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.8064959405073401d + "'", double60 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { (-1.0d), 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.6650055421020291d + "'", double77 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.47048642205878954d + "'", double78 == 0.47048642205878954d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.47048642205878954d + "'", double79 == 0.47048642205878954d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 1.0d, 100.0d, 0.4385780260809997d, 14.0d, 13.5d, 12.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { 0.4532547047537364d, 1.0d, 1.0d, 0.6547208460185768d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 19.0d + "'", double92 == 19.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray31 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray36 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double37 = mannWhitneyUTest26.mannWhitneyUTest(doubleArray31, doubleArray36);
        double double38 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray31);
        double[] doubleArray44 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double45 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray31, doubleArray44);
        double[] doubleArray51 = new double[] { (-1), 6.0d, 10.0f, 100L, 100L };
        double double52 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray31, doubleArray51);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest55 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray60 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray65 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double66 = mannWhitneyUTest55.mannWhitneyUTest(doubleArray60, doubleArray65);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray77 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double78 = mannWhitneyUTest67.mannWhitneyUTest(doubleArray72, doubleArray77);
        double double79 = mannWhitneyUTest54.mannWhitneyU(doubleArray60, doubleArray72);
        double[] doubleArray85 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double86 = mannWhitneyUTest53.mannWhitneyUTest(doubleArray72, doubleArray85);
        double[] doubleArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double88 = mannWhitneyUTest0.mannWhitneyU(doubleArray72, doubleArray87);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.6650055421020291d + "'", double37 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 8.0d + "'", double38 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.8064959405073401d + "'", double45 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { (-1.0d), 6.0d, 10.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.8064959405073401d + "'", double52 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.6650055421020291d + "'", double66 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.6650055421020291d + "'", double78 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 8.0d + "'", double79 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.8064959405073401d + "'", double86 == 0.8064959405073401d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray13 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double14 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray8, doubleArray13);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray25 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double26 = mannWhitneyUTest15.mannWhitneyUTest(doubleArray20, doubleArray25);
        double double27 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray20);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray34 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray39 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double40 = mannWhitneyUTest29.mannWhitneyUTest(doubleArray34, doubleArray39);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest41 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray46 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray51 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double52 = mannWhitneyUTest41.mannWhitneyUTest(doubleArray46, doubleArray51);
        double double53 = mannWhitneyUTest28.mannWhitneyU(doubleArray34, doubleArray46);
        double double54 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray20, doubleArray34);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest55 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest56 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray61 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray66 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double67 = mannWhitneyUTest56.mannWhitneyUTest(doubleArray61, doubleArray66);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest68 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray73 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray78 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double79 = mannWhitneyUTest68.mannWhitneyUTest(doubleArray73, doubleArray78);
        double double80 = mannWhitneyUTest55.mannWhitneyU(doubleArray61, doubleArray73);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest81 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray86 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray91 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double92 = mannWhitneyUTest81.mannWhitneyUTest(doubleArray86, doubleArray91);
        double double93 = mannWhitneyUTest1.mannWhitneyU(doubleArray73, doubleArray91);
        double[] doubleArray94 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double95 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray73, doubleArray94);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6650055421020291d + "'", double14 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6650055421020291d + "'", double26 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.0d + "'", double27 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.6650055421020291d + "'", double40 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.6650055421020291d + "'", double52 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 8.0d + "'", double53 == 8.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.6650055421020291d + "'", double67 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.6650055421020291d + "'", double79 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 8.0d + "'", double80 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.6650055421020291d + "'", double92 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 9.5d + "'", double93 == 9.5d);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray13 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double14 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray8, doubleArray13);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray25 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double26 = mannWhitneyUTest15.mannWhitneyUTest(doubleArray20, doubleArray25);
        double double27 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray20);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray40 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double41 = mannWhitneyUTest30.mannWhitneyUTest(doubleArray35, doubleArray40);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray47 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray52 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double53 = mannWhitneyUTest42.mannWhitneyUTest(doubleArray47, doubleArray52);
        double double54 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray47);
        double[] doubleArray60 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double61 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray47, doubleArray60);
        double[] doubleArray66 = new double[] { (-1.0d), 1, (short) -1, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray77 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double78 = mannWhitneyUTest67.mannWhitneyUTest(doubleArray72, doubleArray77);
        double double79 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray66, doubleArray72);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest80 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray85 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray90 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double91 = mannWhitneyUTest80.mannWhitneyUTest(doubleArray85, doubleArray90);
        double double92 = mannWhitneyUTest2.mannWhitneyU(doubleArray66, doubleArray85);
        // The following exception was thrown during execution in test generation
        try {
            double double93 = mannWhitneyUTest0.mannWhitneyU(doubleArray1, doubleArray66);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6650055421020291d + "'", double14 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6650055421020291d + "'", double26 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.0d + "'", double27 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.6650055421020291d + "'", double41 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.6650055421020291d + "'", double53 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 8.0d + "'", double54 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.8064959405073401d + "'", double61 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { (-1.0d), 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.6650055421020291d + "'", double78 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.47048642205878954d + "'", double79 == 0.47048642205878954d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.6650055421020291d + "'", double91 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 10.5d + "'", double92 == 10.5d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double12 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray6, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        double double25 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray18);
        double[] doubleArray32 = new double[] { 10, 0.0f, (byte) 10, (byte) 10, (short) -1, (byte) -1 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest33 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray43 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double44 = mannWhitneyUTest33.mannWhitneyUTest(doubleArray38, doubleArray43);
        double double45 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray32, doubleArray43);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray56 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double57 = mannWhitneyUTest46.mannWhitneyUTest(doubleArray51, doubleArray56);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray68 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double69 = mannWhitneyUTest58.mannWhitneyUTest(doubleArray63, doubleArray68);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest71 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray76 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray81 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double82 = mannWhitneyUTest71.mannWhitneyUTest(doubleArray76, doubleArray81);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest83 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray88 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray93 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double94 = mannWhitneyUTest83.mannWhitneyUTest(doubleArray88, doubleArray93);
        double double95 = mannWhitneyUTest70.mannWhitneyU(doubleArray76, doubleArray88);
        double double96 = mannWhitneyUTest46.mannWhitneyUTest(doubleArray68, doubleArray76);
        double[] doubleArray97 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double98 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray76, doubleArray97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6650055421020291d + "'", double12 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.0d + "'", double25 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d, 0.0d, 10.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.6650055421020291d + "'", double44 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.5940323405990415d + "'", double45 == 0.5940323405990415d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.6650055421020291d + "'", double57 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.6650055421020291d + "'", double69 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.6650055421020291d + "'", double82 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertArrayEquals(doubleArray93, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.6650055421020291d + "'", double94 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 8.0d + "'", double95 == 8.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.6650055421020291d + "'", double96 == 0.6650055421020291d);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray30 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray35 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double36 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray30, doubleArray35);
        double double37 = mannWhitneyUTest12.mannWhitneyU(doubleArray18, doubleArray30);
        double[] doubleArray44 = new double[] { 10, 0.0f, (byte) 10, (byte) 10, (short) -1, (byte) -1 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray50 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray55 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double56 = mannWhitneyUTest45.mannWhitneyUTest(doubleArray50, doubleArray55);
        double double57 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray44, doubleArray55);
        double[] doubleArray63 = new double[] { (-1.0d), 100.0d, 8.0d, (-1), (byte) 0 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest64 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest65 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray70 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray75 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double76 = mannWhitneyUTest65.mannWhitneyUTest(doubleArray70, doubleArray75);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest77 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray82 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray87 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double88 = mannWhitneyUTest77.mannWhitneyUTest(doubleArray82, doubleArray87);
        double double89 = mannWhitneyUTest64.mannWhitneyU(doubleArray70, doubleArray82);
        double double90 = mannWhitneyUTest12.mannWhitneyU(doubleArray63, doubleArray82);
        double[] doubleArray91 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double92 = mannWhitneyUTest0.mannWhitneyU(doubleArray63, doubleArray91);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.6650055421020291d + "'", double36 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 8.0d + "'", double37 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, 0.0d, 10.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.6650055421020291d + "'", double56 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.5940323405990415d + "'", double57 == 0.5940323405990415d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { (-1.0d), 100.0d, 8.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.6650055421020291d + "'", double76 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.6650055421020291d + "'", double88 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 8.0d + "'", double89 == 8.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 13.5d + "'", double90 == 13.5d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double13 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray7, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray19);
        double[] doubleArray32 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double33 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray19, doubleArray32);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest34 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray39 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray44 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double45 = mannWhitneyUTest34.mannWhitneyUTest(doubleArray39, doubleArray44);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray57 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double58 = mannWhitneyUTest47.mannWhitneyUTest(doubleArray52, doubleArray57);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray64 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray69 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double70 = mannWhitneyUTest59.mannWhitneyUTest(doubleArray64, doubleArray69);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest71 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray76 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray81 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double82 = mannWhitneyUTest71.mannWhitneyUTest(doubleArray76, doubleArray81);
        double double83 = mannWhitneyUTest47.mannWhitneyU(doubleArray69, doubleArray76);
        double[] doubleArray87 = new double[] { (byte) 0, 0.37109336952269745d, (short) -1 };
        double double88 = mannWhitneyUTest46.mannWhitneyUTest(doubleArray69, doubleArray87);
        double double89 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray39, doubleArray87);
        double[] doubleArray90 = null;
        double[] doubleArray97 = new double[] { 0.7491191330005953d, 16.0d, 1.0f, 0.4385780260809997d, 0.4532547047537364d, 14.5d };
        // The following exception was thrown during execution in test generation
        try {
            double double98 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray90, doubleArray97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6650055421020291d + "'", double13 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.0d + "'", double26 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.8064959405073401d + "'", double33 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.6650055421020291d + "'", double45 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.6650055421020291d + "'", double58 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.6650055421020291d + "'", double70 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.6650055421020291d + "'", double82 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 9.5d + "'", double83 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { 0.0d, 0.37109336952269745d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.2159249389401403d + "'", double88 == 0.2159249389401403d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.2888443663464848d + "'", double89 == 0.2888443663464848d);
        org.junit.Assert.assertNotNull(doubleArray97);
        org.junit.Assert.assertArrayEquals(doubleArray97, new double[] { 0.7491191330005953d, 16.0d, 1.0d, 0.4385780260809997d, 0.4532547047537364d, 14.5d }, 1.0E-15);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray13 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double14 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray8, doubleArray13);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray25 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double26 = mannWhitneyUTest15.mannWhitneyUTest(doubleArray20, doubleArray25);
        double double27 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray20);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray38 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double39 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray33, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray50 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double51 = mannWhitneyUTest40.mannWhitneyUTest(doubleArray45, doubleArray50);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray57 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray62 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double63 = mannWhitneyUTest52.mannWhitneyUTest(doubleArray57, doubleArray62);
        double double64 = mannWhitneyUTest28.mannWhitneyU(doubleArray50, doubleArray57);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest65 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray70 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray75 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double76 = mannWhitneyUTest65.mannWhitneyUTest(doubleArray70, doubleArray75);
        double[] doubleArray81 = new double[] { 11.0d, (-1L), 0L, (byte) -1 };
        double double82 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray70, doubleArray81);
        double double83 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray8, doubleArray70);
        double[] doubleArray84 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double85 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray8, doubleArray84);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6650055421020291d + "'", double14 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6650055421020291d + "'", double26 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.0d + "'", double27 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.6650055421020291d + "'", double39 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.6650055421020291d + "'", double51 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.6650055421020291d + "'", double63 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 9.5d + "'", double64 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.6650055421020291d + "'", double76 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 11.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.14891467317876583d + "'", double82 == 0.14891467317876583d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray17 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray22 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double23 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray17, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray29 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray34 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double35 = mannWhitneyUTest24.mannWhitneyUTest(doubleArray29, doubleArray34);
        double double36 = mannWhitneyUTest0.mannWhitneyU(doubleArray22, doubleArray29);
        double[] doubleArray37 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray43 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray48 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double49 = mannWhitneyUTest38.mannWhitneyUTest(doubleArray43, doubleArray48);
        double[] doubleArray56 = new double[] { 0.4385780260809997d, (short) 10, 14.5d, 16.0d, 0.4385780260809997d, 6.0d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray68 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double69 = mannWhitneyUTest58.mannWhitneyUTest(doubleArray63, doubleArray68);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray75 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray80 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double81 = mannWhitneyUTest70.mannWhitneyUTest(doubleArray75, doubleArray80);
        double double82 = mannWhitneyUTest57.mannWhitneyU(doubleArray63, doubleArray75);
        double double83 = mannWhitneyUTest38.mannWhitneyU(doubleArray56, doubleArray63);
        // The following exception was thrown during execution in test generation
        try {
            double double84 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray37, doubleArray63);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6650055421020291d + "'", double23 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.6650055421020291d + "'", double35 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 9.5d + "'", double36 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.6650055421020291d + "'", double49 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 0.4385780260809997d, 10.0d, 14.5d, 16.0d, 0.4385780260809997d, 6.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.6650055421020291d + "'", double69 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.6650055421020291d + "'", double81 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 8.0d + "'", double82 == 8.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 12.0d + "'", double83 == 12.0d);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double12 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray6, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        double double25 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray18);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray31 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray36 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double37 = mannWhitneyUTest26.mannWhitneyUTest(doubleArray31, doubleArray36);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest39 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray44 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray49 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double50 = mannWhitneyUTest39.mannWhitneyUTest(doubleArray44, doubleArray49);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray56 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray61 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double62 = mannWhitneyUTest51.mannWhitneyUTest(doubleArray56, doubleArray61);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray68 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray73 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double74 = mannWhitneyUTest63.mannWhitneyUTest(doubleArray68, doubleArray73);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest75 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray80 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray85 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double86 = mannWhitneyUTest75.mannWhitneyUTest(doubleArray80, doubleArray85);
        double double87 = mannWhitneyUTest51.mannWhitneyU(doubleArray73, doubleArray80);
        double double88 = mannWhitneyUTest38.mannWhitneyU(doubleArray49, doubleArray73);
        double double89 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray36, doubleArray49);
        double[] doubleArray90 = null;
        double[] doubleArray93 = new double[] { 0.5958830905651775d, 0.16491482255330125d };
        // The following exception was thrown during execution in test generation
        try {
            double double94 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray90, doubleArray93);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6650055421020291d + "'", double12 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.0d + "'", double25 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.6650055421020291d + "'", double37 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.6650055421020291d + "'", double50 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.6650055421020291d + "'", double62 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.6650055421020291d + "'", double74 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.6650055421020291d + "'", double86 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 9.5d + "'", double87 == 9.5d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 8.0d + "'", double88 == 8.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 1.0d + "'", double89 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertArrayEquals(doubleArray93, new double[] { 0.5958830905651775d, 0.16491482255330125d }, 1.0E-15);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray14 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double15 = mannWhitneyUTest4.mannWhitneyUTest(doubleArray9, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray26 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double27 = mannWhitneyUTest16.mannWhitneyUTest(doubleArray21, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray38 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double39 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray33, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray50 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double51 = mannWhitneyUTest40.mannWhitneyUTest(doubleArray45, doubleArray50);
        double double52 = mannWhitneyUTest16.mannWhitneyU(doubleArray38, doubleArray45);
        double double53 = mannWhitneyUTest3.mannWhitneyU(doubleArray14, doubleArray45);
        double[] doubleArray56 = new double[] { 0L, 'a' };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray64 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray69 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double70 = mannWhitneyUTest59.mannWhitneyUTest(doubleArray64, doubleArray69);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest71 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray76 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray81 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double82 = mannWhitneyUTest71.mannWhitneyUTest(doubleArray76, doubleArray81);
        double double83 = mannWhitneyUTest58.mannWhitneyU(doubleArray64, doubleArray76);
        double[] doubleArray89 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double90 = mannWhitneyUTest57.mannWhitneyUTest(doubleArray76, doubleArray89);
        double double91 = mannWhitneyUTest3.mannWhitneyU(doubleArray56, doubleArray76);
        double[] doubleArray92 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double93 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray56, doubleArray92);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6650055421020291d + "'", double15 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.6650055421020291d + "'", double27 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.6650055421020291d + "'", double39 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.6650055421020291d + "'", double51 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 9.5d + "'", double52 == 9.5d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 9.5d + "'", double53 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 0.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.6650055421020291d + "'", double70 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.6650055421020291d + "'", double82 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 8.0d + "'", double83 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.8064959405073401d + "'", double90 == 0.8064959405073401d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 4.0d + "'", double91 == 4.0d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { 12.0d, 14.5d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest7 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest8 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray13 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray18 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double19 = mannWhitneyUTest8.mannWhitneyUTest(doubleArray13, doubleArray18);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest20 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray25 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray30 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double31 = mannWhitneyUTest20.mannWhitneyUTest(doubleArray25, doubleArray30);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray42 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double43 = mannWhitneyUTest32.mannWhitneyUTest(doubleArray37, doubleArray42);
        double double44 = mannWhitneyUTest8.mannWhitneyU(doubleArray30, doubleArray37);
        double[] doubleArray51 = new double[] { (short) 100, 100L, (short) 10, 0.0f, 0.8064959405073401d, 9.5d };
        double double52 = mannWhitneyUTest7.mannWhitneyU(doubleArray30, doubleArray51);
        double double53 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray6, doubleArray30);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest55 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray60 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray65 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double66 = mannWhitneyUTest55.mannWhitneyUTest(doubleArray60, doubleArray65);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray77 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double78 = mannWhitneyUTest67.mannWhitneyUTest(doubleArray72, doubleArray77);
        double double79 = mannWhitneyUTest54.mannWhitneyU(doubleArray60, doubleArray72);
        double[] doubleArray85 = new double[] { 5.0d, 10.0f, 10.0f, 8.0d, 0.7962534147376392d };
        double double86 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray60, doubleArray85);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest87 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray92 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray97 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double98 = mannWhitneyUTest87.mannWhitneyUTest(doubleArray92, doubleArray97);
        // The following exception was thrown during execution in test generation
        try {
            double double99 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray85, doubleArray97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 12.0d, 14.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6650055421020291d + "'", double19 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.6650055421020291d + "'", double31 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.6650055421020291d + "'", double43 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 9.5d + "'", double44 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, 100.0d, 10.0d, 0.0d, 0.8064959405073401d, 9.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 14.5d + "'", double52 == 14.5d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.3545394797735012d + "'", double53 == 0.3545394797735012d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.6650055421020291d + "'", double66 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.6650055421020291d + "'", double78 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 8.0d + "'", double79 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 5.0d, 10.0d, 10.0d, 8.0d, 0.7962534147376392d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1.0d + "'", double86 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray97);
        org.junit.Assert.assertArrayEquals(doubleArray97, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 0.6650055421020291d + "'", double98 == 0.6650055421020291d);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray17 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray22 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double23 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray17, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray29 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray34 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double35 = mannWhitneyUTest24.mannWhitneyUTest(doubleArray29, doubleArray34);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest36 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray41 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray46 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double47 = mannWhitneyUTest36.mannWhitneyUTest(doubleArray41, doubleArray46);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest48 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray54 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray59 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double60 = mannWhitneyUTest49.mannWhitneyUTest(doubleArray54, doubleArray59);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray66 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray71 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double72 = mannWhitneyUTest61.mannWhitneyUTest(doubleArray66, doubleArray71);
        double double73 = mannWhitneyUTest48.mannWhitneyU(doubleArray54, doubleArray66);
        double double74 = mannWhitneyUTest24.mannWhitneyUTest(doubleArray46, doubleArray54);
        double double75 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray22, doubleArray46);
        double[] doubleArray76 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest77 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray82 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray87 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double88 = mannWhitneyUTest77.mannWhitneyUTest(doubleArray82, doubleArray87);
        // The following exception was thrown during execution in test generation
        try {
            double double89 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray76, doubleArray82);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6650055421020291d + "'", double23 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.6650055421020291d + "'", double35 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.6650055421020291d + "'", double47 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.6650055421020291d + "'", double60 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.6650055421020291d + "'", double72 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 8.0d + "'", double73 == 8.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.6650055421020291d + "'", double74 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.6650055421020291d + "'", double88 == 0.6650055421020291d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double12 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray6, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray30 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray35 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double36 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray30, doubleArray35);
        double double37 = mannWhitneyUTest1.mannWhitneyU(doubleArray23, doubleArray30);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray43 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray48 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double49 = mannWhitneyUTest38.mannWhitneyUTest(doubleArray43, doubleArray48);
        double[] doubleArray54 = new double[] { 11.0d, (-1L), 0L, (byte) -1 };
        double double55 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray43, doubleArray54);
        double[] doubleArray56 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double57 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray54, doubleArray56);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6650055421020291d + "'", double12 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.6650055421020291d + "'", double36 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 9.5d + "'", double37 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.6650055421020291d + "'", double49 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 11.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.14891467317876583d + "'", double55 == 0.14891467317876583d);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double12 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray6, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray30 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray35 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double36 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray30, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray42 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray47 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double48 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray42, doubleArray47);
        double double49 = mannWhitneyUTest13.mannWhitneyU(doubleArray35, doubleArray42);
        double double50 = mannWhitneyUTest0.mannWhitneyU(doubleArray11, doubleArray35);
        double[] doubleArray53 = new double[] { 8.0d, 0.5958830905651775d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest55 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray60 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray65 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double66 = mannWhitneyUTest55.mannWhitneyUTest(doubleArray60, doubleArray65);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray77 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double78 = mannWhitneyUTest67.mannWhitneyUTest(doubleArray72, doubleArray77);
        double double79 = mannWhitneyUTest54.mannWhitneyU(doubleArray60, doubleArray72);
        double double80 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray53, doubleArray60);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest81 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray86 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray91 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double92 = mannWhitneyUTest81.mannWhitneyUTest(doubleArray86, doubleArray91);
        double[] doubleArray93 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double94 = mannWhitneyUTest0.mannWhitneyU(doubleArray86, doubleArray93);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6650055421020291d + "'", double12 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.6650055421020291d + "'", double36 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.6650055421020291d + "'", double48 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 9.5d + "'", double49 == 9.5d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 8.0d + "'", double50 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 8.0d, 0.5958830905651775d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.6650055421020291d + "'", double66 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.6650055421020291d + "'", double78 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 8.0d + "'", double79 == 8.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.6650055421020291d + "'", double92 == 0.6650055421020291d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double13 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray7, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray31 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray36 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double37 = mannWhitneyUTest26.mannWhitneyUTest(doubleArray31, doubleArray36);
        double double38 = mannWhitneyUTest2.mannWhitneyU(doubleArray24, doubleArray31);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest39 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray50 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double51 = mannWhitneyUTest40.mannWhitneyUTest(doubleArray45, doubleArray50);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray57 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray62 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double63 = mannWhitneyUTest52.mannWhitneyUTest(doubleArray57, doubleArray62);
        double double64 = mannWhitneyUTest39.mannWhitneyU(doubleArray45, doubleArray57);
        double double65 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray31, doubleArray57);
        double[] doubleArray69 = new double[] { 0.8064959405073401d, 8.0d, '#' };
        double double70 = mannWhitneyUTest0.mannWhitneyU(doubleArray57, doubleArray69);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest71 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray76 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray81 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double82 = mannWhitneyUTest71.mannWhitneyUTest(doubleArray76, doubleArray81);
        double[] doubleArray83 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double84 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray76, doubleArray83);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6650055421020291d + "'", double13 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.6650055421020291d + "'", double37 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 9.5d + "'", double38 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.6650055421020291d + "'", double51 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.6650055421020291d + "'", double63 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 8.0d + "'", double64 == 8.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 1.0d + "'", double65 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.8064959405073401d, 8.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 6.0d + "'", double70 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.6650055421020291d + "'", double82 == 0.6650055421020291d);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double13 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray7, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray32 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray37 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double38 = mannWhitneyUTest27.mannWhitneyUTest(doubleArray32, doubleArray37);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest39 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray44 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray49 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double50 = mannWhitneyUTest39.mannWhitneyUTest(doubleArray44, doubleArray49);
        double double51 = mannWhitneyUTest26.mannWhitneyU(doubleArray32, doubleArray44);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray59 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray64 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double65 = mannWhitneyUTest54.mannWhitneyUTest(doubleArray59, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray71 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray76 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double77 = mannWhitneyUTest66.mannWhitneyUTest(doubleArray71, doubleArray76);
        double double78 = mannWhitneyUTest53.mannWhitneyU(doubleArray59, doubleArray71);
        double[] doubleArray84 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double85 = mannWhitneyUTest52.mannWhitneyUTest(doubleArray71, doubleArray84);
        double double86 = mannWhitneyUTest14.mannWhitneyU(doubleArray32, doubleArray71);
        double[] doubleArray93 = new double[] { '#', 0.16491482255330125d, (short) 100, 14.5d, 10.0f, 0.14891467317876583d };
        double double94 = mannWhitneyUTest2.mannWhitneyU(doubleArray71, doubleArray93);
        // The following exception was thrown during execution in test generation
        try {
            double double95 = mannWhitneyUTest0.mannWhitneyU(doubleArray1, doubleArray71);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6650055421020291d + "'", double13 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.6650055421020291d + "'", double38 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.6650055421020291d + "'", double50 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 8.0d + "'", double51 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.6650055421020291d + "'", double65 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.6650055421020291d + "'", double77 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 8.0d + "'", double78 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.8064959405073401d + "'", double85 == 0.8064959405073401d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 8.0d + "'", double86 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertArrayEquals(doubleArray93, new double[] { 35.0d, 0.16491482255330125d, 100.0d, 14.5d, 10.0d, 0.14891467317876583d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 13.5d + "'", double94 == 13.5d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double12 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray6, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray30 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray35 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double36 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray30, doubleArray35);
        double double37 = mannWhitneyUTest1.mannWhitneyU(doubleArray23, doubleArray30);
        double[] doubleArray44 = new double[] { (short) 100, 100L, (short) 10, 0.0f, 0.8064959405073401d, 9.5d };
        double double45 = mannWhitneyUTest0.mannWhitneyU(doubleArray23, doubleArray44);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray56 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double57 = mannWhitneyUTest46.mannWhitneyUTest(doubleArray51, doubleArray56);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest60 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray65 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray70 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double71 = mannWhitneyUTest60.mannWhitneyUTest(doubleArray65, doubleArray70);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest72 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray77 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray82 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double83 = mannWhitneyUTest72.mannWhitneyUTest(doubleArray77, doubleArray82);
        double double84 = mannWhitneyUTest59.mannWhitneyU(doubleArray65, doubleArray77);
        double[] doubleArray90 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double91 = mannWhitneyUTest58.mannWhitneyUTest(doubleArray77, doubleArray90);
        double double92 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray51, doubleArray90);
        double[] doubleArray93 = null;
        double[] doubleArray94 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double double95 = mannWhitneyUTest0.mannWhitneyU(doubleArray93, doubleArray94);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6650055421020291d + "'", double12 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.6650055421020291d + "'", double36 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 9.5d + "'", double37 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 100.0d, 10.0d, 0.0d, 0.8064959405073401d, 9.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 14.5d + "'", double45 == 14.5d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.6650055421020291d + "'", double57 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.6650055421020291d + "'", double71 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.6650055421020291d + "'", double83 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 8.0d + "'", double84 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.8064959405073401d + "'", double91 == 0.8064959405073401d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.8064959405073401d + "'", double92 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertArrayEquals(doubleArray94, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray13 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double14 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray8, doubleArray13);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray26 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double27 = mannWhitneyUTest16.mannWhitneyUTest(doubleArray21, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray38 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double39 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray33, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray50 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double51 = mannWhitneyUTest40.mannWhitneyUTest(doubleArray45, doubleArray50);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray57 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray62 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double63 = mannWhitneyUTest52.mannWhitneyUTest(doubleArray57, doubleArray62);
        double double64 = mannWhitneyUTest28.mannWhitneyU(doubleArray50, doubleArray57);
        double double65 = mannWhitneyUTest15.mannWhitneyU(doubleArray26, doubleArray50);
        double[] doubleArray68 = new double[] { 8.0d, 0.5958830905651775d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest69 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray75 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray80 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double81 = mannWhitneyUTest70.mannWhitneyUTest(doubleArray75, doubleArray80);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest82 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray87 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray92 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double93 = mannWhitneyUTest82.mannWhitneyUTest(doubleArray87, doubleArray92);
        double double94 = mannWhitneyUTest69.mannWhitneyU(doubleArray75, doubleArray87);
        double double95 = mannWhitneyUTest15.mannWhitneyUTest(doubleArray68, doubleArray75);
        double double96 = mannWhitneyUTest2.mannWhitneyU(doubleArray13, doubleArray75);
        // The following exception was thrown during execution in test generation
        try {
            double double97 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray1, doubleArray75);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6650055421020291d + "'", double14 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.6650055421020291d + "'", double27 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.6650055421020291d + "'", double39 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.6650055421020291d + "'", double51 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.6650055421020291d + "'", double63 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 9.5d + "'", double64 == 9.5d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 8.0d + "'", double65 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 8.0d, 0.5958830905651775d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.6650055421020291d + "'", double81 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.6650055421020291d + "'", double93 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 8.0d + "'", double94 == 8.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 1.0d + "'", double95 == 1.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 9.5d + "'", double96 == 9.5d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double13 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray7, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray24 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double25 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray19, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray19);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray38 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double39 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray33, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray50 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double51 = mannWhitneyUTest40.mannWhitneyUTest(doubleArray45, doubleArray50);
        double double52 = mannWhitneyUTest27.mannWhitneyU(doubleArray33, doubleArray45);
        double double53 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray19, doubleArray33);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest55 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray60 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray65 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double66 = mannWhitneyUTest55.mannWhitneyUTest(doubleArray60, doubleArray65);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray77 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double78 = mannWhitneyUTest67.mannWhitneyUTest(doubleArray72, doubleArray77);
        double double79 = mannWhitneyUTest54.mannWhitneyU(doubleArray60, doubleArray72);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest80 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray85 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray90 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double91 = mannWhitneyUTest80.mannWhitneyUTest(doubleArray85, doubleArray90);
        double double92 = mannWhitneyUTest0.mannWhitneyU(doubleArray72, doubleArray90);
        double[] doubleArray93 = null;
        double[] doubleArray94 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double95 = mannWhitneyUTest0.mannWhitneyU(doubleArray93, doubleArray94);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6650055421020291d + "'", double13 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6650055421020291d + "'", double25 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.0d + "'", double26 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.6650055421020291d + "'", double39 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.6650055421020291d + "'", double51 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 8.0d + "'", double52 == 8.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.6650055421020291d + "'", double66 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.6650055421020291d + "'", double78 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 8.0d + "'", double79 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.6650055421020291d + "'", double91 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 9.5d + "'", double92 == 9.5d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        double[] doubleArray3 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray14 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double15 = mannWhitneyUTest4.mannWhitneyUTest(doubleArray9, doubleArray14);
        double[] doubleArray19 = new double[] { 100, (short) 1, 0.6547208460185768d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest20 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest21 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest22 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray27 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray32 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double33 = mannWhitneyUTest22.mannWhitneyUTest(doubleArray27, doubleArray32);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest34 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray39 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray44 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double45 = mannWhitneyUTest34.mannWhitneyUTest(doubleArray39, doubleArray44);
        double double46 = mannWhitneyUTest21.mannWhitneyU(doubleArray27, doubleArray39);
        double[] doubleArray52 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double53 = mannWhitneyUTest20.mannWhitneyUTest(doubleArray39, doubleArray52);
        double[] doubleArray58 = new double[] { (-1.0d), 1, (short) -1, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray64 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray69 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double70 = mannWhitneyUTest59.mannWhitneyUTest(doubleArray64, doubleArray69);
        double double71 = mannWhitneyUTest20.mannWhitneyUTest(doubleArray58, doubleArray64);
        double double72 = mannWhitneyUTest4.mannWhitneyUTest(doubleArray19, doubleArray64);
        // The following exception was thrown during execution in test generation
        try {
            double double73 = mannWhitneyUTest2.mannWhitneyU(doubleArray3, doubleArray64);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6650055421020291d + "'", double15 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 1.0d, 0.6547208460185768d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.6650055421020291d + "'", double33 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.6650055421020291d + "'", double45 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 8.0d + "'", double46 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.8064959405073401d + "'", double53 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { (-1.0d), 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.6650055421020291d + "'", double70 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.47048642205878954d + "'", double71 == 0.47048642205878954d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.5958830905651775d + "'", double72 == 0.5958830905651775d);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double12 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray6, doubleArray11);
        double[] doubleArray18 = new double[] { 10.0f, (short) 10, 0, 0.16491482255330125d, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest19 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray24 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray29 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double30 = mannWhitneyUTest19.mannWhitneyUTest(doubleArray24, doubleArray29);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray36 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray41 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double42 = mannWhitneyUTest31.mannWhitneyUTest(doubleArray36, doubleArray41);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray54 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double55 = mannWhitneyUTest44.mannWhitneyUTest(doubleArray49, doubleArray54);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest56 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray61 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray66 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double67 = mannWhitneyUTest56.mannWhitneyUTest(doubleArray61, doubleArray66);
        double double68 = mannWhitneyUTest43.mannWhitneyU(doubleArray49, doubleArray61);
        double double69 = mannWhitneyUTest19.mannWhitneyUTest(doubleArray41, doubleArray49);
        double double70 = mannWhitneyUTest1.mannWhitneyU(doubleArray18, doubleArray41);
        double[] doubleArray74 = new double[] { 10.0f, '4', 9.5d };
        double double75 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray18, doubleArray74);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest76 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray81 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray86 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double87 = mannWhitneyUTest76.mannWhitneyUTest(doubleArray81, doubleArray86);
        double[] doubleArray88 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double89 = mannWhitneyUTest0.mannWhitneyU(doubleArray86, doubleArray88);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6650055421020291d + "'", double12 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 10.0d, 0.0d, 0.16491482255330125d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.6650055421020291d + "'", double30 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.6650055421020291d + "'", double42 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.6650055421020291d + "'", double55 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.6650055421020291d + "'", double67 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 8.0d + "'", double68 == 8.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.6650055421020291d + "'", double69 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 11.0d + "'", double70 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 10.0d, 52.0d, 9.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.6547208460185768d + "'", double75 == 0.6547208460185768d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.6650055421020291d + "'", double87 == 0.6650055421020291d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray4 = new double[] { 12.0d, 14.5d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest6 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray11 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray16 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double17 = mannWhitneyUTest6.mannWhitneyUTest(doubleArray11, doubleArray16);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray23 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray28 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double29 = mannWhitneyUTest18.mannWhitneyUTest(doubleArray23, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray40 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double41 = mannWhitneyUTest30.mannWhitneyUTest(doubleArray35, doubleArray40);
        double double42 = mannWhitneyUTest6.mannWhitneyU(doubleArray28, doubleArray35);
        double[] doubleArray49 = new double[] { (short) 100, 100L, (short) 10, 0.0f, 0.8064959405073401d, 9.5d };
        double double50 = mannWhitneyUTest5.mannWhitneyU(doubleArray28, doubleArray49);
        double double51 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray4, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray58 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray63 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double64 = mannWhitneyUTest53.mannWhitneyUTest(doubleArray58, doubleArray63);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest65 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray70 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray75 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double76 = mannWhitneyUTest65.mannWhitneyUTest(doubleArray70, doubleArray75);
        double double77 = mannWhitneyUTest52.mannWhitneyU(doubleArray58, doubleArray70);
        double[] doubleArray83 = new double[] { 5.0d, 10.0f, 10.0f, 8.0d, 0.7962534147376392d };
        double double84 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray58, doubleArray83);
        double[] doubleArray85 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double86 = mannWhitneyUTest0.mannWhitneyU(doubleArray58, doubleArray85);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 12.0d, 14.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6650055421020291d + "'", double17 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.6650055421020291d + "'", double29 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.6650055421020291d + "'", double41 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 9.5d + "'", double42 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, 100.0d, 10.0d, 0.0d, 0.8064959405073401d, 9.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 14.5d + "'", double50 == 14.5d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.3545394797735012d + "'", double51 == 0.3545394797735012d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.6650055421020291d + "'", double64 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.6650055421020291d + "'", double76 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 8.0d + "'", double77 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 5.0d, 10.0d, 10.0d, 8.0d, 0.7962534147376392d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.0d + "'", double84 == 1.0d);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray13 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double14 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray8, doubleArray13);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray25 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double26 = mannWhitneyUTest15.mannWhitneyUTest(doubleArray20, doubleArray25);
        double double27 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray20);
        double[] doubleArray34 = new double[] { 10.0f, 100.0f, 10.0d, (byte) -1, 10, 0.0d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest35 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray40 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray45 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double46 = mannWhitneyUTest35.mannWhitneyUTest(doubleArray40, doubleArray45);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray57 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double58 = mannWhitneyUTest47.mannWhitneyUTest(doubleArray52, doubleArray57);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray64 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray69 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double70 = mannWhitneyUTest59.mannWhitneyUTest(doubleArray64, doubleArray69);
        double double71 = mannWhitneyUTest35.mannWhitneyU(doubleArray57, doubleArray64);
        double double72 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray34, doubleArray64);
        // The following exception was thrown during execution in test generation
        try {
            double double73 = mannWhitneyUTest0.mannWhitneyU(doubleArray1, doubleArray34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6650055421020291d + "'", double14 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6650055421020291d + "'", double26 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.0d + "'", double27 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d), 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.6650055421020291d + "'", double46 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.6650055421020291d + "'", double58 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.6650055421020291d + "'", double70 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 9.5d + "'", double71 == 9.5d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.7491191330005953d + "'", double72 == 0.7491191330005953d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray17 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray22 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double23 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray17, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray29 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray34 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double35 = mannWhitneyUTest24.mannWhitneyUTest(doubleArray29, doubleArray34);
        double double36 = mannWhitneyUTest0.mannWhitneyU(doubleArray22, doubleArray29);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray42 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray47 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double48 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray42, doubleArray47);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray56 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray61 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double62 = mannWhitneyUTest51.mannWhitneyUTest(doubleArray56, doubleArray61);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray68 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray73 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double74 = mannWhitneyUTest63.mannWhitneyUTest(doubleArray68, doubleArray73);
        double double75 = mannWhitneyUTest50.mannWhitneyU(doubleArray56, doubleArray68);
        double[] doubleArray81 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double82 = mannWhitneyUTest49.mannWhitneyUTest(doubleArray68, doubleArray81);
        double[] doubleArray88 = new double[] { (-1), 6.0d, 10.0f, 100L, 100L };
        double double89 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray68, doubleArray88);
        double[] doubleArray96 = new double[] { 17.0d, 0.6985353583033387d, 4.0d, (short) 100, 0, 16.0d };
        double double97 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray88, doubleArray96);
        java.lang.Class<?> wildcardClass98 = mannWhitneyUTest0.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6650055421020291d + "'", double23 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.6650055421020291d + "'", double35 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 9.5d + "'", double36 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.6650055421020291d + "'", double48 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.6650055421020291d + "'", double62 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.6650055421020291d + "'", double74 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 8.0d + "'", double75 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.8064959405073401d + "'", double82 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { (-1.0d), 6.0d, 10.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.8064959405073401d + "'", double89 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertArrayEquals(doubleArray96, new double[] { 17.0d, 0.6985353583033387d, 4.0d, 100.0d, 0.0d, 16.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.7150006546880893d + "'", double97 == 0.7150006546880893d);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray17 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray22 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double23 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray17, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray30 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray35 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double36 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray30, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray42 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray47 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double48 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray42, doubleArray47);
        double double49 = mannWhitneyUTest24.mannWhitneyU(doubleArray30, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray57 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray62 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double63 = mannWhitneyUTest52.mannWhitneyUTest(doubleArray57, doubleArray62);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest64 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray69 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray74 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double75 = mannWhitneyUTest64.mannWhitneyUTest(doubleArray69, doubleArray74);
        double double76 = mannWhitneyUTest51.mannWhitneyU(doubleArray57, doubleArray69);
        double[] doubleArray82 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double83 = mannWhitneyUTest50.mannWhitneyUTest(doubleArray69, doubleArray82);
        double double84 = mannWhitneyUTest12.mannWhitneyU(doubleArray30, doubleArray69);
        double[] doubleArray91 = new double[] { '#', 0.16491482255330125d, (short) 100, 14.5d, 10.0f, 0.14891467317876583d };
        double double92 = mannWhitneyUTest0.mannWhitneyU(doubleArray69, doubleArray91);
        double[] doubleArray93 = null;
        double[] doubleArray94 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double95 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray93, doubleArray94);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6650055421020291d + "'", double23 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.6650055421020291d + "'", double36 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.6650055421020291d + "'", double48 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 8.0d + "'", double49 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.6650055421020291d + "'", double63 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.6650055421020291d + "'", double75 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 8.0d + "'", double76 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.8064959405073401d + "'", double83 == 0.8064959405073401d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 8.0d + "'", double84 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { 35.0d, 0.16491482255330125d, 100.0d, 14.5d, 10.0d, 0.14891467317876583d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 13.5d + "'", double92 == 13.5d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double12 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray6, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray23 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double24 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray18, doubleArray23);
        double double25 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray18);
        double[] doubleArray32 = new double[] { 10, 0.0f, (byte) 10, (byte) 10, (short) -1, (byte) -1 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest33 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray43 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double44 = mannWhitneyUTest33.mannWhitneyUTest(doubleArray38, doubleArray43);
        double double45 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray32, doubleArray43);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray56 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double57 = mannWhitneyUTest46.mannWhitneyUTest(doubleArray51, doubleArray56);
        double[] doubleArray58 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double59 = mannWhitneyUTest0.mannWhitneyU(doubleArray51, doubleArray58);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6650055421020291d + "'", double12 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6650055421020291d + "'", double24 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.0d + "'", double25 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d, 0.0d, 10.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.6650055421020291d + "'", double44 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.5940323405990415d + "'", double45 == 0.5940323405990415d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.6650055421020291d + "'", double57 == 0.6650055421020291d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray17 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray22 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double23 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray17, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray29 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray34 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double35 = mannWhitneyUTest24.mannWhitneyUTest(doubleArray29, doubleArray34);
        double double36 = mannWhitneyUTest0.mannWhitneyU(doubleArray22, doubleArray29);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray42 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray47 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double48 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray42, doubleArray47);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray56 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray61 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double62 = mannWhitneyUTest51.mannWhitneyUTest(doubleArray56, doubleArray61);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray68 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray73 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double74 = mannWhitneyUTest63.mannWhitneyUTest(doubleArray68, doubleArray73);
        double double75 = mannWhitneyUTest50.mannWhitneyU(doubleArray56, doubleArray68);
        double[] doubleArray81 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double82 = mannWhitneyUTest49.mannWhitneyUTest(doubleArray68, doubleArray81);
        double[] doubleArray88 = new double[] { (-1), 6.0d, 10.0f, 100L, 100L };
        double double89 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray68, doubleArray88);
        double[] doubleArray96 = new double[] { 17.0d, 0.6985353583033387d, 4.0d, (short) 100, 0, 16.0d };
        double double97 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray88, doubleArray96);
        java.lang.Class<?> wildcardClass98 = doubleArray96.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6650055421020291d + "'", double23 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.6650055421020291d + "'", double35 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 9.5d + "'", double36 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.6650055421020291d + "'", double48 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.6650055421020291d + "'", double62 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.6650055421020291d + "'", double74 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 8.0d + "'", double75 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.8064959405073401d + "'", double82 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { (-1.0d), 6.0d, 10.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.8064959405073401d + "'", double89 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertArrayEquals(doubleArray96, new double[] { 17.0d, 0.6985353583033387d, 4.0d, 100.0d, 0.0d, 16.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.7150006546880893d + "'", double97 == 0.7150006546880893d);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        double[] doubleArray12 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray25 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double26 = mannWhitneyUTest15.mannWhitneyUTest(doubleArray20, doubleArray25);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray32 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray37 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double38 = mannWhitneyUTest27.mannWhitneyUTest(doubleArray32, doubleArray37);
        double double39 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray32);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest41 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray46 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray51 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double52 = mannWhitneyUTest41.mannWhitneyUTest(doubleArray46, doubleArray51);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray58 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray63 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double64 = mannWhitneyUTest53.mannWhitneyUTest(doubleArray58, doubleArray63);
        double double65 = mannWhitneyUTest40.mannWhitneyU(doubleArray46, doubleArray58);
        double[] doubleArray72 = new double[] { 10, 0.0f, (byte) 10, (byte) 10, (short) -1, (byte) -1 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray78 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray83 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double84 = mannWhitneyUTest73.mannWhitneyUTest(doubleArray78, doubleArray83);
        double double85 = mannWhitneyUTest40.mannWhitneyUTest(doubleArray72, doubleArray83);
        double double86 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray32, doubleArray83);
        // The following exception was thrown during execution in test generation
        try {
            double double87 = mannWhitneyUTest0.mannWhitneyU(doubleArray12, doubleArray83);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6650055421020291d + "'", double26 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.6650055421020291d + "'", double38 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 8.0d + "'", double39 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.6650055421020291d + "'", double52 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.6650055421020291d + "'", double64 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 8.0d + "'", double65 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 10.0d, 0.0d, 10.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.6650055421020291d + "'", double84 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.5940323405990415d + "'", double85 == 0.5940323405990415d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.6650055421020291d + "'", double86 == 0.6650055421020291d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray5 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray10 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double11 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray5, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray17 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray22 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double23 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray17, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray29 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray34 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double35 = mannWhitneyUTest24.mannWhitneyUTest(doubleArray29, doubleArray34);
        double double36 = mannWhitneyUTest0.mannWhitneyU(doubleArray22, doubleArray29);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray40 = new double[] { 12.0d, 14.5d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest41 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray47 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray52 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double53 = mannWhitneyUTest42.mannWhitneyUTest(doubleArray47, doubleArray52);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray59 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray64 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double65 = mannWhitneyUTest54.mannWhitneyUTest(doubleArray59, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray71 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray76 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double77 = mannWhitneyUTest66.mannWhitneyUTest(doubleArray71, doubleArray76);
        double double78 = mannWhitneyUTest42.mannWhitneyU(doubleArray64, doubleArray71);
        double[] doubleArray85 = new double[] { (short) 100, 100L, (short) 10, 0.0f, 0.8064959405073401d, 9.5d };
        double double86 = mannWhitneyUTest41.mannWhitneyU(doubleArray64, doubleArray85);
        double double87 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray40, doubleArray64);
        double[] doubleArray88 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double89 = mannWhitneyUTest0.mannWhitneyU(doubleArray64, doubleArray88);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6650055421020291d + "'", double11 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6650055421020291d + "'", double23 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.6650055421020291d + "'", double35 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 9.5d + "'", double36 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 12.0d, 14.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.6650055421020291d + "'", double53 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.6650055421020291d + "'", double65 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.6650055421020291d + "'", double77 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 9.5d + "'", double78 == 9.5d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 100.0d, 100.0d, 10.0d, 0.0d, 0.8064959405073401d, 9.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 14.5d + "'", double86 == 14.5d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.3545394797735012d + "'", double87 == 0.3545394797735012d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray10 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray15 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double16 = mannWhitneyUTest5.mannWhitneyUTest(doubleArray10, doubleArray15);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray22 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray27 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double28 = mannWhitneyUTest17.mannWhitneyUTest(doubleArray22, doubleArray27);
        double double29 = mannWhitneyUTest4.mannWhitneyU(doubleArray10, doubleArray22);
        double[] doubleArray35 = new double[] { 0.2864220227778589d, 1.0d, 0, 10.0d, 0.16491482255330125d };
        double double36 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray22, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray42 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray47 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double48 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray42, doubleArray47);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray55 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray60 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double61 = mannWhitneyUTest50.mannWhitneyUTest(doubleArray55, doubleArray60);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest62 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray67 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray72 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double73 = mannWhitneyUTest62.mannWhitneyUTest(doubleArray67, doubleArray72);
        double double74 = mannWhitneyUTest49.mannWhitneyU(doubleArray55, doubleArray67);
        double[] doubleArray81 = new double[] { 10, 0.0f, (byte) 10, (byte) 10, (short) -1, (byte) -1 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest82 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray87 = new double[] { (short) 100, '4', (byte) 0, 0.0f };
        double[] doubleArray92 = new double[] { (-1), 1.0d, 10.0d, '4' };
        double double93 = mannWhitneyUTest82.mannWhitneyUTest(doubleArray87, doubleArray92);
        double double94 = mannWhitneyUTest49.mannWhitneyUTest(doubleArray81, doubleArray92);
        double double95 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray47, doubleArray92);
        double[] doubleArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double97 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray47, doubleArray96);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6650055421020291d + "'", double16 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.6650055421020291d + "'", double28 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 8.0d + "'", double29 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 0.2864220227778589d, 1.0d, 0.0d, 10.0d, 0.16491482255330125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.8064959405073401d + "'", double36 == 0.8064959405073401d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.6650055421020291d + "'", double48 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.6650055421020291d + "'", double61 == 0.6650055421020291d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.6650055421020291d + "'", double73 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 8.0d + "'", double74 == 8.0d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 10.0d, 0.0d, 10.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { 100.0d, 52.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { (-1.0d), 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.6650055421020291d + "'", double93 == 0.6650055421020291d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.5940323405990415d + "'", double94 == 0.5940323405990415d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 1.0d + "'", double95 == 1.0d);
    }
}

