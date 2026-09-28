package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-9201L), (java.lang.Object) 9589215427000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-357591120), (java.lang.Object) 100962303);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 56, (-52), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56 for  must be in the range [-52,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 350000, 1715697100, (-1761479067));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-81725049), (-7633), (-312315));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-17935542210L), (long) (-9864));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17935552074L) + "'", long2 == (-17935552074L));
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-102842949149280L), (long) (-951492298));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -102842949149280 * -951492298");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1462491242L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1462491242) + "'", int1 == (-1462491242));
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) 100, (-106394130), (-15651849));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(30906162, 9700);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 30906162 * 9700");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1711678817), 970111L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1712648928L) + "'", long2 == (-1712648928L));
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-171478832), (java.lang.Object) 700L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1010L), (java.lang.Object) (-2308425L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 5148, 8467, 30906162);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5148 for hi! must be in the range [8467,30906162]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(14428, (-873));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12595644) + "'", int2 == (-12595644));
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1943430), (-450683L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1492747L) + "'", long2 == (-1492747L));
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1108968198273600L, (long) (-254849));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1108968198273600 * -254849");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1462491242), (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -14624912420");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(3499650, 586809815);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 590309465 + "'", int2 == 590309465);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1802640000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1802640000) + "'", int1 == (-1802640000));
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3499550L, (-11767907424L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11771406974L + "'", long2 == 11771406974L);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-537804800), (-1711678817), 619);
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-86), 1117972070);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -86 * 1117972070");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(376L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 376L + "'", long2 == 376L);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 9, (long) 1705);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15345 + "'", int2 == 15345);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 688);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 688 + "'", int1 == 688);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-18), (-18400), 576);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 46851, 1482832080, 155279264);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1482832281, 78821101293L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-77338269012L) + "'", long2 == (-77338269012L));
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(342580000L, (-14307));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4901292060000L) + "'", long2 == (-4901292060000L));
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9691), (-3499569), 2294400, (-96));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (short) 10, 64, (-3509649));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for  must be in the range [64,-3509649]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1277533), (int) (byte) -1, 3909, (-1454874));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-66534), 530216924, 908660727, (-1785587));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(17466817670L, (-10398));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-181619970132660L) + "'", long2 == (-181619970132660L));
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3909, (-76533), 973781, (-3034108));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-498646));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 498646 + "'", int1 == 498646);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 49, (-100459953), (-257397490));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2582129, (-257), 10001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2582129 for hi! must be in the range [-257,10001]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2284512L), 3499568L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1215056L + "'", long2 == 1215056L);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 9972, (-756956063145646L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-756956063135674L) + "'", long2 == (-756956063135674L));
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 533301015, (-1454523), (-17802));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 874263, 3038, 628056570);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(10200L, (long) (-3035028));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3045228L + "'", long2 == 3045228L);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 34386408);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(47525247);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47525247) + "'", int1 == (-47525247));
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 19907100, (long) 3045000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60617119500000L + "'", long2 == 60617119500000L);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 173189501403448L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(199359, (-65066), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-61117) + "'", int3 == (-61117));
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-69931974934150503L), (java.lang.Object) 2L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 10049, (-106412530));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [10049,-106412530]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(35032, (-1454874), (-1784714), (-1715160045));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-47525247), (long) (-10398));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 494167518306");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-317147951), 5148, (-254849));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -317147951 for hi! must be in the range [5148,-254849]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-204677760), (-7633));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-204685393) + "'", int2 == (-204685393));
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2103102), (-3044706741L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3042603639L + "'", long2 == 3042603639L);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1713170345), (-257));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1713170345 * -257");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-8209), (-3045000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 24996405000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1763450397), 68800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-121325387313600L) + "'", long2 == (-121325387313600L));
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1505073, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1505073L + "'", long2 == 1505073L);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(709908, (-11), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(122822368831956544L, (long) 2110080);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 122822368831956544 * 2110080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(147147648302611619L, 3611760);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 147147648302611619 * 3611760");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-158), (-97970), (-18));
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1712671034, 7739630, (-1763460000), (-1277533));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-812374164) + "'", int4 == (-812374164));
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 709908, (-1010L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 708898L + "'", long2 == 708898L);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1142), (-65066), (-173543860), (-1713170345));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-450683L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-450683) + "'", int1 == (-450683));
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 35000, 1999672);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 69988520000L + "'", long2 == 69988520000L);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-12595644), (long) 4479760);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8115884L) + "'", long2 == (-8115884L));
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(168472090, 709960);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 169182050 + "'", int2 == 169182050);
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1147540070), 9875, (-80));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1147540070 for  must be in the range [9875,-80]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1784800), 35000, 198112800);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 9764L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1943780, (-47524559));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-92377287293020L) + "'", long2 == (-92377287293020L));
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-18400), (-539633), 874263);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-18400) + "'", int3 == (-18400));
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(254849, (-97970));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 156879 + "'", int2 == 156879);
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-7097193207L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7097193207");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-349946851), 0, 1943780, (-1784714));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-10047));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10047) + "'", int1 == (-10047));
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-273456367L), (-102842949149280L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -273456367 * -102842949149280");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-188790000), (-1989700));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -188790000 * -1989700");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 46851, (-152286), (-146793024));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46851 for  must be in the range [-152286,-146793024]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(10L, 1491865899490L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1491865899480L) + "'", long2 == (-1491865899480L));
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-512632L), 1482832281);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-760147277873592L) + "'", long2 == (-760147277873592L));
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(709960, 254849, (-3398104));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(257397490, (-1713149062), 0, (-82215000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(34386308);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34386308) + "'", int1 == (-34386308));
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1710528757), 47525247, 1705);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 507005, (long) 14307);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 521312L + "'", long2 == 521312L);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-349956900), (-468));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-349957368) + "'", int2 == (-349957368));
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-312), (-450684), (-1715697100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-204677760), (long) 634344346);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -129836179807944960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-97), 1174462);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1174365 + "'", int2 == 1174365);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-151069740), (-147666024L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-298735764L) + "'", long2 == (-298735764L));
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(101L, (-3536656467266061711L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3536656467266061812L + "'", long2 == 3536656467266061812L);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-111), 709908, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) -1, 1174462, (-47524559), (-27826));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-46322273) + "'", int4 == (-46322273));
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2065028), (-9778), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10398, 1111, (-244802));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 549, (-96), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-6143290345686900L), (-1007695210654L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6142282650476246L) + "'", long2 == (-6142282650476246L));
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-300968758L), 9972);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3001260454776L) + "'", long2 == (-3001260454776L));
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2284622, (long) 100963445);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 230663307642790L + "'", long2 == 230663307642790L);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 8209);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1763460000, (long) (-580601));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1764040601L + "'", long2 == 1764040601L);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-620), (int) (short) 1, (-27));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-372984608215199L), 105019800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -372984608215199 * 105019800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(350035111L, (-1147540070));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-401679315779397770L) + "'", long2 == (-401679315779397770L));
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9070, (-14227), (-14308));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-34386408L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34386408) + "'", int1 == (-34386408));
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2658887L), (long) (-349957368));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-352616255L) + "'", long2 == (-352616255L));
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-17424), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17423) + "'", int2 == (-17423));
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9L, 872);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7848L + "'", long2 == 7848L);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1196950), (long) (-34386390));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35583340L) + "'", long2 == (-35583340L));
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(600832203);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-600832203) + "'", int1 == (-600832203));
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(48456408803446250L, (long) (-450684));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48456408803896934L + "'", long2 == 48456408803896934L);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(2582129, (-728));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1879789912) + "'", int2 == (-1879789912));
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(99835208L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99835208 + "'", int1 == 99835208);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2294419, 132, (-99440784));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2294419 for hi! must be in the range [132,-99440784]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1142, 152286);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 153428 + "'", int2 == 153428);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(155279264, 549, (-812374164), 47525347);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-704619699) + "'", int4 == (-704619699));
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-66534));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-66534) + "'", int2 == (-66534));
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-190043702986380L), 7018146835128L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -190043702986380 * 7018146835128");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-300551), (-3035028), 199359);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-300551) + "'", int3 == (-300551));
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(8209L, 34999199570L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34999191361L) + "'", long2 == (-34999191361L));
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(600842000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-600842000) + "'", int1 == (-600842000));
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-47524559), (-1760510603), 870);
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(8209);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8209) + "'", int1 == (-8209));
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(4861780167566135000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4861780167566135000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 26511433, 370758906605749440L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 26511433 * 370758906605749440");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 34386308, 2959176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101755137362208L + "'", long2 == 101755137362208L);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9864, (-949427270));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-949417406) + "'", int2 == (-949417406));
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-99));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 18, (long) (-12595644));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-226721592L) + "'", long2 == (-226721592L));
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 35, (long) (-1462491242));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-51187193470L) + "'", long2 == (-51187193470L));
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-236129206), (java.lang.Object) (-17292594123200L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) 1, (-100459953));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100459952) + "'", int2 == (-100459952));
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-158), 2304264);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2304106 + "'", int2 == 2304106);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 158);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 158 + "'", int2 == 158);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-498646), 210, (-14149));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-163115), 335272134, (-79));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 801902322, (-17899), 47525247);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-81725049), 600832203, (-853901));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -81725049 for hi! must be in the range [600832203,-853901]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-600842000), (-1715696283));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -600842000 * -1715696283");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1763460000, 3045000, 0, (-100459952));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-951493178), (-3398104), 9169);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -951493178 for hi! must be in the range [-3398104,9169]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1760510603), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1760510613L) + "'", long2 == (-1760510613L));
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-372966672749901L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -372966672749901");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-728), 0);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-97970), (-112700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11041219000L + "'", long2 == 11041219000L);
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2582129, (-951502398));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2456901935445342L) + "'", long2 == (-2456901935445342L));
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10047, (-1519551781741728000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 10047 * -1519551781741728000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-999900));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(445, 11, (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-9201L), 910L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8372910) + "'", int2 == (-8372910));
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-62086), 576);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-61510) + "'", int2 == (-61510));
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 7018146835128L, (java.lang.Object) 149158);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(34254574200L, (-7920L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34254582120L + "'", long2 == 34254582120L);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 489444, 0, (-188114696));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 201, 1111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 911 + "'", int3 == 911);
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3244801L, (long) 3045000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6289801L + "'", long2 == 6289801L);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(34386390, 9700, (-204677760));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 153428, 0, 489444);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9123345), 31508272, (-1713149062), 171469054);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22384927 + "'", int4 == 22384927);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1454524), 709908, (-9999));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(47234L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47234 + "'", int1 == 47234);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-204677760), 0, (-1760510603));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-5827584933216900L), 17319362042L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5827567613854858L) + "'", long2 == (-5827567613854858L));
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1738657, (-236129206), (-1196950), (-1450647));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2923493247072L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 2959176, 1620, (-8700000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2959176 for  must be in the range [1620,-8700000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(63702593L, (-1761479067));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-112210784083120731L) + "'", long2 == (-112210784083120731L));
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-47620), 973781);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 926161 + "'", int2 == 926161);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-873), (-3469518));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -873 * -3469518");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 7848L, (java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1713170126), (-47524559));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1713170126 * -47524559");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 10398, 48456409752000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48456409752010398L + "'", long2 == 48456409752010398L);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-18000), (-51), 420386456);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 420368508 + "'", int3 == 420368508);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(47234);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47234) + "'", int1 == (-47234));
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 504032, 1763460000, (-153251));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(10018356553040L, 281688465L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10018638241505L + "'", long2 == 10018638241505L);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 100, 1788088016);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1788087917 + "'", int3 == 1788087917);
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) '#', (long) 47620);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-47585L) + "'", long2 == (-47585L));
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 68800L, (java.lang.Object) 3398104);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 532426752, (-3469518), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-112185551037401280L), 3499570L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-112185551040900850L) + "'", long2 == (-112185551040900850L));
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 96, 31508272, (-1763460086));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(677162, 9864, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(910L, (-1462491242L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1462492152L + "'", long2 == 1462492152L);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(48456409752000000L, (long) 1620);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 48456409752000000 * 1620");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-300969900), (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1), 954811, (-61510));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hi! must be in the range [954811,-61510]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-8700000), (-84385200), 630000000, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1119, 1482832080, 9875);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1119 for hi! must be in the range [1482832080,9875]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1), (-1989524L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1989523L + "'", long2 == 1989523L);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(26511433, (-8209));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 26511433 * -8209");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1989687), (-108109069), (-2110080));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1221L, (long) 1999672);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2441599512L + "'", long2 == 2441599512L);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-372966672749901L), (-372984608205200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-745951280955101L) + "'", long2 == (-745951280955101L));
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 171469054, (-1943430), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-69931974934150503L), (long) (-10001));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69931974934140502L) + "'", long2 == (-69931974934140502L));
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-214183750), (-868), (-86));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-364) + "'", int3 == (-364));
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-34386308));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34386308 + "'", int1 == 34386308);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-53248), (-53816));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2865594368L + "'", long2 == 2865594368L);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-350035111), 600832203, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(920, (-620));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-570400) + "'", int2 == (-570400));
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 56, 1712671034, (-3509649));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2248540, (-1763469777));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3965232332375580L) + "'", long2 == (-3965232332375580L));
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-301848066), (-312315), (-934667), (-999900));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3075697651L, 970111);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2983768123909261L + "'", long2 == 2983768123909261L);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10047), (-152286));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1530017442 + "'", int2 == 1530017442);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-10049), (-952907498), (-106575000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-53248), (-171478832));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -53248 * -171478832");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-15963399L), 498646);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7960085057754L) + "'", long2 == (-7960085057754L));
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 874263, 9700, 18000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 874263 for  must be in the range [9700,18000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-236129206), (java.lang.Object) (-2065028));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 188152939);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 188152939L + "'", long2 == 188152939L);
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1990810, 47525247, (-700));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2716524810L), 1712671034);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4652513355229353540L) + "'", long2 == (-4652513355229353540L));
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(874263);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-874263) + "'", int1 == (-874263));
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1995555), 10047, (-10049));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-76533), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-76433) + "'", int2 == (-76433));
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1989700, 21064, 4479760);
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-27826), (-53248));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1481678848L + "'", long2 == 1481678848L);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(31508272, 880, 634, (-592));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1990710, (-951492297));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1990710 * -951492297");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1710528757), 18000, 0, (-364));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 9691, (-1763460086));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-111), 0, (-10049));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3499553, (-14227));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49788140531L) + "'", long2 == (-49788140531L));
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 532427871, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(507005, (-18000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 507005 * -18000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-153066), 0, 9691);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -153066 for  must be in the range [0,9691]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(299824116L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 299824116 + "'", int1 == 299824116);
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-111), (-1990710), (-47620));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -111 for  must be in the range [-1990710,-47620]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-34999191361L), 33358615189290L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -34999191361 * 33358615189290");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2923493247072L), (long) (-8700));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 25434391249526400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(310);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-310) + "'", int1 == (-310));
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 99835208);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(590309465, (-14227), 1738657, 3045000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2440438 + "'", int4 == 2440438);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 13, (-1712671034), (-13020480));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-600842000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 600842000 + "'", int1 == 600842000);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1470998628L, (-790000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1162088916120000L) + "'", long2 == (-1162088916120000L));
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(9L, 2865594368L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 25790349312");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-86), (-100490000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -86 * -100490000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-843852), 609053028);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 608209176 + "'", int2 == 608209176);
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-13020480), (-3328133821432L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -13020480 * -3328133821432");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1738657), (long) (-99440784));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 172893415187088L + "'", long2 == 172893415187088L);
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 299824116, (-76433), (-9797));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(198471500L, 9764L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 198481264L + "'", long2 == 198481264L);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-46322273), 420386456);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 374064183 + "'", int2 == 374064183);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9123345), (-10398));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -9123345 * -10398");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-82215000L), (java.lang.Object) (-47585L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1785587), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-47524559), 3499570L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-166315520939630L) + "'", long2 == (-166315520939630L));
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1277553L, (long) 944118497);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 945396050L + "'", long2 == 945396050L);
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2923493247072L), (long) 1119);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2923493245953L) + "'", long2 == (-2923493245953L));
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(533301015, 9864);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 533301015 * 9864");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 47234);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47234 + "'", int1 == 47234);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-442560), 189935540116053039L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-189935540116495599L) + "'", long2 == (-189935540116495599L));
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-10049));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10049 + "'", int1 == 10049);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(8209, (-853901), (-46322273), (-146793024));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-114080), (-1413255605480L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 161224199473158400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(100459953, (-184), 1517218488);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100459953 + "'", int3 == 100459953);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(629990222, (-8372910));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 629990222 * -8372910");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-27), (long) 1788088016);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1788088043L) + "'", long2 == (-1788088043L));
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-100L), 2248540);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-224854000L) + "'", long2 == (-224854000L));
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 335272154, (long) (-39585000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -13271748216090000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6717425867802L), (long) 47525347);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6717378342455L) + "'", long2 == (-6717378342455L));
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 0, 479643);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, 450, (-1142), 970000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 451 + "'", int4 == 451);
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(947642470, (-1760510603), 3045000, (-357591120));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1761479067), 709960, (-570400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 634);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 634 + "'", int1 == 634);
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(97770171L, (long) (-2005430));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99775601L + "'", long2 == 99775601L);
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(99835728L, (long) (-450684));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99385044L + "'", long2 == 99385044L);
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(783775357050000L, (-1990388));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 783775357050000 * -1990388");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2005430, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005438 + "'", int2 == 2005438);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-6915), 21674203800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-21674210715L) + "'", long2 == (-21674210715L));
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-8700L), 945396050L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -8224945635000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-14149), (-1738657), 176421201);
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(479643, (-300969892));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-300490249) + "'", int2 == (-300490249));
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-273471229583899974L), 304989469628640240L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31518240044740266L + "'", long2 == 31518240044740266L);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1989686), (java.lang.Object) 304461111);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1784800), 0, (-80));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-18048122527557L), (long) 99835208);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18048022692349L) + "'", long2 == (-18048022692349L));
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(22384927, 155279264);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 177664191 + "'", int2 == 177664191);
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-96), 2284622, 99440784, (-100459953));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(878171L, 498646);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 437896456466L + "'", long2 == 437896456466L);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(257397490, (-9999), (-35), 47620);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45091 + "'", int4 == 45091);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1717685969), (-498646), (-106403849));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1710528757), (-10), 108109069);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1710528757 for hi! must be in the range [-10,108109069]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(700099020854530L, (-198121500L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 700098822733030L + "'", long2 == 700098822733030L);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 351665413, 0, (-1713170345));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 351665413 for hi! must be in the range [0,-1713170345]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-184), 952907498, 1989700);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(14307, (-601337), 920);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-587951) + "'", int3 == (-587951));
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-100490000), (-949512368), (-15951520));
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) (-1712671034));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(420368508, (-221718630), (-620));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-23067514) + "'", int3 == (-23067514));
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1784800), 46930);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1737870) + "'", int2 == (-1737870));
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1491865899490L, 332622506970L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1491865899490 * 332622506970");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-21674210715L), (java.lang.Object) (-1616447619072L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(9, 2440438);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21963942 + "'", int2 == 21963942);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1530017442, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1530017442) + "'", int2 == (-1530017442));
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1144627548L), (long) (-100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1144627648L) + "'", long2 == (-1144627648L));
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-595172454895646199L), 39380L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -595172454895646199 * 39380");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(4000008832L, (-61432903456869L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 4000008832 * -61432903456869");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 609053028);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 609053028L + "'", long2 == 609053028L);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1879789912), 99L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-186099201288L) + "'", long2 == (-186099201288L));
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-61414968000000L), (java.lang.Object) 342580000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2110080), (-106575000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-108685080) + "'", int2 == (-108685080));
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 156879, (-868), (-9797));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 188152939, (-198122588L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -37277347214486132");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(7098300099L, 1023872308394916L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023879406695015L + "'", long2 == 1023879406695015L);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(22639478L, 479643);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10858867146354L + "'", long2 == 10858867146354L);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(198481264L, (long) (-81725049));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -16220891025981936");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 586809815);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1760510613L), (java.lang.Object) 73477967816424400L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 96, 19, (-15952400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1174462), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1174462) + "'", int2 == (-1174462));
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-17423), 5, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-9948500L), 634);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6307349000L) + "'", long2 == (-6307349000L));
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(35, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(99, 1802640000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 99 * 1802640000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(106575000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-106575000) + "'", int1 == (-106575000));
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 908660727, 688, 176421201);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3481738, (-2110080), (-592));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10018356553040L, (java.lang.Object) 102780L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-152286), 1482832281, 9875);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1370574L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1370574 + "'", int1 == 1370574);
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-8700), 872, (-1761479067));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 3481738);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3481738 + "'", int1 == 3481738);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-372966672741349L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-349957368), 8467);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -349957368 * 8467");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-570400), (-103393920L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58975891968000L + "'", long2 == 58975891968000L);
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 62, (-300969892), (-188790000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 62 for hi! must be in the range [-300969892,-188790000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 126482100, 1980223L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 250462763508300L + "'", long2 == 250462763508300L);
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(105019800L, 17887930641L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1878586898331691800L + "'", long2 == 1878586898331691800L);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9700), 18000, 169182050, (-312));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-949427270), (-2103102), (-11), (-1454874));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(9788, (-53248));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-521191424) + "'", int2 == (-521191424));
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3398104), 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16990520) + "'", int2 == (-16990520));
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(709790L, (-5802206573999812L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 709790 * -5802206573999812");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10047, (java.lang.Object) (-951493178));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1802640000), (-709960), (-16990520));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5827584583260000L), (-8372910));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -5827584583260000 * -8372910");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1), 655, 677162);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-208569710), 801902322, 176411200);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -208569710 for  must be in the range [801902322,176411200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-450683), (-9778), 1221);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -450683 for hi! must be in the range [-9778,1221]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1763460086);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1763460086) + "'", int1 == (-1763460086));
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1990388), (-1142), (-53248));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1990388 for hi! must be in the range [-1142,-53248]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-82215000), (long) (-35));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2877525000L + "'", long2 == 2877525000L);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1470988428), (-48014510));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1470988428 * -48014510");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 10100, (long) 590309465);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 590319565L + "'", long2 == 590319565L);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3481738, (java.lang.Object) (-317147951));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 843887, (java.lang.Object) (-1925124040));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-951493242L), 107222400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-102021388991020800L) + "'", long2 == (-102021388991020800L));
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-82215000L), (long) (-100460641));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8259371599815000L + "'", long2 == 8259371599815000L);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1548619507182706L), 10047);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1548619507182706 * 10047");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1763460000), 630000000, 833);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 9989, 99385044L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99375055L) + "'", long2 == (-99375055L));
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-87500552100L), (-949512368));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -87500552100 * -949512368");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-221718630), (long) 198112800);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-43925298601464000L) + "'", long2 == (-43925298601464000L));
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-688), 0, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-17935456080L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -17935456080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 709908, (-951492298), (-592));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 709908 for hi! must be in the range [-951492298,-592]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-789), (long) 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-738L) + "'", long2 == (-738L));
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 351665413);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 351665413 + "'", int1 == 351665413);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(911, (-1760510603), 299824116, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-592), (-300969892), 532427871);
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(10001, (-1989687));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 10001 * -1989687");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1763460086), (-7889211));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1755570876) + "'", int3 == (-1755570876));
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 532427871, 339160985, 3509649);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2440438, 3244801L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7918735662838L + "'", long2 == 7918735662838L);
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 973781, (-100490000), (-161986));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(420368508);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-420368508) + "'", int1 == (-420368508));
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-863620), (java.lang.Object) 1763460000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-19), 0, 176411200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(201);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-201) + "'", int1 == (-201));
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1209329613L), (long) 2304106);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1207025507L) + "'", long2 == (-1207025507L));
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(1878586898331691800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1878586898331691800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9, 9864, 310);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 577142280, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 577142281L + "'", long2 == 577142281L);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(198481264L, (long) 9989);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1982629346096L + "'", long2 == 1982629346096L);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-570400), (-27826), 1738657);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-5827567613854858L), (long) 350035111);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5827567963889969L) + "'", long2 == (-5827567963889969L));
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-15951520), (-10047));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15961567) + "'", int2 == (-15961567));
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-2219805000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2219805000L) + "'", long2 == (-2219805000L));
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 100, (-168644368L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-168644268L) + "'", long2 == (-168644268L));
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-168473100L), (long) (-729));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 122816889900");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-155277600), 100459953);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -155277600 * 100459953");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3075697651L, (long) (-789));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2426725446639");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1505073, 843887, (-15961567));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 257397490, (long) 3499650);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 260897140L + "'", long2 == 260897140L);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-6717378342455L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6717378342455");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2103102L), 99835208L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-209963625615216L) + "'", long2 == (-209963625615216L));
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1943430), 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-38868600) + "'", int2 == (-38868600));
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46930, 152286);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7146781980L + "'", long2 == 7146781980L);
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-873));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(350, (-15961567));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15961217) + "'", int2 == (-15961217));
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-412), (-580601), (-111));
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(35814600L, (-2110080));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-75571671168000L) + "'", long2 == (-75571671168000L));
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-999900), 709901, (-873));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1784800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1784800) + "'", int1 == (-1784800));
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-97), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-5802204807995135L), (long) 46920);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -5802204807995135 * 46920");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-46322273), 3536656467266061812L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -46322273 * 3536656467266061812");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) -1, 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1450732L, (-1207025507L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1205574775L) + "'", long2 == (-1205574775L));
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-14307), 10100, (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 2440438, (long) 1788087917);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4363717699987646");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 521312L, (java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-323521822L), 2284709);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-739153218419798L) + "'", long2 == (-739153218419798L));
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-53248), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 158, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 158 for hi! must be in the range [0,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-789), 920, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -789 for hi! must be in the range [920,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-84393900L), (-372984608215199L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372984692609099L) + "'", long2 == (-372984692609099L));
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 14227, 99385044L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99370817L) + "'", long2 == (-99370817L));
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-322L), (long) (-700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 378L + "'", long2 == 378L);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 21963942, (long) (-155277600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-133313658L) + "'", long2 == (-133313658L));
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 11, 0, 185867227);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-330040725), (-15952400), 1142);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10969865) + "'", int4 == (-10969865));
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(2936930686872L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2936930686872");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(97, (-1737870));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-168573390) + "'", int2 == (-168573390));
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-82215000), (-210), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-873000L), (long) 9864);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -8611272000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2103102), 4479760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2376658 + "'", int2 == 2376658);
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 34386390, 709960, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(7739630L, (long) (-1715159045));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1722898675L + "'", long2 == 1722898675L);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3561650, (-10398), 619);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 0, 532281952, (-728), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-314) + "'", int4 == (-314));
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 10001, (long) (-1999671));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1989670L) + "'", long2 == (-1989670L));
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(6289801L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6289801 + "'", int1 == 6289801);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 520, 3244012L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1686886240 + "'", int2 == 1686886240);
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-951502398), 188152939, 15345, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-312315));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 312315 + "'", int1 == 312315);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-37993868L), (long) 1761730);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -66934937071640");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(168579832, 2248540, 350035111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 168579832 + "'", int3 == 168579832);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(843852, 351);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 296192052 + "'", int2 == 296192052);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(709908, (-1454523));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 709908 * -1454523");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1370574, (-185867227), (-2304264));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1370574 for  must be in the range [-185867227,-2304264]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1715697100), (java.lang.Object) 99835208);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 833, (-1713170126), 30906162);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1174365, (-372966672741349L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372966671566984L) + "'", long2 == (-372966671566984L));
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-17802));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17802 + "'", int1 == 17802);
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3045000, (-17424), 1943430);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(98049000000L, (long) 34386408);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3371552917992000000L + "'", long2 == 3371552917992000000L);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3499568L, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1786407669), 586809815, 2376658);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-10001));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10001) + "'", int1 == (-10001));
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 21963942, (-9778), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-330040725), (-412), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -330040725 for hi! must be in the range [-412,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1664, 576);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 958464 + "'", int2 == 958464);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10552, (long) (-1784714));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18832302128L) + "'", long2 == (-18832302128L));
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 507005, 0, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(783775357050000L, (long) 153251);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 783775357050000 * 153251");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(47234L, (-34386308));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1624202872072L) + "'", long2 == (-1624202872072L));
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 600842000, (-173543841), (-951492298));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2110080), 17802, (-1713170345));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2110080 for hi! must be in the range [17802,-1713170345]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-99964856L), 1370574L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-101335430L) + "'", long2 == (-101335430L));
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-700), (-600832203), 1712671034);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(168544800, 168472090, (-9719));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3034108), (-952907498), 7739630);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2304106, (java.lang.Object) (-1582215500L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1450647), 0, (-34386390));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-3328133821432L), (long) (-236129206));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3327897692226L) + "'", long2 == (-3327897692226L));
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1174462, (-300490249));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-299315787) + "'", int2 == (-299315787));
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(629990222, (-38868600), 351655538);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 239466083 + "'", int3 == 239466083);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-34200490L), (java.lang.Object) 1718668813L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1462491242L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1462491242L) + "'", long2 == (-1462491242L));
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(121054688, (-570400), 450);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-536575) + "'", int3 == (-536575));
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1925124040), 2959176, (-13020480));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1925124040 for hi! must be in the range [2959176,-13020480]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', 18, 0, (-15952400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-100460641), 708898L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -71216347483618");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1277553L, (java.lang.Object) 34254574200L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 5, (-17935552074L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -89677760370");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1205574775L), (-372984608215199L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1205574775 * -372984608215199");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(66124332L, (-155757153L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 221881485L + "'", long2 == 221881485L);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-106412530), (-84385200), 1990810);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -106412530 for  must be in the range [-84385200,1990810]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1), 586809815);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-586809815) + "'", int2 == (-586809815));
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9169, 533301015);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 533310184 + "'", int2 == 533310184);
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-323521822L), (java.lang.Object) 111L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1174462, (-3038), (-8209));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1174462 for  must be in the range [-3038,-8209]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-620));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 620 + "'", int1 == 620);
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1470988428), (-163115), (-349946851));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-51), (-1763450397), (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-198121500L), (java.lang.Object) 3996818940L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1990710, 47525347, 26511433, 870);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 15345, (-5802204811239936L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 15345 * -5802204811239936");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-949512368), (-536575));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-950048943) + "'", int2 == (-950048943));
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(8990L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8990 + "'", int1 == 8990);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-132), (-100), 503932);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(53446626006960990L, (long) (-1989861));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 53446626006960990 * -1989861");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-350035111));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-350035111) + "'", int1 == (-350035111));
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(374064183);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-374064183) + "'", int1 == (-374064183));
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 56611, 99440784, 2284622);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(620L, (long) (-300551));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-299931L) + "'", long2 == (-299931L));
    }
}

