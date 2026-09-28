package org.joda.time.field;

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
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) '#', (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for  must be in the range [100,32]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 100, (java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 0, (-1), 0);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) '#', (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for  must be in the range [97,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) -1, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (short) 1, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 100, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(101L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10100L + "'", long2 == 10100L);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(100, (int) '#', 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 10, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (byte) 1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-97) + "'", int1 == (-97));
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (byte) 1, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10000 + "'", int2 == 10000);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) '#', (long) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 350 + "'", int2 == 350);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 0, 49, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 10000, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 100, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 100, 49, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-97), (int) (short) -1, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1, (int) ' ', (int) '#', 10000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9999 + "'", int4 == 9999);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 1, (java.lang.Object) (-99L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 350);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 350 + "'", int1 == 350);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 10, (java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1), 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for  must be in the range [1,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(10L, 101L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 111L + "'", long2 == 111L);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 100, 49, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-97), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1L, (long) 350);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-349L) + "'", long2 == (-349L));
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1L), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 0, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) '4', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', 350, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, 49, (-97), (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-80) + "'", int4 == (-80));
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (int) '4', 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 1, (int) (short) -1, 10000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 62, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 620L + "'", long2 == 620L);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 49, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for hi! must be in the range [100,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-97), 101L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9797) + "'", int2 == (-9797));
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 350, 9999);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3499650L + "'", long2 == 3499650L);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(10000, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10049 + "'", int2 == 10049);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-80), 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', 9999, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) 100, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) 'a', (-10), 1, 10000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 87 + "'", int4 == 87);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9797), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-97970) + "'", int2 == (-97970));
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(101L, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1010L + "'", long2 == 1010L);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 10, (int) (short) 10, (-9797), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-9778) + "'", int4 == (-9778));
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) -1, 10000, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 0, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 100, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-100L) + "'", long2 == (-100L));
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1), (-9778));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9778 + "'", int2 == 9778);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-9797), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) ' ', (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1010L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1010 + "'", int1 == 1010);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) -1, 10049, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 100, (-97970), 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 100, 10049, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-97), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-87) + "'", int2 == (-87));
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(87, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 87, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 870 + "'", int2 == 870);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 100, (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (int) (byte) 10, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9778, (int) (byte) 10, 870, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 18, (long) 10049);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 180882L + "'", long2 == 180882L);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10.0f, (java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-87), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8700L) + "'", long2 == (-8700L));
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 18, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(350, 10049, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9797), (int) 'a', (-97970), (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-9700) + "'", int4 == (-9700));
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1010, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1010L) + "'", long2 == (-1010L));
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 9778, 18, (-97970));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9778 for hi! must be in the range [18,-97970]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 100, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3499650L, (long) (-80));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3499570L + "'", long2 == 3499570L);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 180882L, (java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-100L), 3499650L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3499550L + "'", long2 == 3499550L);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(10000, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10001 + "'", int2 == 10001);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 'a', (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 197L + "'", long2 == 197L);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) '#', (int) (short) 10, (int) 'a');
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1), 9778);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9778) + "'", int2 == (-9778));
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 350, (-8700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3045000L) + "'", long2 == (-3045000L));
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (byte) 10, (int) ' ', 10001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for  must be in the range [32,10001]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-97), 10001, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(18, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3499550L, (-1010L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3534545500");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10049, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(620L, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62000L + "'", long2 == 62000L);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3499570L, 3499650L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 12247270150500");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (byte) 100, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, 10001, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) '#', (java.lang.Object) (-80));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) '#', (-3045000L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-106575000) + "'", int2 == (-106575000));
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 49, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) -1, (-9778));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9778 + "'", int2 == 9778);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-9700), (java.lang.Object) 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9797), (int) (short) 1, 10001);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-10), (-100L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1000 + "'", int2 == 1000);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 100, (int) (byte) 10, 18, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27 + "'", int4 == 27);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) 1, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 100, 10100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10200L + "'", long2 == 10200L);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1, 10049, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, 1000, (-9700), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8700) + "'", int4 == (-8700));
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9, 49, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) 'a', (int) (short) 10, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 9999);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) ' ', (long) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1664 + "'", int2 == 1664);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1010, (int) '4', (-9700));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-8700), (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1), (long) 9778);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9778) + "'", int2 == (-9778));
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(197L, 10100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1989700 + "'", int2 == 1989700);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 132 + "'", int2 == 132);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 18, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(62000L, (long) (-9700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 71700L + "'", long2 == 71700L);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (byte) 10, (long) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 520 + "'", int2 == 520);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 0, 197L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-197L) + "'", long2 == (-197L));
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 18, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', 1, 9999);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9778), 1664, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(27, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1010L), (long) 1989700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1990710L) + "'", long2 == (-1990710L));
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9797), (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3499570L, 1989700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6963094429000L + "'", long2 == 6963094429000L);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) -1, 10001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10000 + "'", int2 == 10000);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1989700, (long) 18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35814600L + "'", long2 == 35814600L);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 132, 1010L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1142L + "'", long2 == 1142L);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) 'a', 10001, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-100L), (-100L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 62, (java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-9778), 9999);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-97770222L) + "'", long2 == (-97770222L));
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(10100L, 111L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9989L + "'", long2 == 9989L);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(111L, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) '4', 132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 184 + "'", int2 == 184);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-80));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-80) + "'", int1 == (-80));
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1142L, 3499570L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3996508940L + "'", long2 == 3996508940L);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-80), (java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) -1, 9999);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9999) + "'", int2 == (-9999));
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(18, 1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18000 + "'", int2 == 18000);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(10200L, (long) 1989700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20294940000L + "'", long2 == 20294940000L);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3499570L, (java.lang.Object) 1989700);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10, (-97970), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(10200L, (long) 1989700);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 20294940000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1.0d), (java.lang.Object) 1010L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1990710L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1990710) + "'", int1 == (-1990710));
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 132, (-99L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13068L) + "'", long2 == (-13068L));
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9, 0, (-9700), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-9691) + "'", int4 == (-9691));
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(180882L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) '#', (long) 1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35000 + "'", int2 == 35000);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(180882L, 99L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 180981L + "'", long2 == 180981L);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-97770222L), (long) 62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6061753764");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 184, 132, 350);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1, (long) (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1990710), (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(90L, (-9700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-873000L) + "'", long2 == (-873000L));
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-87), (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 62, (java.lang.Object) 62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(3499650L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3499650 + "'", int1 == 3499650);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(49, (-9778), 870);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) 'a', (-87), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for  must be in the range [-87,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-97), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-80), 1664, 184, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 1, (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-86) + "'", int2 == (-86));
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(10, 9778);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9788 + "'", int2 == 9788);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9778, (java.lang.Object) (-9700));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1.0f), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-8700), (int) (byte) 1, (-8700));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -8700 for  must be in the range [1,-8700]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(49L, 62);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3038L + "'", long2 == 3038L);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1), 3499570L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3499569L + "'", long2 == 3499569L);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 520, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-97), (int) '4');
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1664, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53248 + "'", int2 == 53248);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9999), (int) (short) 1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 35000, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [35000,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3499650, 10000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34996500000L + "'", long2 == 34996500000L);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(52, (-9691));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-503932) + "'", int2 == (-503932));
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3499570L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 35000, (long) 10001);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 350035000L + "'", long2 == 350035000L);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 27);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27L + "'", long2 == 27L);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-349L), (long) (-97970));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97621L + "'", long2 == 97621L);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-52) + "'", int2 == (-52));
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10, (-10), 49);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-10), (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) -1, 0, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-9700), (-87));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [-9700,-87]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 132, 10000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(27);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-27) + "'", int1 == (-27));
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(19, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9700), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1L), 3499569L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3499568L + "'", long2 == 3499568L);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1010, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1990710));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1990710 + "'", int1 == 1990710);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3038L, (long) 870);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3908L + "'", long2 == 3908L);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100) + "'", int1 == (-100));
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) '4', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 350, (-87), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) -1, (long) 10049);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10048L + "'", long2 == 10048L);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 10, (java.lang.Object) 1010L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(132, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 132 + "'", int2 == 132);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1990710));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1990710) + "'", int1 == (-1990710));
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-106575000), 27, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-9999), 49L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-489951) + "'", int2 == (-489951));
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 51, (int) '#', (-97970));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(20, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-27), 1990710, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 35000, 53248, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3499568L, 49L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 171478832 + "'", int2 == 171478832);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9788, 184);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9972 + "'", int2 == 9972);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-106575000), 87, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3499570L, 27L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3499543L + "'", long2 == 3499543L);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) 'a', (int) (short) 0, 9972);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3499543L, 3038L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3496505L + "'", long2 == 3496505L);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(97, 0, (-9691), (-9778));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 0, (-3045000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 184, (long) (-9700));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1784800) + "'", int2 == (-1784800));
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3038L, (long) (-52));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2986L + "'", long2 == 2986L);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 350, 520, 1010);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 350 for  must be in the range [520,1010]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(101L, 171478832);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17319362032L + "'", long2 == 17319362032L);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 20, (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 0.0d, (java.lang.Object) (-13068L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 100, 20, (-503932));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 171478832, (-10), 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 171478832 for  must be in the range [-10,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1010L), (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32320L) + "'", long2 == (-32320L));
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 100, (int) (byte) 1, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 'a', 3499570L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 339458290L + "'", long2 == 339458290L);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(10048L, 350035000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3517151680000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-503932));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 503932 + "'", int1 == 503932);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1142L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1142 + "'", int1 == 1142);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1989700, (int) (short) 100, 9999);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9700 + "'", int3 == 9700);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(90L, (long) 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1620 + "'", int2 == 1620);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(10100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10100 + "'", int1 == 10100);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1664);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1664 + "'", int1 == 1664);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 35000, (java.lang.Object) 3499569L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9999), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9999) + "'", int2 == (-9999));
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10001, 1, 18, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(350, 1, 87, 1620);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 351 + "'", int4 == 351);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 62, (-80), 18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1), (java.lang.Object) 1620);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9788, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(19, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 20, 3499550L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3499570L + "'", long2 == 3499570L);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(49, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-3045000L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3045000) + "'", int1 == (-3045000));
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) '4', (java.lang.Object) 339458290L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 171478832, (java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 20, 2986L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2966L) + "'", long2 == (-2966L));
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-87), 10100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-878700L) + "'", long2 == (-878700L));
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) 100, 9700, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-9999), (java.lang.Object) (-100));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-503932), (long) 53248);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-450684L) + "'", long2 == (-450684L));
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-106575000), (-503932), 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) 'a', 10000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970000 + "'", int2 == 970000);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 351);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 351 + "'", int1 == 351);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) -1, 10049);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10049) + "'", int2 == (-10049));
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', (-10), (-52), (-106575000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9972, (-8700), (-8700));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(9989L, (long) 1010);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10999L + "'", long2 == 10999L);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-10049), 171478832, (-97970));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1784800), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1989700, 1990710, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 503932, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 504032L + "'", long2 == 504032L);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) false, (java.lang.Object) 87);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 350, 17319362032L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6061776711200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(111L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 111 + "'", int1 == 111);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1990710, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63702720L + "'", long2 == 63702720L);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9972, 1989700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1999672 + "'", int2 == 1999672);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(71700L, (-32320L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39380L + "'", long2 == 39380L);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1989700, 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 103464400L + "'", long2 == 103464400L);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-503932), 52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9797), 1000, (-1990710));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 10, (-97), 9999);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3499543L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3499553L + "'", long2 == 3499553L);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 'a', 62);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6014L + "'", long2 == 6014L);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 970000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 970000 + "'", int1 == 970000);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9, (-1990710), (-1784800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-99L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-99) + "'", int1 == (-99));
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3499570L, (-106575000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372966672750000L) + "'", long2 == (-372966672750000L));
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3045000), 27, 9700);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(62000L, (long) (-99));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6138000L) + "'", long2 == (-6138000L));
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 62, 351, 184);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 62 for  must be in the range [351,184]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) '#', (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 171478832, (long) (-8700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1491865838400L) + "'", long2 == (-1491865838400L));
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-27), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 19, 180981L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3438639L + "'", long2 == 3438639L);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-489951), (long) 9778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4790740878");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 62);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 62 + "'", int1 == 62);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1620, 1000, 51, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 49, (-1990710L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1990661L) + "'", long2 == (-1990661L));
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1999672);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1999672) + "'", int1 == (-1999672));
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9972, (-349L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3480228L) + "'", long2 == (-3480228L));
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 53248, 53248, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3499569L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3499569) + "'", int2 == (-3499569));
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1784800), 111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-198112800) + "'", int2 == (-198112800));
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(32L, 71700L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2294400 + "'", int2 == 2294400);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-106575000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106575000 + "'", int1 == 106575000);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-87));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 87 + "'", int1 == 87);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-80), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-79) + "'", int2 == (-79));
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3499550L, (long) (-79));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-276464450L) + "'", long2 == (-276464450L));
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9788, (long) 35000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 342580000L + "'", long2 == 342580000L);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9999, 3499650);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3509649 + "'", int2 == 3509649);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 97621L, (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(62000L, (long) (-97970));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6074140000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(111L, (long) (-52));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5772L) + "'", long2 == (-5772L));
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 20, (long) (-1784800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1784780L) + "'", long2 == (-1784780L));
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-8700), 1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8700000) + "'", int2 == (-8700000));
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-27));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) ' ', (-9999), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hi! must be in the range [-9999,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (int) (byte) 10, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3045000), 970000, 503932);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 62, (-106575000), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10), (-1990710));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19907100 + "'", int2 == 19907100);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(18, 19, 9788);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9788 + "'", int3 == 9788);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1999672), (-9700), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-99));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-99) + "'", int1 == (-99));
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 87, (-1999672), 53248);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(9700);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9700) + "'", int1 == (-9700));
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-100), (java.lang.Object) 35814600L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 111, 350035000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 350035111L + "'", long2 == 350035111L);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1999672, (long) 503932);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1495740L + "'", long2 == 1495740L);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 197L, (java.lang.Object) 20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) '4', (long) 106575000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5541900000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 351, 27L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9477L + "'", long2 == 9477L);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 19, (long) (-1999672));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-37993768L) + "'", long2 == (-37993768L));
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(970000, 0, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(111L, 180981L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-180870L) + "'", long2 == (-180870L));
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 132, 18000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(87);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-87) + "'", int1 == (-87));
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-3499569), (long) (-86));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3499483L) + "'", long2 == (-3499483L));
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 10, 5, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3499650, 87, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 9, (-99), 1010);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 100, 5, (-3045000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 35000, (int) (byte) 0, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10049), 10000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100490000) + "'", int2 == (-100490000));
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1664, (-198112800), 1990710);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1664 + "'", int3 == 1664);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-10), 1990710, 53248);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10001, 9989L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99899989L + "'", long2 == 99899989L);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 18000, 9700, 184);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-8700), 35000, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -8700 for hi! must be in the range [35000,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(18, 2294400, 51, (-86));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1999672), (int) (short) 0, (-9700));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1999672 for  must be in the range [0,-9700]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-489951), (-1999672), 184);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 53248, 6014L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47234L + "'", long2 == 47234L);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1784800), 10049);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17935455200L) + "'", long2 == (-17935455200L));
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 870, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 872L + "'", long2 == 872L);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9999, 1000, 9778);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9778, 53248, 51, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-97970), 18000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1763460000) + "'", int2 == (-1763460000));
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9999, (-489951), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3045000), 27);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-82215000L) + "'", long2 == (-82215000L));
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 872L, (java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10, (-9691), (-1990710));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10, (-489951), 9788);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1784800), 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-155277600) + "'", int2 == (-155277600));
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(62, (-10049), 503932);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(184, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 920 + "'", int2 == 920);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-198112800), (long) 9788);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-198122588L) + "'", long2 == (-198122588L));
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(111);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-111) + "'", int1 == (-111));
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) '4', (long) 1989700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1989648L) + "'", long2 == (-1989648L));
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(97, (int) (byte) -1, (-1784800));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1.0d, (java.lang.Object) 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-97770222L), (java.lang.Object) (-1763460000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 6963094429000L, (java.lang.Object) 17319362032L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3438639L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34386390 + "'", int2 == 34386390);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-79), 920);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 841 + "'", int2 == 841);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 51, 197L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10047 + "'", int2 == 10047);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(9999, 10047);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100459953 + "'", int2 == 100459953);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1999672), 503932);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1007698710304L) + "'", long2 == (-1007698710304L));
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(339458290L, (long) (-9999));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3394243441710L) + "'", long2 == (-3394243441710L));
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-9691), (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1010, 87, (-3499569));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1010 for  must be in the range [87,-3499569]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-80), 3499650, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-349L), (long) 27);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-322L) + "'", long2 == (-322L));
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-100490000), 9999, 3499650);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 709908 + "'", int3 == 709908);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 'a', (java.lang.Object) 620L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9700, 0, (-10049));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(920, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46920 + "'", int2 == 46920);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-111), (-9700), 10);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(62000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 62000 + "'", int1 == 62000);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-155277600), (-9700), 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-82215000L), 27L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2219805000L) + "'", long2 == (-2219805000L));
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1007698710304L), 97621L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -98372555798586784");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-322L), (long) 350);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-112700L) + "'", long2 == (-112700L));
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-8700), 10049, 9778);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-9691));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9691 + "'", int1 == 9691);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(5, (int) (byte) 10, (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(2L, 3038L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3036L) + "'", long2 == (-3036L));
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 9999, (long) 53248);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 532426752 + "'", int2 == 532426752);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9788, (-489951), 9778);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 106575000, (int) (byte) -1, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 0, 62, 709908);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', (-1784800), (-52));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1784714) + "'", int3 == (-1784714));
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1010, 503932, 18000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9972, (-3045000), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3035028) + "'", int3 == (-3035028));
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2294400, (-9691));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2284709 + "'", int2 == 2284709);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1999672), (-3035028));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6069060510816L + "'", long2 == 6069060510816L);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9691, (-1784714), 1000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 111, 9972);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1106892L + "'", long2 == 1106892L);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(841, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(10999L, (-180870L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-169871L) + "'", long2 == (-169871L));
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1999672, (-100), 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1999672 for  must be in the range [-100,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1990710, 3496505L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6960527468550");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 171478832, 9700, 19907100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-198112800), (-8700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-198121500L) + "'", long2 == (-198121500L));
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1989700);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1989700) + "'", int1 == (-1989700));
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-489951), (java.lang.Object) (-6138000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10047, (-1990710), (-106575000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-198121500L), (java.lang.Object) (-10049));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10100L, (java.lang.Object) (-1990661L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(6014L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6015L + "'", long2 == 6015L);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(111L, (-13068L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1450548) + "'", int2 == (-1450548));
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) '#', 3496505L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 122377675L + "'", long2 == 122377675L);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1763460000), 9700, 0, 870);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 688 + "'", int4 == 688);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(10100L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10100L + "'", long2 == 10100L);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-372966672750000L), (long) 49);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372966672750049L) + "'", long2 == (-372966672750049L));
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 0, (-97770222L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 920, (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 910L + "'", long2 == 910L);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9691, 9778, (-86));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9700, (-52), (-106575000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3499569), 9999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3499569 * 9999");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-112700L), (long) 1989700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2102400L) + "'", long2 == (-2102400L));
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 49, (java.lang.Object) 9691);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-9778), 2294400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2284622 + "'", int2 == 2284622);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 688, 27, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 688 for  must be in the range [27,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 10047, (int) ' ', (-79));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5, 87, 106575000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1989700));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1989700 + "'", int1 == 1989700);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1), 97, 10049);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 970000, (long) (-111));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 970111L + "'", long2 == 970111L);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(184);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-184) + "'", int1 == (-184));
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(52, 9700, (int) (short) 0, (-79));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 19907100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19907100 + "'", int1 == 19907100);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 34996500000L, (java.lang.Object) 35000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9) + "'", int1 == (-9));
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-106575000), (long) 34386390);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3664729514250000L) + "'", long2 == (-3664729514250000L));
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(62000L, (long) 1664);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60336L + "'", long2 == 60336L);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10049), (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 874263 + "'", int2 == 874263);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-3499569), 100459953, 503932);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3499569 for hi! must be in the range [100459953,503932]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-106575000), (long) (-503932));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53706552900000L + "'", long2 == 53706552900000L);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3499568L, (long) (-9691));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -33914313488");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 62000, 910L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61090L + "'", long2 == 61090L);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-13068L), (java.lang.Object) 9477L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 19, 9, (-100490000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(17319362032L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17319362042L + "'", long2 == 17319362042L);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(970000, 27, (-9797), 184);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8209) + "'", int4 == (-8209));
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 18000, (-1989700), (-198112800));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 18000 for  must be in the range [-1989700,-198112800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-82215000L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-82215000) + "'", int1 == (-82215000));
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 46920, (java.lang.Object) 3996508940L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(17319362032L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17319362033L + "'", long2 == 17319362033L);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 100, (-1784800), 1010);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(970000, (-489951), 1989700, (-1763460000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 1620);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(17319362032L, 3996508940L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 17319362032 * 3996508940");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(171478832);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-171478832) + "'", int1 == (-171478832));
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(62000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-62000) + "'", int1 == (-62000));
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 97, (long) 1990710);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1990613L) + "'", long2 == (-1990613L));
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(20, 9788, 10001);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9864 + "'", int3 == 9864);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1999672), 1000, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9700, (-100), (-10049));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 27, (-1784800), (-79));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 27 for  must be in the range [-1784800,-79]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3038L, 3908L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-870L) + "'", long2 == (-870L));
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-450684L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-450683L) + "'", long2 == (-450683L));
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 9778, (long) 34386390);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 336230121420");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(35000, 62000, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 87, 0, (-3035028));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-52), (long) (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5148 + "'", int2 == 5148);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(99L, (-80));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7920L) + "'", long2 == (-7920L));
    }
}

