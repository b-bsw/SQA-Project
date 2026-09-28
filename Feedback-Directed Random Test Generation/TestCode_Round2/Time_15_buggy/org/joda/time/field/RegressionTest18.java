package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

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
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1207195378L), (-56701244003200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-56702451198578L) + "'", long2 == (-56702451198578L));
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(655, 47234);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30938270 + "'", int2 == 30938270);
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1111, (-9788880));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9787769) + "'", int2 == (-9787769));
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1106892L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1106892L + "'", long2 == 1106892L);
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-9));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 339161818, 0, (-192174760));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 339161818 for  must be in the range [0,-192174760]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 870, 236129206, 841690790);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(18686280, (-31069120));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 18686280 * -31069120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(4991467664221L, 17329373);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 4991467664221 * 17329373");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-106141505906070L), 86130);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9141967903689809100L) + "'", long2 == (-9141967903689809100L));
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-39575028L), (java.lang.Object) (-33916098500L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-15951520));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15951520 + "'", int1 == 15951520);
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3162), 808191813, 20731669);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10049, (-2466), (-304461011));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 4909, 374245, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1802640000, 950733809, (-14149));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-349L), (-105840302932201213L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105840302932201562L) + "'", long2 == (-105840302932201562L));
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 99835208, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(942883156, 30938270);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 973821426 + "'", int2 == 973821426);
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 35691361, 9864, 169916106);
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-963979), (-939637516));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -963979 * -939637516");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-896371847163213190L), (java.lang.Object) 2161649352804L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6143313703657988L), (long) 6289491);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6143313697368497L) + "'", long2 == (-6143313697368497L));
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1696938508761132422L), 3499544L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1696938508757632878L) + "'", long2 == (-1696938508757632878L));
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-184225), 1552777970L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1552962195L) + "'", long2 == (-1552962195L));
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1715696283), (-177664191), (-349946851), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-143625714) + "'", int4 == (-143625714));
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-193913417), 19027050);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -193913417 * 19027050");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 942883156, 11398, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-44735852), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44735852L) + "'", long2 == (-44735852L));
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) 'a', (-112110));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-112013) + "'", int2 == (-112013));
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-628056570), 151226407392820942L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -628056570 * 151226407392820942");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-82295380L), (-316040549803L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -82295380 * -316040549803");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(25311043, (-173612538), 841);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-148302337) + "'", int3 == (-148302337));
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(880, 56929);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50097520 + "'", int2 == 50097520);
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 620, 949427270, 2074908);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 620 for  must be in the range [949427270,2074908]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 66747848, 2005438, 339161818);
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9, 479643, 112110, 171459354);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 479652 + "'", int4 == 479652);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1715160045L), (-1491870284961L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1493585445006L) + "'", long2 == (-1493585445006L));
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 315624238L, (java.lang.Object) (-631518));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3224329627922L, 374064183);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3224329627922 * 374064183");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 3038, 997272303356728L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 997272303359766L + "'", long2 == 997272303359766L);
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-48997500770L), (long) (-107222400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49104723170L) + "'", long2 == (-49104723170L));
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-193913417));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 193913417 + "'", int1 == 193913417);
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(88593817038090L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-97146319L), (java.lang.Object) 299824116L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeAdd(1470988428, 1715159733);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 1470988428 + 1715159733");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1766617203), (-521191424));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 920745735694467072L + "'", long2 == 920745735694467072L);
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(577142280, 494910);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 577637190 + "'", int2 == 577637190);
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1588537255313989800L, (-2252833699517034L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1588537255313989800 * -2252833699517034");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6407448068723144L), (java.lang.Object) 285247083614292030L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 19907100, (-1718668813));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34213711927272300L) + "'", long2 == (-34213711927272300L));
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 234356);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 234356 + "'", int1 == 234356);
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-69473305), (-249426407));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-318899712) + "'", int2 == (-318899712));
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1470988428), 81505686, 970111);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(161986, (-2111643072), (-6915), (-920));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1678) + "'", int4 == (-1678));
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1233314, (java.lang.Object) (-372966672741349L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1491865900688L), (java.lang.Object) 221881485L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 360218290347865389L, (java.lang.Object) (-98266495L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1989861, 1763475345, 127522249);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-479099231), (-9778), (-44));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 158, 8209L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8051L) + "'", long2 == (-8051L));
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 7801164, 1753263, (-3770626));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 449475895, 353600846, (-7633));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9700, (-30827186), 154650012, (-609053028));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(52L, 999731834);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51986055368L + "'", long2 == 51986055368L);
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(34969884374403777L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 34969884374403777");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1491870284961L), 10018356553040L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1491870284961 * 10018356553040");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 155277732, 1, 19907100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-69931974933849952L), (long) (-47610286));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -69931974933849952 * -47610286");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 4479918, (long) (-816756018));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 821235936L + "'", long2 == 821235936L);
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(48456411318684583L, 1300343640135249600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 48456411318684583 * 1300343640135249600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-185812352), (-1711678817), (-412));
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 63244232, (-35691361), 73381944);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(11041219000L, 3499543L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11037719457L + "'", long2 == 11037719457L);
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 97898534, (-210559234), (-163115));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97898534 for  must be in the range [-210559234,-163115]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-211672136), 4476722);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-947597308018192L) + "'", long2 == (-947597308018192L));
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 52, 668094673L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 668094725L + "'", long2 == 668094725L);
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1899810000, 3005390, (-586809815));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 1535634, (-43048525), 1665447152);
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(944118497, (-1000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 944118497 * -1000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1999662), (-3328434791324L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6655744571688532488L + "'", long2 == 6655744571688532488L);
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1119, (java.lang.Object) 1644046087286060L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 950048943);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 950048943 + "'", int1 == 950048943);
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(18980207, 1694976160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1713956367 + "'", int2 == 1713956367);
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 2820975, (long) (-1712671034));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1709850059L) + "'", long2 == (-1709850059L));
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3277662), 89178884, 7451);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-17287333), 300969892);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -17287333 * 300969892");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 90, (-873), 655);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2658977, 7739550);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2658977 * 7739550");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(199879, (-300490149));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 199879 * -300490149");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-538255), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-68277286), (-98640), (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(156879, 236129206, (-704683943), 1945308);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-470343167) + "'", int4 == (-470343167));
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-273456367L), 440807688333760L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -273456367 * 440807688333760");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1999662), (-1548000), (-2284741));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(5220641);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5220641) + "'", int1 == (-5220641));
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(99440784, (-32091870));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67348914 + "'", int2 == 67348914);
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 440284);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 440284 + "'", int1 == 440284);
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-33108325), (long) (-2078213183));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2045104858L + "'", long2 == 2045104858L);
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-99L), (java.lang.Object) 47986684L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 100962303, 3533859036L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3634821339L + "'", long2 == 3634821339L);
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-5171988535743697L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5171988535743697");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(101008454, (-954536506));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 101008454 * -954536506");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-106412324), (long) (-211672136));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105259812L + "'", long2 == 105259812L);
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(920745735694467072L, 18923102647343296L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 920745735694467072 * 18923102647343296");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1010899), (-1535304), 56929);
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-1801042329), (-1745996));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [-1801042329,-1745996]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 7451, 584515483, 347880555);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-351), 629990222, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3664729527270480L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3664729527270480");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 40322560, 106462890);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4292856269798400L + "'", long2 == 4292856269798400L);
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1175010), (long) 574676507);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-675250642490070L) + "'", long2 == (-675250642490070L));
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-66665530), 6015, (-9691));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -66665530 for hi! must be in the range [6015,-9691]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(46818643568457600L, 21205787594L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 46818643568457600 * 21205787594");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-106403849), 130141);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -106403849 * 130141");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-100188684), 9262271430L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-927974785422498120L) + "'", long2 == (-927974785422498120L));
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-445627), (-62000), 1121617, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-146793024), 870, (-300490249));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(15409940);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15409940) + "'", int1 == (-15409940));
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(936406936L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 936406936 + "'", int1 == 936406936);
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 16148174394800L, (java.lang.Object) 234356);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-468));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-468) + "'", int1 == (-468));
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(904180783, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 904180783 * 350");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 789, (-214173761), (-353600846));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 789 for hi! must be in the range [-214173761,-353600846]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 31285122);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31285122 + "'", int1 == 31285122);
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-14428), (-23067514), (-1308961551));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-330040725), (-2058678), 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-161986), 711148, (-1470988428), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1470439267) + "'", int4 == (-1470439267));
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-4785376), 0, 71700);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18591 + "'", int3 == 18591);
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1597671, 3499569, (-129224490));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1765497216, 843737, 690603420);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1765497216 for  must be in the range [843737,690603420]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2966), (long) 630000000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1868580000000L) + "'", long2 == (-1868580000000L));
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 532426752, 2294400, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1761393376L, (long) 57046);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 100480446527296");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-317147951), 363757, (-1981541));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 180346924, 166315521289630L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 180346924 * 166315521289630");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-689793507L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-689793507) + "'", int1 == (-689793507));
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-626882108), (-1278262));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-628160370) + "'", int2 == (-628160370));
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5625086), (-1794989));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -5625086 * -1794989");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-144504917L), (java.lang.Object) (-13091808990485L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 7735307, (-3499650), 677162);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(11862880, (-158), (-8467), (-67250068));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 155277600, (java.lang.Object) (-273471229715886774L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1025206), 0, 18000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 851 + "'", int3 == 851);
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-185446), (long) 105975170);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-106160616L) + "'", long2 == (-106160616L));
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 63244232, (-15961217));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1009454910950344L) + "'", long2 == (-1009454910950344L));
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-628056570), 1999672, 1715);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 853901, 1863519532, 252294596);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 853901 for  must be in the range [1863519532,252294596]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 64, (-1989648), 16524);
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1712671034));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1712671034) + "'", int1 == (-1712671034));
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 61090, (-10047));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 335272154, 168504917, (-479643));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-48014510), (long) (-47585));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-47966925L) + "'", long2 == (-47966925L));
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 43048525, 66558L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2865223726950L + "'", long2 == 2865223726950L);
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-17935552074L), 562466456350656L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 562448520798582L + "'", long2 == 562448520798582L);
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 339160985, 244500170901663600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 339160985 * 244500170901663600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-85369496), (long) 1620270);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-83749226L) + "'", long2 == (-83749226L));
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 239466083, (-130700686), 37948040);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 4234701900518950L, (java.lang.Object) (-169096781));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3959200563507L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3959200563507");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(314968481L, (long) (-53318417));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 261650064L + "'", long2 == 261650064L);
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(60512695340828866L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 60512695340828866");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-1010899), (-166558919), 959334);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3533859036L, 257397490);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 909606445880219640L + "'", long2 == 909606445880219640L);
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(121054052L, (long) 904180783);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-783126731L) + "'", long2 == (-783126731L));
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3776867040256966656L, (long) 2294419);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3776867040256966656 * 2294419");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-10221043), 218584530L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-228805573L) + "'", long2 == (-228805573L));
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-164261393856L), 562448520798582L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -164261393856 * 562448520798582");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(20983581987500L, 46920);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 984549666853500000L + "'", long2 == 984549666853500000L);
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-23067514), 132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23067382) + "'", int2 == (-23067382));
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-83374037));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-83374037) + "'", int1 == (-83374037));
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9798, 363757, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(474143286250L, (-232901752L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 474143286250 * -232901752");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 53248, (-176870209), (-190217798));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-357591120), (long) (-958364));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-356632756L) + "'", long2 == (-356632756L));
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-188790000), (-617272946631430954L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -188790000 * -617272946631430954");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-171478832), 167756399L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-28766671361045968L) + "'", long2 == (-28766671361045968L));
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-874263), 13, 4637904, (-349956635));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(3932594, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39325940 + "'", int2 == 39325940);
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-5220641), (-1696938508761132422L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -5220641 * -1696938508761132422");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(232883752, (-214183750), (int) (byte) 0, 46920);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25444 + "'", int4 == 25444);
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-789), (-1999662));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1577733318 + "'", int2 == 1577733318);
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) (-46266513));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-46266513L) + "'", long2 == (-46266513L));
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-40322560), (java.lang.Object) (-2304263));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-349956067));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-349956067) + "'", int2 == (-349956067));
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-543176618), 168573390);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-374603228) + "'", int2 == (-374603228));
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2529996136059146L), (java.lang.Object) 590309465);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-18048122527557L));
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(159779046, (-46895));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 159779046 * -46895");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2065028, (-1482832281));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2065028 * -1482832281");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 449475895, (-853901));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 635218511);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-40998), (-479099582), 347695);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(494910, 497209, (-10000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-87), 1121717, (-1517218488));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-132), (-101931854), (-45120), (-6289801));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 97960, 176421201);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17282220849960L + "'", long2 == 17282220849960L);
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-39585000), (-108685080), (-9123345));
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(2005883L, 29147069818202L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29147067812319L) + "'", long2 == (-29147067812319L));
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-10398), 36740191, (-106820930));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 37948040, (-1760510603), 951492297);
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-32083661), (-350034159L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 317950498L + "'", long2 == 317950498L);
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(99835728L, (-1925124040));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-192196160023701120L) + "'", long2 == (-192196160023701120L));
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 3509649, (-166558919), (-4074));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3509649 for  must be in the range [-166558919,-4074]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(936406936, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 936407036 + "'", int2 == 936407036);
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1454874), (-281698083), 2346662);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(47234L, 178215856L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8417847742304L + "'", long2 == 8417847742304L);
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1989648), (-1715860594));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1717850242) + "'", int2 == (-1717850242));
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1715, (-1925133904));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3301604645360L) + "'", long2 == (-3301604645360L));
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1245167, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 779L, (java.lang.Object) 1764040601L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 100, 1910207, (-944118497));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 3398104, 30938270, 3561650);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3398104 for hi! must be in the range [30938270,3561650]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3996819140L, (-3904249031000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3996819140 * -3904249031000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 920, 12487942, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 920 for hi! must be in the range [12487942,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(204685393, (-576));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 204685393 * -576");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-3031430), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-42656000L), 1450732L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -61882424192000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(351375808265460L, (long) 157773616);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 351375966039076L + "'", long2 == 351375966039076L);
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(252802, (-32091561), (-314527061));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(16855341570L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 16855341570");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) ' ', (-2153477), (-80));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for  must be in the range [-2153477,-80]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 97180281, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(100962303, (-1631883));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 100962303 * -1631883");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 600832203, 140869042, (-587951));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1954327840, 1761730, 1630546760);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1694976160L, 998888097);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1693091510922767520L + "'", long2 == 1693091510922767520L);
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 16524, 52357656, (-42377194));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3034108, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1563864028));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1563864028) + "'", int1 == (-1563864028));
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-159247253), 43740L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6965474846220");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1784800), 583633684, (-185812352));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 15, (-4256334), (-538255));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for hi! must be in the range [-4256334,-538255]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1480841467L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-82215000), 1692170940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1609955940 + "'", int2 == 1609955940);
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-4485350), 108684870);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104199520 + "'", int2 == 104199520);
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-880), (-6328990), (int) (short) 0, (-8990));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-79), 1990388, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -79 for  must be in the range [1990388,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 2065028);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2065028 + "'", int1 == 2065028);
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(10999L, (-69484055597017L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69484055586018L) + "'", long2 == (-69484055586018L));
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(709960, 0, 0, 312598477);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 709960 + "'", int4 == 709960);
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-122484040), 163143504L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40659464L + "'", long2 == 40659464L);
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1464528196L, 758468816);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1110798966818735936L + "'", long2 == 1110798966818735936L);
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) (-312315));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1938372, 1162, (-954811));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1938372 for hi! must be in the range [1162,-954811]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(97898534, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(94630394L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 94630394 + "'", int1 == 94630394);
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 4485377, 954811000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 950325624 + "'", int3 == 950325624);
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1784800);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1784800) + "'", int1 == (-1784800));
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 168472109, (-3536572631180667075L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 168472109 * -3536572631180667075");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 65147352L, (java.lang.Object) 13481055545529669L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(157773616, (-8372910), (-27826));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-782999) + "'", int3 == (-782999));
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-198112800), 152257, 959334);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 66558, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66558L + "'", long2 == 66558L);
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 201372638, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 201372638L + "'", long2 == 201372638L);
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9553, 497209, 106462890, 4710915);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 300969892, (-164837960));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49611263018700320L) + "'", long2 == (-49611263018700320L));
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1761730, 3611760, (-2077053035));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(38131L, (long) (-9123345));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9161476L + "'", long2 == 9161476L);
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(609053028L, (long) (-32091561));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -19545462400296708");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(155277600, 344919305, (-729976520), (-46322273));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-183457343) + "'", int4 == (-183457343));
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-17935542210L), (-299823236L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18235365446L) + "'", long2 == (-18235365446L));
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-951502398), (java.lang.Object) (-69931977800325472L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1505073L, (-16837798360961L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1505073 * -16837798360961");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(988966305600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 988966305600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1761176514));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1761176514 + "'", int1 == 1761176514);
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1889050220, 1174365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1889050220 * 1174365");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-69484049307216L), (long) (-38868600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69484088175816L) + "'", long2 == (-69484088175816L));
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 154650012, (-221718630), (-2065028));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-16919594));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16919594 + "'", int1 == 16919594);
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-8683), (-152286));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-160969) + "'", int2 == (-160969));
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 17423L, (java.lang.Object) 33928507455L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(89186674, 115104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89301778 + "'", int2 == 89301778);
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(32482053, (-330040725));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-297558672) + "'", int2 == (-297558672));
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-709901), (-62086), 442559);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(259940595, 3117618);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 263058213 + "'", int2 == 263058213);
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1712594601L, (-8699039L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1703895562L + "'", long2 == 1703895562L);
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-310), 3045000, (-400795139), 247971533);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3044690 + "'", int4 == 3044690);
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1893305L, (java.lang.Object) (-6983209393712L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-96990431), 2110080, (-1763460086));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-6959097913696L), (long) 152257);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1059571371045611872");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(688309020, (-1174461));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 687134559 + "'", int2 == 687134559);
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-51187193470L), (long) (-202050186));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-51389243656L) + "'", long2 == (-51389243656L));
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1763469777), (-103661485));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1867131262) + "'", int2 == (-1867131262));
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-164837960), (-1519234035));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 250427439091968600L + "'", long2 == 250427439091968600L);
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-88481780), 15172184748L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15083702968L + "'", long2 == 15083702968L);
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 874089, (-185867227), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 874089 for  must be in the range [-185867227,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-291727568998734L), (java.lang.Object) 34999199570L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(949426390, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 949426390 + "'", int2 == 949426390);
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 347695, (-46266513L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-45918818L) + "'", long2 == (-45918818L));
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(874089, (-8467));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 865622 + "'", int2 == 865622);
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(700L, (long) (-211672136));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-211671436L) + "'", long2 == (-211671436L));
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(56345789571487830L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 56345789571487830");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-159247253));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-159247253) + "'", int1 == (-159247253));
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-352813075), (-1879789912));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -352813075 * -1879789912");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-635218511), (-6564960), (-1943430), 128814969);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12008529 + "'", int4 == 12008529);
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1090328), (-4665));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1090328 * -4665");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-299444533), 106462890);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -299444533 * 106462890");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1530017442, (long) (-6564960));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1523452482L + "'", long2 == 1523452482L);
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1761079449), 1423185088314780L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1761079449 * 1423185088314780");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 9123345, (long) 951492297);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-942368952L) + "'", long2 == (-942368952L));
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(532423755, 518500854);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1050924609 + "'", int2 == 1050924609);
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2235115L), 1552777970L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3470637332416550");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 952906578, (-91), 314527061);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 952906578 for  must be in the range [-91,314527061]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(5148, 166836);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 171984 + "'", int2 == 171984);
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-83850), (-1784800));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1868650) + "'", int2 == (-1868650));
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2078227400));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2078227400 + "'", int1 == 2078227400);
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-100459953), (java.lang.Object) (-21674210715L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(131567583380400L, (-3162));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-416016698648824800L) + "'", long2 == (-416016698648824800L));
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(7664124L, (long) (-113827897));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-872391117267228L) + "'", long2 == (-872391117267228L));
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-352818223), (-1989866), (-64244));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-429214) + "'", int3 == (-429214));
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-316451466), 1863519532, (-601337), (-1925133904));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1718668813), 71700, (-704792495));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1718668813 for hi! must be in the range [71700,-704792495]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-911), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 320016841, (-1897132), 7739630);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1621913841), (-1974990), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1621913841 for hi! must be in the range [-1974990,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-21674210715L), 48456411170162501L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48456389495951786L + "'", long2 == 48456389495951786L);
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1686886240, 6236554379070120000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1686886240 * 6236554379070120000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1162, (-65066));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63904) + "'", int2 == (-63904));
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 349956900, (-592), (-46266513));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1715156650), 2110080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1713046570) + "'", int2 == (-1713046570));
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 171478832, 1196082674834130L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1196082846312962L + "'", long2 == 1196082846312962L);
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(293634L, 9864);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2896405776L + "'", long2 == 2896405776L);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-106412530), 30906162, 64);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -106412530 for hi! must be in the range [30906162,64]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(585912, 479643, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(341736148L, (long) (-322));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 341735826L + "'", long2 == 341735826L);
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-412), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-360) + "'", int2 == (-360));
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-401), (-16990520), (-399618));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-16591304) + "'", int3 == (-16591304));
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1722798370), 46895, (-12141), 30906162);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8673549 + "'", int4 == 8673549);
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1794561), (-2077053035));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1794561 * -2077053035");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-954811), (-551461), 0, 420368508);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 418862237 + "'", int4 == 418862237);
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 219899, (long) 1788087917);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 393198744860383L + "'", long2 == 393198744860383L);
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(838552037616L, (-1370574));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1149297620403511584L) + "'", long2 == (-1149297620403511584L));
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(32482053);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32482053) + "'", int1 == (-32482053));
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-318798683), (-120480045), (-708129348), 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-439278728) + "'", int4 == (-439278728));
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1838749L), 1023871892793449L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023871890954700L + "'", long2 == 1023871890954700L);
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(39380L, (-278567552L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-278528172L) + "'", long2 == (-278528172L));
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 22112703, (-1950782797076L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 22112703 * -1950782797076");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 600814779, (-106820930), 1711678817);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 445, 11037719457L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4911785158365");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 351377762593300L, (java.lang.Object) (-628160370));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-40322560), (java.lang.Object) (-33497323268811150L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3499569), 1139, (-32091870));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 4476722, (-62086), (-201));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1233314, (java.lang.Object) 1442617128743874624L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2658977, 47524559);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50183536 + "'", int2 == 50183536);
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) '4', 418862237, (-949417406));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-570400), 507005, 89372027);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-5772L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5772) + "'", int1 == (-5772));
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 35032, (-708129348), 633647822);
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 410609746, (-1794561), 700229040);
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3534494), 199879);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3334615) + "'", int2 == (-3334615));
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1075328), (-40322560), 9875);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1075328) + "'", int3 == (-1075328));
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-290212L), (long) 1050924609);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-304990932627108L) + "'", long2 == (-304990932627108L));
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-833426), (-468));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 390043368L + "'", long2 == 390043368L);
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-108109069), (-84756249), (-6960));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-23359779) + "'", int4 == (-23359779));
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(324823060);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-324823060) + "'", int1 == (-324823060));
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5740, (-230496894710400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1323052175637696000L) + "'", long2 == (-1323052175637696000L));
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2294400, (-318899712));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-316605312) + "'", int2 == (-316605312));
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3393632929991L), 27L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -91628089109757");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(100978790, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9070, (-114270654247874256L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 9070 * -114270654247874256");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(244660486356L, (long) 1010);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 247107091219560");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(35517209338L, 3499569);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 124294924765775322L + "'", long2 == 124294924765775322L);
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-554152210812027L), (-17287333));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -554152210812027 * -17287333");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1530020623L), (long) 629990222);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -963898031948348306");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5899809, (-9787769));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-57745967636121L) + "'", long2 == (-57745967636121L));
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-148474462), 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-148474454) + "'", int2 == (-148474454));
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(812374164);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-812374164) + "'", int1 == (-812374164));
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-3001260454776L), (-153847618973551131L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 153844617713096355L + "'", long2 == 153844617713096355L);
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1149297620403511584L), (-186099201288L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1149297620403511584 * -186099201288");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 47652415, 0, 1889050220);
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1990611);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1990611 + "'", int1 == 1990611);
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1712671034), 335272134);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1377398900) + "'", int2 == (-1377398900));
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-4074), (long) 202685432);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-825740449968L) + "'", long2 == (-825740449968L));
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-400795139), 1742278, 4710915);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -400795139 for hi! must be in the range [1742278,4710915]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1785587, (-100189684), (-100188684));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1785587 for hi! must be in the range [-100189684,-100188684]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 315624238L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(507861150L, (-1791894));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-910033347518100L) + "'", long2 == (-910033347518100L));
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-531793), 709790, (-66534));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 0, (-78346));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [0,-78346]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-5625086), (-34386307), (-434897505));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -5625086 for hi! must be in the range [-34386307,-434897505]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(17282220849960L, (-1209329613L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17281011520347L + "'", long2 == 17281011520347L);
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 124486545, (-5588424), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 124486545 for  must be in the range [-5588424,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 18919589, (int) (byte) 0, (-873812));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-869115), (-38071105817L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 33088169132141955");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-349L), 6237554960000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2176906681040000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1786407669), (long) 168472109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -300959867530203921");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-158), 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-150) + "'", int2 == (-150));
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-192174760));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-192174760) + "'", int2 == (-192174760));
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(35032, 1681112017, 239466083);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 20731669, (long) 46940);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 973144542860");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(21204074340L, 62140372134160L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 21204074340 * 62140372134160");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(7918735662838L, (long) (-13986));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-110751436980452268L) + "'", long2 == (-110751436980452268L));
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 127522249, (-232901752L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 360424001L + "'", long2 == 360424001L);
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 39341073, (long) 174629);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39166444L + "'", long2 == 39166444L);
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-40322560), (-193913417), 0);
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-539633), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1715156650), (-536575));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1715156650 * -536575");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1463930970), (-357544679));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1463930970 * -357544679");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-53553755), 22759878, (-5571553));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1879789912), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 634, 3483304, 304341822);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-749972960145811L), (-15960657L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -749972960145811 * -15960657");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-99964856L), (-30829218210000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30829318174856L) + "'", long2 == (-30829318174856L));
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5802206573999812L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1185347686, (java.lang.Object) (-958364));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1162, 96, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1162 for  must be in the range [96,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-5827567963889969L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5827567963889969");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(299785985L, 1505073L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 301291058L + "'", long2 == 301291058L);
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 586809815, (-85250028), 999000207);
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-64244), (-959232), (-47525247));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-3031430), (long) 18000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3013430L) + "'", long2 == (-3013430L));
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 22112703, 10, 1802640001);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5740, (-42377194));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-243245093560L) + "'", long2 == (-243245093560L));
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 16143426, (long) 936406936);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15116816077202736L + "'", long2 == 15116816077202736L);
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9778), (-935157147));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -9778 * -935157147");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1711678817), (-192172), (-882074), 913332845);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 116558851 + "'", int4 == 116558851);
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5148, (-312), (-37243837));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(868, 1498687);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300860316 + "'", int2 == 1300860316);
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-951492297), 950100085);
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3328440011854L, (-391376272));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3328440011854 * -391376272");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-54530170));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 54530170 + "'", int1 == 54530170);
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3499650L, 105747297328531560L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105747297325031910L) + "'", long2 == (-105747297325031910L));
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-169096781));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-169096781) + "'", int1 == (-169096781));
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-79), 504032, 13830712);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13326602 + "'", int3 == 13326602);
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(503932, (-9787769));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 503932 * -9787769");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-356632756L), 23210880L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8277760103585280L) + "'", long2 == (-8277760103585280L));
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(57046, 1718668813, 1943780, (-4256334));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 17287395, (-153909051877008000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 153909051894295395L + "'", long2 == 153909051894295395L);
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 668094725L, (java.lang.Object) 2987409);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 493779, 108109069, (-47620));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 493779 for hi! must be in the range [108109069,-47620]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 116558851, (java.lang.Object) 949269348L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-300490249), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(109359833005692L, 64244L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 109359832941448L + "'", long2 == 109359832941448L);
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(801902322, (-159247253), (-180346924));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 843737, (long) (-198112800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-197269063L) + "'", long2 == (-197269063L));
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-143625714), (java.lang.Object) (-48452041L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(94747747L, 14183355090099L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 94747747 * 14183355090099");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(31362155, (-83374037), (-47585), (-1174462));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-756956242325977L), 119268465L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -756956242325977 * 119268465");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(153428, 4485377, (-633647202));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1761394244, (-1786407669), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-970111), (-18), 9788);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 782 + "'", int3 == 782);
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3505733204650976000L), (long) (-521191424));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3505733204650976000 * -521191424");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 288303652, (-1056), (-15961567));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-43296), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43296) + "'", int2 == (-43296));
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(252802);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-252802) + "'", int1 == (-252802));
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-330108976L), (-1695974308120618750L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -330108976 * -1695974308120618750");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-848595844), 586810735, (-2581684));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -848595844 for  must be in the range [586810735,-2581684]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 34385857, (java.lang.Object) (-1785587));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1338887, (java.lang.Object) (-708510));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1713254), (-1119), 38868600);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-15951520), 124294924765775322L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -15951520 * 124294924765775322");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-992165), 2439621, 104767);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-607951483), (-2294419));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 97405);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97405 + "'", int1 == 97405);
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 87426300, (java.lang.Object) 10390598192847356L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1621913841), (-5), (-2065028), (-85250028));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(586809815, (-25801760), 100, 63649178);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51815423 + "'", int4 == 51815423);
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1722798370), (-350000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1723148370) + "'", int2 == (-1723148370));
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 533310184);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 533310184 + "'", int2 == 533310184);
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(105840302930257433L, 1470988937L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105840301459268496L + "'", long2 == 105840301459268496L);
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(48321945L, (-1989866));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-96154195409370L) + "'", long2 == (-96154195409370L));
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-6370157478L), (long) 1850695);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -11789218593747210");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2346662, (-7962730000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18685835907260000L) + "'", long2 == (-18685835907260000L));
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1838776, 600832203);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1838776 * 600832203");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(7801164, 865254);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 7801164 * 865254");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-31706623206000L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1212378), (-813548518), 152257, 1495740);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 733892 + "'", int4 == 733892);
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1761176514, 1786407669);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1761176514 * 1786407669");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 47234, 0, (-551461));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-299823236L), 620);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-185890406320L) + "'", long2 == (-185890406320L));
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeAdd(1762676017, 668094673);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 1762676017 + 668094673");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-96154195409370L), (java.lang.Object) 2076974496576L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(32482072, 349956900, 9788, (-954811));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-207514568383616L), (java.lang.Object) (-3996518737L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(576693690, (-704792495));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-128098805) + "'", int2 == (-128098805));
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-252802));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 252802 + "'", int1 == 252802);
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 349956900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-399618), (-48014510), (-15952400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 192159473, (-3499017566107L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 192159473 * -3499017566107");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-854669577), (-226721592L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-627947985L) + "'", long2 == (-627947985L));
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(986060405);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-986060405) + "'", int1 == (-986060405));
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(39166444L, (-2304264));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90249826917216L) + "'", long2 == (-90249826917216L));
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-188790000), (long) 299315787);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-56507827427730000L) + "'", long2 == (-56507827427730000L));
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 2295252);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2295252 + "'", int2 == 2295252);
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 105840301459268496L, (java.lang.Object) 66534);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(526667328L, 304461111);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 160349719810281408L + "'", long2 == 160349719810281408L);
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 347880555, (long) 185877195);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 64663061758443225L + "'", long2 == 64663061758443225L);
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-177664191), (java.lang.Object) 651042820918L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 124486545, 1517218488, (-767464499));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-463289376), 958464, (-603474758));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 46895, (-1897132), 317049115);
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-854669577));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 854669577 + "'", int1 == 854669577);
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 207586242, 4292856269798400L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 207586242 * 4292856269798400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 8372910, 1385620419, 185867227);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-704683943), 1111, (-318798683));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3349062, (java.lang.Object) (-6168898053733568L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

