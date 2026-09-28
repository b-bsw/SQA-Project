package org.joda.time.field;

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
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1989700), (java.lang.Object) 180981L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 46920, (java.lang.Object) 9691);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-52), 3499650, 100459953);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -52 for  must be in the range [3499650,100459953]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 49, (long) 9700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9651L) + "'", long2 == (-9651L));
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1010, (-184), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1763460000), (-86));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1763460086) + "'", int2 == (-1763460086));
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-489951), 27, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(90L, 1142);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102780L + "'", long2 == 102780L);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3996508940L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 9864, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9764L + "'", long2 == 9764L);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 87, (-9691), (-100490000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1450548), (-111), 18000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16524 + "'", int3 == 16524);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) -1, (-1763460086), (-9691));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1763450397) + "'", int3 == (-1763450397));
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 184, (long) (-1450548));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1450732L + "'", long2 == 1450732L);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-3045000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3045000 + "'", int1 == 3045000);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(63702720L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63702820L + "'", long2 == 63702820L);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 874263, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 874263L + "'", long2 == 874263L);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-9797), 3996508940L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3996518737L) + "'", long2 == (-3996518737L));
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-79), (-1763460086), 62, 1990710);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 254849 + "'", int4 == 254849);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2284709, 100459953, (-1763460086));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9700), 10001, (-184));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(18, 34386390);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34386408 + "'", int2 == 34386408);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 503932, (java.lang.Object) (-1784800));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-3035028), (-169871L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 515563241388");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3908L, 60336L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 64244L + "'", long2 == 64244L);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2219805000L), (long) (-9778));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2219795222L) + "'", long2 == (-2219795222L));
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3499569), 503932, 5148);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (byte) 10, (long) (-82215000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 82215010L + "'", long2 == 82215010L);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3499570L, 10001);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34999199570L + "'", long2 == 34999199570L);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(350035000L, (long) 34386408);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 315648592L + "'", long2 == 315648592L);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1999672, (-1990710), 3045000);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 520, 1989700, 1990710);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 520 for  must be in the range [1989700,1990710]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(63702720L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63702620L + "'", long2 == 63702620L);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 46920, 254849, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 841, 111, (-1999672));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 841 for  must be in the range [111,-1999672]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(688);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-688) + "'", int1 == (-688));
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-372966672750000L), (-99L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372966672749901L) + "'", long2 == (-372966672749901L));
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1620);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1620 + "'", int1 == 1620);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 532426752, (-3036L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1616447619072L) + "'", long2 == (-1616447619072L));
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(19, 27, 709908);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 709901 + "'", int3 == 709901);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3438639L, (java.lang.Object) 2294400);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1), (java.lang.Object) 39380L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(60336L, (-9651L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-582302736L) + "'", long2 == (-582302736L));
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(51, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(6069060510816L, 61090L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 370758906605749440L + "'", long2 == 370758906605749440L);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 35000, (java.lang.Object) 100459953);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2L, 350);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 700L + "'", long2 == 700L);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(51);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-51) + "'", int1 == (-51));
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(970111L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 970111 + "'", int1 == 970111);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-27), 9, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3499650, (-86));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-300969900L) + "'", long2 == (-300969900L));
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1784800), 5148);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1784800 * 5148");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(60336L, 688);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41511168L + "'", long2 == 41511168L);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1784780L), (-450684L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2235464L) + "'", long2 == (-2235464L));
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 34386408);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34386408L) + "'", long2 == (-34386408L));
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-97970), 1620, 1010);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3996508940L, (-349L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3996509289L + "'", long2 == 3996509289L);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3499569L, (java.lang.Object) 10049);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 841, (long) 100459953);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 84486820473");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1010L, (long) 16524);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15514L) + "'", long2 == (-15514L));
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1.0f), (java.lang.Object) 350035111L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 184, 18, 1000);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-32320L), (-10049));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 324783680L + "'", long2 == 324783680L);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 9778, (long) 20);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9798L + "'", long2 == 9798L);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 19, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19L) + "'", long2 == (-19L));
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-99L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-9691), (-97970));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 949427270L + "'", long2 == 949427270L);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(949427270L, (long) (-1784800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 947642470L + "'", long2 == 947642470L);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 351, 947642470L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 332622506970L + "'", long2 == 332622506970L);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 254849, (int) ' ', (-184));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 351, 3996509289L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1402774760439L + "'", long2 == 1402774760439L);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 34999199570L, (java.lang.Object) 872L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-3045000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3045000) + "'", int2 == (-3045000));
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-79), (long) 34386390);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2716524810L) + "'", long2 == (-2716524810L));
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(870, 532426752, (-184), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-158) + "'", int4 == (-158));
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 87, (long) (-27));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 114L + "'", long2 == 114L);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 34386390, 970111L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33358615189290L + "'", long2 == 33358615189290L);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9999), (-97970), 53248, 9864);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 709901, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 709901L + "'", long2 == 709901L);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1450548), 2294400, 9691, 1989700);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 843852 + "'", int4 == 843852);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2294400, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2294400 + "'", int2 == 2294400);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 2284709, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(18000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18000) + "'", int1 == (-18000));
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 27);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1450548), 9864);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1450548 * 9864");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-300969900L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-300969900) + "'", int1 == (-300969900));
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3509649, 970111, 2284709, 3045000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2959176 + "'", int4 == 2959176);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-198112800), (-1763460086), 100);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-27), (-489951), (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-80), 9700, 46920);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-8700000), (-9778));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -8700000 * -9778");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 688, 2294400, 1664);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(52, 5148, 62, (-198112800));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-3480228L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3480228) + "'", int1 == (-3480228));
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 910L, (java.lang.Object) 10200L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) ' ', 35000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35032 + "'", int2 == 35032);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 254849, (-171478832), 2284709);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 843852, 3908L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3297773616");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(843852);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-843852) + "'", int1 == (-843852));
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1010L), (-2235464L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2234454L + "'", long2 == 2234454L);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1990710, 949427270L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1890034360661700L + "'", long2 == 1890034360661700L);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 35032, 970111, (-8700));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35032 for  must be in the range [970111,-8700]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 106575000, (-1999672), (-87));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 106575000 for  must be in the range [-1999672,-87]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(709901L, 3045000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2161648545000L + "'", long2 == 2161648545000L);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 16524, 10200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 168544800L + "'", long2 == 168544800L);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) 0, (-97970), 350);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-198112800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 198112800 + "'", int1 == 198112800);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1450548), 532426752, 3509649, (-79));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100) + "'", int1 == (-100));
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 62, 841, (-3035028));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 62 for hi! must be in the range [841,-3035028]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-86), (long) 9691);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-833426L) + "'", long2 == (-833426L));
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3996508940L, (java.lang.Object) (-1990710L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) '#', (-3480228), (-9999));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-300969900), (long) 9778);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-300979678L) + "'", long2 == (-300979678L));
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3480228), (-19L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66124332L + "'", long2 == 66124332L);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-86), 87, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1450548), 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1450548 for  must be in the range [0,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 16524, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(90L, 3499650);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 314968500L + "'", long2 == 314968500L);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 709901, (int) (byte) 0, 16524);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 709901 for  must be in the range [0,16524]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(949427270L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 949427270 + "'", int1 == 949427270);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(111, (int) (short) 100, (-1989700));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9972, 532426752, (-1999672), (-79));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1454874) + "'", int4 == (-1454874));
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (byte) -1, (-489951), (int) (byte) 100);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3499650L, (long) 254849);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3244801L + "'", long2 == 3244801L);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(350035111L, (-1763460086));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-617272946947079546L) + "'", long2 == (-617272946947079546L));
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-158), 1989700, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-62000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 62000 + "'", int1 == 62000);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(62000, 106575000, 2284709);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1763460086), 35032);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1763425054) + "'", int2 == (-1763425054));
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(350035000L, (long) 841);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 350034159L + "'", long2 == 350034159L);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 0, 49, 9788);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 3499650, 100459953, 709901);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 351, 1664, 9864);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 101, (-10049), 520);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3996509289L, 3499543L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4000008832L + "'", long2 == 4000008832L);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(71700L, 315648592L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22632004046400L + "'", long2 == 22632004046400L);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-184), 1989700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-366104800L) + "'", long2 == (-366104800L));
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 3045000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3045000 + "'", int1 == 3045000);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 10, 870);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 880 + "'", int2 == 880);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2219795222L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-9778), 34386408);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-336230297424L) + "'", long2 == (-336230297424L));
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9477L, (java.lang.Object) 3996508940L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 33358615189290L, (java.lang.Object) (-2235464L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(254849, 1664, 1620, (-489951));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-198112800), 10047);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -198112800 * 10047");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-51), (-97770222L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97770171L + "'", long2 == 97770171L);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 198112800, (-3036L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 198109764L + "'", long2 == 198109764L);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 10100, (-169871L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1715697100) + "'", int2 == (-1715697100));
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-489951), (-349L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-489602L) + "'", long2 == (-489602L));
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1402774760439L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3394243441710L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3394243441710");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(10100, 3045000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 10100 * 3045000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 62000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62000 + "'", int2 == 62000);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1010, 5148, (-1450548));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(168544800L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 168544800 + "'", int1 == 168544800);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 97, (long) (-489951));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47525247) + "'", int2 == (-47525247));
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 18000, 350, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 18000 for hi! must be in the range [350,35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(709901L, 9999);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7098300099L + "'", long2 == 7098300099L);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 880, 35000, 19907100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 254849, (-843852), 9864);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(46920, (-1784714), (-184), 1142);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 576 + "'", int4 == 576);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(351, (-1454874));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1454523) + "'", int2 == (-1454523));
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1010, (long) 111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112110 + "'", int2 == 112110);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-9797), (java.lang.Object) 111L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-10049), (-489602L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 479553L + "'", long2 == 479553L);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9999), 35032, 34386408);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-32320L), (-843852));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27273296640L + "'", long2 == 27273296640L);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 10000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10000 + "'", int1 == 10000);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1), 1989700, 9864);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(920, (-1763460000), 19907100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 920 + "'", int3 == 920);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1989700), (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-158), (java.lang.Object) 6963094429000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 870, 9778);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1999672, (-8209), (-184));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1999672 for  must be in the range [-8209,-184]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-688), 351, 3499650);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -688 for hi! must be in the range [351,3499650]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1, (-9700), (-1999672));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18) + "'", int1 == (-18));
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 880, (long) 874263);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 769351440L + "'", long2 == 769351440L);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-27), 63702620L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63702593L + "'", long2 == 63702593L);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', (-97), 34386390);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-18), (-8700000), 532426752, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-300969900L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(254849);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-254849) + "'", int1 == (-254849));
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10, 46920, (-9700), 112110);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46930 + "'", int4 == 46930);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-8700), 198112800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -8700 * 198112800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 970000, 576, (-1450548));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) -1, (-79), 34386408);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(62000, 9691);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 600842000 + "'", int2 == 600842000);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1990710), 46930);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1943780) + "'", int2 == (-1943780));
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(370758906605749440L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 370758906605749440 * 32");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-87), 576, 9778);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -87 for  must be in the range [576,9778]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(19, 2294400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2294419 + "'", int2 == 2294419);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-450684L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1763460086), (-9691));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1763469777) + "'", int2 == (-1763469777));
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 843852, 101);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 85229052L + "'", long2 == 85229052L);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2294400, (long) (-1450548));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3328137331200L) + "'", long2 == (-3328137331200L));
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1L, 3499543L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3499544L + "'", long2 == 3499544L);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-97970), (long) (-79));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7739630L + "'", long2 == 7739630L);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 600842000, (-9778), (-3480228));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(479553L, 1620);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 776875860L + "'", long2 == 776875860L);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-8700000), 106575000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -8700000 for hi! must be in the range [106575000,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-79), (-47525247), 970000, 1620);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-489951), 35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -489951 for  must be in the range [35,32]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 3499650, 66124332L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 231412018483800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-503932), 53248, (-1763469777));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2284709, 9691);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2284709 * 9691");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9691, (-1943780), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-843852), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-84385200) + "'", int2 == (-84385200));
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-79), (-1763469777), (-47525247));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1989700), (-1763450397));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1989700 * -1763450397");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1010, 46930, 350);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1010 for  must be in the range [46930,350]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-111));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 19, (-100490000), 350);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(97, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-873) + "'", int2 == (-873));
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 87, (-80), (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 87 for  must be in the range [-80,32]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9778, 350, 1000, 1142);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1119 + "'", int4 == 1119);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(688, (-47525247));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47524559) + "'", int2 == (-47524559));
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-873), (-8700), (-843852));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 106575000, (long) (-9691));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106584691L + "'", long2 == 106584691L);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(49L, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(9764L, (long) 688);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9076L + "'", long2 == 9076L);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 100, (java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-97970), 843852, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(35814600L, (-503932));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18048123007200L) + "'", long2 == (-18048123007200L));
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (int) (byte) 0, 1989700);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-489951), (int) (byte) 100, (-1763469777));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-106575000), (-3045000), (-198112800));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -106575000 for  must be in the range [-3045000,-198112800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1715697100), (-1990710), (-1763450397));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3499568L, 10200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3509768L + "'", long2 == 3509768L);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (int) (short) 100, 3045000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(49L, (-18000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-882000L) + "'", long2 == (-882000L));
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1119, (-10049), (-97970));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-8209), 1010, (-8700000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(7098300099L, (-18));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-127769401782L) + "'", long2 == (-127769401782L));
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3038L, (long) (-82215000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-82211962L) + "'", long2 == (-82211962L));
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9700, (-1943780), 16524);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(576, (-8209));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7633) + "'", int2 == (-7633));
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 112110, (-47524559), 1142);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 112110 for  must be in the range [-47524559,1142]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(350035111L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 350035111 + "'", int1 == 350035111);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-97), 35032);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3398104) + "'", int2 == (-3398104));
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 688, 1890034360661700L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1300343640135249600L + "'", long2 == 1300343640135249600L);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(520, 10100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-84385200), 3499650, (-158));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-300969900), (long) 1142);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-300968758L) + "'", long2 == (-300968758L));
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1715697100), 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-87500552100L) + "'", long2 == (-87500552100L));
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1763469777), 841, 46920);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-8700000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8700000) + "'", int1 == (-8700000));
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(19, 576, 3509649, 112110);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-86), (-80), 503932);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -86 for  must be in the range [-80,503932]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9700, (-9), (-100490000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-155277600));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 155277600 + "'", int1 == 155277600);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3480228), (-99), (-3499569));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 46930);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46930 + "'", int1 == 46930);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 34386390, (-3480228L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 30906162L + "'", long2 == 30906162L);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(947642470L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 947642470 + "'", int1 == 947642470);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 10, (-1763460086), (-47525247));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-47525247));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47525247 + "'", int1 == 47525247);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(351, 870);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1221 + "'", int2 == 1221);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(503932);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-503932) + "'", int1 == (-503932));
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 168544800, 46930, (-3045000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 168544800 for  must be in the range [46930,-3045000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(4000008832L, (-1450548));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5802204811239936L) + "'", long2 == (-5802204811239936L));
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3480228), (-158));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3480386) + "'", int2 == (-3480386));
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2959176, (-1763460086), (-155277600));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2959176 for hi! must be in the range [-1763460086,-155277600]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-450684L), 872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-451556L) + "'", long2 == (-451556L));
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1763450397), (-9), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-52), 841);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 789 + "'", int2 == 789);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(180981L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 180981L + "'", long2 == 180981L);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-8209), (-9691), 5);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(620L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 620 + "'", int1 == 620);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9778, (-171478832));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-171469054) + "'", int2 == (-171469054));
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10100, (-13068L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-131986800L) + "'", long2 == (-131986800L));
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 880, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-84385200), 1989700, (-1999672));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -84385200 for hi! must be in the range [1989700,-1999672]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (byte) 10, (-18000), (-47525247));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for  must be in the range [-18000,-47525247]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1943780), (int) (short) 10, 0, (-688));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-86), 9076L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8990L + "'", long2 == 8990L);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-79), (-97), (-171478832));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 350, (-3045000), 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 3499650, (-1007698710304L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1007695210654L) + "'", long2 == (-1007695210654L));
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 350035111, (-47524559), 9788);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1784714), 3499650, (-8700));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-489602L), (long) (-158));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-489444L) + "'", long2 == (-489444L));
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3045000, 9778, (-8700));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(61090L, (-1491865838400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1491865899490L + "'", long2 == 1491865899490L);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1.0d, (java.lang.Object) 1221);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1007695210654L), (long) 520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -524001509540080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-155277600), 479553L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-155757153L) + "'", long2 == (-155757153L));
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 870, 3509768L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3053498160L + "'", long2 == 3053498160L);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(351, (-171478832));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 351 * -171478832");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-87), (-47524559), (-86));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-87) + "'", int3 == (-87));
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2102400L), (long) (-9778));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2112178L) + "'", long2 == (-2112178L));
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 620, (-27), 1221);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2959176, (int) (short) 1, 520);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2959176 for hi! must be in the range [1,520]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-62000), (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-310000L) + "'", long2 == (-310000L));
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-171478832), 880);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -171478832 * 880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2986L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-7633), (-155277600), 600842000, 171478832);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9), (-503932), 18, (-1450548));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3045000), 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-188790000) + "'", int2 == (-188790000));
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-97970), (-1), 19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -97970 for hi! must be in the range [-1,19]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-47525247), (-1450548), 34386408);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -47525247 for hi! must be in the range [-1450548,34386408]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-97970), 504032L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 406062L + "'", long2 == 406062L);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(620L, (long) 709901);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-709281L) + "'", long2 == (-709281L));
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1664, 1620, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 870, (-489951), 350035111);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(709908, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 709960 + "'", int2 == 709960);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 949427270);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 949427270 + "'", int1 == 949427270);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(789);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-789) + "'", int1 == (-789));
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-8209), (java.lang.Object) (-1007695210654L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10047, (long) 171478832);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1722847825104L + "'", long2 == 1722847825104L);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1119, (-51));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-57069L) + "'", long2 == (-57069L));
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 10, 18000, 18000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-79), 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7900L) + "'", long2 == (-7900L));
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(6015L, (long) (-1454874));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8751067110L) + "'", long2 == (-8751067110L));
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10200L, (java.lang.Object) (-1784714));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-873), (-198112800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9864, 970000, (-1990710), 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1010899) + "'", int4 == (-1010899));
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1007695210654L), 6015L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1007695204639L) + "'", long2 == (-1007695204639L));
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(51, 62, (-1989700));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(22632004046400L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 22632004046400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1142, (-97970), 576);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-97405) + "'", int3 == (-97405));
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-27), 155277600, 10049);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 111, (long) (-1990710));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-220968810L) + "'", long2 == (-220968810L));
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-10049), (-254849), 10100, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 2284622, 101L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 230746822 + "'", int2 == 230746822);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 350);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 350 + "'", int2 == 350);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 10049, 7098300099L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7098290050L) + "'", long2 == (-7098290050L));
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-9), (-171469054), (-111));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-450683L), (-878700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1329383L) + "'", long2 == (-1329383L));
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1664, 100, (int) '#', 620);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 592 + "'", int4 == 592);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-82215000L), 63702820L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5237327346300000L) + "'", long2 == (-5237327346300000L));
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-8209));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8209) + "'", int1 == (-8209));
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(9778);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9778) + "'", int1 == (-9778));
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 35, 920, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hi! must be in the range [920,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) '#', (long) (-155277600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5434716000L) + "'", long2 == (-5434716000L));
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(870, (-1715697100), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1715696283) + "'", int3 == (-1715696283));
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-2235464L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(947642470L, (-155277600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-147147648399672000L) + "'", long2 == (-147147648399672000L));
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(576);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-576) + "'", int1 == (-576));
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-18000), 87, 0, 3499650);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3481738 + "'", int4 == 3481738);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 46930, (java.lang.Object) 339458290L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-349L), 17319362033L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17319361684L + "'", long2 == 17319361684L);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(46920, 18, 34386390, 2294419);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-18000), 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17899) + "'", int2 == (-17899));
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1763425054), (int) (byte) 100, (int) (byte) -1, (-503932));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(351, 254849, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3328137331200L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3328137331200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-47524559), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-47524559L) + "'", long2 == (-47524559L));
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-300969900), 0, (-9778));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -300969900 for  must be in the range [0,-9778]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(870, (-3480386), (-9999));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3469518) + "'", int3 == (-3469518));
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3038L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3038L + "'", long2 == 3038L);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-155277600), 1221);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -155277600 * 1221");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-372966672750049L), (long) (-8700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372966672741349L) + "'", long2 == (-372966672741349L));
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(920, (-3035028));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3034108) + "'", int2 == (-3034108));
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-300979678L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-300979678) + "'", int1 == (-300979678));
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8209), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8209L + "'", long2 == 8209L);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 2294419);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2294419 + "'", int1 == 2294419);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3035028), 970000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2065028) + "'", int2 == (-2065028));
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 9999, 1119, 34386408);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1450732L, (-789));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1144627548L) + "'", long2 == (-1144627548L));
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(106584691L, (long) (-84385200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22199491L + "'", long2 == 22199491L);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3480386), 0, 970000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 399618 + "'", int3 == 399618);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1010899), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 106575000, (long) 920);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 98049000000L + "'", long2 == 98049000000L);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3034108), 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-188114696) + "'", int2 == (-188114696));
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 1, (-1999672));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1999671) + "'", int2 == (-1999671));
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1990710, 52, 920);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(99899989L, (long) 18000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99881989L + "'", long2 == 99881989L);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(52, 27, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 62000, 0, 34386390);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(122377675L, 35814600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 86563075L + "'", long2 == 86563075L);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5148, 9864, (-873), (-87));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-728) + "'", int4 == (-728));
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-180870L), (long) (-106575000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106394130L + "'", long2 == 106394130L);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-47524559), (int) '4', (-10));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -47524559 for hi! must be in the range [52,-10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(53248);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-53248) + "'", int1 == (-53248));
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(16524, 0, 62, (-9778));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(100459953, (-47525247));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 100459953 * -47525247");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-7633), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7633) + "'", int2 == (-7633));
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3328137331200L), 3509768L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3328133821432L) + "'", long2 == (-3328133821432L));
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-86), (-1763425054));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 151654554644L + "'", long2 == 151654554644L);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-171469054), 503932, (-1784800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-158));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 158 + "'", int1 == 158);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9691), (-1990710), (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9691) + "'", int3 == (-9691));
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 0, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1454874), (int) (byte) 100, (-1454874));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1943780));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1943780 + "'", int1 == 1943780);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(9972, 9972);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99440784 + "'", int2 == 99440784);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(46920, 9691);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56611 + "'", int2 == 56611);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-372966672750000L), (-17935455200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372984608205200L) + "'", long2 == (-372984608205200L));
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 111L, (java.lang.Object) (-198121500L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1664, 10047, (-8209));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 789, (-3398104), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-87), (-9691), (-1715696283), (-3035028));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1712671034) + "'", int4 == (-1712671034));
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 949427270, (-873000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 948554270L + "'", long2 == 948554270L);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 184, (-82215000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15127560000L) + "'", long2 == (-15127560000L));
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-3469518));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3469518 + "'", int1 == 3469518);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 709901, (long) 111);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 709790L + "'", long2 == 709790L);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(18000, 35000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 630000000 + "'", int2 == 630000000);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3480228), 16524, 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1943780, (-158), (-1763460086));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 503932);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(46920, (-1010899));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-963979) + "'", int2 == (-963979));
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(101, 3481738);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 351655538 + "'", int2 == 351655538);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(41511168L, 41511168L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83022336L + "'", long2 == 83022336L);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-3398104));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3398104) + "'", int1 == (-3398104));
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2294419, (-1763460000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4046116129740000L) + "'", long2 == (-4046116129740000L));
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 17319362033L, (java.lang.Object) (-155757153L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-111), (-18), (-1943780));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -111 for hi! must be in the range [-18,-1943780]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(99899989L, 789);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 78821091321L + "'", long2 == 78821091321L);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-688), 532426752, 9999, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(949427270, 168544800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1117972070 + "'", int2 == 1117972070);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-80), 0, (-106575000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 46930, (int) (short) 1, 1010);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 9999);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9999 + "'", int1 == 9999);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(30906162L, (-1990710L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32896872L + "'", long2 == 32896872L);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3996518737L), (long) (-47525247));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 189935540116053039L + "'", long2 == 189935540116053039L);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-1616447619072L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1616447619072L) + "'", long2 == (-1616447619072L));
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 9972, 78821091321L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 78821101293L + "'", long2 == 78821101293L);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2102400L), (long) (-51));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 107222400L + "'", long2 == 107222400L);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-3499569), (long) (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 349956900 + "'", int2 == 349956900);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3035028), 0, 870);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(32896872L, (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32896872L) + "'", long2 == (-32896872L));
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9700, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-62000), 52, 1000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 634 + "'", int3 == 634);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3469518), 2284622, 399618, 709960);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 677162 + "'", int4 == 677162);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 350035111, (-80), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(66124332L, 1989700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 131567583380400L + "'", long2 == 131567583380400L);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-82211962L), (java.lang.Object) 41511168L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3908L, 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 199308L + "'", long2 == 199308L);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-10049), 350, (-184));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1715697100), (-709281L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1716406381L) + "'", long2 == (-1716406381L));
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-2065028));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2065028) + "'", int1 == (-2065028));
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-79), 399618, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-188790000), (int) (short) 100, (-8700000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3496505L, (long) 35032);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3461473L + "'", long2 == 3461473L);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 406062L, (java.lang.Object) 10049);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(101);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-101) + "'", int1 == (-101));
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 19, (-87));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1653L) + "'", long2 == (-1653L));
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2716524810L), (java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-79), (-169871L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 169792L + "'", long2 == 169792L);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 155277600);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 155277600 + "'", int1 == 155277600);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3996509289L, 6963094429000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6959097919711L) + "'", long2 == (-6959097919711L));
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(30906162L, (-8700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-268883609400L) + "'", long2 == (-268883609400L));
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-47524559));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47524559) + "'", int1 == (-47524559));
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-34386408L), (-1712671034));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58892604944905872L + "'", long2 == 58892604944905872L);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 2284622, (-1491865838400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1491868123022L + "'", long2 == 1491868123022L);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 841, (-1763450397), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-963979), 709908, (-3499569));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-106575000), 789, (-111), 5148);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3909 + "'", int4 == 3909);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(66124332L, 107222400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7090009575436800L + "'", long2 == 7090009575436800L);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1142L, 3053498160L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3053499302L + "'", long2 == 3053499302L);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-52), (-1763450397), 168544800);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-310000L), 189935540116053039L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -310000 * 189935540116053039");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1989700, 350035111, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 46920, 22199491L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22246411L + "'", long2 == 22246411L);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1784714), 168544800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1784714 * 168544800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-9999));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 101L, (java.lang.Object) 947642470);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 97, 3496505L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 339160985L + "'", long2 == 339160985L);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3469518), 78821101293L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-273471229715886774L) + "'", long2 == (-273471229715886774L));
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6138000L), (-147147648399672000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-147147648405810000L) + "'", long2 == (-147147648405810000L));
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3034108), 46930);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3034108 * 46930");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-82215000), (-3035028), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3045000), 592);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1802640000) + "'", int2 == (-1802640000));
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-79), (java.lang.Object) 2234454L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 87, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-158), (-52), (-728), 49);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-210) + "'", int4 == (-210));
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(106584691L, (-8700000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-927286811700000L) + "'", long2 == (-927286811700000L));
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 16524, 169792L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-153268L) + "'", long2 == (-153268L));
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 970111);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-970111L) + "'", long2 == (-970111L));
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-489951), 1119, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -489951 for hi! must be in the range [1119,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-372984608205200L), (-197L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 73477967816424400L + "'", long2 == 73477967816424400L);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-450684L), 2161648545000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2161648995684L) + "'", long2 == (-2161648995684L));
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-87), 620, 35000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-310000L), 198112800);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-61414968000000L) + "'", long2 == (-61414968000000L));
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8209), 970000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7962730000L) + "'", long2 == (-7962730000L));
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1784800), 102780L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1682020L) + "'", long2 == (-1682020L));
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(98049000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 98049000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 688, 10001, (-1784800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(71700L, (long) 168544800);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-168473100L) + "'", long2 == (-168473100L));
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-99), 46930);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46831 + "'", int2 == 46831);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 62000, 3045000, 709901);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 62000 for  must be in the range [3045000,709901]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-9778), 9972, (-9999));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9778 for hi! must be in the range [9972,-9999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2112178L), 32896872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69484049307216L) + "'", long2 == (-69484049307216L));
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(332622506970L, (-1802640000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 332622506970 * -1802640000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 100459953, (long) 349956900);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 35156653726025700");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 874263, (long) (-1784714));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2658977L + "'", long2 == 2658977L);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-87), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-87) + "'", int2 == (-87));
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-18000), (-168473100L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-168491100L) + "'", long2 == (-168491100L));
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 99440784, 870, 688);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9864, 688);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10552 + "'", int2 == 10552);
    }
}

