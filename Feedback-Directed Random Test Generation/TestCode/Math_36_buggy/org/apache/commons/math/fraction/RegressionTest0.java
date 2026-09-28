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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        java.math.BigInteger bigInteger3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.divide(bigInteger3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.multiply(bigInteger1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        java.lang.Class<?> wildcardClass3 = bigFraction2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.divide(0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math.exception.ZeroException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction(bigInteger0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: numerator");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.pow(bigInteger1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction3 = new org.apache.commons.math.fraction.BigFraction(1.0E20d, (double) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 100,000,000,000,000,000,000 to fraction (9,223,372,036,854,775,807/1)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction(bigInteger0, bigInteger1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: numerator");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction3 = new org.apache.commons.math.fraction.BigFraction((double) 100.0f, (double) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        double double4 = bigFraction2.pow((double) 10);
        double double5 = bigFraction2.doubleValue();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        int int9 = bigFraction8.intValue();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction2.divide(bigFraction8);
        org.apache.commons.math.fraction.BigFraction bigFraction12 = bigFraction8.multiply((int) (byte) 1);
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction12.negate();
        java.math.BigDecimal bigDecimal15 = bigFraction13.bigDecimalValue(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E20d + "'", double4 == 1.0E20d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigDecimal15);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO;
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_THIRDS;
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.subtract((long) 10);
        java.math.BigInteger bigInteger3 = bigFraction2.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.reduce();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = bigFraction4.bigDecimalValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.MINUS_ONE;
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        double double4 = bigFraction2.pow((double) 10);
        double double5 = bigFraction2.doubleValue();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        int int9 = bigFraction8.intValue();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction2.divide(bigFraction8);
        java.math.BigInteger bigInteger11 = bigFraction2.getNumerator();
        short short12 = bigInteger11.shortValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E20d + "'", double4 == 1.0E20d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -100 + "'", short12 == (short) -100);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.FOUR_FIFTHS;
        byte byte1 = bigFraction0.byteValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        double double4 = bigFraction2.pow((double) 10);
        double double5 = bigFraction2.doubleValue();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        int int9 = bigFraction8.intValue();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction2.divide(bigFraction8);
        org.apache.commons.math.fraction.BigFractionField bigFractionField11 = bigFraction10.getField();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E20d + "'", double4 == 1.0E20d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFractionField11);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = bigFraction0.reciprocal();
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.negate();
        int int3 = bigFraction2.intValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.THREE_QUARTERS;
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.subtract((long) 10);
        java.math.BigInteger bigInteger3 = bigFraction2.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.reduce();
        double double5 = bigFraction2.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9.75d) + "'", double5 == (-9.75d));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        int int3 = bigFraction2.intValue();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.negate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-100) + "'", int3 == (-100));
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        double double4 = bigFraction2.pow((double) 10);
        double double5 = bigFraction2.doubleValue();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        int int9 = bigFraction8.intValue();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction2.divide(bigFraction8);
        int int11 = bigFraction2.intValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E20d + "'", double4 == 1.0E20d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-100) + "'", int11 == (-100));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.subtract((long) 10);
        java.math.BigInteger bigInteger3 = bigFraction2.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.reduce();
        double double5 = bigFraction4.percentageValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-975.0d) + "'", double5 == (-975.0d));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) '4');
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.subtract((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = bigFraction2.bigDecimalValue((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((int) (byte) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.subtract((long) 10);
        java.math.BigInteger bigInteger5 = bigFraction4.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction1.add(bigInteger5);
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.divide((int) '4');
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction6.negate();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE;
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.subtract((long) 10);
        java.math.BigInteger bigInteger3 = bigFraction2.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.reduce();
        java.lang.Class<?> wildcardClass5 = bigFraction4.getClass();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.FOUR_FIFTHS;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) (byte) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction3 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract((long) 10);
        java.math.BigInteger bigInteger6 = bigFraction5.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction2.add(bigInteger6);
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction7.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction0.subtract(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (-1));
        short short3 = bigFraction2.shortValue();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -100 + "'", short3 == (short) -100);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((-1L));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) '4', (int) (short) -1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.subtract((long) 10);
        java.math.BigInteger bigInteger3 = bigFraction2.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.reduce();
        byte byte5 = bigFraction2.byteValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -9 + "'", byte5 == (byte) -9);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = bigFraction0.reciprocal();
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.negate();
        float float3 = bigFraction2.floatValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-0.4f) + "'", float3 == (-0.4f));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.subtract((long) 10);
        java.math.BigInteger bigInteger3 = bigFraction2.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction4.subtract((long) 10);
        java.math.BigInteger bigInteger7 = bigFraction6.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = new org.apache.commons.math.fraction.BigFraction(bigInteger7);
        org.apache.commons.math.fraction.BigFraction bigFraction9 = new org.apache.commons.math.fraction.BigFraction(bigInteger3, bigInteger7);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.subtract((long) 10);
        java.math.BigInteger bigInteger3 = bigFraction2.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.reduce();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction4.divide((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math.exception.ZeroException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) (short) -100, (int) (byte) 100);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = bigFraction0.reciprocal();
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.negate();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction0.negate();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        double double4 = bigFraction2.pow((double) 10);
        double double5 = bigFraction2.doubleValue();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        int int9 = bigFraction8.intValue();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction2.divide(bigFraction8);
        org.apache.commons.math.fraction.BigFraction bigFraction13 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        double double15 = bigFraction13.pow((double) 10);
        double double16 = bigFraction13.doubleValue();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        int int20 = bigFraction19.intValue();
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction13.divide(bigFraction19);
        org.apache.commons.math.fraction.BigFraction bigFraction23 = bigFraction19.multiply((int) (byte) 1);
        org.apache.commons.math.fraction.BigFraction bigFraction24 = bigFraction23.negate();
        org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction2.add(bigFraction23);
        org.apache.commons.math.fraction.BigFraction bigFraction26 = bigFraction2.reduce();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E20d + "'", double4 == 1.0E20d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E20d + "'", double15 == 1.0E20d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-100.0d) + "'", double16 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-100) + "'", int20 == (-100));
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((long) '#');
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.divide((long) '#');
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.getReducedFraction((int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        double double4 = bigFraction2.pow((double) 10);
        double double5 = bigFraction2.doubleValue();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        int int9 = bigFraction8.intValue();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction2.divide(bigFraction8);
        java.math.BigInteger bigInteger11 = bigFraction2.getNumerator();
        org.apache.commons.math.fraction.BigFraction bigFraction12 = bigFraction2.abs();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction2.subtract((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E20d + "'", double4 == 1.0E20d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction14);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((int) (byte) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.subtract((long) 10);
        java.math.BigInteger bigInteger5 = bigFraction4.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction1.add(bigInteger5);
        org.apache.commons.math.fraction.BigFraction bigFraction8 = new org.apache.commons.math.fraction.BigFraction((int) (byte) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction9 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction9.subtract((long) 10);
        java.math.BigInteger bigInteger12 = bigFraction11.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction8.add(bigInteger12);
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction1.subtract(bigInteger12);
        org.apache.commons.math.fraction.BigFraction bigFraction15 = new org.apache.commons.math.fraction.BigFraction(bigInteger12);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = bigFraction0.reciprocal();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.add((int) '4');
        double double4 = bigFraction1.doubleValue();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction1.pow((long) (byte) -9);
        org.apache.commons.math.fraction.BigFraction bigFraction9 = new org.apache.commons.math.fraction.BigFraction((long) (short) 100, (long) (short) -1);
        double double11 = bigFraction9.pow((double) 10);
        boolean boolean12 = bigFraction6.equals((java.lang.Object) bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.5d + "'", double4 == 2.5d);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E20d + "'", double11 == 1.0E20d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.pow((long) (byte) 10);
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((int) (byte) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.subtract((long) 10);
        java.math.BigInteger bigInteger5 = bigFraction4.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction1.add(bigInteger5);
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.divide((int) '4');
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction6.subtract(10L);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
    }
}

