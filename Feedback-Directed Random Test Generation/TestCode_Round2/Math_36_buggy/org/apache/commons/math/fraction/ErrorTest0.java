package org.apache.commons.math.fraction;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.pow(10L);
        int int4 = bigFraction3.intValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigFraction1 and bigFraction3", bigFraction1.equals(bigFraction3) ? bigFraction1.hashCode() == bigFraction3.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.pow(10L);
        java.math.BigInteger bigInteger4 = bigFraction1.getDenominator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigFraction1 and bigFraction3", bigFraction1.equals(bigFraction3) ? bigFraction1.hashCode() == bigFraction3.hashCode() : true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.pow(10L);
        org.apache.commons.math.fraction.BigFraction bigFraction4 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long5 = bigFraction4.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction4.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction8 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction9 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long10 = bigFraction9.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction9.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction12 = bigFraction8.subtract(bigFraction11);
        int int13 = bigFraction7.compareTo(bigFraction8);
        org.apache.commons.math.fraction.BigFraction bigFraction14 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction15 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long16 = bigFraction15.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction17 = bigFraction15.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction18 = bigFraction14.subtract(bigFraction17);
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction14.pow((long) '4');
        int int21 = bigFraction20.getNumeratorAsInt();
        java.math.BigInteger bigInteger22 = bigFraction20.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction23 = bigFraction8.multiply(bigInteger22);
        org.apache.commons.math.fraction.BigFraction bigFraction24 = new org.apache.commons.math.fraction.BigFraction(bigInteger22);
        org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction1.add(bigInteger22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigFraction1 and bigFraction3", bigFraction1.equals(bigFraction3) ? bigFraction1.hashCode() == bigFraction3.hashCode() : true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.commons.math.fraction.BigFraction bigFraction3 = new org.apache.commons.math.fraction.BigFraction((double) (-1.0f), 10.0d, (int) (byte) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigInteger bigInteger6 = bigFraction5.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction3.add(bigInteger6);
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction7.add((int) (short) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long12 = bigFraction11.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction11.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction10.subtract(bigFraction13);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction10.pow((long) '4');
        int int17 = bigFraction16.getNumeratorAsInt();
        long long18 = bigFraction16.longValue();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction9.multiply(bigFraction16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigFraction5 and bigFraction14", bigFraction5.equals(bigFraction14) ? bigFraction5.hashCode() == bigFraction14.hashCode() : true);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.apache.commons.math.fraction.BigFraction bigFraction3 = new org.apache.commons.math.fraction.BigFraction((double) (-1.0f), 10.0d, (int) (byte) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigInteger bigInteger6 = bigFraction5.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction3.add(bigInteger6);
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction7.negate();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction10 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long11 = bigFraction10.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction12 = bigFraction10.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction9.subtract(bigFraction12);
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction9.pow((long) '4');
        int int16 = bigFraction15.getNumeratorAsInt();
        java.math.BigInteger bigInteger17 = bigFraction15.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction18 = bigFraction8.divide(bigInteger17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigFraction5 and bigFraction13", bigFraction5.equals(bigFraction13) ? bigFraction5.hashCode() == bigFraction13.hashCode() : true);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction6.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long12 = bigFraction11.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction11.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction10.subtract(bigFraction13);
        int int15 = bigFraction9.compareTo(bigFraction10);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction17 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long18 = bigFraction17.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction17.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction16.subtract(bigFraction19);
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction16.pow((long) '4');
        int int23 = bigFraction22.getNumeratorAsInt();
        java.math.BigInteger bigInteger24 = bigFraction22.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction10.multiply(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction26 = bigFraction5.multiply(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction3.subtract(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction29 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigInteger bigInteger30 = bigFraction29.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction31 = new org.apache.commons.math.fraction.BigFraction(bigInteger24, bigInteger30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigFraction4 and bigFraction29", bigFraction4.equals(bigFraction29) ? bigFraction4.hashCode() == bigFraction29.hashCode() : true);
    }
}

