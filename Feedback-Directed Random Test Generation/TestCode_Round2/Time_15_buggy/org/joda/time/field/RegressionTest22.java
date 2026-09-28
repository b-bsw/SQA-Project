package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

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
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(63702638L, (-1117990796L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -71218962964919848");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(821235936L, (long) 73710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 60533300842560");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(8941480, (-357591120));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-348649640) + "'", int2 == (-348649640));
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-75571671168000L), (long) (-47652415));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -75571671168000 * -47652415");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(12100448, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12100448 + "'", int2 == 12100448);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1454874, (-9286460), 16919594);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1331718759, (-1001404800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 330313959L + "'", long2 == 330313959L);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 813962978, (-1175010), 1788088016);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 33108325);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1369443), 1528562918, (-450));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 2295252, 855285, (-9700));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2295252 for  must be in the range [855285,-9700]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 47652415, (java.lang.Object) 101931854);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-25801760L), 808191813);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20852771192990880L) + "'", long2 == (-20852771192990880L));
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 185877195, (-1944900), 2346662);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3371552917992000000L, 936406881L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3371552917992000000 * 936406881");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4918422756L), (-22199491));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 109186481706017196L + "'", long2 == 109186481706017196L);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1075328), (long) (-34386408));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35461736L) + "'", long2 == (-35461736L));
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-4710915), 819000);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-278528172L), (-255252846827808L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -278528172 * -255252846827808");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2044900073697126L, (java.lang.Object) 256163370L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-52957194), (long) 1142);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -60477115548");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(848047583, 1686886240, (-106462890), 1718668813);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 65098231 + "'", int4 == 65098231);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 5899809, 1385095, 159779046);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1277533), (-631518), 2376658);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1277533 for hi! must be in the range [-631518,2376658]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(5740, (-30960482));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 5740 * -30960482");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1454523, 22199491, 80661128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59916161 + "'", int3 == 59916161);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(231121797393338L, 163143504L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 231121960536842L + "'", long2 == 231121960536842L);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-299444533), 274176451);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 714516432, 1738657, 300979678);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-7920L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7920) + "'", int1 == (-7920));
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3562101641948129280L, (-335208917473000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3562101641948129280 * -335208917473000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1530020623L), 3461473L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5296125075957679L) + "'", long2 == (-5296125075957679L));
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-10985), (-46266513));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46277498) + "'", int2 == (-46277498));
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1578, (long) 45976945);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 72551619210");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-352039597), (-537140436239946L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -352039597 * -537140436239946");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-303616), 1681112017);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -303616 * 1681112017");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(8270L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8270 + "'", int1 == 8270);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(913332845, 168472109, 184);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(349432740, 1609955940, 185867148, (-15961217));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 258662, (java.lang.Object) 50006832L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1925124040), 258662, (-1989861));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1755570876, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 349956900);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 349956900 + "'", int1 == 349956900);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 99835208, 112324246, (-77144400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-103661485), (-299315787), (-1656143));
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 634);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 634 + "'", int2 == 634);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-576), (-3770626), 168472109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-576) + "'", int3 == (-576));
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2987409), (-536575), (-349527));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-368723) + "'", int3 == (-368723));
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-18371294726400000L), (-1007698710304L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -18371294726400000 * -1007698710304");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1890034356341402L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-450684), (-350000), (-15805100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2997), (-1989687));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1992684) + "'", int2 == (-1992684));
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1988776));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1988776) + "'", int1 == (-1988776));
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1990710, 4637904, 1715698242);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-999900), (long) (-3038));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3037696200L + "'", long2 == 3037696200L);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-212411343), 177781774, (-1234120), 976536);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 740943 + "'", int4 == 740943);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-95201700538144L), (long) (-1893305));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-95201702431449L) + "'", long2 == (-95201702431449L));
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-715471229), 4637904, 420358630);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-841625754L), (-168573390));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 141875706463086060L + "'", long2 == 141875706463086060L);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 80661128, (-6983209393712L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6983290054840L + "'", long2 == 6983290054840L);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 954811044, (-70140002), (-739860));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 954811044 for  must be in the range [-70140002,-739860]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 861836, (-1786407669), (-999731834));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 861836 for hi! must be in the range [-1786407669,-999731834]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-352818223), (-489951), 304434558);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 257030797 + "'", int3 == 257030797);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-21676495227L), 449475895);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -21676495227 * 449475895");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1385067125);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1385067125) + "'", int1 == (-1385067125));
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10689680, 714516432, 69748100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-920), 304461011, 739783371);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 435321441 + "'", int3 == 435321441);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 24429098, (-1755920876), (-21104292));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1766929518), (-40322560), (-1802640000), (-10969865));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-15581942) + "'", int4 == (-15581942));
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(6069060510816L, (long) (-11));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-66759665618976L) + "'", long2 == (-66759665618976L));
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1607884553, 854669577, 18991178);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1147279, (-8252422149000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8252423296279L + "'", long2 == 8252423296279L);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-107655854), 63649227);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6852211889124858L) + "'", long2 == (-6852211889124858L));
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 206718766195513961L, (java.lang.Object) (-61510));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-601292683), 335272154, 1207258, (-580601));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 53248, (-1454874), 116558851);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3483304), 435321441);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3483304 * 435321441");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-843887));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-843887) + "'", int2 == (-843887));
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2975155102540750L), (long) 299795783);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2975154802744967L) + "'", long2 == (-2975154802744967L));
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1324326, (-949512368));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-948188042) + "'", int2 == (-948188042));
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3483304), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-640941), (-3770626), 3045000, (-2554666));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 173543841, 8730, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-4785376), (java.lang.Object) 28778061882526590L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1126888419L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1126888419) + "'", int1 == (-1126888419));
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-100356795));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100356795) + "'", int2 == (-100356795));
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(130141);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-130141) + "'", int1 == (-130141));
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(296713364L, 199879);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 59306770482956L + "'", long2 == 59306770482956L);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(198112800, 442559, (-148302337));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(3500415L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3500415 + "'", int1 == 3500415);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 257951242, (-2795634), 2111643072);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-108109069), (-394742519564892L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -108109069 * -394742519564892");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-192174760), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-489444), 1863519532, (-70140002));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -489444 for  must be in the range [1863519532,-70140002]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-34386308), (-150));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34386458) + "'", int2 == (-34386458));
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 518052028, 106575000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55211394884100000L + "'", long2 == 55211394884100000L);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-689793507L), (long) 258759);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-689534748L) + "'", long2 == (-689534748L));
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-32083661), (java.lang.Object) (-1763469777));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-95285272860744L), (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-95285272860796L) + "'", long2 == (-95285272860796L));
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-278528172L), (-1115531632L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 837003460L + "'", long2 == 837003460L);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(8579157299706240000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 8579157299706240000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-804981179), 767454452);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-37526727) + "'", int2 == (-37526727));
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2923493245953L), (long) (-129402000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2923493245953 * -129402000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 179892881, (long) (-44735852));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -8047661300269612");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(25444, 3469518);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 25444 * 3469518");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(197508341L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 197508341 + "'", int1 == 197508341);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 926161, 493779);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [926161,493779]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(48456408802476250L, (-967528812442500L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 48456408802476250 * -967528812442500");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-177664191), 0, 47525347);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1764621518L), (long) 608209176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2372830694L) + "'", long2 == (-2372830694L));
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1992684), 440284, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(21817845L, 6143313703648191L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 21817845 * 6143313703648191");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 4033340);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4033340L) + "'", long2 == (-4033340L));
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4568L), (-38868600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 177551764800L + "'", long2 == 177551764800L);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(168504917, 1174462);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 168504917 * 1174462");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(19324562385800L, (-1859882812L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19326422268612L + "'", long2 == 19326422268612L);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 5899809, 36296771, (-35032));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5899809 for  must be in the range [36296771,-35032]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-15409940), 201, (-185877195));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-8700000), (-70140002), (-986060405));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 100978790, 2346662, (-208569710));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100978790 for  must be in the range [2346662,-208569710]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9989), (-22112703), (-33108325));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(7739828L, (-98205378));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-760092734394984L) + "'", long2 == (-760092734394984L));
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3536656467266061812L, (long) (-3396800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3536656467269458612L + "'", long2 == 3536656467269458612L);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(257397490, 339160985, 3117618);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-112210784718339242L), (-99L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -112210784718339242 * -99");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-249426407), 63244232, 13370350);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -249426407 for hi! must be in the range [63244232,13370350]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-130141), 9070, 257951242);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -130141 for hi! must be in the range [9070,257951242]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 108684870, (java.lang.Object) (-1519234035));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 4909, (long) 257397490);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-257392581L) + "'", long2 == (-257392581L));
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-304687800), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 47524559, (-1944900), (-15581942));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(4004130654049726L, (-49522428));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 4004130654049726 * -49522428");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 260436456472903200L, (java.lang.Object) 100753431);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-163115), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-82215000), 620);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-82214380) + "'", int2 == (-82214380));
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 99593070, 5220641, 351655538);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(47620, 585912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 47620 * 585912");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-16987813610L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16987813610L) + "'", long2 == (-16987813610L));
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1718668813L, (-485588104));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-834565130308600552L) + "'", long2 == (-834565130308600552L));
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 114080, 6407448057348624L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 114080 * 6407448057348624");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4785376), 100963131, (-44));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-128133992), (-17864), (-908660727));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-198122588), (-300490249), (-580601));
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 45091, 217526);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9808464866L + "'", long2 == 9808464866L);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(489444, 101009154);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101498598 + "'", int2 == 101498598);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(410609746, 1999672, (-1990388));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 349956900, (-833426), (-100356795));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 349956900 for  must be in the range [-833426,-100356795]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1717850242, (-1766929518), 1681112017);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1717850242 for hi! must be in the range [-1766929518,1681112017]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-4580870), 173543841);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 168962971 + "'", int2 == 168962971);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-184225), (-211916938), (-1454614));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-100963131), (-577), (-107726616));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-816756018), 769248430137600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-769249246893618L) + "'", long2 == (-769249246893618L));
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 872, 99684041, (-592169827));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 872 for hi! must be in the range [99684041,-592169827]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-441795816L), (long) 111);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-441795927L) + "'", long2 == (-441795927L));
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1943780, 0, 13370350);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(103898969, 145149152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 249048121 + "'", int2 == 249048121);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1715159124), 34254582120L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1715159124 * 34254582120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2997), 168579832);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 168576835 + "'", int2 == 168576835);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(349956635, 2005430, 951502398);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 349956635 + "'", int3 == 349956635);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(40659464L, (long) 813548518);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 33078446679874352");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(42636629226057405L, (-696874492885209L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 42636629226057405 * -696874492885209");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(400483318, (-23359779));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 400483318 * -23359779");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-357608543), (-1715159045), 9700);
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2245596, 80635680, (-152286));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(66558, 18591);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 85149 + "'", int2 == 85149);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) -1, (-318899712), (-556835983));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-350000), 8209, 10689680);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-944360622), 880, 0, (-1126888419));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1482832281, (-42377194), (-939637516));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-153066), 0, 112324246, 9169);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1765498096L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1765498096 + "'", int1 == 1765498096);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1719645110, (long) (-9864));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1719635246L + "'", long2 == 1719635246L);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-246060857901L), 1899810000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -246060857901 * 1899810000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1981541), 976536, (-9700));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1981541 for  must be in the range [976536,-9700]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(15083702968L, (long) 959334);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 14470309103103312");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-95285220503088L), (java.lang.Object) 2475);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(584515483, (-949427270), 32482052);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-397393840) + "'", int3 == (-397393840));
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 949417406, (-216577398L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-205622351407389588L) + "'", long2 == (-205622351407389588L));
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 0, (-34386307), (-130200), 281615806);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 247359700 + "'", int4 == 247359700);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(91768659131232L, (-970111));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 91768659131232 * -970111");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-738109629742436174L), (java.lang.Object) (-1369443));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1788088016), 1000, 0, 46920);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25373 + "'", int4 == 25373);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-30827186), (-27826), 954811);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(130686379L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 130686379 + "'", int1 == 130686379);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 524160, (-429214), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 524160 for hi! must be in the range [-429214,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 296189014, (long) 351665413);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-55476399L) + "'", long2 == (-55476399L));
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(908660727, (-9070), 999000207, 304341822);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(75443289);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-75443289) + "'", int1 == (-75443289));
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2111643072), (-168572690), (-146527725));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-149641098) + "'", int3 == (-149641098));
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 124593832, (java.lang.Object) (-9169));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 959344, (-7889211), (-91));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1155965);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1155965) + "'", int1 == (-1155965));
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 952907498, 112110, (-122484040));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 952907498 for  must be in the range [112110,-122484040]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-6717319292802L), (long) 2304264);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6717321597066L) + "'", long2 == (-6717321597066L));
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(63649227, (-1711));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 63649227 * -1711");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(344685285172348776L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 344685285172348776");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(9221291488125370368L, (long) (-168472090));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9221291488293842458L + "'", long2 == 9221291488293842458L);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2615899881150087168L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-397393840), (java.lang.Object) (-1995633L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 455569728, (long) (-1989700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 453580028L + "'", long2 == 453580028L);
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-908660727), (-9286460), 1498687);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -908660727 for  must be in the range [-9286460,1498687]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1715156650, 0, 2288107);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(100962303);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100962303) + "'", int1 == (-100962303));
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1830524000, (-549), (-44735852));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-87932294150L), (long) (-1715708640));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-86216585510L) + "'", long2 == (-86216585510L));
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1106816), 126547938, 171984);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2723588598556952L), (long) (-201));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 547441308309947352");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-769249246893618L), (-806748));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -769249246893618 * -806748");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-86), 258759, (-2284741));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(5758, (-32091561), (-98640));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-31987164) + "'", int3 == (-31987164));
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(32482072, 608209176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640691248 + "'", int2 == 640691248);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 539633, (java.lang.Object) 440345391360000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(827878);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-827878) + "'", int1 == (-827878));
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6407448056860264L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1155965, (-9286460), 1755920876);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 2065033);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-6564960), 1111, 62000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11160 + "'", int3 == 11160);
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3828100692100L), 948660113746756L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3828100692100 * 948660113746756");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-4580870), (-1289151020));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1293731890) + "'", int2 == (-1293731890));
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-100459953), (-1697015809L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 170482128412396977L + "'", long2 == 170482128412396977L);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 107336979, 17996023998L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18103360977L + "'", long2 == 18103360977L);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-82214380));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 82214380 + "'", int1 == 82214380);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-825740449968L), 290485999540L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1116226449508L) + "'", long2 == (-1116226449508L));
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-9201L), 1878586898331691800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1878586898331701001L) + "'", long2 == (-1878586898331701001L));
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6370157478L), 48321945);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-307818399293254710L) + "'", long2 == (-307818399293254710L));
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1519551781741728000L), (-51187193470L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1519551781741728000 * -51187193470");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(176421201, (-1621913841), (-1649662), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-387852) + "'", int4 == (-387852));
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-399618), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-300L), (-1995685L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 598705500 + "'", int2 == 598705500);
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1597671, (long) (-3480228));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5077899L + "'", long2 == 5077899L);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 78821091321L, (java.lang.Object) 25311043);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 600832203, 1121717);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 160349719810281408L, (java.lang.Object) (-5791299));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(709901L, 8665465796034198L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 709901 * 8665465796034198");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-83850), 440284, 42092700);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-2078213173), (-27826), 67997775);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2078213173 for  must be in the range [-27826,67997775]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 520, 35318728101L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35318727581L) + "'", long2 == (-35318727581L));
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-105975170), (-628160370));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-734135540) + "'", int2 == (-734135540));
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-570400), (long) (-1131200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 645236480000L + "'", long2 == 645236480000L);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(11884520776313280L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 11884520776313280");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-168579832));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 168579832 + "'", int1 == 168579832);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-26020763), (-2111643072), (-412));
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(4637904, 833, (-363369790), 13986);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-358745040) + "'", int4 == (-358745040));
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 285381314, (long) 450);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 128421591300");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-106820930), 1761176514);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-68277286), 46831);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-68230455) + "'", int2 == (-68230455));
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(686, 126819377, (-8209), 80635680);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46176173 + "'", int4 == 46176173);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(595403576693045551L, (-372968475390049L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 595403576693045551 * -372968475390049");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1), (-386075249), 576131381);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6959097913696L), (-78558101767L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -6959097913696 * -78558101767");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-351), (long) (-84756249));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84755898L + "'", long2 == 84755898L);
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-99920273), (-1895496466L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 189398524353255218");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-813548518), 609053028, (-44));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -813548518 for hi! must be in the range [609053028,-44]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-35032), 835739, (-1713170126));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -35032 for hi! must be in the range [835739,-1713170126]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-221718630), (long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -11529368760");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3490491590411791L), (java.lang.Object) 223816914804L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 1630546760, 999731834);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-183457343), (-49522428), (-1967089));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-185867227));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-185867227) + "'", int1 == (-185867227));
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(85149, 10552);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95701 + "'", int2 == 95701);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1943430L), (java.lang.Object) (-308970476826943260L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 89372027, (long) 106412530);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 195784557L + "'", long2 == 195784557L);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1990810);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1990810) + "'", int1 == (-1990810));
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9), 583633684, 100459953);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-23359779), 577637190, (-1785587));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-7098280399L), (-601423));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4269069092407777L + "'", long2 == 4269069092407777L);
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(155277797, (-5156), (-85342));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3438639L, (-134785804241135L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3438639 * -134785804241135");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 835739, 299785985, 951502398);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3499550L, (-8699039L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5199489L) + "'", long2 == (-5199489L));
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-951492297), (long) (-951493178));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1902985475L) + "'", long2 == (-1902985475L));
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-18621702246072372L), (-499505762029010022L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 480884059782937650L + "'", long2 == 480884059782937650L);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1147279, 38868600, 1107317907, 112324246);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1631883), (-18000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1649883) + "'", int2 == (-1649883));
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(25311043, 168443407);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 193754450 + "'", int2 == 193754450);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(12605093128L, (long) 1630546760);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14235639888L + "'", long2 == 14235639888L);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 11398);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11398 + "'", int1 == 11398);
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 954811, (-576), (-609053028));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(6069190800689L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6069190800689");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(594427L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 594427 + "'", int1 == 594427);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-62000), (long) (-168573390));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10451550180000L + "'", long2 == 10451550180000L);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-202050186), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-202050186L) + "'", long2 == (-202050186L));
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(517635508L, (long) 1686839345);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 873167941263462260");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 335272134, 1711, 9999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 335272134 for hi! must be in the range [1711,9999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1289151020, (-1713254), (-44753852), (-5571553));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-5578134) + "'", int4 == (-5578134));
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 520, (-25801760));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 451, 9778, (-219899));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-377), 1221, (-1715697100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-947642470), (-1370574), 4480369);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 210458 + "'", int3 == 210458);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 950733809, 297515510254075L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 950733809 * 297515510254075");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 872);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10049, 951372194, 1830346448, 106412530);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 229788587, 32482072, 206988733);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 229788587 for hi! must be in the range [32482072,206988733]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-438675));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 438675 + "'", int1 == 438675);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 479652, 7932691079037252L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7932691078557600L) + "'", long2 == (-7932691078557600L));
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1838776);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1838776 + "'", int1 == 1838776);
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-204614145), (-863620));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -204614145 * -863620");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-148474454), (-1718574), 1300860316);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1528073662L), 499082692L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-762635116805258104L) + "'", long2 == (-762635116805258104L));
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1285742), 199251536, 51, 299785985);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 197965794 + "'", int4 == 197965794);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(580601);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-580601) + "'", int1 == (-580601));
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(1023871892793449L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1023871892793449");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1447658L, (-3259723543377L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3259724991035L + "'", long2 == 3259724991035L);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9123345, (-3480228), 1174573);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(628056570, (-37526727), 232883752, (-136724));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2351329L, 73381944);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 172545093003576L + "'", long2 == 172545093003576L);
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-999731834), 8372910);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -999731834 * 8372910");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 40322555L, (java.lang.Object) 67348914);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-23067514), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(86563075L, (long) (-34386307));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 120949382L + "'", long2 == 120949382L);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-30352410), (-43977213021528L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 43977182669118L + "'", long2 == 43977182669118L);
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 288303652, (-888840314066752L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 288303652 * -888840314066752");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1535304), (-944117276));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1535304 * -944117276");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-214173761), (long) (-244802));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52430165040322L + "'", long2 == 52430165040322L);
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1151435235));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1151435235 + "'", int1 == 1151435235);
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 3461411, (long) (-1024844251));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3547407163698161");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-257));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-257) + "'", int1 == (-257));
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 628023133, 951502398, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 628023133 for  must be in the range [951502398,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(181735281455866550L, (-1954106));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 181735281455866550 * -1954106");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 865254, (-272918), 95336384);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(17981, 254849, 350035111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 349798244 + "'", int3 == 349798244);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-16929382), (long) (-112110));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16817272L) + "'", long2 == (-16817272L));
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-156879), (-299444533), 2065028);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-156879) + "'", int3 == (-156879));
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(15345, 0, (-5740), (-63864));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2858763), 47525347, 3483304);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 166836, (-222718530), (-1766617203));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 112324246, (java.lang.Object) 1185337288L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1884269790L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1884269790) + "'", int1 == (-1884269790));
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 9700, (long) (-9788880));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -94952136000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-5791299));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5791299) + "'", int2 == (-5791299));
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2889995522168L), (-2005438));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5795706839985549584L + "'", long2 == 5795706839985549584L);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-153251), (long) 204621149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-204774400L) + "'", long2 == (-204774400L));
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-89179233L), (long) (-350035111));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 31215862722049863");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 201354638, 532281952, (-3162));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(21064, (-109346908), 533301015);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21064 + "'", int3 == 21064);
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-18980207), 119398608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 101008454, 608209176, 34875834);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(403073675758847340L, (long) (-1989861));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 403073675756857479L + "'", long2 == 403073675756857479L);
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2658887L), 6407448057348624L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2658887 * 6407448057348624");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-853704), 89301778, (-39585000), 25373);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-30383048) + "'", int4 == (-30383048));
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(112127724398080L, 3461411L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 112127724398080 * 3461411");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-451803017783562L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -451803017783562");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6852211889124858L), (-185890406320L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -6852211889124858 * -185890406320");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-15951520), (long) 100964278);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 85012758L + "'", long2 == 85012758L);
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3770626), 3117618, 950100085);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 943211842 + "'", int3 == 943211842);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-17965), (-6960), 1465063437);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-68277286), (-129148057));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(3500415);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3500415) + "'", int1 == (-3500415));
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1234120), (-32482072), 1712594601, 2295252);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-868), (-2858763), 210);
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(64244, 314527061);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 64244 * 314527061");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-80635680), (-667524577533L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -80635680 * -667524577533");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(20, (-281698083));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-281698063) + "'", int2 == (-281698063));
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-790000L), (long) 10689680);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -8444847200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1763469777), (-490002), (-99684041));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1712671034);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1712671034) + "'", int1 == (-1712671034));
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-415654715L), (-5772L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2399159014980L + "'", long2 == 2399159014980L);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(299824116, 25444);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 299849560 + "'", int2 == 299849560);
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(349956635);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-349956635) + "'", int1 == (-349956635));
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(168472109, 8730, (-1781847), (-1678));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-635311) + "'", int4 == (-635311));
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-173612538), (-18980207), 2245596);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -173612538 for hi! must be in the range [-18980207,2245596]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-952557498), (-155277600), 223364815);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1505073, 1147279, (-3480386), 176411200);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2652352 + "'", int4 == 2652352);
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-530216924), (-620));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-530217544) + "'", int2 == (-530217544));
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1139, 1715156650, (-1713170345));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1139 for  must be in the range [1715156650,-1713170345]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(758468816, 59916161, (-10985));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-372968475390049L), (-3996339497L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -372968475390049 * -3996339497");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(354520488, 669, 16524);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12040 + "'", int3 == 12040);
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 12195475, (long) (-1277533));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13473008L + "'", long2 == 13473008L);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(442559, 531793);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 974352 + "'", int2 == 974352);
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1723148370));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1723148370 + "'", int1 == 1723148370);
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-97392408), 3438639);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -97392408 * 3438639");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 1, (-34386408));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34386408) + "'", int2 == (-34386408));
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(582328771044L, (-450684));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-262446259849194096L) + "'", long2 == (-262446259849194096L));
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-4485350), 609053028, 126765561);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4485350 for  must be in the range [609053028,126765561]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-106394130), 192159473, 1757322706);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -106394130 for  must be in the range [192159473,1757322706]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 970111, (-31987164));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-34386458), (-151069740), (-129279438));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-143337973) + "'", int3 == (-143337973));
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(6236554379070120000L, (-415566396L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6236554379485686396L + "'", long2 == 6236554379485686396L);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1737969L, 87410194);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 151916207455986L + "'", long2 == 151916207455986L);
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-13020480), 686, (-679952));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1925133904, (-254849));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1924879055 + "'", int2 == 1924879055);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-4418968546387620000L), (long) 49439738);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4418968546387620000 * 49439738");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(874089, 302176508);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 874089 * 302176508");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1867131262), 231121797393338L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1867131262 * 231121797393338");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3162), 1755570876, (-609053028));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(715471229, 1838776);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 717310005 + "'", int2 == 717310005);
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-82215000L), (long) (-679952));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 55902253680000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 13473008L, (java.lang.Object) (-4506));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-46590600L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1718668813), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1718668813) + "'", int2 == (-1718668813));
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-633647202));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 633647202 + "'", int1 == 633647202);
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-192172), (long) (-106820930));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-107013102L) + "'", long2 == (-107013102L));
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 908660727, (-254849), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1945308, 145149152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 147094460 + "'", int2 == 147094460);
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1508037, 128814969, 649332);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-47525247), (-9286460), (-944360622));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3328171833047L, (-2222074195L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3330393907242L + "'", long2 == 3330393907242L);
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1481378917L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1481378917 + "'", int1 == 1481378917);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-44), 101008454, 197955921);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1552962195L), (-1943430));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3018073318628850L + "'", long2 == 3018073318628850L);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-173543860), (-1552962195L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1726506055L) + "'", long2 == (-1726506055L));
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-728), 518052028);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 518051300 + "'", int2 == 518051300);
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-600832203), (long) (-601292683));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1202124886L) + "'", long2 == (-1202124886L));
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 52957194, (-99920273), (-300969892));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-204614145), 4480369, 80635684, 87410194);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 84395686 + "'", int4 == 84395686);
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 339160985, (-1131200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-383658906232000L) + "'", long2 == (-383658906232000L));
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(5740, 936406936);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 936412676 + "'", int2 == 936412676);
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 874263, 1638607297, 533301015);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-34386408), 6289801);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -34386408 * 6289801");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-17424), 0, 13393);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(266405443700400000L, (-117895782673235220L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 384301226373635220L + "'", long2 == 384301226373635220L);
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 44199872);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44199872 + "'", int1 == 44199872);
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(171478518, 10100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 171478518 * 10100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-200015116), 598705500, 10, (-66534));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-185446), (-47620), 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-42187) + "'", int3 == (-42187));
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(6720552295014L, 7978668911586900L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 6720552295014 * 7978668911586900");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1108968548308711L, (-16067820943119330L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17176789491428041L + "'", long2 == 17176789491428041L);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-8252422149000L), (long) (-15409940));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -8252422149000 * -15409940");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(947169552497407470L, 602790802266828L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 946566761695140642L + "'", long2 == 946566761695140642L);
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) (-17287333));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17287333L) + "'", long2 == (-17287333L));
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1757322706, 21963942, 400483318);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10689680, 185867227, (-3770626));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-31916932));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31916932 + "'", int1 == 31916932);
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-4785376));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4785376) + "'", int1 == (-4785376));
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1712594601, 0, 949426390);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 106462890, (java.lang.Object) (-1713149062));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-105975170), 47610286, 435321441);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -105975170 for hi! must be in the range [47610286,435321441]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9593040347982992L, (java.lang.Object) (-935157147));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-30032076683980800L), (long) 10308);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -30032076683980800 * 10308");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 18686280, 0, 18980207);
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 921598717, (-3499569), (-212411343));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 921598717 for  must be in the range [-3499569,-212411343]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-30827186), (java.lang.Object) 191697613241321780L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(272209956366432L, 1578);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 429547311146229696L + "'", long2 == 429547311146229696L);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-30032076683980800L), (java.lang.Object) (-9788));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2466));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2466 + "'", int1 == 2466);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-82215000), 1757322706);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1675107706 + "'", int2 == 1675107706);
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2987409), (-183457343));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-186444752) + "'", int2 == (-186444752));
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(14747244, (-27826));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 14747244 * -27826");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(115236L, (long) (-609053028));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-608937792L) + "'", long2 == (-608937792L));
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-40322560), 0, (-46895));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -40322560 for hi! must be in the range [0,-46895]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 95781, 68379694, 725320);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 95781 for hi! must be in the range [68379694,725320]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(733892, 115104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 733892 * 115104");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-4710915), 209886893, (-4665));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-518159L), (long) 230746822);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -119563542540698");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3723223641L), (-1120));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4170010477920L + "'", long2 == 4170010477920L);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1990613L), 493176566160L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-981723683893456080L) + "'", long2 == (-981723683893456080L));
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-51), 42092700, 3005390);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1763425054), (-450));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1763425054 * -450");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-461492506134000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -461492506134000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-184), 53816);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53632 + "'", int2 == 53632);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-15359825816420L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 959334, 18103360977L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17367169699509318L + "'", long2 == 17367169699509318L);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-168573390), 490002);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -168573390 * 490002");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-26553), (long) (-344489));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-371042L) + "'", long2 == (-371042L));
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 7739630, 0, (-2103102));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1761730), 3469518);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1761730 * 3469518");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 247359700, (long) 168544800);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 415904500L + "'", long2 == 415904500L);
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2581684), (long) (-1075288));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3656972L) + "'", long2 == (-3656972L));
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(199359, (-497209), 1111, 80635680);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 80336720 + "'", int4 == 80336720);
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-25801760));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25801760 + "'", int1 == 25801760);
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-633105360), (-3036L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-633102324L) + "'", long2 == (-633102324L));
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(808191813, (-1656143), (-62086), (-853932));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 999731834, (long) 122129848);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 877601986L + "'", long2 == 877601986L);
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9477L, 1714805053L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16251207487281L + "'", long2 == 16251207487281L);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(3469518, 219899, 108109069);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3469518 + "'", int3 == 3469518);
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1620270, 629990222, 936407036, (-947642470));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 85344156, (java.lang.Object) (-586809815));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(812374164, 304434558, 48014510, (-2235464));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-592), 97180281);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-57530726352L) + "'", long2 == (-57530726352L));
    }
}

