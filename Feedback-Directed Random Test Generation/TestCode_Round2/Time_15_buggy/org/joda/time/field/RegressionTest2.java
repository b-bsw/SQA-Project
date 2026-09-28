package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3461473L, (java.lang.Object) (-1989648L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-100), 34386408, 634, 600842000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34386308 + "'", int4 == 34386308);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(168544800L, 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16348845600L + "'", long2 == 16348845600L);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1000) + "'", int1 == (-1000));
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-878700L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(197L, (long) (-9778));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1926266L) + "'", long2 == (-1926266L));
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3909, (-87), (-1784800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 947642470, 9778, (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 789, (-61414968000000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61414968000789L + "'", long2 == 61414968000789L);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 100459953, (int) (short) 0, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3509649, (-1007695204639L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3536656467266061711L) + "'", long2 == (-3536656467266061711L));
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1763460000), 9778, (-86));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-47524559), (-1653L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 78558096027L + "'", long2 == 78558096027L);
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-87), 3469518);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-301848066L) + "'", long2 == (-301848066L));
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-873), (-97), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-89) + "'", int3 == (-89));
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1010, 62, (-184));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1010 for hi! must be in the range [62,-184]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1990710, (-9691), 949427270, (-1010899));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-17935455200L), (long) 880);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17935456080L) + "'", long2 == (-17935456080L));
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(10048L, (long) (-210));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2110080L) + "'", long2 == (-2110080L));
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-372966672750000L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372966672750000L) + "'", long2 == (-372966672750000L));
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-963979), 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-963979) + "'", int2 == (-963979));
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(709901, (-171469054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 709901 * -171469054");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 34386408);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34386408 + "'", int1 == 34386408);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-9), (java.lang.Object) 8990L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 35000, (java.lang.Object) 27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1), (-576));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 576 + "'", int2 == 576);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1763469777), 1990710);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1761479067) + "'", int2 == (-1761479067));
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(880, (-10049));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9169) + "'", int2 == (-9169));
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-489602L), (-5434716000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2660847823032000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1454523), 19, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(97770171L, (long) (-9));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97770180L + "'", long2 == 97770180L);
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1943780);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1943780 + "'", int1 == 1943780);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 3509768L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3509768L) + "'", long2 == (-3509768L));
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(351655538, (-158));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 351655538 * -158");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6138000L), (-69484049307216L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -6138000 * -69484049307216");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2110080L), 49L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-103393920L) + "'", long2 == (-103393920L));
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-576));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-576) + "'", int1 == (-576));
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9700, (-9797), (-9797));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-503932), (java.lang.Object) 1000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 106575000, (-1763469777), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 63702820L, (java.lang.Object) (-188114696));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2219795222L), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-221979522200L) + "'", long2 == (-221979522200L));
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(600842000, (-9797), 34386390, 947642470);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 600832203 + "'", int4 == 600832203);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 32896872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32896872L + "'", long2 == 32896872L);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(2L, 17319361684L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 34638723368");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1221, (-3480386), (-100490000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1221 for  must be in the range [-3480386,-100490000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3499650, 9788);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34254574200L + "'", long2 == 34254574200L);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-10049), (-843852));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-853901) + "'", int2 == (-853901));
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-111), 709908, 592);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1802640000), (-372966672750049L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372968475390049L) + "'", long2 == (-372968475390049L));
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-17935456080L), 61414968000789L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-61432903456869L) + "'", long2 == (-61432903456869L));
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-273471229715886774L), (-131986800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-273471229583899974L) + "'", long2 == (-273471229583899974L));
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3053498160L, 22199491L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3075697651L + "'", long2 == 3075697651L);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(688, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-688) + "'", int2 == (-688));
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2110080L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2110080) + "'", int1 == (-2110080));
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-276464450L), (-87500552100L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-87777016550L) + "'", long2 == (-87777016550L));
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-576), (-1000), 1664);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-576) + "'", int3 == (-576));
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1450548), 51, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1450548 for  must be in the range [51,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3075697651L, (long) 35032);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 107747840109832L + "'", long2 == 107747840109832L);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1716406381L), 184);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-315818774104L) + "'", long2 == (-315818774104L));
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-112700L), (long) 46920);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-159620L) + "'", long2 == (-159620L));
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(2986L, (long) 10552);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31508272 + "'", int2 == 31508272);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1990710L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1990710L) + "'", long2 == (-1990710L));
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(600832203, 34386308);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 635218511 + "'", int2 == 635218511);
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 62000, 2284709, (-97970));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-489444L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-489444) + "'", int1 == (-489444));
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 46920, (-9999), (-47525247));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(64244L, (long) 688);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44199872L + "'", long2 == 44199872L);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(10999L, 4000008832L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3999997833L) + "'", long2 == (-3999997833L));
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(841, 1221, 1989700, (-1990710));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-210));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-210) + "'", int2 == (-210));
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(17319362033L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 17319362033");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 34386390);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34386390 + "'", int2 == 34386390);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1119, (-3398104), 1990710);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1119 + "'", int3 == 1119);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) 'a', (-2110080));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-204677760) + "'", int2 == (-204677760));
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(20, 9778, 9, (-9691));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-112700L), (-171469054));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19324562385800L + "'", long2 == 19324562385800L);
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1763460000), (-87500552100L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1763460000 * -87500552100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 870, 132, 10047);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1715696283));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1715696283) + "'", int1 == (-1715696283));
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-61414968000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -61414968000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1763460086), (long) 100459953);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -177157117356935958");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-87), 0, (-97970));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -87 for hi! must be in the range [0,-97970]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 35, 9778, 630000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(47525247, 350035111, 9788, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(132);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-132) + "'", int1 == (-132));
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-47525247), (-8700), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1715697100), (-7633), (-204677760));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-17899), (-300979678), 874263);
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 19, 709960, (-728));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for  must be in the range [709960,-728]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-843852));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 843852 + "'", int1 == 843852);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 100459953);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100459953 + "'", int1 == 100459953);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(8990L, (long) 709908);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6382072920");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3075697651L, (long) 155277600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 477586949572917600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1990613L), 709960);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1413255605480L) + "'", long2 == (-1413255605480L));
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-86), (java.lang.Object) 1722847825104L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(870, 5148, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-5772L), (long) (-254849));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1470988428 + "'", int2 == 1470988428);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(709901, 46831, 600832203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 709901 + "'", int3 == 709901);
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', 47525247, 677162);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 35032, (-47525247), (-51));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35032 for  must be in the range [-47525247,-51]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3398104), 112110, (-10049));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1454523));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1454523) + "'", int1 == (-1454523));
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(58892604944905872L, 30906162L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 58892604944905872 * 30906162");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(789, (-97));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-76533) + "'", int2 == (-76533));
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1999672), (java.lang.Object) (-10));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(10047);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10047) + "'", int1 == (-10047));
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-97), 3481738, 351655538, (-132));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3045000, (-1784800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5434716000000L) + "'", long2 == (-5434716000000L));
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 600842000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 600842000 + "'", int1 == 600842000);
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(33358615189290L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 33358615189290");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-9999));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9999) + "'", int1 == (-9999));
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 620, 576);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 357120L + "'", long2 == 357120L);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(86563075L, (-15514L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1342939545550");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(63702820L, 9989L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 636327468980");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (byte) 10, 111, (-1763460086));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for  must be in the range [111,-1763460086]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(688, (int) (short) 0, (-503932), 3469518);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 688 + "'", int4 == 688);
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(168544800, (-1990710), (-198112800));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3481738, (java.lang.Object) 46930);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-112700L), 2959176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-333499135200L) + "'", long2 == (-333499135200L));
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10.0f, (java.lang.Object) 314968500L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-576), 47525247, 635218511, (-9700));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2234454L, (long) 9700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21674203800L + "'", long2 == 21674203800L);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-188114696), 709960, (-97405));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-336230297424L), (-2219795222L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -336230297424 * -2219795222");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2294400, (-188114696), 46930);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-185867227) + "'", int3 == (-185867227));
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-158), (java.lang.Object) (-6138000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 949427270, 10100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9589215427000L + "'", long2 == 9589215427000L);
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(9589215427000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 9589215427000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 870, 100, 1117972070);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 5, (long) 158);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 163L + "'", long2 == 163L);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-489951));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 489951 + "'", int1 == 489951);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-171469054));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 171469054 + "'", int1 == 171469054);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-576), (-9999), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-576) + "'", int3 == (-576));
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3469518), 3909, 3909, 399618);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 95781 + "'", int4 == 95781);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 970000, (java.lang.Object) (-8700000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(62, (-51), 350035111, (-3499569));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1454523), (int) '4', (-1715696283), (-1990710));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1715160045) + "'", int4 == (-1715160045));
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-100), (-688));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 68800L + "'", long2 == 68800L);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 19, (-97), (-1000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(3509649, 970111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4479760 + "'", int2 == 4479760);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(947642470, 19, (-171478832), 4479760);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-108109069) + "'", int4 == (-108109069));
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10049, (-489444));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4918422756L) + "'", long2 == (-4918422756L));
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-254849), 35814600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36069449L) + "'", long2 == (-36069449L));
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-963979), (java.lang.Object) (-1989648L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(520, 399618, 532426752, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6138000L), (-927286811700000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-927286817838000L) + "'", long2 == (-927286817838000L));
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-99), (-9797), 112110);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (short) 10, (-17935455200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17935455210L + "'", long2 == 17935455210L);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1990710), 1000, 46831);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(22632004046400L, 49);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1108968198273600L + "'", long2 == 1108968198273600L);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 949427270, 132, 10049);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2284622, (-101), 230746822);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-171469054), 9972);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -171469054 * 9972");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(576, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 549 + "'", int2 == 549);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 16524, 1989700, 56611);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-61414968000000L), (-789));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48456409752000000L + "'", long2 == 48456409752000000L);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3499569), (java.lang.Object) 2284709);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 49, 2658977L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 130289873L + "'", long2 == 130289873L);
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(198112800, (-789));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 198112800 * -789");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-451556L), (java.lang.Object) (-15514L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-97970), 10);
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 630000000, (-10047), 2294400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(949427270);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-949427270) + "'", int1 == (-949427270));
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2294400, (int) '4', (-2110080));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2294400 for hi! must be in the range [52,-2110080]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(874263L, 3908L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 878171L + "'", long2 == 878171L);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1802640000), (-5772L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10404838080000L + "'", long2 == 10404838080000L);
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-873), (-204677760), (-3034108));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(51, (-171478832), 949427270);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3480228), (-47524559), 101, (-873));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1784714), 2959176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1174462 + "'", int2 == 1174462);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(592, (-82215000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 592 * -82215000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1000), 4000008832L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4000008832000L) + "'", long2 == (-4000008832000L));
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(61414968000789L, (-9691));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-595172454895646199L) + "'", long2 == (-595172454895646199L));
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(155277600, 132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 155277732 + "'", int2 == 155277732);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(97770180L, (long) (-2065028));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99835208L + "'", long2 == 99835208L);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-108109069), 406062L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -43898984776278");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 635218511, (-300979678), (-7633));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1664, 3045000, 230746822, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-336230297424L), 22246411L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7479917387146545264");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 58892604944905872L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9788, 949427270, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 3469518, 155277732, 9972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3469518 for hi! must be in the range [155277732,9972]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-949427270), (-2065028));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-951492298) + "'", int2 == (-951492298));
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(18, 3499650, (-3045000), (-3469518));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 0, 1470988428, 56611);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-198112800), (-198112800), (-47524559), 9700);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-15951520) + "'", int4 == (-15951520));
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1763460000), 9764L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1763469764L) + "'", long2 == (-1763469764L));
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10100, (-1784800), 9864);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-970111L), (long) 3509649);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3404749101039L) + "'", long2 == (-3404749101039L));
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-87), 920);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 833 + "'", int2 == 833);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-106575000), (-198122588L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21114914816100000L + "'", long2 == 21114914816100000L);
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-19) + "'", int1 == (-19));
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(351, 10047);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10398 + "'", int2 == 10398);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 9778);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9778 + "'", int1 == 9778);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-76533), (-76533));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-153066) + "'", int2 == (-153066));
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2284622, (-18), (-210));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 9788, (-97), 27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9788 for  must be in the range [-97,27]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3034108), 399618, 10001);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 406062L, (java.lang.Object) (-1007698710304L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1712671034));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1712671034 + "'", int1 == 1712671034);
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 46920);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46920 + "'", int1 == 46920);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-843852), 35000, 1943780);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -843852 for  must be in the range [35000,1943780]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1999672, (-47525247), 87);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1999672 for hi! must be in the range [-47525247,87]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-27), 2959176);
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-503932), 99440784, (-47525247));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 947642470, 10001, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3499553L, (-3328133821432L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3328130321879L) + "'", long2 == (-3328130321879L));
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 100, 99440784, 3499650);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-10047), 315648592L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 315638545L + "'", long2 == 315638545L);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(51, 3909);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 199359 + "'", int2 == 199359);
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(872L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 872 + "'", int1 == 872);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1763460086));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1763460086 + "'", int1 == 1763460086);
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-688), (long) 62000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-42656000L) + "'", long2 == (-42656000L));
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-221979522200L), 19907100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4418968546387620000L) + "'", long2 == (-4418968546387620000L));
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-171478832), (-18000), 520);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-18), (-843852), (int) (short) 10);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-155757153L), (java.lang.Object) 1106892L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) -1, 99440784, 62, 970000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 507005 + "'", int4 == 507005);
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1943780, 949427270, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1943780 for  must be in the range [949427270,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(62000L, (-273471229583899974L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 62000 * -273471229583899974");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2284709, (-1715697100), 155277600);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 351, (java.lang.Object) (-873));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-322L), (-147147648405810000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -322 * -147147648405810000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1174462, 46831);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1174462 * 46831");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1716406381L), (-2161648995684L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1716406381 * -2161648995684");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-132), 132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17424) + "'", int2 == (-17424));
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(5148, 1117972070, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(489951, (-82215000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-81725049) + "'", int2 == (-81725049));
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-52), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-52L) + "'", long2 == (-52L));
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4418968546387620000L), (-3398104));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4418968546387620000 * -3398104");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(169792L, (-7962730000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1352007852160000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 46920, 3469518, (-9169));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46920 for hi! must be in the range [3469518,-9169]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 700L, (java.lang.Object) 357120L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1119, (-949427270));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1119 * -949427270");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-153066), (-62000), (-158));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1454523), 630000000, (-81725049));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1454523 for hi! must be in the range [630000000,-81725049]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 10552);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10552 + "'", int1 == 10552);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3053498160L, 99881989L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 304989469628640240L + "'", long2 == 304989469628640240L);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(2234454L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-3398104), (-184), 4479760);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3398104 for  must be in the range [-184,4479760]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1620, 872, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1620 for hi! must be in the range [872,32]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(314968500L, (-4000008832000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 314968500 * -4000008832000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 1117972070, 9778);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [1117972070,9778]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(709901, 1119, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1106892L, 7098300099L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7097193207L) + "'", long2 == (-7097193207L));
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-47524559), (-489951));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48014510) + "'", int2 == (-48014510));
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 592, 171469054, 56611);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) ' ', (-153066), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1716406381L), 32896872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-56464401015740232L) + "'", long2 == (-56464401015740232L));
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-9700), (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9719) + "'", int2 == (-9719));
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3499543L, 872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3500415L + "'", long2 == 3500415L);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(63702620L, (long) 18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63702638L + "'", long2 == 63702638L);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(315648592L, (-7920L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 315640672L + "'", long2 == 315640672L);
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9972, 970111, (-97970));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3398104), (-9), 53248);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-210), 520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 310 + "'", int2 == 310);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2219795222L), (-300979678));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 668113251143498516L + "'", long2 == 668113251143498516L);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3034108), (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 157773616 + "'", int2 == 157773616);
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(10398, 3909);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14307 + "'", int2 == 14307);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(60336L, 16524);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 996992064L + "'", long2 == 996992064L);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(155277732, 46831, (-3480228), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1285742) + "'", int4 == (-1285742));
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1784714), (-873), (-3469518), (-1285742));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1785587) + "'", int4 == (-1785587));
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(97770171L, (-3996518737L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -390740320321194027");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-153066), (long) 100459953);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -15377003165898");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-47525247), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -47525247 * 100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1763460000), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-7900L), 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-790000L) + "'", long2 == (-790000L));
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(3499650, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3499650 + "'", int2 == 3499650);
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(350, (-1943780));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1943430) + "'", int2 == (-1943430));
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1664, 155277600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 155279264 + "'", int2 == 155279264);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(339160985L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 339160985 + "'", int1 == 339160985);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-7633));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3499650L, (-169871L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -594489045150");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1763460000), (-1990710L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3510537456600000L + "'", long2 == 3510537456600000L);
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-853901));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-853901) + "'", int1 == (-853901));
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-5802204811239936L), 3244801L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5802204807995135L) + "'", long2 == (-5802204807995135L));
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(709908, (-9719));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 709908 * -9719");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 351655538, (-949427270), 1119);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-184), 168544800, 9972, (-873));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(10100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10100) + "'", int1 == (-10100));
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-5802204811239936L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5802204811239936");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9778), 630000000, (-188790000), 1470988428);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 629990222 + "'", int4 == 629990222);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) (-9797));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-9719), (-9999));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97180281L + "'", long2 == 97180281L);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-9169));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9169 + "'", int1 == 9169);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1L, (java.lang.Object) 5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) 'a', 874263, 635218511);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 634344346 + "'", int3 == 634344346);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(349956900);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-349956900) + "'", int1 == (-349956900));
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 970000, 1943780);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 973781 + "'", int3 == 973781);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1712671034, 1999672, (-155277600));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1712671034 for  must be in the range [1999672,-155277600]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-5802204811239936L), (-489602L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -5802204811239936 * -489602");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9788, 0, (-204677760));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-171478832), (-84385200));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [-171478832,-84385200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 0, 0, (-2065028));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-47525247), (java.lang.Object) 406062L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9169, (-1761479067), 0, (-17899));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1000), (java.lang.Object) (-582302736L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-155277600), 230746822, 3509649, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1174462);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1174462) + "'", int1 == (-1174462));
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(27L, (long) (-27));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-729L) + "'", long2 == (-729L));
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-8700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 709960, (-489444), (-1715697100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(592);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-592) + "'", int1 == (-592));
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 87, (-82215000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7152705000L) + "'", long2 == (-7152705000L));
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9169, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-7098290050L), (java.lang.Object) 342580000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(10047, 10049);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100962303 + "'", int2 == 100962303);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-79), 0, 1470988428);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -79 for hi! must be in the range [0,1470988428]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(709908, (-3045000), (-688), (-1000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-87777016550L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -87777016550");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1763450397), 35032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1763450397 * 35032");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-789), (-79));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-868) + "'", int2 == (-868));
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9719), 1943780);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -9719 * 1943780");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(100962303, 1142);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100963445 + "'", int2 == 100963445);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 34386308, 3469518, 10047);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34386308 for  must be in the range [3469518,10047]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 46920, 629990222, (-1454874));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1890034360661700L, (java.lang.Object) 9764L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-9778), (int) (byte) 10, (-204677760));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9778 for hi! must be in the range [10,-204677760]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9778, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9875 + "'", int2 == 9875);
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-254849), 10047);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-244802) + "'", int2 == (-244802));
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-99L), (long) 870);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-86130) + "'", int2 == (-86130));
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(315640672L, (-273471229715886774L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 315640672 * -273471229715886774");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 833, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(10049);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10049) + "'", int1 == (-10049));
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1221, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1221L + "'", long2 == 1221L);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(97770171L, (-1943780));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-190043702986380L) + "'", long2 == (-190043702986380L));
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-592));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 592 + "'", int1 == 592);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-372968475390049L), (long) (-97));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372968475389952L) + "'", long2 == (-372968475389952L));
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1999672, 3509649);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7018146835128L + "'", long2 == 7018146835128L);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 99440784, 63702720L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 163143504L + "'", long2 == 163143504L);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 100962303);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(880);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-880) + "'", int1 == (-880));
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 46831, (-8700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38131L + "'", long2 == 38131L);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(112110, 5148);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 577142280 + "'", int2 == 577142280);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 520, 48456409752000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48456409752000520L + "'", long2 == 48456409752000520L);
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-489444));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 489444 + "'", int1 == 489444);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 132, 872L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 115104 + "'", int2 == 115104);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-688), (-300979678), (-15951520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-7633), 111, 634);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 339160985, (-1784800), 351);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 489444, (-244802), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10100, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(841, 10100, 10001, (-244802));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(169792L, 3996509289L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3996339497L) + "'", long2 == (-3996339497L));
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(507005, 9169, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(14307);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14307) + "'", int1 == (-14307));
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 171478832, (java.lang.Object) 357120L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 18000, (-127769401782L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127769419782L + "'", long2 == 127769419782L);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-82215000L), (java.lang.Object) 86563075L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(841, (-300969900));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 841 * -300969900");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1010, (long) 254849);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 257397490L + "'", long2 == 257397490L);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 920, (-1), 16524);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(3499650, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3499650 + "'", int2 == 3499650);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(157773616, (-17899), (-789));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6915) + "'", int3 == (-6915));
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-51), 2986L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-152286) + "'", int2 == (-152286));
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3398104), (-8209), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-36069449L), (long) (-17424));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 628474079376");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(127769419782L, 63702593L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127833122375L + "'", long2 == 127833122375L);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3909, (-1784800), 46930);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-8209), 9169, 349956900);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-153066), (-132), (-81725049));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(17319361684L, 532426752);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9221291488125370368L + "'", long2 == 9221291488125370368L);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2110080), 0, (-349956900));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2112178L), 9076L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2103102L) + "'", long2 == (-2103102L));
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-10047), (-27), (-1450548));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-61432903456869L), (long) 592);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-61432903456277L) + "'", long2 == (-61432903456277L));
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', (-80), (-52), (-86130));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1285742), (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24429098 + "'", int2 == 24429098);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 709960, (java.lang.Object) (-873));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(489951, 9788, (-87), (-254849));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-76533), 350034159L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -26789164290747");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 87, 350035111);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 30453054657L + "'", long2 == 30453054657L);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-185867227));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 185867227 + "'", int1 == 185867227);
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-204677760));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-204677760) + "'", int2 == (-204677760));
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(115104, 503932);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 115104 * 503932");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-3398104));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3398104) + "'", int2 == (-3398104));
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3996339497L), (java.lang.Object) (-3328130321879L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10049, (java.lang.Object) 3499569L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10100, (-1785587), (-84385200));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 9691);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(3499553L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3499553 + "'", int1 == 3499553);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 103464400L, (java.lang.Object) (-86));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-301848066L), (long) (-86130));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-301934196L) + "'", long2 == (-301934196L));
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-951492298), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-951492297) + "'", int2 == (-951492297));
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(6069060510816L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6069060510816");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (short) 0, 920, 3509649);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [920,3509649]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (byte) 0, (long) (-198112800));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9719), (-853901), (-3499569), (-10));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-863620) + "'", int4 == (-863620));
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1712671034), (long) 874263);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1497324916197942");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 9700, 9778, 3499650);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9700 for hi! must be in the range [9778,3499650]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 100, (-2065028));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-206502800L) + "'", long2 == (-206502800L));
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(106575000, 19907100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126482100 + "'", int2 == 126482100);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(151654554644L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 151654554644");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-863620), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 349956900, (-14307));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-8700L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8700) + "'", int1 == (-8700));
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 789);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 789 + "'", int1 == 789);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-789), 1000, (-1715160045));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(973781, 0, 34386308);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 973781 + "'", int3 == 973781);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1L), 3038L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3038) + "'", int2 == (-3038));
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-17424), 0, 19907100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-8700L), 115104);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1001404800L) + "'", long2 == (-1001404800L));
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 18000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18000 + "'", int1 == 18000);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-152286));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-152286) + "'", int1 == (-152286));
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(532426752, 874263);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 533301015 + "'", int2 == 533301015);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(634344346, (-951492297));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-317147951) + "'", int2 == (-317147951));
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 157773616, 8209L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1295163613744L + "'", long2 == 1295163613744L);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10398, (-185867227), (int) (byte) 1, 62);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13 + "'", int4 == 13);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1763460000), (-300968758L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1462491242L) + "'", long2 == (-1462491242L));
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 171478832, (long) 3045000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 168433832L + "'", long2 == 168433832L);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(197L, (long) 2284709);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2284512L) + "'", long2 == (-2284512L));
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(973781, 31508272);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32482053 + "'", int2 == 32482053);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1712671034, (int) (byte) 0, (-1174462), (-9778));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-580601) + "'", int4 == (-580601));
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-951492297), (java.lang.Object) (-147147648405810000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-18), 10001, 18, (-868));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3536656467266061711L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3536656467266061711");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 600832203, 1620, (-8700000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 600832203 for hi! must be in the range [1620,-8700000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 184, (-1763469777), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-349956900), 10049);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-349946851) + "'", int2 == (-349946851));
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(315648592L, (-617272946947079546L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-617272946631430954L) + "'", long2 == (-617272946631430954L));
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 9700);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9700 + "'", int1 == 9700);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1), 10398);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10398) + "'", int2 == (-10398));
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(184, 2284709);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 420386456 + "'", int2 == 420386456);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1989700, 9477L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1980223L + "'", long2 == 1980223L);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1454523), (int) (short) 0, (-185867227));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 4479760, (-97970), 620);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 600832203, 3481738);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 158, (-1763469777), (-9700));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 709960);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 709960 + "'", int1 == 709960);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-882000L), 1722847825104L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1519551781741728000L) + "'", long2 == (-1519551781741728000L));
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(504032L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 504032 + "'", int1 == 504032);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(35032, 168544800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 168579832 + "'", int2 == 168579832);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 14307, 34386308, 112110);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 9, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 97, 126482100, (-106575000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(39380L, (long) 254849);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 10035953620");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1454874), (-79), 634344346);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1454874 for hi! must be in the range [-79,634344346]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 10398);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10398 + "'", int1 == 10398);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(635218511, (-349956900));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 635218511 * -349956900");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1L, 3996509289L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3996509288L) + "'", long2 == (-3996509288L));
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-82211962L), (-3328133821432L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -82211962 * -3328133821432");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 947642470, (-17935456080L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16987813610L) + "'", long2 == (-16987813610L));
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-951492298), (-880));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-951493178) + "'", int2 == (-951493178));
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(168579832, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1517218488 + "'", int2 == 1517218488);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(100963445, 1990710, (-317147951), (-10047));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-214183750) + "'", int4 == (-214183750));
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-503932));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(52, 34386308);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1788088016 + "'", int2 == 1788088016);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1761479067), 155279264, (-1285742), 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-300551) + "'", int4 == (-300551));
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 6963094429000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6963094429000L) + "'", long2 == (-6963094429000L));
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-489951), (long) (-1763450397));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1763940348L) + "'", long2 == (-1763940348L));
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9999, (-76533));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-66534) + "'", int2 == (-66534));
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 115104, 19907100, 1470988428);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 1, (-1462491242L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1462491241L) + "'", long2 == (-1462491241L));
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-489444), 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9788880) + "'", int2 == (-9788880));
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(41511168L, (-3328130321879L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3328171833047L + "'", long2 == 3328171833047L);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-198112800), (-503932), 630000000, (-62000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1802640000), 10552, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 99440784);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99440784 + "'", int2 == 99440784);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3035028), (-3469518), 2294400, (-10398));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1517218488, (int) (short) 100, 157773616);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3499544L, 103464400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99964856L) + "'", long2 == (-99964856L));
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-66534), 99440784);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -66534 * 99440784");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3244801L, (long) 789);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3244012L + "'", long2 == 3244012L);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1788088016);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1788088016) + "'", int1 == (-1788088016));
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-36069449L), (long) 10000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36079449L) + "'", long2 == (-36079449L));
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3038), 4479760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4476722 + "'", int2 == 4476722);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 532426752, 155277600, (-7633));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 532426752 for hi! must be in the range [155277600,-7633]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 9864, (long) 168544800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1662525907200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(100962303, 9169, 1763460086, 31508272);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(257397490L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 257397490 + "'", int1 == 257397490);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(949427270, (-1450548));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 949427270 * -1450548");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 169792L, (java.lang.Object) (-1763940348L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 20, (java.lang.Object) (-1785587));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-789), (int) (byte) 10, (-214183750));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-617272946947079546L), (java.lang.Object) 3075697651L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(16524, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16524 + "'", int2 == 16524);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-108109069), (-171478832), (-47524559), (-300979678));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 100963445, (long) 833);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100964278L + "'", long2 == 100964278L);
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-878700L), 4000008832L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3514807760678400L) + "'", long2 == (-3514807760678400L));
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6138000L), 949427270);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5827584583260000L) + "'", long2 == (-5827584583260000L));
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(230746822, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 230746822 * 35");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(49L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10, 1517218488);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15172184880L + "'", long2 == 15172184880L);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1454523), (-1174462), (-185867227));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-47525247), (-9), 184, (-3038));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 576, (java.lang.Object) 48456409752000520L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-80), 324783680L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 324783600L + "'", long2 == 324783600L);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1000, 14307);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14307000L + "'", long2 == 14307000L);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) 100, 1990710);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1990810 + "'", int2 == 1990810);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1802640000), (-66534), (-9788880));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(63702593L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63702693L + "'", long2 == 63702693L);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-87777016550L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3909, 87, 106575000);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }
}

