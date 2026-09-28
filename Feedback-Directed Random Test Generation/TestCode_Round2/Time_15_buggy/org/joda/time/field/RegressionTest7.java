package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 10398);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10398 + "'", int2 == 10398);
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 3480228, 126482100, (-300551));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3480228 for hi! must be in the range [126482100,-300551]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-17899));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-17899) + "'", int1 == (-17899));
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 64, (-17424), 970000);
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-47524559), 3499553, (-6289801));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-350000), (-86130), (-863620));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-322L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-322) + "'", int1 == (-322));
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(6289801L, (long) (-146793024));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-140503223L) + "'", long2 == (-140503223L));
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-951492298), 638821068, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 600832203);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 600832203 + "'", int1 == 600832203);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-592), (-1450548), (-1943430));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 10047, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10047L + "'", long2 == 10047L);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-151069740), 3053498160L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -461291173121678400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1495740, 1910207, 926161);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-204298726), 12487942, 1989700, (-539633));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(20, 176411200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176411220 + "'", int2 == 176411220);
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1738657, 533310184, (-111));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1738657 for  must be in the range [533310184,-111]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(257397490, 30906162);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 288303652 + "'", int2 == 288303652);
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(920);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-920) + "'", int1 == (-920));
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1620, 2658977);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1620 * 2658977");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1705, (-190043702731531L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 190043702733236L + "'", long2 == 190043702733236L);
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-34386308), 801884423L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27573844749680284L) + "'", long2 == (-27573844749680284L));
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3509649), (-704619699));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-708129348) + "'", int2 == (-708129348));
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9788880), (-570400));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -9788880 * -570400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1725430130L, 6505352945L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4779922815L) + "'", long2 == (-4779922815L));
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(48456409752010398L, (-1207195378L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48456408544815020L + "'", long2 == 48456408544815020L);
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-244802), (-1710528757), 600842000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-244802) + "'", int3 == (-244802));
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-401679315779397770L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -401679315779397770");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(53248, 100490000, (-34386308));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1989648L), 62000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2051648L) + "'", long2 == (-2051648L));
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 126547938, (-51), (-2065033));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(126547938, 16524);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 126547938 * 16524");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3561650, (-1711678817));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3561650 * -1711678817");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 577142280, 709901, 2005438);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6717425867802L), (long) 106575000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6717319292802L) + "'", long2 == (-6717319292802L));
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 258759, (-47524559), (-1530017442));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-349946851), (-9999));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3499118563149L + "'", long2 == 3499118563149L);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-153251), (java.lang.Object) (-166315520939630L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-146793024), (-10), (-43296));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-66534), (-15961217), (-1762676017));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(168579832);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-168579832) + "'", int1 == (-168579832));
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2005430, (-963979));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1933192405970L) + "'", long2 == (-1933192405970L));
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-15127560000L), (long) 638821068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -15127560000 * 638821068");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-158159661L), 1491865899490L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -158159661 * 1491865899490");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1530017442);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1530017442 + "'", int1 == 1530017442);
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(34254582120L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 34254582120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(60617119500000L, (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-303085597500000L) + "'", long2 == (-303085597500000L));
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(99881989L, 17887930641L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1786682091517124949");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-9), 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1943430, (java.lang.Object) 655);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(14307000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14307000 + "'", int1 == 14307000);
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(99835208, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 99835208 * 64");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5434716000L), (-1147540070));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6236554379070120000L + "'", long2 == 6236554379070120000L);
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 533310184, (-372966672749901L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 533310184 * -372966672749901");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-6289801), 947642470, 26511433);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-34999191361L), (-2658887L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93058894920275207L + "'", long2 == 93058894920275207L);
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 2110080, (long) 230746822);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 486894254165760");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2250), (-364));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 819000 + "'", int2 == 819000);
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-950048943), 3480228, (-729));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(936406880L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 936406881L + "'", long2 == 936406881L);
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2440438, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2440438 + "'", int2 == 2440438);
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 188152939L, (java.lang.Object) 4476722);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2440438, 53248);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 129948442624L + "'", long2 == 129948442624L);
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3328130321879L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3328130321879");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 3499553L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 155277600, (-760147277873592L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-760147122595992L) + "'", long2 == (-760147122595992L));
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3499118563149L, 9076L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3499118572225L + "'", long2 == 3499118572225L);
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-300979678));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 300979678 + "'", int1 == 300979678);
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(7146781980L, (long) (-47525247));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-339652578854649060L) + "'", long2 == (-339652578854649060L));
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-600832203), 1482832281);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-890933386072745043L) + "'", long2 == (-890933386072745043L));
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2065028, 973781);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2065028 * 973781");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(46935164704L, (long) (-1943430));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -91215207140694720");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-951492298), (-1761176514), 299824116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-951492298) + "'", int3 == (-951492298));
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(709790L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 709790 + "'", int1 == 709790);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 185867227, (-27826), (-106403849));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-700));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 700 + "'", int1 == 700);
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(48456409753999671L, 2936930686872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48453472823312799L + "'", long2 == 48453472823312799L);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-4785376), 53248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -4785376 * 53248");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1121617, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1121717 + "'", int2 == 1121717);
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9123345), 1763460000, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-185867227), 420386456, (-23067514));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 31508272, (-1090328));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-76433), 12487942, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -76433 for  must be in the range [12487942,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-69931974934731104L), (long) (-54948));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -69931974934731104 * -54948");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(17329373, (-1788088016));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 17329373 * -1788088016");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-204677760), (-97405), (-1760510603));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(102842949170344L, 350035111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 102842949170344 * 350035111");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-351375808428464L), (long) (-704619699));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-351375103808765L) + "'", long2 == (-351375103808765L));
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(677162, 198112800, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1505073, (-39585000), 56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9864), (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 976536 + "'", int2 == 976536);
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9875, (java.lang.Object) (-1716406381L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 185867148, 1142, 874263);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(90L, (long) 48014510);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48014600L + "'", long2 == 48014600L);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3045000), 6289491);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3045000 * 6289491");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(4476722, 171478832);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 4476722 * 171478832");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(47234, 2284709);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 47234 * 2284709");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1943780), (-105840302932201213L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105840302930257433L + "'", long2 == 105840302930257433L);
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(576, (-47525247), (-11), 14307);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 90 + "'", int4 == 90);
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1705, (long) 958464);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 960169L + "'", long2 == 960169L);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(3909);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3909) + "'", int1 == (-3909));
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 100, (-188114696), (-1142));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for  must be in the range [-188114696,-1142]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(10L, (long) 2005430);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2005420L) + "'", long2 == (-2005420L));
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10, 184, (-3277662));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-244802), (-1454523), 0);
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2110080, 532427871, 600842000, (-54948));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1763460000, 86130, (-101), 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-46) + "'", int4 == (-46));
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-300979678L), (java.lang.Object) 9788);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1), (long) 1117972070);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1117972070L) + "'", long2 == (-1117972070L));
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(62000, 843887);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 62000 * 843887");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1715696283), 47525347);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1715696283 * 47525347");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 10552, 14227, (-2235464));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10552 for hi! must be in the range [14227,-2235464]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-873), (-111), 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(97770180L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 4476722, 445);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1992141290L + "'", long2 == 1992141290L);
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1715696283), (-441));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1715696724) + "'", int2 == (-1715696724));
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 9875);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1718668813L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1718668813 + "'", int1 == 1718668813);
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(154650012, 171478832);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 326128844 + "'", int2 == 326128844);
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(8209, (-3469518), (-10047), (-539633));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 66747848L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-66747848L) + "'", long2 == (-66747848L));
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(789, 0, (-1715159045));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 4479760, (-7889211));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35341771869360L) + "'", long2 == (-35341771869360L));
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-111), 1010, (-349956900));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1470988428), (-89), 155279264, 4476722);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-15961567), (-5252), (-76433));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1664, (java.lang.Object) 101009154);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 111, (-4785376), 10000);
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(90L, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 900L + "'", long2 == 900L);
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-601337), 3828);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-597509) + "'", int2 == (-597509));
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(68800L, 3481738);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 239543574400L + "'", long2 == 239543574400L);
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2966L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1530017442), 1, 155277732);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22759878 + "'", int3 == 22759878);
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(153428, 6289491);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 153428 * 6289491");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-15651849), (-1277533));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16929382) + "'", int2 == (-16929382));
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-99440784), (-349956900), 169182050);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 304461011, 31508272);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9593040347982992L + "'", long2 == 9593040347982992L);
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-874263), 95781);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -874263 * 95781");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-153251), (-79), 9070, (-951492297));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 870, 101009154, (-100459952));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-16990520), (-314));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -16990520 * -314");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2284512L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2284512) + "'", int1 == (-2284512));
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-34386390));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34386390 + "'", int1 == 34386390);
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 19322798960746L, (java.lang.Object) (-161986));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(97770180L, (-950048943));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-92886456165919740L) + "'", long2 == (-92886456165919740L));
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(949427270, 201372638);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 949427270 * 201372638");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-164261393856L), (-51));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8377331086656L + "'", long2 == 8377331086656L);
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1, (-1000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1000) + "'", int2 == (-1000));
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(635218511, 944118497, (-949427270), 9864);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-816756018) + "'", int4 == (-816756018));
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-3499569), 1765497216, (-1715160045));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3499569 for hi! must be in the range [1765497216,-1715160045]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-322L), (java.lang.Object) 2161649352804L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 709790, 34386390, (-576));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 87426300, 1010, (-1763450397));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6963094429000L), 46851);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-326227937093079000L) + "'", long2 == (-326227937093079000L));
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1784780L), (java.lang.Object) 168433832L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-145208190313956L), 12100448);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -145208190313956 * 12100448");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1999672), (-9), (-1715156650));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1763940348L), (java.lang.Object) 3509649);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(61090L, 78821101293L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-78821040203L) + "'", long2 == (-78821040203L));
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-812374164), 62000, (-1285742));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3034108), (-951502398));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-954536506) + "'", int2 == (-954536506));
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(168472090L, (long) (-1989700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-335208917473000L) + "'", long2 == (-335208917473000L));
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-204298726), (-468), (-46), (-25));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-44) + "'", int4 == (-44));
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1990710), (-203556918L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 405222792231780");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 10, (-166315520939630L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1663155209396300L) + "'", long2 == (-1663155209396300L));
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(78821091321L, (long) 21963942);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 78843055263L + "'", long2 == 78843055263L);
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-97970), 157773616, (-843852));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-99440784));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99440784 + "'", int1 == 99440784);
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 326128844, 26511433);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8646142997073452L + "'", long2 == 8646142997073452L);
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2250), (long) (-54948));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52698L + "'", long2 == 52698L);
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(105975160, (int) (byte) 1, 3611760);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1234120 + "'", int3 == 1234120);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-696874493105108L), (-760147122595992L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -696874493105108 * -760147122595992");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-99370817L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-99370817) + "'", int1 == (-99370817));
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 47234, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-47234L) + "'", long2 == (-47234L));
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1762676017));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1762676017 + "'", int1 == 1762676017);
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2304106, (int) '#', 9700);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3598 + "'", int3 == 3598);
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1999671), 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1999662) + "'", int2 == (-1999662));
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-952907498), 350000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-952557498) + "'", int2 == (-952557498));
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(171191921969120L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(635218511);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-635218511) + "'", int1 == (-635218511));
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (int) (short) 0, (-15961567));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(445, (-2582129), (-590309465), 99593070);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2581684) + "'", int4 == (-2581684));
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3035028), (-82215000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-85250028) + "'", int2 == (-85250028));
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 7098300099L, (java.lang.Object) (-47524559L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-112210784083120731L), (long) (-301848066));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-112210783781272665L) + "'", long2 == (-112210783781272665L));
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-300969892), 2005430);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-298964462) + "'", int2 == (-298964462));
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-7633), 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-68697) + "'", int2 == (-68697));
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(47620, (-1989700));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1942080) + "'", int2 == (-1942080));
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 171459354, 217526, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 171459354 for hi! must be in the range [217526,15]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-47524559), 1121717, (-314));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -47524559 for hi! must be in the range [1121717,-314]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-68697), (-132), (-10100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-920), 952907498);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 952906578 + "'", int2 == 952906578);
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9691), 586810735, 49, (-51));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2536427, (-1717685969));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1715149542) + "'", int2 == (-1715149542));
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(973682, (-2065028));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 973682 * -2065028");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-81725049), 35, (-27));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(105840302930257433L, (-2103102L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105840302932360535L + "'", long2 == 105840302932360535L);
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-489602L), (java.lang.Object) (-816756018));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-204685393), 335272154, 112110);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -204685393 for  must be in the range [335272154,112110]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-7098290050L), 68800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -488362355440000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(451);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-451) + "'", int1 == (-451));
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3598, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(22759878, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22759878 + "'", int2 == 22759878);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2235464), (-349L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2235115L) + "'", long2 == (-2235115L));
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(3499650);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3499650) + "'", int1 == (-3499650));
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1715697100, 14307000, 115104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1943430), (-6959097919711L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1943430 * -6959097919711");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 100, 21963942, 586810735);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-357591120), (-17423));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-357608543) + "'", int2 == (-357608543));
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-688), (java.lang.Object) (-13068L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1761078660), (-372966672750000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1761078660 * -372966672750000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-952557498), 3499569);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3333540690718362L) + "'", long2 == (-3333540690718362L));
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-62000), 1620, 3509649, 5148);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2065028);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2065028) + "'", int1 == (-2065028));
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(52, 176421201);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 52 * 176421201");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1174462), 46851, (-312315));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-27826), (-600842000), (-8700000));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-592169827) + "'", int3 == (-592169827));
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 87426300, (-600842000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [87426300,-600842000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(95781, (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8332947) + "'", int2 == (-8332947));
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-9169), (-2005430), (-1990710));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9169 for  must be in the range [-2005430,-1990710]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1482832281, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(95781, 1712671034, 157773616);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(3499553, (-8700000), (-628056570));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-211672136), (-244802));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-211916938) + "'", int2 == (-211916938));
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-204298726), (-577), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(590309465, (-9778), (-1763460000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1505073);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1505073 + "'", int1 == 1505073);
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(833, 339160985);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 339161818 + "'", int2 == 339161818);
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-10047), (-1763940348L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17722308676356L + "'", long2 == 17722308676356L);
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2294400, 335272154);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 769248430137600L + "'", long2 == 769248430137600L);
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(315638545L, (-114080));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36008045213600L) + "'", long2 == (-36008045213600L));
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(96, 108109069, 0, 31508272);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13584346 + "'", int4 == 13584346);
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 549, 258759, (-3396800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 13584346);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3500415L, 9477L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33173432955L + "'", long2 == 33173432955L);
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-14149), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1989670L), (long) 6015);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1995685L) + "'", long2 == (-1995685L));
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(100490000, 149158);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 100490000 * 149158");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-314), 100963445);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100963131 + "'", int2 == 100963131);
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(948554270L, (long) (-1788088016));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2736642286L + "'", long2 == 2736642286L);
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1530017442), 6289491, 299824116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 231190314 + "'", int3 == 231190314);
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(56, 19, (-100460641));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-873000L), (java.lang.Object) (-1207025507L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1761479067), 576131381);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1185347686) + "'", int2 == (-1185347686));
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3499568L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3499568L + "'", long2 == 3499568L);
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 976536, (-951492297), 1142);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-833426L), (long) 34875834);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35709260L) + "'", long2 == (-35709260L));
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-44), (-131986800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 131986756L + "'", long2 == 131986756L);
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 47525347, 1464528196L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1417002849L) + "'", long2 == (-1417002849L));
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-489951), 530216924);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -489951 * 530216924");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-450684L), (long) 609053028);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-274490454871152L) + "'", long2 == (-274490454871152L));
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-92886456165919740L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-18), 1762676017);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1762675999 + "'", int2 == 1762675999);
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 586809815, (long) 507005);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 297515510254075L + "'", long2 == 297515510254075L);
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(700, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1989687), 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1989679) + "'", int2 == (-1989679));
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-76433), (-2304264));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [-76433,-2304264]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(63702593L, (-1713149062));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-109132037444917766L) + "'", long2 == (-109132037444917766L));
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-47234), (-3333540690718362L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -47234 * -3333540690718362");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 4033340, (-3223028880L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12999571302859200L) + "'", long2 == (-12999571302859200L));
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 48453472823312799L, (java.lang.Object) 2294400);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-35), (java.lang.Object) 1788088016);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-364), 230746822, (-1784714));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3469518), (-1763460000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1766929518) + "'", int2 == (-1766929518));
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(47234, (-188790000), 156879);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 47234 + "'", int3 == 47234);
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1174462, 349956900, (-204685393));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-111), (-127769401782L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14182403597802L + "'", long2 == 14182403597802L);
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 153251, 10048L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 163299L + "'", long2 == 163299L);
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-6142282650476246L), (long) (-1462491242));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -6142282650476246 * -1462491242");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 339160985, 2005438, 2248540);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1763450397), (long) (-76433));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 134785804193901L + "'", long2 == 134785804193901L);
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-14308));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-102737953872L), (java.lang.Object) 2986L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(171459354, (-816756018));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 171459354 * -816756018");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-450684), (-168644268L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 168193584L + "'", long2 == 168193584L);
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-34386408), (-1715149542), (-47525247));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(53706552900000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 53706552900000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-185867227), (-100188684), (-1763450397));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-592), (-601337), (-1784800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(420386456, 312315);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 420386456 * 312315");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-16929382), (-122484040), 17329373);
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-84385200), (-47585L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-84432785L) + "'", long2 == (-84432785L));
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2284512L), (-99375055L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97090543L + "'", long2 == 97090543L);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1989679), 1174573, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1023876541100647L, (-198122588L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1023876541100647 * -198122588");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(14428);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14428) + "'", int1 == (-14428));
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-4046116129740000L), 370758906605749440L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4046116129740000 * 370758906605749440");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(299785985L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 299785985 + "'", int1 == 299785985);
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-300551), 949427270, (-1989700), (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1967089) + "'", int4 == (-1967089));
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1763460086, (-1999671), 445);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(4479760, 14227, 126482100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4479760 + "'", int3 == 4479760);
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-47620));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47620 + "'", int1 == 47620);
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 258759, 239466083, 335272134);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(157773616, 586809815);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 157773616 * 586809815");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 201, 155277732, (-1277533));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-190043702986380L), (-97753263347680800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-97943307050667180L) + "'", long2 == (-97943307050667180L));
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-53248), (-47525247), 98640);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-53248) + "'", int3 == (-53248));
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 35000, (java.lang.Object) 95781);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-5), (long) (-40322560));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40322555L + "'", long2 == 40322555L);
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1482832281, (-46), (-708129348), (-17864));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-687800606) + "'", int4 == (-687800606));
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 609053028, (-1995555), 9999);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 635218511, 231190314, (-15961567));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 635218511 for  must be in the range [231190314,-15961567]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3536656467266061711L), (-315818774104L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3536656783084835815L) + "'", long2 == (-3536656783084835815L));
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(350035111, 99440784);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 449475895 + "'", int2 == 449475895);
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-366104800L), 58975891968027L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-58976258072827L) + "'", long2 == (-58976258072827L));
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 185867148, 198112800, (-188114696));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 62, 0, (-17864));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 62 for  must be in the range [0,-17864]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1713149062), 801902322, (-601423));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1713149062 for  must be in the range [801902322,-601423]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 8990);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 132, 576131381, (-9778));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 132 for  must be in the range [576131381,-9778]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(64244L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64244 + "'", int1 == 64244);
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(489951, (-2284512));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1794561) + "'", int2 == (-1794561));
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6143307333500510L), (-6370157478L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6143313703657988L) + "'", long2 == (-6143313703657988L));
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1023872308448164L, (-106403849));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1023872308448164 * -106403849");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-6138000L), (long) 22384927);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -137398681926000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-43296));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43296 + "'", int1 == 43296);
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-944118497), 2252833699511782L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2252832755393285L + "'", long2 == 2252832755393285L);
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1454874));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1454874 + "'", int1 == 1454874);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-300969900L), (long) (-420368508));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 119398608L + "'", long2 == 119398608L);
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-39585000), (long) 9972);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-39575028L) + "'", long2 == (-39575028L));
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-34386408), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 326128844);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 326128844 + "'", int1 == 326128844);
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-5237327346300000L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 94401367, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8700), (-1879789912));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16354172234400L + "'", long2 == 16354172234400L);
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1131200L), (-874263));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 988966305600L + "'", long2 == 988966305600L);
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2005438, 592, (-312), 9070);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7451 + "'", int4 == 7451);
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-168579832), (-18400), (-3480228));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-18048022692349L), 11041219000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18036981473349L) + "'", long2 == (-18036981473349L));
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1725430130L, 168579832);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 290872721443138160L + "'", long2 == 290872721443138160L);
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-99370817));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99370817 + "'", int1 == 99370817);
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 533310184, (long) 1712671034);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 913384904274010256L + "'", long2 == 913384904274010256L);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(8700);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8700) + "'", int1 == (-8700));
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-15651849), (-153251));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15805100) + "'", int2 == (-15805100));
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-5252), 1762676017, 1712671034);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-6717319292802L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6717319292802");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(874263, (-163115), (-3499650), 351655538);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 711148 + "'", int4 == 711148);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-203556918L), (java.lang.Object) (-2110080));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 2065028, 1763460000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1761394973 + "'", int3 == 1761394973);
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1786407669), 7451, (-628056570));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-7098290050L), (-9651L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7098280399L) + "'", long2 == (-7098280399L));
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10049, (long) 185867148);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1867778970252L + "'", long2 == 1867778970252L);
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 168472090, (long) 709790);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 167762300L + "'", long2 == 167762300L);
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-15952400), 5717880000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -15952400 * 5717880000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(48456408803446250L, (long) 970000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48456408802476250L + "'", long2 == 48456408802476250L);
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1711678817), (java.lang.Object) 1999672);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 288303652, 1482832080);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 427505903966756160L + "'", long2 == 427505903966756160L);
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1761394973, (java.lang.Object) (-9778));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-1999662), (-1761176514), (-18));
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 1495740, (-89), 87426300);
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-57069L), 1943780);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-110929580820L) + "'", long2 == (-110929580820L));
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-54948), (java.lang.Object) 158);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 2294419);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9700), 10398, 149158, 843852);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 695393 + "'", int4 == 695393);
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(100963445, (-949512368), 46920);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-848595844) + "'", int3 == (-848595844));
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-349946851), 102842952618798L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102842602671947L + "'", long2 == 102842602671947L);
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-99), (-75571671168000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7481595445632000L + "'", long2 == 7481595445632000L);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-204677760), 86130);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -204677760 * 86130");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(157773616, 2005430);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 159779046 + "'", int2 == 159779046);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-299823236L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(10L, (-3996509288L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-39965092880L) + "'", long2 == (-39965092880L));
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1766929518), (-2250), (-8700000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(2983768123909261L, 99832172L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2983768024077089L + "'", long2 == 2983768024077089L);
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(17319362032L, (-329312221170190L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-329294901808158L) + "'", long2 == (-329294901808158L));
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-586809815), 949427270, (-1717685969));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -586809815 for  must be in the range [949427270,-1717685969]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1329383L), 936406936L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1244843461800488L) + "'", long2 == (-1244843461800488L));
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5), (-25), 4476722);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-3045000), 14428, 62);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3045000 for hi! must be in the range [14428,62]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10000, (-86), 100963445);
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(45091, 14428, 532427871, (-254849));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2235464), 1023872308394916L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023872306159452L + "'", long2 == 1023872306159452L);
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(87426300);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-87426300) + "'", int1 == (-87426300));
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 35, 141074004320L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4937590151200L + "'", long2 == 4937590151200L);
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-18048122527557L), 173189501403448L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -18048122527557 * 173189501403448");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(198112800, 87, (-9999), (-951492297));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-874263), 451);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-873812) + "'", int2 == (-873812));
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1999662));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1999662) + "'", int1 == (-1999662));
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1712671034, 0, 3045000, 1482832281);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 232883752 + "'", int4 == 232883752);
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1766929518));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1766929518 + "'", int1 == 1766929518);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-132), 15172184880L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15172184748L + "'", long2 == 15172184748L);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1784800), 2294419, 590309465);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(35032, 533301015, (-310), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-30) + "'", int4 == (-30));
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-97970), (long) (-214183750));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20983581987500L + "'", long2 == 20983581987500L);
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-544372324350570L), (long) (-7889211));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-544372316461359L) + "'", long2 == (-544372316461359L));
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(521312L, 20714400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10798665292800L + "'", long2 == 10798665292800L);
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-100459953), 920, 100962303, 257397490);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 212411343 + "'", int4 == 212411343);
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1121617, (java.lang.Object) 47234L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 157773616, (-127769401782L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 157773616 * -127769401782");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-168573390), 0, 12100448);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3499569), 10000, 8, 532427871);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 528938295 + "'", int4 == 528938295);
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1989670L), (java.lang.Object) (-9123345));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10, (-1530017442), 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1718668813);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1718668813) + "'", int1 == (-1718668813));
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(15, 17329373);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 259940595 + "'", int2 == 259940595);
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(629990222, (-1967089));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 628023133 + "'", int2 == 628023133);
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1370574, 31508272);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1370574 * 31508272");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 48456409752000000L, (java.lang.Object) 108685080);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(177664191, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3328434791324L), (java.lang.Object) 99835208);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1761479067), (-198112800), 153251);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-9999), (-62000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 619938000L + "'", long2 == 619938000L);
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9875, 1000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1763425054), (-15951520), (-34386308));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1763425054 for  must be in the range [-15951520,-34386308]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9999, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9999 + "'", int2 == 9999);
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3965232332375580L), (-489444L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3965232332375580 * -489444");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-168573390), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1278262), (java.lang.Object) (-3480386));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 619, 6289491, (-1450647));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 619 for  must be in the range [6289491,-1450647]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(22384927, (-47524559), 586810735, (-97970));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3045000, 64, (-3499650));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) (-767464499));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-312), (long) (-1802640000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1802640312L) + "'", long2 == (-1802640312L));
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8209), 2987409L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-24523640481L) + "'", long2 == (-24523640481L));
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 2248540, (long) (-312));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2248228L + "'", long2 == 2248228L);
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(9798L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9798 + "'", int1 == 9798);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-100490000), (-97146319L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9762233596310000L + "'", long2 == 9762233596310000L);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1788087917, (-168573390));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-301424041786728630L) + "'", long2 == (-301424041786728630L));
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 296192052);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-12595644), (-323521822L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 310926178L + "'", long2 == 310926178L);
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(99832172L, (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99832182L + "'", long2 == 99832182L);
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1234120, (-709960));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 524160 + "'", int2 == 524160);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(149158, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5220530 + "'", int2 == 5220530);
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-601423));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 601423 + "'", int1 == 601423);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(163143504L, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1631435040L + "'", long2 == 1631435040L);
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 350, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-350L) + "'", long2 == (-350L));
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 601423, (long) (-106575000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64096656225000L) + "'", long2 == (-64096656225000L));
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-300969892), 49, 1762676017);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -300969892 for hi! must be in the range [49,1762676017]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3561650, (-100459953));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3561650 * -100459953");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(212411343, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-81725049), 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7355254410L) + "'", long2 == (-7355254410L));
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-15288536528274L), 53706552900000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -15288536528274 * 53706552900000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1454523));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1454523 + "'", int1 == 1454523);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(5148, 592);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5740 + "'", int2 == 5740);
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-789), 970000, (-577));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -789 for hi! must be in the range [970000,-577]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(300979678, (-1763460000), 1450647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1463930970) + "'", int3 == (-1463930970));
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-927286817838000L), (long) 1470988428);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -927286817838000 * 1470988428");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(351, 48014510, (-198112800));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-190043702731531L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-34386390), 2065028, (-570400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-106575000), (-51), (-35032), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4665) + "'", int4 == (-4665));
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 168579832);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 168579832 + "'", int1 == 168579832);
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 47525347, (-1144627548L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1192152895L + "'", long2 == 1192152895L);
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(155277797L, (long) (-1470988428));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -228411842512333116");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2235464), (-1454523), (-3034108));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2235464 for hi! must be in the range [-1454523,-3034108]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) "hi!", (java.lang.Object) 951502398);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1174462, (long) 600842000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 705666097004000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3398104, 970111, (-299315787), (-704619699));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 21674203800L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(53706552900000L, (-17935542210L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53724488442210L + "'", long2 == 53724488442210L);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1763450397), 479643, 108109069);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1763450397 for  must be in the range [479643,108109069]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(17802);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-17802) + "'", int1 == (-17802));
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-450683), 0, 149158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 126482100, (long) 973682);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 123153344092200L + "'", long2 == 123153344092200L);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 900L, (java.lang.Object) (-1713170126));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-790000L), (-37993768L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-38783768L) + "'", long2 == (-38783768L));
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2304106);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2304106) + "'", int1 == (-2304106));
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-244597842500L), (java.lang.Object) (-372966672749901L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2658887L), (-5827584583260000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2658887 * -5827584583260000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 35, 168544800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5899068000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9798, 15, (-502));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-874263), (int) (byte) 10);
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-14227), (long) 5220530);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5234757L) + "'", long2 == (-5234757L));
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(169924231719L, (long) 47234);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 8026201161015246");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-687800606), 1174573, 312315, 976536);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 843737 + "'", int4 == 843737);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9999), 1126887300, (-84385200), (-68697));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-53553755) + "'", int4 == (-53553755));
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-106403849), (-950048943), (-85250028));
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-863620), 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44044620L) + "'", long2 == (-44044620L));
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 19907100, 27, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19907100 for  must be in the range [27,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 833, (long) 10552);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9719L) + "'", long2 == (-9719L));
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1942080), (-236129206));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1942080 * -236129206");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 108685080, 349956900, (-158));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 34386308, (-3469518), 6289801);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34386308 for hi! must be in the range [-3469518,6289801]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-210), 47525347, 3909, (-1763460000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 100, 22759878, 1119);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(168544800, 12100448, 3828, (-1999672));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(711148, (-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 711052 + "'", int2 == 711052);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-592), (java.lang.Object) (-299315787));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1505073, (-13068L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1492005L + "'", long2 == 1492005L);
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(17319362033L, (-322L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5576834574626");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 97090543L, (java.lang.Object) 695393);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(655, 628056570, (int) (byte) -1, (-503932));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(532427871, (-873812));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 532427871 * -873812");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(843737, (-954536506));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 843737 * -954536506");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-330040725), (-1763425054), (-521191424), 874263);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-5203027) + "'", int4 == (-5203027));
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 3499553);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3499553 + "'", int1 == 3499553);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1763460000, (-863620), (-687800606));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1763460000 for hi! must be in the range [-863620,-687800606]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(700, 98640, 188152939, 94401367);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3664729514250000L), (-1162088916120000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3664729514250000 * -1162088916120000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-171478832));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 171478832 + "'", int1 == 171478832);
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-708129348), 1765498096L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1057368748L + "'", long2 == 1057368748L);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(48014600L, (-1001404800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-48082050910080000L) + "'", long2 == (-48082050910080000L));
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 2440438, 2294400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-97970), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-97960) + "'", int2 == (-97960));
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-171469054), (-580601), 843887);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(3038, (-47524559), (-1718668813));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(6289491, 801902322);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 808191813 + "'", int2 == 808191813);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-32896872L), (long) (-3909));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32900781L) + "'", long2 == (-32900781L));
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-97960));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97960 + "'", int1 == 97960);
    }
}

