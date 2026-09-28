package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test06501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06501");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(169182050, (-728));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 169182050 * -728");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 45976945, (long) (-1454523));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-66874523972235L) + "'", long2 == (-66874523972235L));
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2065028, 314527061, (-1761078660));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 954811, (-848595844), (-152286));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 954811 for hi! must be in the range [-848595844,-152286]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-4506), 159779046, 52, 1785587);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 861836 + "'", int4 == 861836);
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-595172454895665012L), (long) (-2065028));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -595172454895665012 * -2065028");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-15805100), 1761394973, 1715698242, (-1196950));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 108685080, 31285122, 3337664);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 108685080 for  must be in the range [31285122,3337664]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 352818223, (java.lang.Object) (-100189684));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 9989, 149158, 2111643072);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9989 for  must be in the range [149158,2111643072]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1482832080, 1718668813, (-67634529));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1482832080 for  must be in the range [1718668813,-67634529]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(105840302930257433L, (-708129348));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 105840302930257433 * -708129348");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2658977, (-169916106));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-451803017783562L) + "'", long2 == (-451803017783562L));
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-949417406), (-708510), (-601337));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-605984) + "'", int3 == (-605984));
    }

    @Test
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2295252);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2295252) + "'", int1 == (-2295252));
    }

    @Test
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1213583), (java.lang.Object) 5065060L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-210), (-185867227), (-107726638));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 22384927, 0, (-155277600));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(808191813, 1495740);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 808191813 * 1495740");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-96990431), (-14307), (-1753701626));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 230746822, (-1260249216542316L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 230746822 * -1260249216542316");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1481377506, (long) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 29627550120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(958464, 880);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 959344 + "'", int2 == 959344);
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(100962303, (-1278262));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99684041 + "'", int2 == 99684041);
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-705439449L), (long) 108109069);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-813548518L) + "'", long2 == (-813548518L));
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-43296), (-3499650), 5740);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-43296) + "'", int3 == (-43296));
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(234356);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-234356) + "'", int1 == (-234356));
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 47652415, (long) (-48512377));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2311731921440455L) + "'", long2 == (-2311731921440455L));
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1454524), 66747848, 949348709);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-168472090));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 168472090 + "'", int1 == 168472090);
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2250), (-2005430), (-1278262));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2250 for hi! must be in the range [-2005430,-1278262]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-87777016550L), (long) (-155277600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-87932294150L) + "'", long2 == (-87932294150L));
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(58722695302115300L, (long) 24429098);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 58722695302115300 * 24429098");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1990810, 1802640000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3588713738400000L + "'", long2 == 3588713738400000L);
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2440438, (-232883752));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2440438 * -232883752");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 2248540);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2248540 + "'", int1 == 2248540);
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1715697100), (-3480228), 455569728);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1715697100 for  must be in the range [-3480228,455569728]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1492005, (-4256334));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6350471609670L) + "'", long2 == (-6350471609670L));
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-47620), (-15951520), (-10398));
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(88593817038090L, (long) (-827878));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88593816210212L + "'", long2 == 88593816210212L);
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 101931854, (long) (-122484040));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20552186L) + "'", long2 == (-20552186L));
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 198109764L, (java.lang.Object) 8730);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(159767100L, (long) 410609746);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 65601928350156600L + "'", long2 == 65601928350156600L);
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(3561650, (-78346));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3483304 + "'", int2 == 3483304);
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-554152210812027L), (java.lang.Object) 7018146835128L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1410L, (long) 317049115);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 447039252150L + "'", long2 == 447039252150L);
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) (-1090328));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2047501715L), (long) (-100460641));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 205693334737499315L + "'", long2 == 205693334737499315L);
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-102950433), 576693690, 66747848);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-939637516), 5081281L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4774562256937996L) + "'", long2 == (-4774562256937996L));
    }

    @Test
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 14343);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14343 + "'", int1 == 14343);
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-299552), 153251, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-7833964763976120L), 16524);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -7833964763976120 * 16524");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-31706623206000L), (-4918422756L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -31706623206000 * -4918422756");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(7978668911586900L, (long) (-949512368));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 7978668911586900 * -949512368");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(494910, 1620, (-78346));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1117972070L), (-149158L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 166754478017060");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2111643072, (-8700000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18371294726400000L) + "'", long2 == (-18371294726400000L));
    }

    @Test
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(7018146835128L, (long) (-767454452));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 7018146835128 * -767454452");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 157773616, (-709901), (-2581684));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 157773616 for hi! must be in the range [-709901,-2581684]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-4), (-34386408), (-1174462));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4 for  must be in the range [-34386408,-1174462]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-15651849), 56611);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15595238) + "'", int2 == (-15595238));
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2304106, 9999);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23038755894L + "'", long2 == 23038755894L);
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-275138387L), (-99114930L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 27270321967817910");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 156879, (-6959097913696L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6959098070575L + "'", long2 == 6959098070575L);
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-10398), (long) 1715698242);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1715708640L) + "'", long2 == (-1715708640L));
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-576), (-1999672), 47525347, 539633);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1056), 1784800, (-1713254));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-60437), 2074908);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2014471 + "'", int2 == 2014471);
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-52), 374245, (-524160));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-106403849), 3561650, 100978790);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 132, (long) (-157922));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-157790L) + "'", long2 == (-157790L));
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 635218511, (-5171989170962208L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5171988535743697L) + "'", long2 == (-5171988535743697L));
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(32482053, (-46322273), (-6289801));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7550420) + "'", int3 == (-7550420));
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 34386390, 715471229, (-497209));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34386390 for  must be in the range [715471229,-497209]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-110929580820L), (-1196950));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 132777161762499000L + "'", long2 == 132777161762499000L);
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2295252, (-696874493105108L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2295252 * -696874493105108");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(90, 149158, (-1760510603), 1290307);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 149248 + "'", int4 == 149248);
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2294419), 583633684, (-153251));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1816), 88593816210212L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-160886370237744992L) + "'", long2 == (-160886370237744992L));
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 299785985, (-161367880800L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 299785985 * -161367880800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-66558));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66558L + "'", long2 == 66558L);
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(46322273, 1999672);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48321945 + "'", int2 == 48321945);
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-47525247), (-6142282650476246L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -47525247 * -6142282650476246");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-221718630), 1117972070, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -221718630 for  must be in the range [1117972070,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-122484040), 1889050220);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -122484040 * 1889050220");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 97960);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-5234757L), (long) 455569728);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2384796822636096");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-299315787), (long) (-34386408));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 10292394772623096");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2L, 1766929518);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3533859036L + "'", long2 == 3533859036L);
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1753701626), 1763475345, 185867148);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-300979678), 8700);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -300979678 * 8700");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-171478832), 843737);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-144683035275184L) + "'", long2 == (-144683035275184L));
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(530216924, (-107726638));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 530216924 * -107726638");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1491865838400L), (-4446561L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1491870284961L) + "'", long2 == (-1491870284961L));
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(503932, (-153066));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 503932 * -153066");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-166315520939630L), 19322798960746L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -166315520939630 * 19322798960746");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-89), (-8372910));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 745188990 + "'", int2 == 745188990);
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-316451466), 10497554, (-1763425054));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9737812), 204685393);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -9737812 * 204685393");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1794561), 586809815, (-107726616));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 351, (-257), (-46851));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 351 for  must be in the range [-257,-46851]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-157922));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 157922 + "'", int1 == 157922);
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1925133904));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1925133904 + "'", int1 == 1925133904);
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-63864));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63864 + "'", int1 == 63864);
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2440438, 317049115, 17802);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2440438 for hi! must be in the range [317049115,17802]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(85342, 0, (-1755920876));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3068128025859464L), (-951493242L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3068128025859464 * -951493242");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(54920, (-1763425054), 1234120, 231190314);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 76279426 + "'", int4 == 76279426);
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2284512), (-372968475389952L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372968477674464L) + "'", long2 == (-372968477674464L));
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-17423), 1765497216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -17423 * 1765497216");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-67250068), (-102950433));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -67250068 * -102950433");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1090328), 0, (-184));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-40322560));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40322560 + "'", int1 == 40322560);
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-244598366660L), (java.lang.Object) 1765498096L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-244598366660L), (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 244598366660L + "'", long2 == 244598366660L);
    }

    @Test
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 85342, 3398104, (-17287395));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(69988520000L, (-10221043));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-715355672426360000L) + "'", long2 == (-715355672426360000L));
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-100), 904180783L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90418078300L) + "'", long2 == (-90418078300L));
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1119);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1119) + "'", int1 == (-1119));
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-99964856L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1715697100), 97770171L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-167743998851204100L) + "'", long2 == (-167743998851204100L));
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-323442480), (-84385200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27293758363296000L + "'", long2 == 27293758363296000L);
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-190043702731531L), 1505073L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -190043702731531 * 1505073");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 106575000, (-254849), 34386390);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 106575000 for hi! must be in the range [-254849,34386390]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2304264, 861836, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 420386456, (java.lang.Object) 168472090);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 1481378917L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-31916932), 0, (-171469054));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(169182050, 2658977, 549, (-86130));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 64);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-3480228), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3480228L) + "'", long2 == (-3480228L));
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 8342398507184L, (java.lang.Object) 168432611L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2014471, (-168573390));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-166558919) + "'", int2 == (-166558919));
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-190043702986380L), (long) 399618);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -190043702986380 * 399618");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-11), (-709281L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-709292L) + "'", long2 == (-709292L));
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 576693690, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(3996818940L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3996818940");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(39380L, 324783680L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 324823060L + "'", long2 == 324823060L);
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-21191523080L), (long) 63864);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1353375429981120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1925133904), 236129206, 176421201);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-232883752), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-232883752L) + "'", long2 == (-232883752L));
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1763425054), 52, 1224547070, (-85342));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 904180783, (-82211962L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 986392745L + "'", long2 == 986392745L);
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-412), 1185347686);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -412 * 1185347686");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1792856), (-1784800));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1792856 * -1784800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 10497554);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10497554 + "'", int1 == 10497554);
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 833, 2284622, 399618);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 833 for  must be in the range [2284622,399618]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3652836, 149158);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 544849712088L + "'", long2 == 544849712088L);
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-62000), 592, 1943430, 231793424);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 229788587 + "'", int4 == 229788587);
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-9537), (-598901407), 649332);
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3481738, (-1766929518));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6151985646142284L) + "'", long2 == (-6151985646142284L));
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(99593070, 1495740, (-601292683), (-21104292));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-479099582) + "'", int4 == (-479099582));
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 312598477, (-1025206));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-320477834211262L) + "'", long2 == (-320477834211262L));
    }

    @Test
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(176411200, 0, (-1450647));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2294419), 1753263, (-853932), (-7550420));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-48014510), 635218511);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 587204001 + "'", int2 == 587204001);
    }

    @Test
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 27, (-208569710), 3481738);
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 17981, (-949512368), 288303652);
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-129224490), (-54948));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-129279438) + "'", int2 == (-129279438));
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 134785804193901L, (java.lang.Object) 2294400);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-232883752), (-107726638), (-232883752));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-5588424), 99406108L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -555523479693792");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2005438, 350034159);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 352039597 + "'", int2 == 352039597);
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3038), 296192052);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 296189014 + "'", int2 == 296189014);
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-302176508), (java.lang.Object) (-9700));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 171478518, 347880555, (-503932));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-32091561), 6289801L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-25801760L) + "'", long2 == (-25801760L));
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(9797, 159247253);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 9797 * 159247253");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(324823060L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 324823060 + "'", int1 == 324823060);
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 174629, (-23869018920L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4168222904980680");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-173543841));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 173543841 + "'", int1 == 173543841);
    }

    @Test
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1505073, 1454523, (-1788088016));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 21963942, 0, 1910207);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1878586821103608868L, (-970000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1878586821103608868 * -970000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-79), (-1715159045));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1715159124) + "'", int2 == (-1715159124));
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(178215856L, 3126427212L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 557178901808273472");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(10000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10000) + "'", int1 == (-10000));
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-503932), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1090328), 168544800, (-704619699), (-314));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-537164914) + "'", int4 == (-537164914));
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-524160), 0, (-2284512));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1967089), 590309465, 1712604379, 1925133904);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1863519532 + "'", int4 == 1863519532);
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(99370817, 1786407669, (-4), (-498646));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 155988945);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 155988945 + "'", int1 == 155988945);
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-66665530), (long) 320016841);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-21334092314190730L) + "'", long2 == (-21334092314190730L));
    }

    @Test
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-15359825771300L), (-108685080));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -15359825771300 * -108685080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(442560);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-442560) + "'", int1 == (-442560));
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-10001), 153428, (-132));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10001 for hi! must be in the range [153428,-132]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(7739630L, (-1925478829728L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1925471090098L) + "'", long2 == (-1925471090098L));
    }

    @Test
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-204298726));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 204298726L + "'", long2 == 204298726L);
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-523), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-523L) + "'", long2 == (-523L));
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(849755880L, (-490002));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-416382080711760L) + "'", long2 == (-416382080711760L));
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(342580000L, 1588537255313989800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 342580000 * 1588537255313989800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-5), (-3259723543377L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16298617716885L + "'", long2 == 16298617716885L);
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 695393, (long) 100490000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 69880042570000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1174462), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1174461) + "'", int2 == (-1174461));
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3491750L, (-17935455200L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -62626125694600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-5), (-3664729514250000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 18323647571250000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1462491242), (long) (-204614145));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1257877097L) + "'", long2 == (-1257877097L));
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 2440438, (long) 1117972070);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1115531632L) + "'", long2 == (-1115531632L));
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(910L, (long) (-244802));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-222769820L) + "'", long2 == (-222769820L));
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-4785376), (-221718630));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1061007010754880L + "'", long2 == 1061007010754880L);
    }

    @Test
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-257), (-53816));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13830712 + "'", int2 == 13830712);
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1530017442), 1943780);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1528073662) + "'", int2 == (-1528073662));
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 17423, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17423L + "'", long2 == 17423L);
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeAdd((-2078213173), (-349957368));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2078213173 + -349957368");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(27958980540699360L, 27166902510L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27959007707601870L + "'", long2 == 27959007707601870L);
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1196950), (-66534));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 79637871300L + "'", long2 == 79637871300L);
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(15172184748L, (-1463859251L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 15172184748 * -1463859251");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 296189014, (long) (-211672136));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 507861150L + "'", long2 == 507861150L);
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2308425L), (long) (-13020480));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15328905L) + "'", long2 == (-15328905L));
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-709960));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-709960) + "'", int1 == (-709960));
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(951372194, 3499650, (-82215000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-210), (-107726638), 600832203);
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 201354638, 47620);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9588507861560L + "'", long2 == 9588507861560L);
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-96), (-196978221L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 18909909216");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-15127036540L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -15127036540");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-46322273), (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46322264) + "'", int3 == (-46322264));
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1738657), 410609746);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1738657 * 410609746");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-244598366660L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -244598366660");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(314527061);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-314527061) + "'", int1 == (-314527061));
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2065033);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2065033) + "'", int1 == (-2065033));
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3055503590L, 105019800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 320888375921082000L + "'", long2 == 320888375921082000L);
    }

    @Test
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-166315559808230L), 38975286600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-166276584521630L) + "'", long2 == (-166276584521630L));
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1402038L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1990710, 21202083630L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21204074340L + "'", long2 == 21204074340L);
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 168472090, 299824116, (-34386308));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 168472090 for hi! must be in the range [299824116,-34386308]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 4043031, 15, 152257);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4043031 for  must be in the range [15,152257]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(102842949170344L, 184);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18923102647343296L + "'", long2 == 18923102647343296L);
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-81725049), 1450732L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -118561143785868");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 126482100, (java.lang.Object) 890876710L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2219795222L), (java.lang.Object) (-4000008832000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1530017442), (long) 3181);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1530020623L) + "'", long2 == (-1530020623L));
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1761176514), (-1988776), 1753263);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1324326 + "'", int3 == 1324326);
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1945308, 6015, (-201));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(121054000L, (-52L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 121054052L + "'", long2 == 121054052L);
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 0, (-1278262), 1763475345);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-536575), 590309473, 106575000, 1620270);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(48014600L, 46920L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47967680L + "'", long2 == 47967680L);
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(168459464876L, (long) (-600832203));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 167858632673L + "'", long2 == 167858632673L);
    }

    @Test
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-524160));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 524160 + "'", int1 == 524160);
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, 600832203);
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 34994510314L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 590319565L, (java.lang.Object) (-34089228354420L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-19), (-99990000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1899810000 + "'", int2 == 1899810000);
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-31706623206000L), (java.lang.Object) 7089931017340773L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 8377331086656L, (java.lang.Object) (-62000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1761394973, 14227, 101008454, 2440438);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2736642286L, (-949021208L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2597131568123601488L) + "'", long2 == (-2597131568123601488L));
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 219899, 0, 374245);
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(122377675L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 122377675L + "'", long2 == 122377675L);
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-352818223), 252802, 715471229);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1816), (-107726638), 677162);
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1481678848L, (long) 1765497216);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2615899881150087168L + "'", long2 == 2615899881150087168L);
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-37993868L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-37993868L) + "'", long2 == (-37993868L));
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-61432903456869L), (java.lang.Object) 285247083614292030L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1638607297, (-15595238), 711052);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 638821068, (-3532739400000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3532100578932L) + "'", long2 == (-3532100578932L));
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1967089), (-655556), (-312));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1967089 for hi! must be in the range [-655556,-312]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 159779046, (-9778), (-34386308));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-76533), (-511785248), 33108325);
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 4240387, (long) 249426407);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1057664493699509");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 628023133, 0, (-212411343));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 99375169L, (java.lang.Object) 66747848L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-22112703), 13393);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-296155431279L) + "'", long2 == (-296155431279L));
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1711678817));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1711678817 + "'", int1 == 1711678817);
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2005438));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2005438 + "'", int1 == 2005438);
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 420386456, (-56464401015740232L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56464401436126688L + "'", long2 == 56464401436126688L);
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-10689680), 669L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10690349L) + "'", long2 == (-10690349L));
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10049, (-631518), 46895);
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-450), 2005438);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2004988 + "'", int2 == 2004988);
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 198112800, 43296, 254849);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-1616447619072L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1616447619072");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(204685393, (-64244));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 204621149 + "'", int2 == 204621149);
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-156879));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-156879) + "'", int1 == (-156879));
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-105975170));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-105975170) + "'", int1 == (-105975170));
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(958464, 870);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 959334 + "'", int2 == 959334);
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(594427L, (-1763460086));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1048248288540722L) + "'", long2 == (-1048248288540722L));
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1738657, 67276566, (-789467264));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1738657 for  must be in the range [67276566,-789467264]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 85229052, (-853932), 3034108);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 85229052 for hi! must be in the range [-853932,3034108]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(944118497, 1492005, 620, (-304461011));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1131200L), (-389272800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 440345391360000L + "'", long2 == 440345391360000L);
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-416614049L), (long) 959334);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-415654715L) + "'", long2 == (-415654715L));
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 976536, (-130200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-127144987200L) + "'", long2 == (-127144987200L));
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1990710, 600832203);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1196082674834130L + "'", long2 == 1196082674834130L);
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1454523, 63692829L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 65147352L + "'", long2 == 65147352L);
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(17981, 2987409);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3005390 + "'", int2 == 3005390);
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1761176514), 489444, (-18400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(26511982, 66747848, (-100), (-949417406));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1715696724), 5740, 861836);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2922338), (-767454452), 63244232);
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-47585), 0, (-8700000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -47585 for  must be in the range [0,-8700000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1760510603), 0, 1838776);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1989524), (-208569710));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-210559234) + "'", int2 == (-210559234));
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(47234L, (long) (-100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4723400L) + "'", long2 == (-4723400L));
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeAdd((-1528073662), (-949427270));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -1528073662 + -949427270");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1763460000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1763460000) + "'", int1 == (-1763460000));
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1765497216, 173543841, (-3034108));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2235115L), (java.lang.Object) (-27409742280L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(14227, (-288303652), 1620, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-952557498), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 873, (java.lang.Object) (-17292594123200L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1370574, (-30352410), 677162);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1370574 for  must be in the range [-30352410,677162]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 185877195, 1221, (-7633));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(314968500L, 1764040601L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2079009101L + "'", long2 == 2079009101L);
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1763475345, (-46322264), (-168572690));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1999662), 350000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1649662) + "'", int2 == (-1649662));
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-949427270), (-11), 6289491, (-5203027));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(592, (-100459953));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 592 * -100459953");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-15961217), (-66534), 3561650);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -15961217 for hi! must be in the range [-66534,3561650]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 219899, (-696874493105108L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-696874492885209L) + "'", long2 == (-696874492885209L));
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1763459996L), 48014596L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -84671819270101616");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(533301015, (-1763450397));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 533301015 * -1763450397");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 861836, (long) (-511785248));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-441074950995328L) + "'", long2 == (-441074950995328L));
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(17981, 168573390, 236129206);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 202685432 + "'", int3 == 202685432);
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-14227), 1470998628, (-1761079449));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 19907100, (-2295252), (-48512377));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-4665), (-9999), (-184225));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-959232), 13730410);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13170648645120L) + "'", long2 == (-13170648645120L));
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-300969892), (-169096781), 3598);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -300969892 for hi! must be in the range [-169096781,3598]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(6289801L, (long) (-204298726));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1284998331093526");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(8941480, 185867227);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 8941480 * 185867227");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-249426407), 8372910);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2088424857434370L) + "'", long2 == (-2088424857434370L));
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1144627648L), (long) (-97960));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 112127724398080L + "'", long2 == 112127724398080L);
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-89177173), 949417406);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-84666360264073238L) + "'", long2 == (-84666360264073238L));
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 19324562385800L, (java.lang.Object) 168459464876L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-186412), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-312315), (-1761078660), 2150267);
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-297481271), 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(33108325);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-33108325) + "'", int1 == (-33108325));
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(616792578L, (long) 3499569);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2158508185398882L + "'", long2 == 2158508185398882L);
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 108109069, (-911), (-107726616));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 101, (-110929580820L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -11203887662820");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-301848066), (-100460641), (-163115), (-146793024));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1737870), (-954811), 0, (-631518));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(5148, 4043031);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 5148 * 4043031");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(132777161762499000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 132777161762499000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 586810735, 0, 1989700);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 374064183);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 374064183 + "'", int1 == 374064183);
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-372966671566984L), (-950048943));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -372966671566984 * -950048943");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1737870, (-1784800), (-82215000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1737870 for hi! must be in the range [-1784800,-82215000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(17663697000000L, (-7384372665600L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 17663697000000 * -7384372665600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-21104292), (-281698083), 32482052);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21104292) + "'", int3 == (-21104292));
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1712604379, (-1989687));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1712604379 * -1989687");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 202685432, (long) 3499569);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 709311654578808L + "'", long2 == 709311654578808L);
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-709901));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-709901) + "'", int1 == (-709901));
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1470988428), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 655, (java.lang.Object) (-333499135200L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 824160884L, (java.lang.Object) 709901);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10398, 1000, (-1989700), 420358630);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11398 + "'", int4 == 11398);
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-4485377), (long) 188112985);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -843757656320345");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1982629346096L, 936406880L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1982629346096 * 936406880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3611760, 958464);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3611760 * 958464");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1734643853289776L), (long) 56611);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1734643853346387L) + "'", long2 == (-1734643853346387L));
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 324823060, (java.lang.Object) 63864);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-35), (-92377190146701L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3233201655134535");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 94401367, 1925133904);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 181735272195646768L + "'", long2 == 181735272195646768L);
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1711, (-601292683), 2658977);
    }

    @Test
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-970000), 1482832281, (-1989687));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 874263);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1001404800L), 948554270L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -949886799038496000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 27, (-99), 3181);
    }

    @Test
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32) + "'", int1 == (-32));
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1715696724), 0, 2065033);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-89178884));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 89178884 + "'", int1 == 89178884);
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-43296), 583633684, (-163115));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(342580000L, 97770180L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 244809820L + "'", long2 == 244809820L);
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 299315787, 106462890, (-89178884));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 22759878, 258759, (-184225));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22759878 for hi! must be in the range [258759,-184225]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(600832203, (-1989687), 1492005, (-1761078660));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(976536, 152257);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 976536 * 152257");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-709901), 80635680, 374245);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 304461111, 609053028, (-222718530));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(184, 8209);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8393 + "'", int2 == 8393);
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-17864), (java.lang.Object) 351375808265460L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 2111643072);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2111643072 + "'", int1 == 2111643072);
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 86130, (long) (-600842000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600928130L + "'", long2 == 600928130L);
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-7962730000L), (-318634906091210112L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-318634914053940112L) + "'", long2 == (-318634914053940112L));
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(89178884, (-708129348));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-618950464) + "'", int2 == (-618950464));
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 19, (-62000), (-167335));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-9286460), 350035111L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-359321571L) + "'", long2 == (-359321571L));
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(549);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-549) + "'", int1 == (-549));
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-27898616L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-27898616) + "'", int1 == (-27898616));
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(8270L, 493779);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4083552330L + "'", long2 == 4083552330L);
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-99990000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-99990000) + "'", int1 == (-99990000));
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-950048943), 198112800, 843887);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-11), 149158, (-101));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -11 for  must be in the range [149158,-101]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 8700, 351665413, 861836);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8700 for  must be in the range [351665413,861836]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1174461), (long) 1139);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1175600L) + "'", long2 == (-1175600L));
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-302176508), (-479099582), (-350035111));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1889971160295L), (-6307349000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1896278509295L) + "'", long2 == (-1896278509295L));
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 15359825779209L, (java.lang.Object) (-286652166039938160L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 161986, (-9788880));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1585661515680L) + "'", long2 == (-1585661515680L));
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 173543841, (long) 1766929518);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 306639735329998638");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1715159045), 952907498, (-1989686));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) ' ', (-1766929518), (-168572690));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1990710L, (-1696938508761228203L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1990710 * -1696938508761228203");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1713170126), (-2235464), (-112110));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1745996) + "'", int3 == (-1745996));
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1370574, (-9778), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1370574 for  must be in the range [-9778,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1685966899832L, (java.lang.Object) 524160);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9797, 105975170, (-299785985));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-122484040), 9778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -122484040 * 9778");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-15952400), (-317147951), 1712604379);
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(669);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-669) + "'", int1 == (-669));
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1174462), 140869042, (-100460641));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 300969900, 85342);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 25685373205800L + "'", long2 == 25685373205800L);
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-635218511), (-16990520), 100964278, (-49522428));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-600842000), (java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(4000008832L, (-1989648L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7958609572571136L) + "'", long2 == (-7958609572571136L));
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 217526, 1990388);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 432961140088L + "'", long2 == 432961140088L);
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1810285123L), (long) (-6564960));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11884449421090080L + "'", long2 == 11884449421090080L);
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 7735307, (-951493178), (-677162));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7735307 for  must be in the range [-951493178,-677162]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 870, (-27), (-10221043));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(4476722, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-15328905L), (-2975155102540750L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -15328905 * -2975155102540750");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-38868600), (long) (-184));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-38868784L) + "'", long2 == (-38868784L));
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 46920, (long) 140869042);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6609575450640");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(5148, (-874263));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-869115) + "'", int2 == (-869115));
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-601292683), 98L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -58926682934");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-113827897), 3005390, 17981);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-17802), (-61117), (-53553755));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6717378342455L), (java.lang.Object) 479553L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-210559234));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-210559234) + "'", int1 == (-210559234));
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-100189684), 1762676017);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1662486333 + "'", int2 == 1662486333);
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1450732L, (-167743998851204100L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 167743998852654832L + "'", long2 == 167743998852654832L);
    }

    @Test
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-349956067), (java.lang.Object) (-65066));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 100962303, (-299315787), 13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100962303 for  must be in the range [-299315787,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-869115), (long) 498646);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-370469L) + "'", long2 == (-370469L));
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-107726616), 1662486333);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -107726616 * 1662486333");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-32091971), (-54920), 8467, (-27826));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3396800), (-65066));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3461866) + "'", int2 == (-3461866));
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(63848486L, (long) (-100459953));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36611467L) + "'", long2 == (-36611467L));
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1278262), (-490002), 608209176);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(45091, (-89), 1234120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45091 + "'", int3 == 45091);
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(13, 695393, 296192052, 3337664);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-7550420), (-312315));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7862735) + "'", int2 == (-7862735));
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-157922), 1142);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-180346924) + "'", int2 == (-180346924));
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2065028, 168472090, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-952557498), 350035111, (-204298726), 5758);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-193913417) + "'", int4 == (-193913417));
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(17329373, (-2582129));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14747244 + "'", int2 == 14747244);
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(350034159, (-153066));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 350034159 * -153066");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 100978790, 1889050220, (-40322560));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100978790 for  must be in the range [1889050220,-40322560]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-587951));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(874089, 106462890, 0, 296189014);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 107336979 + "'", int4 == 107336979);
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(168459464876L, (-8332947));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1403763792460069572L) + "'", long2 == (-1403763792460069572L));
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(954811);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-954811) + "'", int1 == (-954811));
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-2936908487381L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2936908487381");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(66124332L, (-303085597500000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 66124332 * -303085597500000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(19, (-10689680));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10689661) + "'", int2 == (-10689661));
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-6564960));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6564960) + "'", int1 == (-6564960));
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-827878));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 827878 + "'", int1 == 827878);
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-129148057), (-498646), 85229052);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 42307341 + "'", int3 == 42307341);
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 47966522284345140L, (java.lang.Object) (-235614207921390144L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-99375055L), (java.lang.Object) (-16919594));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-580601));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 580601 + "'", int1 == 580601);
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-300969892), 585912, 2005430);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 199359, (long) (-4485377));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-894200273343L) + "'", long2 == (-894200273343L));
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(14623213L, (long) (-1712671034));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1698047821L) + "'", long2 == (-1698047821L));
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1715160045));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1715160045 + "'", int1 == 1715160045);
    }

    @Test
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-27898616L), (long) 629990222);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 602091606L + "'", long2 == 602091606L);
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-27898616), (-100), (-1745996));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 48321945, 30906162, 583633684);
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3499650, 688309020);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3499650 * 688309020");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1470998628, (-1989524L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1469009104L + "'", long2 == 1469009104L);
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(201372638, (-580601), (-3480386));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-958364L), 266405443700400000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-266405443701358364L) + "'", long2 == (-266405443701358364L));
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 442560, (-187954262), 944118497);
    }

    @Test
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-129279438), 97960, 954811);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -129279438 for  must be in the range [97960,954811]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(21204074340L, (long) (-1713254));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21205787594L + "'", long2 == 21205787594L);
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(21963942, 1111, (-8536194));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(61577039813520000L, (long) (-8990));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61577039813511010L + "'", long2 == 61577039813511010L);
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-47585), (-9999), 9778, 2005733);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1938372 + "'", int4 == 1938372);
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3034108), (-148474462));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3034108 * -148474462");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1481377506, 151654554644L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-150173177138L) + "'", long2 == (-150173177138L));
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1925478829728L), 54920);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105747297328661760L) + "'", long2 == (-105747297328661760L));
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1370574);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1370574) + "'", int1 == (-1370574));
    }

    @Test
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-15952400), 399618, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3337664, 843852, (-9989));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-537164914), (-420368508), (-301848066));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -537164914 for hi! must be in the range [-420368508,-301848066]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-208569710), (-100189684));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-308759394) + "'", int2 == (-308759394));
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(498646, (-853932), (-163115));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-192172) + "'", int3 == (-192172));
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-105975170), (-106575000), 100449343);
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(39350610, (-9537), 4710915, 100962303);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39341073 + "'", int4 == 39341073);
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 374245, (-61117), (-939637516));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 374245 for  must be in the range [-61117,-939637516]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(100090844L, (long) (-1953880));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102044724L + "'", long2 == 102044724L);
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-394648137), (long) (-1119));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 441611265303");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-6129), 8393, (-521191424));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(108559700254053086L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 108559700254053086");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1278262), 46851);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1278262 * 46851");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-106462890), (-54920), (-399618), 232883752);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 126765561 + "'", int4 == 126765561);
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 126482100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 126482100L + "'", long2 == 126482100L);
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(339160985, (-53318417));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 285842568 + "'", int2 == 285842568);
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-512632L), (java.lang.Object) 3224396375770L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 868, (-14227));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1715160045);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1715160045) + "'", int1 == (-1715160045));
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-8002163269163466L), 655446220539L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8002818715384005L) + "'", long2 == (-8002818715384005L));
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2112178L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2112178) + "'", int1 == (-2112178));
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-96), (long) 15);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1440L) + "'", long2 == (-1440L));
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-49522428), 1454523, (-114080));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

