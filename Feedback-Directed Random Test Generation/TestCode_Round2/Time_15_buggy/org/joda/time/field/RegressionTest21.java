package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

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
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2161649352804L, (java.lang.Object) (-3509649));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1234120, (-2304106));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1234120 * -2304106");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-86130), (java.lang.Object) 881233968378231L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3327897692226L), (java.lang.Object) 21064);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-107726616), (-106575000), 30938270);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-82928720871311L), (long) 9999);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-82928720861312L) + "'", long2 == (-82928720861312L));
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(252294596, 363757);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 252294596 * 363757");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(13, 954811, 715471229);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 714516432 + "'", int3 == 714516432);
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 155277600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 155277600 + "'", int2 == 155277600);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(336425483L, (long) (-954536506));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-618111023L) + "'", long2 == (-618111023L));
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-655556), (-1755920876), 193913417);
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(488360, (-18980207), (-143625714));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5252), (-316605312));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -5252 * -316605312");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2005438, 94401367, (-153251));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 85229052, (-308970476826943260L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 308970476912172312L + "'", long2 == 308970476912172312L);
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(236129206, (-5625086));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 236129206 * -5625086");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(69473305L, (-2110080L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -146594231414400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(56345789571487830L, 35318728101L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56345754252759729L + "'", long2 == 56345754252759729L);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-95285220503088L), 250427439091968600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-250522724312471688L) + "'", long2 == (-250522724312471688L));
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-168254564), 101755137362208L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101754969107644L + "'", long2 == 101754969107644L);
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1000), (-538255), 94401367);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-349956635), (-106571912), 5148);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1717687942, 9692, (-2065028), 4231920);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1369443) + "'", int4 == (-1369443));
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-144504917L), 351484891L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 206979974L + "'", long2 == 206979974L);
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(155279264, 100963131);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 155279264 * 100963131");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2858763), (long) (-954811));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2729578358793L + "'", long2 == 2729578358793L);
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-5625086), (long) (-5156));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29002943416L + "'", long2 == 29002943416L);
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-597509), 63780902, (-204298726));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(863620, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 863620 + "'", int2 == 863620);
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 98, (-8331937), (-420368508));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(725305, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 725320 + "'", int2 == 725320);
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(715471229);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-715471229) + "'", int1 == (-715471229));
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-99440784), (-1175010), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-739860) + "'", int3 == (-739860));
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1582215500L), (-2716524810L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4298127660516555000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-1491865899480L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1491865899480");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(649332, (-1999671));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1350339) + "'", int2 == (-1350339));
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-304687800), 442559, (-1646791658));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(299315786L, (long) (-1794561));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-537140436239946L) + "'", long2 == (-537140436239946L));
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-180346924), (long) (-1715149542));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1895496466L) + "'", long2 == (-1895496466L));
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 288303652, (-4450697), 1712671034);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 677162, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 4637904, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-37265648165859510L), (java.lang.Object) (-12141));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(104199520, (-300551), 649332, 386171316);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103898969 + "'", int4 == 103898969);
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1577733318);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1577733318 + "'", int1 == 1577733318);
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 600814779, 1784800, 3509525);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 600832203, 107655854, (-212411343));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 600832203 for  must be in the range [107655854,-212411343]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(176421552, 350035111, (-1717685969), (-1760510603));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1075328), 159779046, 9875);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(9588507861560L, 587204001);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 9588507861560 * 587204001");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 374064183, 1349332, (-1943780));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 374064183 for  must be in the range [1349332,-1943780]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1713170345), (-13441762));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1726612107) + "'", int2 == (-1726612107));
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1990388, (long) 822961965);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 824952353L + "'", long2 == 824952353L);
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1620270), (-1209329613L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1959440492055510L + "'", long2 == 1959440492055510L);
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(640810929, 1802640000, (-2284741));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1196950), (-1990710), 1938372);
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-34089228354420L), (long) 1766929518);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34087461424902L) + "'", long2 == (-34087461424902L));
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 970111, 3034108, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 970111 for  must be in the range [3034108,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(17329373, (-4761114), (-177664191));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 15951520, (-68697), (-1075328));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15951520 for hi! must be in the range [-68697,-1075328]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-16932L), 2158508185398882L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2158508185415814L) + "'", long2 == (-2158508185415814L));
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 39325940, 973821426, (-147271468));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 4909, (long) 317049115);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1556394105535L + "'", long2 == 1556394105535L);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-314527061), 1010, 14308, 127522249);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 67997775 + "'", int4 == 67997775);
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-149158), (long) (-1656143));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1506985L + "'", long2 == 1506985L);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(32482072);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32482072) + "'", int1 == (-32482072));
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 285842568, (-15288536528274L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15288822370842L + "'", long2 == 15288822370842L);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(775601801931L, (-21676495227L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 797278297158L + "'", long2 == 797278297158L);
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1745996), 449475895, 124486545);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-188219723913127200L), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-188219723913127199L) + "'", long2 == (-188219723913127199L));
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1607884553));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1607884553 + "'", int1 == 1607884553);
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-16990520), (-2235464), (-23067382), 18919589);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-19225984) + "'", int4 == (-19225984));
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-399618), 121054688, 52672);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-729), (long) 1050924609);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-766124039961L) + "'", long2 == (-766124039961L));
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-303616), (-942883156), 335219286);
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-155277600), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-155277500L) + "'", long2 == (-155277500L));
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-130700686), (-64244));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -130700686 * -64244");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-57745967636121L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -57745967636121");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(502361);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-502361) + "'", int1 == (-502361));
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(33173432955L, (-1630093210902768L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1630126384335723L + "'", long2 == 1630126384335723L);
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-56929), (-1142));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 65012918L + "'", long2 == 65012918L);
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-188114696), 543958);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-187570738) + "'", int2 == (-187570738));
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 3349062);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3349062L + "'", long2 == 3349062L);
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 125783592, 1183824151547750L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 125783592 * 1183824151547750");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6959097913696L), (-1403763792460069572L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1403770751557983268L) + "'", long2 == (-1403770751557983268L));
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3909), 27898616, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 157773616, 1785587, 219304298);
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1477401137L, (long) 351655538);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 519536291673546706");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1121717, (-386075249));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-384953532) + "'", int2 == (-384953532));
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(206988733L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 206988733 + "'", int1 == 206988733);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-112110), 1715159045);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1715046935 + "'", int2 == 1715046935);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(10308, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10308 + "'", int2 == 10308);
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 973821426, (long) 2113648510);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2058316206070975260");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 62140372134160L, (java.lang.Object) (-3277662));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1450647, 114080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1564727 + "'", int2 == 1564727);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-843852));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-843852) + "'", int1 == (-843852));
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-584339620L), (-689793507));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 403073675758847340L + "'", long2 == 403073675758847340L);
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-813548518));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 813548518 + "'", int1 == 813548518);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 8941480, (-85342), (-21104292));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-789467264), 1711, (-164838092));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-15409940), (long) 14343);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -221024769420");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-79), 1850695, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 168472109, (java.lang.Object) (-273456367L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-29147067812319L), 2668015999968L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -29147067812319 * 2668015999968");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-47585), 539633, (-9691));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -47585 for  must be in the range [539633,-9691]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 51665711, 232883752, (-401));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 51665711 for hi! must be in the range [232883752,-401]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(634344346, (-2005430), 57046);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-898570) + "'", int3 == (-898570));
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2295, (-349956635), (-2110080));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-502), (-537164914), (-1989686));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10308, 140869042, 285381314);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 144522581 + "'", int3 == 144522581);
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(50006802L, (long) (-30));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 50006832L + "'", long2 == 50006832L);
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 300979678);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 300979678 + "'", int1 == 300979678);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-850306535125796L), (-211642072));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -850306535125796 * -211642072");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 185937531, (java.lang.Object) 1331718759);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 950048943, (-25), (-26553));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-26511982), 0, 400483318);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 281615806, 882074, 1535304);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-187954262), (java.lang.Object) 11037719457L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 2195620, 4229862L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 9287169604440");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 3469518);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3469518 + "'", int1 == 3469518);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-445L), (-617272946631430954L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -445 * -617272946631430954");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(760787);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-760787) + "'", int1 == (-760787));
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(709311654578808L, (long) 12141);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 709311654590949L + "'", long2 == 709311654590949L);
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-273471229583899974L), (long) 149248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -273471229583899974 * 149248");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-43925298601464000L), (long) 296189014);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -43925298601464000 * 296189014");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 399618, 12195475, 20731669);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 300969900);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 300969900 + "'", int1 == 300969900);
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 201, 0, 2346662);
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-31910210532L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -31910210532");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-44753852), (long) 260897140);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 216143288L + "'", long2 == 216143288L);
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 874089, 1794561, (-146793024));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-204298726), (-159247253), 100978790);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 55927318 + "'", int3 == 55927318);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(302661739, 524160, (-626882108));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 6717380347885L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-56147177658L), 57434150453L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1286972795L + "'", long2 == 1286972795L);
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 219304298, 171469054, (-1988776));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1126887300, (-1718668813), 314527061);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(448826, (-129224490));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 448826 * -129224490");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 9123345, 1715160045, 835739);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9123345 for hi! must be in the range [1715160045,835739]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(949426390, (-10398));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 949426390 * -10398");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-450684), (-1989524L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1538840L + "'", long2 == 1538840L);
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1606080546), (-952907498), (-1285742));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-654458789) + "'", int3 == (-654458789));
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 86130, 0, (-1718668813));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86130 for  must be in the range [0,-1718668813]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-401));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 401 + "'", int1 == 401);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-86130), 9788, 94630394);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94534477 + "'", int3 == 94534477);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-536575), (-1), 3349062, 198177044);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 194291407 + "'", int4 == 194291407);
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-47416804), (-586809815));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-634226619) + "'", int2 == (-634226619));
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-31069120), 13326602, 145149152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100753431 + "'", int3 == 100753431);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1715696724), (-911), 2376658, 709790);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1713170126), 1233314, 153251, (-1897132));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-356632756L), (java.lang.Object) (-427887234205704L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-341736148L), 2061236880);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-704399151486738240L) + "'", long2 == (-704399151486738240L));
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-350035111), 36740191, (-46322264));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -350035111 for  must be in the range [36740191,-46322264]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-352818133), (-14227), 299315787);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-391376272), 177781774, (-300490149));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-276464450L), (long) 1174573);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -324727678429850");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-209886893));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 209886893 + "'", int1 == 209886893);
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9989, (-532281952), (-377), 73381944);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 54786613 + "'", int4 == 54786613);
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-782999), (long) (-151069740));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 118287455350260");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(950048943, (-70140002), 21064, 725320);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291948 + "'", int4 == 291948);
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3614964194510L), 22199491L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3614964194510 * 22199491");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 0, (-26553), 185877195);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(13238313787314L, 15273466621200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 13238313787314 * 15273466621200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-99L), (long) 201);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-300L) + "'", long2 == (-300L));
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 52957194, 8700, 299315787);
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(39350610, 100490000, (-32091870));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1470998628, (java.lang.Object) (-9201L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3002945109L, (-93126513900000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3002945109 * -93126513900000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-499505762029010022L), (long) 60336);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-499505762029070358L) + "'", long2 == (-499505762029070358L));
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(8342398507184L, (-499505762029010022L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 8342398507184 * -499505762029010022");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 1454523, (-1454614));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 95336384, 66534);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6343110973056L + "'", long2 == 6343110973056L);
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 3461411, 299785985, 3499553);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3461411 for hi! must be in the range [299785985,3499553]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-79), 1766929518, 100753431);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1535304), 173422712L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 171887408L + "'", long2 == 171887408L);
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2682116663065632L), (java.lang.Object) (-1954106));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-9762232684604583L), 34996500000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -9762232684604583 * 34996500000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(16919594, (-8691300), (-709960), 8123);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-388714) + "'", int4 == (-388714));
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(230746822, (-14307), (-3334615));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1107317907);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1107317907 + "'", int1 == 1107317907);
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-843887), (-272918), 739783371);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -843887 for hi! must be in the range [-272918,739783371]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3828, (-2103102), (-515974));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-12141), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12141) + "'", int2 == (-12141));
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1695974178172176126L), 53724488442210L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1695920453683733916L) + "'", long2 == (-1695920453683733916L));
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-183457343), (-13020480), 63649227);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -183457343 for hi! must be in the range [-13020480,63649227]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(450, 31286042, 19, 219304298);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31286492 + "'", int4 == 31286492);
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-159620L), (-15359825779200L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2451735390875904000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 756956234624478L, (java.lang.Object) 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-944351632), (-8990));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-944360622) + "'", int2 == (-944360622));
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(47525247, (-1646791658), (-949426390), 950733809);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 300893789 + "'", int4 == 300893789);
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-286652166039938160L), (long) 52957194);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-286652166092895354L) + "'", long2 == (-286652166092895354L));
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(4485377, 1300860316, (-1024844251));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(874089, 249426407);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 874089 * 249426407");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2250), (long) 3005390);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6762127500");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1802640000), (long) (-186412));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1802453588L) + "'", long2 == (-1802453588L));
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(704792495);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-704792495) + "'", int1 == (-704792495));
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-14428), (java.lang.Object) 601423);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(311268209, 108685080, (-543176618), 580601);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-123803931) + "'", int4 == (-123803931));
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 97960, 1470998628, 50731243);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97960 for hi! must be in the range [1470998628,50731243]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-48612189609972L), 997272303356728L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 948660113746756L + "'", long2 == 948660113746756L);
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3720938900L), (-4197738823980000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3720938900 * -4197738823980000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-330040725), (-1450647), 580601, 19027050);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18991178 + "'", int4 == 18991178);
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-958364), (-1289151020), (-33108325));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1257001060) + "'", int3 == (-1257001060));
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-224854000L), 15315556051224000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -224854000 * 15315556051224000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 835739, (-25), 46920);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-654458789), 758468816, (-1377398900));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 3181);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 715471229);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 715471229 + "'", int1 == 715471229);
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2288107), (-25801760), (-598143848));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(205693334737499315L, (-1213583));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 205693334737499315 * -1213583");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2005438), 106462890, 3469518);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(63367903L, (long) (-869115));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-55073995015845L) + "'", long2 == (-55073995015845L));
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-221718630), 600829953L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 379111323L + "'", long2 == 379111323L);
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 272209956366432L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 18867, (-1304843090), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 18867 for  must be in the range [-1304843090,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-171469054), 1535304, (-1712671034));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -171469054 for  must be in the range [1535304,-1712671034]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(351655538);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-351655538) + "'", int1 == (-351655538));
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(4710915, 580601, (-654458789));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-168572690), 1498687, (-1454614), 3499650);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1371007 + "'", int4 == 1371007);
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 152286, (-2044900073544840L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2044900073697126L + "'", long2 == 2044900073697126L);
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-299881125L), 34254574200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34554455325L) + "'", long2 == (-34554455325L));
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-167699127L), (java.lang.Object) (-90249826917216L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(12195475, (-556835983));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 12195475 * -556835983");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 263058213, (-5156), 1718668813);
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(159779046, 843887);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 159779046 * 843887");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3126427212L, (long) 1495740);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3124931472L + "'", long2 == 3124931472L);
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 848047583, 14829161);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12575834143967863L + "'", long2 == 12575834143967863L);
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-5827567613854858L), (long) (-322));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5827567613855180L) + "'", long2 == (-5827567613855180L));
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-3509649), 1989700, 3469518);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3509649 for  must be in the range [1989700,3469518]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(108754237256058288L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-628056570), 42092700, 822961965);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -628056570 for  must be in the range [42092700,822961965]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1609955940, (-99370817), (-626882108));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 686, 71700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49186200L + "'", long2 == 49186200L);
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6143313703657988L), 22246045730L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -6143313703657988 * 22246045730");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-69931974934731104L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -69931974934731104");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2153477), 89186674, 502361);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 89301778, (java.lang.Object) (-1117972070L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(56, 1863519532, (-300969900));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-45918818L), (-214173761));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9834605951734498L + "'", long2 == 9834605951734498L);
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-767454452));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 767454452 + "'", int1 == 767454452);
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1712604379, 1505073);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1714109452 + "'", int2 == 1714109452);
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1620, (long) (-99440784));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99442404L + "'", long2 == 99442404L);
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-8536194), (-3509649), 56611, (-107726638));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1990710, (-1999671), (-100963131));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-67250068), (-728), (-47610286));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 1765497216, 1717687942);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1023872306322434L, 94534477);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1023872306322434 * 94534477");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1108968198273600L, 2983769755344301L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1874801557070701L) + "'", long2 == (-1874801557070701L));
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 7451, (-9537), 973821426);
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(6289801, 3035028, 46851, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(210, (-539633));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-539423) + "'", int2 == (-539423));
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(27898616, 2294722, 0, (-16103806));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(209886893, (-384953532));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 209886893 * -384953532");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-8332947), 853932, (-384953532), (-34386308));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-358046240) + "'", int4 == (-358046240));
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2195620, 34386308, 89301778, (-46322273));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1711, (-234356), (-959232));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1711 for hi! must be in the range [-234356,-959232]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(80058085112552976L, 73710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 80058085112552976 * 73710");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-129279438), (java.lang.Object) (-949021208L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(4485377, 1715159733);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1719645110 + "'", int2 == 1719645110);
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-301848066), (java.lang.Object) 708898L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(812374164, (-2304106), (-4410));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1718574) + "'", int3 == (-1718574));
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1867778970252L, 51815423);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1867778970252 * 51815423");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(304461111, (-199304064));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 304461111 * -199304064");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 2384403, 181735281455866550L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-181735281453482147L) + "'", long2 == (-181735281453482147L));
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-8700), (-620236597), (-521191424));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-594279744) + "'", int3 == (-594279744));
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-329330765), (long) (-537804800));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 177115666204672000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) '4', (java.lang.Object) 1385067125);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(401, 66534);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66935 + "'", int2 == 66935);
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-200015116), (-1090328), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(67276566, (-1285742));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65990824 + "'", int2 == 65990824);
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(65990824, 155277600, (-349527));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-166315520939630L), 112324246);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -166315520939630 * 112324246");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1564727, (-61117), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1925133904, 231190314, 19907100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 633115409, (long) 690603420);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-57488011L) + "'", long2 == (-57488011L));
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-620));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-620) + "'", int1 == (-620));
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2111643072L), (long) (-1000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2111644072L) + "'", long2 == (-2111644072L));
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1450732L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1450732 + "'", int1 == 1450732);
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(521312L, (long) 296192052);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 296713364L + "'", long2 == 296713364L);
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-451), 34386390, 18980207);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(700, (-733892), 233352971);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 700 + "'", int3 == 700);
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(33173432955L, 1761394973);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 33173432955 * 1761394973");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2456901935445145L), (java.lang.Object) 46920);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 26511982);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26511982 + "'", int1 == 26511982);
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(7739630L, 1722898675L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 13334598271990250");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(125967105, (-96), 155277797, 1786633493);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1757322706 + "'", int4 == 1757322706);
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3611760, 335272134);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3611760 * 335272134");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 690603420, 197, (-27898616));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-103368527L), 1000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-103368527000L) + "'", long2 == (-103368527000L));
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3181, (-180346924));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3181 * -180346924");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-949512368), (java.lang.Object) 363757);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(2986L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2986 + "'", int1 == 2986);
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-26511982), (-177664191), 450);
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(171984, 10497554, 48321945, 54920);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(13481055545529669L, (-169105191128055L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 13481055545529669 * -169105191128055");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-310000L), 1631435040L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1631125040L + "'", long2 == 1631125040L);
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9691, (-1710528757));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16576734184087L) + "'", long2 == (-16576734184087L));
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1715159045), (long) (-618950464));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1096208581L) + "'", long2 == (-1096208581L));
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1535304), (long) (-605984));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 930369659136");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(99, 155277797);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 155277896 + "'", int2 == 155277896);
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(3499550, (-16919594), 159779046);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3499550 + "'", int3 == 3499550);
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 688, (-1607884553), (-2795634));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 302176508, (-350L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105761777800L) + "'", long2 == (-105761777800L));
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(9999, (-600842000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 9999 * -600842000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-1784780L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-12595644), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1534716372), (java.lang.Object) (-1761112650));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-70140002), 583633684);
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-7958609572571136L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7958609572571136");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 52, 1943780, 633647822);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(13238313787314L, 243405478620863L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-230167164833549L) + "'", long2 == (-230167164833549L));
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-556835983), 0, 48014510);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-633105360), 35, (-1745996));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 973682, 1023872406117175L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 973682 * 1023872406117175");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2304106, (-448826), (-23359779));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(99, 1495740, (-600842000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(47610286, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47610286 + "'", int2 == 47610286);
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1712490299, 999000207, 1802640000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1712490299 + "'", int3 == 1712490299);
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1718574));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1718574 + "'", int1 == 1718574);
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-180346924), 1988776, 2288107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2245596 + "'", int3 == 2245596);
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1483330, (-2304106), (-304687800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1722801502831L, (java.lang.Object) 204298726L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(320016841, 35691361, 21963942);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2959176, 0, (-54920));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(947642470);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-947642470) + "'", int1 == (-947642470));
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-235614207919338866L), (long) 1763460086);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-235614209682798952L) + "'", long2 == (-235614209682798952L));
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1765497216L, (long) 21963942);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38777278453385472L + "'", long2 == 38777278453385472L);
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 458793393, (-130700686), 304461011);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(97, 3499650, (-349957368), (-701619));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-345756003) + "'", int4 == (-345756003));
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-85250028), (-523), 9070);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2256 + "'", int3 == 2256);
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1585675614L), (long) 1711);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2713090975554");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-188114696));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 188114696 + "'", int1 == 188114696);
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(53816, (-13441762), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-13388047) + "'", int3 == (-13388047));
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-31916932), (-317147951));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -31916932 * -317147951");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3398104, 204685393, (-151069740));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 440807688333760L, (java.lang.Object) 206976575463452424L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-17287395), 40322560, 14390810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1893305, (-2304263), (-34978320));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1893305 for hi! must be in the range [-2304263,-34978320]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1620270), (-107726638));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-109346908) + "'", int2 == (-109346908));
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 154440945, 296192052, (-168579832));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1695970979948785703L), (-954811000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1695970979948785703 * -954811000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(124593832, 1765497216, (-1989861));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-160197868720494L), 602790802266828L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -160197868720494 * 602790802266828");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-272918), (long) (-2077053035));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 566865160206130");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-234356), 2111643072, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(999731834);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-999731834) + "'", int1 == (-999731834));
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(155277600, (-489444), (-10318));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-438675) + "'", int3 == (-438675));
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 13, (-100460641));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1988776), (long) (-1482832281));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2949021252478056");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(206976575463452424L, 1959440492055510L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 206976575463452424 * 1959440492055510");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 7932690975375767L, (java.lang.Object) (-704683943));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(46940, (-450683), (-618950464));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 64, (-32482053), 789);
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-107726616), 4, 377820600);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 270093981 + "'", int3 == 270093981);
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1990388, 532423755, (-733892));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-32), 1517218488, 1371007);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-700), (-1450647), 533304932, (-299444533));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 285381314, (-1024844251));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-292471398995725814L) + "'", long2 == (-292471398995725814L));
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-34386307L), (-4723400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-39109707L) + "'", long2 == (-39109707L));
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-52957194), 149767755, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -52957194 for hi! must be in the range [149767755,9]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-620236597), 94534477);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -620236597 * 94534477");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 709908, 366310375248L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-366309665340L) + "'", long2 == (-366309665340L));
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-944351632), 124593832, (-1075328));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -944351632 for hi! must be in the range [124593832,-1075328]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (-2358351640919300070L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2358351640919300070L + "'", long2 == 2358351640919300070L);
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1548000), (-1763460086));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2729836213128000L + "'", long2 == 2729836213128000L);
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-46));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1989861), 219899, 1450732);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 193913417, 999000207, (-61117));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 193913417 for hi! must be in the range [999000207,-61117]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1624202872072L), (long) 159247253);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1624043624819L) + "'", long2 == (-1624043624819L));
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-222718530), (int) '4', (-9788880));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(63848486L, 65601928350156600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 63848486 * 65601928350156600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 229788587, 485754, (-4450697));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5802206573999812L), 308953822111200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -5802206573999812 * 308953822111200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-9892036412L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -9892036412");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 168544800, (long) 69665811);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 98878989L + "'", long2 == 98878989L);
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(883954L, (-323521822L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -285978408644188");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 13326602, 80635680, (-1470988428));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13326602 for hi! must be in the range [80635680,-1470988428]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 835739, (long) (-1369443));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1144496923377L) + "'", long2 == (-1144496923377L));
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9788880, (long) (-1370574));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13416384417120L) + "'", long2 == (-13416384417120L));
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1761730), 197);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-347060810L) + "'", long2 == (-347060810L));
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-78346), (long) 633647822);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -49643772262412");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(67962080, (-299315787));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 67962080 * -299315787");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-10318), (java.lang.Object) 103092720);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-576264862), (long) 89186674);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -51395146384848988");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3778206), (-54920));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 207499073520L + "'", long2 == 207499073520L);
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 998888097, (-80), (-963979));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 998888097 for  must be in the range [-80,-963979]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 442560, (-949417406), 677162);
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 350035111, 32482053, 4231920);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-100356795), 1681112017, (-1715696724));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -100356795 for  must be in the range [1681112017,-1715696724]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 35032, 66558, 725305);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35032 for hi! must be in the range [66558,725305]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-360), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(188152939, (-586809815), 2475);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-398659352) + "'", int3 == (-398659352));
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-177552), (-100459953), (-539633), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-265581) + "'", int4 == (-265581));
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-594279744), 37948040);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-556331704) + "'", int2 == (-556331704));
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3328392039093L), 71355223200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3328392039093 * 71355223200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(7971L, (long) 257951242);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2056129349982");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 606692L, (java.lang.Object) 1989523L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-349956067), 312315, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-177552), 353600846, 49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -177552 for  must be in the range [353600846,49]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(666098988, (-2112178), (-868));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1075288) + "'", int3 == (-1075288));
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 127833123245L, (java.lang.Object) 75443289);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(99684041);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-99684041) + "'", int1 == (-99684041));
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(904180783L, (long) 580601);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 904761384L + "'", long2 == 904761384L);
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-10689661), (-6380880172095338L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -10689661 * -6380880172095338");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 353600846, 0, 10308);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 353600846 for  must be in the range [0,10308]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(243405478620863L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 243405478620863");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1025206);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1025206) + "'", int1 == (-1025206));
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(47652415);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47652415) + "'", int1 == (-47652415));
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 1943430, 0, 1121717);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 821712 + "'", int4 == 821712);
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 17802, (java.lang.Object) 3499550);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1454524, 352818223, 1481377506);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1454524 for hi! must be in the range [352818223,1481377506]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1981541), (-1578695978), (-16591304));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1981541 for  must be in the range [-1578695978,-16591304]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-4256334), 80780254);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76523920 + "'", int2 == 76523920);
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1755920876), 0, (-84385200));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1755920876 for  must be in the range [0,-84385200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(635704265L, (long) 926179236);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 588776090479641540");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 85344156, 696404036, (-5252));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 85344156 for hi! must be in the range [696404036,-5252]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-531793), 34386308);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -531793 * 34386308");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 10689680, 1761394244, 207586242);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10689680 for  must be in the range [1761394244,207586242]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 87, (-394648137), (-317147951));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1532599571), 3035028, 41404775);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 40560097 + "'", int3 == 40560097);
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-87), 0, 125967105, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(232883752, 217526, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 16919594, 620, (-86));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16919594 for hi! must be in the range [620,-86]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-113827897), (-2288107), 0, (-317333540));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-177552), 1830524000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1830346448 + "'", int2 == 1830346448);
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-129402000), (-2581684), 577142280);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -129402000 for  must be in the range [-2581684,577142280]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) 0, 1713220673);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(377651447498160L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 377651447498160");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-952907498), (-349956067), (-1196950), (-1763459996));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(913332845, (-949417406), (-254849), (-1285742));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-30960482));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-30960482) + "'", int1 == (-30960482));
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 71700, (java.lang.Object) (-156303827607499200L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 12008529, (-2966L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12005563L + "'", long2 == 12005563L);
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-843852), 562466456350656L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -843852 * 562466456350656");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 66935, 1715046935, 2304264);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 66935 for hi! must be in the range [1715046935,2304264]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1722073065), 1711678817, 1119);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-733892), 53816, (-25655846));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -733892 for  must be in the range [53816,-25655846]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-87426300), (-304687800), (-56108421));
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-374603228), 4204094, 2195620);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-3013430), (-9788880), (-184));
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-515974));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 515974L + "'", long2 == 515974L);
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(640810929, 485754);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 641296683 + "'", int2 == 641296683);
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 350034159, (-1713170126));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-599668064278334034L) + "'", long2 == (-599668064278334034L));
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 827878, (-103393920L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -85597551701760");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-129926115), (long) (-1454524));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 188980652494260");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-103368527000L), (-6963094429000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -103368527000 * -6963094429000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1025206), 3509649, (-1470439267));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-222718530), (java.lang.Object) 577142280);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(6717380347885L, 789);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5300013094481265L + "'", long2 == 5300013094481265L);
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 97, (java.lang.Object) (-6983209393712L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(71355223200L, 11884449421090080L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11884520776313280L + "'", long2 == 11884520776313280L);
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 144522581, (-1713149062), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 144522581 for  must be in the range [-1713149062,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(401, (-150787433));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 401 * -150787433");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-217526), 502361, (-300979678));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-47416804), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-47416804L) + "'", long2 == (-47416804L));
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(158913734L, (long) 1742278);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 276871902646052");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 125783592, 31285122, 668094673);
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-22177769L), 841690790);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18666823910047510L) + "'", long2 == (-18666823910047510L));
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(145149152, (-1755920876), 600832203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 145149152 + "'", int3 == 145149152);
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 104199520, 532423755, (-4074));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-601292683), (-308759394));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -601292683 * -308759394");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 920, 8467, (-85369496));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9999), 162340189, 958464);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(18000, (-107726638), (-83374037));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-97392408) + "'", int3 == (-97392408));
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1563864028, (java.lang.Object) 8259371599815000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1763460000), (long) (-1801042329));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3176066105498340000L + "'", long2 == 3176066105498340000L);
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 66369120, (long) 488360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 32412023443200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1363364418L, (-92377287293020L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1363364418 * -92377287293020");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 192159473, 221881485L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42636629226057405L + "'", long2 == 42636629226057405L);
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 872L + "'", long2 == 872L);
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-3396800), (long) (-1763425054));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1766821854L) + "'", long2 == (-1766821854L));
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(161149465613713395L, (-1454614));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 161149465613713395 * -1454614");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-46266513L), 105840302932360535L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -46266513 * 105840302932360535");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(13238313787314L, (-93126513900000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 13238313787314 * -93126513900000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 20714400, 1454523, (-620));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20714400 for  must be in the range [1454523,-620]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-298964462), (-358046240), (-944118497));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(34386308, 1415768224, (-66534), (-4));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-21675) + "'", int4 == (-21675));
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(347695, (-96990431), 851);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96643588) + "'", int3 == (-96643588));
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-4485377), 302176499, (-66665530));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-204298726), (-947642470));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -204298726 * -947642470");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(998888097, (-8683));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 998879414 + "'", int2 == 998879414);
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-944117276), 1450548, (-352818133));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-169348721958674L), 21165430L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-169348700793244L) + "'", long2 == (-169348700793244L));
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 4637904, 239466083, 574676507);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4637904 for hi! must be in the range [239466083,574676507]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-193913417), 3480228, 3499553);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -193913417 for  must be in the range [3480228,3499553]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-98205378));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 98205378 + "'", int1 == 98205378);
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-47416804L), (java.lang.Object) 131567583380400L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 926161, 154440945, 1945308);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-207514663720000L), (long) (-46851));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -207514663720000 * -46851");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-54948), 1717850242, (-640941), 1830346448);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1717795294 + "'", int4 == 1717795294);
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-147271468), (-84205710L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 12401098525682280");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1607884553), 7664124L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1615548677L) + "'", long2 == (-1615548677L));
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 155277600, (-15961567), (-2294419));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 192159473, (-153251), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 399618, 20);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7992360L + "'", long2 == 7992360L);
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1830524000, (java.lang.Object) (-5772L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(25444, 80635684);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80661128 + "'", int2 == 80661128);
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2795634), (long) 184);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2795818L) + "'", long2 == (-2795818L));
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-109609108L), (-112013));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12277645014404L + "'", long2 == 12277645014404L);
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-345756003), (-34089228354420L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -345756003 * -34089228354420");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }
}

