package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(126547938, (-1713170126));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 126547938 * -1713170126");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1761079449), (-317147951));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2078227400) + "'", int2 == (-2078227400));
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-350000), (-521191424), 6289801);
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(920, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 920 + "'", int2 == 920);
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-920), (java.lang.Object) 1738657);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 9169, (-15651849), (-420368508));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 351, (-201), 1910207);
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-257), 350035111L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-89959023527L) + "'", long2 == (-89959023527L));
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 3611760);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3611760 + "'", int1 == 3611760);
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-48014510), 168579832, 54920, 46831);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 7739630, (-48014510), 920);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7739630 for hi! must be in the range [-48014510,920]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(260897140L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 260897140 + "'", int1 == 260897140);
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1711, (long) 99);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 169389L + "'", long2 == 169389L);
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) 100, (-999900));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-99990000) + "'", int2 == (-99990000));
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(590309473, 210, (-99370817), 100962303);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10689680) + "'", int4 == (-10689680));
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-32900781L), 35814600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1178328311202600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-954536506));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-954536506) + "'", int1 == (-954536506));
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-207514663720000L), (java.lang.Object) (-350000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(46322273);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46322273) + "'", int1 == (-46322273));
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3438639, (-47525247), 14428);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 217526, (long) (-3480386));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3262860L) + "'", long2 == (-3262860L));
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-521191424));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-34386390), 97621L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34288769L) + "'", long2 == (-34288769L));
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1588537255313989800L), 61432696953477L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1588537255313989800 * 61432696953477");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-51), 217526, 0, (-5203027));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(709901, (-490002));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 219899 + "'", int2 == 219899);
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9691), 18980207, 688);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1454524, (-2110080));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-655556) + "'", int2 == (-655556));
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 312315);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 312315 + "'", int1 == 312315);
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 199359, (-515974), (-1995555));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 199359 for  must be in the range [-515974,-1995555]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-601292683));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-601292683) + "'", int1 == (-601292683));
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 332622506970L, (java.lang.Object) 46930);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-349957368), (-214183750), (-10047), 20714400);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16143426 + "'", int4 == 16143426);
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(158, 335272154, 46930);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(711052, (-16990520), (-299785985));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 19559583600L, (java.lang.Object) (-1162088916120000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 479643, 577142280, (-489951));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-951491721L), (-4061026062L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3864032676758232702L + "'", long2 == 3864032676758232702L);
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1785587), (-1462491242), (-700), 440284);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 234356 + "'", int4 == 234356);
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-756956063135674L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -756956063135674");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-582302736L), (java.lang.Object) (-1618160290106L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(112110, (-848595844));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 112110 * -848595844");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(154650012, (-944117276));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-789467264) + "'", int2 == (-789467264));
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-18400), 1174365);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1155965 + "'", int2 == 1155965);
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(8259371599815000L, (long) (-27826));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 8259371599815000 * -27826");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(15171340861L, (-927286811700000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 15171340861 * -927286811700000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-950048943), 171478832, 302176499);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-198L), 318634906091096032L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -198 * 318634906091096032");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1167818605769088000L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1761394973, (-729));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1761394244 + "'", int2 == 1761394244);
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1713149062), (-949417406), (-15651849), (-299785985));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-312), (long) 112110);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34978320L) + "'", long2 == (-34978320L));
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-84385200), 31362155, 1990388, (-148474462));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(713480841L, (long) (-1990388));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 715471229L + "'", long2 == 715471229L);
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-20199512268L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -20199512268");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-29017039163616L), (-1616447619072L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -29017039163616 * -1616447619072");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-47585L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47585) + "'", int1 == (-47585));
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-76433), 590309465, (-152286));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-450684L), (long) 949417406);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-427887234205704L) + "'", long2 == (-427887234205704L));
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(20294940000L, (-211672136));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4295873299791840000L) + "'", long2 == (-4295873299791840000L));
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 532427871, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-43048525), (long) (-32091561));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1381494365997525L + "'", long2 == 1381494365997525L);
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 634, 87, (-1535304));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1989686), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1989686L) + "'", long2 == (-1989686L));
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 230746822, 10018638241505L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 230746822 * 10018638241505");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 44, (-35583340L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1565666960L) + "'", long2 == (-1565666960L));
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-920));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 920 + "'", int1 == 920);
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-32091561), 174629);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31916932) + "'", int2 == (-31916932));
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2103102L), (-276464450L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-278567552L) + "'", long2 == (-278567552L));
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(131986756L, (-668113249937923741L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-668113249805936985L) + "'", long2 == (-668113249805936985L));
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(970111);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-970111) + "'", int1 == (-970111));
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-65066), (long) (-22112703));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-22177769L) + "'", long2 == (-22177769L));
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 600842000, (-44), 2284622);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-8683), (long) 489444);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 480761L + "'", long2 == 480761L);
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16919594), (-442560));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17362154) + "'", int2 == (-17362154));
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3480228L), (-1715696283));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5971014243592524L + "'", long2 == 5971014243592524L);
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 2074908);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(48014600L, (-87426300));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4197738823980000L) + "'", long2 == (-4197738823980000L));
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-254849));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 254849 + "'", int1 == 254849);
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1530017442), 1234120, 0, (-99370817));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-868));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 868 + "'", int1 == 868);
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(62000L, (-827878));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-51328436000L) + "'", long2 == (-51328436000L));
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1737870, 98049000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 170396415630000000L + "'", long2 == 170396415630000000L);
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(349879109L, (-4652513355229353540L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 349879109 * -4652513355229353540");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-84205710L), 10049);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-846183179790L) + "'", long2 == (-846183179790L));
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(520, 199359);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 199879 + "'", int2 == 199879);
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-30352410), (-1763425054), 112110, 1185347686);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 576693690 + "'", int4 == 576693690);
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 628023133, (-634344346), 15345);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(212411343);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-212411343) + "'", int1 == (-212411343));
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(10018356553040L, (long) 44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 440807688333760L + "'", long2 == 440807688333760L);
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-704619699), 176421201, 335272134, 2005430);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1234120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1234120) + "'", int1 == (-1234120));
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 351665413, (-58976258072827L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58976609738240L + "'", long2 == 58976609738240L);
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3329092237737L, (long) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 26632737901896");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 843887, 99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [843887,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 634, 17722308676356L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 11235943700809704");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 3598, 155277797L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 155281395L + "'", long2 == 155281395L);
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1463930951L), (long) 71700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1463859251L) + "'", long2 == (-1463859251L));
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 304461011, 47986684L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 14610074325177524");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-1624202872072L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1624202872072");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(99832182L, (long) 258662);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100090844L + "'", long2 == 100090844L);
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-4506), 35, (-9999));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4506 for hi! must be in the range [35,-9999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 628056570, 6289801, (-951493178));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1989686), (-164837960), 3909);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1989686) + "'", int3 == (-1989686));
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-738L), 6043234517363526120L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6043234517363525382L + "'", long2 == 6043234517363525382L);
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 11862880, (long) 1174365);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13931351071200L + "'", long2 == 13931351071200L);
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(172893415034802L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 172893415034802");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1989861), (long) 1788087917);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1790077778L) + "'", long2 == (-1790077778L));
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-934667), (-1000), (-944117276));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(3652836L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3652836 + "'", int1 == 3652836);
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(532281952);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-532281952) + "'", int1 == (-532281952));
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-8372910), 8700);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -8372910 * 8700");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(155277797L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 155277797 + "'", int1 == 155277797);
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1597671, 3561650, (-601337));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-339652577372970212L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -339652577372970212");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-18036981473349L), (-322));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5807908034418378L + "'", long2 == 5807908034418378L);
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 48456409752000520L, (java.lang.Object) 936406936L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-8700000), (-300969900), 2582129);
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-970111), (long) 174629);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-169409513819L) + "'", long2 == (-169409513819L));
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-58976258072827L), (java.lang.Object) 709790);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(31362155, (-155277600));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 31362155 * -155277600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 258662);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 258662 + "'", int1 == 258662);
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-100188684), (-1000), (-169916106), 257572119);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-100189684) + "'", int4 == (-100189684));
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(35517209365L, 198481264L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35318728101L + "'", long2 == 35318728101L);
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(260897140L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-352818223));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 352818223 + "'", int1 == 352818223);
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1277533), (-152286), 3509649);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2384403 + "'", int3 == 2384403);
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-700), 0);
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 100962303, 210);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21202083630L + "'", long2 == 21202083630L);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5252), 533310184);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 533304932 + "'", int2 == 533304932);
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(185867148, (-153066));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 185867148 * -153066");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1686886240);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1686886240) + "'", int1 == (-1686886240));
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1056), (-1999662));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2111643072 + "'", int2 == 2111643072);
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-108109069), 100978790, 349956900);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 140869042 + "'", int3 == 140869042);
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-350035111));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 350035111 + "'", int1 == 350035111);
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1196950), 1010, (-9719));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1492005L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1492005 + "'", int1 == 1492005);
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1068825878L), 53248);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-56912840351744L) + "'", long2 == (-56912840351744L));
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 872, (long) 1943780);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1694976160L + "'", long2 == 1694976160L);
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10), (-873));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8730 + "'", int2 == 8730);
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2005430, 156879, (-954811));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2005430 for hi! must be in the range [156879,-954811]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6983102989863L), (long) (-106403849));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6983209393712L) + "'", long2 == (-6983209393712L));
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 112110, (-53553755), 1121617);
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 649332, (-1695970979948785703L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 649332 * -1695970979948785703");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-48512377), 63244232);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3068128025859464L) + "'", long2 == (-3068128025859464L));
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1761078660), (-1454524), 100459953);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 73381944 + "'", int3 == 73381944);
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-211672136), 1989700, 108685080, (-100460641));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 302176499, 9798, (-1988776));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-7633), (-524160));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-531793) + "'", int2 == (-531793));
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-531793));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 531793 + "'", int1 == 531793);
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 709790);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 709790 + "'", int1 == 709790);
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(64244);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-64244) + "'", int1 == (-64244));
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(217526, (-168472090));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-168254564) + "'", int2 == (-168254564));
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3337664, (-152286), 8700, (-1715696724));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-168573390));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 168573390 + "'", int1 == 168573390);
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(27L, 1620);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 43740L + "'", long2 == 43740L);
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1023876541100647L, (-299315787));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1023876541100647 * -299315787");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-56464401015740232L), (java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 0, (-105975170), 97960);
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 952907498, 99832172L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1052739670L + "'", long2 == 1052739670L);
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-489444), 132, (-1715160045));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -489444 for  must be in the range [132,-1715160045]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-168254564), (-5252), 872);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-169409513819L), (long) (-1711678817));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -169409513819 * -1711678817");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 4479918, 302176499, (-521191424));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(576131381, (-1999671));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 576131381 * -1999671");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-100459953), (-1766929518), 335272134);
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(5571553, 95781);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 5571553 * 95781");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(99593070, (-10221043));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89372027 + "'", int2 == 89372027);
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1765498096L, (java.lang.Object) (-2235115L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-105840302582228171L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -105840302582228171");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(21674203800L, 61432696953477L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61454371157277L + "'", long2 == 61454371157277L);
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 95336384, 5899809);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 562466456350656L + "'", long2 == 562466456350656L);
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1464528196L, (long) (-580601));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-850306535125796L) + "'", long2 == (-850306535125796L));
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 10100, 0, 493779);
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(7932691079037252L, (long) (-1763425054));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7932689315612198L + "'", long2 == 7932689315612198L);
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(34386390, 17329373);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 34386390 * 17329373");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(22759878, (-10221043), (int) (short) 10, (-171469054));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(155279264, 0, (-106412530), (-83850));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-57378098) + "'", int4 == (-57378098));
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-302176508), (-5625086), (-1715696724));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-188219723913127200L), 9778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -188219723913127200 * 9778");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(17319362033L, (long) (-64244));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1112665094448052L) + "'", long2 == (-1112665094448052L));
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-161986));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 161986 + "'", int1 == 161986);
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(532428184L, (long) (-212411343));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 320016841L + "'", long2 == 320016841L);
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10, 1470988428, 9989, (-874263));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3664729514250000L), (java.lang.Object) (-108685080));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 185867148, 17329373);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-708510), (-3499569), (-1285742));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2922338) + "'", int3 == (-2922338));
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1155965, (-1715160045), 351);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 507005, 30426045177834L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 507005 * 30426045177834");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-168573390), 51, (-161986));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 9700, (long) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9700) + "'", int2 == (-9700));
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-155277600), (long) (-1989687));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 308953822111200L + "'", long2 == 308953822111200L);
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-767454452), (-2304106), 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(976536, (-6564960));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5588424) + "'", int2 == (-5588424));
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(149158);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-149158) + "'", int1 == (-149158));
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 169182050, (long) 1155965);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 195568528428250");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 177664191, 586810735, (-949512368));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 6015);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(21674203800L, 189935540116053039L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 21674203800 * 189935540116053039");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(8467, 15345);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 129926115 + "'", int2 == 129926115);
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 240395216033566L, (java.lang.Object) 1470998628L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 601423);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 601423 + "'", int1 == 601423);
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8700), (long) (-1755570876));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15273466621200L + "'", long2 == 15273466621200L);
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 350034159, (long) (-106462890));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-37265648165859510L) + "'", long2 == (-37265648165859510L));
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1784714), (-4256334), 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1784714) + "'", int3 == (-1784714));
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-10047));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10047) + "'", int2 == (-10047));
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-15127035840L), (long) 700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15127036540L) + "'", long2 == (-15127036540L));
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(97180281, 9864, (-100459952));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-288303652), 155277732);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44767137209877264L) + "'", long2 == (-44767137209877264L));
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-221718630), 944118497, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 16143426);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16143426 + "'", int1 == 16143426);
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-129148057));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-129148057) + "'", int1 == (-129148057));
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-17899), (-299552), 217526);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-17899) + "'", int3 == (-17899));
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 78558096027L, (java.lang.Object) 197L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1763460000, 1705, (-2065028));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3724438550L), (long) 3499650);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3720938900L) + "'", long2 == (-3720938900L));
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(32482072, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32482072 + "'", int2 == 32482072);
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2281487435712000L, 669);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1526315094491328000L + "'", long2 == 1526315094491328000L);
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 46831, (java.lang.Object) (-3035028));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(101009154, (-700));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101008454 + "'", int2 == 101008454);
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(440284, 590309465, 18980207);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1802640000, 64, 420368508);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8700000), 406062L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3532739400000L) + "'", long2 == (-3532739400000L));
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-300551), (-4785376), 8730);
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1777044432L, (long) (-970000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1723733099040000L) + "'", long2 == (-1723733099040000L));
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(100963131, (-47524559), 124486545);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100963131 + "'", int3 == 100963131);
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1482832080, (-3277662), (-1794561), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-959232) + "'", int4 == (-959232));
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-745951280955101L), (-291727565551190L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1037678846506291L) + "'", long2 == (-1037678846506291L));
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1760510603), (long) 9778);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17214272676134L) + "'", long2 == (-17214272676134L));
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) 10, 19907100, (-27));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for hi! must be in the range [19907100,-27]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(167762300L, 350035111);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58722695302115300L + "'", long2 == 58722695302115300L);
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-106462890), 87);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9262271430L) + "'", long2 == (-9262271430L));
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3035028), 3598);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3031430) + "'", int2 == (-3031430));
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-442560), (-100189684), 52);
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9691, 102843302575698L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 996654445261089318L + "'", long2 == 996654445261089318L);
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 999000207, 48014510);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47966505429003570L + "'", long2 == 47966505429003570L);
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-147147648399672000L), (-1953880));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -147147648399672000 * -1953880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 973781, (-4506), 9999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 973781 for hi! must be in the range [-4506,9999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-106575000), (-185867227), 10000);
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(99835728L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99835728 + "'", int1 == 99835728);
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 399618, 1980223L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 791332754814");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1762676017), (-164837960), 46851);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-113827897) + "'", int3 == (-113827897));
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1995555), (java.lang.Object) 16855341570L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(6069060510816L, 130289873L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6069190800689L + "'", long2 == 6069190800689L);
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 105975170, 0, (-1989687));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 105975170 for  must be in the range [0,-1989687]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(5148L, 47525347);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 244660486356L + "'", long2 == 244660486356L);
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(6962637666600L, (-739153218419798L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-732190580753198L) + "'", long2 == (-732190580753198L));
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(46818643568457600L, 7481595445632000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54300239014089600L + "'", long2 == 54300239014089600L);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(44, (-202050186), 300979678, 30906162);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46930, 1786407669);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83836111906170L + "'", long2 == 83836111906170L);
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1470988428, 10552, (-8467));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1664, (long) (-62000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-103168000L) + "'", long2 == (-103168000L));
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(18867, 3499553);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 18867 * 3499553");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(347880555, 52, (-357608543), 9875);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-9737812) + "'", int4 == (-9737812));
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-43048525), 1185347686);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -43048525 * 1185347686");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(14308, (-322));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13986 + "'", int2 == 13986);
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 600842000, 0, (-816756018));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 94401367, (-100), 576131381);
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 351665413);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 152257, (java.lang.Object) (-100459953));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1174365, (-301838202));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1174365 * -301838202");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-68277286), (-53248));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -68277286 * -53248");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-767454452), (-1879789912));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1442653136789088224L + "'", long2 == 1442653136789088224L);
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1737870);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1737870) + "'", int1 == (-1737870));
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-112185551037401280L), (long) 158);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -112185551037401280 * 158");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(19559583600L, 400795139);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7839386027744120400L + "'", long2 == 7839386027744120400L);
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1717685969));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1717685969) + "'", int1 == (-1717685969));
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-934667), 9797, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-22112703), (int) (byte) 1, 339161818);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 317049115 + "'", int3 == 317049115);
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(64, 46831);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46895 + "'", int2 == 46895);
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2284512), 908660727, (-43296));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1989686), 45091, (-298964462));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2005438), (long) (-15805100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17810538L) + "'", long2 == (-17810538L));
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(9415359753861600L, 7355177877L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9415367109039477L + "'", long2 == 9415367109039477L);
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1990710, (-655556), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-631518) + "'", int3 == (-631518));
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1761078660), 1117972070, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1761078660 for  must be in the range [1117972070,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3490491590411791L), (long) 592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2066371021523780272");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(873, (-6768000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 873 * -6768000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1755920876), 947642470, (-1450548));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 420368508, (-1790077778L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-752492324741815224L) + "'", long2 == (-752492324741815224L));
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1990388), (java.lang.Object) (-2235115L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(132, 304461011, (-412));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(99899989L, 609053028);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60844390797616692L + "'", long2 == 60844390797616692L);
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 420358630, (-66558), 577);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(231190314, 4476722, (-1711678817));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(191697613241321780L, (-1329383L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 191697613242651163L + "'", long2 == 191697613242651163L);
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 31508272, 52672, 1784800);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31508272 for  must be in the range [52672,1784800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5148, 126547938, (-521191424), 9798);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-394648137) + "'", int4 == (-394648137));
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2716524810L), (-5237327346300000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2716524810 * -5237327346300000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(112110);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-112110) + "'", int1 == (-112110));
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-10), (-9), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-21674210715L), (long) (-2284512));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-21676495227L) + "'", long2 == (-21676495227L));
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(20983581987500L, (long) 126547938);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 20983581987500 * 126547938");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (byte) 100, (java.lang.Object) 99835208L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-85250028), (-108109069), 1370574, (-4485377));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1755920876), (-102950433), 2111643072);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1711, (-112110), 24429098);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1711 + "'", int3 == 1711);
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeAdd((-590309465), (-1786407669));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -590309465 + -1786407669");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-29017121375578L), (long) 26511982);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -29017121375578 * 26511982");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(5740);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5740) + "'", int1 == (-5740));
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(843887);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-843887) + "'", int1 == (-843887));
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(66747848L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 66747848 + "'", int1 == 66747848);
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 350000, (java.lang.Object) 212411343);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 881233968378231L, (java.lang.Object) (-952557498));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-749972960145811L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-843887), (-10100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3053498160L, (java.lang.Object) 52698L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-349946851), (long) 105975160);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-455922011L) + "'", long2 == (-455922011L));
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-570400));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-570400) + "'", int1 == (-570400));
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-451), 34386308, (-53553755), 949348709);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34385857 + "'", int4 == 34385857);
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 709960, (-1989700), 1766929518);
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1765497216L, (-8700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15359825779200L) + "'", long2 == (-15359825779200L));
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(576131381, 3828, (-89));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(489951, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2005438), 13986, (-99), 2284709);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 293357 + "'", int4 == 293357);
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-153066), (-2529996136059146L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2529996135906080L + "'", long2 == 2529996135906080L);
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5588424), (-1989686));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -5588424 * -1989686");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(13481055545531100L, (-1431L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13481055545529669L + "'", long2 == 13481055545529669L);
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-89178884), (-29503627297L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29414448413L + "'", long2 == 29414448413L);
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(304989469628640240L, 97405);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 304989469628640240 * 97405");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(168573390);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-168573390) + "'", int1 == (-168573390));
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-967528812442500L), (-1695970979948785703L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1696938508761228203L) + "'", long2 == (-1696938508761228203L));
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 6015, (-18980207));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 14227, (long) (-2078227400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2078213173L) + "'", long2 == (-2078213173L));
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 19907100, 212411343, (-954536506));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19907100 for  must be in the range [212411343,-954536506]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-2078227400), (-530216924), (-17899));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2078227400 for  must be in the range [-530216924,-17899]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 339161818, 22199491, (-47524559));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 339161818 for hi! must be in the range [22199491,-47524559]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-69931974934731104L), 2865594368L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69931977800325472L) + "'", long2 == (-69931977800325472L));
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(949417406, (-257));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 949417406 * -257");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 76433, (-9123345), (-9700));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-873812), (-868));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 758468816 + "'", int2 == 758468816);
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1763940348L), (-2607622394937982L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2607624158878330L) + "'", long2 == (-2607624158878330L));
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2065028, 34385857, 344919305);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 312598477 + "'", int3 == 312598477);
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 2294419, (-190217798), 3499553);
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1990810, (java.lang.Object) 351375808265460L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-10221043));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10221043) + "'", int1 == (-10221043));
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4785376), (-963979), 1784800);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1454874), 1784800, 10001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-349956635));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-36008045213600L), 1442653136789088224L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1442617128743874624L + "'", long2 == 1442617128743874624L);
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 17802);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17802 + "'", int1 == 17802);
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-299315787));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 299315787 + "'", int1 == 299315787);
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-212088719817951L), (-80635680));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -212088719817951 * -80635680");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9123345), 101931854, 1492005);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1010899), (-14307));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1025206) + "'", int2 == (-1025206));
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-863620), 1990810);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -863620 * 1990810");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-489951), 155277600, (-301838202));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -489951 for  must be in the range [155277600,-301838202]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 801902322, 58976609738240L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58977411640562L + "'", long2 == 58977411640562L);
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(7089931017340773L, (-301424041786728630L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-294334110769387857L) + "'", long2 == (-294334110769387857L));
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-163115), (-9123345));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9286460) + "'", int2 == (-9286460));
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(198471500L, (long) (-349956900));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-151485400L) + "'", long2 == (-151485400L));
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-100459953), (long) (-106394130));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10688349299275890L + "'", long2 == 10688349299275890L);
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-47524559L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47524559) + "'", int1 == (-47524559));
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-17899), (-617122848L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11045881856352L + "'", long2 == 11045881856352L);
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(6069060510816L, (-1761176514));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 6069060510816 * -1761176514");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-312315), 8259371599815000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -312315 * 8259371599815000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 254849, 9788, (-1999662));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 254849 for  must be in the range [9788,-1999662]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(95781, 14227, 874263, 21064);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3459553775567890L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(21963942, (-3277662));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18686280 + "'", int2 == 18686280);
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-4446561L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4446561) + "'", int1 == (-4446561));
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-96), 950048943);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -96 * 950048943");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(299785985L, (long) 420368508);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 126020587233760380");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-89178884), (-210), (-8372910));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(47966505429003570L, 16855341570L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47966522284345140L + "'", long2 == 47966522284345140L);
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 51, (-1943430));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99114930L) + "'", long2 == (-99114930L));
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1989700, (-5625086), 161986);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1989700 for hi! must be in the range [-5625086,161986]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2161648995684L), 62000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-134022237732408000L) + "'", long2 == (-134022237732408000L));
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(5571553L, 10308);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57431568324L + "'", long2 == 57431568324L);
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1942080), 293357, 1954327840, 524160);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(9798, 344919305);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 9798 * 344919305");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 709901, 34386308, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1370574L, 620L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 849755880L + "'", long2 == 849755880L);
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 999000207, (-468), (-10001));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-40322560), (long) (-301848066));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 12171286752168960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1715159045));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1715159045 + "'", int1 == 1715159045);
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1989686L), 34996500000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34994510314L + "'", long2 == 34994510314L);
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1, 1802640000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1802640001 + "'", int2 == 1802640001);
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(48456408803896934L, 63244232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 48456408803896934 * 63244232");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-158159661L), (-2304264L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-155855397L) + "'", long2 == (-155855397L));
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(20714400, (-100188684));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 20714400 * -100188684");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 488360, 6407448057348624L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6407448056860264L) + "'", long2 == (-6407448056860264L));
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-149158));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-149158) + "'", int1 == (-149158));
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-4197738823980000L), (java.lang.Object) 3909);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-15127035840L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15127035840L) + "'", long2 == (-15127035840L));
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-64244), 9798, (-3909), (-22112703));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(17423, (int) (byte) -1, (-9737812));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9788880), (-399618));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -9788880 * -399618");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9778), 5899809);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -9778 * 5899809");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(688309020, 600842000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1289151020 + "'", int2 == 1289151020);
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(27, (-111));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2997) + "'", int2 == (-2997));
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 649332, (-441));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 304461111, (-597509), 758468816);
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2922338), (-1838776), (-16990520), 1712671034);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4761114) + "'", int4 == (-4761114));
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(10100, 2284622);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2294722 + "'", int2 == 2294722);
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 48456411467159045L, (java.lang.Object) (-87426300));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-597509), 293357, (-40322560));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -597509 for  must be in the range [293357,-40322560]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 531793);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 531793 + "'", int1 == 531793);
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-312));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-312) + "'", int1 == (-312));
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-38868600));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38868600 + "'", int1 == 38868600);
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(633115409);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-633115409) + "'", int1 == (-633115409));
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(93058894920275207L, (long) (-61117));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93058894920336324L + "'", long2 == 93058894920336324L);
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(480761L, (long) 1481377506);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1481858267L + "'", long2 == 1481858267L);
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-114080), 318634906091096032L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-318634906091210112L) + "'", long2 == (-318634906091210112L));
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1802640000), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1802640000) + "'", int2 == (-1802640000));
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-146793024), (-14149));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2076974496576L + "'", long2 == 2076974496576L);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 32482052, 3499585, 999000207);
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1402774760439L, (java.lang.Object) (-300979678L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1989687), 153428, 335272134);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1989687 for hi! must be in the range [153428,335272134]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1715696724), (long) 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -602209550124");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1989524), (-153251), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(46831, 1943780, (-812374164), 420358630);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1990611 + "'", int4 == 1990611);
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-297481271), (-173543841), (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 301848066);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 301848066 + "'", int1 == 301848066);
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 97960, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(63702693L, (long) 1788088016);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 113906021940227088");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1450647), (-601423), 1686886240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1686037017 + "'", int3 == 1686037017);
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-8372910));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8372910 + "'", int1 == 8372910);
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10, (-173467889L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1734678890L) + "'", long2 == (-1734678890L));
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-401679315779397770L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-4256334), (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-148971690L) + "'", long2 == (-148971690L));
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 479643, (-3996339497L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3996819140L + "'", long2 == 3996819140L);
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 952906578, 0, 420358630);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(14308, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14343 + "'", int2 == 14343);
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10398), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 601423, 711148, 533310184);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-190217798), (long) (-1711678817));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 325591775452984966L + "'", long2 == 325591775452984966L);
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-85342), (long) 299795783);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-299881125L) + "'", long2 == (-299881125L));
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-339652577372970212L), 801884423L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -339652577372970212 * 801884423");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-35583340L), 119398608L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4248601263990720");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1505073, (-352818223), 350034159);
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-3469518), (long) 24429098);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27898616L) + "'", long2 == (-27898616L));
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 374064183, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1954327840, (-66534));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-130029248506560L) + "'", long2 == (-130029248506560L));
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(7451, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(688, (-2250));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1548000) + "'", int2 == (-1548000));
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-222718530), (-17899), (-3480228));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2658977, 349432740);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 929133618706980L + "'", long2 == 929133618706980L);
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-951492298));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-951492298) + "'", int1 == (-951492298));
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(63702638L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63702638 + "'", int1 == 63702638);
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-8683), (-298964462));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -8683 * -298964462");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-232883752));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 232883752 + "'", int1 == 232883752);
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1945308, 351655538);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 353600846 + "'", int2 == 353600846);
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-115104), 874089, 212411343);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -115104 for  must be in the range [874089,212411343]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-171478832));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-171478832) + "'", int1 == (-171478832));
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-69931974933849952L), (-23067514));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -69931974933849952 * -23067514");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(668113251143498516L, (long) 576131381);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 668113250567367135L + "'", long2 == 668113250567367135L);
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(62140372134160L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62140372134160L + "'", long2 == 62140372134160L);
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-14307), 3038L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11269L) + "'", long2 == (-11269L));
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-5434716000000L), 16348845600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5451064845600L) + "'", long2 == (-5451064845600L));
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5234757L), 16143426);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-84506912257482L) + "'", long2 == (-84506912257482L));
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2294722, 709901, (-1010899));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9), (-920), 0);
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-868), (-236129206), 586810735, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-97405), (long) (-1990710));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1893305L + "'", long2 == 1893305L);
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 619, (-6307349000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3904249031000L) + "'", long2 == (-3904249031000L));
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 101931854, (-4665), (-442560));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 101931854 for  must be in the range [-4665,-442560]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1495740L, (-78821040203L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-117895782673235220L) + "'", long2 == (-117895782673235220L));
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-30032076683980800L), (long) 628023133);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -30032076683980800 * 628023133");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-107726616), (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-107726638) + "'", int2 == (-107726638));
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1784714), 709960, 212411343, (-317147951));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(239543574400L, (long) (-68697));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 239543643097L + "'", long2 == 239543643097L);
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-944118497), 4043031, (-35032), 1788088016);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 848047583 + "'", int4 == 848047583);
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(619, (-1142));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-523) + "'", int2 == (-523));
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-15963399L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-152286), (long) 249426407);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-37984149816402L) + "'", long2 == (-37984149816402L));
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-592), (-112110));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66369120 + "'", int2 == 66369120);
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-98205378L), (java.lang.Object) 312315);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(312315, (-1766929518));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1766617203) + "'", int2 == (-1766617203));
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-4485377), 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4485350) + "'", int2 == (-4485350));
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-7633), (-711052), 35032);
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(297515510254075L, (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2975155102540750L) + "'", long2 == (-2975155102540750L));
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 171478518, (java.lang.Object) 147147648403856120L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-944118497), 531793, (-1761479067));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-515974), (long) (-999900));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 515922402600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-1925124040), 952907498);
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-115104), 63702638, 843852);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-597509), 1990710, 66369120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 63780902 + "'", int3 == 63780902);
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-19L), 314968500L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 314968481L + "'", long2 == 314968481L);
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(531793, (-1967089), 100978790, (-2581684));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1999672), 2005430);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5758 + "'", int2 == 5758);
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 6289801, (long) 874089);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5497845866289");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1462497014L), (-5827584583260000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5827586045757014L) + "'", long2 == (-5827586045757014L));
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-536575), 10552, (-1981541));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-34386408));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34386408) + "'", int1 == (-34386408));
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2112178L), (-18048122527557L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2112178 * -18048122527557");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-146793024), (-112110), (-96));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -146793024 for hi! must be in the range [-112110,-96]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 132, 863097812129976L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 863097812130108L + "'", long2 == 863097812130108L);
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1990810, (-441), 3337664);
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 3045000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3045000L + "'", long2 == 3045000L);
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 586809815, 176411220, (-30352410));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-146793024), (java.lang.Object) (-590309465));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 12100448, (-10001), 176421201);
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-299552), 161986, (-89178884));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(257397490, (-300551));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 257397490 * -300551");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(14428, (-970111), 0, (-18980207));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-9286460), 349956635, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9286460 for hi! must be in the range [349956635,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(904180783L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 904180783 + "'", int1 == 904180783);
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-37993868L), 976536);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-37102379881248L) + "'", long2 == (-37102379881248L));
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-204685393), (long) 299315787);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 94630394L + "'", long2 == 94630394L);
    }
}

