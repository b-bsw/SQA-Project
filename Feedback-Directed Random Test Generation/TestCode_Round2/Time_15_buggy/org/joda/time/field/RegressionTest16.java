package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

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
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(600832203, 168504917, (-83850));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(633647202);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-633647202) + "'", int1 == (-633647202));
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-951492298), (-17424), (-10049));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10426) + "'", int3 == (-10426));
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 10001, (-2587005341892608L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 10001 * -2587005341892608");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3996461669L), (-531793));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2125290340342517L + "'", long2 == 2125290340342517L);
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 98640, (-299785985));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29570889560400L) + "'", long2 == (-29570889560400L));
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1712594601, (-1943430), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-850306535125796L), (long) 34386308);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -850306535125796 * 34386308");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-34386307), 1665447152, (-47524559));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-188112985), (-1788088016), 949426390, (-386075249));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-863620), (-951502398), 1762675999);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-863620) + "'", int3 == (-863620));
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1174462), 6720552295014L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7893033289506732468");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3469518), (-1463930970), (-86));
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-47234L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47234) + "'", int1 == (-47234));
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 628056570, (java.lang.Object) 31362155);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-954811000), (-700), (-76433));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-301550777882109756L), 503516860970348L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -301550777882109756 * 503516860970348");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 374064183, (-57069L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-21347468859627L) + "'", long2 == (-21347468859627L));
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-286652166039938160L), (long) (-64));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-286652166039938224L) + "'", long2 == (-286652166039938224L));
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1781847), (-10047));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1791894) + "'", int2 == (-1791894));
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 56611, (-2966L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-167908226L) + "'", long2 == (-167908226L));
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(843887, 11398);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 855285 + "'", int2 == 855285);
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(106820930);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-106820930) + "'", int1 == (-106820930));
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-25801760), (-1761079449), (-497209));
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 13584346, (java.lang.Object) 99768);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(35691361);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35691361) + "'", int1 == (-35691361));
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 63780902, (-841625754L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53679649736550108L) + "'", long2 == (-53679649736550108L));
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-66534), 44, 236129206);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -66534 for  must be in the range [44,236129206]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1990388), 818982636L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1630093210902768L) + "'", long2 == (-1630093210902768L));
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-1112665094448052L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1112665094448052");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-62086), (-14149), (-10969865));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -62086 for hi! must be in the range [-14149,-10969865]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3536656467292573245L, 497209);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3536656467292573245 * 497209");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-180346924), 115104, 1454524);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -180346924 for hi! must be in the range [115104,1454524]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-80635680), (-1794989), (int) (short) 0, (-214050));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1794561, 204685393, (-3034108));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1213583), (-442560));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1656143) + "'", int2 == (-1656143));
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-756956242325977L), (long) (-159247253));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-756956083078724L) + "'", long2 == (-756956083078724L));
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-10969865), (-9788880), 252802);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10969865 for  must be in the range [-9788880,252802]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1462491241L), (-15359825779200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15358363287959L + "'", long2 == 15358363287959L);
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(400795139, 951372194);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 400795139 * 951372194");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-523), (-10047), 2376658);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-523) + "'", int3 == (-523));
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-958364L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-958364) + "'", int1 == (-958364));
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(257397490, (-2112178), 1370574);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-326232) + "'", int3 == (-326232));
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1, 52672, (-1989679));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 347695, 332622506970L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 332622854665L + "'", long2 == 332622854665L);
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-999900), 202685432, 1990810);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -999900 for  must be in the range [202685432,1990810]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1713254), 1788087917);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1713254 * 1788087917");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1221, 26511982, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1221 for  must be in the range [26511982,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(34875834, 1802640001, (-687800606));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3483304, 3469518);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3483304 * 3469518");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(904228017L, 1402774760439L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 904228017 * 1402774760439");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1945308, 880, 310);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1945308 for  must be in the range [880,310]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 99835208, 801902322);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 80058085112552976L + "'", long2 == 80058085112552976L);
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 709311654578808L, (java.lang.Object) 1313L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-556835983), 100963445, (-39585000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-333499135200L), (long) (-603474758));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -333499135200 * -603474758");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-18000), (long) 161986);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2915748000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-853932), (long) 3337664);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2483732L + "'", long2 == 2483732L);
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 420386456);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-351375808428464L), (-29017039163616L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-380392847592080L) + "'", long2 == (-380392847592080L));
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-951502398), (long) 25311043);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-976813441L) + "'", long2 == (-976813441L));
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(517635508L, (long) 1454874);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 519090382L + "'", long2 == 519090382L);
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(231121797399352L, 6014L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 231121797393338L + "'", long2 == 231121797393338L);
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 32496992L, (java.lang.Object) (-2078213173L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2005430), (-53248));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2058678) + "'", int2 == (-2058678));
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(700099020854530L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 700099020854530");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 951502398, (java.lang.Object) 812374164);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2102400L), (-54948));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 115522675200L + "'", long2 == 115522675200L);
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-208569710), 848047583, 300969892, (-201));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 63780902, 635218511, 848047583);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-970000), 22246411L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -21579018670000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-620), (-441), 1989700);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -620 for hi! must be in the range [-441,1989700]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(24429098, 812374164, 2284709, (-26553));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 582328281600L, (java.lang.Object) 244809820L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1120), (-1943780), (-23067514), 4476722);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1944900) + "'", int4 == (-1944900));
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1255055775887355204L), (long) 18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1255055775887355204 * 18");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2304264), 25311043, 10497554);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(350034159, (-48512377), 1025206);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46266513) + "'", int3 == (-46266513));
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 300969892, 3181, 920);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-44753852), 63780902);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19027050 + "'", int2 == 19027050);
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 25311043, (-1450647), 83536773);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2959086L), (long) 184);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2958902L) + "'", long2 == (-2958902L));
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-297481271), (-112210783781272665L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-112210784078753936L) + "'", long2 == (-112210784078753936L));
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 15345, 8209L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 125967105 + "'", int2 == 125967105);
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(102843302071766L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 102843302071766");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 100964278L, (java.lang.Object) (-15651849));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1463930951L), 23210880L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -33979125631946880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-490002));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 490002 + "'", int1 == 490002);
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(27L, (long) 1838776);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1838749L) + "'", long2 == (-1838749L));
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 2294400, (long) 56929);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2351329L + "'", long2 == 2351329L);
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1213583), (-1470988428), (-2250), (-3760577));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1482832080, (long) 299824116);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 444588817562441280L + "'", long2 == 444588817562441280L);
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(487551322, 1620270, (-86));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2304106));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2304106 + "'", int1 == 2304106);
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 843887, (-66534));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-56147177658L) + "'", long2 == (-56147177658L));
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-352818223), 58977411640562L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58977058822339L + "'", long2 == 58977058822339L);
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (short) 1, (-601423L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-601423) + "'", int2 == (-601423));
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-114080), 3005390, 1638607297);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -114080 for hi! must be in the range [3005390,1638607297]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-299931L), (-1705));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 511382355L + "'", long2 == 511382355L);
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(117265441568L, (long) 258662);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 30332113646862016");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(874089, 314527061);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 874089 * 314527061");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 124486545, (long) (-530216924));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -66004872969287580");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-3469518), (-16067820943119330L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16067820946588848L) + "'", long2 == (-16067820946588848L));
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2159885535598L), 5740);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12397742974332520L) + "'", long2 == (-12397742974332520L));
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(51429417L, (-1462491242L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1513920659L + "'", long2 == 1513920659L);
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-315818831173L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -315818831173");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 320016841, 1786633493, 2304264);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-157922), (long) (-949427270));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 949269348L + "'", long2 == 949269348L);
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-631518), (-188114696), 494910);
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-853932), (long) 231793424);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -197935822143168");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-349956067), 299315787, 260897140);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(959334, (-66558), (-10985));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-40998) + "'", int3 == (-40998));
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1631435040L, 2983768123909261L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2983769755344301L + "'", long2 == 2983769755344301L);
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1464528196L, (-1723733099040000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1723734563568196L + "'", long2 == 1723734563568196L);
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-106412530));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106412530 + "'", int1 == 106412530);
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 105975170, (-789), (-173543841));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(100449343);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100449343) + "'", int1 == (-100449343));
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-35691361), 1765497216, 300979678);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1630546760, 2295252, (-1528073662));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 86130);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 86130 + "'", int1 == 86130);
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 53816, (-532281952), (-3909));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 904180783, 38975286600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-38071105817L) + "'", long2 == (-38071105817L));
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 874263, (-577), 3005390);
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(49, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1715 + "'", int2 == 1715);
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1713170126), (-1766929518), 1899810000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1713170126) + "'", int3 == (-1713170126));
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(149248, (-281698083));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 149248 * -281698083");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5588424), (-1766929518), (-6960), 1715);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2466) + "'", int4 == (-2466));
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-244456616L), 2854904707L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2610448091L + "'", long2 == 2610448091L);
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(60336, (-15961217), 0, 843737);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 130141 + "'", int4 == 130141);
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 188152939, 149767755, 76433);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 188152939 for  must be in the range [149767755,76433]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-137071589522478L), 63780902);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -137071589522478 * 63780902");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-44753852), 2376658);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42377194) + "'", int2 == (-42377194));
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (-9262271430L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9262271430L + "'", long2 == 9262271430L);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 520, 11041229100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11041228580L) + "'", long2 == (-11041228580L));
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1653L), (-108685080));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 179656437240L + "'", long2 == 179656437240L);
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-527981586660499855L), (long) 711052);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -527981586660499855 * 711052");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 252802, (-2581684), (-35691361));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1000), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-168572690), 6143313703648191L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6143313535075501L + "'", long2 == 6143313535075501L);
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-168579832), (-199359), 169916106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1535634 + "'", int3 == 1535634);
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2248540, 951372194);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2248540 * 951372194");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(100978790, 18980207);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 100978790 * 18980207");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 524160, 80635684);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42266000125440L + "'", long2 == 42266000125440L);
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1995555), (-157922));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2153477) + "'", int2 == (-2153477));
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(141074004320L, (-112210784083120731L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 141074004320 * -112210784083120731");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-105840302932201213L), 4083552330L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -105840302932201213 * 4083552330");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 4937697877816L, (java.lang.Object) (-1188482214L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3499543L, (long) 31285122);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27785579L) + "'", long2 == (-27785579L));
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1115531632L), 85342);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-95201700538144L) + "'", long2 == (-95201700538144L));
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-908660727), (-789467264));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 717357898048940928L + "'", long2 == 717357898048940928L);
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 628056570, (long) 125967105);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 502089465L + "'", long2 == 502089465L);
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 99593070);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99593070 + "'", int1 == 99593070);
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(66534, 129926115, 9797);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1454874), 161986, (-869115));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(64, 1938372, (-1761730), (-254849));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1075328) + "'", int4 == (-1075328));
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 13594, 149248, (-10221043));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-749972960145811L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-549));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 549 + "'", int1 == 549);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(1867936032652L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1867936032652");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(668557151089416048L, 341736148L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 668557150747679900L + "'", long2 == 668557150747679900L);
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2441599512L, (java.lang.Object) 642100448);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-598901407));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-598901407) + "'", int1 == (-598901407));
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(129948442624L, (-1001404800L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 129948442624 * -1001404800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 31285122, (long) (-3162));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31281960L + "'", long2 == 31281960L);
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(48321945, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-434897505) + "'", int2 == (-434897505));
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 155277732, 350034159L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 54352510332047388");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-7152705000L), 99832182L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7052872818L) + "'", long2 == (-7052872818L));
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1155965, 3499553, (-949426390));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1155965 for  must be in the range [3499553,-949426390]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 57046, 577142280, (-244802));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-7833964763976120L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-42656000L), (java.lang.Object) (-951493242L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 1620270);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 201372638, (long) (-68697));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 201303941L + "'", long2 == 201303941L);
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1999672, 99775601L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 199518475602872L + "'", long2 == 199518475602872L);
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-14428), 4480369);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -14428 * 4480369");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-47610286), 633647202, 349956635);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9798, 32482052, (-44753852), 1290307);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-13552310) + "'", int4 == (-13552310));
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-155277600), 35691361L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5542068876813600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1745996));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1745996) + "'", int1 == (-1745996));
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-370469L), 16148174394800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5982398019867161200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(628056570, (-1781847), (-873812));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1212378) + "'", int3 == (-1212378));
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 577142280);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 577142280 + "'", int1 == 577142280);
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3996339497L), (-173543860));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 693540182179838420L + "'", long2 == 693540182179838420L);
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) (-166558919));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-101931854), (-46322264), (-954811000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-300968758L), (long) 352039597);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-653008355L) + "'", long2 == (-653008355L));
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1711), (-32091870));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1711 * -32091870");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-257397490), (-2304106), (-83374037));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -257397490 for  must be in the range [-2304106,-83374037]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1023876604803240L, (long) (-4665));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4776384361407114600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 80, 498646, 10689680);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 80 for  must be in the range [498646,10689680]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 594427L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(32496992L, 168472090);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5474836160953280L + "'", long2 == 5474836160953280L);
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1953880), 201372638, 354520488);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 304341822 + "'", int3 == 304341822);
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-159247253), 2959176, (-1106816), (-32348768));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2035597748052L), (long) 149158);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2035597598894L) + "'", long2 == (-2035597598894L));
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(8123, 880, 20731669);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8123 + "'", int3 == 8123);
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-61117), (-98205378L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-98266495L) + "'", long2 == (-98266495L));
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 48321945, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48321945L + "'", long2 == 48321945L);
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-114080));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 114080 + "'", int1 == 114080);
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 107222400, 0, 31362155);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 107222400 for  must be in the range [0,31362155]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 17663697000000L, (java.lang.Object) (-1023879392388015L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 31508272, (-35), (-848595844));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1723734563568196L, 10688349299275890L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12412083862844086L + "'", long2 == 12412083862844086L);
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1765988047L, 634344346);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1120244532718032262L + "'", long2 == 1120244532718032262L);
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-364), (-618950464), 1715159733);
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-357608543), 532281952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -357608543 * 532281952");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 890891138, (long) 35032);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 890926170L + "'", long2 == 890926170L);
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-7355254410L), 2104522840635L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -7355254410 * 2104522840635");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(17319362084L, 4479760);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 77586585489419840L + "'", long2 == 77586585489419840L);
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-157922), 32482072);
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(97, (-155277600), 100459953, (-601292683));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-349L), (long) (-89178884));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-89179233L) + "'", long2 == (-89179233L));
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(14338788692894944L, (-336230297424L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14339124923192368L + "'", long2 == 14339124923192368L);
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(10308, 66464901);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 10308 * 66464901");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-148474462), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-36237190165603L), (long) (-511785248));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36236678380355L) + "'", long2 == (-36236678380355L));
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-22), 1630546760, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1126887300L, (-335208917473000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 335210044360300L + "'", long2 == 335210044360300L);
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(4033340, 6289801);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 4033340 * 6289801");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(223816914804L, (long) (-958364));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -214498073739220656");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1597671, (-1802640000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1801042329) + "'", int2 == (-1801042329));
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1753701626), (-108109069), 14308);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-556835983), (-17899), (-167335));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -556835983 for  must be in the range [-17899,-167335]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-150787433), (-688));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -150787433 * -688");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) '#', 440284);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15409940 + "'", int2 == 15409940);
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-350035111), (-789467264), 67276566, (-312315));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1763475345, 171459354, 63864);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(100459953, 4231920, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 874089, (-148474462), 293357);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 5474836160953280L, (java.lang.Object) (-2035597748052L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-87426300));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 87426300 + "'", int1 == 87426300);
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-17474639284L), 843912L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17475483196L) + "'", long2 == (-17475483196L));
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(176421201, 1290307);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 176421201 * 1290307");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-186412), (-163115), (-789467264), (-210));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-349527) + "'", int4 == (-349527));
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-34386307), (-789), 52, 1234120);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 166836 + "'", int4 == 166836);
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1990388), (long) (-420368508));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 836696433901104");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-52), (-65066), 351655538, (-158));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-273471229715886774L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -273471229715886774");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-85342), (-1763425054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -85342 * -1763425054");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-3277662));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3277662 + "'", int1 == 3277662);
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(33032396199L, 1442617128743874624L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 33032396199 * 1442617128743874624");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-441), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4410) + "'", int2 == (-4410));
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-8252422149000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -8252422149000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 236129206);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-12595644), (-89), 159779046, 13393);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-185867148), 3390828);
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-130200), (-105747297328661760L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105747297328531560L + "'", long2 == 105747297328531560L);
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(299795783);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-299795783) + "'", int1 == (-299795783));
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-151069740), 257397490, (-4665), (-22112703));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 105975160, (java.lang.Object) 58975891968027L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(18605047094L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 18605047094");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(172893414397088L, 350);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60512695038980800L + "'", long2 == 60512695038980800L);
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10000, 34386308, 3181);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 89186674, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(173543841, 257572119, (-3398104), 2304264);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2264084) + "'", int4 == (-2264084));
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-316451466), (-882074));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-317333540) + "'", int2 == (-317333540));
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1111, (-708129449), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 642100448, (java.lang.Object) 3499118572225L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) ' ', (java.lang.Object) 3126427212L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-79), (-2288107));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 180760453 + "'", int2 == 180760453);
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(37290309256406700L, 339668823L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 37290309256406700 * 339668823");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 350034159L, (java.lang.Object) 204621149);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-47234), 134785804193901L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-134785804241135L) + "'", long2 == (-134785804241135L));
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 1715697100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-108685080), (-1989687), (-655556));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(30906162, (-605984), 106412530, 9972);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1205574775L, 171469054);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 206718766195512850L + "'", long2 == 206718766195512850L);
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 48014510);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48014510 + "'", int1 == 48014510);
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-125953558L), (-9651L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-125963209L) + "'", long2 == (-125963209L));
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(949417406, (-107726616));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 841690790 + "'", int2 == 841690790);
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-18832302128L), (long) (-848595844));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19680897972L) + "'", long2 == (-19680897972L));
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 300979678, (-963979), (-704619699));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-78346), 129926115);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -78346 * 129926115");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 106820930, (-317333540), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 106820930 for hi! must be in the range [-317333540,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1207025507L), (-89959023527L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1207025507 * -89959023527");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1717685969), (-450684), (-420368508));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1717685969 for hi! must be in the range [-450684,-420368508]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-580601), 0, (-3480228));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-833426L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-833426) + "'", int1 == (-833426));
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-498646), (-5204610870130L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2595258391946843980");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-301838202), (-524160), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-445627) + "'", int3 == (-445627));
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1990388, (-69931974933849952L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69931974931859564L) + "'", long2 == (-69931974931859564L));
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1712594601, 9989, 1715697100);
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-32091870));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32091870 + "'", int1 == 32091870);
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-177664191), (long) (-1454524));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-179118715L) + "'", long2 == (-179118715L));
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 5571553, 27898616, (-169096781));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5571553 for  must be in the range [27898616,-169096781]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-214050), (-49790131192L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 10657577581647600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 1717687942, (-1761078660));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(351, (-479099582));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-479099231) + "'", int2 == (-479099231));
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(7, 638821068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 7 * 638821068");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-106412324), 36296771);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 14829161, (long) (-204685393));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 219514554L + "'", long2 == 219514554L);
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 27, (-357608543), 126547938);
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(101010340);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-101010340) + "'", int1 == (-101010340));
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-107726638), (-8990), (-54948));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(4485377, 0, 954811, (-33108325));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3035028), 8700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-26404743600L) + "'", long2 == (-26404743600L));
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-7633), (-46851));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 357613683 + "'", int2 == 357613683);
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-954536506), (long) 1119);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1068126350214");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-87), 1762675999, (-1056));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-708129348), 326128844, (-40322560));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-959232));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 959232 + "'", int1 == 959232);
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-298964462), 5148, (-6564960), (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3534494) + "'", int4 == (-3534494));
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-81725049), (-944117276), (-1989866), (-1528073662));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-115104));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-115104) + "'", int1 == (-115104));
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-106575000), (-198112800));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-304687800) + "'", int2 == (-304687800));
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(3499550L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3499550 + "'", int1 == 3499550);
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1766929518), (long) 351655538);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -621350550260370684");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(149767755, 236129206);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 149767755 * 236129206");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-17287395), 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17287333) + "'", int2 == (-17287333));
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 161986, (-976813441L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-158230102053826L) + "'", long2 == (-158230102053826L));
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(8123, 841690790);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 8123 * 841690790");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-298735764L), (-949021208L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 650285444L + "'", long2 == 650285444L);
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-3909));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3909) + "'", int2 == (-3909));
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-115104), 25311043, 18686280);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -115104 for hi! must be in the range [25311043,18686280]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 488360, 2065028, (-399618));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 99835728, (-767464499), (-76433));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(288303652, 5, 400795139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 288303652 + "'", int3 == 288303652);
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-84756249), 2005430, 257397490, (-98640));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(711129L, (long) (-32348768));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23004147039072L) + "'", long2 == (-23004147039072L));
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 8372910, (java.lang.Object) 3499118563149L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 507005, (long) (-17362154));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16855149L) + "'", long2 == (-16855149L));
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1989679), 0, (-442560));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1989679 for hi! must be in the range [0,-442560]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1713170135));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1713170135 + "'", int1 == 1713170135);
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1981541), 3480228, (-635218511), 129926115);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1498687 + "'", int4 == 1498687);
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(63649178, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63649227 + "'", int2 == 63649227);
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(112324246L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 112324246 + "'", int1 == 112324246);
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1738657, (long) 688);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1737969L + "'", long2 == 1737969L);
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-952907498), 350000, 5220579, 153428);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(56929, (-53553755), (-539633));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52957194) + "'", int3 == (-52957194));
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-134785804241135L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-134785804241135L) + "'", long2 == (-134785804241135L));
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1470988428, 10497554);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1470988428 * 10497554");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 10, (-330040725), (-5625086), 30906162);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1259474) + "'", int4 == (-1259474));
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 153428, 1893305L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 290485999540L + "'", long2 == 290485999540L);
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(19, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-232883752L), (long) (-18000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-232901752L) + "'", long2 == (-232901752L));
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 35691361);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-22), 0, 232883752);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -22 for  must be in the range [0,232883752]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-551461));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-551461) + "'", int1 == (-551461));
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-106403849), 998888097, (-153066));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -106403849 for  must be in the range [998888097,-153066]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-512632L), (java.lang.Object) (-1734643853289776L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2536427, (-214183750), (-5252));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-211642072) + "'", int3 == (-211642072));
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3611760, (-605984), (-22199491));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-300969900), (long) 47524559);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -14303461769774100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-108109069), 0, 2065028);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -108109069 for  must be in the range [0,2065028]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-199304064), (-2922338), 350035111, 530216924);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 518500854 + "'", int4 == 518500854);
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-69933593094440609L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -69933593094440609");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 22199491, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22199491L + "'", long2 == 22199491L);
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1715696724), (java.lang.Object) 908660727);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-4), 34875834);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-139503336) + "'", int2 == (-139503336));
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2795634), (-1656143));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2795634 * -1656143");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-153847618973551131L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -153847618973551131");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 288303652, (-6138729L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 282164923L + "'", long2 == 282164923L);
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10.0f, (java.lang.Object) 2983768123909261L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(154650012, 161986, (-44753852));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(60512695038980800L, (long) 301848066);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60512695340828866L + "'", long2 == 60512695340828866L);
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-112700L), 1722847825104L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -194164949889220800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-100188684), (-704792495));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-804981179) + "'", int2 == (-804981179));
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 191323416, (-1943780), (-1995555));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 191323416 for  must be in the range [-1943780,-1995555]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-190043702986380L), 96);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18244195486692480L) + "'", long2 == (-18244195486692480L));
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 35691361, (-106412530), (-298964462));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35691361 for  must be in the range [-106412530,-298964462]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 487551322, 100, 1221);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1714805053L, (java.lang.Object) (-976813441L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 3909, 1010, (-2582129));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3909 for  must be in the range [1010,-2582129]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 42307341, (-1761176514), 455569728);
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 155277797, 853932, 47524559);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(440284, 0, 498646);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 440284 + "'", int3 == 440284);
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-77144400), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-77144400) + "'", int2 == (-77144400));
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-115104));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-115104) + "'", int2 == (-115104));
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-450683), 304341822, 585912);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -450683 for  must be in the range [304341822,585912]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 999000207, (java.lang.Object) (-1786407669));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 32482072, 973781, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 97, 1711);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(954811000, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 954811044 + "'", int2 == 954811044);
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-700), 954811044, (-729));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 843887, (java.lang.Object) 166315521289630L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-1462491242), (-1517218488), 1766929518);
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-244597842500L), (long) 97960);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -23960804651300000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-41404775), (-173612538), 100963445);
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 180346924, 48321945, 3611760);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-112110), 210, 1139);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-745951280955101L), (-106575000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -745951280955101 * -106575000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-420368508), (long) 285842568);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -120159213833048544");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 153251, (long) (-106394130));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106547381L + "'", long2 == 106547381L);
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 98640, 620, (-15651849));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-3164110L), (long) 15);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3164125L) + "'", long2 == (-3164125L));
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 19027050, (-1760510603));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33497323268811150L) + "'", long2 == (-33497323268811150L));
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-954811000), 64244, (-349946851));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-46266513), 954811044);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -46266513 * 954811044");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1454523), (-6768000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1454523 * -6768000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1696938508761228203L), (long) 95781);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1696938508761132422L) + "'", long2 == (-1696938508761132422L));
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 247971533, (int) (short) 10, 56929);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 247971533 for  must be in the range [10,56929]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1990613L), 1108968548308711L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1108968550299324L) + "'", long2 == (-1108968550299324L));
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(57431568324L, 201372638);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 57431568324 * 201372638");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-300490149), (-9999));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -300490149 * -9999");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 576693690, 9875, 46940);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 576693690 for  must be in the range [9875,46940]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-323442480), (long) 260897140);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-584339620L) + "'", long2 == (-584339620L));
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 973781, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-31910210532L), (java.lang.Object) (-69931974934731104L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 99835208, (java.lang.Object) 954811000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-43296), 308953822111200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -43296 * 308953822111200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-70140002), (java.lang.Object) 82215010L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1893305L, (long) (-299315787));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -566696076106035");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-17287395), 861836, 9778);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(352039597);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-352039597) + "'", int1 == (-352039597));
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-163145320L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-163145320) + "'", int1 == (-163145320));
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 745188990, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(843737, 998888097);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 999731834 + "'", int2 == 999731834);
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(60844390797616692L, (-273456367L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 60844390797616692 * -273456367");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 10, 155277797L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1552777970L + "'", long2 == 1552777970L);
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(159779046, (-600832203), (-1120), 357613683);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 274176451 + "'", int4 == 274176451);
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 125967105, 106412530, 42092700);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 125967105 for hi! must be in the range [106412530,42092700]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-339652577372970212L), (-640941));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -339652577372970212 * -640941");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 2304264, 14307, 174629);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2304264 for  must be in the range [14307,174629]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(299745722, (-48139530), 257397490);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5791299) + "'", int3 == (-5791299));
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 616792578L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1990388, (-441), 171478518);
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(44199872L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44199872 + "'", int1 == 44199872);
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3164125L), 996654445261089318L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3164125 * 996654445261089318");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(528938295, 4909, 1715);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1530017442, (-224854000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1754871442L + "'", long2 == 1754871442L);
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2597131568123601488L), (-32900781L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2597131568123601488 * -32900781");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1277533), 669);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-854669577) + "'", int2 == (-854669577));
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-708129449), (-103661485), (-1766929518));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -708129449 for hi! must be in the range [-103661485,-1766929518]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10308, (-874263), (-14308), (-47234));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(48456408803896934L, (-107726638));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 48456408803896934 * -107726638");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-308759394), 10545454, (-106412530), 9691);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-85369496) + "'", int4 == (-85369496));
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(936406880L, (long) 1786633493);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-850226613L) + "'", long2 == (-850226613L));
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1990611), (-1548000), 3117618, (-26511982));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-214183750), (-2065033));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 442296511813750L + "'", long2 == 442296511813750L);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-15288536528274L), 1802640000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -15288536528274 * 1802640000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-7098280399L), (-372966669790824L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372973768071223L) + "'", long2 == (-372973768071223L));
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1990611), (-53248), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1990611 for  must be in the range [-53248,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(595403576693045551L, (-2219789486L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 595403578912835037L + "'", long2 == 595403578912835037L);
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1880153436L), (java.lang.Object) 1442653136789088224L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 89186674, (long) (-349956067));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -31211417661851158");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1753263, 0, 711052);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 331157 + "'", int3 == 331157);
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1715, 85342);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 146361530 + "'", int2 == 146361530);
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-115104), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-115104L) + "'", long2 == (-115104L));
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(2936930686872L, (long) (-708129449));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2936930686872 * -708129449");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-13020480), 126547938, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 97180281, (long) 868);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97179413L + "'", long2 == 97179413L);
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-317333540), (-168254564));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-485588104) + "'", int2 == (-485588104));
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(6959674051092L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6959674051092");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3499550, (-9989), 3499650);
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(247971533, (-211916938), 503932);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-176870209) + "'", int3 == (-176870209));
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-214183750), 959344, 155277732);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-6960));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6960 + "'", int1 == 6960);
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1954327840, 0, (-34386390), 1686037017);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 233904432 + "'", int4 == 233904432);
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-314527061), (-1519234035), (-107726638));
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-556835983));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-556835983) + "'", int1 == (-556835983));
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(2336523L, 129948442624L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-129946106101L) + "'", long2 == (-129946106101L));
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-35), (-882074), (-26511982));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-951502398), 1483542189L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1411593950367669222L) + "'", long2 == (-1411593950367669222L));
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(437896456466L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-80635680), (-1221), 31362155);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -80635680 for  must be in the range [-1221,31362155]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(31362155, 868, 158, (-1277533));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(112324246, 63649227);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 175973473 + "'", int2 == 175973473);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(169916106, (-1454874), 0, (-105975170));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 217526, (-47585), 1155965);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 217526 + "'", int4 == 217526);
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1638607297, 2284622, 709960);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1411593950367669222L), (long) (-363125099));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1411593950004544123L) + "'", long2 == (-1411593950004544123L));
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-198L), (java.lang.Object) 201);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2264084), (-3162), 507005);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-6915), (-244802), (int) (short) -1, 42092700);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 41840985 + "'", int4 == 41840985);
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-173543841), 399618, (-100449343));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -173543841 for  must be in the range [399618,-100449343]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(56, (-2288107));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-128133992) + "'", int2 == (-128133992));
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-32091971), 1989861L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34081832L) + "'", long2 == (-34081832L));
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-3396800), (-952907498));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(353600846, 3469518, 1762675999);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 353600846 + "'", int3 == 353600846);
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-173612538), (long) 1794561);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-175407099L) + "'", long2 == (-175407099L));
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(3611760, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-47525247), (-234356), (-1785587));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 874089, (long) 959344);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 838552037616L + "'", long2 == 838552037616L);
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-586809815), 66747848, 47524559);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-336926304L), (-461492506134000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 461492169207696L + "'", long2 == 461492169207696L);
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-304461011), 352818223, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(634344346, (-151069740), (-537804800), (-25));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-54530170) + "'", int4 == (-54530170));
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(620, 633647202);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 633647822 + "'", int2 == 633647822);
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9788, (long) (-1715697100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16793243214800L) + "'", long2 == (-16793243214800L));
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-15805100), (long) (-136724));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2160936492400L + "'", long2 == 2160936492400L);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1213583), (java.lang.Object) 370758906605694492L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1174462), (-2923493247064L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3433531725933279568");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(7451, 494910);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 502361 + "'", int2 == 502361);
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-185867227), (long) 1763460000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1577592773L + "'", long2 == 1577592773L);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 173543841, (-27409742280L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4756791956091297480");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(582328771044L, 1442485561160494224L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 582328771044 * 1442485561160494224");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-4410), 952906578, (-401));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9999, 0, (-31069120), (-98640));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-30960482) + "'", int4 == (-30960482));
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 22384927, (-5791299));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-129637805350173L) + "'", long2 == (-129637805350173L));
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 507005, (long) (-7550420));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3828100692100L) + "'", long2 == (-3828100692100L));
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 66534, (-357608543), (-767454452));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 60844390797616692L, (java.lang.Object) 314968481L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 3034108);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3034108 + "'", int1 == 3034108);
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-544372324350570L), (java.lang.Object) 276115994100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-149158), 85229052, 1470998628);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1385620419 + "'", int3 == 1385620419);
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(61090L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 61090 + "'", int1 == 61090);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1492005, (java.lang.Object) 3045228L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-53553755), (-1763460086), 101931854, 108685080);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 107655854 + "'", int4 == 107655854);
    }
}

