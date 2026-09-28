package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05501");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-531793), 159779046);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 159247253 + "'", int2 == 159247253);
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05502");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2959176, 13584346);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2959176 * 13584346");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05503");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-173543860), 46895);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -173543860 * 46895");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05504");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(201, 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05505");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-100963131), (-10969865), 353600846);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05506");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-317147951), 61432696953477L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -317147951 * 61432696953477");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05507");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1470998628L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1470998628 + "'", int1 == 1470998628);
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05508");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2376658, (-4665), (-451));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05509");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-10969865));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10969865) + "'", int1 == (-10969865));
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05510");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-7098280399L), (java.lang.Object) 16348845600L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05511");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-13020480), (-203556918L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-216577398L) + "'", long2 == (-216577398L));
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05512");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 105019800L, (java.lang.Object) 351375808265460L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05513");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(6237554960000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6237554960000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05514");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(85229052L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 85229052 + "'", int1 == 85229052);
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05515");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-122484040), (long) 3469518);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-125953558L) + "'", long2 == (-125953558L));
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05516");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-22112703), 13986, (-1718668813));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05517");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9864), 0, 3438639, (-4665));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05518");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-57378098), (long) 21963942);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1260249216542316L) + "'", long2 == (-1260249216542316L));
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05519");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3244801L, (-729L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3245530L + "'", long2 == 3245530L);
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05520");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(46930, 9999);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56929 + "'", int2 == 56929);
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05521");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 76433, 171459354, 349432740);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05522");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(988966305600L, 8270L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 988966297330L + "'", long2 == 988966297330L);
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05523");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 97, 66747848L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66747945L + "'", long2 == 66747945L);
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05524");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-6129), 630000000, (-357608543), (-15952400));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-53318417) + "'", int4 == (-53318417));
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05525");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(152286, 350035111, (int) '#', (-951493178));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05526");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1442617128743874624L, 131567583380400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1442485561160494224L + "'", long2 == 1442485561160494224L);
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05527");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1), (-1761176514), (-1278262));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05528");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 34386308, 14308, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05529");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1893305L, (long) (-314));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1893619L + "'", long2 == 1893619L);
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05530");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(2529996135906080L, (long) 32482072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2529996135906080 * 32482072");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05531");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-300551), 0, 5220530);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -300551 for hi! must be in the range [0,5220530]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05532");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-944117276), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05533");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-586809815), 168579832, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05534");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1010899), (-601292683), 488360);
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05535");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-102021388991020800L), (long) (-64));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6529368895425331200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05536");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 976536, (-87426300));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [976536,-87426300]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05537");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-949427270), 1982629346096L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -949427270 * 1982629346096");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05538");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-27826), 1711);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47610286) + "'", int2 == (-47610286));
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05539");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-9537L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9537) + "'", int1 == (-9537));
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05540");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 609053028L, (java.lang.Object) (-64244));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05541");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(219899, 217526);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 219899 * 217526");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05542");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 11862880, 6015);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 71355223200L + "'", long2 == 71355223200L);
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05543");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-524160), 48014600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-25167332736000L) + "'", long2 == (-25167332736000L));
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05544");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-394648137), 2384403, (-312315));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05545");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1519234035), (java.lang.Object) (-274264575L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05546");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) -1, (long) 111);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110L + "'", long2 == 110L);
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05547");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 38868600, 669, 99835208);
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05548");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1106892L, 199879);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 221244466068L + "'", long2 == 221244466068L);
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05549");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-254849), 174629, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05550");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 904180783);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05551");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 532427871, 874089, (-1761176514));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05552");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 619, (-99370817), 2376658);
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05553");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2294419), (long) (-86130));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2208289L) + "'", long2 == (-2208289L));
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05554");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1766617203), 293357, (int) 'a', (-688));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05555");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1738657, (-5203027), 101);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05556");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-68697), (-173543841), (-1763450397), 4485377);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-173612538) + "'", int4 == (-173612538));
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05557");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-168572690), 1943780, 14307000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -168572690 for  must be in the range [1943780,14307000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05558");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-949417406), (long) (-168573390));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1117990796L) + "'", long2 == (-1117990796L));
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05559");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 257397490, 920);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [257397490,920]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05560");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 489951, 9169, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05561");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-4027424899L), (long) 85229052);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4112653951L) + "'", long2 == (-4112653951L));
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05562");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 3461473L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05563");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(586810735, 44, 5758, 2294722);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 835739 + "'", int4 == 835739);
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05564");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 504032, (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05565");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 494910, 0, 339160985);
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05566");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 399618, (long) 970111);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1369729L + "'", long2 == 1369729L);
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05567");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1761394244, (-2304264), 302176508, 628056570);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 455569728 + "'", int4 == 455569728);
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05568");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(10999L, 758468816);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8342398507184L + "'", long2 == 8342398507184L);
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05569");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-2294419), (-97970), (-3034108));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2294419 for  must be in the range [-97970,-3034108]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05570");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-843887));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 843887 + "'", int1 == 843887);
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05571");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2295252, (-2005430), (-100490000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05572");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1763425054), (-868), (-1753701626));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05573");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1413255605480L), (long) 105975170);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1413149630310L) + "'", long2 == (-1413149630310L));
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05574");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 1450647, 3499585);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [1450647,3499585]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05575");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-330040725), 1686886240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05576");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 9999, 14343, 1597671);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9999 for  must be in the range [14343,1597671]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05577");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 1482832080);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05578");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-952907498), 999000207);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-951954787753852086L) + "'", long2 == (-951954787753852086L));
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05579");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-19), 1715156650);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -19 * 1715156650");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05580");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 168573390, (int) (byte) 10, (-2078227400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05581");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1925124040), (-9864));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1925133904) + "'", int2 == (-1925133904));
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05582");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(8, (-789467264));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 8 * -789467264");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05583");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 97180281, 45091, 711052);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05584");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 5148L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5148L) + "'", long2 == (-5148L));
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05585");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-601459554476924255L), 73477967816424400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-527981586660499855L) + "'", long2 == (-527981586660499855L));
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05586");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-366104800L), (long) (-1234120));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 451817255776000L + "'", long2 == 451817255776000L);
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05587");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-38164L), (-949512368));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36237190012352L + "'", long2 == 36237190012352L);
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05588");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 638821068, (java.lang.Object) (-1790077778L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05589");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1505073, (-222718530));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1505073 * -222718530");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05590");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 100449343, (-853901), (-4710915));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05591");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-18000), (-349957368), (-68277286));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-281698083) + "'", int3 == (-281698083));
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05592");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 18000, (java.lang.Object) (-5827586045757014L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05593");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 339458290L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 339458290L + "'", long2 == 339458290L);
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05594");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 157062400L, (java.lang.Object) 135289083606L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05595");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-10398), 0, 14307000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05596");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9989), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05597");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-148474462), 48456411318636963L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48456411170162501L + "'", long2 == 48456411170162501L);
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05598");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-22112703), (-173543841));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -22112703 * -173543841");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05599");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 868, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05600");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-286652166039938160L), 668094673L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -286652166039938160 * 668094673");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05601");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1953880), 9778, (-300490249));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05602");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-5237327346300000L), (long) 590309473);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5237326755990527L) + "'", long2 == (-5237326755990527L));
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05603");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1090328), 232883752, (-61117), 848047583);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 231793424 + "'", int4 == 231793424);
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05604");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 149158, 3864032676758232702L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 149158 * 3864032676758232702");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05605");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-100459952), (long) 301848066);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -30323642221652832");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05606");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 843887, (java.lang.Object) (-15961567));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05607");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-970000), 988966297330L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 988965327330L + "'", long2 == 988965327330L);
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05608");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-6168898053733568L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05609");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6983209393712L), (long) 99);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6983209393613L) + "'", long2 == (-6983209393613L));
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05610");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 95336384, 10, 47620);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05611");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(107222400L, 2983768123909261L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2983768016686861L) + "'", long2 == (-2983768016686861L));
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05612");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 99593070, (-10969865), (-1967089));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05613");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1760510603), 954811, 95781);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05614");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1898020700L), (java.lang.Object) 7739630);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05615");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 1, 22384927, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05616");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3002945109L, (-3514807760678400L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3002945109 * -3514807760678400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05617");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1738657), (-16919594), 2658977);
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05618");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-100490000), 1481377506, 80635680);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -100490000 for hi! must be in the range [1481377506,80635680]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05619");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-349957368), (-586809815));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -349957368 * -586809815");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05620");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1789774L, (java.lang.Object) 19559583600L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05621");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-372984608215199L), 97770180L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -372984608215199 * 97770180");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05622");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-812374164));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 812374164 + "'", int1 == 812374164);
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05623");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1992141290L, (-169871L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -338407033073590");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05624");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-158847200L), (-1183824310394950L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1183824151547750L + "'", long2 == 1183824151547750L);
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05625");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-19), 18000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17981 + "'", int2 == 17981);
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05626");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(351665413, (-99370817), (-323442480), 1517218488);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 252294596 + "'", int4 == 252294596);
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05627");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-210), 80, 304461111);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05628");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 507005, (long) 339161818);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 339668823L + "'", long2 == 339668823L);
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05629");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-9797), 0);
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05630");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-300969900L), 3045228L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-916521966637200L) + "'", long2 == (-916521966637200L));
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05631");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 17287395, (-539633));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9328848826035L) + "'", long2 == (-9328848826035L));
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05632");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2078213173L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2078213173) + "'", int1 == (-2078213173));
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05633");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 870, (long) (-17802));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16932L) + "'", long2 == (-16932L));
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05634");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(24429098, 3909, 176411200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24429098 + "'", int3 == 24429098);
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05635");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 176411220, (-232883752), 350035111);
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05636");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1052739670L, (-105840302932201213L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105840301879461543L) + "'", long2 == (-105840301879461543L));
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05637");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1838776));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1838776 + "'", int1 == 1838776);
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05638");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-77228082932L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -77228082932");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05639");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 49, 841, 9972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for  must be in the range [841,9972]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05640");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 0, 868, 819000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05641");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1631435040L, (-153909051877008000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1631435040 * -153909051877008000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05642");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-30352410), (-1999672), (-2304264));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05643");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-84385200), 0, 1765497216);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1681112017 + "'", int3 == 1681112017);
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05644");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-101), (-1766617203), 9972);
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05645");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(2281487435712000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2281487435712000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05646");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(526667328L, (long) (-1715149542));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1188482214L) + "'", long2 == (-1188482214L));
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05647");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1761730);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1761730) + "'", int1 == (-1761730));
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05648");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 6407448057348624L, (java.lang.Object) 48456409752000000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05649");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1990710L, (-1548619507182706L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1990710 * -1548619507182706");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05650");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(300969892, (-9989), (-4485350));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05651");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-81725049), 1990710, 410609746, (-6289801));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05652");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1454523, 101008454, (-1470988428));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05653");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(3909, (-728));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3181 + "'", int2 == 3181);
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05654");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 601423, 159779046, (-4446561));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 601423 for  must be in the range [159779046,-4446561]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05655");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-58976258072827L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -58976258072827");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05656");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 86130, (java.lang.Object) (-951954787753852086L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05657");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(100963131, 711148, (-148474462), 2150267);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-48950451) + "'", int4 == (-48950451));
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05658");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-570400), 129948442624L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 129947872224L + "'", long2 == 129947872224L);
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05659");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2712657551841822L), (-301424041786728630L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 298711384234886808L + "'", long2 == 298711384234886808L);
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05660");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-148474462), 198481264L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 50006802L + "'", long2 == 50006802L);
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05661");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1126887300, (-18), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05662");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1517218488);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1517218488) + "'", int1 == (-1517218488));
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05663");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-9797), 1718668813);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16837798360961L) + "'", long2 == (-16837798360961L));
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05664");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(594427L, (long) 1943780);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1155435314060L + "'", long2 == 1155435314060L);
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05665");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-66534), (-101931854));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -66534 * -101931854");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05666");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-580601));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05667");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2922338), (-1548000), (-963979));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2922338 for hi! must be in the range [-1548000,-963979]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05668");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-873812));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05669");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-30829218210000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -30829218210000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05670");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-10969865), 4479918, 14307);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05671");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-4506), (-1989861), 63244232);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4506) + "'", int3 == (-4506));
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05672");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-185867227), (-17362154), 0, 185867148);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 168504917 + "'", int4 == 168504917);
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05673");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-113827897), 45091, 168573390);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05674");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3652836L, (java.lang.Object) (-46322273));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05675");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-14308), 176421201, 709960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05676");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9989), 2248540, 22199491);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05677");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1794561), 8700, 2284622, (-76533));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05678");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-163115), 198112800, (-592169827));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05679");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-85342), 709790, (-47525247));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -85342 for  must be in the range [709790,-47525247]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05680");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-83850), (-89178884), (-299785985));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -83850 for hi! must be in the range [-89178884,-299785985]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05681");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1454523, 2384403, 489444);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05682");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-8683), 35814600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -310978171800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05683");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2065028), (java.lang.Object) 198471500L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05684");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2959086L), 524160);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1551034517760L) + "'", long2 == (-1551034517760L));
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05685");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-300969892), (-15805100), (-297481271));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05686");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-949417406), 970111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -949417406 * 970111");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05687");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1206090960L, (long) 85229052);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 102793989146569920");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05688");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1481678848L, (-299931L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1481378917L + "'", long2 == 1481378917L);
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05689");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(880, (-949427270));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-949426390) + "'", int2 == (-949426390));
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05690");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 874263, 46930);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41029162590L + "'", long2 == 41029162590L);
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05691");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-92377287293020L), (-97146319L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-92377190146701L) + "'", long2 == (-92377190146701L));
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05692");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-677162), (-11), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05693");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-164837960), 37948040, 0, 1765497216);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1638607297 + "'", int4 == 1638607297);
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05694");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-299785985), (java.lang.Object) 5220530);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05695");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(8209L, 1023872308394916L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023872308403125L + "'", long2 == 1023872308403125L);
    }

    @Test
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05696");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-299552), (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-299587L) + "'", long2 == (-299587L));
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05697");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(112110, 351);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39350610 + "'", int2 == 39350610);
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05698");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4027424899L), (-3480228));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14016356901396972L + "'", long2 == 14016356901396972L);
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05699");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-100459953));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100459953) + "'", int1 == (-100459953));
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05700");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 157773616, (long) (-3038));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-479316245408L) + "'", long2 == (-479316245408L));
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05701");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-211952854620L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -211952854620");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05702");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2308425L), 108345572921808L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2308425 * 108345572921808");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05703");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(188152939, (-214183750), (-10049));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-26020763) + "'", int3 == (-26020763));
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05704");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(494910, 0, (-210), (-10689680));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05705");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-8536194), (-16919594), (-15805100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -8536194 for hi! must be in the range [-16919594,-15805100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05706");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-47525247), 12487942);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-593492528071674L) + "'", long2 == (-593492528071674L));
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05707");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-129148057), 14343, 30906162);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25311043 + "'", int3 == 25311043);
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05708");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-106462890));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-106462890) + "'", int1 == (-106462890));
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05709");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(370758906605749440L, (long) (-54948));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 370758906605694492L + "'", long2 == 370758906605694492L);
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05710");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 310, 350000, (-1715697100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05711");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-301838202), 298711384234886808L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -301838202 * 298711384234886808");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05712");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1463930970), 4231920, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05713");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-84756249), 0);
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05714");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 3045000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05715");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(21674203800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 21674203800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05716");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-64), 156879, 32482072);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -64 for hi! must be in the range [156879,32482072]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05717");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1989686L), (long) (-82215000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-84204686L) + "'", long2 == (-84204686L));
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05718");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-47620), (-47585), (-16990520), (-34386408));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05719");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 66747848, 14307000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05720");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-48014510), 335272154, 619);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05721");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(168504917, (-521191424));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 168504917 * -521191424");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05722");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 344919305, (-18048123007200L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 344919305 * -18048123007200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05723");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(33032396199L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05724");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 399618, (java.lang.Object) (-188114696));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05725");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-44), 479643);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21104292) + "'", int2 == (-21104292));
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05726");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 7739630, (-9778));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05727");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 709790, 1505073, 56929);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05728");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-489951), (-61510));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-551461) + "'", int2 == (-551461));
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05729");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-970000), 0, (-700));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05730");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(868, (-100), (-63864));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05731");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(19324562385800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 19324562385800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05732");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-512632L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05733");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-570400), 455569728, (-204298726));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -570400 for  must be in the range [455569728,-204298726]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05734");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-5), (-3532739400000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17663697000000L + "'", long2 == 17663697000000L);
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05735");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(33032396199L, (-48512377));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1602480057619255023L) + "'", long2 == (-1602480057619255023L));
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05736");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-281698083), 539633, 10049, (-1989524));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05737");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 96, 46831);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [96,46831]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05738");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-853901));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 853901 + "'", int1 == 853901);
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05739");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(5717880000000L, (-738109629742464000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-738103911862464000L) + "'", long2 == (-738103911862464000L));
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05740");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(99835208, (-8209), (-314));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1816) + "'", int3 == (-1816));
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05741");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1784714), 2304106, 111, (-708129449));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05742");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(638821068, 1989861);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640810929 + "'", int2 == 640810929);
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05743");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1597671, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 159767100L + "'", long2 == 159767100L);
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05744");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-210), (-302176508));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -210 * -302176508");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05745");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(48456408803896934L, 4004130654049726L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44452278149847208L + "'", long2 == 44452278149847208L);
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05746");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-708510), (-10001), 126482100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 125783592 + "'", int3 == 125783592);
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05747");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(299315787, 2536427);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 299315787 * 2536427");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05748");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-6564960), 711148, (-107726638));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05749");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 954811, (-952907498));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-909846561072878L) + "'", long2 == (-909846561072878L));
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05750");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-26020763), (-10001));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 260233650763L + "'", long2 == 260233650763L);
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05751");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (int) (short) 100, (-76433));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05752");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-412), (-635218511), 32482072, (-302176508));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05753");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-38164L), (long) (-2110080));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 80529093120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05754");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(532427871, 970000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 532427871 * 970000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05755");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3598, (-80), (-3480386), (-1713170135));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05756");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3224329627922L, (-66747848L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3224396375770L + "'", long2 == 3224396375770L);
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05757");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(7098300099L, (long) 4485377);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7102785476L + "'", long2 == 7102785476L);
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05758");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-310), 304461111, (-12595644));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05759");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 351665413, 3499650, 2304106);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05760");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(66747848, 199359);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66947207 + "'", int2 == 66947207);
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05761");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1989861, 0, (-57378098));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05762");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 2294722);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2294722 + "'", int1 == 2294722);
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05763");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(76433, 97180281, (-1763460086));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05764");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 97960);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97960 + "'", int1 == 97960);
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05765");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 609053028, (-300551), 3909);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05766");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 9, (-15359825779200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15359825779209L + "'", long2 == 15359825779209L);
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05767");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1715156650), 63780902, (-580601));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05768");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 351665413, 634, (-357608543));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05769");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1000), 1802640001, (-1784800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05770");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-78346), 49, 299824116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 299745722 + "'", int3 == 299745722);
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05771");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 450, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4500L + "'", long2 == 4500L);
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05772");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-53816));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53816 + "'", int1 == 53816);
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05773");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 711148);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05774");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1981541), (long) (-4446561));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 8811042930501");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05775");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1215056L, 285247083614292030L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 285247083615507086L + "'", long2 == 285247083615507086L);
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05776");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 873, (-146793024), 66747848);
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05777");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 8700, 507005, 1638607297);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8700 for  must be in the range [507005,1638607297]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05778");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(999000207, (-108109069));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 890891138 + "'", int2 == 890891138);
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05779");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-52), (-708510), 15345);
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05780");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10000, (-4446561), (-185867227));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05781");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 76433, (java.lang.Object) 11862880);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05782");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(199359);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-199359) + "'", int1 == (-199359));
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05783");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1763450397), 304461111, (-297481271));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1763450397 for hi! must be in the range [304461111,-297481271]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05784");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-257), (-1788088016), (-9737812));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05785");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(440284, 32482053);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 440284 * 32482053");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05786");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(948554270L, (-20199512268L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21148066538L + "'", long2 == 21148066538L);
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05787");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1710528757), (-767464499), (-297481271));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1710528757 for  must be in the range [-767464499,-297481271]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05788");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-14428), (long) 890891138);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 890876710L + "'", long2 == 890876710L);
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05789");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1139, 15345, (-148474462));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05790");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 342580000L, (java.lang.Object) (-106575000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05791");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-236129206), 152257, (-349946851));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05792");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1638607297, 34386390);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56345789571487830L + "'", long2 == 56345789571487830L);
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05793");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-708510), (-3035028), 212411343);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-708510) + "'", int3 == (-708510));
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05794");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(3909, 1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4909 + "'", int2 == 4909);
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05795");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(159247253);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-159247253) + "'", int1 == (-159247253));
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05796");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1933192405970L), (long) (-489951));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 947169552497407470L + "'", long2 == 947169552497407470L);
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05797");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-17864), (-1090328));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -17864 * -1090328");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05798");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 126547938, (-2235115L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -282849194442870");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05799");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-30032076683980800L), (java.lang.Object) 26511433);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05800");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-4485350), 161986);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-726563905100L) + "'", long2 == (-726563905100L));
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05801");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(349432740, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 349432740 * -101");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05802");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-155277600), 17319361684L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17474639284L) + "'", long2 == (-17474639284L));
    }

    @Test
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05803");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(853932);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-853932) + "'", int1 == (-853932));
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05804");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 17981, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05805");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1010899), (java.lang.Object) 920);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05806");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5772L), (-1207195378L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6967931721816L + "'", long2 == 6967931721816L);
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05807");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-78346), (-84393900L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6611924489400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05808");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(48456411170162501L, 363757);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 48456411170162501 * 363757");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05809");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1761730, (-8467));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1753263 + "'", int2 == 1753263);
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05810");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1755570876), (-5203027));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9134282668241652L + "'", long2 == 9134282668241652L);
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05811");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(7355177877L, 3499550L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 25739812739455350");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05812");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1762676017, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1762676017 + "'", int2 == 1762676017);
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05813");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(4004130654049726L, (-745951280955101L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3258179373094625L + "'", long2 == 3258179373094625L);
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05814");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1989686), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05815");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 628056570, 47525247, (-65066));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05816");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-668113249937923741L), 1023872308938115L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -668113249937923741 * 1023872308938115");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05817");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-9261199670400L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -9261199670400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05818");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-416614049L), (long) 4479918);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1866396777167982");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05819");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(339161818, 288303652, 169182050);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05820");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-582302736L), (-1943430));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1131664606224480L + "'", long2 == 1131664606224480L);
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05821");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(841, 400795139, (-10), 168573390);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 63649178 + "'", int4 == 63649178);
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05822");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-317147951), 299795783, 1289151020);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05823");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-85342), 5899809, (-43048525), 9778);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-37243837) + "'", int4 == (-37243837));
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05824");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(9989, (-300490249));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 9989 * -300490249");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05825");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-2005430));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2005430) + "'", int1 == (-2005430));
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05826");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 46895);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46895 + "'", int1 == 46895);
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05827");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(71700, 4479760, (-450684));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05828");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-82211962L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05829");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(99L, (-1989679));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-196978221L) + "'", long2 == (-196978221L));
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05830");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(18980207);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18980207) + "'", int1 == (-18980207));
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05831");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 201354638, 7739630, (-863620));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05832");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-609053028), 487551322, 911);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -609053028 for  must be in the range [487551322,911]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05833");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1761394244, (long) 868);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1761393376L + "'", long2 == 1761393376L);
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05834");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 26511433, 908660727, (-2581684));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26511433 for hi! must be in the range [908660727,-2581684]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05835");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1205574775L, (long) (-1753701626));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2959276401L + "'", long2 == 2959276401L);
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05836");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1277533), 0, 34385857);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 33108325 + "'", int4 == 33108325);
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05837");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 310926178L, (java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05838");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 2065033, (-34013868722L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34015933755L + "'", long2 == 34015933755L);
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05839");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-65066), (-10221043), (-14227), (-1147540070));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05840");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-153251), 36237190012352L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36237190165603L) + "'", long2 == (-36237190165603L));
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05841");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 99835728, (-954536506), 176421201);
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05842");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 174629, 99835728, (-1766617203));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05843");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-301550777882109756L), (java.lang.Object) 102842602671947L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05844");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-153251), (-1715159045), 353600846, (-4665));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05845");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2536427, 32482053, (-1234120));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05846");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-597509), 7090009575436800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -597509 * 7090009575436800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05847");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1794561, (-17935552074L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32186442265469514L) + "'", long2 == (-32186442265469514L));
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05848");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-7633), 1715159045);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13091808990485L) + "'", long2 == (-13091808990485L));
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05849");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(20294940000L, (long) 3034108);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61577039813520000L + "'", long2 == 61577039813520000L);
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05850");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-166394184979275000L), (long) 677162);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -166394184979275000 * 677162");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05851");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 843887, 152286, (-64));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05852");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1988776));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1988776 + "'", int1 == 1988776);
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05853");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 849755880L, (java.lang.Object) (-25167332736000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05854");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1491865419927L), (java.lang.Object) 1023872306159452L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05855");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-9797), (-6143313703657988L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6143313703648191L + "'", long2 == 6143313703648191L);
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05856");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-112110), 293357, 4479918);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4074452 + "'", int3 == 4074452);
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05857");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 219899, 1705, (-1761078660));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05858");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 231190314, (-323521822L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-92331508L) + "'", long2 == (-92331508L));
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05859");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(171191921969120L, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1711919219691200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05860");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 210, (-35));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7350L) + "'", long2 == (-7350L));
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05861");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1990388, 15345);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005733 + "'", int2 == 2005733);
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05862");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(32482072, (-97970), (-7633), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-6960) + "'", int4 == (-6960));
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05863");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9864, (java.lang.Object) 3499543L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05864");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-3398104), (-18000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05865");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-468), (-9), (-442560));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -468 for  must be in the range [-9,-442560]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05866");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 197);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 197L + "'", long2 == 197L);
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05867");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(14344128L, (long) (-164837960));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2364456797498880L) + "'", long2 == (-2364456797498880L));
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05868");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1762676017));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1762676017) + "'", int1 == (-1762676017));
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05869");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1234120), (java.lang.Object) 4861780167566135000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05870");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(709901);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-709901) + "'", int1 == (-709901));
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05871");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 201);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-201L) + "'", long2 == (-201L));
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05872");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-1755920876), (-2065033));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05873");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3828, 3611760, (-201));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05874");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 124486545);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 124486545 + "'", int1 == 124486545);
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05875");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(176421201, 257397490, 4485377);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05876");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 1492005L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05877");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-655556), (-53816), (-79));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05878");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1990710), 101, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05879");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(231793424, 339161818, 54920);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05880");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-38868600), (-9286460), (-171478832));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05881");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-221979522200L), (long) 848047583);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -221979522200 * 848047583");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05882");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-5588424), 1530017442, 257572119);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05883");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1111L, (java.lang.Object) (-3999997833L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05884");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 608209176, (-15961567), (-30352410));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05885");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-16987813610L), 996654445261089318L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -16987813610 * 996654445261089318");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05886");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 100963131, (-688), (-1990388));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05887");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(315624238L, (-1492747L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 317116985L + "'", long2 == 317116985L);
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05888");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1762675999);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1762675999) + "'", int1 == (-1762675999));
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05889");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1117972070, 106575000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1224547070 + "'", int2 == 1224547070);
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05890");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1893305L, 1126887300L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1128780605L + "'", long2 == 1128780605L);
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05891");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-9737812), 870, 353600846);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9737812 for  must be in the range [870,353600846]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05892");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-149158), (-1147540070), 3499553, (-6564960));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05893");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 4479918, (long) 140869042);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145348960L + "'", long2 == 145348960L);
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05894");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1898020700L), (java.lang.Object) 49);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05895");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-590309465), 73381944, 353600846);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -590309465 for  must be in the range [73381944,353600846]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05896");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(947642470, (-633115409));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 314527061 + "'", int2 == 314527061);
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05897");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 171469054, 1794561);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05898");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-40322560), (-9123345), (-204685393));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -40322560 for hi! must be in the range [-9123345,-204685393]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05899");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(100978790, (-300979678), 14227);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-200015116) + "'", int3 == (-200015116));
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05900");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6142281622334725L), 1142);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7014485612706255950L) + "'", long2 == (-7014485612706255950L));
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05901");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 293357, 0, 296192052);
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05902");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(234356, 455569728, (-302176508), 105975160);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 47652415 + "'", int4 == 47652415);
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05903");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1454524), 1370574, (-868));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1454524 for hi! must be in the range [1370574,-868]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05904");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 101008454, 66747945L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 167756399L + "'", long2 == 167756399L);
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05905");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2159885535598L), (-29047620));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2159885535598 * -29047620");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05906");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(157062400L, (long) 20714400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3253453378560000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05907");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 61415068450132L, (java.lang.Object) 168472090);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05908");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 19907100, (long) (-1879789912));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1859882812L) + "'", long2 == (-1859882812L));
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05909");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(17450732799940608L, 1470988937L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17450731328951671L + "'", long2 == 17450731328951671L);
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05910");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 169182050);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 169182050 + "'", int1 == 169182050);
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05911");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-451), 99440784, (-18000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05912");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-17899), (-35709260L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35691361L + "'", long2 == 35691361L);
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05913");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-7014485612706255950L), (long) 1763460000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -7014485612706255950 * 1763460000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05914");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 92459640L, (java.lang.Object) 312315);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05915");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-57378098), (-4506), 177781774);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05916");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3481738, (-9123345));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3481738 * -9123345");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05917");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(100964278, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100964278 + "'", int2 == 100964278);
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05918");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-15805100), 3481738, (-1712671034));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05919");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 198114912L, (java.lang.Object) (-190043702986380L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05920");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-100188684), 445);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100188239) + "'", int2 == (-100188239));
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05921");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 494910, (long) (-108685080));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -53789332942800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05922");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(342580000L, (long) 843852);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 341736148L + "'", long2 == 341736148L);
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05923");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(156879);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-156879) + "'", int1 == (-156879));
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05924");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3499650L, (-873000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2626650L + "'", long2 == 2626650L);
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05925");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-349956900), (-48512377), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -349956900 for hi! must be in the range [-48512377,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05926");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 257397490, (-53248), 301848066);
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05927");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3510537456600000L, (java.lang.Object) (-628056570));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05928");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-350000), (-64), 95781);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -350000 for hi! must be in the range [-64,95781]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05929");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(577142281L, 1442485561160494224L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1442485561737636505L + "'", long2 == 1442485561737636505L);
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05930");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-82215000L), (long) 688309020);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -56589326079300000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05931");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 904180783, (-47234L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 904228017L + "'", long2 == 904228017L);
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05932");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1713170345), 0, 111, 2005438);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1385095 + "'", int4 == 1385095);
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05933");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 231793424);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 231793424 + "'", int1 == 231793424);
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05934");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3459553775567890L), 10100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3459553775557790L) + "'", long2 == (-3459553775557790L));
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05935");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1711678817), (-66665530), 590309465, 833);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05936");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-6289801), 14428, (-9700));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05937");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-450684L), (java.lang.Object) (-9691));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05938");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-52), (-97405));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5065060L + "'", long2 == 5065060L);
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05939");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-10047), 115104, (-68277286));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05940");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-27573844749680284L), (java.lang.Object) 6237554960000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05941");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-274264575L), 6962637666600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6962363402025L + "'", long2 == 6962363402025L);
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05942");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-312), (-4256334), 1718668813);
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05943");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-15961567), (long) 31508272);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15546705L + "'", long2 == 15546705L);
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05944");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(157773616, 10100, (-873));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05945");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(30426045177834L, 232883752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 30426045177834 * 232883752");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05946");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 351665413, 9797, (-521191424));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05947");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4112653951L), 2005430);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8247639612953930L) + "'", long2 == (-8247639612953930L));
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05948");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(66369120, 161986, (-1999662), 843852);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1713254) + "'", int4 == (-1713254));
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05949");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2987409, (-490002), 1943430);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05950");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-323442480), (-873), (-873));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -323442480 for hi! must be in the range [-873,-873]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05951");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 62, 18686280);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05952");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(100963445, 46895);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101010340 + "'", int2 == 101010340);
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05953");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1142, (-301848066), 498646);
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05954");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 54920, 80635680, (-1989679));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05955");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(17287395);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-17287395) + "'", int1 == (-17287395));
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05956");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 254849, (-329294908097649L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 254849 * -329294908097649");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05957");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(129948442624L, (-1695974308120618750L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1695974178172176126L) + "'", long2 == (-1695974178172176126L));
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05958");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2582129), (-301838202), 0);
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05959");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-155277600), 9788, (-532281952));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05960");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 848047583, (-159620L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 848207203L + "'", long2 == 848207203L);
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05961");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1142), (-254849), 101009154);
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05962");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 688309020, (-949417406), (-97970));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05963");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(310, 14227, 3909, 3828);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05964");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(125783592, 1738657, 1910207, 420386456);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 127522249 + "'", int4 == 127522249);
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05965");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-5740), 78558096027L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-78558101767L) + "'", long2 == (-78558101767L));
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05966");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-970000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 970000 + "'", int1 == 970000);
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05967");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1686886240, (-592169827), (-2005430));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05968");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1715697100, 400795139, 25311043);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05969");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-920), 1990710L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1831453200L) + "'", long2 == (-1831453200L));
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05970");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-515974), (-1535304), (-22112703), 576);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2051278) + "'", int4 == (-2051278));
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05971");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-17362154), 154650012, 1988776, (-63864));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05972");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(4231920, 8467);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4240387 + "'", int2 == 4240387);
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05973");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3999997833L), (long) (-152286));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 609143669996238");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05974");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-350000), (-1519234035), (-188790000), 18686280);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-67250068) + "'", int4 == (-67250068));
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05975");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-620), 210);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-130200) + "'", int2 == (-130200));
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05976");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-64), 0, 351);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -64 for  must be in the range [0,351]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05977");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2626650L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05978");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 47652415, 201354638, 106575000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05979");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5772L), 14428);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-83278416L) + "'", long2 == (-83278416L));
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05980");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(968855293300L, (-9262271430L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 959593021870L + "'", long2 == 959593021870L);
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05981");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-102842949149280L), 169182050);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -102842949149280 * 169182050");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05982");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4027934713187344L), (-27));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108754237256058288L + "'", long2 == 108754237256058288L);
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05983");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 960169L, (java.lang.Object) 98049000000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05984");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2L, (long) (-1794561));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3589122L) + "'", long2 == (-3589122L));
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05985");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 15, 347880555, 4240387);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05986");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1482832080, (-302176508), (-111));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05987");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 18867, (long) (-2078227400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2078246267L + "'", long2 == 2078246267L);
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05988");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(231190314, 695393, 22759878);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10545454 + "'", int3 == 10545454);
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05989");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-349956635), (-18400), 16143426);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05990");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1686886240, 9076L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 15310179514240");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05991");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2756847L), 171191921969120L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-171191924725967L) + "'", long2 == (-171191924725967L));
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05992");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2582129), 11, 835739);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 760787 + "'", int3 == 760787);
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05993");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 317049115, (-524160), (-16919594));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05994");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(163143504L, (-689793507L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -112535329768428528");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05995");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3996518737L), 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -207818974324");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05996");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 8990, (-8536194), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05997");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(71700, (-97960), (-1462491242));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05998");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 634, 1945308, 169182050);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05999");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-300551), (-107726616), 99);
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test06000");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(999000207, 33108325, (-2581684), 326128844);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45976945 + "'", int4 == 45976945);
    }
}

