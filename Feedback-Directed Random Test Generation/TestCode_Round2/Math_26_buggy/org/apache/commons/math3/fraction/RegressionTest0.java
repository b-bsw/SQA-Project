package org.apache.commons.math3.fraction;

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
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        java.lang.Class<?> wildcardClass6 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        byte byte4 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        byte byte5 = fraction1.byteValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        byte byte4 = fraction3.byteValue();
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) 'a', (int) (short) 1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 3/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 1);
        int int4 = fraction0.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        double double1 = fraction0.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.0d + "'", double1 == 75.0d);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 100L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        long long2 = fraction0.longValue();
        byte byte3 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1), (double) 1.0f, (int) (byte) 1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.abs();
        byte byte5 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add(fraction4);
        byte byte6 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(1.0d, (double) 1, (int) (short) 10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        short short2 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -1 to fraction (-9,223,372,036,854,775,806/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (short) 10, (double) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (short) -1, (double) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -1 to fraction (-9,223,372,036,854,775,806/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.divide(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 100L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(10, (int) (short) 10);
        int int3 = fraction2.getNumerator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (-1.0f), 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        java.lang.Class<?> wildcardClass5 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.negate();
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        java.lang.Class<?> wildcardClass4 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.divide(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 3/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        java.lang.Class<?> wildcardClass1 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.multiply(fraction6);
        java.lang.Class<?> wildcardClass10 = fraction9.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, (double) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.multiply(fraction6);
        double double10 = fraction9.doubleValue();
        long long11 = fraction9.longValue();
        short short12 = fraction9.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.5d) + "'", double10 == (-0.5d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        byte byte3 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        java.lang.Class<?> wildcardClass3 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        double double4 = fraction0.doubleValue();
        long long5 = fraction0.longValue();
        java.lang.String str6 = fraction0.toString();
        java.lang.String str7 = fraction0.toString();
        double double8 = fraction0.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25d + "'", double4 == 0.25d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 35 + "'", short3 == (short) 35);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(4, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 4/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add(fraction4);
        java.lang.Class<?> wildcardClass6 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        boolean boolean7 = fraction1.equals((java.lang.Object) fraction6);
        java.lang.Class<?> wildcardClass8 = fraction6.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction8);
        java.lang.Class<?> wildcardClass12 = fraction11.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction2.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        long long6 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double11 = fraction10.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = fraction12.compareTo(fraction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7500.0d + "'", double11 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 1);
        short short4 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 9L, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 9 to fraction (9,223,372,036,854,775,800/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(1.0d, 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.5d, (-0.5d), (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0.5 to fraction (9,223,372,036,854,775,807/-1)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        short short8 = fraction7.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 2/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 5, (double) 0.0f, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 5 to fraction (9,223,372,036,854,775,804/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction13.negate();
        int int15 = fraction8.compareTo(fraction14);
        float float16 = fraction8.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction5.subtract(fraction8);
        java.lang.Class<?> wildcardClass19 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.25f + "'", float16 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        short short2 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.divide((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE;
        java.lang.String str9 = fraction8.toString();
        int int10 = fraction8.getDenominator();
        boolean boolean11 = fraction7.equals((java.lang.Object) int10);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction11.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction7.subtract(fraction22);
        java.lang.Class<?> wildcardClass24 = fraction7.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        double double2 = fraction1.percentageValue();
        float float3 = fraction1.floatValue();
        java.lang.Class<?> wildcardClass4 = fraction1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3500.0d + "'", double2 == 3500.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        int int11 = fraction10.intValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        long long3 = fraction2.longValue();
        short short4 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 10, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        byte byte11 = fraction10.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 7 + "'", byte11 == (byte) 7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 7, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 7/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 7, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 7/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(35, 10);
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 3 + "'", byte3 == (byte) 3);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-20.0d), 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -20 to fraction (21/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 100/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, 0.25d, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.reciprocal();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long6 = fraction5.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction5.getField();
        long long8 = fraction5.longValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction2.divide(fraction5);
        short short10 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        java.lang.Class<?> wildcardClass2 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.negate();
        int int7 = fraction4.getNumerator();
        java.lang.Class<?> wildcardClass8 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction4.getField();
        java.lang.Class<?> wildcardClass7 = fractionField6.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        int int10 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction15 = fraction11.subtract(fraction14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 10.0f);
        long long2 = fraction1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 32/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 100);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long11 = fraction10.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction10.getField();
        long long13 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.divide(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction4.add(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction4.abs();
        float float17 = fraction4.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) ' ');
        java.lang.String str7 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.reciprocal();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 4" + "'", str4, "1 / 4");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        int int3 = fraction2.intValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction1.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide(fraction12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.add((int) '#');
        boolean boolean14 = fraction9.equals((java.lang.Object) fraction11);
        long long15 = fraction11.longValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double20 = fraction19.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction11.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.negate();
        int int23 = fraction8.compareTo(fraction22);
        byte byte24 = fraction8.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7500.0d + "'", double20 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        short short4 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 35 to fraction (9,223,372,036,854,775,774/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, 4);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 35, (double) (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 35 to fraction (9,223,372,036,854,775,774/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-20.0d), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -20 to fraction (21/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (short) 1);
        short short5 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(3500.0d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 3,500 to fraction (-3,499/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_THIRDS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(5);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-1), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction -1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        byte byte10 = fraction9.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        java.lang.String str8 = fraction0.toString();
        float float9 = fraction0.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 / 4" + "'", str8, "1 / 4");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction1.getField();
        java.lang.Class<?> wildcardClass4 = fractionField3.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction0.getField();
        short short3 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.014423076923076924d, (-0.5d), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0.014 to fraction (70,368,744,177,664/4,878,899,596,318,037)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide((int) '4');
        short short4 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        long long2 = fraction0.longValue();
        java.lang.Class<?> wildcardClass3 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        java.lang.Class<?> wildcardClass11 = fraction6.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        int int9 = fraction3.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = fraction10.compareTo(fraction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math3.fraction.Fraction fraction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        short short2 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        int int6 = fraction5.intValue();
        short short7 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        double double2 = fraction1.percentageValue();
        float float3 = fraction1.floatValue();
        short short4 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3500.0d + "'", double2 == 3500.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 35 + "'", short4 == (short) 35);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        byte byte11 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 8 + "'", byte11 == (byte) 8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.add((int) (short) 10);
        byte byte4 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 20 + "'", byte4 == (byte) 20);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 97 to fraction (9,223,372,036,854,775,712/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 35.0f, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 35 to fraction (9,223,372,036,854,775,774/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        java.lang.Class<?> wildcardClass9 = fraction6.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.abs();
        float float5 = fraction0.floatValue();
        java.lang.Class<?> wildcardClass6 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction1.add(fraction9);
        java.lang.Class<?> wildcardClass11 = fraction9.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.multiply(fraction6);
        boolean boolean11 = fraction9.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        int int5 = fraction4.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double10 = fraction9.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.divide(fraction9);
        int int12 = fraction11.intValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7500.0d + "'", double10 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.add(10);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.abs();
        byte byte9 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 32 + "'", byte9 == (byte) 32);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.014423076923076924d, (int) (short) -1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-1.0d));
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        double double4 = fraction0.doubleValue();
        long long5 = fraction0.longValue();
        java.lang.String str6 = fraction0.toString();
        int int7 = fraction0.getDenominator();
        double double8 = fraction0.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25d + "'", double4 == 0.25d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 3 to fraction (9,223,372,036,854,775,806/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1L);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.reciprocal();
        boolean boolean5 = fraction2.equals((java.lang.Object) 800.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(4, (int) (short) 35);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        int int11 = fraction10.getNumerator();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.subtract((int) (short) 0);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.abs();
        short short9 = fraction8.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int11 = fraction10.getNumerator();
        long long12 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction0.add(fraction15);
        java.lang.String str18 = fraction15.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(2);
        java.lang.Class<?> wildcardClass5 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(10033.333333333332d, (double) 0L, (-3));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Unable to convert 10,033.333 to fraction after -3 iterations");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 10, (int) (short) 1);
        double double3 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.add((int) (byte) 3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double7 = fraction6.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction18.negate();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction14.subtract(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction25 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction14.add(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction6.subtract(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction27.subtract(800);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction2.add(fraction31);
        short short33 = fraction31.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) -802 + "'", short33 == (short) -802);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.add(10);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.abs();
        short short9 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 800 + "'", short9 == (short) 800);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (short) 1);
        byte byte5 = fraction1.byteValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (short) -802, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -802 to fraction (803/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.divide(1);
        java.lang.Class<?> wildcardClass7 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-10), 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.subtract(200);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        byte byte9 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -5 + "'", byte9 == (byte) -5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 1.0f, (double) (-1L), (int) (short) 800);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, (-100));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 0.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.multiply((int) 'a');
        long long8 = fraction5.longValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5L) + "'", long8 == (-5L));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        double double11 = fraction10.doubleValue();
        java.lang.Class<?> wildcardClass12 = fraction10.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.2d + "'", double11 == 10.2d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.divide(1);
        short short7 = fraction6.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-3), (double) (short) 800, (int) (short) 100);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        int int5 = fraction4.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double10 = fraction9.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.abs();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7500.0d + "'", double10 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 10);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.divide(1);
        float float7 = fraction6.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-0.2f) + "'", float7 == (-0.2f));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.subtract(fraction8);
        int int11 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction0.multiply(fraction15);
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction0.subtract(3);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction19);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 35, (double) 1L, (int) '#');
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.subtract(fraction5);
        int int8 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction1.add(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction3.subtract((int) (byte) 32);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.divide(fraction18);
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction18.getField();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fractionField20);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-1.0d), (double) 0L, (int) (byte) 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -1 to fraction (-9,223,372,036,854,775,806/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 101.0f, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 101 to fraction (9,223,372,036,854,775,708/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        long long6 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double11 = fraction10.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction10);
        short short13 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7500.0d + "'", double11 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        int int9 = fraction3.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.abs();
        short short11 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(1);
        short short7 = fraction4.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 20);
        int int2 = fraction1.getNumerator();
        short short3 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 20 + "'", short3 == (short) 20);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, (double) 101.0f, (int) (short) 1);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.divide(fraction2);
        double double5 = fraction0.doubleValue();
        double double6 = fraction0.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.25d + "'", double5 == 0.25d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.25d + "'", double6 == 0.25d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(2);
        short short5 = fraction4.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -198 + "'", short5 == (short) -198);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        int int10 = fraction9.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction14 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double15 = fraction14.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction9.divide(fraction14);
        java.lang.Object obj17 = null;
        boolean boolean18 = fraction14.equals(obj17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction3.subtract(fraction14);
        int int20 = fraction14.getNumerator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7500.0d + "'", double15 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 75 + "'", int20 == 75);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 0.0f, (int) (short) -802);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 100L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction0.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.multiply((int) '#');
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction13.getField();
        boolean boolean17 = fraction11.equals((java.lang.Object) fractionField16);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (-3), 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -3 to fraction (-9,223,372,036,854,775,804/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 1L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) -802, (int) (short) -198);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) 'a', (int) (byte) 1);
        int int3 = fraction2.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.add(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction1.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction1.add(fraction12);
        short short17 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 2" + "'", str9, "1 / 2");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction12.add(fraction15);
        long long19 = fraction18.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-143L) + "'", long19 == (-143L));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int11 = fraction10.getNumerator();
        long long12 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction0.add(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (byte) -5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -5 to fraction (-9,223,372,036,854,775,802/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        double double4 = fraction0.doubleValue();
        long long5 = fraction0.longValue();
        java.lang.String str6 = fraction0.toString();
        java.lang.String str7 = fraction0.toString();
        java.lang.Class<?> wildcardClass8 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25d + "'", double4 == 0.25d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 1, (int) (short) 10);
        int int3 = fraction2.getNumerator();
        byte byte4 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int11 = fraction10.getNumerator();
        long long12 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction10.multiply((-3));
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.negate();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = fraction19.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        int int9 = fraction3.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.abs();
        long long11 = fraction10.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        byte byte7 = fraction6.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 37 + "'", byte7 == (byte) 37);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(1);
        float float7 = fraction6.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(50);
        byte byte10 = fraction6.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        java.lang.String str2 = fraction0.toString();
        java.lang.Class<?> wildcardClass3 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1 / 2" + "'", str2, "1 / 2");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 100, (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        boolean boolean9 = fraction2.equals((java.lang.Object) fraction6);
        byte byte10 = fraction6.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction0.getField();
        java.lang.Class<?> wildcardClass3 = fractionField2.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        short short9 = fraction8.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 101.0f, (double) 'a', (int) (short) 35);
        int int4 = fraction3.getNumerator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        byte byte5 = fraction4.byteValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -100 + "'", byte5 == (byte) -100);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction5.multiply(fraction7);
        short short12 = fraction11.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        float float8 = fraction0.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField9 = fraction0.getField();
        java.lang.String str10 = fraction0.toString();
        int int11 = fraction0.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.25f + "'", float8 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        long long3 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int9 = fraction8.getNumerator();
        long long10 = fraction8.longValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.add(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.reciprocal();
        boolean boolean13 = fraction2.equals((java.lang.Object) fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction2.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = fraction0.compareTo(fraction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        java.lang.String str3 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double5 = fraction4.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction4.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int15 = fraction14.getNumerator();
        long long16 = fraction14.longValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction10.add(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction4.subtract(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction0.add(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.multiply((int) ' ');
        java.lang.Class<?> wildcardClass22 = fraction18.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.multiply((int) (short) 100);
        long long21 = fraction20.longValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction12.subtract(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction25 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction25.multiply(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.subtract(3);
        boolean boolean32 = fraction12.equals((java.lang.Object) fraction29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction34 = fraction29.divide(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 400/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 4" + "'", str16, "1 / 4");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 800L + "'", long21 == 800L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.add(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction1.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction12.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long23 = fraction22.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField24 = fraction22.getField();
        long long25 = fraction22.longValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction19.divide(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction16.add(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction29 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long30 = fraction29.longValue();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction34 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        boolean boolean35 = fraction29.equals((java.lang.Object) fraction34);
        int int36 = fraction19.compareTo(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction11.divide(fraction29);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 2" + "'", str9, "1 / 2");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(fraction37);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        java.lang.String str8 = fraction0.toString();
        long long9 = fraction0.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 / 4" + "'", str8, "1 / 4");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) ' ');
        int int8 = fraction0.compareTo(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int14 = fraction13.getNumerator();
        long long15 = fraction13.longValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction9.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str19 = fraction18.toString();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.multiply((int) ' ');
        java.lang.String str22 = fraction18.toString();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction16.add(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction25 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long26 = fraction25.longValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long31 = fraction30.longValue();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction30.multiply(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction25.add(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction23.subtract(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction38 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) 'a', (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double40 = fraction39.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction39.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction39.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction39.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction39.negate();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction38.subtract(fraction47);
        org.apache.commons.math3.fraction.Fraction fraction51 = new org.apache.commons.math3.fraction.Fraction((-10), 2);
        int int52 = fraction47.compareTo(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction34.multiply(fraction51);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction54 = fraction7.divide(fraction53);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: the fraction to divide by must not be zero: 0/1");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 / 4" + "'", str5, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1 / 4" + "'", str19, "1 / 4");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1 / 4" + "'", str22, "1 / 4");
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(fraction53);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction8.subtract(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField21 = fraction20.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction19.divide(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction8.divide(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.multiply((int) '4');
        short short28 = fraction27.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.negate();
        long long7 = fraction6.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply((int) ' ');
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.add(fraction9);
        double double15 = fraction9.percentageValue();
        short short16 = fraction9.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25.0d + "'", double15 == 25.0d);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add(fraction4);
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((int) '#');
        boolean boolean12 = fraction7.equals((java.lang.Object) fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str14 = fraction13.toString();
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction7.multiply(fraction13);
        int int17 = fraction13.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction5.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int21 = fraction20.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.multiply(fraction22);
        boolean boolean24 = fraction19.equals((java.lang.Object) fraction22);
        float float25 = fraction22.floatValue();
        boolean boolean26 = fraction13.equals((java.lang.Object) float25);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "101" + "'", str6, "101");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 / 2" + "'", str14, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-10), (double) (-5L), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -10 to fraction (11/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (byte) -1);
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(35, 10);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.multiply((int) (short) 100);
        long long21 = fraction20.longValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction12.subtract(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction22.reciprocal();
        short short24 = fraction23.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 4" + "'", str16, "1 / 4");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 800L + "'", long21 == 800L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int11 = fraction10.getNumerator();
        long long12 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction10.multiply((-3));
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.negate();
        byte byte18 = fraction17.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 20);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(4);
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str12 = fraction11.toString();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction9.subtract(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.negate();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.negate();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction13.subtract(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction24 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction13.add(fraction26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction28 = fraction7.divide(fraction13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: the fraction to divide by must not be zero: 0/1");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 / 4" + "'", str12, "1 / 4");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction5.divide(fraction11);
        byte byte13 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(75, (int) (short) 1);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction -1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(10.0d, 75);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(3);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(35);
        double double2 = fraction1.percentageValue();
        int int3 = fraction1.getDenominator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3500.0d + "'", double2 == 3500.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.negate();
        boolean boolean12 = fraction1.equals((java.lang.Object) fraction11);
        double double13 = fraction11.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-35.0d) + "'", double13 == (-35.0d));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-100));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction13.negate();
        int int15 = fraction8.compareTo(fraction14);
        float float16 = fraction8.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction5.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction8.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 100, (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int24 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.negate();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.negate();
        boolean boolean29 = fraction22.equals((java.lang.Object) fraction26);
        boolean boolean30 = fraction19.equals((java.lang.Object) fraction22);
        org.apache.commons.math3.fraction.Fraction fraction33 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        int int34 = fraction33.intValue();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction22.multiply(fraction33);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.25f + "'", float16 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(fraction35);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 0.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.multiply((int) 'a');
        float float8 = fraction5.floatValue();
        int int9 = fraction5.getDenominator();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-5.0f) + "'", float8 == (-5.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.add((int) '#');
        boolean boolean10 = fraction5.equals((java.lang.Object) fraction7);
        java.lang.String str11 = fraction7.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction4.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction4.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (-3), 800.0d, (int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction21 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.negate();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str29 = fraction28.toString();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.add(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction21.multiply(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction19.divide(fraction28);
        boolean boolean33 = fraction14.equals((java.lang.Object) fraction28);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3 / 5" + "'", str11, "3 / 5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1 / 2" + "'", str29, "1 / 2");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int11 = fraction10.getNumerator();
        long long12 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction10.multiply((-3));
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.negate();
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long20 = fraction19.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction24 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long25 = fraction24.longValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.multiply(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction19.add(fraction27);
        boolean boolean30 = fraction27.equals((java.lang.Object) false);
        int int31 = fraction17.compareTo(fraction27);
        byte byte32 = fraction17.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 1 + "'", byte32 == (byte) 1);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        float float4 = fraction0.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(10, (int) 'a');
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.junit.Assert.assertNotNull(fractionField3);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        long long6 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double11 = fraction10.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction10.add((int) (byte) -1);
        byte byte16 = fraction15.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7500.0d + "'", double11 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 74 + "'", byte16 == (byte) 74);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-20.0d), 140);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -20 to fraction (21/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 100);
        long long6 = fraction5.longValue();
        int int7 = fraction5.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField9 = fraction8.getField();
        long long10 = fraction8.longValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction5.subtract(fraction8);
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction8.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 800L + "'", long6 == 800L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.multiply((int) (short) 100);
        long long21 = fraction20.longValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction12.subtract(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction12.divide((-52));
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 4" + "'", str16, "1 / 4");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 800L + "'", long21 == 800L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction1.divide(fraction2);
        java.lang.Class<?> wildcardClass7 = fraction6.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(4);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.subtract(60);
        int int10 = fraction9.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-59) + "'", int10 == (-59));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction10.negate();
        int int12 = fraction5.compareTo(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction5.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction2.divide(fraction13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction16 = fraction2.divide(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction -1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, (int) (byte) 1);
        float float3 = fraction2.floatValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0f + "'", float3 == 3.0f);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction3.multiply(fraction13);
        float float15 = fraction14.floatValue();
        java.lang.Class<?> wildcardClass16 = fraction14.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.021428572f + "'", float15 == 0.021428572f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        short short5 = fraction4.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -100 + "'", short5 == (short) -100);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-35.0d));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) ' ');
        java.lang.String str7 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.FractionField fractionField9 = fraction3.getField();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 4" + "'", str4, "1 / 4");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 0/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply((int) ' ');
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction7.abs();
        short short16 = fraction15.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction13.negate();
        int int15 = fraction8.compareTo(fraction14);
        float float16 = fraction8.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction5.subtract(fraction8);
        short short19 = fraction8.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.25f + "'", float16 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        int int8 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.add(10);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int12 = fraction11.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.add((int) '#');
        boolean boolean16 = fraction11.equals((java.lang.Object) fraction13);
        java.lang.String str17 = fraction13.toString();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction10.multiply(fraction13);
        int int19 = fraction5.compareTo(fraction18);
        java.lang.Class<?> wildcardClass20 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3 / 5" + "'", str17, "3 / 5");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(50);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.add((int) (byte) -1);
        int int8 = fraction3.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction8.subtract(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long20 = fraction19.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction17.multiply(fraction22);
        java.lang.String str24 = fraction17.toString();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction17.divide(1);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
        org.junit.Assert.assertNotNull(fraction26);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 10, (int) (short) 1);
        double double3 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.add((int) (byte) 3);
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction5.getField();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 10);
        long long2 = fraction1.longValue();
        java.lang.Class<?> wildcardClass3 = fraction1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction8.subtract(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField21 = fraction20.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction19.divide(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction8.divide(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction8.divide(75);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply((int) ' ');
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction16 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField18 = fraction17.getField();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction16.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction14.add(fraction17);
        double double23 = fraction22.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 33.33333333333333d + "'", double23 == 33.33333333333333d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        java.lang.Class<?> wildcardClass11 = fraction10.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(7500.0d, (int) (short) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 7,500 to fraction (-7,499/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 1);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        long long6 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double11 = fraction10.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction10.add((int) (byte) -1);
        byte byte16 = fraction10.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7500.0d + "'", double11 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 75 + "'", byte16 == (byte) 75);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract((int) '4');
        java.lang.String str13 = fraction10.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23 / 3" + "'", str13, "23 / 3");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(10, (int) (byte) 8);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(4);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction3.multiply(fraction13);
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction12.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction16.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fractionField17);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 0.0f);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.multiply(fraction6);
        double double10 = fraction9.doubleValue();
        float float11 = fraction9.floatValue();
        float float12 = fraction9.floatValue();
        byte byte13 = fraction9.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.5d) + "'", double10 == (-0.5d));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-0.5f) + "'", float11 == (-0.5f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.5f) + "'", float12 == (-0.5f));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        int int6 = fraction5.getNumerator();
        long long7 = fraction5.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, (int) (byte) 32);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 10, (int) (short) -1);
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double5 = fraction4.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction4.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.negate();
        int int19 = fraction12.compareTo(fraction18);
        float float20 = fraction12.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField21 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction9.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction12.reciprocal();
        org.apache.commons.math3.fraction.FractionField fractionField24 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction2.divide(fraction12);
        java.lang.Class<?> wildcardClass26 = fraction12.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.25f + "'", float20 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        long long4 = fraction3.longValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.abs();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.negate();
        boolean boolean12 = fraction1.equals((java.lang.Object) fraction11);
        java.lang.Class<?> wildcardClass13 = fraction11.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long11 = fraction10.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction10.getField();
        long long13 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.divide(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction4.add(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long18 = fraction17.longValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction22 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        boolean boolean23 = fraction17.equals((java.lang.Object) fraction22);
        int int24 = fraction7.compareTo(fraction17);
        double double25 = fraction7.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 50.0d + "'", double25 == 50.0d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(35);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double3 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str11 = fraction10.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        int int17 = fraction10.compareTo(fraction16);
        float float18 = fraction10.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField19 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction7.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.abs();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction1.add(fraction20);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 / 2" + "'", str5, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 / 4" + "'", str11, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.25f + "'", float18 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.add((int) (short) 10);
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction1.getField();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        int int4 = fraction0.getDenominator();
        int int5 = fraction0.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        int int10 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction11);
        long long14 = fraction11.longValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.multiply((int) '#');
        java.lang.Class<?> wildcardClass17 = fraction16.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        int int5 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.divide(fraction6);
        float float10 = fraction6.floatValue();
        long long11 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction6.negate();
        java.lang.String str13 = fraction12.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (-59), (-10));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -59 to fraction (-9,223,372,036,854,775,748/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        int int10 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction11);
        long long14 = fraction11.longValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.multiply((int) '#');
        java.lang.String str17 = fraction11.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3 / 5" + "'", str17, "3 / 5");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 0L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-10), 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.subtract(200);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        java.lang.Class<?> wildcardClass9 = fraction7.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(35, 10);
        int int4 = fraction0.compareTo(fraction3);
        short short5 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 3 + "'", short5 == (short) 3);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        java.lang.Class<?> wildcardClass1 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(200.0d, (double) 75, (int) (byte) 75);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        short short10 = fraction9.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 0.6f);
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 10, (-399));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(10.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.subtract(fraction5);
        int int8 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction1.add(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.subtract(fraction14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(1, (int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide(fraction3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.add((int) (byte) -1);
        java.lang.String str8 = fraction3.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "8" + "'", str8, "8");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction5.divide(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction5.add(200);
        short short15 = fraction14.shortValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 300 + "'", short15 == (short) 300);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, (double) 0L, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.add(10);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.abs();
        int int9 = fraction8.getDenominator();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction8.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(fractionField10);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction4);
        java.lang.String str6 = fraction4.toString();
        java.lang.Class<?> wildcardClass7 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 3" + "'", str6, "1 / 3");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.subtract(1);
        short short9 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-1));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.add(fraction6);
        int int9 = fraction6.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 32, (-52));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(51, (int) (short) 300);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply((int) ' ');
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction7.abs();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction16.getField();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction7.add(fraction16);
        java.lang.Class<?> wildcardClass21 = fraction20.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(fraction6);
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction7.getField();
        int int9 = fraction2.compareTo(fraction7);
        java.lang.Class<?> wildcardClass10 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.multiply(fraction6);
        double double10 = fraction9.doubleValue();
        float float11 = fraction9.floatValue();
        float float12 = fraction9.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction9.multiply((int) (byte) 37);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction9.subtract(200);
        long long17 = fraction9.longValue();
        java.lang.Class<?> wildcardClass18 = fraction9.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.5d) + "'", double10 == (-0.5d));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-0.5f) + "'", float11 == (-0.5f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.5f) + "'", float12 == (-0.5f));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        byte byte6 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.reciprocal();
        long long7 = fraction4.longValue();
        int int8 = fraction4.intValue();
        double double9 = fraction4.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(75, (int) (short) 800);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long3 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.abs();
        long long11 = fraction10.longValue();
        double double12 = fraction10.doubleValue();
        boolean boolean13 = fraction0.equals((java.lang.Object) fraction10);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.02d + "'", double12 == 0.02d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction8.subtract(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.divide((int) (short) -802);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double21 = fraction20.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str23 = fraction22.toString();
        org.apache.commons.math3.fraction.FractionField fractionField24 = fraction22.getField();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction20.multiply(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str29 = fraction28.toString();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int31 = fraction30.intValue();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction30.multiply(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction33.negate();
        int int35 = fraction28.compareTo(fraction34);
        float float36 = fraction28.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField37 = fraction28.getField();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction25.subtract(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction38.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction38.abs();
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int42 = fraction41.intValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction41.multiply(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction44.negate();
        org.apache.commons.math3.fraction.FractionField fractionField46 = fraction44.getField();
        int int47 = fraction40.compareTo(fraction44);
        boolean boolean48 = fraction19.equals((java.lang.Object) int47);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1 / 2" + "'", str23, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1 / 4" + "'", str29, "1 / 4");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.25f + "'", float36 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fractionField46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add((int) (short) 800);
        double double7 = fraction6.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 60200.0d + "'", double7 == 60200.0d);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        int int7 = fraction5.getDenominator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.negate();
        int int6 = fraction5.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.0d, 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(5, 35);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide(208);
        double double5 = fraction2.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14285714285714285d + "'", double5 == 0.14285714285714285d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply((int) ' ');
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction7.abs();
        java.lang.String str16 = fraction15.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2 / 3" + "'", str16, "2 / 3");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction11.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction7.subtract(fraction22);
        double double24 = fraction23.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 37, 200);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction23.divide(fraction27);
        byte byte29 = fraction27.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.10357142857142858d + "'", double24 == 0.10357142857142858d);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 0 + "'", byte29 == (byte) 0);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 300);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.reciprocal();
        long long7 = fraction6.longValue();
        java.lang.String str8 = fraction6.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 / 9" + "'", str8, "1 / 9");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction5.subtract(fraction6);
        java.lang.Class<?> wildcardClass11 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(9, 8);
        double double3 = fraction2.percentageValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 112.5d + "'", double3 == 112.5d);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.divide((int) (byte) -1);
        java.lang.Object obj8 = null;
        boolean boolean9 = fraction7.equals(obj8);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        int int9 = fraction3.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.abs();
        byte byte11 = fraction10.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction0.multiply((int) (byte) 20);
        float float17 = fraction0.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        byte byte11 = fraction10.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        int int5 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.divide(fraction6);
        float float10 = fraction6.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction11.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.divide((int) '4');
        double double15 = fraction14.doubleValue();
        int int16 = fraction6.compareTo(fraction14);
        float float17 = fraction6.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.014423076923076924d + "'", double15 == 0.014423076923076924d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.subtract((int) (short) 100);
        byte byte4 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction7.getField();
        byte byte9 = fraction7.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 3, (-99));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 3 to fraction (9,223,372,036,854,775,806/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add(1);
        int int4 = fraction0.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.subtract(fraction8);
        int int11 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction0.multiply(fraction15);
        byte byte17 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        int int5 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.abs();
        double double7 = fraction0.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.25d + "'", double7 == 0.25d);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction13.negate();
        int int15 = fraction8.compareTo(fraction14);
        float float16 = fraction8.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction5.subtract(fraction8);
        byte byte19 = fraction18.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.25f + "'", float16 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(10, (int) (byte) 8);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((-20.0d), (double) 101.0f, 0);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.subtract(fraction6);
        int int8 = fraction2.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        java.lang.Class<?> wildcardClass7 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 10, (int) (short) 1);
        double double3 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.add((int) (byte) 3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double7 = fraction6.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction18.negate();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction14.subtract(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction25 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction14.add(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction6.subtract(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction27.subtract(800);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction2.add(fraction31);
        byte byte33 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 10 + "'", byte33 == (byte) 10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        int int5 = fraction4.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double10 = fraction9.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.divide(fraction9);
        java.lang.Object obj12 = null;
        boolean boolean13 = fraction9.equals(obj12);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.divide((-1));
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction9.divide(fraction21);
        org.apache.commons.math3.fraction.FractionField fractionField24 = fraction9.getField();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7500.0d + "'", double10 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fractionField24);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 20, (int) (short) 20);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction(0);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE;
        java.lang.String str7 = fraction6.toString();
        boolean boolean8 = fraction5.equals((java.lang.Object) str7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction2.subtract(fraction5);
        short short10 = fraction9.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction11.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction7.subtract(fraction22);
        double double24 = fraction23.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 37, 200);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction23.divide(fraction27);
        short short29 = fraction23.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.10357142857142858d + "'", double24 == 0.10357142857142858d);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 0 + "'", short29 == (short) 0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, 50);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-52));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.abs();
        java.lang.Object obj7 = null;
        boolean boolean8 = fraction4.equals(obj7);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 0L, 208);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction15 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction4.add(fraction17);
        byte byte19 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 10, (int) (short) -1);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -10 + "'", short3 == (short) -10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (byte) -100, (-1.5d), 200);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -100 to fraction (101/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        int int8 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.add(10);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int12 = fraction11.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.add((int) '#');
        boolean boolean16 = fraction11.equals((java.lang.Object) fraction13);
        java.lang.String str17 = fraction13.toString();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction10.multiply(fraction13);
        int int19 = fraction5.compareTo(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((double) 101.0f, (double) 'a', (int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction18.add(fraction23);
        java.lang.Class<?> wildcardClass25 = fraction18.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3 / 5" + "'", str17, "3 / 5");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add(1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str5 = fraction4.toString();
        double double6 = fraction4.percentageValue();
        int int7 = fraction0.compareTo(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double9 = fraction8.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction4.multiply(fraction15);
        byte byte17 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 / 2" + "'", str5, "1 / 2");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(51);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide((-100));
        long long4 = fraction1.longValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 51L + "'", long4 == 51L);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(10.2d, (double) (byte) -1, (-52));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Unable to convert 10.2 to fraction after -52 iterations");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 9L, 8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 9 to fraction (9,223,372,036,854,775,800/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.multiply(fraction6);
        java.lang.Class<?> wildcardClass8 = fraction7.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(25.0d, (int) (byte) -100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 25 to fraction (9,223,372,036,854,775,784/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.subtract(200);
        int int8 = fraction5.intValue();
        java.lang.Class<?> wildcardClass9 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 800 + "'", int8 == 800);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 0.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 0.0f, (int) (byte) 8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(35);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(fraction6);
        boolean boolean8 = fraction3.equals((java.lang.Object) fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int12 = fraction11.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.negate();
        int int16 = fraction9.compareTo(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction3.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.divide((-1));
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction1.multiply(fraction19);
        double double21 = fraction19.doubleValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.5d) + "'", double21 == (-0.5d));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        long long3 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction8.add(5);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.divide((int) ' ');
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction19.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction2.divide(fraction19);
        int int22 = fraction19.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.subtract(35);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) ' ');
        java.lang.String str7 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction10.abs();
        double double12 = fraction11.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction3.add(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction11.subtract((-59));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 4" + "'", str4, "1 / 4");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply((int) ' ');
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction16 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long17 = fraction16.longValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.multiply(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long22 = fraction21.longValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction16.add(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction14.subtract(fraction25);
        double double27 = fraction26.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-41.66666666666667d) + "'", double27 == (-41.66666666666667d));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        int int5 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.divide(fraction6);
        float float10 = fraction6.floatValue();
        long long11 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction6.abs();
        short short13 = fraction12.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long4 = fraction3.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction0.add(fraction10);
        long long12 = fraction0.longValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.multiply((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = fraction14.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction1.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.reciprocal();
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction9.getField();
        java.lang.Class<?> wildcardClass13 = fractionField12.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-50.0d), (-60.0d), (int) (short) -100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -50 to fraction (51/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) ' ');
        java.lang.String str7 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply((int) (short) 300);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 4" + "'", str4, "1 / 4");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(fraction5);
        boolean boolean7 = fraction2.equals((java.lang.Object) fraction5);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction2.add(4);
        int int10 = fraction0.compareTo(fraction9);
        byte byte11 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add((int) (short) 10);
        int int4 = fraction3.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 41 + "'", int4 == 41);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        long long6 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double11 = fraction10.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long20 = fraction19.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField21 = fraction19.getField();
        long long22 = fraction19.longValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction16.divide(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction13.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int26 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.subtract(10);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction23.multiply(fraction30);
        org.apache.commons.math3.fraction.FractionField fractionField32 = fraction31.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7500.0d + "'", double11 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fractionField32);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 20);
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 20 + "'", short2 == (short) 20);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.subtract(fraction6);
        byte byte10 = fraction9.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -9 + "'", byte10 == (byte) -9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction6.divide(2);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction6.divide((int) (byte) 20);
        short short15 = fraction14.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 140, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 140 to fraction (-139/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 2/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        int int5 = fraction0.getNumerator();
        java.lang.String str6 = fraction0.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.negate();
        java.lang.String str3 = fraction0.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-1), (int) (short) -100);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, (int) (byte) 1);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 3 + "'", short3 == (short) 3);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction3.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.add((int) '#');
        boolean boolean10 = fraction5.equals((java.lang.Object) fraction7);
        java.lang.String str11 = fraction7.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction4.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.multiply((int) (byte) -5);
        java.lang.Class<?> wildcardClass17 = fraction16.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3 / 5" + "'", str11, "3 / 5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        int int5 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.divide(fraction6);
        float float10 = fraction6.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str15 = fraction14.toString();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction12.subtract(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.negate();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.negate();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction16.subtract(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int25 = fraction24.intValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.multiply(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction27.negate();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction20.subtract(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long32 = fraction31.longValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.multiply(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction29.multiply(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction6.multiply(fraction34);
        java.lang.Class<?> wildcardClass37 = fraction36.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 / 4" + "'", str15, "1 / 4");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str12 = fraction11.toString();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.negate();
        int int18 = fraction11.compareTo(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply((int) (byte) 1);
        int int21 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction3.subtract(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int24 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.add((int) '#');
        boolean boolean28 = fraction23.equals((java.lang.Object) fraction25);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int30 = fraction29.intValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.multiply(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction29.abs();
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int35 = fraction34.intValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.multiply(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction39 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long40 = fraction39.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField41 = fraction39.getField();
        long long42 = fraction39.longValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction36.divide(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction33.add(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction25.add(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction17.divide(fraction45);
        org.apache.commons.math3.fraction.FractionField fractionField47 = fraction45.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 / 4" + "'", str12, "1 / 4");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertNotNull(fractionField41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fractionField47);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(4, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 4/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.add((int) '#');
        boolean boolean10 = fraction5.equals((java.lang.Object) fraction7);
        java.lang.String str11 = fraction7.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction4.multiply(fraction7);
        java.lang.String str13 = fraction12.toString();
        java.lang.Class<?> wildcardClass14 = fraction12.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3 / 5" + "'", str11, "3 / 5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "27 / 5" + "'", str13, "27 / 5");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction5.divide(fraction11);
        short short13 = fraction11.shortValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        long long3 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction8.add(5);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.divide((int) ' ');
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction19.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction2.divide(fraction19);
        int int22 = fraction21.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-16) + "'", int22 == (-16));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        double double4 = fraction0.doubleValue();
        long long5 = fraction0.longValue();
        double double6 = fraction0.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long9 = fraction8.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction0.subtract(fraction8);
        int int11 = fraction10.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction14 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.multiply(3);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.abs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction19 = fraction10.divide(fraction17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: the fraction to divide by must not be zero: 0/1");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25d + "'", double4 == 0.25d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.25d + "'", double6 == 0.25d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-399) + "'", int11 == (-399));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-399));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction0.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.add(3);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        double double17 = fraction15.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 25.0d + "'", double17 == 25.0d);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction3.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction3.multiply(fraction15);
        long long17 = fraction16.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (short) -802, (double) (-0.5f), (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -802 to fraction (803/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        long long3 = fraction2.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.add((-99));
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (short) -100, (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -100 to fraction (101/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        java.lang.String str3 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double5 = fraction4.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction4.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int15 = fraction14.getNumerator();
        long long16 = fraction14.longValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction10.add(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction4.subtract(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction0.add(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((double) (-3), 800.0d, (int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction25 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.negate();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str33 = fraction32.toString();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.add(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction25.multiply(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction23.divide(fraction32);
        int int37 = fraction36.getNumerator();
        boolean boolean38 = fraction18.equals((java.lang.Object) fraction36);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction18.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1 / 2" + "'", str33, "1 / 2");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-6) + "'", int37 == (-6));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(fraction39);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.reciprocal();
        float float9 = fraction0.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction0.divide(200);
        org.apache.commons.math3.fraction.Fraction fraction15 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction11.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction20 = new org.apache.commons.math3.fraction.Fraction(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction21 = fraction15.divide(fraction20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: the fraction to divide by must not be zero: 0/1");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction4.multiply(fraction14);
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction0.divide(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long20 = fraction19.longValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction15.add(fraction22);
        short short24 = fraction23.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction1.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str18 = fraction17.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int20 = fraction19.intValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction22.negate();
        int int24 = fraction17.compareTo(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction17.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction14.divide(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction9.subtract(fraction25);
        long long28 = fraction9.longValue();
        short short29 = fraction9.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 / 4" + "'", str18, "1 / 4");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-100L) + "'", long28 == (-100L));
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) -100 + "'", short29 == (short) -100);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add(1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        int int5 = fraction4.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        java.lang.String str2 = fraction0.toString();
        float float3 = fraction0.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 8, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 8/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 100, (int) '#');
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 60, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 60 to fraction (-59/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.reciprocal();
        float float9 = fraction0.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction0.divide(200);
        org.apache.commons.math3.fraction.Fraction fraction15 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction11.subtract(fraction15);
        int int19 = fraction11.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 20, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 20/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        java.lang.String str1 = fraction0.toString();
        int int2 = fraction0.getDenominator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.divide((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long11 = fraction10.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction10.getField();
        long long13 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.divide(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction4.add(fraction7);
        short short16 = fraction7.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(51);
        int int2 = fraction1.getNumerator();
        short short3 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 51 + "'", short3 == (short) 51);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(75.0d, (double) 0.25f, (int) '#');
        short short4 = fraction3.shortValue();
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 75 + "'", short4 == (short) 75);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.multiply(fraction4);
        int int8 = fraction7.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction4.add(5);
        java.lang.String str14 = fraction13.toString();
        java.lang.Class<?> wildcardClass15 = fraction13.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "5" + "'", str14, "5");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        long long6 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double11 = fraction10.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        boolean boolean18 = fraction13.equals((java.lang.Object) fraction16);
        boolean boolean19 = fraction2.equals((java.lang.Object) boolean18);
        org.apache.commons.math3.fraction.Fraction fraction21 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction21.abs();
        double double23 = fraction22.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.negate();
        int int26 = fraction2.compareTo(fraction25);
        byte byte27 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7500.0d + "'", double11 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(60200.0d, 0.0d, 140);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 60,200 to fraction (-60,199/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 37, (int) (byte) 10);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(133.33333333333334d, 12.5d, (-59));
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 32, (int) (byte) 100);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 3, (int) (byte) 8);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        long long6 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double11 = fraction10.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.negate();
        float float14 = fraction10.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7500.0d + "'", double11 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 75.0f + "'", float14 == 75.0f);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction12.add(fraction15);
        int int19 = fraction15.intValue();
        long long20 = fraction15.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-99) + "'", int19 == (-99));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-99L) + "'", long20 == (-99L));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.subtract(fraction5);
        int int8 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction1.add(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction3.subtract((int) (byte) 32);
        int int16 = fraction15.intValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-31) + "'", int16 == (-31));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.add(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction1.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction1.add(fraction12);
        double double17 = fraction1.percentageValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 2" + "'", str9, "1 / 2");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.add((int) '#');
        boolean boolean14 = fraction9.equals((java.lang.Object) fraction11);
        long long15 = fraction11.longValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double20 = fraction19.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction11.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.negate();
        int int23 = fraction8.compareTo(fraction22);
        int int24 = fraction22.getDenominator();
        int int25 = fraction22.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7500.0d + "'", double20 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(41, 31);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add(fraction4);
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((int) '#');
        boolean boolean12 = fraction7.equals((java.lang.Object) fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str14 = fraction13.toString();
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction7.multiply(fraction13);
        int int17 = fraction13.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction5.add(fraction13);
        short short19 = fraction18.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "101" + "'", str6, "101");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 / 2" + "'", str14, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 101 + "'", short19 == (short) 101);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction11.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction7.subtract(fraction22);
        double double24 = fraction23.doubleValue();
        short short25 = fraction23.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.10357142857142858d + "'", double24 == 0.10357142857142858d);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.subtract(fraction5);
        int int8 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction1.add(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction3.multiply(20);
        int int17 = fraction3.getDenominator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) 'a', (int) (byte) 1);
        double double3 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply((int) (byte) 32);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(10, (int) (byte) 8);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((-20.0d), (double) 101.0f, 0);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.subtract(fraction6);
        java.lang.String str8 = fraction2.toString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5 / 4" + "'", str8, "5 / 4");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction3.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 31);
        java.lang.String str18 = fraction17.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction3.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1 / 2" + "'", str18, "-1 / 2");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 0, (double) 10L, (-10));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.reciprocal();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) -100);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        java.lang.Class<?> wildcardClass2 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction8.add(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction0.subtract(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction21.subtract(800);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction25.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str28 = fraction27.toString();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction30.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int34 = fraction33.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction33.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction30.subtract(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction25.add(fraction33);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1 / 4" + "'", str28, "1 / 4");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.divide(200);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.add((-59));
        double double14 = fraction13.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-59.25d) + "'", double14 == (-59.25d));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-3), 800.0d, (int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.add(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction5.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction3.divide(fraction12);
        int int17 = fraction16.getNumerator();
        int int18 = fraction16.getDenominator();
        int int19 = fraction16.getNumerator();
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 2" + "'", str13, "1 / 2");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-6) + "'", int17 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-6) + "'", int19 == (-6));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 35.0f, (-399));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 35 to fraction (9,223,372,036,854,775,774/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.add((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.negate();
        double double14 = fraction13.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction7.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction13.divide((int) (short) -1);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-100.0f), 0.0d, 41);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -100 to fraction (101/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.25d, (int) (byte) -1);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        long long4 = fraction3.longValue();
        double double5 = fraction3.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.abs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.divide((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.02d + "'", double5 == 0.02d);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(9.0d, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 9 to fraction (9,223,372,036,854,775,800/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction13.negate();
        int int15 = fraction8.compareTo(fraction14);
        float float16 = fraction8.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction5.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction8.reciprocal();
        double double20 = fraction8.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.add((int) '#');
        boolean boolean26 = fraction21.equals((java.lang.Object) fraction23);
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int28 = fraction27.intValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.multiply(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction27.abs();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int33 = fraction32.intValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction32.multiply(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction37 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long38 = fraction37.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField39 = fraction37.getField();
        long long40 = fraction37.longValue();
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction34.divide(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction31.add(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction23.add(fraction31);
        int int44 = fraction8.compareTo(fraction43);
        int int45 = fraction8.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.25f + "'", float16 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.25d + "'", double20 == 0.25d);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(fractionField39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 7, (-6));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 20);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 300);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.multiply(fraction6);
        double double10 = fraction9.doubleValue();
        float float11 = fraction9.floatValue();
        float float12 = fraction9.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction9.multiply((int) (byte) 37);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction9.subtract(200);
        long long17 = fraction9.longValue();
        short short18 = fraction9.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.5d) + "'", double10 == (-0.5d));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-0.5f) + "'", float11 == (-0.5f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.5f) + "'", float12 == (-0.5f));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction4.multiply(fraction14);
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction0.divide(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long20 = fraction19.longValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction15.add(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction23.abs();
        double double25 = fraction24.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.02142857142857d + "'", double25 == 100.02142857142857d);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 35.0f);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction0.getField();
        java.lang.Class<?> wildcardClass4 = fractionField3.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(10, 20);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add(0);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.abs();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long18 = fraction17.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField19 = fraction17.getField();
        long long20 = fraction17.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction14.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction11.add(fraction14);
        int int23 = fraction14.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction14.add((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction6.multiply(fraction14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction28 = fraction14.divide(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        java.lang.String str6 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.add(fraction4);
        double double8 = fraction4.doubleValue();
        int int9 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.multiply((-3));
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction4.divide((-99));
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction4.divide(140);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 3" + "'", str6, "1 / 3");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3333333333333333d + "'", double8 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 0.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.multiply((int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply((int) (byte) 10);
        int int10 = fraction7.getDenominator();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        java.lang.String str6 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.multiply(1);
        float float14 = fraction13.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply(50);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction13.subtract((-3));
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction2.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.add(101);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double24 = fraction23.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str26 = fraction25.toString();
        org.apache.commons.math3.fraction.FractionField fractionField27 = fraction25.getField();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction23.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str32 = fraction31.toString();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int34 = fraction33.intValue();
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction33.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction36.negate();
        int int38 = fraction31.compareTo(fraction37);
        float float39 = fraction31.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField40 = fraction31.getField();
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction28.subtract(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction31.reciprocal();
        double double43 = fraction31.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction44 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int45 = fraction44.intValue();
        org.apache.commons.math3.fraction.Fraction fraction46 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction46.add((int) '#');
        boolean boolean49 = fraction44.equals((java.lang.Object) fraction46);
        org.apache.commons.math3.fraction.Fraction fraction50 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int51 = fraction50.intValue();
        org.apache.commons.math3.fraction.Fraction fraction52 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction50.multiply(fraction52);
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction50.abs();
        org.apache.commons.math3.fraction.Fraction fraction55 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int56 = fraction55.intValue();
        org.apache.commons.math3.fraction.Fraction fraction57 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction55.multiply(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction60 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long61 = fraction60.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField62 = fraction60.getField();
        long long63 = fraction60.longValue();
        org.apache.commons.math3.fraction.Fraction fraction64 = fraction57.divide(fraction60);
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction54.add(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction66 = fraction46.add(fraction54);
        int int67 = fraction31.compareTo(fraction66);
        int int68 = fraction20.compareTo(fraction66);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3 / 5" + "'", str6, "3 / 5");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1 / 2" + "'", str26, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1 / 4" + "'", str32, "1 / 4");
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.25f + "'", float39 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.25d + "'", double43 == 0.25d);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L + "'", long61 == 100L);
        org.junit.Assert.assertNotNull(fractionField62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 100L + "'", long63 == 100L);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(800);
        double double2 = fraction1.percentageValue();
        short short3 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 80000.0d + "'", double2 == 80000.0d);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 800 + "'", short3 == (short) 800);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(35);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.add(101);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.reciprocal();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(140);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str8 = fraction7.toString();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.negate();
        int int14 = fraction7.compareTo(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction4.divide(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction1.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction1.negate();
        byte byte19 = fraction18.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 / 4" + "'", str8, "1 / 4");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 116 + "'", byte19 == (byte) 116);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction8.subtract(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField21 = fraction20.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction19.divide(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction8.divide(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.multiply((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction25.add((-99));
        byte byte30 = fraction29.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) -99 + "'", byte30 == (byte) -99);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.subtract((int) (short) 0);
        double double8 = fraction3.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.5d) + "'", double8 == (-0.5d));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.FractionField fractionField9 = fraction6.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply((int) ' ');
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction7.abs();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction16.getField();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction7.add(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction7.add(10);
        org.apache.commons.math3.fraction.FractionField fractionField23 = fraction7.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fractionField23);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        long long3 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction8.add(5);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.divide((int) ' ');
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction19.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction2.divide(fraction19);
        java.lang.String str22 = fraction21.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-16 / 5" + "'", str22, "-16 / 5");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int12 = fraction11.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.add((int) '#');
        boolean boolean16 = fraction11.equals((java.lang.Object) fraction13);
        long long17 = fraction13.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double22 = fraction21.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction13.subtract(fraction21);
        int int24 = fraction10.compareTo(fraction23);
        byte byte25 = fraction23.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7500.0d + "'", double22 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) -74 + "'", byte25 == (byte) -74);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(12.5d, 3);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.reciprocal();
        int int4 = fraction3.intValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(200.0d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 1, (double) 50, 31);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) -802, (int) (byte) 20);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        int int10 = fraction9.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction14 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double15 = fraction14.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction9.divide(fraction14);
        java.lang.Object obj17 = null;
        boolean boolean18 = fraction14.equals(obj17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction3.subtract(fraction14);
        java.lang.Class<?> wildcardClass20 = fraction14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7500.0d + "'", double15 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction3.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.subtract(100);
        boolean boolean18 = fraction14.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        java.lang.String str6 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.multiply(1);
        float float14 = fraction13.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply(50);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction13.subtract((-3));
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction2.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        java.lang.String str21 = fraction19.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3 / 5" + "'", str6, "3 / 5");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3 / 5" + "'", str21, "3 / 5");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 20, (int) (short) -100);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int11 = fraction10.getNumerator();
        long long12 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction0.add(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.divide(99);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction15.divide(3);
        short short22 = fraction15.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction5.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction13 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction13.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction22 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction16.divide(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction16.add(200);
        int int26 = fraction10.compareTo(fraction25);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        byte byte4 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.reciprocal();
        long long7 = fraction6.longValue();
        byte byte8 = fraction6.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.add((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.negate();
        double double14 = fraction13.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction7.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction13.divide(70);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.add((int) '#');
        boolean boolean10 = fraction5.equals((java.lang.Object) fraction7);
        java.lang.String str11 = fraction7.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction4.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int17 = fraction16.intValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.add((int) '#');
        boolean boolean21 = fraction16.equals((java.lang.Object) fraction18);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str23 = fraction22.toString();
        org.apache.commons.math3.fraction.FractionField fractionField24 = fraction22.getField();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction16.multiply(fraction22);
        double double26 = fraction25.doubleValue();
        float float27 = fraction25.floatValue();
        float float28 = fraction25.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction25.multiply((int) (byte) 37);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction25.subtract(200);
        long long33 = fraction25.longValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction12.divide(fraction25);
        short short35 = fraction12.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3 / 5" + "'", str11, "3 / 5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1 / 2" + "'", str23, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.5d) + "'", double26 == (-0.5d));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-0.5f) + "'", float27 == (-0.5f));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-0.5f) + "'", float28 == (-0.5f));
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 5 + "'", short35 == (short) 5);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 20, (double) (short) -100, (int) (byte) -9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 20 to fraction (-19/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        java.lang.String str6 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.add(fraction4);
        double double8 = fraction4.doubleValue();
        int int9 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.multiply((-3));
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction4.divide((-99));
        java.lang.Class<?> wildcardClass14 = fraction13.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 3" + "'", str6, "1 / 3");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3333333333333333d + "'", double8 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.multiply(51);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction8.abs();
        short short15 = fraction8.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 20, (int) (short) 20);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction(0);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE;
        java.lang.String str7 = fraction6.toString();
        boolean boolean8 = fraction5.equals((java.lang.Object) str7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction2.subtract(fraction5);
        java.lang.Object obj10 = null;
        boolean boolean11 = fraction5.equals(obj10);
        java.lang.Class<?> wildcardClass12 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.multiply((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.add(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction8.subtract(0);
        byte byte18 = fraction17.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long11 = fraction10.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction10.getField();
        long long13 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.divide(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction4.add(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str17 = fraction16.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.add(10);
        boolean boolean24 = fraction7.equals((java.lang.Object) fraction21);
        byte byte25 = fraction7.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 / 4" + "'", str17, "1 / 4");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(10, (int) (byte) 8);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((-20.0d), (double) 101.0f, 0);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.subtract(fraction6);
        short short8 = fraction7.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 21 + "'", short8 == (short) 21);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int12 = fraction11.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction16 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long17 = fraction16.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField18 = fraction16.getField();
        long long19 = fraction16.longValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction13.divide(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction10.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction2.add(fraction10);
        long long23 = fraction22.longValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.add(fraction24);
        int int26 = fraction25.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        int int6 = fraction0.intValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = fraction0.equals(obj7);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.add(140);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.add(75);
        short short6 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 127 + "'", short6 == (short) 127);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        java.lang.String str6 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.add(fraction4);
        double double8 = fraction4.doubleValue();
        int int9 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.multiply((-3));
        short short12 = fraction11.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 3" + "'", str6, "1 / 3");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3333333333333333d + "'", double8 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 10, 35);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.subtract((int) (short) 0);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction6.subtract((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction2.add(fraction6);
        byte byte14 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction10.reciprocal();
        int int12 = fraction5.compareTo(fraction11);
        org.apache.commons.math3.fraction.FractionField fractionField13 = fraction5.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fractionField13);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.add(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        double double12 = fraction11.percentageValue();
        double double13 = fraction11.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction5.subtract(fraction11);
        int int15 = fraction5.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0309278350515463d) + "'", double12 == (-1.0309278350515463d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0309278350515463d) + "'", double13 == (-1.0309278350515463d));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(5, (-99));
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) (byte) 32);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.add(10);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.abs();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction4.subtract(fraction10);
        int int15 = fraction14.getDenominator();
        java.lang.Class<?> wildcardClass16 = fraction14.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.divide(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction2.add(fraction7);
        byte byte11 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 41, 70);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 41 to fraction (9,223,372,036,854,775,768/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction0.getField();
        java.lang.String str3 = fraction0.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(101);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.multiply(fraction4);
        long long8 = fraction7.longValue();
        float float9 = fraction7.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.33333334f + "'", float9 == 0.33333334f);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        int int5 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.divide(fraction6);
        float float10 = fraction6.floatValue();
        long long11 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction6.negate();
        java.lang.String str13 = fraction6.toString();
        short short14 = fraction6.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(41);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1), (double) (byte) 3, 3);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract((int) (byte) 100);
        byte byte6 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-1.5d), (double) 10, 6);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-0.25f));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) '#', (double) (byte) -74, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 35 to fraction (9,223,372,036,854,775,774/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction0.subtract(fraction8);
        byte byte12 = fraction8.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 8, (-60.0d), (int) (short) 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 8 to fraction (-7/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.multiply((int) (short) 100);
        long long21 = fraction20.longValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction12.subtract(fraction20);
        short short23 = fraction12.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 4" + "'", str16, "1 / 4");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 800L + "'", long21 == 800L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.subtract(3);
        int int8 = fraction0.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction3.multiply(fraction13);
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField18 = fraction17.getField();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction16.subtract(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction24 = new org.apache.commons.math3.fraction.Fraction(60, (-1));
        double double25 = fraction24.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction20.add(fraction24);
        float float27 = fraction26.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-60.0d) + "'", double25 == (-60.0d));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-59.985577f) + "'", float27 == (-59.985577f));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int15 = fraction14.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction11.subtract(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str20 = fraction19.toString();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.negate();
        int int26 = fraction19.compareTo(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.multiply((int) (byte) 1);
        int int29 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction11.subtract(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction7.multiply(fraction11);
        short short32 = fraction7.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 / 4" + "'", str20, "1 / 4");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 2 + "'", short32 == (short) 2);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide(fraction5);
        java.lang.String str7 = fraction6.toString();
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "15 / 2" + "'", str7, "15 / 2");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        int int5 = fraction4.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double10 = fraction9.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.divide(fraction9);
        short short12 = fraction4.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7500.0d + "'", double10 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -100 + "'", short12 == (short) -100);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply((int) ' ');
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction16 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long17 = fraction16.longValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.multiply(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long22 = fraction21.longValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction16.add(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction14.subtract(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) 'a', (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double31 = fraction30.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction30.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction30.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction30.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction30.negate();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction29.subtract(fraction38);
        org.apache.commons.math3.fraction.Fraction fraction42 = new org.apache.commons.math3.fraction.Fraction((-10), 2);
        int int43 = fraction38.compareTo(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction25.multiply(fraction42);
        int int45 = fraction44.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1.0f);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 75, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 75/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        java.lang.String str4 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double9 = fraction8.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str11 = fraction10.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        int int17 = fraction10.compareTo(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.abs();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int20 = fraction19.intValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.add((int) '#');
        boolean boolean24 = fraction19.equals((java.lang.Object) fraction21);
        long long25 = fraction21.longValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double30 = fraction29.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction21.subtract(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.negate();
        int int33 = fraction18.compareTo(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction8.subtract(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction0.divide(fraction34);
        long long36 = fraction34.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 7500.0d + "'", double9 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 / 4" + "'", str11, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 7500.0d + "'", double30 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 150L + "'", long36 == 150L);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.subtract(1);
        byte byte9 = fraction8.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }
}

