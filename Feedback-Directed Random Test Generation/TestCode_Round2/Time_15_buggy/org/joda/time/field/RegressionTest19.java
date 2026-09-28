package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

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
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-291727565551190L), (java.lang.Object) 26657493891966L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(239543574400L, 35814600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8579157299706240000L + "'", long2 == 8579157299706240000L);
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 374245, 4074452, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 374245 for  must be in the range [4074452,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-9261199670400L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9261199670400L) + "'", long2 == (-9261199670400L));
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-2294419));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2294419) + "'", int1 == (-2294419));
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-360), (-17362154), (-576693690));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(324823060, 124486545);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 324823060 * 124486545");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-100449343), (-1794561), (-86), (-157922));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) '#', 14343, (-1988776));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hi! must be in the range [14343,-1988776]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 8209, 220565977698L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1810626110922882L + "'", long2 == 1810626110922882L);
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-208847451), (-10690349L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-219537800L) + "'", long2 == (-219537800L));
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10985), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1065545) + "'", int2 == (-1065545));
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3277662), 234356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3277662 * 234356");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1989866), 442560, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1989866 for  must be in the range [442560,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 210L, (java.lang.Object) (-1734678890L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(3398104, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67962080 + "'", int2 == 67962080);
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-89178884), 1324326, (-47234));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-429214), (long) (-7550420));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7979634L) + "'", long2 == (-7979634L));
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(37948040);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-37948040) + "'", int1 == (-37948040));
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(46935164704L, (-43048525));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2020489611139261600L) + "'", long2 == (-2020489611139261600L));
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-300969892), 3561650, 1715156650);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6407448056860264L), 853932);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -6407448056860264 * 853932");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-167699127L), (-3327897692226L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3328065391353L) + "'", long2 == (-3328065391353L));
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(1590095446380L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1590095446380");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 518500854, (java.lang.Object) (-1989686));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-4785376), 249426407, (-68277286));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-299795783), (-944118497), 700229040);
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-27826), 4231920);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4204094 + "'", int2 == 4204094);
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1762675999, (-68277286), 0, 936358246);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 758040466 + "'", int4 == 758040466);
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1722848668956L, (-450683));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-776458606671096948L) + "'", long2 == (-776458606671096948L));
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(863620, 26511433, 1785587);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-5123271582200L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5123271582200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3760577), 949427270, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(62140372134160L, (long) 46322273);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 62140372134160 * 46322273");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1899810000, 73381944, (-1196950));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-132), 410609746, 9123345);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -132 for  must be in the range [410609746,9123345]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1761112650), (-1717685969), (-1715159124));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-704792495), 20);
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-198122588L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-198122588) + "'", int1 == (-198122588));
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-949512368), (java.lang.Object) 180346924);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 85342, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-32482053), (-1713170135), 47620, 3828);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-4122923363L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-151485400));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 151485400 + "'", int1 == 151485400);
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2311731921451724L), (long) 635218511);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2311731286233213L) + "'", long2 == (-2311731286233213L));
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1454524), 1530017442);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1528562918 + "'", int2 == 1528562918);
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1694976160, 168443407, (-35691361));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-192174760), (-1259474));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -192174760 * -1259474");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(33032396199L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 33032396199");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1470988428, (-1738657), (-1989524));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1470988428 for  must be in the range [-1738657,-1989524]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 976536, (-1794989), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 976536 for hi! must be in the range [-1794989,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-68277286), (-136724), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(20488877962800L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20488877962800L + "'", long2 == 20488877962800L);
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1482832281), (java.lang.Object) 1300343640135249600L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-470343167), 487551322, (-1989866));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-448826), 0, 149767755);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -448826 for hi! must be in the range [0,149767755]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 880);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 880 + "'", int1 == 880);
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-26511982), 855285);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25656697) + "'", int2 == (-25656697));
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 843887, (-16591304), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1495740, (-62000), (-1065545), (-8700));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-679952) + "'", int4 == (-679952));
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3996509288L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(146361530, (-1212378));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145149152 + "'", int2 == 145149152);
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 13393, (-2311731921451724L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 13393 * -2311731921451724");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(89186674, 0, 3181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1578 + "'", int3 == 1578);
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(104767, 97180281);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 104767 * 97180281");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-290212L), (long) 1737870);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1447658L + "'", long2 == 1447658L);
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(83836111906170L, 3499544L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 83836111906170 * 3499544");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 19559583600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-304461011), (-192174760), (-163115));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -304461011 for  must be in the range [-192174760,-163115]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-341736148L), (java.lang.Object) 1713956367);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(66369120, 51665711);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 66369120 * 51665711");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-33916972763L), 2865223726950L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -33916972763 * 2865223726950");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(46930, (-804981179), (-1308961551));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1682020L), (long) 17423);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1699443L) + "'", long2 == (-1699443L));
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(4000008832L, 320016841);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1280070190388739712L + "'", long2 == 1280070190388739712L);
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(851, (-677162));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-576264862) + "'", int2 == (-576264862));
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 504032, (long) 15409940);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 7767102878080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(126765561, 53816);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126819377 + "'", int2 == 126819377);
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-738109629742464000L), (long) (-27826));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-738109629742436174L) + "'", long2 == (-738109629742436174L));
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 19907100, 1945308, (-105975170));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-100), 41404775, (-4074));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-34386408), (long) 601423);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33784985L) + "'", long2 == (-33784985L));
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(217526);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-217526) + "'", int1 == (-217526));
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 16143426, 951502398, (-100490000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16143426 for  must be in the range [951502398,-100490000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1454524, (-404815722779160L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1454524 * -404815722779160");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 234356, (long) (-91));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 234447L + "'", long2 == 234447L);
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1734643853289776L), (java.lang.Object) 2248228L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2311731921451724L), (-2466));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5700730918299951384L + "'", long2 == 5700730918299951384L);
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(126547938, (-1954106));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 124593832 + "'", int2 == 124593832);
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 45091, (-84385200), 6015);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(22246411L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22246411 + "'", int1 == 22246411);
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1802640000, 2110080);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1802640000 * 2110080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-634344346), (-944351632));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1578695978) + "'", int2 == (-1578695978));
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-21104292), (-4665), (-951493178));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -21104292 for  must be in the range [-4665,-951493178]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(936358246, 688309020, 87426300, 311268209);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 281615806 + "'", int4 == 281615806);
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1755570876), (-576264862));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1755570876 * -576264862");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1686037017, (-709960));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1686037017 * -709960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-783126731L), (-951493242L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 745139792176051902");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 853932, 868, 112110);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1715696283), 126765561, 311268209);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1715696283 for hi! must be in the range [126765561,311268209]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1715159045), 1712604379);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2554666) + "'", int2 == (-2554666));
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1495740, (-1713170135), 440284, (-204677760));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(504032, (-1954106));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 504032 * -1954106");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 479652, (long) 191323416);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 91768659131232L + "'", long2 == 91768659131232L);
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(32496992L, (-16067817816692118L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 32496992 * -16067817816692118");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-298735764L), (java.lang.Object) 5899809);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 700229040, (long) (-130200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 700098840L + "'", long2 == 700098840L);
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 122129848, (-377), (-420368508));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10545454, 3035028, 2582129);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2058678), 1508037);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2058678 * 1508037");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-299444533), 1662486333);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-497822443604067489L) + "'", long2 == (-497822443604067489L));
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 145149152, (long) (-107726638));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15636430153510976L) + "'", long2 == (-15636430153510976L));
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-312), 14307000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -312 * 14307000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-700), 66558);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-46590600L) + "'", long2 == (-46590600L));
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-920), 861836);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-792889120L) + "'", long2 == (-792889120L));
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(220565977698L, 3499550);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 771881667253035900L + "'", long2 == 771881667253035900L);
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 1481377506);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 350034159, 250462763508300L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 250463113542459L + "'", long2 == 250463113542459L);
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-168579832), 67348914, (-952557498));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-728), (-1763469777));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2987409));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2987409 + "'", int1 == 2987409);
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(56929);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-56929) + "'", int1 == (-56929));
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 258759, (java.lang.Object) (-15961567));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-132));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(124486545);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-124486545) + "'", int1 == (-124486545));
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1999662), (long) 1577733318);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3154933362138516");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1838776), 827878, 533310184);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1737870), (-8700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1746570L) + "'", long2 == (-1746570L));
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-33916098500L), (java.lang.Object) 2295252);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-374064183), 4240387, (-1462491242));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1535304));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1535304 + "'", int1 == 1535304);
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-8332947), 199879, (-234356));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(843852, (-37243837));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36399985) + "'", int2 == (-36399985));
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1722847825104L, (long) (-46322273));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1722801502831L + "'", long2 == 1722801502831L);
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-789), (-489444));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 386171316 + "'", int2 == 386171316);
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(85229052, 115104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 85344156 + "'", int2 == 85344156);
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-344489), 4, (-577));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(2079009101L, 5717880000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2079009101 * 5717880000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-147147648405810000L), (-56912840351744L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -147147648405810000 * -56912840351744");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-43925298601464000L), (long) (-61117));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -43925298601464000 * -61117");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(168433832L, (-2219805000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -373890262442760000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(395558000L, (long) (-103661485));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 499219485L + "'", long2 == 499219485L);
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1563864028), 3483304, (-3031430));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2301994), (-56147177658L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-56149479652L) + "'", long2 == (-56149479652L));
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1761394244, 951372194, 1206090960, 304461011);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 2304106, (-363369790), (-3396800));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2304106 for  must be in the range [-363369790,-3396800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(129926115, (-9737812), 420358630, 1119);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1897132), 25311043, 20, 331157);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 234251 + "'", int4 == 234251);
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-448826), 8646142997073452L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -448826 * 8646142997073452");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-592169827), (-31916932), 13393);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(233904432, (-551461));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 233352971 + "'", int2 == 233352971);
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-30352410), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 47525247, 117265441568L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5573069075083267296L + "'", long2 == 5573069075083267296L);
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 418862237, (long) (-2077053035));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2495915272L + "'", long2 == 2495915272L);
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-51187193470L), 3438639L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-176014279766487330L) + "'", long2 == (-176014279766487330L));
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-198121500L), (java.lang.Object) 350035000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(171478518);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-171478518) + "'", int1 == (-171478518));
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-198122588), 600814779, (-2466));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(13594, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-26020763), (-511785248), 1681112017, 17423);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 1185347686);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1185347686L + "'", long2 == 1185347686L);
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 2074908, (long) 169916106);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-167841198L) + "'", long2 == (-167841198L));
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-35), 587204001, 3598);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-600327L), 281688465L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-169105191128055L) + "'", long2 == (-169105191128055L));
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(363757, 233352971);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 363757 * 233352971");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1745996), 600842000, 911);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(808191813, (-168472090), 149767755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-146527725) + "'", int3 == (-146527725));
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-47525247), 853901, (-2065033));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9797, 112110, 351655538);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(301848066, 0, (-53318417), 171984);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-19094346) + "'", int4 == (-19094346));
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1075328), (-1682020L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 606692L + "'", long2 == 606692L);
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-8332947), 1010);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8331937) + "'", int2 == (-8331937));
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2078213183), (-1967089), 15, (-1715159124));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1289151020);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1289151020) + "'", int1 == (-1289151020));
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 952038643, (-66558));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63365788000794L) + "'", long2 == (-63365788000794L));
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(71355223200L, (-1028141521L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 71355223200 * -1028141521");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1893305L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1893305 + "'", int1 == 1893305);
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-3778206), (-9778), (-198122588));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3778206 for hi! must be in the range [-9778,-198122588]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(301291058L, (-6717319292802L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 301291058 * -6717319292802");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(101009154, (-1713170345));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 101009154 * -1713170345");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-34213711927272300L), 21202083630L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -34213711927272300 * 21202083630");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-951502398), 64244);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -951502398 * 64244");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(33928507455L, 304989469623405483L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 33928507455 * 304989469623405483");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1734643853346387L), (java.lang.Object) 900L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 127522249, 15345);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1956828910905L + "'", long2 == 1956828910905L);
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(543958, (-7633), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5156) + "'", int3 == (-5156));
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-130700686), (-360), 3034108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-318634906091210112L), (-711052));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -318634906091210112 * -711052");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 155277732);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 155277732 + "'", int1 == 155277732);
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(950733809, (-3034108), 13326602, (-470343167));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-951492297), (-9864), 339160985, (-190217798));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1196082846312962L, (java.lang.Object) 580601);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2284512), (-33108325));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35392837) + "'", int2 == (-35392837));
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1050924609, 874089L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1050050520L + "'", long2 == 1050050520L);
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1761394973, (-31916932), (-169096781));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-37243837));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2795634), (-126952484160060L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2795634 * -126952484160060");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(18, (-9864));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-177552) + "'", int2 == (-177552));
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-10689661), (java.lang.Object) (-107726616));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 2005733, (long) 149158);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1856575L + "'", long2 == 1856575L);
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1761479067), (-2587005341892608L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1761479067 * -2587005341892608");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1990388, (java.lang.Object) (-1411593950367669222L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3536656467292573245L, (-1413255605480L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3536657880548178725L + "'", long2 == 3536657880548178725L);
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) (-1528073662));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1528073662L) + "'", long2 == (-1528073662L));
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1711), (-3396800), (-188112985));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(234447L, (long) 191323416);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-191088969L) + "'", long2 == (-191088969L));
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-17362154), 13830712, (-1967089));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(36740191, (-2284741));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34455450 + "'", int2 == 34455450);
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 4033340, 350035111, (-299785985));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4033340 for hi! must be in the range [350035111,-299785985]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 46851, (-592169827), 155277797);
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2110080, (-25656697));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23546617) + "'", int2 == (-23546617));
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5740, 0, 44199872);
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-52L), (java.lang.Object) (-183457343));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 94401367, (-32482053), (-1142));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 94401367 for hi! must be in the range [-32482053,-1142]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 252802, (-1831453200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1831200398L) + "'", long2 == (-1831200398L));
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 34386408, (-96990431));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3335152532461848L) + "'", long2 == (-3335152532461848L));
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 101008454, 10404838080000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 101008454 * 10404838080000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3038), (-711052), 97898534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3038) + "'", int3 == (-3038));
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1763460086, 7739550, 493779);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(36740191, 124593832, 10552, (-15961567));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 819000, (-3509649), 180346924);
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-202050186));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 202050186 + "'", int1 == 202050186);
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(167743998852654832L, (long) 14390810);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 167743998867045642L + "'", long2 == 167743998867045642L);
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(4292856269798400L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4292856269798400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1763460086, 155279264);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1763460086 * 155279264");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(9692L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9692 + "'", int1 == 9692);
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-30352410), 288303652);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 257951242 + "'", int2 == 257951242);
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3517500094266600L, (java.lang.Object) 92000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(9477L, (long) (-67250068));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 67259545L + "'", long2 == 67259545L);
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3499550, 22246411);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3499550 * 22246411");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-106141505906070L), (long) (-1784800));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -106141505906070 * -1784800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-77144400), 63702638);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13441762) + "'", int2 == (-13441762));
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 10689680, (-958364), 1715);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10689680 for  must be in the range [-958364,1715]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-8990), (-401));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3604990 + "'", int2 == 3604990);
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 39325940, (-1926266L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -75752221140040");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 31508272, (-169096781), 99835728);
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6143290345686900L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6143290345686900L) + "'", long2 == (-6143290345686900L));
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-8002818715384015L), (-1890034356341402L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -8002818715384015 * -1890034356341402");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(119398608L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 119398608 + "'", int1 == 119398608);
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 10545454, (-99440784));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 201354638, (-122484040));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-804981179), (int) (byte) 0, (-2795634));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(4637904, (-2058678), (-729));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1535946) + "'", int3 == (-1535946));
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1185347686), (-77144400), 577637190, (-211916938));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-86), 354520488, 1050924609);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 696404036 + "'", int3 == 696404036);
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-166315559808230L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-166315559808230L) + "'", long2 == (-166315559808230L));
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(420368508, (-502));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 420368006 + "'", int2 == 420368006);
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 36296771, (long) (-2284741));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-82928720871311L) + "'", long2 == (-82928720871311L));
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(185867227, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 185867227 + "'", int2 == 185867227);
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9999, 97898534, (-949426390));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 47524559, (-1370574), 231190314);
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(600832203, 2078227400, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-304461011), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-53553755), (-2554666));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-56108421) + "'", int2 == (-56108421));
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 873, 1415768224, (-5156));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-221718630), (-99370817));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22032361407220710L + "'", long2 == 22032361407220710L);
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-37993768L), (long) (-87426300));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49432532L + "'", long2 == 49432532L);
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4761114), (-9788880), 2384403);
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 35, 861836);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [35,861836]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 193913417, (-2581684), 959334);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3778206), (-357544679));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3778206 * -357544679");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 498646, (long) (-86));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 498732L + "'", long2 == 498732L);
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(239543643097L, (long) 951372194);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 238592270903L + "'", long2 == 238592270903L);
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(94401367, 4480369);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98881736 + "'", int2 == 98881736);
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(107222400, 128814969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 107222400 * 128814969");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(201372638, (-48139530), (-1760510603), (-1196950));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1606080546) + "'", int4 == (-1606080546));
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-43048525), (java.lang.Object) (-112185551037401280L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 175973473, (-5791299), 827878);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 520, 34386308, 100449343);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 520 for  must be in the range [34386308,100449343]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1120), 105019800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -117622176000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(14623213L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1620, (-20552186L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20550566L) + "'", long2 == (-20550566L));
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 73381892);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-992165), (-503932));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1496097) + "'", int2 == (-1496097));
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3045000), (-708129348), (-1995555));
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1713149062), 46930, (-298964462));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-60437), 167396781);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -60437 * 167396781");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 9999, (-868), 633115409);
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 14307000, (-16919594), (-1925124040));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(6407448057348624L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6407448057348624");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-46266513), 0, (-537804800));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 8673549, (-169916106), (-100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8673549 for hi! must be in the range [-169916106,-100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 882074, 868, 374245);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10398), (-1024844251));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -10398 * -1024844251");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1620270);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1620270) + "'", int1 == (-1620270));
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 339160985, 48014596L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 16284677673737060");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 669, (long) 3604990);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3604321L) + "'", long2 == (-3604321L));
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) (-1715159124));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1755920876, 686, (-618950464));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(39380L, (-37243837));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1466662301060L) + "'", long2 == (-1466662301060L));
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-5772L), (long) (-524160));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-529932L) + "'", long2 == (-529932L));
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-23067382), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23067382) + "'", int2 == (-23067382));
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(185877195, 225554287);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 185877195 * 225554287");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(26511433, 4074452, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 8673549, (long) (-1705));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -14788401045");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2065028L, (-8699039L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17963759108092L) + "'", long2 == (-17963759108092L));
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-86130), 1938372, 9123345);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -86130 for  must be in the range [1938372,9123345]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-148302337), 75191877L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11151131082516549L) + "'", long2 == (-11151131082516549L));
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(351375966039076L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-40322560), (-236129206), 0);
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(198112800, (-1715696724));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 198112800 * -1715696724");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-204677760), 1967089, (-610511170));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-22199491));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22199491 + "'", int1 == 22199491);
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-4487193), (-27), 34455450);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-848595844), 30426045177834L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -848595844 * 30426045177834");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 106462890);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-106462890L) + "'", long2 == (-106462890L));
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1563864028));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1563864028 + "'", int1 == 1563864028);
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-288303652), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -288303652 * -10");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-729976520));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 729976520 + "'", int1 == 729976520);
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-16919594), (-111), 44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-148474454), 108684870, 958464);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1007698710304L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1007698710304L) + "'", long2 == (-1007698710304L));
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3034009), (-728), 655);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-22199491), 300969900, 13584346);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-84666360264073238L), (long) (-944118497));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-84666359319954741L) + "'", long2 == (-84666359319954741L));
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-106394130));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-106394130) + "'", int1 == (-106394130));
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1713149062), 2304106, (-485588104), 161986);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-253594683) + "'", int4 == (-253594683));
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-8421047984L), (long) 1470988428);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9892036412L) + "'", long2 == (-9892036412L));
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 335272154);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-98205378L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-98205378) + "'", int1 == (-98205378));
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1943780, (-1990611), (-343864080));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 3909, (long) 1535634);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1539543L + "'", long2 == 1539543L);
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 63649178, 17423, 101);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 63649178 for hi! must be in the range [17423,101]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-46322273), 15409940, 1967089);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -46322273 for hi! must be in the range [15409940,1967089]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 207586242);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 207586242 + "'", int2 == 207586242);
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 349956900, (-97), 352818223);
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1786407669, (-2078213173));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3712535950064023737L) + "'", long2 == (-3712535950064023737L));
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 149248, (-57069L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8517434112L) + "'", long2 == (-8517434112L));
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2078227400, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-4485355));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4485355) + "'", int1 == (-4485355));
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(83022336L, (long) 17802);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477963625472L + "'", long2 == 1477963625472L);
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-155277600));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-155277600) + "'", int1 == (-155277600));
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(101008454, (-1763460086), (-357608543));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1304843090) + "'", int3 == (-1304843090));
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 926161, 861836, (-400795139));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 926161 for hi! must be in the range [861836,-400795139]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(66747848, 3277662, 583633684, (-439278728));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 317049115, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 317049115L + "'", long2 == 317049115L);
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(3499650, 99593070);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103092720 + "'", int2 == 103092720);
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2615899881150097215L, (java.lang.Object) 147147648403856120L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 107222400, (-9737812), (-4485350));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 107222400 for hi! must be in the range [-9737812,-4485350]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(4083552330L, (long) (-343864080));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1404186965087306400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1117972070, (-8209), 1662486333);
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3404749101039L), (-18235365446L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3404749101039 * -18235365446");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-628056570), 168472090);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -628056570 * 168472090");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-232901752L), (long) (-804981179));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 572079427L + "'", long2 == 572079427L);
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(335272154, 124593832);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 335272154 * 124593832");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(48456409752000520L, (long) (-1196950));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 48456409752000520 * -1196950");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 10689680, 3224396375770L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3224407065450L + "'", long2 == 3224407065450L);
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1831453200L), 85344156);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-156303827607499200L) + "'", long2 == (-156303827607499200L));
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-708129449), 0, 353600846);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(4937697877816L, (-489444L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2416726600109774304L) + "'", long2 == (-2416726600109774304L));
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1974990), (long) (-30352410));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 59945706225900L + "'", long2 == 59945706225900L);
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-351944703L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-351944703) + "'", int1 == (-351944703));
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1450548), 34386308, 198177044);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 162340189 + "'", int3 == 162340189);
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 14307000, (-944117276));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(103092720, 234356, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1470998628, (-1954106));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1469044522 + "'", int2 == 1469044522);
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(824172132L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 824172132 + "'", int1 == 824172132);
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-1588537255313989800L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1588537255313989800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-66558), (-14308));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 952311864 + "'", int2 == 952311864);
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-789), 0, 458793393);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-161986), 668094673, 15409940, (-2065033));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-450683), (-86), (-171478518));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3598, (-3499650), (-16591304), 257951242);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3496052) + "'", int4 == (-3496052));
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9249165, (-1868650), 154440945);
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-350000), 4074452, (-171478832));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2358351640919300070L), (long) 87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2358351640919300070 * 87");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(717357898048940928L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-3005272), 801902322, (-176870209));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3005272 for hi! must be in the range [801902322,-176870209]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-45120), (-253594683), 4710915);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-45120) + "'", int3 == (-45120));
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1893305);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1893305) + "'", int1 == (-1893305));
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-89959023527L), 51815423);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4661264856718456921L) + "'", long2 == (-4661264856718456921L));
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10497554, (-2858763), 3117618);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1455210) + "'", int3 == (-1455210));
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5802206573999812L), (-609053028));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -5802206573999812 * -609053028");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 2304106, (-107726616), 155277600);
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 695393);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 695393 + "'", int1 == 695393);
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-273471229715886774L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-273471229715886774L) + "'", long2 == (-273471229715886774L));
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 7739630, (-30), (-3534494));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-427887234205704L), (-147779880627024L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-575667114832728L) + "'", long2 == (-575667114832728L));
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(14623213L, (-55318085468145L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55318100091358L + "'", long2 == 55318100091358L);
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(22240825200L, 3908L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22240829108L + "'", long2 == 22240829108L);
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-687800606), 1990611, (-7633), (-543176618));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 205693334737499315L, (java.lang.Object) 3038);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1025353728, 1761730, 1454523);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9788, 950325624, 314527061);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(620L, (long) 98881736);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-98881116L) + "'", long2 == (-98881116L));
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 199359);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 199359 + "'", int1 == 199359);
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-43048525), 155277797, (-101010340));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1717850242));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1717850242 + "'", int1 == 1717850242);
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1753263, (-605984));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1147279 + "'", int2 == 1147279);
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 14390810);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14390810 + "'", int1 == 14390810);
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1762676017), (-1763469777));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3108425882622238209L + "'", long2 == 3108425882622238209L);
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1119), 66369120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-74267045280L) + "'", long2 == (-74267045280L));
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 818982636L, (java.lang.Object) (-235614207919338866L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-9788880));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9788880 + "'", int1 == 9788880);
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-184), 80635684);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80635500 + "'", int2 == 80635500);
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3277662), (-679952), 5740);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-524160), 1630546760, (-689793507), (-1185347686));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2051648L), 9262271430L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9260219782L + "'", long2 == 9260219782L);
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-448826));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-448826) + "'", int1 == (-448826));
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-69484049307216L), (long) 600814779);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69483448492437L) + "'", long2 == (-69483448492437L));
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-4295873299791840000L), 55805171232252L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4295873299791840000 * 55805171232252");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-30960482), (-813548518), (-171469054));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3499650), 7739550, (-129926115));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-350000), 175973473, 3499650);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-26553), (-1762675999), (-3534494));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-288303652), (java.lang.Object) 22246045730L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-169409513819L), (-1431L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-169409512388L) + "'", long2 == (-169409512388L));
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 630000000, (-999900), 949417406);
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-8332947), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(5443330L, 5220641);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28417671774530L + "'", long2 == 28417671774530L);
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(45091, 97960, 335272154);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 335219286 + "'", int3 == 335219286);
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1695970979948785703L), (long) (-1785587));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1695970979947000116L) + "'", long2 == (-1695970979947000116L));
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 161986, (-4485377), 586810735);
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1713149062), (int) (short) -1, (-115104));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(668113251143498516L, 30906162L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 668113251143498516 * 30906162");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-281698083), 1233314, (-954811000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-82215000), 50097520);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4118767606800000L) + "'", long2 == (-4118767606800000L));
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1868650), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1868550) + "'", int2 == (-1868550));
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-986060405), (long) (-299552));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-985760853L) + "'", long2 == (-985760853L));
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1950784742384L), 49432532L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1950735309852L) + "'", long2 == (-1950735309852L));
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 240395216033566L, (java.lang.Object) (-69484088175816L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-47585), 349432740, (-89), 3598);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2475 + "'", int4 == 2475);
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(169924231719L, (long) (-22112703));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3757484068505426457");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2284741), (-3720938900L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3723223641L) + "'", long2 == (-3723223641L));
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 600842000, (java.lang.Object) 3828);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(191323416, (-789467264));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-598143848) + "'", int2 == (-598143848));
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(427505903966756160L, (-3328137331200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 427509232104087360L + "'", long2 == 427509232104087360L);
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 20714400, 824172132, 45976945);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20714400 for hi! must be in the range [824172132,45976945]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-190043702986380L), (java.lang.Object) (-16067820946588848L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 509218, (long) (-854669577));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-854160359L) + "'", long2 == (-854160359L));
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-959232), 154440945);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -959232 * 154440945");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 112110, (long) 46831);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5250223410L + "'", long2 == 5250223410L);
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3337664, (-951502398));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3337664 * -951502398");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1535634, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1535634 + "'", int2 == 1535634);
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(973781, 0, 13584346, (-377));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-106571912), (-669), 252294596);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -106571912 for  must be in the range [-669,252294596]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 299785985, 0, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 299785985 for hi! must be in the range [0,9]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(34015933755L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34015933755L) + "'", long2 == (-34015933755L));
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-610511170), (-53248));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-610457923) + "'", int3 == (-610457923));
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 14182403597802L, (java.lang.Object) (-290212L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1890034360661700L, (java.lang.Object) 39380L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 944118497, 159247253, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-65066), 2248540, (-211916938), 153428);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-209886893) + "'", int4 == (-209886893));
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-34386308), (-1715696283), (-1711678817));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 87426300, 1945308, 97960);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 410609746, 5220641);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2143646074967186L + "'", long2 == 2143646074967186L);
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-176870209), 634, 202050186);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -176870209 for hi! must be in the range [634,202050186]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 202685432, (java.lang.Object) (-403568L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(341735826L, (-6717425867802L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 341735826 * -6717425867802");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 350000, (-896371846634274895L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-896371846633924895L) + "'", long2 == (-896371846633924895L));
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-600842000), 954811, (-91));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-47585), (-1989679));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -47585 * -1989679");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-634344346), (-27826), (-350035111), 296189014);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11851954 + "'", int4 == 11851954);
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-349956067), (long) 201);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-349956268L) + "'", long2 == (-349956268L));
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 442559, (-626882108), (-26553));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(41029162590L, (long) (-1713149062));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39316013528L + "'", long2 == 39316013528L);
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1121617, 2439621, 9249165);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1121617 for hi! must be in the range [2439621,9249165]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 489444, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(13730410, 1715160045, 63864, 3390828);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2195620 + "'", int4 == 2195620);
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-69473305));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 69473305L + "'", long2 == 69473305L);
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 532426752, (long) 30938270);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 563365022L + "'", long2 == 563365022L);
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-128172156L), 17996023998L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17867851842L + "'", long2 == 17867851842L);
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(890926170L, (long) (-2295252));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2044900073544840L) + "'", long2 == (-2044900073544840L));
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(171478832, (-1000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 171478832 * -1000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-47524559), 299745722);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -47524559 * 299745722");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-489444), 1838776);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1349332 + "'", int2 == 1349332);
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(14308, 67962080, (-869115));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-767454452), 3034108, 2304106);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -767454452 for hi! must be in the range [3034108,2304106]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 22759878, (-869115), (-951493178));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 52672, 420368006, (-1867131262));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52672 for  must be in the range [420368006,-1867131262]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-951492297), 4033340, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-52957194));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52957194 + "'", int1 == 52957194);
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-448826));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 448826 + "'", int1 == 448826);
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-3013430L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3013430) + "'", int1 == (-3013430));
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(98L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 98 + "'", int1 == 98);
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1530017442, (-470343167), (-30960482));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1530017442 for hi! must be in the range [-470343167,-30960482]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-100189684), 1712604379, (-46895));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 2346662);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2346662 + "'", int1 == 2346662);
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(204685393, (-318798683));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 204685393 * -318798683");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(7089931020328182L, (-927974785422498120L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-920884854402169938L) + "'", long2 == (-920884854402169938L));
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9989, 1139, (-1995555));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1897132), (long) 1185347686);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2248761026236552");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1370574), (long) (-66665530));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 65294956L + "'", long2 == 65294956L);
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1713149062), 1713170135, (-317333540));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1713149062 for hi! must be in the range [1713170135,-317333540]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3469518), (-8700000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12169518) + "'", int2 == (-12169518));
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 520, (-2252833699517034L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1171473523748857680L) + "'", long2 == (-1171473523748857680L));
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 855285, 171984, 85342);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(299546073, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-468), (-3499569), (-18400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1454524), (-15951520), 87426300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1454524) + "'", int3 == (-1454524));
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-47525247), 100964278L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53439031L + "'", long2 == 53439031L);
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(206718766195512850L, (long) 1111);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 206718766195513961L + "'", long2 == 206718766195513961L);
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 533304932);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 533304932 + "'", int1 == 533304932);
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 12141, 3499550, 202685432);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12141 for  must be in the range [3499550,202685432]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1469044522, (-620), 1289151020);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 179892881 + "'", int3 == 179892881);
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 8673549, (-705439449L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 714112998L + "'", long2 == 714112998L);
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-20731669), 201372638, 230746822);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 149158, 0, (-9537));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(4480369, (-1713170126), (-1482832281));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1607884553) + "'", int3 == (-1607884553));
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1385095, (long) 418862237);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 420247332L + "'", long2 == 420247332L);
    }
}

