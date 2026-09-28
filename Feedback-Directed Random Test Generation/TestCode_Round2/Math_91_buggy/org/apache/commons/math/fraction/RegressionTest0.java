package org.apache.commons.math.fraction;

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
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = org.apache.commons.math.fraction.Fraction.ZERO;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction4 = fraction2.divide(fraction3);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        byte byte3 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(100.0d, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        float float5 = fraction4.floatValue();
        java.lang.Class<?> wildcardClass6 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-100.0f) + "'", float5 == (-100.0f));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.reciprocal();
        double double4 = fraction1.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long3 = fraction2.longValue();
        short short4 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction1.doubleValue();
        short short4 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = fraction2.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 0L, 10.0d, 0);
        int int4 = fraction3.getDenominator();
        byte byte5 = fraction3.byteValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction1.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.reciprocal();
        short short5 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean4 = fraction2.equals((java.lang.Object) (short) 0);
        org.apache.commons.math.fraction.Fraction fraction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction6 = fraction2.multiply(fraction5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1.0f, 0.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        int int7 = fraction1.compareTo(fraction2);
        java.lang.Class<?> wildcardClass8 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) 'a', (int) (short) 1);
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.add(fraction3);
        byte byte5 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 2 + "'", byte5 == (byte) 2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        int int6 = fraction3.intValue();
        short short7 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        byte byte2 = fraction1.byteValue();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction1.doubleValue();
        java.lang.Class<?> wildcardClass4 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 0.0f, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        short short3 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.add(fraction3);
        short short5 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.reciprocal();
        byte byte5 = fraction3.byteValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -100 + "'", byte5 == (byte) -100);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int4 = fraction1.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction7 = fraction5.divide(fraction6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = fraction2.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int4 = fraction1.compareTo(fraction3);
        byte byte5 = fraction3.byteValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (byte) 97, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 97 to fraction (9,223,372,036,854,775,712/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction5.subtract(fraction11);
        int int14 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction19 = fraction5.divide(fraction18);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-99) + "'", int12 == (-99));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-99) + "'", int14 == (-99));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) '#', 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction9 = fraction5.subtract(fraction8);
        int int10 = fraction9.getNumerator();
        java.lang.Class<?> wildcardClass11 = fraction9.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-5147) + "'", int10 == (-5147));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) 'a', 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction5.subtract(fraction11);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction15.subtract(fraction17);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction23.abs();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction21.subtract(fraction23);
        int int26 = fraction25.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction19.subtract(fraction25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction28 = fraction13.divide(fraction27);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-99) + "'", int12 == (-99));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-99) + "'", int26 == (-99));
        org.junit.Assert.assertNotNull(fraction27);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        java.lang.Class<?> wildcardClass1 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 1.0f, (int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction1.add(fraction4);
        byte byte8 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) 0, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(1, 10);
        float float3 = fraction2.floatValue();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction7 = fraction2.divide(fraction6);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.1f + "'", float3 == 0.1f);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int6 = fraction3.compareTo(fraction5);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction1.subtract(fraction5);
        int int9 = fraction5.getNumerator();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.add(fraction5);
        org.apache.commons.math.fraction.Fraction fraction7 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int11 = fraction7.compareTo(fraction10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction12 = fraction4.divide(fraction7);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 1, (int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction0.negate();
        short short7 = fraction6.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction3.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-32) + "'", int5 == (-32));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ONE;
        double double1 = fraction0.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction5 = fraction0.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((-32), 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 1, (int) (byte) 10);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction1.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.reciprocal();
        java.lang.Class<?> wildcardClass5 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(1, 10);
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long3 = fraction2.longValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int11 = fraction10.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction8.multiply(fraction10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction14 = fraction4.divide(fraction13);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(2, (-32));
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) '4', 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 0.1f, (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        short short4 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 0.1f, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (short) 100, (double) (byte) -100, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) -100, (int) (short) 100);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction2.subtract(fraction4);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.abs();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction10.subtract(fraction13);
        int int15 = fraction9.compareTo(fraction10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction16 = fraction7.divide(fraction10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction1.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int11 = fraction10.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction8.add(fraction13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction15 = fraction14.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 2, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-99), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -99 to fraction (-9,223,372,036,854,775,708/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.TWO;
        int int7 = fraction6.intValue();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        int int9 = fraction8.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction11.negate();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction13.reciprocal();
        double double15 = fraction13.doubleValue();
        int int16 = fraction13.intValue();
        boolean boolean17 = fraction8.equals((java.lang.Object) fraction13);
        java.lang.Class<?> wildcardClass18 = fraction13.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-100.0d) + "'", double15 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-100) + "'", int16 == (-100));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.add(fraction10);
        short short12 = fraction10.shortValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        short short4 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction6.subtract(fraction9);
        int int11 = fraction6.intValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction6.negate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction13 = fraction5.divide(fraction12);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 0L, 10.0d, 0);
        int int4 = fraction3.getDenominator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction5 = fraction3.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        int int4 = fraction2.getNumerator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction5 = fraction2.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction1.doubleValue();
        int int4 = fraction1.intValue();
        short short5 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.add(fraction3);
        byte byte5 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (-100.0f));
        float float2 = fraction1.floatValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.TWO;
        int int7 = fraction6.intValue();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        int int9 = fraction8.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction11.negate();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction13.reciprocal();
        double double15 = fraction13.doubleValue();
        int int16 = fraction13.intValue();
        boolean boolean17 = fraction8.equals((java.lang.Object) fraction13);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int20 = fraction19.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction19.negate();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction21.reciprocal();
        boolean boolean23 = fraction8.equals((java.lang.Object) fraction21);
        java.lang.Class<?> wildcardClass24 = fraction21.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-100.0d) + "'", double15 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-100) + "'", int16 == (-100));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 0);
        long long2 = fraction1.longValue();
        java.lang.Class<?> wildcardClass3 = fraction1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 0);
        long long2 = fraction1.longValue();
        short short3 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 10L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-32L), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -32 to fraction (33/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        double double3 = fraction1.doubleValue();
        double double4 = fraction1.doubleValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        boolean boolean7 = fraction1.equals((java.lang.Object) fraction5);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction5.reciprocal();
        long long10 = fraction5.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction2.subtract(fraction4);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.negate();
        double double13 = fraction12.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction4.divide(fraction12);
        byte byte15 = fraction14.byteValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        byte byte6 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((-99), (int) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) 'a', (int) (short) 1);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 97 + "'", short3 == (short) 97);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (-99));
        org.apache.commons.math.fraction.Fraction fraction5 = fraction2.subtract(fraction4);
        long long6 = fraction5.longValue();
        short short7 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 32, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 32 to fraction (-31/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long3 = fraction2.longValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction2.abs();
        int int5 = fraction2.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction7.add(fraction9);
        boolean boolean11 = fraction2.equals((java.lang.Object) fraction9);
        byte byte12 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.add(fraction5);
        long long7 = fraction5.longValue();
        org.apache.commons.math.fraction.Fraction fraction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction9 = fraction5.divide(fraction8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 0L, 10.0d, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction4 = fraction3.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        boolean boolean7 = fraction1.equals((java.lang.Object) fraction5);
        short short8 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long3 = fraction2.longValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction2.abs();
        int int5 = fraction2.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction7.add(fraction9);
        boolean boolean11 = fraction2.equals((java.lang.Object) fraction9);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction9.abs();
        byte byte13 = fraction9.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.add(fraction11);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction14.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction14.add(fraction17);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int24 = fraction23.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction21.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction11.add(fraction26);
        byte byte29 = fraction26.byteValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 0 + "'", byte29 == (byte) 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.getNumerator();
        float float6 = fraction0.floatValue();
        boolean boolean8 = fraction0.equals((java.lang.Object) (-1.0d));
        int int9 = fraction0.getNumerator();
        java.lang.Class<?> wildcardClass10 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        int int5 = fraction4.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction4.getDenominator();
        int int6 = fraction4.getNumerator();
        java.lang.Class<?> wildcardClass7 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction0.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.negate();
        short short7 = fraction6.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        long long5 = fraction0.longValue();
        byte byte6 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        java.lang.Class<?> wildcardClass9 = fraction8.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction5.subtract(fraction11);
        int int14 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', 2);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction5.subtract(fraction17);
        float float19 = fraction18.floatValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-99) + "'", int12 == (-99));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-99) + "'", int14 == (-99));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-115.0f) + "'", float19 == (-115.0f));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 52 to fraction (-51/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean4 = fraction2.equals((java.lang.Object) (short) 0);
        int int5 = fraction2.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction6.subtract(fraction9);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction6.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction2.subtract(fraction11);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction14.subtract(fraction16);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction22.abs();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction16.add(fraction23);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction26.abs();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction26.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction28.abs();
        int int30 = fraction23.compareTo(fraction28);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction11.add(fraction23);
        org.apache.commons.math.fraction.Fraction fraction32 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction34.abs();
        org.apache.commons.math.fraction.Fraction fraction36 = fraction32.subtract(fraction35);
        int int37 = fraction32.getNumerator();
        float float38 = fraction32.floatValue();
        boolean boolean40 = fraction32.equals((java.lang.Object) (-1.0d));
        int int41 = fraction11.compareTo(fraction32);
        java.lang.Class<?> wildcardClass42 = fraction32.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-32) + "'", int5 == (-32));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (short) 100, (double) (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        short short5 = fraction4.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction1.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.reciprocal();
        byte byte6 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-32), 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long3 = fraction2.longValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction2.abs();
        int int5 = fraction2.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction7.add(fraction9);
        boolean boolean11 = fraction2.equals((java.lang.Object) fraction9);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction9.abs();
        byte byte13 = fraction12.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.add(fraction5);
        long long7 = fraction5.longValue();
        java.lang.Class<?> wildcardClass8 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int10 = fraction6.compareTo(fraction9);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction1.subtract(fraction6);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction13.subtract(fraction15);
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.TWO;
        int int19 = fraction18.intValue();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction17.divide(fraction18);
        int int21 = fraction20.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int24 = fraction23.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.reciprocal();
        double double27 = fraction25.doubleValue();
        int int28 = fraction25.intValue();
        boolean boolean29 = fraction20.equals((java.lang.Object) fraction25);
        int int30 = fraction1.compareTo(fraction25);
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction33.negate();
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction39 = fraction33.multiply(fraction38);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction25.subtract(fraction33);
        short short41 = fraction25.shortValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-100.0d) + "'", double27 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-100) + "'", int28 == (-100));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) -100 + "'", short41 == (short) -100);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.add(fraction11);
        int int13 = fraction11.getNumerator();
        short short14 = fraction11.shortValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        int int7 = fraction1.compareTo(fraction2);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction1.divide(fraction12);
        long long14 = fraction1.longValue();
        int int15 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction20.abs();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction18.subtract(fraction21);
        int int23 = fraction17.compareTo(fraction18);
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int26 = fraction25.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction25.negate();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction27.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction17.divide(fraction28);
        int int30 = fraction1.compareTo(fraction17);
        short short31 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 100 + "'", short31 == (short) 100);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int10 = fraction6.compareTo(fraction9);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction1.subtract(fraction6);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction13.subtract(fraction15);
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.TWO;
        int int19 = fraction18.intValue();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction17.divide(fraction18);
        int int21 = fraction20.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int24 = fraction23.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.reciprocal();
        double double27 = fraction25.doubleValue();
        int int28 = fraction25.intValue();
        boolean boolean29 = fraction20.equals((java.lang.Object) fraction25);
        int int30 = fraction1.compareTo(fraction25);
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction33.negate();
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction39 = fraction33.multiply(fraction38);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction25.subtract(fraction33);
        java.lang.Class<?> wildcardClass41 = fraction40.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-100.0d) + "'", double27 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-100) + "'", int28 == (-100));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction3.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction13 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction15.subtract(fraction17);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction23.abs();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction21.subtract(fraction23);
        int int26 = fraction25.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction19.subtract(fraction25);
        int int28 = fraction19.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction13.divide(fraction19);
        boolean boolean30 = fraction9.equals((java.lang.Object) fraction13);
        short short31 = fraction9.shortValue();
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-99) + "'", int26 == (-99));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-99) + "'", int28 == (-99));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 100 + "'", short31 == (short) 100);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (short) 97, (-100));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 97 to fraction (9,223,372,036,854,775,712/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 97, (double) (-100.0f), 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 97 to fraction (9,223,372,036,854,775,712/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1L);
        int int2 = fraction1.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.reciprocal();
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction13 = fraction7.multiply(fraction12);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction0.add(fraction12);
        int int15 = fraction0.intValue();
        int int16 = fraction0.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(52, 32);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        byte byte9 = fraction3.byteValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(1, 10);
        float float3 = fraction2.floatValue();
        long long4 = fraction2.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.1f + "'", float3 == 0.1f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int4 = fraction0.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction0.abs();
        byte byte6 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 0, (int) '4');
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 100, (int) ' ');
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 52, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 52 to fraction (-51/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (-99));
        org.apache.commons.math.fraction.Fraction fraction5 = fraction2.subtract(fraction4);
        org.apache.commons.math.fraction.Fraction fraction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction7 = fraction2.subtract(fraction6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-100L), (-32));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -100 to fraction (101/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        boolean boolean7 = fraction1.equals((java.lang.Object) fraction5);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction5.negate();
        byte byte9 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        int int7 = fraction1.compareTo(fraction2);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction1.divide(fraction12);
        org.apache.commons.math.fraction.Fraction fraction14 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction14.subtract(fraction17);
        int int19 = fraction14.getNumerator();
        float float20 = fraction14.floatValue();
        boolean boolean22 = fraction14.equals((java.lang.Object) (-1.0d));
        int int23 = fraction1.compareTo(fraction14);
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction25 = fraction1.subtract(fraction24);
        org.apache.commons.math.fraction.Fraction fraction28 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, 10);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (-99));
        org.apache.commons.math.fraction.Fraction fraction31 = fraction28.subtract(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction1.divide(fraction30);
        short short33 = fraction30.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) -99 + "'", short33 == (short) -99);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(2.0d, (double) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 2 to fraction (-1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((-1), 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.multiply(fraction14);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction5.multiply(fraction21);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction23.negate();
        java.lang.Class<?> wildcardClass25 = fraction23.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 10, 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int4 = fraction0.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction0.abs();
        byte byte6 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int4 = fraction1.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.abs();
        int int6 = fraction3.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction10);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction14.subtract(fraction16);
        int int19 = fraction18.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction12.subtract(fraction18);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction24.abs();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction22.subtract(fraction24);
        org.apache.commons.math.fraction.Fraction fraction29 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction29);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction18.multiply(fraction30);
        int int32 = fraction3.compareTo(fraction30);
        int int33 = fraction30.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction36 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', 2);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction30.subtract(fraction36);
        java.lang.Class<?> wildcardClass38 = fraction36.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-99) + "'", int19 == (-99));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.negate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction10 = fraction2.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 10L);
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int4 = fraction1.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.abs();
        int int6 = fraction3.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction10);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction14.subtract(fraction16);
        int int19 = fraction18.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction12.subtract(fraction18);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction24.abs();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction22.subtract(fraction24);
        org.apache.commons.math.fraction.Fraction fraction29 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction29);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction18.multiply(fraction30);
        int int32 = fraction3.compareTo(fraction30);
        int int33 = fraction30.getNumerator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-99) + "'", int19 == (-99));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-5147) + "'", int33 == (-5147));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-114L), (-32));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -114 to fraction (115/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int7 = fraction6.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction11 = fraction0.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction3.abs();
        int int7 = fraction3.getNumerator();
        byte byte8 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 100, 32);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.multiply(fraction14);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction5.multiply(fraction21);
        int int23 = fraction5.intValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 52, 0.0d, 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 52 to fraction (-51/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(1, 10);
        float float3 = fraction2.floatValue();
        short short4 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.1f + "'", float3 == 0.1f);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(1, (-32));
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction9 = fraction5.subtract(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        int int11 = fraction10.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction13.abs();
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction16.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction13.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction16.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int23 = fraction22.getNumerator();
        double double24 = fraction22.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction16.divide(fraction22);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction10.add(fraction16);
        byte byte27 = fraction16.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 100 + "'", byte27 == (byte) 100);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction6.subtract(fraction8);
        org.apache.commons.math.fraction.Fraction fraction11 = org.apache.commons.math.fraction.Fraction.TWO;
        int int12 = fraction11.intValue();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction10.divide(fraction11);
        int int14 = fraction13.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int17 = fraction16.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction16.negate();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction18.reciprocal();
        double double20 = fraction18.doubleValue();
        int int21 = fraction18.intValue();
        boolean boolean22 = fraction13.equals((java.lang.Object) fraction18);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction18.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction3.add(fraction18);
        org.apache.commons.math.fraction.Fraction fraction27 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long28 = fraction27.longValue();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction27.abs();
        int int30 = fraction27.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction32.add(fraction34);
        boolean boolean36 = fraction27.equals((java.lang.Object) fraction34);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction34.abs();
        boolean boolean38 = fraction24.equals((java.lang.Object) fraction37);
        long long39 = fraction24.longValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-100.0d) + "'", double20 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-200L) + "'", long39 == (-200L));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 16L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 16 to fraction (-15/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (short) 97);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction11);
        int int13 = fraction7.compareTo(fraction8);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int16 = fraction15.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction7.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction7.add(fraction21);
        boolean boolean23 = fraction0.equals((java.lang.Object) fraction22);
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction26.abs();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction24.subtract(fraction27);
        int int29 = fraction24.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction0.add(fraction24);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int33 = fraction32.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction32.negate();
        org.apache.commons.math.fraction.Fraction fraction35 = fraction34.negate();
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int42 = fraction41.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction41.negate();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction39.multiply(fraction41);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction34.subtract(fraction39);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction0.add(fraction45);
        org.apache.commons.math.fraction.Fraction fraction47 = org.apache.commons.math.fraction.Fraction.MINUS_ONE;
        int int48 = fraction47.getDenominator();
        int int49 = fraction46.compareTo(fraction47);
        java.lang.Class<?> wildcardClass50 = fraction46.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction8.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction5.add(fraction8);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction12.add(fraction17);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction2.add(fraction17);
        short short20 = fraction19.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) '4', 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.add(fraction11);
        org.apache.commons.math.fraction.Fraction fraction15 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction16 = fraction11.add(fraction15);
        int int17 = fraction16.getDenominator();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 2, (int) (short) -1);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 0L, (double) (-99.0f), (int) (short) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(100, 52);
        long long3 = fraction2.longValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(1.0d, (double) 0.0f, 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.negate();
        int int5 = fraction3.getDenominator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long3 = fraction2.longValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction2.abs();
        int int5 = fraction4.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 0.0f, (double) (-100.0f), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 97, (int) (short) 10);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (short) -99, 99);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -99 to fraction (-9,223,372,036,854,775,708/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.add(fraction5);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.reciprocal();
        int int8 = fraction5.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction8.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction5.add(fraction8);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction12.add(fraction17);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction2.add(fraction17);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction17.abs();
        short short21 = fraction20.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction3.abs();
        float float8 = fraction7.floatValue();
        double double9 = fraction7.doubleValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction5.subtract(fraction11);
        int int14 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', 2);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction5.subtract(fraction17);
        short short19 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-99) + "'", int12 == (-99));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-99) + "'", int14 == (-99));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -99 + "'", short19 == (short) -99);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.negate();
        short short10 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        short short9 = fraction8.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        int int7 = fraction1.compareTo(fraction2);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction1.divide(fraction12);
        long long14 = fraction1.longValue();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction1.negate();
        short short16 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) '#', (-1.0d), (int) (byte) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 35 to fraction (9,223,372,036,854,775,774/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.add(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction6.subtract(fraction9);
        int int11 = fraction6.intValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = org.apache.commons.math.fraction.Fraction.TWO;
        boolean boolean15 = fraction13.equals((java.lang.Object) (short) 100);
        boolean boolean16 = fraction12.equals((java.lang.Object) (short) 100);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction5.add(fraction12);
        short short18 = fraction17.shortValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.add(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.abs();
        long long6 = fraction1.longValue();
        int int7 = fraction1.intValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(10, (int) (short) 1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean4 = fraction2.equals((java.lang.Object) (short) 0);
        int int5 = fraction2.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction6.subtract(fraction9);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction6.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction2.subtract(fraction11);
        long long13 = fraction12.longValue();
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 10L);
        boolean boolean16 = fraction12.equals((java.lang.Object) fraction15);
        java.lang.Class<?> wildcardClass17 = fraction12.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-32) + "'", int5 == (-32));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-32L) + "'", long13 == (-32L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-5147), 2);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int4 = fraction0.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction0.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((-32), (int) ' ');
        float float9 = fraction8.floatValue();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.abs();
        double double13 = fraction11.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction11.reciprocal();
        int int15 = fraction11.getDenominator();
        int int16 = fraction8.compareTo(fraction11);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction5.divide(fraction8);
        double double18 = fraction17.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean4 = fraction2.equals((java.lang.Object) (short) 0);
        int int5 = fraction2.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction6.subtract(fraction9);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction6.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction2.subtract(fraction11);
        long long13 = fraction12.longValue();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((int) 'a', (int) (short) 1);
        boolean boolean18 = fraction14.equals((java.lang.Object) fraction17);
        java.lang.Class<?> wildcardClass19 = fraction17.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-32) + "'", int5 == (-32));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-32L) + "'", long13 == (-32L));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int4 = fraction1.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.abs();
        short short6 = fraction3.shortValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((-32), (int) (byte) 1);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((-100.0d), (double) (-114L), (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -100 to fraction (101/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        int int9 = fraction8.intValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.add(fraction11);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction14.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction14.add(fraction17);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int24 = fraction23.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction21.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction11.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 0.0f, (double) 'a', (int) (byte) 0);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction34.abs();
        double double36 = fraction34.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction34.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction38 = fraction32.subtract(fraction34);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction39 = fraction28.divide(fraction32);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int4 = fraction1.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.abs();
        short short6 = fraction5.shortValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction2.subtract(fraction4);
        org.apache.commons.math.fraction.Fraction fraction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction9 = fraction7.multiply(fraction8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        boolean boolean7 = fraction1.equals((java.lang.Object) fraction5);
        java.lang.Class<?> wildcardClass8 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 0, 32);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.add(fraction10);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction3.reciprocal();
        short short15 = fraction14.shortValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction0.negate();
        int int7 = fraction6.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction2.subtract(fraction4);
        double double8 = fraction7.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.abs();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction10.subtract(fraction12);
        org.apache.commons.math.fraction.Fraction fraction17 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction18 = fraction14.subtract(fraction17);
        int int19 = fraction18.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction7.divide(fraction18);
        byte byte21 = fraction18.byteValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-96.8d) + "'", double8 == (-96.8d));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-5147) + "'", int19 == (-5147));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -98 + "'", byte21 == (byte) -98);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (byte) -98);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction1.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int11 = fraction10.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction8.add(fraction13);
        java.lang.Class<?> wildcardClass15 = fraction13.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(10, (int) (short) 100);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int6 = fraction3.compareTo(fraction5);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction1.subtract(fraction5);
        int int9 = fraction1.getDenominator();
        long long10 = fraction1.longValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(0.0d, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction3.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int12 = fraction11.getNumerator();
        boolean boolean13 = fraction7.equals((java.lang.Object) fraction11);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction11.negate();
        int int15 = fraction3.compareTo(fraction14);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (-1L));
        boolean boolean18 = fraction3.equals((java.lang.Object) (-1L));
        short short19 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.multiply(fraction14);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction5.multiply(fraction21);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction27 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-100), (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int30 = fraction29.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction29.negate();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction31.reciprocal();
        double double33 = fraction31.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction27.subtract(fraction31);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction24.divide(fraction27);
        short short36 = fraction27.shortValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-100.0d) + "'", double33 == (-100.0d));
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 100 + "'", short36 == (short) 100);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-100), (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int5 = fraction4.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.reciprocal();
        double double8 = fraction6.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.subtract(fraction6);
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -99, (-1));
        org.apache.commons.math.fraction.Fraction fraction13 = fraction9.subtract(fraction12);
        double double14 = fraction9.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 200.0d + "'", double14 == 200.0d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (-0.01923077f));
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-100L));
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.divide(fraction3);
        byte byte5 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 2, (int) 'a');
        org.apache.commons.math.fraction.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = fraction2.compareTo(fraction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (short) 1, (double) 100.0f, 99);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.add(fraction5);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 1, (-32));
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.divide(fraction10);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) (short) 100);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction13.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction7.subtract(fraction14);
        byte byte16 = fraction15.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 99 + "'", byte16 == (byte) 99);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction5.subtract(fraction11);
        int int14 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction20.abs();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction20.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction18.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction26.negate();
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction29.abs();
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction32.abs();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction32.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction35 = fraction29.add(fraction32);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction32.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int39 = fraction38.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction38.negate();
        org.apache.commons.math.fraction.Fraction fraction41 = fraction40.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction42 = fraction36.add(fraction41);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction26.add(fraction41);
        int int44 = fraction20.compareTo(fraction26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction45 = fraction5.divide(fraction26);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-99) + "'", int12 == (-99));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-99) + "'", int14 == (-99));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 48L, (-32));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 48 to fraction (-47/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int10 = fraction6.compareTo(fraction9);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction1.subtract(fraction6);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction13.subtract(fraction15);
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.TWO;
        int int19 = fraction18.intValue();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction17.divide(fraction18);
        int int21 = fraction20.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int24 = fraction23.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.reciprocal();
        double double27 = fraction25.doubleValue();
        int int28 = fraction25.intValue();
        boolean boolean29 = fraction20.equals((java.lang.Object) fraction25);
        int int30 = fraction1.compareTo(fraction25);
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction33.negate();
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction39 = fraction33.multiply(fraction38);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction25.subtract(fraction33);
        int int41 = fraction33.getNumerator();
        java.lang.Class<?> wildcardClass42 = fraction33.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-100.0d) + "'", double27 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-100) + "'", int28 == (-100));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 'a');
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        int int7 = fraction1.compareTo(fraction2);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction1.divide(fraction12);
        long long14 = fraction1.longValue();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction1.negate();
        java.lang.Class<?> wildcardClass16 = fraction15.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        float float2 = fraction1.floatValue();
        byte byte3 = fraction1.byteValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(10.0d, (double) (-99.0f), 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 0.1f, (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        double double4 = fraction2.doubleValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1111111111111111d + "'", double4 == 0.1111111111111111d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) ' ', (double) (-99), (-100));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 32 to fraction (-31/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) -1, (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((int) '4', (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        java.lang.Class<?> wildcardClass7 = fraction6.getClass();
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.reciprocal();
        short short5 = fraction4.shortValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 0.1f, (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long7 = fraction6.longValue();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction6.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.divide(fraction8);
        byte byte10 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction11);
        int int13 = fraction7.compareTo(fraction8);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int16 = fraction15.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction7.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction7.add(fraction21);
        boolean boolean23 = fraction0.equals((java.lang.Object) fraction22);
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction26.abs();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction24.subtract(fraction27);
        int int29 = fraction24.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction0.add(fraction24);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction32.add(fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction0.subtract(fraction34);
        byte byte37 = fraction36.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) -1 + "'", byte37 == (byte) -1);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 3.125f, (double) (-98), (int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 3.125 to fraction (9,223,372,036,854,775,786/-7)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.negate();
        double double5 = fraction4.doubleValue();
        long long6 = fraction4.longValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction0.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = org.apache.commons.math.fraction.Fraction.TWO;
        boolean boolean9 = fraction7.equals((java.lang.Object) (short) 100);
        boolean boolean10 = fraction6.equals((java.lang.Object) (short) 100);
        int int11 = fraction6.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int14 = fraction13.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction13.negate();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.reciprocal();
        double double17 = fraction15.doubleValue();
        int int18 = fraction15.intValue();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction6.divide(fraction15);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.abs();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction25.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction27.abs();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction23.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction6.multiply(fraction23);
        short short31 = fraction6.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-100.0d) + "'", double17 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 0 + "'", short31 == (short) 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.abs();
        double double8 = fraction6.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction6.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction11 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction13.abs();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction11.subtract(fraction14);
        int int16 = fraction11.intValue();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction11.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.TWO;
        boolean boolean20 = fraction18.equals((java.lang.Object) (short) 100);
        boolean boolean21 = fraction17.equals((java.lang.Object) (short) 100);
        int int22 = fraction17.getNumerator();
        int int23 = fraction17.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction9.subtract(fraction17);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction4.multiply(fraction17);
        org.apache.commons.math.fraction.Fraction fraction26 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction28.abs();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction29);
        int int31 = fraction26.intValue();
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction34 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction36.abs();
        org.apache.commons.math.fraction.Fraction fraction38 = fraction34.subtract(fraction37);
        int int39 = fraction33.compareTo(fraction34);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int42 = fraction41.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction41.negate();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction43.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction45 = fraction33.divide(fraction44);
        org.apache.commons.math.fraction.Fraction fraction47 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction33.add(fraction47);
        boolean boolean49 = fraction26.equals((java.lang.Object) fraction48);
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) 10L);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction51.abs();
        org.apache.commons.math.fraction.Fraction fraction53 = fraction26.add(fraction52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction54 = fraction17.divide(fraction26);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int4 = fraction0.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction0.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.abs();
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction14.abs();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction11.add(fraction14);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction14.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int21 = fraction20.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction20.negate();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction22.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction18.add(fraction23);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction8.add(fraction23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction26 = fraction0.divide(fraction8);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1.0f, (-32.0d), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(52, (int) ' ');
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-99), (int) (byte) 99);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction0.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = org.apache.commons.math.fraction.Fraction.TWO;
        boolean boolean9 = fraction7.equals((java.lang.Object) (short) 100);
        boolean boolean10 = fraction6.equals((java.lang.Object) (short) 100);
        int int11 = fraction6.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int14 = fraction13.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction13.negate();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.reciprocal();
        double double17 = fraction15.doubleValue();
        int int18 = fraction15.intValue();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction6.divide(fraction15);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.abs();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction25.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction27.abs();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction23.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction6.multiply(fraction23);
        byte byte31 = fraction30.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-100.0d) + "'", double17 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 0 + "'", byte31 == (byte) 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction5.subtract(fraction11);
        int int14 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long19 = fraction18.longValue();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction18.negate();
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction23 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.abs();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction23.subtract(fraction26);
        int int28 = fraction22.compareTo(fraction23);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int31 = fraction30.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction30.negate();
        org.apache.commons.math.fraction.Fraction fraction33 = fraction32.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction22.divide(fraction33);
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction22.add(fraction36);
        boolean boolean38 = fraction20.equals((java.lang.Object) fraction37);
        boolean boolean39 = fraction15.equals((java.lang.Object) fraction20);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction43.abs();
        org.apache.commons.math.fraction.Fraction fraction45 = fraction41.subtract(fraction43);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction43.abs();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction43.abs();
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction49.abs();
        org.apache.commons.math.fraction.Fraction fraction51 = fraction43.add(fraction50);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction43.negate();
        org.apache.commons.math.fraction.Fraction fraction53 = fraction43.abs();
        org.apache.commons.math.fraction.Fraction fraction54 = fraction43.reciprocal();
        boolean boolean55 = fraction15.equals((java.lang.Object) fraction43);
        int int56 = fraction15.getNumerator();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-99) + "'", int12 == (-99));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-99) + "'", int14 == (-99));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 99 + "'", int56 == 99);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.add(fraction11);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction14.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction14.add(fraction17);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int24 = fraction23.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction21.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction11.add(fraction26);
        byte byte29 = fraction11.byteValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 0 + "'", byte29 == (byte) 0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((-32), (int) (short) 97);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(97, (int) (short) -100);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((-98.98076923076923d), 0.01d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Unable to convert -98.981 to fraction after 0 iterations");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction7 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.subtract(fraction10);
        int int12 = fraction6.compareTo(fraction7);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction6.divide(fraction17);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction17.reciprocal();
        int int20 = fraction3.compareTo(fraction19);
        short short21 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 100 + "'", short21 == (short) 100);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.getNumerator();
        float float6 = fraction0.floatValue();
        boolean boolean8 = fraction0.equals((java.lang.Object) (-1.0d));
        int int9 = fraction0.getNumerator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction10 = fraction0.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.multiply(fraction14);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction5.multiply(fraction21);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction5.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction26.abs();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction24.subtract(fraction27);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.abs();
        int int30 = fraction29.intValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction31 = fraction23.divide(fraction29);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction0.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = org.apache.commons.math.fraction.Fraction.TWO;
        boolean boolean9 = fraction7.equals((java.lang.Object) (short) 100);
        boolean boolean10 = fraction6.equals((java.lang.Object) (short) 100);
        int int11 = fraction6.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int14 = fraction13.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction13.negate();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.reciprocal();
        double double17 = fraction15.doubleValue();
        int int18 = fraction15.intValue();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction6.divide(fraction15);
        long long20 = fraction6.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-100.0d) + "'", double17 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction1.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int11 = fraction10.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction8.add(fraction13);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction14.negate();
        long long16 = fraction15.longValue();
        int int17 = fraction15.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean4 = fraction2.equals((java.lang.Object) (short) 0);
        int int5 = fraction2.intValue();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction(10, (int) (byte) 99);
        boolean boolean9 = fraction2.equals((java.lang.Object) (byte) 99);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-32) + "'", int5 == (-32));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-115.0f), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -115 to fraction (-9,223,372,036,854,775,692/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (-98L));
        float float2 = fraction1.floatValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-98.0f) + "'", float2 == (-98.0f));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        int int7 = fraction1.compareTo(fraction2);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction1.divide(fraction12);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int20 = fraction19.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction19.negate();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction17.multiply(fraction19);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int29 = fraction28.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction28.negate();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.multiply(fraction28);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction31.add(fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction19.multiply(fraction35);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction19.negate();
        org.apache.commons.math.fraction.Fraction fraction38 = fraction37.negate();
        org.apache.commons.math.fraction.Fraction fraction41 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-100), (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int44 = fraction43.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction45 = fraction43.negate();
        org.apache.commons.math.fraction.Fraction fraction46 = fraction45.reciprocal();
        double double47 = fraction45.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction48 = fraction41.subtract(fraction45);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction38.divide(fraction41);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction13.add(fraction41);
        int int51 = fraction13.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-100.0d) + "'", double47 == (-100.0d));
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int4 = fraction1.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.abs();
        int int6 = fraction3.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction10);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction14.subtract(fraction16);
        int int19 = fraction18.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction12.subtract(fraction18);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction24.abs();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction22.subtract(fraction24);
        org.apache.commons.math.fraction.Fraction fraction29 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction29);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction18.multiply(fraction30);
        int int32 = fraction3.compareTo(fraction30);
        int int33 = fraction30.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction36 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', 2);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction30.subtract(fraction36);
        byte byte38 = fraction36.byteValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-99) + "'", int19 == (-99));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 16 + "'", byte38 == (byte) 16);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        int int3 = fraction1.getDenominator();
        int int4 = fraction1.intValue();
        double double5 = fraction1.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction11);
        int int13 = fraction7.compareTo(fraction8);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int16 = fraction15.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction7.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction7.add(fraction21);
        boolean boolean23 = fraction0.equals((java.lang.Object) fraction22);
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction26.abs();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction24.subtract(fraction27);
        int int29 = fraction24.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction0.add(fraction24);
        double double31 = fraction30.doubleValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction32 = fraction30.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 10L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.negate();
        long long3 = fraction1.longValue();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((int) (byte) 0, 10);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int9 = fraction8.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction6.divide(fraction12);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int20 = fraction17.compareTo(fraction19);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction19.abs();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction15.subtract(fraction19);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction12.add(fraction22);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction1.divide(fraction23);
        java.lang.Class<?> wildcardClass25 = fraction23.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.add(fraction5);
        int int7 = fraction4.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (-99));
        org.apache.commons.math.fraction.Fraction fraction5 = fraction2.subtract(fraction4);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.negate();
        byte byte10 = fraction8.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (byte) -98, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -98 to fraction (99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        int int7 = fraction1.compareTo(fraction2);
        int int8 = fraction2.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.abs();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction10.subtract(fraction12);
        org.apache.commons.math.fraction.Fraction fraction15 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int19 = fraction15.compareTo(fraction18);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction10.subtract(fraction15);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction2.divide(fraction10);
        int int22 = fraction10.intValue();
        int int23 = fraction10.getDenominator();
        short short24 = fraction10.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 1 + "'", short24 == (short) 1);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, 10);
        long long3 = fraction2.longValue();
        java.lang.Class<?> wildcardClass4 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction11);
        int int13 = fraction7.compareTo(fraction8);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int16 = fraction15.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction7.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction7.add(fraction21);
        boolean boolean23 = fraction0.equals((java.lang.Object) fraction22);
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction26.abs();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction24.subtract(fraction27);
        int int29 = fraction24.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction0.add(fraction24);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction32.add(fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction0.subtract(fraction34);
        float float37 = fraction36.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1, (double) (-48.5f), 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.multiply(fraction14);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction5.multiply(fraction21);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction27 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-100), (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int30 = fraction29.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction29.negate();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction31.reciprocal();
        double double33 = fraction31.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction27.subtract(fraction31);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction24.divide(fraction27);
        int int36 = fraction27.intValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-100.0d) + "'", double33 == (-100.0d));
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(200.0d, (double) (-200), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 200 to fraction (-199/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int7 = fraction6.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction8);
        byte byte11 = fraction10.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -100 + "'", byte11 == (byte) -100);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 2, (int) (short) -99);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction1.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction4.reciprocal();
        int int9 = fraction4.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.getNumerator();
        float float6 = fraction0.floatValue();
        int int7 = fraction0.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction4.getDenominator();
        int int6 = fraction4.getNumerator();
        int int7 = fraction4.intValue();
        java.lang.Class<?> wildcardClass8 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(100, (-99));
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-115.0f), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -115 to fraction (-9,223,372,036,854,775,692/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.add(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction6.subtract(fraction9);
        int int11 = fraction6.intValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = org.apache.commons.math.fraction.Fraction.TWO;
        boolean boolean15 = fraction13.equals((java.lang.Object) (short) 100);
        boolean boolean16 = fraction12.equals((java.lang.Object) (short) 100);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction5.add(fraction12);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction5.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction18.negate();
        int int20 = fraction19.intValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, 10);
        long long3 = fraction2.longValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction8 = fraction2.divide(fraction7);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction1.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.reciprocal();
        byte byte5 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(10.0d, (double) (short) 97, 100);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(10, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 10.0f);
        float float2 = fraction1.floatValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 0, 97);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.abs();
        short short6 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction9 = fraction5.subtract(fraction8);
        double double10 = fraction8.doubleValue();
        int int11 = fraction8.getNumerator();
        java.lang.Class<?> wildcardClass12 = fraction8.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.019230769230769232d) + "'", double10 == (-0.019230769230769232d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction1.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int11 = fraction10.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction8.add(fraction13);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean20 = fraction18.equals((java.lang.Object) (short) 0);
        int int21 = fraction18.intValue();
        org.apache.commons.math.fraction.Fraction fraction22 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction24.abs();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction22.subtract(fraction25);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction22.abs();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction18.subtract(fraction27);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction32.abs();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction30.subtract(fraction32);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction32.abs();
        org.apache.commons.math.fraction.Fraction fraction36 = fraction32.abs();
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction38.abs();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction32.add(fraction39);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction42.abs();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction42.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction45 = fraction44.abs();
        int int46 = fraction39.compareTo(fraction44);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction27.add(fraction39);
        int int48 = fraction14.compareTo(fraction39);
        int int49 = fraction14.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction(2.0d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-5147), (-99));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -5,147 to fraction (-9,223,372,036,854,770,660/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-1.0f), (int) (short) -100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -1 to fraction (-9,223,372,036,854,775,806/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-48L), (double) (-1L), (int) (byte) -100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -48 to fraction (49/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-98), 52);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction4 = fraction2.divide(fraction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.multiply(fraction14);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction5.multiply(fraction21);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction5.negate();
        int int24 = fraction5.getDenominator();
        java.lang.Class<?> wildcardClass25 = fraction5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100.01f, (-5147));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        int int7 = fraction1.compareTo(fraction2);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction1.divide(fraction12);
        org.apache.commons.math.fraction.Fraction fraction14 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction14.subtract(fraction17);
        int int19 = fraction14.getNumerator();
        float float20 = fraction14.floatValue();
        boolean boolean22 = fraction14.equals((java.lang.Object) (-1.0d));
        int int23 = fraction1.compareTo(fraction14);
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction25 = fraction1.subtract(fraction24);
        org.apache.commons.math.fraction.Fraction fraction28 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, 10);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (-99));
        org.apache.commons.math.fraction.Fraction fraction31 = fraction28.subtract(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction1.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction33 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int37 = fraction33.compareTo(fraction36);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction33.abs();
        double double39 = fraction38.doubleValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction40 = fraction32.divide(fraction38);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction5.subtract(fraction11);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction15.subtract(fraction17);
        org.apache.commons.math.fraction.Fraction fraction22 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction23 = fraction19.subtract(fraction22);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction11.multiply(fraction23);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction28.abs();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction28);
        org.apache.commons.math.fraction.Fraction fraction31 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int35 = fraction31.compareTo(fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction26.subtract(fraction31);
        boolean boolean37 = fraction23.equals((java.lang.Object) fraction36);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction23.negate();
        java.lang.Class<?> wildcardClass39 = fraction38.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-99) + "'", int12 == (-99));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(10, (-200));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int9 = fraction6.compareTo(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction4.add(fraction10);
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.getDenominator();
        double double14 = fraction12.doubleValue();
        int int15 = fraction11.compareTo(fraction12);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction12.negate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 0.0f, (double) 'a', (int) (byte) 0);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.abs();
        double double7 = fraction5.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction5.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction3.subtract(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((-100), 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 0.1f, (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction15.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction12.multiply(fraction15);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction22.abs();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction20.subtract(fraction22);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction28.abs();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction28);
        int int31 = fraction30.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction24.subtract(fraction30);
        int int33 = fraction24.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction36 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction38.abs();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction36.subtract(fraction39);
        int int41 = fraction35.compareTo(fraction36);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int44 = fraction43.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction45 = fraction43.negate();
        org.apache.commons.math.fraction.Fraction fraction46 = fraction45.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction35.divide(fraction46);
        long long48 = fraction35.longValue();
        org.apache.commons.math.fraction.Fraction fraction49 = fraction24.multiply(fraction35);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction12.subtract(fraction24);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction5.divide(fraction50);
        byte byte52 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-99) + "'", int31 == (-99));
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-99) + "'", int33 == (-99));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 100L + "'", long48 == 100L);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 100 + "'", byte52 == (byte) 100);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) '4', (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int5 = fraction4.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.divide(fraction8);
        double double10 = fraction2.doubleValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.2d + "'", double10 == 5.2d);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.add(fraction11);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction14.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction14.add(fraction17);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int24 = fraction23.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction21.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction11.add(fraction26);
        float float29 = fraction26.floatValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-0.01f) + "'", float29 == (-0.01f));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction0.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction13.abs();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction13.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction11.subtract(fraction13);
        boolean boolean17 = fraction8.equals((java.lang.Object) fraction11);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction11.negate();
        int int19 = fraction0.compareTo(fraction11);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) '4', (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int5 = fraction4.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.divide(fraction8);
        byte byte10 = fraction9.byteValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 8 + "'", byte10 == (byte) 8);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.multiply(fraction14);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction5.multiply(fraction21);
        byte byte23 = fraction22.byteValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.negate();
        long long10 = fraction9.longValue();
        int int11 = fraction9.intValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int4 = fraction1.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.abs();
        int int6 = fraction3.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction10);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction14.subtract(fraction16);
        int int19 = fraction18.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction12.subtract(fraction18);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction24.abs();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction22.subtract(fraction24);
        org.apache.commons.math.fraction.Fraction fraction29 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction29);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction18.multiply(fraction30);
        int int32 = fraction3.compareTo(fraction30);
        int int33 = fraction30.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction30.abs();
        int int35 = fraction34.getDenominator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-99) + "'", int19 == (-99));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 97, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 97 to fraction (9,223,372,036,854,775,712/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        int int7 = fraction1.compareTo(fraction2);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction1.divide(fraction12);
        long long14 = fraction1.longValue();
        int int15 = fraction1.getNumerator();
        short short16 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(2, (-5147));
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) '4', (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int5 = fraction4.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.divide(fraction8);
        java.lang.Class<?> wildcardClass10 = fraction8.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (-200), 9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 0, (double) 2, 99);
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-99), (-200));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -99 to fraction (-9,223,372,036,854,775,708/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int4 = fraction1.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean9 = fraction7.equals((java.lang.Object) (short) 0);
        double double10 = fraction7.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction1.subtract(fraction7);
        int int12 = fraction1.getNumerator();
        java.lang.Class<?> wildcardClass13 = fraction1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-32.0d) + "'", double10 == (-32.0d));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction0.abs();
        int int6 = fraction5.intValue();
        int int7 = fraction5.intValue();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 0.1f, (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction5.subtract(fraction10);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.negate();
        short short13 = fraction12.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        int int7 = fraction1.compareTo(fraction2);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction1.divide(fraction12);
        long long14 = fraction1.longValue();
        int int15 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction20.abs();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction18.subtract(fraction21);
        int int23 = fraction17.compareTo(fraction18);
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int26 = fraction25.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction25.negate();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction27.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction17.divide(fraction28);
        int int30 = fraction1.compareTo(fraction17);
        int int31 = fraction17.intValue();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction17.negate();
        org.apache.commons.math.fraction.Fraction fraction33 = fraction32.negate();
        float float34 = fraction33.floatValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction0.abs();
        float float6 = fraction0.floatValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction7 = fraction0.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((-1.0d), (-200));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -1 to fraction (-9,223,372,036,854,775,806/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 97.0f, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 97 to fraction (9,223,372,036,854,775,712/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.abs();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction10.subtract(fraction12);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction8.subtract(fraction14);
        int int17 = fraction8.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction2.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction20.abs();
        double double22 = fraction20.doubleValue();
        int int23 = fraction20.intValue();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction2.add(fraction20);
        double double25 = fraction24.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-99) + "'", int17 == (-99));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.1d + "'", double25 == 100.1d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction9 = fraction5.subtract(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean15 = fraction13.equals((java.lang.Object) (short) 0);
        int int16 = fraction13.intValue();
        org.apache.commons.math.fraction.Fraction fraction17 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction19.abs();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction13.subtract(fraction22);
        int int24 = fraction13.intValue();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction9.multiply(fraction13);
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction29.abs();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction27.subtract(fraction29);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction29.abs();
        org.apache.commons.math.fraction.Fraction fraction33 = fraction29.abs();
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction35.abs();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction29.add(fraction36);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) 10.0f);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction36.divide(fraction39);
        int int41 = fraction25.compareTo(fraction40);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction45.abs();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction43.subtract(fraction45);
        org.apache.commons.math.fraction.Fraction fraction48 = org.apache.commons.math.fraction.Fraction.TWO;
        int int49 = fraction48.intValue();
        org.apache.commons.math.fraction.Fraction fraction50 = fraction47.divide(fraction48);
        org.apache.commons.math.fraction.Fraction fraction53 = new org.apache.commons.math.fraction.Fraction((-100), 1);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction57 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction58 = fraction57.abs();
        org.apache.commons.math.fraction.Fraction fraction59 = fraction55.subtract(fraction57);
        org.apache.commons.math.fraction.Fraction fraction62 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction63 = fraction59.subtract(fraction62);
        org.apache.commons.math.fraction.Fraction fraction64 = fraction63.abs();
        org.apache.commons.math.fraction.Fraction fraction67 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean69 = fraction67.equals((java.lang.Object) (short) 0);
        int int70 = fraction67.intValue();
        org.apache.commons.math.fraction.Fraction fraction71 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction73 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction74 = fraction73.abs();
        org.apache.commons.math.fraction.Fraction fraction75 = fraction71.subtract(fraction74);
        org.apache.commons.math.fraction.Fraction fraction76 = fraction71.abs();
        org.apache.commons.math.fraction.Fraction fraction77 = fraction67.subtract(fraction76);
        int int78 = fraction67.intValue();
        org.apache.commons.math.fraction.Fraction fraction79 = fraction63.multiply(fraction67);
        org.apache.commons.math.fraction.Fraction fraction80 = fraction79.negate();
        int int81 = fraction53.compareTo(fraction80);
        int int82 = fraction47.compareTo(fraction80);
        org.apache.commons.math.fraction.Fraction fraction83 = fraction40.multiply(fraction80);
        float float84 = fraction40.floatValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-32) + "'", int16 == (-32));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-32) + "'", int24 == (-32));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-32) + "'", int70 == (-32));
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-32) + "'", int78 == (-32));
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 10.0f + "'", float84 == 10.0f);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', (int) ' ');
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction3.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int12 = fraction11.getNumerator();
        boolean boolean13 = fraction7.equals((java.lang.Object) fraction11);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction11.negate();
        int int15 = fraction3.compareTo(fraction14);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (-1L));
        boolean boolean18 = fraction3.equals((java.lang.Object) (-1L));
        int int19 = fraction3.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction3.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction10.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction7.add(fraction10);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction10.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int17 = fraction16.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction16.negate();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction18.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction14.add(fraction19);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction3.add(fraction19);
        byte byte22 = fraction21.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 99 + "'", byte22 == (byte) 99);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        long long4 = fraction3.longValue();
        byte byte5 = fraction3.byteValue();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int11 = fraction10.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction8.multiply(fraction10);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction3.subtract(fraction8);
        double double15 = fraction8.doubleValue();
        int int16 = fraction8.intValue();
        byte byte17 = fraction8.byteValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) '4', (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int5 = fraction4.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.divide(fraction8);
        java.lang.Class<?> wildcardClass10 = fraction9.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.abs();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction10.subtract(fraction12);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction8.subtract(fraction14);
        int int17 = fraction8.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction2.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction21.negate();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction22.abs();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction18.subtract(fraction22);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction22.negate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction26 = fraction25.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-99) + "'", int17 == (-99));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 10L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction1.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction6.subtract(fraction9);
        int int11 = fraction6.intValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = org.apache.commons.math.fraction.Fraction.TWO;
        boolean boolean15 = fraction13.equals((java.lang.Object) (short) 100);
        boolean boolean16 = fraction12.equals((java.lang.Object) (short) 100);
        int int17 = fraction12.getNumerator();
        int int18 = fraction12.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction4.subtract(fraction12);
        java.lang.Class<?> wildcardClass20 = fraction19.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (-99L));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.abs();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction12.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction10.subtract(fraction12);
        double double16 = fraction15.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction20.abs();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction18.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction25 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction26 = fraction22.subtract(fraction25);
        int int27 = fraction26.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction15.divide(fraction26);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction26.abs();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction3.add(fraction26);
        java.lang.Class<?> wildcardClass31 = fraction30.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-96.8d) + "'", double16 == (-96.8d));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5147) + "'", int27 == (-5147));
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction(0.0d);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.subtract(fraction3);
        int int5 = fraction4.intValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-100) + "'", int5 == (-100));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int12 = fraction11.getNumerator();
        boolean boolean13 = fraction7.equals((java.lang.Object) fraction11);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction11.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction4.subtract(fraction15);
        float float17 = fraction4.floatValue();
        short short18 = fraction4.shortValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction9 = fraction5.subtract(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean15 = fraction13.equals((java.lang.Object) (short) 0);
        int int16 = fraction13.intValue();
        org.apache.commons.math.fraction.Fraction fraction17 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction19.abs();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction13.subtract(fraction22);
        int int24 = fraction13.intValue();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction9.multiply(fraction13);
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction29.abs();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction27.subtract(fraction29);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction29.abs();
        org.apache.commons.math.fraction.Fraction fraction33 = fraction29.abs();
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction35.abs();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction29.add(fraction36);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) 10.0f);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction36.divide(fraction39);
        int int41 = fraction25.compareTo(fraction40);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction45.abs();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction43.subtract(fraction45);
        org.apache.commons.math.fraction.Fraction fraction48 = org.apache.commons.math.fraction.Fraction.TWO;
        int int49 = fraction48.intValue();
        org.apache.commons.math.fraction.Fraction fraction50 = fraction47.divide(fraction48);
        org.apache.commons.math.fraction.Fraction fraction53 = new org.apache.commons.math.fraction.Fraction((-100), 1);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction57 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction58 = fraction57.abs();
        org.apache.commons.math.fraction.Fraction fraction59 = fraction55.subtract(fraction57);
        org.apache.commons.math.fraction.Fraction fraction62 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction63 = fraction59.subtract(fraction62);
        org.apache.commons.math.fraction.Fraction fraction64 = fraction63.abs();
        org.apache.commons.math.fraction.Fraction fraction67 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean69 = fraction67.equals((java.lang.Object) (short) 0);
        int int70 = fraction67.intValue();
        org.apache.commons.math.fraction.Fraction fraction71 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction73 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction74 = fraction73.abs();
        org.apache.commons.math.fraction.Fraction fraction75 = fraction71.subtract(fraction74);
        org.apache.commons.math.fraction.Fraction fraction76 = fraction71.abs();
        org.apache.commons.math.fraction.Fraction fraction77 = fraction67.subtract(fraction76);
        int int78 = fraction67.intValue();
        org.apache.commons.math.fraction.Fraction fraction79 = fraction63.multiply(fraction67);
        org.apache.commons.math.fraction.Fraction fraction80 = fraction79.negate();
        int int81 = fraction53.compareTo(fraction80);
        int int82 = fraction47.compareTo(fraction80);
        org.apache.commons.math.fraction.Fraction fraction83 = fraction40.multiply(fraction80);
        org.apache.commons.math.fraction.Fraction fraction85 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction86 = fraction85.abs();
        int int87 = fraction85.intValue();
        org.apache.commons.math.fraction.Fraction fraction89 = new org.apache.commons.math.fraction.Fraction((double) 1L);
        boolean boolean90 = fraction85.equals((java.lang.Object) fraction89);
        boolean boolean91 = fraction80.equals((java.lang.Object) fraction85);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-32) + "'", int16 == (-32));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-32) + "'", int24 == (-32));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-32) + "'", int70 == (-32));
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-32) + "'", int78 == (-32));
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertNotNull(fraction86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 100 + "'", int87 == 100);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 97, (int) (short) -99);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-5147), (-1.0d), 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -5,147 to fraction (-9,223,372,036,854,770,660/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(0.0d, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        byte byte1 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.add(fraction3);
        int int5 = fraction4.getDenominator();
        int int6 = fraction4.getDenominator();
        byte byte7 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 2 + "'", byte7 == (byte) 2);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-48L), (double) (-2.0f), (int) (byte) 16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -48 to fraction (49/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.multiply(fraction14);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction5.multiply(fraction21);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction27 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-100), (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int30 = fraction29.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction29.negate();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction31.reciprocal();
        double double33 = fraction31.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction27.subtract(fraction31);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction24.divide(fraction27);
        org.apache.commons.math.fraction.Fraction fraction37 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int42 = fraction39.compareTo(fraction41);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction41.abs();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction37.subtract(fraction41);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction24.subtract(fraction41);
        org.apache.commons.math.fraction.Fraction fraction46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction47 = fraction24.divide(fraction46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-100.0d) + "'", double33 == (-100.0d));
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((-100), 1);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.math.fraction.Fraction fraction11 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction11);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.abs();
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean18 = fraction16.equals((java.lang.Object) (short) 0);
        int int19 = fraction16.intValue();
        org.apache.commons.math.fraction.Fraction fraction20 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction22.abs();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction20.subtract(fraction23);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction20.abs();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction16.subtract(fraction25);
        int int27 = fraction16.intValue();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction12.multiply(fraction16);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction28.negate();
        int int30 = fraction2.compareTo(fraction29);
        double double31 = fraction2.doubleValue();
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-32) + "'", int19 == (-32));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-32) + "'", int27 == (-32));
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-100.0d) + "'", double31 == (-100.0d));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.add(fraction10);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean18 = fraction16.equals((java.lang.Object) (short) 0);
        int int19 = fraction16.intValue();
        org.apache.commons.math.fraction.Fraction fraction20 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction22.abs();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction20.subtract(fraction23);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction20.abs();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction16.subtract(fraction25);
        long long27 = fraction26.longValue();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction26.negate();
        org.apache.commons.math.fraction.Fraction fraction31 = new org.apache.commons.math.fraction.Fraction((int) 'a', (int) (short) 1);
        boolean boolean32 = fraction28.equals((java.lang.Object) fraction31);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction13.divide(fraction31);
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((-32), (int) ' ');
        float float37 = fraction36.floatValue();
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction39.abs();
        double double41 = fraction39.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction42 = fraction39.reciprocal();
        int int43 = fraction39.getDenominator();
        int int44 = fraction36.compareTo(fraction39);
        int int45 = fraction39.intValue();
        org.apache.commons.math.fraction.Fraction fraction46 = fraction13.divide(fraction39);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction39.negate();
        short short48 = fraction47.shortValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-32) + "'", int19 == (-32));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-32L) + "'", long27 == (-32L));
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) -100 + "'", short48 == (short) -100);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 0, 520);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-99), (-32));
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int4 = fraction1.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.abs();
        int int6 = fraction3.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction10);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction14.subtract(fraction16);
        int int19 = fraction18.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction12.subtract(fraction18);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction24.abs();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction22.subtract(fraction24);
        org.apache.commons.math.fraction.Fraction fraction29 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction29);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction18.multiply(fraction30);
        int int32 = fraction3.compareTo(fraction30);
        int int33 = fraction30.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction36 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', 2);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction30.subtract(fraction36);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction37.negate();
        java.lang.Class<?> wildcardClass39 = fraction37.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-99) + "'", int19 == (-99));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int4 = fraction0.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction0.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction11.negate();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction9.multiply(fraction11);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int21 = fraction20.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction20.negate();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction18.multiply(fraction20);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction23.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction11.multiply(fraction27);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction11.negate();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction29.negate();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction29.abs();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction0.subtract(fraction31);
        short short33 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 0 + "'", short33 == (short) 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction1.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.abs();
        double double8 = fraction6.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.multiply(fraction6);
        int int10 = fraction6.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction13.subtract(fraction15);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction21.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction19.subtract(fraction21);
        int int24 = fraction23.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction17.subtract(fraction23);
        int int26 = fraction17.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((-100), 1);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 0.1f, (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction32.abs();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction32.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction35 = fraction29.multiply(fraction32);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction17.subtract(fraction32);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction11.divide(fraction32);
        double double38 = fraction32.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-99) + "'", int24 == (-99));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-99) + "'", int26 == (-99));
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.1111111111111111d + "'", double38 == 0.1111111111111111d);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction9 = fraction5.subtract(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        int int11 = fraction10.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction13.abs();
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction16.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction13.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction16.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int23 = fraction22.getNumerator();
        double double24 = fraction22.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction16.divide(fraction22);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction10.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction10.negate();
        byte byte28 = fraction27.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) -98 + "'", byte28 == (byte) -98);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = fraction2.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int4 = fraction0.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction0.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((-32), (int) ' ');
        float float9 = fraction8.floatValue();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.abs();
        double double13 = fraction11.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction11.reciprocal();
        int int15 = fraction11.getDenominator();
        int int16 = fraction8.compareTo(fraction11);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction5.divide(fraction8);
        float float18 = fraction8.floatValue();
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int21 = fraction20.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction20.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction8.multiply(fraction20);
        byte byte24 = fraction8.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100.01f, (double) (-1L), (-200));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Unable to convert 100.01 to fraction after -200 iterations");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 35, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 35 to fraction (9,223,372,036,854,775,774/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-100), (double) 52, (-200));
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -100);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction3.divide(fraction6);
        short short8 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -100 + "'", short8 == (short) -100);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction11);
        int int13 = fraction7.compareTo(fraction8);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int16 = fraction15.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction7.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction7.add(fraction21);
        boolean boolean23 = fraction0.equals((java.lang.Object) fraction22);
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction26.abs();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction24.subtract(fraction27);
        int int29 = fraction24.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction0.add(fraction24);
        org.apache.commons.math.fraction.Fraction fraction33 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 97, 100);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction30.subtract(fraction33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction35 = fraction30.reciprocal();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 10L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.negate();
        long long3 = fraction1.longValue();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((int) (byte) 0, 10);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int9 = fraction8.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction6.divide(fraction12);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int20 = fraction17.compareTo(fraction19);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction19.abs();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction15.subtract(fraction19);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction12.add(fraction22);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction1.divide(fraction23);
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        boolean boolean28 = fraction24.equals((java.lang.Object) (short) 0);
        int int29 = fraction24.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction5.subtract(fraction11);
        int int14 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long19 = fraction18.longValue();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction18.negate();
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction23 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.abs();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction23.subtract(fraction26);
        int int28 = fraction22.compareTo(fraction23);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int31 = fraction30.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction30.negate();
        org.apache.commons.math.fraction.Fraction fraction33 = fraction32.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction22.divide(fraction33);
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction22.add(fraction36);
        boolean boolean38 = fraction20.equals((java.lang.Object) fraction37);
        boolean boolean39 = fraction15.equals((java.lang.Object) fraction20);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction43.abs();
        org.apache.commons.math.fraction.Fraction fraction45 = fraction41.subtract(fraction43);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction43.abs();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction43.abs();
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction49.abs();
        org.apache.commons.math.fraction.Fraction fraction51 = fraction43.add(fraction50);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction43.negate();
        org.apache.commons.math.fraction.Fraction fraction53 = fraction43.abs();
        org.apache.commons.math.fraction.Fraction fraction54 = fraction43.reciprocal();
        boolean boolean55 = fraction15.equals((java.lang.Object) fraction43);
        org.apache.commons.math.fraction.Fraction fraction56 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction58 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction58.abs();
        org.apache.commons.math.fraction.Fraction fraction60 = fraction56.subtract(fraction59);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction56.abs();
        org.apache.commons.math.fraction.Fraction fraction62 = fraction61.negate();
        org.apache.commons.math.fraction.Fraction fraction63 = fraction62.abs();
        int int64 = fraction62.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction65 = fraction43.multiply(fraction62);
        double double66 = fraction65.doubleValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-99) + "'", int12 == (-99));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-99) + "'", int14 == (-99));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 2, (-1));
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -2 + "'", short3 == (short) -2);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-100), (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int5 = fraction4.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.reciprocal();
        double double8 = fraction6.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.subtract(fraction6);
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -99, (-1));
        org.apache.commons.math.fraction.Fraction fraction13 = fraction9.subtract(fraction12);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int16 = fraction15.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction15.abs();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction18.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction21.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction21.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int26 = fraction25.getNumerator();
        boolean boolean27 = fraction21.equals((java.lang.Object) fraction25);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction25.negate();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction25.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction18.subtract(fraction29);
        float float31 = fraction18.floatValue();
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction35.abs();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction33.subtract(fraction35);
        org.apache.commons.math.fraction.Fraction fraction40 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction41 = fraction37.subtract(fraction40);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction41.abs();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction18.subtract(fraction42);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction13.divide(fraction18);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction11);
        int int13 = fraction7.compareTo(fraction8);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int16 = fraction15.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction7.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction7.add(fraction21);
        boolean boolean23 = fraction0.equals((java.lang.Object) fraction22);
        int int24 = fraction22.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.TWO;
        int int6 = fraction4.compareTo(fraction5);
        double double7 = fraction4.doubleValue();
        byte byte8 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 32 + "'", byte8 == (byte) 32);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction3.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int12 = fraction11.getNumerator();
        boolean boolean13 = fraction7.equals((java.lang.Object) fraction11);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction11.negate();
        int int15 = fraction3.compareTo(fraction14);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (-1L));
        boolean boolean18 = fraction3.equals((java.lang.Object) (-1L));
        org.apache.commons.math.fraction.Fraction fraction19 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((-100), 1);
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) 0.1f, (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.abs();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction25.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction22.multiply(fraction25);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction32.abs();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction30.subtract(fraction32);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction32.abs();
        org.apache.commons.math.fraction.Fraction fraction36 = fraction32.abs();
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction38.abs();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction32.add(fraction39);
        org.apache.commons.math.fraction.Fraction fraction41 = fraction32.negate();
        org.apache.commons.math.fraction.Fraction fraction42 = fraction28.divide(fraction41);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction19.add(fraction42);
        byte byte44 = fraction42.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 0 + "'", byte44 == (byte) 0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 0.1f, (int) (short) 10);
        double double3 = fraction2.doubleValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1111111111111111d + "'", double3 == 0.1111111111111111d);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long3 = fraction2.longValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.negate();
        java.lang.Class<?> wildcardClass6 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((-0.1d));
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (short) -2);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-114L), (-11));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -114 to fraction (115/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 520, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 520 to fraction (-519/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) '4', (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int5 = fraction4.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction2.abs();
        java.lang.Class<?> wildcardClass11 = fraction2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int10 = fraction6.compareTo(fraction9);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction1.subtract(fraction6);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction13.subtract(fraction15);
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.TWO;
        int int19 = fraction18.intValue();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction17.divide(fraction18);
        int int21 = fraction20.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int24 = fraction23.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.reciprocal();
        double double27 = fraction25.doubleValue();
        int int28 = fraction25.intValue();
        boolean boolean29 = fraction20.equals((java.lang.Object) fraction25);
        int int30 = fraction1.compareTo(fraction25);
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction33.negate();
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction39 = fraction33.multiply(fraction38);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction25.subtract(fraction33);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction45.abs();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction45.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction48 = fraction43.subtract(fraction45);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction40.subtract(fraction45);
        float float50 = fraction49.floatValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-100.0d) + "'", double27 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-100) + "'", int28 == (-100));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + (-200.0f) + "'", float50 == (-200.0f));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.add(fraction10);
        float float12 = fraction10.floatValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int12 = fraction11.getNumerator();
        boolean boolean13 = fraction7.equals((java.lang.Object) fraction11);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction11.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction4.subtract(fraction15);
        float float17 = fraction4.floatValue();
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction21.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction19.subtract(fraction21);
        org.apache.commons.math.fraction.Fraction fraction26 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction27 = fraction23.subtract(fraction26);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction27.abs();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction4.subtract(fraction28);
        byte byte30 = fraction29.byteValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 1 + "'", byte30 == (byte) 1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction1.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.abs();
        double double8 = fraction6.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.multiply(fraction6);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction13.abs();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction11.subtract(fraction13);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction13.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction13.abs();
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction19.abs();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction13.add(fraction20);
        float float22 = fraction13.floatValue();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction6.multiply(fraction13);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction13.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction25 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction27.abs();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction25.subtract(fraction28);
        int int30 = fraction25.intValue();
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction33 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction35.abs();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction33.subtract(fraction36);
        int int38 = fraction32.compareTo(fraction33);
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int41 = fraction40.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction42 = fraction40.negate();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction42.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction32.divide(fraction43);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction32.add(fraction46);
        boolean boolean48 = fraction25.equals((java.lang.Object) fraction47);
        org.apache.commons.math.fraction.Fraction fraction49 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction51.abs();
        org.apache.commons.math.fraction.Fraction fraction53 = fraction49.subtract(fraction52);
        int int54 = fraction49.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction55 = fraction25.add(fraction49);
        org.apache.commons.math.fraction.Fraction fraction57 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int58 = fraction57.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction59 = fraction57.negate();
        org.apache.commons.math.fraction.Fraction fraction60 = fraction59.negate();
        org.apache.commons.math.fraction.Fraction fraction64 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction66 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int67 = fraction66.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction68 = fraction66.negate();
        org.apache.commons.math.fraction.Fraction fraction69 = fraction64.multiply(fraction66);
        org.apache.commons.math.fraction.Fraction fraction70 = fraction59.subtract(fraction64);
        org.apache.commons.math.fraction.Fraction fraction71 = fraction25.add(fraction70);
        org.apache.commons.math.fraction.Fraction fraction72 = fraction13.add(fraction70);
        int int73 = fraction72.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100.01f, 99);
        long long3 = fraction2.longValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int11 = fraction10.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction8.multiply(fraction10);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction3.subtract(fraction8);
        java.lang.Class<?> wildcardClass15 = fraction8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction0.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = org.apache.commons.math.fraction.Fraction.TWO;
        boolean boolean9 = fraction7.equals((java.lang.Object) (short) 100);
        boolean boolean10 = fraction6.equals((java.lang.Object) (short) 100);
        int int11 = fraction6.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int14 = fraction13.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction13.negate();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.reciprocal();
        double double17 = fraction15.doubleValue();
        int int18 = fraction15.intValue();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction6.divide(fraction15);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.abs();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction25.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction27.abs();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction23.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction6.multiply(fraction23);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int35 = fraction32.compareTo(fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction34.abs();
        int int37 = fraction34.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction41.abs();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction39.subtract(fraction41);
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction47.abs();
        org.apache.commons.math.fraction.Fraction fraction49 = fraction45.subtract(fraction47);
        int int50 = fraction49.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction51 = fraction43.subtract(fraction49);
        org.apache.commons.math.fraction.Fraction fraction53 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction55.abs();
        org.apache.commons.math.fraction.Fraction fraction57 = fraction53.subtract(fraction55);
        org.apache.commons.math.fraction.Fraction fraction60 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction61 = fraction57.subtract(fraction60);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction49.multiply(fraction61);
        int int63 = fraction34.compareTo(fraction61);
        int int64 = fraction61.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction67 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', 2);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction61.subtract(fraction67);
        org.apache.commons.math.fraction.Fraction fraction69 = fraction30.multiply(fraction61);
        org.apache.commons.math.fraction.Fraction fraction70 = fraction69.abs();
        short short71 = fraction69.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-100.0d) + "'", double17 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-99) + "'", int50 == (-99));
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 52 + "'", int64 == 52);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) 0 + "'", short71 == (short) 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 0L, 10.0d, 0);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.multiply(fraction9);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction12.add(fraction15);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction18.abs();
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction21.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction21.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction18.add(fraction21);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction21.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int28 = fraction27.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction27.negate();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction29.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction25.add(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction15.add(fraction30);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int35 = fraction34.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction37 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int38 = fraction37.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction39 = fraction37.negate();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction39.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction41 = fraction34.subtract(fraction40);
        double double42 = fraction40.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction32.divide(fraction40);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction3.divide(fraction32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.01d) + "'", double42 == (-0.01d));
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.abs();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction10.subtract(fraction12);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction8.subtract(fraction14);
        int int17 = fraction8.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction2.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction21.negate();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction22.abs();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction18.subtract(fraction22);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction22.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.abs();
        int int27 = fraction26.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-99) + "'", int17 == (-99));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction0.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((int) (byte) 97, 2);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.negate();
        int int11 = fraction6.compareTo(fraction9);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int16 = fraction13.compareTo(fraction15);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction15.abs();
        int int18 = fraction15.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction22.abs();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction20.subtract(fraction22);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction28.abs();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction28);
        int int31 = fraction30.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction24.subtract(fraction30);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction36.abs();
        org.apache.commons.math.fraction.Fraction fraction38 = fraction34.subtract(fraction36);
        org.apache.commons.math.fraction.Fraction fraction41 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction42 = fraction38.subtract(fraction41);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction30.multiply(fraction42);
        int int44 = fraction15.compareTo(fraction42);
        int int45 = fraction42.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction46 = fraction42.abs();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction42.negate();
        java.lang.Class<?> wildcardClass48 = fraction47.getClass();
        boolean boolean49 = fraction6.equals((java.lang.Object) fraction47);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-99) + "'", int31 == (-99));
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -100);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.multiply(fraction9);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction12.add(fraction15);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction18.abs();
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction21.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction21.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction18.add(fraction21);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction21.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int28 = fraction27.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction27.negate();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction29.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction25.add(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction15.add(fraction30);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int35 = fraction34.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction37 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int38 = fraction37.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction39 = fraction37.negate();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction39.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction41 = fraction34.subtract(fraction40);
        double double42 = fraction40.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction32.divide(fraction40);
        boolean boolean44 = fraction2.equals((java.lang.Object) fraction32);
        java.lang.Class<?> wildcardClass45 = fraction32.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.01d) + "'", double42 == (-0.01d));
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction7.add(fraction9);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.abs();
        int int12 = fraction0.compareTo(fraction7);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction14.subtract(fraction16);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction22.abs();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction20.subtract(fraction22);
        int int25 = fraction24.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction18.subtract(fraction24);
        float float27 = fraction24.floatValue();
        boolean boolean28 = fraction7.equals((java.lang.Object) float27);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-99) + "'", int25 == (-99));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-99.0f) + "'", float27 == (-99.0f));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction3.intValue();
        int int6 = fraction3.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        byte byte5 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((-100), (-32));
        float float3 = fraction2.floatValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (-100L), (double) (byte) 1, (int) (byte) -100);
        boolean boolean8 = fraction2.equals((java.lang.Object) (-100L));
        java.lang.Class<?> wildcardClass9 = fraction2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.125f + "'", float3 == 3.125f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -100, (-1));
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (-115.0f));
        org.apache.commons.math.fraction.Fraction fraction4 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, 10);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction10 = fraction6.divide(fraction9);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction1.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction6.subtract(fraction9);
        int int11 = fraction6.intValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = org.apache.commons.math.fraction.Fraction.TWO;
        boolean boolean15 = fraction13.equals((java.lang.Object) (short) 100);
        boolean boolean16 = fraction12.equals((java.lang.Object) (short) 100);
        int int17 = fraction12.getNumerator();
        int int18 = fraction12.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction4.subtract(fraction12);
        int int20 = fraction4.getDenominator();
        byte byte21 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction0.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (-1.0f));
        int int9 = fraction0.compareTo(fraction8);
        short short10 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int6 = fraction3.compareTo(fraction5);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction1.subtract(fraction5);
        int int9 = fraction1.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction11.add(fraction13);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction11.abs();
        org.apache.commons.math.fraction.Fraction fraction16 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction18.abs();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction16.subtract(fraction19);
        int int21 = fraction16.intValue();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction16.negate();
        org.apache.commons.math.fraction.Fraction fraction23 = org.apache.commons.math.fraction.Fraction.TWO;
        boolean boolean25 = fraction23.equals((java.lang.Object) (short) 100);
        boolean boolean26 = fraction22.equals((java.lang.Object) (short) 100);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction15.add(fraction22);
        long long28 = fraction22.longValue();
        boolean boolean29 = fraction1.equals((java.lang.Object) fraction22);
        byte byte30 = fraction22.byteValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(52.0d, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 52 to fraction (-51/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction(0.01d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((-98.98076923076923d), 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1L);
        int int2 = fraction1.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.reciprocal();
        short short4 = fraction3.shortValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.TWO;
        int int7 = fraction6.intValue();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        int int9 = fraction8.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction11.negate();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction13.reciprocal();
        double double15 = fraction13.doubleValue();
        int int16 = fraction13.intValue();
        boolean boolean17 = fraction8.equals((java.lang.Object) fraction13);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction13.negate();
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction20.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction23.abs();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction23.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction20.add(fraction23);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction23.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int30 = fraction29.getNumerator();
        double double31 = fraction29.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction23.divide(fraction29);
        int int33 = fraction13.compareTo(fraction23);
        byte byte34 = fraction23.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-100.0d) + "'", double15 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-100) + "'", int16 == (-100));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 100 + "'", byte34 == (byte) 100);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        int int7 = fraction1.compareTo(fraction2);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction1.divide(fraction12);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction1.add(fraction15);
        double double17 = fraction1.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction20.abs();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction18.subtract(fraction21);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction25 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction27.abs();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction25.subtract(fraction28);
        int int30 = fraction24.compareTo(fraction25);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int33 = fraction32.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction32.negate();
        org.apache.commons.math.fraction.Fraction fraction35 = fraction34.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction36 = fraction24.divide(fraction35);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction35.reciprocal();
        int int38 = fraction21.compareTo(fraction37);
        int int39 = fraction37.intValue();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction1.divide(fraction37);
        int int41 = fraction1.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-100) + "'", int39 == (-100));
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 0.1f, (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long7 = fraction6.longValue();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction6.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int16 = fraction15.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction13.multiply(fraction15);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int25 = fraction24.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction24.negate();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction22.multiply(fraction24);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction27.add(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction15.multiply(fraction31);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction15.negate();
        boolean boolean34 = fraction8.equals((java.lang.Object) fraction33);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction8.abs();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(fraction35);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.multiply(fraction14);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction5.multiply(fraction21);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction27 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-100), (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int30 = fraction29.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction29.negate();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction31.reciprocal();
        double double33 = fraction31.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction27.subtract(fraction31);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction24.divide(fraction27);
        org.apache.commons.math.fraction.Fraction fraction37 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int42 = fraction39.compareTo(fraction41);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction41.abs();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction37.subtract(fraction41);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction24.subtract(fraction41);
        org.apache.commons.math.fraction.Fraction fraction47 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction47.abs();
        int int49 = fraction47.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction50 = fraction47.reciprocal();
        int int51 = fraction50.intValue();
        org.apache.commons.math.fraction.Fraction fraction52 = fraction45.add(fraction50);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction50.abs();
        double double54 = fraction50.doubleValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-100.0d) + "'", double33 == (-100.0d));
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.01d + "'", double54 == 0.01d);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 16L, (int) (short) -2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 16 to fraction (-15/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.add(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.abs();
        long long6 = fraction1.longValue();
        int int7 = fraction1.getDenominator();
        short short8 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int7 = fraction6.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction8);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction8.abs();
        byte byte12 = fraction8.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -100 + "'", byte12 == (byte) -100);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction3.abs();
        float float8 = fraction7.floatValue();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction13.abs();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction13.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction11.subtract(fraction13);
        double double17 = fraction16.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction21.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction19.subtract(fraction21);
        org.apache.commons.math.fraction.Fraction fraction26 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction27 = fraction23.subtract(fraction26);
        int int28 = fraction27.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction16.divide(fraction27);
        int int30 = fraction7.compareTo(fraction27);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-96.8d) + "'", double17 == (-96.8d));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-5147) + "'", int28 == (-5147));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction9 = fraction5.subtract(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean15 = fraction13.equals((java.lang.Object) (short) 0);
        int int16 = fraction13.intValue();
        org.apache.commons.math.fraction.Fraction fraction17 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction19.abs();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction13.subtract(fraction22);
        int int24 = fraction13.intValue();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction9.multiply(fraction13);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.negate();
        short short27 = fraction26.shortValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-32) + "'", int16 == (-32));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-32) + "'", int24 == (-32));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -3167 + "'", short27 == (short) -3167);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.TWO;
        int int7 = fraction6.intValue();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        int int9 = fraction8.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction10 = org.apache.commons.math.fraction.Fraction.TWO;
        boolean boolean12 = fraction10.equals((java.lang.Object) (short) 100);
        double double13 = fraction10.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction8.multiply(fraction10);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        double double18 = fraction16.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction16.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction21.abs();
        double double23 = fraction21.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction19.multiply(fraction21);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction28.abs();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction28);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction28.abs();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction28.abs();
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction34.abs();
        org.apache.commons.math.fraction.Fraction fraction36 = fraction28.add(fraction35);
        float float37 = fraction28.floatValue();
        org.apache.commons.math.fraction.Fraction fraction38 = fraction21.multiply(fraction28);
        boolean boolean39 = fraction10.equals((java.lang.Object) fraction28);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.0d + "'", double13 == 2.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 100.0f + "'", float37 == 100.0f);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 99L, 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 99 to fraction (9,223,372,036,854,775,710/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.TWO;
        int int6 = fraction4.compareTo(fraction5);
        java.lang.Class<?> wildcardClass7 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.multiply(fraction14);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction5.multiply(fraction21);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction23.abs();
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction27.add(fraction29);
        org.apache.commons.math.fraction.Fraction fraction31 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction33.abs();
        org.apache.commons.math.fraction.Fraction fraction35 = fraction31.subtract(fraction34);
        int int36 = fraction34.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction38.abs();
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction41.abs();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction41.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction38.add(fraction41);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction41.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction47 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int48 = fraction47.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction49 = fraction47.negate();
        org.apache.commons.math.fraction.Fraction fraction50 = fraction49.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction51 = fraction45.add(fraction50);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction34.add(fraction50);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction27.multiply(fraction52);
        int int54 = fraction27.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction55 = fraction25.subtract(fraction27);
        int int56 = fraction25.getDenominator();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 9, (-0.019230769230769232d), 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 9 to fraction (9,223,372,036,854,775,800/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction9 = fraction5.subtract(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean15 = fraction13.equals((java.lang.Object) (short) 0);
        int int16 = fraction13.intValue();
        org.apache.commons.math.fraction.Fraction fraction17 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction19.abs();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction13.subtract(fraction22);
        int int24 = fraction13.intValue();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction9.multiply(fraction13);
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction29.abs();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction27.subtract(fraction29);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction29.abs();
        org.apache.commons.math.fraction.Fraction fraction33 = fraction29.abs();
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction35.abs();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction29.add(fraction36);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) 10.0f);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction36.divide(fraction39);
        int int41 = fraction25.compareTo(fraction40);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction45.abs();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction43.subtract(fraction45);
        org.apache.commons.math.fraction.Fraction fraction48 = org.apache.commons.math.fraction.Fraction.TWO;
        int int49 = fraction48.intValue();
        org.apache.commons.math.fraction.Fraction fraction50 = fraction47.divide(fraction48);
        org.apache.commons.math.fraction.Fraction fraction53 = new org.apache.commons.math.fraction.Fraction((-100), 1);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction57 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction58 = fraction57.abs();
        org.apache.commons.math.fraction.Fraction fraction59 = fraction55.subtract(fraction57);
        org.apache.commons.math.fraction.Fraction fraction62 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction63 = fraction59.subtract(fraction62);
        org.apache.commons.math.fraction.Fraction fraction64 = fraction63.abs();
        org.apache.commons.math.fraction.Fraction fraction67 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean69 = fraction67.equals((java.lang.Object) (short) 0);
        int int70 = fraction67.intValue();
        org.apache.commons.math.fraction.Fraction fraction71 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction73 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction74 = fraction73.abs();
        org.apache.commons.math.fraction.Fraction fraction75 = fraction71.subtract(fraction74);
        org.apache.commons.math.fraction.Fraction fraction76 = fraction71.abs();
        org.apache.commons.math.fraction.Fraction fraction77 = fraction67.subtract(fraction76);
        int int78 = fraction67.intValue();
        org.apache.commons.math.fraction.Fraction fraction79 = fraction63.multiply(fraction67);
        org.apache.commons.math.fraction.Fraction fraction80 = fraction79.negate();
        int int81 = fraction53.compareTo(fraction80);
        int int82 = fraction47.compareTo(fraction80);
        org.apache.commons.math.fraction.Fraction fraction83 = fraction40.multiply(fraction80);
        int int84 = fraction80.intValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-32) + "'", int16 == (-32));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-32) + "'", int24 == (-32));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-32) + "'", int70 == (-32));
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-32) + "'", int78 == (-32));
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-3167) + "'", int84 == (-3167));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 98L, (-96.8d), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 98 to fraction (-97/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((-114), (int) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) '#', 99);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int7 = fraction6.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction8);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction8.abs();
        short short12 = fraction8.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -100 + "'", short12 == (short) -100);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction3.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction13 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction15.subtract(fraction17);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction23.abs();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction21.subtract(fraction23);
        int int26 = fraction25.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction19.subtract(fraction25);
        int int28 = fraction19.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction13.divide(fraction19);
        boolean boolean30 = fraction9.equals((java.lang.Object) fraction13);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction32.abs();
        int int34 = fraction32.intValue();
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((double) 1L);
        boolean boolean37 = fraction32.equals((java.lang.Object) fraction36);
        boolean boolean38 = fraction13.equals((java.lang.Object) fraction36);
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction42.abs();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction40.subtract(fraction42);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction42.abs();
        org.apache.commons.math.fraction.Fraction fraction46 = fraction42.abs();
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction48.abs();
        org.apache.commons.math.fraction.Fraction fraction50 = fraction42.add(fraction49);
        org.apache.commons.math.fraction.Fraction fraction52 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction52.abs();
        org.apache.commons.math.fraction.Fraction fraction54 = fraction52.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction55 = fraction54.abs();
        int int56 = fraction49.compareTo(fraction54);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction36.multiply(fraction49);
        short short58 = fraction57.shortValue();
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-99) + "'", int26 == (-99));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-99) + "'", int28 == (-99));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 100 + "'", short58 == (short) 100);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, 10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, 10);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) (-99));
        org.apache.commons.math.fraction.Fraction fraction11 = fraction8.subtract(fraction10);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction8.negate();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction13.negate();
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction18.abs();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction16.subtract(fraction18);
        org.apache.commons.math.fraction.Fraction fraction21 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int25 = fraction21.compareTo(fraction24);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction16.subtract(fraction21);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction30.abs();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction28.subtract(fraction30);
        org.apache.commons.math.fraction.Fraction fraction33 = org.apache.commons.math.fraction.Fraction.TWO;
        int int34 = fraction33.intValue();
        org.apache.commons.math.fraction.Fraction fraction35 = fraction32.divide(fraction33);
        int int36 = fraction35.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int39 = fraction38.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction38.negate();
        org.apache.commons.math.fraction.Fraction fraction41 = fraction40.reciprocal();
        double double42 = fraction40.doubleValue();
        int int43 = fraction40.intValue();
        boolean boolean44 = fraction35.equals((java.lang.Object) fraction40);
        int int45 = fraction16.compareTo(fraction40);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction14.add(fraction40);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction5.subtract(fraction40);
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int52 = fraction49.compareTo(fraction51);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction51.abs();
        int int54 = fraction51.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction56 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction58 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction58.abs();
        org.apache.commons.math.fraction.Fraction fraction60 = fraction56.subtract(fraction58);
        org.apache.commons.math.fraction.Fraction fraction62 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction64 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction65 = fraction64.abs();
        org.apache.commons.math.fraction.Fraction fraction66 = fraction62.subtract(fraction64);
        int int67 = fraction66.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction68 = fraction60.subtract(fraction66);
        org.apache.commons.math.fraction.Fraction fraction70 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction72 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction73 = fraction72.abs();
        org.apache.commons.math.fraction.Fraction fraction74 = fraction70.subtract(fraction72);
        org.apache.commons.math.fraction.Fraction fraction77 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction78 = fraction74.subtract(fraction77);
        org.apache.commons.math.fraction.Fraction fraction79 = fraction66.multiply(fraction78);
        int int80 = fraction51.compareTo(fraction78);
        int int81 = fraction78.getDenominator();
        int int82 = fraction78.getDenominator();
        boolean boolean83 = fraction5.equals((java.lang.Object) int82);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-100.0d) + "'", double42 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-100) + "'", int43 == (-100));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-99) + "'", int67 == (-99));
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 52 + "'", int81 == 52);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 52 + "'", int82 == 52);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        float float9 = fraction5.floatValue();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.reciprocal();
        long long12 = fraction10.longValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-100L) + "'", long12 == (-100L));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-100), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -100 to fraction (101/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((-114), (int) (short) 10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-3167), (int) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction3.intValue();
        byte byte6 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.negate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction0.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.negate();
        float float7 = fraction6.floatValue();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        double double11 = fraction9.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction9.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction14.abs();
        double double16 = fraction14.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.multiply(fraction14);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction21.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction19.subtract(fraction21);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction21.abs();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction21.abs();
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction27.abs();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction21.add(fraction28);
        float float30 = fraction21.floatValue();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction14.multiply(fraction21);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction21.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction33 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction35.abs();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction33.subtract(fraction36);
        int int38 = fraction33.intValue();
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction41 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction43.abs();
        org.apache.commons.math.fraction.Fraction fraction45 = fraction41.subtract(fraction44);
        int int46 = fraction40.compareTo(fraction41);
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int49 = fraction48.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction50 = fraction48.negate();
        org.apache.commons.math.fraction.Fraction fraction51 = fraction50.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction52 = fraction40.divide(fraction51);
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction40.add(fraction54);
        boolean boolean56 = fraction33.equals((java.lang.Object) fraction55);
        org.apache.commons.math.fraction.Fraction fraction57 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction59 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction59.abs();
        org.apache.commons.math.fraction.Fraction fraction61 = fraction57.subtract(fraction60);
        int int62 = fraction57.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction63 = fraction33.add(fraction57);
        org.apache.commons.math.fraction.Fraction fraction65 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int66 = fraction65.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction67 = fraction65.negate();
        org.apache.commons.math.fraction.Fraction fraction68 = fraction67.negate();
        org.apache.commons.math.fraction.Fraction fraction72 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction74 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int75 = fraction74.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction76 = fraction74.negate();
        org.apache.commons.math.fraction.Fraction fraction77 = fraction72.multiply(fraction74);
        org.apache.commons.math.fraction.Fraction fraction78 = fraction67.subtract(fraction72);
        org.apache.commons.math.fraction.Fraction fraction79 = fraction33.add(fraction78);
        org.apache.commons.math.fraction.Fraction fraction80 = fraction21.add(fraction78);
        org.apache.commons.math.fraction.Fraction fraction81 = fraction6.add(fraction80);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction81);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.abs();
        long long5 = fraction1.longValue();
        int int6 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction9 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction13.abs();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction11.subtract(fraction13);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction19.abs();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.subtract(fraction19);
        int int22 = fraction21.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction15.subtract(fraction21);
        int int24 = fraction15.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction9.divide(fraction15);
        boolean boolean26 = fraction1.equals((java.lang.Object) fraction25);
        short short27 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-99) + "'", int22 == (-99));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-99) + "'", int24 == (-99));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 100 + "'", short27 == (short) 100);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 2, (int) (short) -99);
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        int int7 = fraction1.compareTo(fraction2);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction1.divide(fraction12);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction1.add(fraction15);
        byte byte17 = fraction16.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -56 + "'", byte17 == (byte) -56);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-100), (int) (short) -100);
        double double3 = fraction2.doubleValue();
        double double4 = fraction2.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) -56, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
        int int7 = fraction1.compareTo(fraction2);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction1.divide(fraction12);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int20 = fraction19.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction19.negate();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction17.multiply(fraction19);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int29 = fraction28.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction28.negate();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.multiply(fraction28);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction31.add(fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction19.multiply(fraction35);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction19.negate();
        org.apache.commons.math.fraction.Fraction fraction38 = fraction37.negate();
        org.apache.commons.math.fraction.Fraction fraction41 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-100), (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int44 = fraction43.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction45 = fraction43.negate();
        org.apache.commons.math.fraction.Fraction fraction46 = fraction45.reciprocal();
        double double47 = fraction45.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction48 = fraction41.subtract(fraction45);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction38.divide(fraction41);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction13.add(fraction41);
        org.apache.commons.math.fraction.Fraction fraction53 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long54 = fraction53.longValue();
        org.apache.commons.math.fraction.Fraction fraction55 = fraction53.abs();
        org.apache.commons.math.fraction.Fraction fraction56 = fraction55.negate();
        org.apache.commons.math.fraction.Fraction fraction58 = new org.apache.commons.math.fraction.Fraction((double) (byte) -100);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction55.subtract(fraction58);
        org.apache.commons.math.fraction.Fraction fraction63 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction65 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction65.abs();
        org.apache.commons.math.fraction.Fraction fraction67 = fraction65.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction68 = fraction67.abs();
        org.apache.commons.math.fraction.Fraction fraction69 = fraction63.divide(fraction68);
        org.apache.commons.math.fraction.Fraction fraction70 = fraction69.abs();
        org.apache.commons.math.fraction.Fraction fraction73 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction75 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction77 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction78 = fraction77.abs();
        org.apache.commons.math.fraction.Fraction fraction79 = fraction75.subtract(fraction77);
        org.apache.commons.math.fraction.Fraction fraction81 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction83 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction84 = fraction83.abs();
        org.apache.commons.math.fraction.Fraction fraction85 = fraction81.subtract(fraction83);
        int int86 = fraction85.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction87 = fraction79.subtract(fraction85);
        int int88 = fraction79.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction89 = fraction73.divide(fraction79);
        boolean boolean90 = fraction69.equals((java.lang.Object) fraction73);
        org.apache.commons.math.fraction.Fraction fraction91 = fraction69.reciprocal();
        int int92 = fraction59.compareTo(fraction91);
        java.lang.Class<?> wildcardClass93 = fraction91.getClass();
        boolean boolean94 = fraction50.equals((java.lang.Object) wildcardClass93);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-100.0d) + "'", double47 == (-100.0d));
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-99) + "'", int86 == (-99));
        org.junit.Assert.assertNotNull(fraction87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-99) + "'", int88 == (-99));
        org.junit.Assert.assertNotNull(fraction89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(fraction91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.add(fraction11);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction14.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction14.add(fraction17);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int24 = fraction23.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction21.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction11.add(fraction26);
        double double29 = fraction11.doubleValue();
        short short30 = fraction11.shortValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 0 + "'", short30 == (short) 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int2 = fraction1.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int5 = fraction4.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction1.subtract(fraction7);
        double double9 = fraction7.doubleValue();
        java.lang.Class<?> wildcardClass10 = fraction7.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.01d) + "'", double9 == (-0.01d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        int int3 = fraction2.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction2.abs();
        short short6 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.getNumerator();
        float float6 = fraction0.floatValue();
        boolean boolean8 = fraction0.equals((java.lang.Object) (-1.0d));
        int int9 = fraction0.getNumerator();
        byte byte10 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-0.01f), (double) (short) -99, (int) (byte) -98);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Unable to convert -0.01 to fraction after -98 iterations");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 10L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.negate();
        long long3 = fraction1.longValue();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((int) (byte) 0, 10);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int9 = fraction8.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction6.divide(fraction12);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int20 = fraction17.compareTo(fraction19);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction19.abs();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction15.subtract(fraction19);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction12.add(fraction22);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction1.divide(fraction23);
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        boolean boolean28 = fraction24.equals((java.lang.Object) (short) 0);
        byte byte29 = fraction24.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 0 + "'", byte29 == (byte) 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.abs();
        java.lang.Class<?> wildcardClass8 = fraction7.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(0, (int) (byte) 2);
        int int3 = fraction2.getDenominator();
        int int4 = fraction2.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction13.subtract(fraction15);
        int int18 = fraction17.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction11.subtract(fraction17);
        int int20 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction5.divide(fraction11);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction2.subtract(fraction21);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) 52);
        int int25 = fraction2.compareTo(fraction24);
        byte byte26 = fraction24.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-99) + "'", int18 == (-99));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-99) + "'", int20 == (-99));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 52 + "'", byte26 == (byte) 52);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-3167), (double) (-99.0f), (-98));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -3,167 to fraction (-9,223,372,036,854,772,640/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-1), (int) (byte) 100);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        double double9 = fraction7.doubleValue();
        int int10 = fraction7.getNumerator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int4 = fraction1.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.abs();
        int int6 = fraction3.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction10);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction14.subtract(fraction16);
        int int19 = fraction18.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction12.subtract(fraction18);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction24.abs();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction22.subtract(fraction24);
        org.apache.commons.math.fraction.Fraction fraction29 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction29);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction18.multiply(fraction30);
        int int32 = fraction3.compareTo(fraction30);
        int int33 = fraction30.getDenominator();
        double double34 = fraction30.doubleValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-99) + "'", int19 == (-99));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-98.98076923076923d) + "'", double34 == (-98.98076923076923d));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (-0.01923077f));
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-100L));
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.divide(fraction3);
        short short5 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -100 + "'", short5 == (short) -100);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        float float9 = fraction5.floatValue();
        float float10 = fraction5.floatValue();
        byte byte11 = fraction5.byteValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (byte) 16);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(200.0d, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 200 to fraction (-199/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction1.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.abs();
        double double8 = fraction6.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.multiply(fraction6);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction13.abs();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction11.subtract(fraction13);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction13.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction13.abs();
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction19.abs();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction13.add(fraction20);
        float float22 = fraction13.floatValue();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction6.multiply(fraction13);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction13.reciprocal();
        byte byte25 = fraction24.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 200L);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-99), (-32));
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction5.subtract(fraction7);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction2.subtract(fraction10);
        float float12 = fraction11.floatValue();
        short short13 = fraction11.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 99.89375f + "'", float12 == 99.89375f);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 99 + "'", short13 == (short) 99);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 97, 2);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        long long4 = fraction2.longValue();
        byte byte5 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 48L + "'", long4 == 48L);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 48 + "'", byte5 == (byte) 48);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1L);
        int int2 = fraction1.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long6 = fraction5.longValue();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.abs();
        int int8 = fraction5.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction10.add(fraction12);
        boolean boolean14 = fraction5.equals((java.lang.Object) fraction12);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction12.abs();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction1.add(fraction15);
        short short17 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction1.add(fraction6);
        long long10 = fraction9.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 200L + "'", long10 == 200L);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(1, (-32));
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((int) (byte) 2, (int) (short) -99);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction2.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction10);
        org.apache.commons.math.fraction.Fraction fraction15 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction16 = fraction12.subtract(fraction15);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        int int18 = fraction17.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction20.abs();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction23.abs();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction23.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction20.add(fraction23);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction23.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int30 = fraction29.getNumerator();
        double double31 = fraction29.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction23.divide(fraction29);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction17.add(fraction23);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction17.negate();
        int int35 = fraction6.compareTo(fraction17);
        short short36 = fraction17.shortValue();
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 98 + "'", short36 == (short) 98);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction5.subtract(fraction11);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction15.subtract(fraction17);
        org.apache.commons.math.fraction.Fraction fraction22 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction23 = fraction19.subtract(fraction22);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction11.multiply(fraction23);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction28.abs();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction28);
        org.apache.commons.math.fraction.Fraction fraction31 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 10);
        int int35 = fraction31.compareTo(fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction26.subtract(fraction31);
        boolean boolean37 = fraction23.equals((java.lang.Object) fraction36);
        org.apache.commons.math.fraction.Fraction fraction40 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        long long41 = fraction40.longValue();
        boolean boolean42 = fraction23.equals((java.lang.Object) long41);
        int int43 = fraction23.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction45 = fraction23.add(fraction44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-99) + "'", int12 == (-99));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int4 = fraction1.compareTo(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.abs();
        int int6 = fraction3.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction10);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction14.subtract(fraction16);
        int int19 = fraction18.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction12.subtract(fraction18);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction24.abs();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction22.subtract(fraction24);
        org.apache.commons.math.fraction.Fraction fraction29 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction29);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction18.multiply(fraction30);
        int int32 = fraction3.compareTo(fraction30);
        int int33 = fraction30.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction36 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', 2);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction30.subtract(fraction36);
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((int) '4', (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int43 = fraction42.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction42.negate();
        org.apache.commons.math.fraction.Fraction fraction45 = fraction42.abs();
        org.apache.commons.math.fraction.Fraction fraction46 = fraction45.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction40.divide(fraction46);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction37.subtract(fraction47);
        int int49 = fraction47.intValue();
        byte byte50 = fraction47.byteValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-99) + "'", int19 == (-99));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 520 + "'", int49 == 520);
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 8 + "'", byte50 == (byte) 8);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int12 = fraction11.getNumerator();
        boolean boolean13 = fraction7.equals((java.lang.Object) fraction11);
        int int14 = fraction7.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction5.add(fraction7);
        int int16 = fraction15.intValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction1.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int11 = fraction10.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction8.add(fraction13);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction19.abs();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.subtract(fraction19);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.abs();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction23.subtract(fraction25);
        int int28 = fraction27.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction21.subtract(fraction27);
        int int30 = fraction21.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction33 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction35.abs();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction33.subtract(fraction36);
        int int38 = fraction32.compareTo(fraction33);
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int41 = fraction40.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction42 = fraction40.negate();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction42.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction32.divide(fraction43);
        long long45 = fraction32.longValue();
        org.apache.commons.math.fraction.Fraction fraction46 = fraction21.multiply(fraction32);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction14.subtract(fraction21);
        org.apache.commons.math.fraction.Fraction fraction50 = new org.apache.commons.math.fraction.Fraction(2, 52);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction47.add(fraction50);
        java.lang.Class<?> wildcardClass52 = fraction47.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-99) + "'", int28 == (-99));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-99) + "'", int30 == (-99));
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L + "'", long45 == 100L);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 0);
        long long2 = fraction1.longValue();
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction5.subtract(fraction7);
        double double11 = fraction10.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction13.subtract(fraction15);
        org.apache.commons.math.fraction.Fraction fraction20 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.subtract(fraction20);
        int int22 = fraction21.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction10.divide(fraction21);
        int int24 = fraction1.compareTo(fraction23);
        int int25 = fraction23.getNumerator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-96.8d) + "'", double11 == (-96.8d));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-5147) + "'", int22 == (-5147));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 25168 + "'", int25 == 25168);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction11);
        int int13 = fraction7.compareTo(fraction8);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int16 = fraction15.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction7.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction7.add(fraction21);
        boolean boolean23 = fraction0.equals((java.lang.Object) fraction22);
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction26.abs();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction24.subtract(fraction27);
        int int29 = fraction24.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction0.add(fraction24);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int33 = fraction32.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction32.negate();
        org.apache.commons.math.fraction.Fraction fraction35 = fraction34.negate();
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int42 = fraction41.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction41.negate();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction39.multiply(fraction41);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction34.subtract(fraction39);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction0.add(fraction45);
        org.apache.commons.math.fraction.Fraction fraction47 = org.apache.commons.math.fraction.Fraction.MINUS_ONE;
        int int48 = fraction47.getDenominator();
        int int49 = fraction46.compareTo(fraction47);
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction53 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int54 = fraction51.compareTo(fraction53);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction53.abs();
        int int56 = fraction53.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction58 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction60 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction60.abs();
        org.apache.commons.math.fraction.Fraction fraction62 = fraction58.subtract(fraction60);
        org.apache.commons.math.fraction.Fraction fraction64 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction66 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction67 = fraction66.abs();
        org.apache.commons.math.fraction.Fraction fraction68 = fraction64.subtract(fraction66);
        int int69 = fraction68.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction70 = fraction62.subtract(fraction68);
        org.apache.commons.math.fraction.Fraction fraction72 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction74 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction75 = fraction74.abs();
        org.apache.commons.math.fraction.Fraction fraction76 = fraction72.subtract(fraction74);
        org.apache.commons.math.fraction.Fraction fraction79 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction80 = fraction76.subtract(fraction79);
        org.apache.commons.math.fraction.Fraction fraction81 = fraction68.multiply(fraction80);
        int int82 = fraction53.compareTo(fraction80);
        org.apache.commons.math.fraction.Fraction fraction83 = fraction47.multiply(fraction53);
        int int84 = fraction83.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-99) + "'", int69 == (-99));
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (byte) -56, (int) (short) 99);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.TWO;
        int int6 = fraction4.compareTo(fraction5);
        int int7 = fraction4.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.subtract(fraction11);
        int int13 = fraction7.compareTo(fraction8);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int16 = fraction15.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction7.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction7.add(fraction21);
        boolean boolean23 = fraction0.equals((java.lang.Object) fraction22);
        int int24 = fraction0.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction28.abs();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction26.subtract(fraction28);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction28.abs();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction28.abs();
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction34.abs();
        org.apache.commons.math.fraction.Fraction fraction36 = fraction28.add(fraction35);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction38.abs();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction38.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction41 = fraction40.abs();
        int int42 = fraction35.compareTo(fraction40);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction0.subtract(fraction40);
        long long44 = fraction43.longValue();
        int int45 = fraction43.getNumerator();
        java.lang.Class<?> wildcardClass46 = fraction43.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        boolean boolean7 = fraction1.equals((java.lang.Object) fraction5);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction5.negate();
        long long9 = fraction5.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (-11L));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.TWO;
        int int7 = fraction6.intValue();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((-100), 1);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction13.subtract(fraction15);
        org.apache.commons.math.fraction.Fraction fraction20 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction21.abs();
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean27 = fraction25.equals((java.lang.Object) (short) 0);
        int int28 = fraction25.intValue();
        org.apache.commons.math.fraction.Fraction fraction29 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction31 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction31.abs();
        org.apache.commons.math.fraction.Fraction fraction33 = fraction29.subtract(fraction32);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction29.abs();
        org.apache.commons.math.fraction.Fraction fraction35 = fraction25.subtract(fraction34);
        int int36 = fraction25.intValue();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction21.multiply(fraction25);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction37.negate();
        int int39 = fraction11.compareTo(fraction38);
        int int40 = fraction5.compareTo(fraction38);
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int47 = fraction46.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction48 = fraction46.negate();
        org.apache.commons.math.fraction.Fraction fraction49 = fraction44.multiply(fraction46);
        org.apache.commons.math.fraction.Fraction fraction53 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int56 = fraction55.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction57 = fraction55.negate();
        org.apache.commons.math.fraction.Fraction fraction58 = fraction53.multiply(fraction55);
        org.apache.commons.math.fraction.Fraction fraction61 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction58.add(fraction61);
        org.apache.commons.math.fraction.Fraction fraction63 = fraction46.multiply(fraction62);
        org.apache.commons.math.fraction.Fraction fraction64 = fraction46.negate();
        org.apache.commons.math.fraction.Fraction fraction65 = fraction64.negate();
        org.apache.commons.math.fraction.Fraction fraction68 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-100), (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction70 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int71 = fraction70.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction72 = fraction70.negate();
        org.apache.commons.math.fraction.Fraction fraction73 = fraction72.reciprocal();
        double double74 = fraction72.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction75 = fraction68.subtract(fraction72);
        org.apache.commons.math.fraction.Fraction fraction76 = fraction65.divide(fraction68);
        org.apache.commons.math.fraction.Fraction fraction78 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction80 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction82 = new org.apache.commons.math.fraction.Fraction((double) 1);
        int int83 = fraction80.compareTo(fraction82);
        org.apache.commons.math.fraction.Fraction fraction84 = fraction82.abs();
        org.apache.commons.math.fraction.Fraction fraction85 = fraction78.subtract(fraction82);
        org.apache.commons.math.fraction.Fraction fraction86 = fraction65.subtract(fraction82);
        org.apache.commons.math.fraction.Fraction fraction88 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction89 = fraction88.abs();
        int int90 = fraction88.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction91 = fraction88.reciprocal();
        int int92 = fraction91.intValue();
        org.apache.commons.math.fraction.Fraction fraction93 = fraction86.add(fraction91);
        org.apache.commons.math.fraction.Fraction fraction94 = fraction5.subtract(fraction86);
        int int95 = fraction5.intValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-32) + "'", int28 == (-32));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-32) + "'", int36 == (-32));
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-100.0d) + "'", double74 == (-100.0d));
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertNotNull(fraction86);
        org.junit.Assert.assertNotNull(fraction89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertNotNull(fraction91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(fraction93);
        org.junit.Assert.assertNotNull(fraction94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-99) + "'", int95 == (-99));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -99, (int) (short) 1);
        float float3 = fraction2.floatValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-99.0f) + "'", float3 == (-99.0f));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 0.0f, (double) (-98L), (-100));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction1.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int11 = fraction10.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction8.add(fraction13);
        int int15 = fraction13.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((-200.0d), 0.0d, (int) (byte) -56);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -200 to fraction (201/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction6.subtract(fraction8);
        org.apache.commons.math.fraction.Fraction fraction11 = org.apache.commons.math.fraction.Fraction.TWO;
        int int12 = fraction11.intValue();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction10.divide(fraction11);
        int int14 = fraction13.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int17 = fraction16.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction16.negate();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction18.reciprocal();
        double double20 = fraction18.doubleValue();
        int int21 = fraction18.intValue();
        boolean boolean22 = fraction13.equals((java.lang.Object) fraction18);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction18.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction3.add(fraction18);
        float float25 = fraction18.floatValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-100.0d) + "'", double20 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-100.0f) + "'", float25 == (-100.0f));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        boolean boolean4 = fraction2.equals((java.lang.Object) (short) 0);
        int int5 = fraction2.intValue();
        int int6 = fraction2.intValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-32) + "'", int5 == (-32));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-32) + "'", int6 == (-32));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.multiply(fraction14);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction5.multiply(fraction21);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction26.abs();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction26.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction28.abs();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction24.subtract(fraction29);
        int int31 = fraction29.getDenominator();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-100.0f), (int) (byte) 8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -100 to fraction (101/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) -100, (-1));
        org.apache.commons.math.fraction.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction4 = fraction2.add(fraction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 3.125f);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.add(fraction11);
        org.apache.commons.math.fraction.Fraction fraction15 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        org.apache.commons.math.fraction.Fraction fraction16 = fraction11.add(fraction15);
        byte byte17 = fraction15.byteValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        long long3 = fraction2.longValue();
        byte byte4 = fraction2.byteValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-32L) + "'", long3 == (-32L));
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -32 + "'", byte4 == (byte) -32);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (byte) 1, (int) (byte) 16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-114L), (double) (byte) -56, 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -114 to fraction (115/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction1.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction4.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int11 = fraction10.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction14 = fraction8.add(fraction13);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction19.abs();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.subtract(fraction19);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.abs();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction23.subtract(fraction25);
        int int28 = fraction27.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction21.subtract(fraction27);
        int int30 = fraction21.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction33 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction35.abs();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction33.subtract(fraction36);
        int int38 = fraction32.compareTo(fraction33);
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int41 = fraction40.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction42 = fraction40.negate();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction42.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction32.divide(fraction43);
        long long45 = fraction32.longValue();
        org.apache.commons.math.fraction.Fraction fraction46 = fraction21.multiply(fraction32);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction14.subtract(fraction21);
        int int48 = fraction21.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-99) + "'", int28 == (-99));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-99) + "'", int30 == (-99));
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L + "'", long45 == 100L);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-99) + "'", int48 == (-99));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) -100, (int) (byte) 97);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 99, (int) (byte) 16);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction6.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction11 = org.apache.commons.math.fraction.Fraction.getReducedFraction(0, (int) (byte) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction12 = fraction8.divide(fraction11);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction11);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.TWO;
        int int6 = fraction4.compareTo(fraction5);
        double double7 = fraction4.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction12.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction15.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int20 = fraction19.getNumerator();
        boolean boolean21 = fraction15.equals((java.lang.Object) fraction19);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction19.negate();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction19.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction12.subtract(fraction23);
        float float25 = fraction12.floatValue();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction4.add(fraction12);
        int int27 = fraction12.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(0.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-99.0f), (double) 52, (int) (byte) -1);
        float float4 = fraction3.floatValue();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-99.0f) + "'", float4 == (-99.0f));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100, (double) 32, (int) 'a');
        byte byte4 = fraction3.byteValue();
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 99, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction5.subtract(fraction11);
        int int14 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction17 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction19.abs();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction17.subtract(fraction20);
        int int22 = fraction16.compareTo(fraction17);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int25 = fraction24.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction24.negate();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction26.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction16.divide(fraction27);
        long long29 = fraction16.longValue();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction5.multiply(fraction16);
        long long31 = fraction16.longValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-99) + "'", int12 == (-99));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-99) + "'", int14 == (-99));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction0.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (-1.0f));
        int int9 = fraction0.compareTo(fraction8);
        short short10 = fraction8.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 10.0f, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) 'a', 99);
        org.apache.commons.math.fraction.Fraction fraction3 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction3.subtract(fraction6);
        int int8 = fraction3.intValue();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction10 = org.apache.commons.math.fraction.Fraction.TWO;
        boolean boolean12 = fraction10.equals((java.lang.Object) (short) 100);
        boolean boolean13 = fraction9.equals((java.lang.Object) (short) 100);
        int int14 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int17 = fraction16.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction16.negate();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction18.reciprocal();
        double double20 = fraction18.doubleValue();
        int int21 = fraction18.intValue();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction9.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 1L, (double) (byte) 97, (-100));
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction28.abs();
        org.apache.commons.math.fraction.Fraction fraction30 = fraction28.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction30.abs();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction26.divide(fraction31);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction9.multiply(fraction26);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction2.add(fraction26);
        float float35 = fraction26.floatValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-100.0d) + "'", double20 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-200.0f), (int) (short) -3167);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -200 to fraction (201/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 10, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(100, (-1));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction0.subtract(fraction3);
        int int5 = fraction0.intValue();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction0.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = org.apache.commons.math.fraction.Fraction.TWO;
        boolean boolean9 = fraction7.equals((java.lang.Object) (short) 100);
        boolean boolean10 = fraction6.equals((java.lang.Object) (short) 100);
        double double11 = fraction6.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -1, (int) '4');
        int int3 = fraction2.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction6.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int11 = fraction10.getNumerator();
        boolean boolean12 = fraction6.equals((java.lang.Object) fraction10);
        int int13 = fraction4.compareTo(fraction10);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction4.reciprocal();
        double double15 = fraction14.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        byte byte17 = fraction16.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -52 + "'", byte17 == (byte) -52);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) (short) 100, (int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 100L);
        int int6 = fraction5.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction5);
        float float9 = fraction5.floatValue();
        float float10 = fraction5.floatValue();
        double double11 = fraction5.doubleValue();
        long long12 = fraction5.longValue();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }
}

