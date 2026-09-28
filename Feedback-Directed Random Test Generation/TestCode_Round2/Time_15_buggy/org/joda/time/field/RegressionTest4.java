package org.joda.time.field;

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
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1126887300L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1126887300 + "'", int1 == 1126887300);
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-184), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18400) + "'", int2 == (-18400));
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(99440784, 351, (-1715159045));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1943780));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1943780) + "'", int1 == (-1943780));
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-7152705000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7152705000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) -1, (int) (short) 1, (-221718630));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 634344346, (-1277533), 1712671034);
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 350034159L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-350034159L) + "'", long2 == (-350034159L));
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-15952400), 10999L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15963399L) + "'", long2 == (-15963399L));
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-10398));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10398 + "'", int1 == 10398);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-152286));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 152286 + "'", int1 == 152286);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 949427270, 34875834, (-15951520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1999672));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1999672) + "'", int1 == (-1999672));
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-99), (-158), (-789), (-52));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-257) + "'", int4 == (-257));
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(61090L, (long) 155279264);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 9486010237760");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(46935164704L, 2936930686872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2889995522168L) + "'", long2 == (-2889995522168L));
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-159620L), (-878700L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 140258094000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1010, 52, (-158));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1763425054), (-1277533));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2252833699511782L + "'", long2 == 2252833699511782L);
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeAdd((-1712671034), (-1763460086));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -1712671034 + -1763460086");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-210), 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-210L) + "'", long2 == (-210L));
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(63702693L, (long) (-9864));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63692829L + "'", long2 == 63692829L);
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1277533), (-153066), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(30906162L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30906162 + "'", int1 == 30906162);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9691, (java.lang.Object) (-1990388));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(257397490);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-257397490) + "'", int1 == (-257397490));
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2959176, (-1763469777), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1760510603) + "'", int3 == (-1760510603));
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 450, 100963445, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(450);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-450) + "'", int1 == (-450));
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-87), 20, 655);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -87 for hi! must be in the range [20,655]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2005430);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2005430) + "'", int1 == (-2005430));
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-8700L), (java.lang.Object) (-15952400));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3996818940L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3996818972L + "'", long2 == 3996818972L);
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-8700L), (long) 503932);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-512632L) + "'", long2 == (-512632L));
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3038, (int) ' ', 46851, (-153251));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3398104), 872, 46831);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 789, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-35), 3499544L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-122484040) + "'", int2 == (-122484040));
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(35, (-1717685969), 5148);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 126482100, 106584691L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13481055545531100L + "'", long2 == 13481055545531100L);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 87, 304461111, (-592));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-171478832), (-100459953), (-868));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-300979678), (-1717685969), 4479760, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(9788, 31508272);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 9788 * 31508272");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3045000, (java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1582215500L), (long) 168544800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -266674195004400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 600832203, (java.lang.Object) (-8209));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-100490000), 155277732);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -100490000 * 155277732");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2966L), (-7633));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22639478L + "'", long2 == 22639478L);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 34875834, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-951491721L), (java.lang.Object) (-595172454895646199L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1763460086), (-97405), (int) (byte) 1, 592);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 445 + "'", int4 == 445);
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-9700), (-97405), (-86130));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 789, 171469054);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 135289083606L + "'", long2 == 135289083606L);
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) 0, 3499650, 21064);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [3499650,21064]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, (int) (short) 10, (-76533), 176411200);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-880), 24429098, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 155279264, 0, 254849);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 155279264 for  must be in the range [0,254849]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-450), (-315818774104L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 142118448346800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(503932, (-62000), 3469518);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 503932 + "'", int3 == 503932);
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 655);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-96), 30453054657L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2923493247072L) + "'", long2 == (-2923493247072L));
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 100962303, 1111, (-257));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1999671), 1620, 4479760, (-185867227));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(789, 46831);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47620 + "'", int2 == 47620);
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-17899), 1126887300, (-106575000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-204677760), 18000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3684199680000L) + "'", long2 == (-3684199680000L));
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 503932, (long) (-153251));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-77228082932L) + "'", long2 == (-77228082932L));
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-9719), 198114912L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1925478829728L) + "'", long2 == (-1925478829728L));
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2235464), (-833426L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1402038L) + "'", long2 == (-1402038L));
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 3469518, (-102842949149280L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102842952618798L + "'", long2 == 102842952618798L);
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(153251);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-153251) + "'", int1 == (-153251));
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 62, (long) (-868));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53816) + "'", int2 == (-53816));
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 47620, 3996509289L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3996461669L) + "'", long2 == (-3996461669L));
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(100962303, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 908660727 + "'", int2 == 908660727);
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(34386390, 3561650);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37948040 + "'", int2 == 37948040);
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3045000), 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39585000) + "'", int2 == (-39585000));
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-122484040), 176411200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -122484040 * 176411200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-80), (-1470988428), (-700));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9415359753861600L, (java.lang.Object) (-350034159L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-2219795222L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2219795222L) + "'", long2 == (-2219795222L));
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(776875860L, 948554270L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1725430130L + "'", long2 == 1725430130L);
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 16524, (-3684199680000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -60877715512320000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-153268L), (long) 115104);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-38164L) + "'", long2 == (-38164L));
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-147147648405810000L), 3244801L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -147147648405810000 * 3244801");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3045000), 9778, 1221);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 20, (long) (-1277533));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1277553L + "'", long2 == 1277553L);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(17887930641L, 189935540116053039L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 17887930641 * 189935540116053039");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(479643L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 479643 + "'", int1 == 479643);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1786407669), 1126887300, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 677162, 973781, (-47525247));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(592, 947642470, 46851, (-99440784));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9719), 0, 1989861, (-350035111));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(35, 843852);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 843887 + "'", int2 == 843887);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 349956900, 102842952618798L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102843302575698L + "'", long2 == 102843302575698L);
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1221L, (-2005430));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2448630030L) + "'", long2 == (-2448630030L));
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 5, (-1174462), (-62000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1999671), 304461111, 1989700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(33358615189290L, 47620);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1588537255313989800L + "'", long2 == 1588537255313989800L);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-300968758L), 351665413);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105840302582167054L) + "'", long2 == (-105840302582167054L));
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(35000, (-257), 2284622);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35000 + "'", int3 == 35000);
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(833, (-1738657), 0, 3499553);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1761730 + "'", int4 == 1761730);
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2336523L), 9764L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -22813810572");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-8252422149000L), (-1713170345));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -8252422149000 * -1713170345");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 8, (-1470988428));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11767907424L) + "'", long2 == (-11767907424L));
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(789, 688, (-153066));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3461411L, 218684298L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 756956234624478L + "'", long2 == 756956234624478L);
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-880), (int) (short) 1, (-15951520), (-300551));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-15651849) + "'", int4 == (-15651849));
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-951502398));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 951502398 + "'", int1 == 951502398);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-576), (-1990388), 14227);
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-688), (-100459953));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100460641) + "'", int2 == (-100460641));
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9875, 10049, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3481738, (-315076220588480L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3481738 * -315076220588480");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(31508272, (-8209), 32482053);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31508272 + "'", int3 == 31508272);
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 153251, (-35), (-1784714));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 153251 for  must be in the range [-35,-1784714]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 9999, 47525247);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-61414968000000L), (long) 1763460086);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -61414968000000 * 1763460086");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-312), (long) 1119);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1431L) + "'", long2 == (-1431L));
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-843852), 504032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -843852 * 504032");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9999), (-1717685969), (-880));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9999) + "'", int3 == (-9999));
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(10200L, (-38164L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-389272800L) + "'", long2 == (-389272800L));
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-82211962L), (-29017039163616L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29017121375578L) + "'", long2 == (-29017121375578L));
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9), (-47524559), 577, 168579832);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 121054688 + "'", int4 == 121054688);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(158, (-10001), (-8209), 10100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8467 + "'", int4 == 8467);
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-155277600), 1989700, (-101), 152286);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14428 + "'", int4 == 14428);
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-789), 9999);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7889211) + "'", int2 == (-7889211));
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-108109069), 32482053, (-204677760));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -108109069 for  must be in the range [32482053,-204677760]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(132, (int) 'a', 0, (-48014510));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-7889211), 46920, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1712671034), (-3469518));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1712671034 * -3469518");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-6959097919711L), (long) 1221);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -8497058559967131");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-122484040), (-2005430));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -122484040 * -2005430");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1762759876L), (-5802204811239936L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5802206573999812L) + "'", long2 == (-5802206573999812L));
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-349946851));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-349946851) + "'", int1 == (-349946851));
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (short) 1, (long) (-97));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 98L + "'", long2 == 98L);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1117972070);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1117972070 + "'", int1 == 1117972070);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(115104, (-843852), 34386308);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115104 + "'", int3 == 115104);
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 121054688, (-39585000), 10552);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 121054688 for  must be in the range [-39585000,10552]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1763460086, 126482100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1763460086 * 126482100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(56611, (-18400), (-951493178));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1784800, 801902322, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2110080, 872, 1664);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(197L, (-6138729L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1209329613L) + "'", long2 == (-1209329613L));
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1717685969), (-185867227), (-300551));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-833426L), (java.lang.Object) 315640672L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3053498160L, (long) 634344346);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1936969293317403360");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-539633));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 539633 + "'", int1 == 539633);
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-336230297424L), (java.lang.Object) (-99));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 171469054, (long) (-9700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 171459354L + "'", long2 == 171459354L);
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1209329613L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 3499650);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3499650 + "'", int2 == 3499650);
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 479643, 549, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 880, (long) (-188790000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -166135200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-97));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-412), 34386390);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -412 * 34386390");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(630000000, (-1943430));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 628056570 + "'", int2 == 628056570);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-9), 210);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201 + "'", int2 == 201);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(3469518, (-35032), (-146793024));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1495740L, (long) (-101));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-151069740) + "'", int2 == (-151069740));
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-3509649));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3509649 + "'", int1 == 3509649);
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1786407669), (java.lang.Object) (-2235464));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-9));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1989700), (-853901));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1989700 * -853901");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-18000), (-1788088016));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -18000 * -1788088016");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-10001), 406062L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4061026062L) + "'", long2 == (-4061026062L));
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(709960);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-709960) + "'", int1 == (-709960));
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3499483L), (java.lang.Object) 210);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-312), (-350035111), 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-312) + "'", int3 == (-312));
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 870, (-86), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 870 for  must be in the range [-86,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9700), 171469054, (-863620));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-151069740), (-153251), 635218511);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -151069740 for hi! must be in the range [-153251,635218511]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-100), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(168472090L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 168472090 + "'", int1 == 168472090);
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-2103102), (-580601), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2103102 for  must be in the range [-580601,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 949427270, 10001, (-171469054));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-33916098500L), (java.lang.Object) 582328281600L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3509768L, (long) (-1715159045));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1718668813L + "'", long2 == 1718668813L);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-10047), (java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1990710L), (long) (-82215000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-84205710L) + "'", long2 == (-84205710L));
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(6022437L, (long) (-3035028));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2987409L + "'", long2 == 2987409L);
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 157773616, 789, (-1763450397));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1517218488, (-34386408));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1482832080 + "'", int2 == 1482832080);
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-315818774104L), (-57069L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-315818831173L) + "'", long2 == (-315818831173L));
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) 100, (-111));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-9691), (-9788880));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [-9691,-9788880]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(52, (-100490000), 0, 132);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1763460000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1763460000 + "'", int1 == 1763460000);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2005430, 349956900, (-1010899));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-100), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(351655538, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1785587), 230746822, (-1785587));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10552, 949427270);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10018356553040L + "'", long2 == 10018356553040L);
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-69931974934731104L), (long) (-580601));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69931974934150503L) + "'", long2 == (-69931974934150503L));
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 111, (-210), (-312315));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 111 for hi! must be in the range [-210,-312315]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1716406381L), (-99));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 169924231719L + "'", long2 == 169924231719L);
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(32496992L, (-169871L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32666863L + "'", long2 == 32666863L);
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-34386390), (java.lang.Object) (-8700));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-146793024));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-146793024) + "'", int1 == (-146793024));
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1989861), 9169, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-100490000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100490000 + "'", int1 == 100490000);
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-17899), (long) (-3509649));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3491750L + "'", long2 == 3491750L);
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-97), (long) 101);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-198L) + "'", long2 == (-198L));
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-48014510), (-188114696));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-236129206) + "'", int2 == (-236129206));
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-9), (-80), 533301015);
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-8700), 9076L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 376L + "'", long2 == 376L);
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (-1990710L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1990710L + "'", long2 == 1990710L);
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(152286);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-152286) + "'", int1 == (-152286));
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 158, (-151069740));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23869018920L) + "'", long2 == (-23869018920L));
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(709960, (-330040725));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 709960 * -330040725");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(9972, (-10047));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100188684) + "'", int2 == (-100188684));
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1715697100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1715697100 + "'", int1 == 1715697100);
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(351, 210);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 73710 + "'", int2 == 73710);
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-204677760), (-15651849), 520);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1196950) + "'", int3 == (-1196950));
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3499570L, (-2110080));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7384372665600L) + "'", long2 == (-7384372665600L));
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-729L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-729) + "'", int1 == (-729));
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-595172454895646199L), (long) 14307);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-595172454895660506L) + "'", long2 == (-595172454895660506L));
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-9999), (long) 1482832080);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -14826837967920");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(151654554644L, (long) 1142);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 173189501403448L + "'", long2 == 173189501403448L);
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 100, 108109069, (-1712671034));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1023872308448164L, (long) 489951);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023872308938115L + "'", long2 == 1023872308938115L);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-9719), (long) 600832203);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5839488180957");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9477L, (java.lang.Object) 98L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9999), 1990810, (-951493178), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-949512368) + "'", int4 == (-949512368));
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(168433832L, (long) 1221);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 168432611L + "'", long2 == 168432611L);
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-301848066L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-301848066) + "'", int1 == (-301848066));
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 592);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 592 + "'", int1 == 592);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-537804800), 351, (-14307), (-47524559));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1763425054), (-489444));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 863097812129976L + "'", long2 == 863097812129976L);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 152286, 9);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1370574L + "'", long2 == 1370574L);
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(949427360L, 30453054657L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29503627297L) + "'", long2 == (-29503627297L));
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(97180281L, 1221L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97179060L + "'", long2 == 97179060L);
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9169, 1763460000, 10001);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(34386408, 1712671034, (-6915), 24429098);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12100448 + "'", int4 == 12100448);
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 188152939, (-65066), 30906162);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3509649, (-1285742), (-1470988428));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1765497216L, (long) (-880));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1765498096L + "'", long2 == 1765498096L);
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-185867227), (-18400), (-86130));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -185867227 for  must be in the range [-18400,-86130]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 2959176, (-372966672750000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372966669790824L) + "'", long2 == (-372966669790824L));
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(21064, (-10049));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-211672136) + "'", int2 == (-211672136));
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(2658977L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2658977 + "'", int1 == 2658977);
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(48456409752000000L, (long) (-1999671));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48456409753999671L + "'", long2 == 48456409753999671L);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-254849), 970000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -254849 * 970000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(106394130L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-106394130) + "'", int2 == (-106394130));
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-300969900), 1765498096L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1464528196L + "'", long2 == 1464528196L);
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 970111, 9999, (-100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 970111 for  must be in the range [9999,-100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-153268L), (-168491100L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-168644368L) + "'", long2 == (-168644368L));
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2304264), 34875834, 47525247);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1943430), 184);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-357591120) + "'", int2 == (-357591120));
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(8, (-300969900));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-300969892) + "'", int2 == (-300969892));
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-8700000), (long) (-1712671034));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 14900237995800000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(539633, (-1715696283));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1715156650) + "'", int2 == (-1715156650));
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-62086), (-35032), (-1990388));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-5827584583260000L), (long) 349956900);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5827584933216900L) + "'", long2 == (-5827584933216900L));
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 655);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 655 + "'", int1 == 655);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1462491241L), (-1582215500L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3044706741L) + "'", long2 == (-3044706741L));
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-151069740), (-97405), (-3398104));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1023872308448164L, (-3398104));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1023872308448164 * -3398104");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-47524559), (-2304264), (-35032), (-2304264));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(64);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-64) + "'", int1 == (-64));
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-19L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-190043702986380L), (long) (-254849));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-190043702731531L) + "'", long2 == (-190043702731531L));
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 171478832, 756956234624478L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-756956063145646L) + "'", long2 == (-756956063145646L));
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(112110, 3499650);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3611760 + "'", int2 == 3611760);
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-15951520), (long) 19907100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3955580L + "'", long2 == 3955580L);
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(304461111, 35, (-1090328), 3045000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2582129 + "'", int4 == 2582129);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9719), 2110080, (int) '4', (-18000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-843852), (java.lang.Object) (-7920L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-728), (-51));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37128L + "'", long2 == 37128L);
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3499570L, (java.lang.Object) (-1682020L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-15952400), 1999672, 53248);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-944118497), (long) 1221);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-944117276L) + "'", long2 == (-944117276L));
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', (int) (byte) 10, (-1713170345), (-158));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1713170126) + "'", int4 == (-1713170126));
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-959409L), 7739630L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8699039L) + "'", long2 == (-8699039L));
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(3996508940L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3996508940");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9764L, (-315076220588480L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3076404217825918720L) + "'", long2 == (-3076404217825918720L));
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-9700), (-152286));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-161986) + "'", int2 == (-161986));
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(97179060L, 1023872308938115L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023872406117175L + "'", long2 == 1023872406117175L);
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3909, (java.lang.Object) 1989700);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(350034159L, (-1990661L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-696799348989099L) + "'", long2 == (-696799348989099L));
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(620, (-184));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-114080) + "'", int2 == (-114080));
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3561650, 176411200, 112110);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 111, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [111,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-82215000), (long) (-48014510));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34200490L) + "'", long2 == (-34200490L));
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(35000, 4476722);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 35000 * 4476722");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3480228, 100963445);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 351375808265460L + "'", long2 == 351375808265460L);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 100962303, (long) (-66534));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6717425867802L) + "'", long2 == (-6717425867802L));
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 101, 13);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1313L + "'", long2 == 1313L);
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(349956900, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-204677760), (-3045000), 635218511, 576);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-6915), 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-442560) + "'", int2 == (-442560));
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1763425054), 19324562385800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19322798960746L + "'", long2 == 19322798960746L);
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-64), 115104, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1010899), (long) (-17802));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17996023998L + "'", long2 == 17996023998L);
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 532281952, 230746822);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 122822368831956544L + "'", long2 == 122822368831956544L);
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2110080);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2110080) + "'", int1 == (-2110080));
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-82215000L), (java.lang.Object) 157062400L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 184, 0, 152286);
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(98640, (-132));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13020480) + "'", int2 == (-13020480));
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-15952400), (-64), (-1763425054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -15952400 for  must be in the range [-64,-1763425054]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-62086), (-1715159045));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -62086 * -1715159045");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 176411200, (java.lang.Object) (-15127560000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-211672136), 532426752, 399618);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 789, 349956900);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 276115994100L + "'", long2 == 276115994100L);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-3035028), 49, (-843852));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3035028 for hi! must be in the range [49,-843852]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1715696283), 872);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1715696283 * 872");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 310, 0, (-6915));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1763940348L), (-273471229583899974L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1763940348 * -273471229583899974");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1765498096L, 35517209338L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33751711242L) + "'", long2 == (-33751711242L));
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(620, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 619 + "'", int2 == 619);
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1470988428), (-1943430), 3909);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 47525247, (java.lang.Object) (-1926266L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 98640, 52, (-211672136));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 98640 for hi! must be in the range [52,-211672136]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3611760, (-153066));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3611760 * -153066");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-163115), (-6959097913696L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1135133256192523040");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-173543841), 592);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-102737953872L) + "'", long2 == (-102737953872L));
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 73477967816424400L, (java.lang.Object) 2248540);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1119, (-188790000), 86130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1119 + "'", int3 == 1119);
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(299824116L, 38131L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 299785985L + "'", long2 == 299785985L);
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(970000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-970000) + "'", int1 == (-970000));
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1802640000), (-122484040));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1925124040) + "'", int2 == (-1925124040));
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 46831, 335272134);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [46831,335272134]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(34386390, 12100448, 872);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-14308), (-970000), (-106575000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -14308 for hi! must be in the range [-970000,-106575000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2005430), (-412));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 826237160L + "'", long2 == 826237160L);
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-868), (long) (-9169));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10037L) + "'", long2 == (-10037L));
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-71477721000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -71477721000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-51), (-1147540070), (-949427270));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1618160290106L), 99L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-160197868720494L) + "'", long2 == (-160197868720494L));
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 783775357050000L, (java.lang.Object) 52L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1763450397), (-188790000), (-257397490));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-949427270), (-3480228));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-952907498) + "'", int2 == (-952907498));
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 19, 1470988428, (-580601));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 10001);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10001 + "'", int1 == 10001);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-32320L), (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1131200L) + "'", long2 == (-1131200L));
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1715159045), 3480228);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1711678817) + "'", int2 == (-1711678817));
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-951493178), (long) 64);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-951493242L) + "'", long2 == (-951493242L));
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(10404838080000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 10404838080000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-18048123007200L), 1664);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30032076683980800L) + "'", long2 == (-30032076683980800L));
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 600842000, (java.lang.Object) (-2219795222L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-450));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 450 + "'", int1 == 450);
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-39585000), (-1450548), 4231920, (-728));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-873), (-132));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 115236L + "'", long2 == 115236L);
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1989700));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1989700) + "'", int1 == (-1989700));
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-86), (long) 9778);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9692L + "'", long2 == 9692L);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-101), (-489444), 709908, 199359);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 709901L, (java.lang.Object) 310);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1090328), 872, 155277600, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1763425054), 1470988428, (-163115));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1763425054 for  must be in the range [1470988428,-163115]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-489444), (java.lang.Object) 9798L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) -1, (int) '4', 1763460000, (-2110080));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-450684L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-450684) + "'", int1 == (-450684));
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-442560), (-2065028));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [-442560,-2065028]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-100188684), 700, 1784800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1505073 + "'", int3 == 1505073);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1761079449), 789);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1761078660) + "'", int2 == (-1761078660));
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(479643, (-152286), 350035111, (-1712671034));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-108109069), (-100460641));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-208569710) + "'", int2 == (-208569710));
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-273456367L), 1990710);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-544372324350570L) + "'", long2 == (-544372324350570L));
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1090328), (-82215000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1090328 * -82215000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-99), 10100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-999900) + "'", int2 == (-999900));
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 970111, (-15651849), 115104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-8700), 100459953, (-15651849), 1664);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-9123345) + "'", int4 == (-9123345));
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-952907498));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 952907498 + "'", int1 == 952907498);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-8751067110L), (java.lang.Object) 9798L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 504032, (long) (-1285742));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1789774L + "'", long2 == 1789774L);
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 634, (-1761479067), (-9999));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 51, (-1760510603), (-10));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 51 for  must be in the range [-1760510603,-10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-97405), 7739630, (-1000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-15651849), (-951492298), 577142280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-15651849) + "'", int3 == (-15651849));
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-349946851), (-8700), 335272154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1784800, (long) (-89));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-158847200L) + "'", long2 == (-158847200L));
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 83022336L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1761078660), 2110080, 2284709);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 970111);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 970111 + "'", int1 == 970111);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1482832080, 201);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1482832281 + "'", int2 == 1482832281);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(324783600L, (long) (-300979678));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-97753263347680800L) + "'", long2 == (-97753263347680800L));
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1023872308448164L, (long) 53248);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023872308394916L + "'", long2 == 1023872308394916L);
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(315638545L, (long) (-14307));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 315624238L + "'", long2 == 315624238L);
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(769351440L, 19907100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15315556051224000L + "'", long2 == 15315556051224000L);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1713170126), 21064);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1713149062) + "'", int2 == (-1713149062));
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(6505352945L, (long) (-357591120));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2326256445597848400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(532426752, 1119);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 532427871 + "'", int2 == 532427871);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1712671034), 335272154, (-204677760));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-366104800L), (-3996509288L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4362614088L) + "'", long2 == (-4362614088L));
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-53816), 157773616, 14307);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3996508940L, (java.lang.Object) (-1943780));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 210, 176421201, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(947642470, 908660727);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 947642470 * 908660727");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-132), (-372966669790824L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 372966669790692L + "'", long2 == 372966669790692L);
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(158, 533301015);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 158 * 533301015");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-101), (long) 34386390);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3473025390");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-18400), (-106394130));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-106412530) + "'", int2 == (-106412530));
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 0, 9169, (-963979), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-954811) + "'", int4 == (-954811));
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-4418968546387620000L), 1277553L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4418968546386342447L) + "'", long2 == (-4418968546386342447L));
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(38131L, 756956234624478L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-756956234586347L) + "'", long2 == (-756956234586347L));
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3328133821432L), (long) 86130);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-286652166039938160L) + "'", long2 == (-286652166039938160L));
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1999672), 0, (-254849));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1), (-3038), 479643, (-700));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-873000L), (long) (-146793024));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-147666024L) + "'", long2 == (-147666024L));
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-5827584583260000L), (java.lang.Object) (-5802204811239936L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1131200L), 9691);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10962459200L) + "'", long2 == (-10962459200L));
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 18, 10000, 520);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 99440784, (long) 351665413);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34969884374403792L + "'", long2 == 34969884374403792L);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-868), 2582129, 1990710);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1618160290106L), (long) (-8700));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 14077994523922200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 3038L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-52), 0, (-2110080));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 102780L, (java.lang.Object) (-3394243441710L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 254849, (-1802640000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-99), 168544800, 1111);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -99 for  must be in the range [168544800,1111]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-100490000), (long) 2284622);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-98205378L) + "'", long2 == (-98205378L));
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-959409L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(19, 655, 709960, (-3045000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-47524559), (int) (byte) -1, 9972, 634344346);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 586809815 + "'", int4 == 586809815);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 171469054);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 171469054 + "'", int1 == 171469054);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1653L), (-1990710L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1989057L + "'", long2 == 1989057L);
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-843852), (-61432903466918L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -843852 * -61432903466918");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(47525247, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47525347 + "'", int2 == 47525347);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 100, 3955580L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 395558000L + "'", long2 == 395558000L);
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(350000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-350000) + "'", int1 == (-350000));
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(9989L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9989 + "'", int1 == 9989);
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(27273296640L, (long) 507005);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 13827697762963200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1763450397), 10001, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-6370170546L), (-13068L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6370157478L) + "'", long2 == (-6370157478L));
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(14227);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14227) + "'", int1 == (-14227));
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-951492297), 100963445, (-949427270));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -951492297 for  must be in the range [100963445,-949427270]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10552, 952907498, 2284709);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-56464401015740232L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-108109069), 2294419, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(48456409752000520L, 948554270L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48456408803446250L + "'", long2 == 48456408803446250L);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(230746822, (-1711678817));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 230746822 * -1711678817");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1142);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1142) + "'", int1 == (-1142));
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 880, 299824116L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-299823236L) + "'", long2 == (-299823236L));
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-273471229583899974L), (-2716524810L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -273471229583899974 * -2716524810");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 3499650, 30906162, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3499650 for  must be in the range [30906162,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-315818831173L), (long) (-221718630));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-316040549803L) + "'", long2 == (-316040549803L));
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(257397490, 351655538);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 609053028 + "'", int2 == 609053028);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-35032), (long) 1763460086);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -61777533732752");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1023872406117175L, 168544800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023872574661975L + "'", long2 == 1023872574661975L);
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-52), 9L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-468) + "'", int2 == (-468));
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9778), 833, 100459953);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100449343 + "'", int3 == 100449343);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-3996518737L), (long) 30906162);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4027424899L) + "'", long2 == (-4027424899L));
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2065028), (-1761078660), 97);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1802640000), 9415359753861600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1802640000 * 9415359753861600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2110080, 629990222, 634);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (short) 100, (-1058238078051775698L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 100 * -1058238078051775698");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(100490000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100490000) + "'", int1 == (-100490000));
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(127833123245L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 127833123245");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(126482100, 1517218488);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 126482100 * 1517218488");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-161986), (-1712671034), (-2304264));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1710528757) + "'", int3 == (-1710528757));
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(47620);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47620) + "'", int1 == (-47620));
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-8699039L), 63702693L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-554152210812027L) + "'", long2 == (-554152210812027L));
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (byte) 10, (java.lang.Object) (-1738657));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2005430), 9875);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1995555) + "'", int2 == (-1995555));
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(61090L, (long) (-3469518));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-211952854620L) + "'", long2 == (-211952854620L));
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(600842000, 168579832);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 600842000 * 168579832");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-450684), (-184), 629990222, 12100448);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-188790000), (-39585000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -188790000 * -39585000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(173189501403448L, (-3480228));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 173189501403448 * -3480228");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(97, 35032);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3398104 + "'", int2 == 3398104);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-257397490), 66124332L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-323521822L) + "'", long2 == (-323521822L));
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-688), (long) 121054688);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 121054000L + "'", long2 == 121054000L);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-163115), (-349956900), 0);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2284709, (-1784714), (-700));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1761079449), 114L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -200763057186");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-503932), (-97405));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-601337) + "'", int2 == (-601337));
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 13, (long) (-317147951));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4122923363L) + "'", long2 == (-4122923363L));
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-18048123007200L), (long) 479643);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18048122527557L) + "'", long2 == (-18048122527557L));
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 586809815, (-100459953), (-954811));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10221043) + "'", int4 == (-10221043));
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(4231920, 1763460000, 47525247, (-9169));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-198112800), (int) (byte) -1, (-1710528757));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -198112800 for hi! must be in the range [-1,-1710528757]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1761730, (-357591120), (-35032));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1761730 for hi! must be in the range [-357591120,-35032]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 198112800, 1990710, (-257397490));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 198112800 for  must be in the range [1990710,-257397490]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 2959176, 908660727, 24429098);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2959176 for  must be in the range [908660727,24429098]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 46920, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46920L + "'", long2 == 46920L);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 199359, 100490000, (-863620));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 199359 for hi! must be in the range [100490000,-863620]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-954811));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 954811 + "'", int1 == 954811);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(86130, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 86130 + "'", int2 == 86130);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1715160045), 1482832080, (-100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1715160045 for  must be in the range [1482832080,-100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-99964856L), (-147147648405810000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -99964856 * -147147648405810000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 100, (-99440784), 49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1713170345), (-1712671034), (-173543860));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-949427270), 406062L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-949021208L) + "'", long2 == (-949021208L));
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2065028), 532281952);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 530216924 + "'", int2 == 530216924);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5434715999167L), (-27826));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 151226407392820942L + "'", long2 == 151226407392820942L);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-18000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18000 + "'", int1 == 18000);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-10100), (-1943780));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1953880) + "'", int2 == (-1953880));
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(949427360L, (long) (-62086));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -58946147072960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-9691), 1470998628L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1470988937L + "'", long2 == 1470988937L);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 351665413, (long) 1990810);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 700099020854530L + "'", long2 == 700099020854530L);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-244802), (-728));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 178215856L + "'", long2 == 178215856L);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 350000, 257397490, (-952907498));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-3398104), (-99440784));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-84385200), (java.lang.Object) 168472090L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-106394130), (-9719));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-106403849) + "'", int2 == (-106403849));
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1L), (-149158L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149158 + "'", int2 == 149158);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 350, 52, (-47525247));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(100459953, 973781, 37948040);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26511433 + "'", int3 == 26511433);
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1784800, 2248540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4033340 + "'", int2 == 4033340);
    }
}

