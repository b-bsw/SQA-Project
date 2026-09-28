package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

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
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 115104, 0, 34386408);
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-44735852), 66369120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -44735852 * 66369120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-169916106), (-1056), 1139);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -169916106 for hi! must be in the range [-1056,1139]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(100962303, (-3013430), (-1737870), (-1990611));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1482832080, 10398, 86130, 2004988);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1483330 + "'", int4 == 1483330);
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-26020763));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26020763 + "'", int1 == 26020763);
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 11, (-3791833344L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -41710166784");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9169), 576693690, (-208569710));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-168443407), 580601);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -168443407 * 580601");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1715160045), (java.lang.Object) 1023876604803240L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-6915), (-7098290050L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49084675695750L + "'", long2 == 49084675695750L);
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(951492297, 179892881);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 951492297 * 179892881");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 252294596, (-53318417), (-634344346));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 252294596 for hi! must be in the range [-53318417,-634344346]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-168572690), (-1713170345), 1025353728);
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 504032, (java.lang.Object) 188112985);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(160349719810281408L, 28417671774530L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 160378137482055938L + "'", long2 == 160378137482055938L);
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-489951), (java.lang.Object) (-40322560));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 107336979, (-168491100L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 275828079L + "'", long2 == 275828079L);
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(15273466621200L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15273466621200L + "'", long2 == 15273466621200L);
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(18686280, (-935157147), (-10398));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-916460470) + "'", int3 == (-916460470));
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-185890406320L), (-173612538));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -185890406320 * -173612538");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-3499650), 485754, (-160969));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3499650 for  must be in the range [485754,-160969]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-20550566L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-336230297424L), (java.lang.Object) (-127144987200L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 18867, 959232, (-100189684));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 18867 for  must be in the range [959232,-100189684]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 54920, (-246728990215L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-246728935295L) + "'", long2 == (-246728935295L));
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1786407669), (-4857700530057795244L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4857700528271387575L + "'", long2 == 4857700528271387575L);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(129926115, 3038, 49, 116558851);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13370350 + "'", int4 == 13370350);
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 24429098, 0, (-198112800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-374064183), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1221), (-51328436000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-51328437221L) + "'", long2 == (-51328437221L));
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-749972960145811L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -749972960145811");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 3005390, (long) 695393);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2309997L + "'", long2 == 2309997L);
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 10398, (-84666359319954741L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84666359319965139L + "'", long2 == 84666359319965139L);
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(296192052, 9553, 3499650, 973781);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1131664606224480L, 2036462497L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1131664606224480 * 2036462497");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 485754, (long) (-635218511));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 635704265L + "'", long2 == 635704265L);
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(206988733L, (-30827186));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6380880172095338L) + "'", long2 == (-6380880172095338L));
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6959097919711L), (-3312889712L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6962410809423L) + "'", long2 == (-6962410809423L));
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 543958, (-244802), (-8332947));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1000), 3461411, (-1953880));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-530216924), (-1450647), (-159247253));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -530216924 for hi! must be in the range [-1450647,-159247253]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3499650, (-15294192550559L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3499650 * -15294192550559");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2051278), 97180281, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-167699127L), (-21676495227L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3635129325987566829L + "'", long2 == 3635129325987566829L);
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(5573069075083267296L, 4991467664221L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 5573069075083267296 * 4991467664221");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5740), 0, 63649178);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(8579157299706240000L, (long) 331157);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8579157299705908843L + "'", long2 == 8579157299705908843L);
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 188112985, 22632004046400L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 188112985 * 22632004046400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 21064, (-709901), (-1990611));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 103092720, (-173612538), (-3760577));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 103092720 for hi! must be in the range [-173612538,-3760577]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 168544800, (long) (-40998));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 168503802L + "'", long2 == 168503802L);
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-228805573L), (-1761479067));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 403036227252440391L + "'", long2 == 403036227252440391L);
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 92000, (-157922), (-6289801));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(66747945L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66747945L + "'", long2 == 66747945L);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(10047, (-212411343));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 10047 * -212411343");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(733892);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-733892) + "'", int1 == (-733892));
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 3044690, 9762232687649273L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9762232684604583L) + "'", long2 == (-9762232684604583L));
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 296189014, (long) (-951492298));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-655303284L) + "'", long2 == (-655303284L));
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 782, (-349L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-272918) + "'", int2 == (-272918));
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(176411220, (-100459952));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 176411220 * -100459952");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-633115409), 10049);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-633105360) + "'", int2 == (-633105360));
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-105747297328661760L), (long) (-3909));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105747297328657851L) + "'", long2 == (-105747297328657851L));
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 36740191, (-593492528071674L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 36740191 * -593492528071674");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(2160936492400L, 119398608L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2160817093792L + "'", long2 == 2160817093792L);
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1999672), (-1715696724), (-4485355));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1377398900), 9778, 8700, (-1893305));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 10689680, 580601, (-1999672));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10689680 for hi! must be in the range [580601,-1999672]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-161986), (-539633));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-701619) + "'", int2 == (-701619));
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3712535950064023737L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3712535950064023737");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(221881485L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 221881485 + "'", int1 == 221881485);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3958825204L, 243405478620863L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 243409437446067L + "'", long2 == 243409437446067L);
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(199251536, (-88481780), 153428);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-66654091) + "'", int3 == (-66654091));
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3664729527270480L), (java.lang.Object) (-1734643853289776L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-30829218210000L), 1131664606224480L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1100835388014480L + "'", long2 == 1100835388014480L);
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3652836, (-1715149542), (-1530017442), (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-181479211) + "'", int4 == (-181479211));
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1481377506, 1794561, 833);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9477L, (-576));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5458752L) + "'", long2 == (-5458752L));
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3045000), 11045881856352L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3045000 * 11045881856352");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-106820930), 20);
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1277533), 1943430);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2482795958190L) + "'", long2 == (-2482795958190L));
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 6960, (-210), 8990);
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1794989), 57046, 85229052);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 83377018 + "'", int3 == 83377018);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 952907498, (long) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 7623259984");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(16354184429875L, 39316013528L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16393500443403L + "'", long2 == 16393500443403L);
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-873812), (long) 106575000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-93126513900000L) + "'", long2 == (-93126513900000L));
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-523), 7801164);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4080008772L) + "'", long2 == (-4080008772L));
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-372968475390049L), (java.lang.Object) 34994510314L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-137071589522478L), (long) (-106412530));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-137071695935008L) + "'", long2 == (-137071695935008L));
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(48456411170162501L, (-6138000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 48456411170162501 * -6138000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-211642072), (-112013), 1712604379);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -211642072 for hi! must be in the range [-112013,1712604379]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-105755151702690L), (-5237326755990527L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5131571604287837L + "'", long2 == 5131571604287837L);
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1718668813L, 197508341L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 339451425984069233L + "'", long2 == 339451425984069233L);
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-26511982));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(102842602671947L, (-96990431));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 102842602671947 * -96990431");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1785587));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1785587) + "'", int1 == (-1785587));
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-949417406), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-949417406L) + "'", long2 == (-949417406L));
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2014471, (java.lang.Object) (-18244195486692480L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-4506), 576);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3930) + "'", int2 == (-3930));
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1120), 0, (-848595844));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(218684298L, 42266000125440L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 218684298 * 42266000125440");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-53553755), 576693690, 8941480);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -53553755 for hi! must be in the range [576693690,8941480]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(155279264, 952038643);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1107317907 + "'", int2 == 1107317907);
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-351944703L), (-336926304L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 118579427994167712L + "'", long2 == 118579427994167712L);
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-10221043), (long) 231190314);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 220969271L + "'", long2 == 220969271L);
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-209963625615216L), (long) (-17287333));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -209963625615216 * -17287333");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(584515483, (-5571553), 162340189);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 80780254 + "'", int3 == 80780254);
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-38868784L), (java.lang.Object) (-2336523L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2923493247072L), 2495915272L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2923493247072 * 2495915272");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-539633), (long) (-2582129));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2042496L + "'", long2 == 2042496L);
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(122377675L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 122377675 + "'", int1 == 122377675);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(52895330633483316L, (long) (-1802640000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 52895330633483316 * -1802640000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1763453171L, 47234L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 83294947079014");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(100962303, 638821068);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 739783371 + "'", int2 == 739783371);
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-301424014619826120L), (java.lang.Object) (-927286817838000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 8730, 0, 1174573);
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-10000), (-10100), 63649227);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10000) + "'", int3 == (-10000));
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-485588104), (long) 217526);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-485805630L) + "'", long2 == (-485805630L));
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-9778), 168573390, 1715160045);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9778 for  must be in the range [168573390,1715160045]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(10100L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10100L + "'", long2 == 10100L);
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-450683), 4637904, (-1686886240));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-291727565551190L), (java.lang.Object) 157850L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-105973780), 34969884374403777L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -105973780 * 34969884374403777");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(349432740, 234356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 349432740 * 234356");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 1147279);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(350035000L, (-601423L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-210519099805000L) + "'", long2 == (-210519099805000L));
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3955580L, 83836111906170L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3955580 * 83836111906170");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(22339001478L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-150), 1535304, 10689680);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -150 for  must be in the range [1535304,10689680]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-235614207919338866L), 34875834);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -235614207919338866 * 34875834");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1712671034), 0, (-186412));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-19), (java.lang.Object) 827878);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1755920876), (long) (-401));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 704124271276L + "'", long2 == 704124271276L);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-441), (long) 15345);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6767145) + "'", int2 == (-6767145));
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-69484055597017L), (-133313658L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -69484055597017 * -133313658");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-9537), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(185937531, 1943780, (-70140002));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 168472109, (-598901407), 1990611);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-372966669790824L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -372966669790824");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 827878, 149248, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 827878 for hi! must be in the range [149248,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-185812352), 46818643568457600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -185812352 * 46818643568457600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-16103806), 507005, 874089);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-129279438), 954811044, (-211672136));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-10398), (long) 1185347686);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1185337288L + "'", long2 == 1185337288L);
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(8673549, (-4665), 2295252);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1773795 + "'", int3 == 1773795);
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(163143504L, 99775601L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63367903L + "'", long2 == 63367903L);
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(709960, 15345);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 725305 + "'", int2 == 725305);
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-16929382), (long) 1470998628);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1487928010L) + "'", long2 == (-1487928010L));
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-276464450L), (long) (-69473305));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 19206899056507250");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-106462890L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-106462890) + "'", int1 == (-106462890));
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-704792495));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 704792495 + "'", int1 == 704792495);
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-523), (-1989686), (-149158));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -523 for hi! must be in the range [-1989686,-149158]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(920, 31285122);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31286042 + "'", int2 == 31286042);
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 423329597445300L, (java.lang.Object) 198109764L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(234356, 33108325, 0, (-603474758));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-628056570), 184);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-185877195));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 185877195 + "'", int1 == 185877195);
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2111643072, 2005438);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2113648510 + "'", int2 == 2113648510);
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 188152939, 52957194, (-47585));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 95336384, 67348914, (-129926115));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(41769887250L, (long) (-1147540070));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40622347180L + "'", long2 == 40622347180L);
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3148046760239640L, (java.lang.Object) (-35392837));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 493779, (long) 14307000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14800779L + "'", long2 == 14800779L);
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2284512L), 48456409752010398L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2284512 * 48456409752010398");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-8700000), 8700, (-1563864028), 677162);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8691300) + "'", int4 == (-8691300));
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(576693690, (-789));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 576693690 * -789");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 349829, (-53816), 300979678);
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(53248, (-952907498));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-952854250) + "'", int2 == (-952854250));
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-549), (long) (-2304263));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2304812L) + "'", long2 == (-2304812L));
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1563864028, (-27826), 2294722, (-3509649));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 22759878, (-9719), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 34386390, (long) (-45783438));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1574327154608820L) + "'", long2 == (-1574327154608820L));
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(848047583, 970111, (-523));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-88481780), (-234356));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -88481780 * -234356");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-605984));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 605984 + "'", int1 == 605984);
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 130141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 130141 + "'", int2 == 130141);
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-911), 890891138);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-811601826718L) + "'", long2 == (-811601826718L));
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-61117), 488360, (-434897505), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-434470263) + "'", int4 == (-434470263));
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-299444533), (long) 10545454);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3157778548302982L) + "'", long2 == (-3157778548302982L));
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-4761114), 122129848, (-3483304));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4761114 for  must be in the range [122129848,-3483304]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1762675999, (-767464499), 584515483);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1762675999 for  must be in the range [-767464499,584515483]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(608209176, (-708129449), (-610511170), 954811);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-99920273) + "'", int4 == (-99920273));
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1000, 257572119, (-85250028), 1712594601);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 257573119 + "'", int4 == 257573119);
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 21963942, 1664, 16919594);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 199359, (long) 1692170940);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1691971581L) + "'", long2 == (-1691971581L));
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1761112650), 904180783);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-856931867) + "'", int2 == (-856931867));
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1763460086), 410609746);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-724093897993598156L) + "'", long2 == (-724093897993598156L));
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 587204001, (long) (-1763425054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1035490247172441054");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2112178L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-115104));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 115104 + "'", int1 == 115104);
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1711), (-9286460), 210, 1290307);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1032613 + "'", int4 == 1032613);
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-880), 3828);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3368640) + "'", int2 == (-3368640));
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-95201700538144L), (java.lang.Object) 155277797L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1755920876, (-88481780), 1715159733);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-45120), (-15359825771300L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15359825816420L) + "'", long2 == (-15359825816420L));
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(55318100091358L, (long) 63649178);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55318036442180L + "'", long2 == 55318036442180L);
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 100964278, (-221718630));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-22385661397099140L) + "'", long2 == (-22385661397099140L));
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-99990000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9798, 711148, (-20731669));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-307186665984L), 904228017L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -307186665984 * 904228017");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 49439738, 874089, (-18000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1638607297, (-173543860));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1465063437 + "'", int2 == 1465063437);
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1530017442, (-18000), 10100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2295 + "'", int3 == 2295);
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-7889211), (-317147951));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -7889211 * -317147951");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 47610286, (-9286460), 970000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 18919589, 1999672, (-1535304));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16990520), 2078227400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2061236880 + "'", int2 == 2061236880);
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1450548));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1450548 + "'", int1 == 1450548);
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-479643), 73381944, (-19094346));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1715159045, (-1938372));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1713220673 + "'", int2 == 1713220673);
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 100963445, (-916460470), (-310));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100963445 for  must be in the range [-916460470,-310]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 10, (-539633), 959334);
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1119), (long) 1126887300);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1126888419L) + "'", long2 == (-1126888419L));
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 249426407, (-401), 62000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-139503336), 954811, (-7862735));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(10688349299275890L, (long) (-633115409));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10688349932391299L + "'", long2 == 10688349932391299L);
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 824172132, (-429214), 2284622);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-35));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-111849012L), (-6983209393712L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -111849012 * -6983209393712");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-113827897), 100449343, (-26511982));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -113827897 for  must be in the range [100449343,-26511982]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-4506), 543958);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2451074748L) + "'", long2 == (-2451074748L));
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(638821068);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-638821068) + "'", int1 == (-638821068));
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9788880), (-99), (-16103806), (-1462491242));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-185877195), 709901);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -185877195 * 709901");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1463930970));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1463930970 + "'", int1 == 1463930970);
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-169105191128055L), 14623213L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -169105191128055 * 14623213");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 20714400, (java.lang.Object) (-1954106));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-708129449), 1162);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-708128287) + "'", int2 == (-708128287));
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-351944703L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-17287395), (-1234120), (-1455210));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-221979522200L), (-2889995522168L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2668015999968L + "'", long2 == 2668015999968L);
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-58976258072827L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1711));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1711 + "'", int1 == 1711);
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(151226407392820942L, (long) (-2987409));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 151226407389833533L + "'", long2 == 151226407389833533L);
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1255055775887355204L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1255055775887355204L) + "'", long2 == (-1255055775887355204L));
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-15651849), 16524, (-590309465));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-894200273343L), (-246060857901L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -894200273343 * -246060857901");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-46), 39325940, 973682);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-171478832), (-217526), 479652);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(78558096027L, 2284709);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 179482389015751143L + "'", long2 == 179482389015751143L);
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(94630394, 950048943, 155988945);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1990611, 669);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1331718759 + "'", int2 == 1331718759);
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-448826));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 1765497216, (-551461));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [1765497216,-551461]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1899810000, 198112800, 1119);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-37948040), (-2889995522168L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2890033470208L) + "'", long2 == (-2890033470208L));
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 87410194, (-6564960), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4499246) + "'", int4 == (-4499246));
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-163115), 244500170901663600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 244500170901500485L + "'", long2 == 244500170901500485L);
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-100), (long) (-53248));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53348L) + "'", long2 == (-53348L));
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(47966522284345140L, 185867227);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 47966522284345140 * 185867227");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-82928720871311L), (long) 201354638);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-82928922225949L) + "'", long2 == (-82928922225949L));
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1686886240, (-46895));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1686839345 + "'", int2 == 1686839345);
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 47652415, 908660727, (-485588104));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1139);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1139) + "'", int1 == (-1139));
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1990388), 1620270);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1990388 * 1620270");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1737969L, (long) (-490002));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -851608285938");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-99330469236L), (long) 204621149);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -99330469236 * 204621149");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1606080546), 620, 17329373);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606080546 for hi! must be in the range [620,17329373]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(73477967816424400L, (long) 24429098);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 73477967816424400 * 24429098");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-843887), 970111, 43296, (-16591304));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1454874, (-257397490));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-255942616) + "'", int2 == (-255942616));
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(73381892, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 9123345, 590309465, (-1737870));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9123345 for  must be in the range [590309465,-1737870]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-949512368), (-100189684));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -949512368 * -100189684");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-17423), (long) 1738657);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -30292620911");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-537164914), (-1470439267));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -537164914 * -1470439267");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(7739550, (-434897505), (-816756018), 18686280);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-427157955) + "'", int4 == (-427157955));
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(106820930, (-587951));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 106820930 * -587951");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 69665811, (long) 1711);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 119198202621L + "'", long2 == 119198202621L);
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 131986756L, (java.lang.Object) 4043031);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 11398, 51665711, (-521191424));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-98205378), 54920);
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-314527061), (long) 19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5976014159");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-631518), 1838776);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1207258 + "'", int2 == 1207258);
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1763469777));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1763469777) + "'", int1 == (-1763469777));
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-451), 4637904, 3337664);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -451 for hi! must be in the range [4637904,3337664]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-26553), 304461111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 304434558 + "'", int2 == 304434558);
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2499750L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2499750) + "'", int1 == (-2499750));
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-949512368), 0, 1763475345);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 813962978 + "'", int3 == 813962978);
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-17802), (java.lang.Object) (-1734643853289776L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9972, 3499553, 451, 230746822);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3509525 + "'", int4 == 3509525);
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-66747848L), (-53240373L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-119988221L) + "'", long2 == (-119988221L));
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(518500854, 304461111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 822961965 + "'", int2 == 822961965);
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1714805053L, 13370350);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22927543740378550L + "'", long2 == 22927543740378550L);
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 257397490, (-479643), 4204094);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 257397490 for hi! must be in the range [-479643,4204094]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1723148370), (int) ' ', (-312315));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-31069120), 0, 34386390, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-951492297), (-56912840351744L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56911888859447L + "'", long2 == 56911888859447L);
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1722798370), 725305);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1722073065) + "'", int2 == (-1722073065));
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 66534, (-158847200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 158913734L + "'", long2 == 158913734L);
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-92377287294684L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -92377287294684");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-69931974933849952L), 147147648400381790L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -69931974933849952 * 147147648400381790");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(66747945L, 5571553);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 371889713208585L + "'", long2 == 371889713208585L);
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-299315787), (-146793024), (-1925133904));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -299315787 for hi! must be in the range [-146793024,-1925133904]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(7089931017340773L, (long) 942883156);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 7089931017340773 * 942883156");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(6289801, (-106571912));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 6289801 * -106571912");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(95336384, (-394648137), 299745722);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 95336384 + "'", int3 == 95336384);
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1492747L), (-3328392039093L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3328390546346L + "'", long2 == 3328390546346L);
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 16524, 167396781, 601423);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(127522249, 11862880, (-1607884553), (-20731669));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1447767756) + "'", int4 == (-1447767756));
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1995555), 577);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1151435235) + "'", int2 == (-1151435235));
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(351, 176421201);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176421552 + "'", int2 == 176421552);
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-12141), (-9762233596300212L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -12141 * -9762233596300212");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(126547938, 140869042, (-1174462));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 174629, (-62000), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-288303652), (-812374164), (-193913417));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-288303652) + "'", int3 == (-288303652));
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-45120), 185937531, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2159885535598L), 3955580L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8543600026900736840L) + "'", long2 == (-8543600026900736840L));
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1999662), 7451);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1992211) + "'", int2 == (-1992211));
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 2061236880);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2061236880 + "'", int1 == 2061236880);
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 86130, (-2597131568123601488L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2597131568123515358L) + "'", long2 == (-2597131568123515358L));
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(288303652, (-2922338));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 285381314 + "'", int2 == 285381314);
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-601337), (-633647202), (-951502398));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-106571912), 3461411, (-300969900));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-62000), 0, (-1711678817), (-944351632));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1534716372) + "'", int4 == (-1534716372));
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 4231920);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4231920L + "'", long2 == 4231920L);
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 695393, 5148, (-168472090));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-890933386072745043L), (java.lang.Object) 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-100449343), (-1715149542), 0);
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1712604379, (java.lang.Object) (-48082050910080000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 254849, 126547938, (-1943780));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 254849 for  must be in the range [126547938,-1943780]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(347880555, 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347880656 + "'", int2 == 347880656);
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-882074), 73710, 1528562918);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 158, (long) (-420368508));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-66418224264L) + "'", long2 == (-66418224264L));
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3499118575261L), 147147648302611619L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3499118575261 * 147147648302611619");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 193913417, 10308, (-27826));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(926179236, (-4580870));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 921598366 + "'", int2 == 921598366);
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-363369790), (long) (-1761176514));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1397806724L + "'", long2 == 1397806724L);
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 147147648403856120L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-958364), (-531793), (-1715149542));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1377398900), 908660727, (-2005438));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1377398900 for hi! must be in the range [908660727,-2005438]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(244500170901663600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 244500170901663600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 315624238L, (java.lang.Object) 2160817093792L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-704792495), 169916106, (-53248));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-17287395), 166836, 149248);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3499118575261L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3499118575261");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 823081499, (-12169518));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10016505117547482L) + "'", long2 == (-10016505117547482L));
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-158159661L), (-36237190165603L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -158159661 * -36237190165603");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-53248), (-1989700), 231793424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-53248) + "'", int3 == (-53248));
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 76279426, 15409940, (-2997));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 185937531);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 185937531 + "'", int1 == 185937531);
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 168573390, (-18000), (-700));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 168573390 for  must be in the range [-18000,-700]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(14307000L, (long) (-164837960));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-150530960L) + "'", long2 == (-150530960L));
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(503932, 418862237, 258759, (-9169));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-129637805350173L), 274176451);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -129637805350173 * 274176451");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1131664606224480L, 58976609738240L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1131664606224480 * 58976609738240");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1207258, (long) 121054688);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 122261946L + "'", long2 == 122261946L);
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1944900), (-34978320), (-299444533));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 890891138, (-1686886240), (-14227));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 304341822, (-515974), 185937531);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(518500854, (-448826));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 518052028 + "'", int2 == 518052028);
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-312315), (-8700));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-303616) + "'", int3 == (-303616));
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(351, 921598366);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 921598717 + "'", int2 == 921598717);
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-350034159L), 2668015999968L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -350034159 * 2668015999968");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4665), (-853901), 86130);
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3996339497L), (long) (-1943430));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766606068654710L + "'", long2 == 7766606068654710L);
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 168573390);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 168573390 + "'", int1 == 168573390);
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(42307341, 0, 1454523, (-46322273));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-192174760), (long) (-8990));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-192165770L) + "'", long2 == (-192165770L));
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 75443289, (-65066), 959232);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-169105191128055L), (java.lang.Object) 783775357050000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1495740, 1766929518, 347880555);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1), (long) (-44735852));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44735853L) + "'", long2 == (-44735853L));
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 151485400, (-352039597), 1717850242);
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-31069120));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31069120) + "'", int2 == (-31069120));
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-204614145), (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-204614163) + "'", int2 == (-204614163));
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 63702638, (-846183179790L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 63702638 * -846183179790");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3219957234274L, (long) 66534);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3219957300808L + "'", long2 == 3219957300808L);
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-185867148), 709901, 1142);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-192174760));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 192174760 + "'", int1 == 192174760);
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-47585), 2074908, (-9787769));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 605984, (-101010340), (-106820930));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 304341822, (long) (-32083661));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 336425483L + "'", long2 == 336425483L);
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-4256334), 99835728, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 132 + "'", int2 == 132);
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 46851, 1108968548308711L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1108968548261860L) + "'", long2 == (-1108968548261860L));
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(18000, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18000 + "'", int2 == 18000);
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1717850242), 921598717, 154440945);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1990388, 1715698242);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1990388 * 1715698242");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 47525247, 304434558, (-1755570876));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-853901), 197);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-853704) + "'", int2 == (-853704));
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(63848486L, 178215856L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 11378812586794016");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-67634529), (-789467264));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -67634529 * -789467264");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3483304, (-1942080));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6764855032320L) + "'", long2 == (-6764855032320L));
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1552962195L), (-255252846827808L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1552962195 * -255252846827808");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2005430), (-2858763), (-130200));
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-46895), 843887);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 796992 + "'", int2 == 796992);
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-83850), 10552, (-100963131));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-451556L), 15546705L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7020207922980");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(760787, (-177664191), (-1606080546), 2304106);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-176903404) + "'", int4 == (-176903404));
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-8536194), (-83374037), 96);
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1664, (-804981179), (-3398104));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (int) (byte) 0, (-2284741));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-52957194), 9864, (-2078213173));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 51665711, 0, 263058213);
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(176421201, 34386408);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 176421201 * 34386408");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-813548518L), (java.lang.Object) 602091606L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(819000, (-158));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-129402000) + "'", int2 == (-129402000));
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-91), 668094673, 1838776);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -91 for hi! must be in the range [668094673,1838776]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 90, (-3044706741L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-274023606690L) + "'", long2 == (-274023606690L));
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2756847L), (long) (-6915));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2763762L) + "'", long2 == (-2763762L));
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-100188239), 1738657, 1681112017, 54920);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(232883752, 9123345);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 242007097 + "'", int2 == 242007097);
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1989700), (long) (-920));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1830524000 + "'", int2 == 1830524000);
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 350034159, (-77338269012L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 350034159 * -77338269012");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(519090382L, 109359832941448L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 519090382 * 109359832941448");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(666098988, 908660727);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 666098988 * 908660727");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-150173177138L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3031430), (-3480228), (-633115409));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-30880337644650027L), (-1528073662));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -30880337644650027 * -1528073662");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1794561, (-3496052), 1454874);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 796992, (-3398104), (-1989866));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 574676507);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 574676507 + "'", int1 == 574676507);
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1697015809L), (long) 959334);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1696056475L) + "'", long2 == (-1696056475L));
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(9260219782L, 181735272195646768L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 181735281455866550L + "'", long2 == 181735281455866550L);
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-304687800), (-312), (-130700686), (-2065033));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-47416804) + "'", int4 == (-47416804));
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(202685432, (-349956900));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-147271468) + "'", int2 == (-147271468));
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1762759876L), (long) 1742278);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1761017598L) + "'", long2 == (-1761017598L));
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-30827186), (long) 13326602);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -410821638601972");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-15127560000L), (long) 31508272);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15159068272L) + "'", long2 == (-15159068272L));
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1715708640L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1715708640) + "'", int1 == (-1715708640));
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1491870284961L), (long) (-300551));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 448383106015313511");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 9864, (-2284512));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(873);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-873) + "'", int1 == (-873));
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-854669577), 2376658);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -854669577 * 2376658");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-607951483), 4479944L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2723588598556952L) + "'", long2 == (-2723588598556952L));
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(157922, 3499553);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 157922 * 3499553");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(14338788692894944L, (-1120));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 14338788692894944 * -1120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1481377506, (long) (-208569710));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-308970476826943260L) + "'", long2 == (-308970476826943260L));
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 243405478620863L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9875, (-1106816), (-709960));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-783839) + "'", int3 == (-783839));
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1455210), 257573119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 0, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-128098805), (-49611263018700320L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -128098805 * -49611263018700320");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1470439267), (-3328392039093L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3326921599826L + "'", long2 == 3326921599826L);
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(3051509384L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3051509384");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 949426390, (long) (-3778206));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3587128483256340L) + "'", long2 == (-3587128483256340L));
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(335219286, (-153066));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 335066220 + "'", int2 == 335066220);
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(635218511, (-1454874));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 635218511 * -1454874");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 709908, (-1106816), 99370817);
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2288107), (-31916932), (-1713046570), (-100459952));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1646791658) + "'", int4 == (-1646791658));
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1990613L), (long) (-812374164));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 810383551L + "'", long2 == 810383551L);
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1139), 15345, 212411343, (-105975170));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 128814969, 3126427212L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 402730624394536428L + "'", long2 == 402730624394536428L);
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(80780254, 221881485);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 302661739 + "'", int2 == 302661739);
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-159247253), (long) 1117972070);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-178033981078223710L) + "'", long2 == (-178033981078223710L));
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(158, (-129224490));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 158 * -129224490");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1995555), 12100448, (-85250028));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1995555 for hi! must be in the range [12100448,-85250028]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1715159045), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1423185088314780L, (-112185550971032160L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1423185088314780 * -112185550971032160");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1548619507182706L), (long) 4909);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1548619507187615L) + "'", long2 == (-1548619507187615L));
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-137545560), (long) (-19094346));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2626342513403760");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(410609746, (-853932), (-1713046570));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-620), 233904432, (-99920273));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1893305), (-4506));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1893305 * -4506");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-609053028), 874089);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-532366552191492L) + "'", long2 == (-532366552191492L));
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-308759394), 263058213, (-1606080546));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1942080), (long) (-103661485));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 201318896788800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2384403, 1142);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2384403 * 1142");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1454523), (-91));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1454614) + "'", int2 == (-1454614));
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 14390810);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14390810L) + "'", long2 == (-14390810L));
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 926179236, (long) 83536773);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 77370024595045428L + "'", long2 == 77370024595045428L);
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1483330, 221881485, (-151485400), 1107317907);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 223364815 + "'", int4 == 223364815);
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(827878, (-1715860594));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 827878 * -1715860594");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1868580000000L), (long) 400483318);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1868580000000 * 400483318");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1205574775L), (-1001404800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1207268366443920000L + "'", long2 == 1207268366443920000L);
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-10100), (java.lang.Object) (-352039597));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(67276566, 335272134);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 402548700 + "'", int2 == 402548700);
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1762676017), (-161986));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1762838003) + "'", int2 == (-1762838003));
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2966L), (-99964856L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99967822L) + "'", long2 == (-99967822L));
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 577637190, 1786407669, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 188112985, 586809815, (-952854250));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(841, (-25656697), (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-25655846) + "'", int3 == (-25655846));
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3005390, (-37243837));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3005390 * -37243837");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(107655854);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-107655854) + "'", int1 == (-107655854));
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1686037017, (long) 22112703);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 37282835803926951");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3031430), 1802640001, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-846183179790L), (-1454524));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1230793743400869960L + "'", long2 == 1230793743400869960L);
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(202050186);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-202050186) + "'", int1 == (-202050186));
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 288303652, (long) (-999900));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 289303552L + "'", long2 == 289303552L);
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-4479760));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4479760 + "'", int1 == 4479760);
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5571553), (-106403849), 242007097, (-634344346));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-107655854));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 107655854 + "'", int1 == 107655854);
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 0, 808191813);
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1954106), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1954106L) + "'", long2 == (-1954106L));
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-708128287));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-708128287) + "'", int1 == (-708128287));
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-32348768), 479643, (-25656697), 1761730);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4450697) + "'", int4 == (-4450697));
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(53248, 843852);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 53248 * 843852");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-114080), 1712604379);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1712490299 + "'", int2 == 1712490299);
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-103661485), 7932691079037252L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7932690975375767L + "'", long2 == 7932690975375767L);
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-32091870), 31285122);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-806748) + "'", int2 == (-806748));
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 851, (-38071105817L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-38071104966L) + "'", long2 == (-38071104966L));
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(156879, (-1482832281), 14343);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1482689746) + "'", int3 == (-1482689746));
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1792856), (-1938372), (-35));
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6717319292802L), (java.lang.Object) (-356632756L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1470988428, (-100188684), (-733892));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-112110));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-112110) + "'", int1 == (-112110));
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-210121667377026327L), (long) 576693690);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-210121666800332637L) + "'", long2 == (-210121666800332637L));
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-84666360264073238L), 874263L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-84666360264947501L) + "'", long2 == (-84666360264947501L));
    }
}

