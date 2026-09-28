package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
            System.out.format("%n%s%n", "RegressionTest1.test501");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(87.51571287488893d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.117489188733899d + "'", double2 == 12.117489188733899d);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = null;
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger6, (long) 0);
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, bigInteger8);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger8);
        java.math.BigInteger bigInteger11 = null;
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger11, (long) 0);
        java.math.BigInteger bigInteger14 = null;
        java.math.BigInteger bigInteger16 = org.apache.commons.math.util.MathUtils.pow(bigInteger14, (long) 0);
        java.math.BigInteger bigInteger17 = org.apache.commons.math.util.MathUtils.pow(bigInteger13, bigInteger16);
        java.math.BigInteger bigInteger18 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger16);
        java.math.BigInteger bigInteger19 = null;
        java.math.BigInteger bigInteger21 = org.apache.commons.math.util.MathUtils.pow(bigInteger19, (long) 0);
        java.math.BigInteger bigInteger22 = null;
        java.math.BigInteger bigInteger24 = org.apache.commons.math.util.MathUtils.pow(bigInteger22, (long) 0);
        java.math.BigInteger bigInteger25 = org.apache.commons.math.util.MathUtils.pow(bigInteger21, bigInteger24);
        java.math.BigInteger bigInteger27 = org.apache.commons.math.util.MathUtils.pow(bigInteger21, (long) 32);
        java.math.BigInteger bigInteger29 = org.apache.commons.math.util.MathUtils.pow(bigInteger21, (long) 'a');
        java.math.BigInteger bigInteger30 = null;
        java.math.BigInteger bigInteger32 = org.apache.commons.math.util.MathUtils.pow(bigInteger30, (long) 0);
        java.math.BigInteger bigInteger33 = null;
        java.math.BigInteger bigInteger35 = org.apache.commons.math.util.MathUtils.pow(bigInteger33, (long) 0);
        java.math.BigInteger bigInteger36 = org.apache.commons.math.util.MathUtils.pow(bigInteger32, bigInteger35);
        java.math.BigInteger bigInteger37 = null;
        java.math.BigInteger bigInteger39 = org.apache.commons.math.util.MathUtils.pow(bigInteger37, (long) 0);
        java.math.BigInteger bigInteger40 = null;
        java.math.BigInteger bigInteger42 = org.apache.commons.math.util.MathUtils.pow(bigInteger40, (long) 0);
        java.math.BigInteger bigInteger43 = org.apache.commons.math.util.MathUtils.pow(bigInteger39, bigInteger42);
        java.math.BigInteger bigInteger44 = org.apache.commons.math.util.MathUtils.pow(bigInteger35, bigInteger39);
        java.math.BigInteger bigInteger45 = null;
        java.math.BigInteger bigInteger47 = org.apache.commons.math.util.MathUtils.pow(bigInteger45, (long) 0);
        java.math.BigInteger bigInteger48 = null;
        java.math.BigInteger bigInteger50 = org.apache.commons.math.util.MathUtils.pow(bigInteger48, (long) 0);
        java.math.BigInteger bigInteger51 = null;
        java.math.BigInteger bigInteger53 = org.apache.commons.math.util.MathUtils.pow(bigInteger51, (long) 0);
        java.math.BigInteger bigInteger54 = org.apache.commons.math.util.MathUtils.pow(bigInteger50, bigInteger53);
        java.math.BigInteger bigInteger55 = org.apache.commons.math.util.MathUtils.pow(bigInteger47, bigInteger53);
        java.math.BigInteger bigInteger56 = org.apache.commons.math.util.MathUtils.pow(bigInteger35, bigInteger55);
        java.math.BigInteger bigInteger58 = org.apache.commons.math.util.MathUtils.pow(bigInteger35, (long) (byte) 100);
        java.math.BigInteger bigInteger59 = org.apache.commons.math.util.MathUtils.pow(bigInteger29, bigInteger35);
        java.math.BigInteger bigInteger60 = null;
        java.math.BigInteger bigInteger62 = org.apache.commons.math.util.MathUtils.pow(bigInteger60, (long) 0);
        java.math.BigInteger bigInteger63 = null;
        java.math.BigInteger bigInteger65 = org.apache.commons.math.util.MathUtils.pow(bigInteger63, (long) 0);
        java.math.BigInteger bigInteger66 = org.apache.commons.math.util.MathUtils.pow(bigInteger62, bigInteger65);
        java.math.BigInteger bigInteger68 = org.apache.commons.math.util.MathUtils.pow(bigInteger66, (long) 0);
        java.math.BigInteger bigInteger69 = org.apache.commons.math.util.MathUtils.pow(bigInteger29, bigInteger68);
        java.math.BigInteger bigInteger70 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, bigInteger68);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(bigInteger70);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-10), (-31000));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(6398919491949953025L, 4104L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6398919491949948921L + "'", long2 == 6398919491949948921L);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) 32);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) 'a');
        java.math.BigInteger bigInteger11 = null;
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger11, (long) 0);
        java.math.BigInteger bigInteger14 = null;
        java.math.BigInteger bigInteger16 = org.apache.commons.math.util.MathUtils.pow(bigInteger14, (long) 0);
        java.math.BigInteger bigInteger17 = org.apache.commons.math.util.MathUtils.pow(bigInteger13, bigInteger16);
        java.math.BigInteger bigInteger18 = null;
        java.math.BigInteger bigInteger20 = org.apache.commons.math.util.MathUtils.pow(bigInteger18, (long) 0);
        java.math.BigInteger bigInteger21 = null;
        java.math.BigInteger bigInteger23 = org.apache.commons.math.util.MathUtils.pow(bigInteger21, (long) 0);
        java.math.BigInteger bigInteger24 = org.apache.commons.math.util.MathUtils.pow(bigInteger20, bigInteger23);
        java.math.BigInteger bigInteger25 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, bigInteger20);
        java.math.BigInteger bigInteger26 = null;
        java.math.BigInteger bigInteger28 = org.apache.commons.math.util.MathUtils.pow(bigInteger26, (long) 0);
        java.math.BigInteger bigInteger29 = null;
        java.math.BigInteger bigInteger31 = org.apache.commons.math.util.MathUtils.pow(bigInteger29, (long) 0);
        java.math.BigInteger bigInteger32 = null;
        java.math.BigInteger bigInteger34 = org.apache.commons.math.util.MathUtils.pow(bigInteger32, (long) 0);
        java.math.BigInteger bigInteger35 = org.apache.commons.math.util.MathUtils.pow(bigInteger31, bigInteger34);
        java.math.BigInteger bigInteger36 = org.apache.commons.math.util.MathUtils.pow(bigInteger28, bigInteger34);
        java.math.BigInteger bigInteger37 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, bigInteger36);
        java.math.BigInteger bigInteger39 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, (long) (byte) 100);
        java.math.BigInteger bigInteger40 = org.apache.commons.math.util.MathUtils.pow(bigInteger10, bigInteger16);
        java.math.BigInteger bigInteger42 = org.apache.commons.math.util.MathUtils.pow(bigInteger40, 4);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger42);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) 3205L, (double) 2146434962L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 99.99999999999999d };
        double[] doubleArray14 = new double[] { 2.2250738585072014E-308d };
        double double15 = org.apache.commons.math.util.MathUtils.distance(doubleArray12, doubleArray14);
        double[] doubleArray17 = new double[] { 99.99999999999999d };
        double[] doubleArray19 = new double[] { 2.2250738585072014E-308d };
        double double20 = org.apache.commons.math.util.MathUtils.distance(doubleArray17, doubleArray19);
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray19);
        double[] doubleArray23 = new double[] { 1.0d };
        double[] doubleArray25 = new double[] { 99.99999999999999d };
        double[] doubleArray27 = new double[] { 2.2250738585072014E-308d };
        double double28 = org.apache.commons.math.util.MathUtils.distance(doubleArray25, doubleArray27);
        double[] doubleArray30 = new double[] { 99.99999999999999d };
        double[] doubleArray32 = new double[] { 2.2250738585072014E-308d };
        double double33 = org.apache.commons.math.util.MathUtils.distance(doubleArray30, doubleArray32);
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray32);
        boolean boolean35 = org.apache.commons.math.util.MathUtils.equals(doubleArray23, doubleArray32);
        boolean boolean36 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray23, 0.0d);
        double double39 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray38);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray8, (double) (short) 0);
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray41);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 99.99999999999999d + "'", double15 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 99.99999999999999d + "'", double20 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 99.99999999999999d + "'", double28 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 99.99999999999999d + "'", double33 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 31 + "'", int42 == 31);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1048576, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) 32);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) 'a');
        java.math.BigInteger bigInteger11 = null;
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger11, (long) 0);
        java.math.BigInteger bigInteger14 = null;
        java.math.BigInteger bigInteger16 = org.apache.commons.math.util.MathUtils.pow(bigInteger14, (long) 0);
        java.math.BigInteger bigInteger17 = org.apache.commons.math.util.MathUtils.pow(bigInteger13, bigInteger16);
        java.math.BigInteger bigInteger18 = null;
        java.math.BigInteger bigInteger20 = org.apache.commons.math.util.MathUtils.pow(bigInteger18, (long) 0);
        java.math.BigInteger bigInteger21 = null;
        java.math.BigInteger bigInteger23 = org.apache.commons.math.util.MathUtils.pow(bigInteger21, (long) 0);
        java.math.BigInteger bigInteger24 = org.apache.commons.math.util.MathUtils.pow(bigInteger20, bigInteger23);
        java.math.BigInteger bigInteger25 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, bigInteger20);
        java.math.BigInteger bigInteger26 = null;
        java.math.BigInteger bigInteger28 = org.apache.commons.math.util.MathUtils.pow(bigInteger26, (long) 0);
        java.math.BigInteger bigInteger29 = null;
        java.math.BigInteger bigInteger31 = org.apache.commons.math.util.MathUtils.pow(bigInteger29, (long) 0);
        java.math.BigInteger bigInteger32 = null;
        java.math.BigInteger bigInteger34 = org.apache.commons.math.util.MathUtils.pow(bigInteger32, (long) 0);
        java.math.BigInteger bigInteger35 = org.apache.commons.math.util.MathUtils.pow(bigInteger31, bigInteger34);
        java.math.BigInteger bigInteger36 = org.apache.commons.math.util.MathUtils.pow(bigInteger28, bigInteger34);
        java.math.BigInteger bigInteger37 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, bigInteger36);
        java.math.BigInteger bigInteger39 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, (long) (byte) 100);
        java.math.BigInteger bigInteger40 = org.apache.commons.math.util.MathUtils.pow(bigInteger10, bigInteger16);
        java.math.BigInteger bigInteger42 = org.apache.commons.math.util.MathUtils.pow(bigInteger10, (int) (short) 100);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger42);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) 32);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) 'a');
        java.math.BigInteger bigInteger11 = null;
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger11, (long) 0);
        java.math.BigInteger bigInteger14 = null;
        java.math.BigInteger bigInteger16 = org.apache.commons.math.util.MathUtils.pow(bigInteger14, (long) 0);
        java.math.BigInteger bigInteger17 = org.apache.commons.math.util.MathUtils.pow(bigInteger13, bigInteger16);
        java.math.BigInteger bigInteger18 = null;
        java.math.BigInteger bigInteger20 = org.apache.commons.math.util.MathUtils.pow(bigInteger18, (long) 0);
        java.math.BigInteger bigInteger21 = null;
        java.math.BigInteger bigInteger23 = org.apache.commons.math.util.MathUtils.pow(bigInteger21, (long) 0);
        java.math.BigInteger bigInteger24 = org.apache.commons.math.util.MathUtils.pow(bigInteger20, bigInteger23);
        java.math.BigInteger bigInteger25 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, bigInteger20);
        java.math.BigInteger bigInteger26 = null;
        java.math.BigInteger bigInteger28 = org.apache.commons.math.util.MathUtils.pow(bigInteger26, (long) 0);
        java.math.BigInteger bigInteger29 = null;
        java.math.BigInteger bigInteger31 = org.apache.commons.math.util.MathUtils.pow(bigInteger29, (long) 0);
        java.math.BigInteger bigInteger32 = null;
        java.math.BigInteger bigInteger34 = org.apache.commons.math.util.MathUtils.pow(bigInteger32, (long) 0);
        java.math.BigInteger bigInteger35 = org.apache.commons.math.util.MathUtils.pow(bigInteger31, bigInteger34);
        java.math.BigInteger bigInteger36 = org.apache.commons.math.util.MathUtils.pow(bigInteger28, bigInteger34);
        java.math.BigInteger bigInteger37 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, bigInteger36);
        java.math.BigInteger bigInteger39 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, (long) (byte) 100);
        java.math.BigInteger bigInteger40 = org.apache.commons.math.util.MathUtils.pow(bigInteger10, bigInteger16);
        java.math.BigInteger bigInteger42 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, (long) (short) 1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger42);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-913924536), 1000);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 1.0d };
        double[] doubleArray14 = new double[] { 99.99999999999999d };
        double[] doubleArray16 = new double[] { 2.2250738585072014E-308d };
        double double17 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray16);
        double[] doubleArray19 = new double[] { 99.99999999999999d };
        double[] doubleArray21 = new double[] { 2.2250738585072014E-308d };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray19, doubleArray21);
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray21);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray21);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray8, doubleArray12);
        double[] doubleArray27 = new double[] { 99.99999999999999d };
        double[] doubleArray29 = new double[] { 2.2250738585072014E-308d };
        double double30 = org.apache.commons.math.util.MathUtils.distance(doubleArray27, doubleArray29);
        double double31 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray8, doubleArray27);
        double[] doubleArray33 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray8, 6.283185307179586d);
        int int34 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.99999999999999d + "'", double17 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 99.99999999999999d + "'", double30 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 99.99999999999999d + "'", double31 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 6.283185307179586d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1048607 + "'", int34 == 1048607);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger7, (long) 0);
        java.math.BigInteger bigInteger10 = null;
        java.math.BigInteger bigInteger12 = org.apache.commons.math.util.MathUtils.pow(bigInteger10, (long) 0);
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger9, bigInteger12);
        java.math.BigInteger bigInteger14 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, bigInteger9);
        java.math.BigInteger bigInteger16 = org.apache.commons.math.util.MathUtils.pow(bigInteger9, 9700);
        java.math.BigInteger bigInteger18 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, 194);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger18);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 913924536);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 100, (int) (short) 0, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 2, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        double double1 = org.apache.commons.math.util.MathUtils.sign(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(1079574498L, 6627890308806496801L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6627890309886071299L + "'", long2 == 6627890309886071299L);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 358, (double) 1000, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray16 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double17 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray16);
        int[] intArray22 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray27 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double28 = org.apache.commons.math.util.MathUtils.distance(intArray22, intArray27);
        int[] intArray33 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray38 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double39 = org.apache.commons.math.util.MathUtils.distance(intArray33, intArray38);
        int int40 = org.apache.commons.math.util.MathUtils.distanceInf(intArray22, intArray33);
        int int41 = org.apache.commons.math.util.MathUtils.distanceInf(intArray4, intArray33);
        int[] intArray46 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray51 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double52 = org.apache.commons.math.util.MathUtils.distance(intArray46, intArray51);
        int int53 = org.apache.commons.math.util.MathUtils.distanceInf(intArray33, intArray51);
        int[] intArray54 = new int[] {};
        int[] intArray59 = new int[] { (short) 1, 100, ' ', 'a' };
        int int60 = org.apache.commons.math.util.MathUtils.distanceInf(intArray54, intArray59);
        int[] intArray61 = new int[] {};
        int[] intArray66 = new int[] { (short) 1, 100, ' ', 'a' };
        int int67 = org.apache.commons.math.util.MathUtils.distanceInf(intArray61, intArray66);
        int int68 = org.apache.commons.math.util.MathUtils.distance1(intArray54, intArray61);
        // The following exception was thrown during execution in test generation
        try {
            double double69 = org.apache.commons.math.util.MathUtils.distance(intArray33, intArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 87.51571287488893d + "'", double17 == 87.51571287488893d);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 129.57623238850556d + "'", double28 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 129.57623238850556d + "'", double39 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 129.57623238850556d + "'", double52 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 96 + "'", int53 == 96);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] {});
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] {});
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(913924536);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7943316732184193E10d + "'", double1 == 1.7943316732184193E10d);
    }
}

