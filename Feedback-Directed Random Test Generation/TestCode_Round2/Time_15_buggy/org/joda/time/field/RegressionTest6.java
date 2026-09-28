package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test03001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03001");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1761078660), 0, 239466083);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 154650012 + "'", int3 == 154650012);
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03002");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2304106, (-244802), (-576));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03003");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 874263, (long) 9691);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 883954L + "'", long2 == 883954L);
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03004");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(350035000L, (-43925298601464000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 350035000 * -43925298601464000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03005");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3435191790950612L, 2005430);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3435191790950612 * 2005430");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03006");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-35));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03007");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 0.0f, (java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03008");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(177664191, (-934667), (-349957368));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03009");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-35), 171478832, 296192052);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 249426407 + "'", int3 == 249426407);
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03010");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 115104, 147147648400381790L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 115104 * 147147648400381790");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03011");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-329312221170190L), (java.lang.Object) 2161648545000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03012");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-152286), 172893415187088L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 172893415034802L + "'", long2 == 172893415034802L);
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03013");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6963094429000L), (long) 2959176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6963091469824L) + "'", long2 == (-6963091469824L));
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03014");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(7018146835128L, 1491868123022L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 7018146835128 * 1491868123022");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03015");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(32482053, (-171469054), 533310184, 339160985);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03016");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) '4', 17319362032L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17319362084L + "'", long2 == 17319362084L);
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03017");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-950048943), 100962303, 15345);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03018");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-468), 0, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03019");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(9989L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03020");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3461473L, (-2110080L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5571553L + "'", long2 == 5571553L);
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03021");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(30453054657L, (-1001404800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31454459457L + "'", long2 == 31454459457L);
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03022");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-7900L), 880);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6952000L) + "'", long2 == (-6952000L));
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03023");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-48014510), (-100459952));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-148474462) + "'", int2 == (-148474462));
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03024");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(582328281600L, 2005430);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1167818605769088000L + "'", long2 == 1167818605769088000L);
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03025");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (-1205574775L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1205574775L + "'", long2 == 1205574775L);
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03026");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (-3328133821432L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3328133821432L + "'", long2 == 3328133821432L);
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03027");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-709281L), (java.lang.Object) 99835208L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03028");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(276115994100L, (long) (-952907498));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 276115994100 * -952907498");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03029");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(863097812129976L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 863097812129976");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03030");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-3499569), 153251, 351665413);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3499569 for  must be in the range [153251,351665413]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03031");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 533310184, (-882000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 532428184L + "'", long2 == 532428184L);
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03032");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(539633, 1370574, 9989, 1715697100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1910207 + "'", int4 == 1910207);
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03033");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1788087917, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1788087917 * 1000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03034");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(3045000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3045000) + "'", int1 == (-3045000));
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03035");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1717685969), (-950048943), 532426752);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03036");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-600832203), (-688), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-441) + "'", int3 == (-441));
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03037");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(489951, 709960, (-1953880), (-1713170345));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03038");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(173189501403448L, 7848L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 173189501395600L + "'", long2 == 173189501395600L);
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03039");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 168472090);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03040");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(15345, 1763460000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1763475345 + "'", int2 == 1763475345);
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03041");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-35032), (-168573390));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -35032 * -168573390");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03042");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-301848066), (-76433), 156879);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -301848066 for  must be in the range [-76433,156879]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03043");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-18), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03044");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-126952484160060L), (java.lang.Object) 1481678848L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03045");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-100460641), 101009154);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10147444357707714L) + "'", long2 == (-10147444357707714L));
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03046");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9989, 0, 635218511, 149158);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03047");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-86), 911);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-78346) + "'", int2 == (-78346));
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03048");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(34254582120L, 176421201);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6043234517363526120L + "'", long2 == 6043234517363526120L);
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03049");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 78558096027L, (java.lang.Object) (-132));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03050");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3499550L, (-97753263347680800L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3499550 * -97753263347680800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03051");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 153251, (java.lang.Object) 1943780);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03052");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-52));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03053");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-100459953), 64, (-310));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -100459953 for hi! must be in the range [64,-310]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03054");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1712671034, (long) (-76433));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1712594601L + "'", long2 == 1712594601L);
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03055");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1450548), 0, (-34386408));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1450548 for  must be in the range [0,-34386408]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03056");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-450683), (-600842000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-601292683) + "'", int2 == (-601292683));
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03057");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-214183750), 1142L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-244597842500L) + "'", long2 == (-244597842500L));
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03058");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1953880), (-147147648405810000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 147147648403856120L + "'", long2 == 147147648403856120L);
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03059");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(958464, (-108685080), (-600842000), (-729));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-107726616) + "'", int4 == (-107726616));
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03060");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-13020480), 949427360L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 936406880L + "'", long2 == 936406880L);
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03061");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-9123345), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9123345) + "'", int2 == (-9123345));
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03062");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-620), (java.lang.Object) 1470988428);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03063");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-254849), 10200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2599459800L) + "'", long2 == (-2599459800L));
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03064");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(3499569L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3499569 + "'", int1 == 3499569);
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03065");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1989687), 9999, (-1879789912));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03066");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-18), (-1879789912), (-537804800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03067");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(324783600L, (long) (-9169));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2977940828400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03068");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(870, 6289801);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 870 * 6289801");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03069");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 310, 586809815, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03070");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(152286, (-1761479067), 254849, 2440438);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 258759 + "'", int4 == 258759);
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03071");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(86130);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-86130) + "'", int1 == (-86130));
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03072");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1990710), (-84385200), (-3480228), (-17802));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3277662) + "'", int4 == (-3277662));
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03073");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) 'a', (-46322273));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 97 * -46322273");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03074");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-688));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 688 + "'", int1 == 688);
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03075");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-934667), (-101));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94401367 + "'", int2 == 94401367);
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03076");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(153428, (-76433));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 153428 * -76433");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03077");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1023879406695015L, 2865594368L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023876541100647L + "'", long2 == 1023876541100647L);
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03078");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-350034159L), (-105840302582167054L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105840302932201213L) + "'", long2 == (-105840302932201213L));
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03079");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1999672), (-17899), (-2235464));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03080");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(3510537456600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3510537456600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03081");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-33751711242L), (-412));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13905705031704L + "'", long2 == 13905705031704L);
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03082");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(90L, (long) 2959176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2959086L) + "'", long2 == (-2959086L));
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03083");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(576, (-3398104), (-729));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3396800) + "'", int3 == (-3396800));
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03084");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(4479760, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-80635680) + "'", int2 == (-80635680));
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03085");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-57069L), (java.lang.Object) (-873000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03086");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 108109069, (long) (-99440784));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -10750450578870096");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03087");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(577);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-577) + "'", int1 == (-577));
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03088");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-169871L), (-1207025507L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1207195378L) + "'", long2 == (-1207195378L));
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03089");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3499569, (-5772L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20199512268L) + "'", long2 == (-20199512268L));
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03090");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1999672));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1999672 + "'", int1 == 1999672);
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03091");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(11771406974L, (long) 1470988428);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 11771406974 * 1470988428");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03092");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1763450397));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1763450397) + "'", int1 == (-1763450397));
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03093");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(254849, (-587951));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 254849 * -587951");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03094");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-108685080));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 108685080 + "'", int1 == 108685080);
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03095");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) 100, 1517218488, 56611);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03096");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1454523), 9788, 10552);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03097");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(880, (-214183750), 296192052);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 880 + "'", int3 == 880);
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03098");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1990710), 399618, 188152939);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1990710 for hi! must be in the range [399618,188152939]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03099");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1174462, 111, 0, 1738657);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1174573 + "'", int4 == 1174573);
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03100");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 1, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03101");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 147147648302611619L, (java.lang.Object) 504032);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03102");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 3038);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3038 + "'", int1 == 3038);
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03103");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-87500552100L), 315624238L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -87500552100 * 315624238");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03104");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(52, 1482832080);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 52 * 1482832080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03105");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-69484049307216L), (long) (-601337));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69484049908553L) + "'", long2 == (-69484049908553L));
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03106");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-33751711242L), (java.lang.Object) (-738109629742464000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03107");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(41511168L, 420386456);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17450732799940608L + "'", long2 == 17450732799940608L);
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03108");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(22246411L, 189935540116053039L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 22246411 * 189935540116053039");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03109");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(335272154, (-236129206), 3909, (-3480386));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03110");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-601337), (-163115));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [-601337,-163115]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03111");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(99835728L, (-1761078660));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-175818570086364480L) + "'", long2 == (-175818570086364480L));
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03112");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(35814600L, 63702720L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2281487435712000L + "'", long2 == 2281487435712000L);
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03113");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-951502398), 7739630);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03114");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 37128L, (java.lang.Object) 3499550L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03115");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2248540, (-1454874));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2248540 * -1454874");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03116");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 4479760);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4479760 + "'", int1 == 4479760);
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03117");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46831, 106584691L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4991467664221L + "'", long2 == 4991467664221L);
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03118");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-81725049), 0, (-9169));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03119");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-970111L), 1788088016);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1734643853289776L) + "'", long2 == (-1734643853289776L));
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03120");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-314), 1802640000, (-13020480), (-17423));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4785376) + "'", int4 == (-4785376));
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03121");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(351375808265460L, (long) (-163115));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 351375808428575L + "'", long2 == 351375808428575L);
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03122");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3509768L), 7739630L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4229862L + "'", long2 == 4229862L);
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03123");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-161986), (-81725049));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13238313787314L + "'", long2 == 13238313787314L);
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03124");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-52), 37948040, (-204677760));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03125");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(628056570);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-628056570) + "'", int1 == (-628056570));
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03126");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-503932), 973781);
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03127");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-33916098500L), (-97770222L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34013868722L) + "'", long2 == (-34013868722L));
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03128");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1548619507182706L), (-105840302932201213L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1548619507182706 * -105840302932201213");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03129");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3404749101039L), (long) (-9691));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 32995423538168949");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03130");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(115236L, (long) 154650012);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-154534776L) + "'", long2 == (-154534776L));
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03131");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(171459354L, (long) (-1717685969));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -294513326619604026");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03132");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 198471500L, (java.lang.Object) 7848L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03133");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 532281952, 1990810, (-503932));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03134");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1999672, 46851);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93686632872L + "'", long2 == 93686632872L);
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03135");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-61117), (-87), (-214183750));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03136");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-880), (int) (byte) -1, (-1953880));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03137");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 14227, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03138");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-951492297), 168472090);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -951492297 * 168472090");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03139");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(507005, (-18000), 4231920);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 507005 + "'", int3 == 507005);
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03140");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2065028));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2065028 + "'", int1 == 2065028);
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03141");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(498646, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03142");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(776875860L, (-198112800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-153909051877008000L) + "'", long2 == (-153909051877008000L));
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03143");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-34386390), 8209, 2959176);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03144");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-87), (-10047));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 874089L + "'", long2 == 874089L);
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03145");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', (-17899), (-2110080), (-789));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-17864) + "'", int4 == (-17864));
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03146");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 2065028, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2065028L + "'", long2 == 2065028L);
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03147");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(48456408803446250L, (-35));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1695974308120618750L) + "'", long2 == (-1695974308120618750L));
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03148");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-257397490), (java.lang.Object) 532427871);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03149");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-617272946631430954L), (long) 504032);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-617272946630926922L) + "'", long2 == (-617272946630926922L));
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03150");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(504032, (-80));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40322560) + "'", int2 == (-40322560));
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03151");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(376L, 9169);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3447544L + "'", long2 == 3447544L);
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03152");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-61117), (-539633), 153251);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-61117) + "'", int3 == (-61117));
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03153");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5827567963889969L), (-1784714));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -5827567963889969 * -1784714");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03154");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(100449343, 86130, (-14307));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03155");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-882000L), (long) (-963979));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1845979L) + "'", long2 == (-1845979L));
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03156");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-39585000), 2582129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -39585000 * 2582129");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03157");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(530216924, (-1761079449));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 530216924 * -1761079449");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03158");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(185867227, (-65066), (-1999671), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-167335) + "'", int4 == (-167335));
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03159");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(10858867146354L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 10858867146354");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03160");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 100963445, (-1491865838400L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 100963445 * -1491865838400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03161");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1712594601L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1712594601 + "'", int1 == 1712594601);
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03162");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (short) 10, 3038, 7739630);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for  must be in the range [3038,7739630]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03163");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 87, (-14149), 1482832281);
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03164");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-350000), 1989861, 0, 10049);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1711 + "'", int4 == 1711);
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03165");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(276115994100L, 9076L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 276116003176L + "'", long2 == 276116003176L);
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03166");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 582328281600L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03167");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 34386390, (java.lang.Object) (-450));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03168");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-34013868722L), 37128L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1262866917910416");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03169");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-970000), (-812374164));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -970000 * -812374164");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03170");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1126887300, (-106403849));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1126887300 * -106403849");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03171");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2065028), (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2065033) + "'", int2 == (-2065033));
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03172");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-35), (long) 185867227);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6505352945");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03173");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 872, (-122484040), (-53816));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 872 for  must be in the range [-122484040,-53816]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03174");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9999, 958464, 450);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03175");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1760510603), (-17899), (-62000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03176");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(17319361684L, (-1058238078051775698L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 17319361684 * -1058238078051775698");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03177");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1370574, (-65066));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1370574 * -65066");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03178");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-122484040), (long) (-1454524));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 178155975796960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03179");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 339160985, (-372984608205200L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 339160985 * -372984608205200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03180");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 56, 936406880L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 936406936L + "'", long2 == 936406936L);
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03181");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(3438639L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3438639 + "'", int1 == 3438639);
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03182");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1), 9778, 1910207);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03183");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-204685393), (-1174462));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 240395216033566L + "'", long2 == 240395216033566L);
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03184");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 12100448, (java.lang.Object) (-1990388));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03185");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1943430, (-100460641), (-158));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03186");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 31508272, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03187");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3328137331200L), (-82211962L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3328137331200 * -82211962");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03188");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-970000), 10100, 1910207);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03189");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(73477967816424400L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 73477967816424400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03190");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-100), 304461111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 304461011 + "'", int2 == 304461011);
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03191");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3328133821432L), (long) (-300969892));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3328434791324L) + "'", long2 == (-3328434791324L));
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03192");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-34013868722L), (-4418968546387620000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -34013868722 * -4418968546387620000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03193");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1910207, 5148);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1910207 * 5148");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03194");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(700, (-168573390));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-168572690) + "'", int2 == (-168572690));
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03195");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-61117), (-105840302582167054L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105840302582228171L) + "'", long2 == (-105840302582228171L));
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03196");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1450647));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1450647 + "'", int1 == 1450647);
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03197");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(62000, 1763460000, 350000, (-1953880));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03198");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(10398, (-1999672));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 10398 * -1999672");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03199");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3499569), (-8700000), 0);
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03200");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1454523), (long) (-1530017442));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2225445559790166");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03201");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(26511433, 549);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26511982 + "'", int2 == 26511982);
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03202");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 445, (java.lang.Object) (-15514L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03203");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(22199491L, 872L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 19357956152");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03204");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(185867227, (-79));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 185867148 + "'", int2 == 185867148);
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03205");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2103102), 0, 152286);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03206");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 833, 296192052);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 246727979316L + "'", long2 == 246727979316L);
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03207");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-168573390), 35, 0, (-442560));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03208");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(121054688, (-1530017442), (-9797), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2250) + "'", int4 == (-2250));
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03209");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-155277600), (-107726616), 3909);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03210");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-86), (-601337), (-874263), 108685080);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-601423) + "'", int4 == (-601423));
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03211");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-66534), 4231920, 10552);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03212");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 73710, (java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03213");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(48456409753999671L, (long) (-3509649));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 48456409753999671 * -3509649");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03214");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-61117), (-106412530));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -61117 * -106412530");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03215");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-148474462), 620, (-62000), (-314));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-54920) + "'", int4 == (-54920));
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03216");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 168544800, 1174365, (-1710528757));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 168544800 for hi! must be in the range [1174365,-1710528757]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03217");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1174462, 0, 2065028, 1989700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03218");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-106403849), 351665413, 30906162);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03219");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1300343640135249600L, (java.lang.Object) (-51187193470L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03220");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1010, 258759, 35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1010 for  must be in the range [258759,35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03221");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(58975891968000L, (long) 27);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58975891968027L + "'", long2 == 58975891968027L);
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03222");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-101), 185867148, 3438639);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03223");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 539633, (-8209), (-954811));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03224");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 94401367, 335272154);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31650149654634518L + "'", long2 == 31650149654634518L);
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03225");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(351665413, (-8700000), 24429098, 4479760);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03226");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6143290345686900L), (-16987813610L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6143307333500510L) + "'", long2 == (-6143307333500510L));
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03227");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2658887L), (long) (-950048943));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-952707830L) + "'", long2 == (-952707830L));
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03228");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-236129206));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 236129206 + "'", int1 == 236129206);
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03229");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 304461111, (-66534), 3499569);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 304461111 for hi! must be in the range [-66534,3499569]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03230");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(191697613241321780L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 191697613241321780");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03231");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-503932), 880, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03232");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4046116129740000L), (-152286));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4046116129740000 * -152286");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03233");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 10001, (-312), (-2250));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10001 for hi! must be in the range [-312,-2250]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03234");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2065028L, (java.lang.Object) 1765498096L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03235");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 949427270, (long) (-944118497));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-896371847163213190L) + "'", long2 == (-896371847163213190L));
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03236");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1682020L), (-273456367L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-275138387L) + "'", long2 == (-275138387L));
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03237");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1788087917);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1788087917 + "'", int1 == 1788087917);
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03238");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2065028, (-100490000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-207514663720000L) + "'", long2 == (-207514663720000L));
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03239");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-700), (-299315787));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -700 * -299315787");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03240");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(176421201, (-79));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 176421201 * -79");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03241");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-127769401782L), (long) (-53248));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-127769348534L) + "'", long2 == (-127769348534L));
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03242");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(98640, 210);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20714400 + "'", int2 == 20714400);
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03243");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-8700000), (-300979678), 14227);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8700000) + "'", int3 == (-8700000));
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03244");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2110080), 2284709);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 174629 + "'", int2 == 174629);
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03245");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-100), (long) 1943780);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1943880L) + "'", long2 == (-1943880L));
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03246");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-33751711242L), 870);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29363988780540L) + "'", long2 == (-29363988780540L));
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03247");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-80));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 80 + "'", int1 == 80);
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03248");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-349957368), (long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -33945864696");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03249");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-211672136), 9972, (-789));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03250");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 184, (long) 4479760);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4479944L + "'", long2 == 4479944L);
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03251");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 48456409752010398L, (java.lang.Object) (-372966671566984L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03252");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-97770222L), (-617272946630926922L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -97770222 * -617272946630926922");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03253");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1760510603), 46831, 0, 154650012);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 95336384 + "'", int4 == 95336384);
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03254");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 100962303, 841, (-601423));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03255");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1925124040), 122377675L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2047501715L) + "'", long2 == (-2047501715L));
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03256");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(44199872L, (long) 2284622);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 100979999968384");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03257");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1277533), (-729));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1278262) + "'", int2 == (-1278262));
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03258");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1174365, 532281952, (-16990520), 47525347);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 17329373 + "'", int4 == 17329373);
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03259");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-537804800), (-539633), (-11), 2005438);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1121617 + "'", int4 == 1121617);
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03260");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(7146781980L, 154650012);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1105249918968383760L + "'", long2 == 1105249918968383760L);
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03261");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 37948040);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37948040 + "'", int1 == 37948040);
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03262");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1989687), 3509649);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6983102989863L) + "'", long2 == (-6983102989863L));
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03263");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1738657, (-35), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03264");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1174573, 709901);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 833830547273L + "'", long2 == 833830547273L);
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03265");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-4506), (-595172454895660506L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-595172454895665012L) + "'", long2 == (-595172454895665012L));
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03266");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-8372910), 97, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03267");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 100, (-1715697100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03268");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 709790L, (java.lang.Object) 312315);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03269");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(96, 1943430, 4479760);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2536427 + "'", int3 == 2536427);
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03270");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 576, 115104, (-208569710));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03271");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(99881989L, (-153066));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15288536528274L) + "'", long2 == (-15288536528274L));
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03272");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1470988937L, (long) 312315);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 459411909859155");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03273");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 49, (-951493178), 586809815);
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03274");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-18400), (-349946851));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -18400 * -349946851");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03275");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 201, 841, 47525347);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 201 for hi! must be in the range [841,47525347]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03276");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-521191424), (-146793024), (-1147540070));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03277");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(4229862L, 9875);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41769887250L + "'", long2 == 41769887250L);
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03278");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(95336384, (-8372910), (-350035111));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03279");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(97770180L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03280");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-38868600), (-166315520939630L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-166315559808230L) + "'", long2 == (-166315559808230L));
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03281");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 53248, (long) 709901);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-656653L) + "'", long2 == (-656653L));
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03282");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1763475345, (-7889211), 1705);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03283");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(99832172L, (long) (-1454523));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-145208190313956L) + "'", long2 == (-145208190313956L));
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03284");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-27826), (long) 970000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -26991220000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03285");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1990613L), (long) 1482832080);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1480841467L + "'", long2 == 1480841467L);
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03286");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1789774L, (long) 188152939);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 336751238245786L + "'", long2 == 336751238245786L);
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03287");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-9123345), 17466817670L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-159355803655506150L) + "'", long2 == (-159355803655506150L));
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03288");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 99385044L, (java.lang.Object) 3996508940L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03289");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-188114696), (-2103102), (-950048943), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-190217798) + "'", int4 == (-190217798));
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03290");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 184);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 184 + "'", int1 == 184);
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03291");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 97, 1313L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1410L + "'", long2 == 1410L);
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03292");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-601423), 479643, (-10));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -601423 for hi! must be in the range [479643,-10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03293");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-146793024), (long) 1119);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-164261393856L) + "'", long2 == (-164261393856L));
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03294");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-9169), 970000, (-300551));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9169 for hi! must be in the range [970000,-300551]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03295");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-3509649), (long) 154650012);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-158159661L) + "'", long2 == (-158159661L));
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03296");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-5827584583260000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5827584583260000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03297");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-153909051877008000L), (-61432903456869L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-153847618973551131L) + "'", long2 == (-153847618973551131L));
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03298");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(6963094429000L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03299");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-951493178), (-1713170126), (-96));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-951493178) + "'", int3 == (-951493178));
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03300");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9700, 49, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03301");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-617272946630926922L), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03302");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 6289801, (long) (-310));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6289491L + "'", long2 == 6289491L);
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03303");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-3076404217825918720L), (-3996509288L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3076404213829409432L) + "'", long2 == (-3076404213829409432L));
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03304");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-23869018920L), (java.lang.Object) 17935455210L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03305");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1450732L, (java.lang.Object) 324783600L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03306");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 62, (-14227));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-882074L) + "'", long2 == (-882074L));
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03307");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-600842000), (-312315), 801902322);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 201372638 + "'", int3 == 201372638);
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03308");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3053498160L, (long) 2005430);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3055503590L + "'", long2 == 3055503590L);
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03309");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-450), (long) (-100459953));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 45206978850");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03310");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(357120L, (-2161648995684L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2161649352804L + "'", long2 == 2161649352804L);
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03311");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-201), (-1713170126));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -201 * -1713170126");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03312");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1717685969), (-580601));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 997290191287369L + "'", long2 == 997290191287369L);
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03313");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-96), 149158, 14307);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03314");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-709960), 1989861, (-4506), (-257397490));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03315");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(399618);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-399618) + "'", int1 == (-399618));
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03316");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 34386390, (-1), 949427270);
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03317");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(590309465);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-590309465) + "'", int1 == (-590309465));
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03318");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1878586898331691800L, (-77228082932L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1878586821103608868L + "'", long2 == 1878586821103608868L);
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03319");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-77338269012L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -77338269012");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03320");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(577142280, (-1010899));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 576131381 + "'", int2 == 576131381);
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03321");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 101009154, (long) (-1989861));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -200994176187594");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03322");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-954811), (-1000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 954811000 + "'", int2 == 954811000);
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03323");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(539633, (-153066), (-204685393), (-101));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-204298726) + "'", int4 == (-204298726));
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03324");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-592), 2536427, 9972);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03325");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-161986), 3499650);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3337664 + "'", int2 == 3337664);
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03326");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1370574L, 314968500L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 316339074L + "'", long2 == 316339074L);
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03327");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-300551), 1989700);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -300551 * 1989700");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03328");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-949417406));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 949417406 + "'", int1 == 949417406);
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03329");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(46930, 609053028, (-1142), 688);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-502) + "'", int4 == (-502));
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03330");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 533301015, 349956900, (-34386408));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03331");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1943780), 0, (-812374164));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1943780 for hi! must be in the range [0,-812374164]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03332");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(100L, 949417406);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 94941740600L + "'", long2 == 94941740600L);
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03333");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 111, 351375808428575L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-351375808428464L) + "'", long2 == (-351375808428464L));
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03334");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(53706552900000L, 281688465L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 53706552900000 * 281688465");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03335");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-3277662), (-210L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 688309020 + "'", int2 == 688309020);
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03336");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(171478832, 149158);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 171478832 * 149158");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03337");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-61432903456277L), 2005430);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -61432903456277 * 2005430");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03338");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-570400), (-15952400), 2440438);
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03339");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1470988428, (-62000), (-577));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-54948) + "'", int3 == (-54948));
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03340");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1738657), 489444, (-3277662), (-3398104));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03341");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-349956900));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 349956900 + "'", int1 == 349956900);
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03342");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-159620L), 1890034360661700L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1890034360821320L) + "'", long2 == (-1890034360821320L));
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03343");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 2582129);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03344");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 9700, (long) (-171478832));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-171469132L) + "'", long2 == (-171469132L));
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03345");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 155277732);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03346");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-65066), (-111), 26511433);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -65066 for hi! must be in the range [-111,26511433]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03347");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1470988428), 16524, 10047, (-789));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03348");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2923493247072L), (long) 8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2923493247064L) + "'", long2 == (-2923493247064L));
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03349");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-944117276L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-944117276) + "'", int1 == (-944117276));
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03350");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-951492297));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 951492297 + "'", int1 == 951492297);
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03351");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(6069060510816L, 1480841467L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 6069060510816 * 1480841467");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03352");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(6015L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6015 + "'", int1 == 6015);
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03353");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1462492152L, (java.lang.Object) 14227);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03354");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(6289801);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6289801) + "'", int1 == (-6289801));
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03355");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 520, 1517218488, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03356");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1196950), (-1761479067));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1762676017) + "'", int2 == (-1762676017));
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03357");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(756956234624478L, (long) (-1530017442));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 756956234624478 * -1530017442");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03358");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(152286, 99440784);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99593070 + "'", int2 == 99593070);
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03359");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1715697100, 908660727, 1174573);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03360");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-171478832), 1989057L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-173467889L) + "'", long2 == (-173467889L));
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03361");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 628056570);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 628056570 + "'", int1 == 628056570);
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03362");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1686886240, (-323521822L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1363364418L + "'", long2 == 1363364418L);
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03363");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 874263, 420368508, (-146793024));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 874263 for  must be in the range [420368508,-146793024]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03364");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 47525247, (-34386308), 1530017442);
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03365");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-18400), (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18303L) + "'", long2 == (-18303L));
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03366");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(73710, 99, (-100), 450);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-25) + "'", int4 == (-25));
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03367");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-99440784), (-1), 2284622);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03368");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-372966669790824L), (long) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1864833348954120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03369");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(127833122375L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 127833122375");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03370");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-15951520), 246727979316L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-246743930836L) + "'", long2 == (-246743930836L));
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03371");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1517218488, 115104, 1119);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03372");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 533310184, (-221718630), (-61510));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03373");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-47524559), (-10100), 1784800, 503932);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03374");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(17319362032L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03375");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 12100448, (-51));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-617122848L) + "'", long2 == (-617122848L));
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03376");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 874263, (long) 176421201);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 154238528449863");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03377");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-450683), 149158, 106575000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 105975160 + "'", int3 == 105975160);
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03378");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1765497216L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1765497216 + "'", int1 == 1765497216);
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03379");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(32482053, (-15951520));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 32482053 * -15951520");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03380");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(586809815, 920, (-1454523), 629990222);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 586810735 + "'", int4 == 586810735);
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03381");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-146793024), 34875834);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03382");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 350, (-7920L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8270L + "'", long2 == 8270L);
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03383");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 783775357050000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 783775357050000L + "'", long2 == 783775357050000L);
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03384");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(9691);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9691) + "'", int1 == (-9691));
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03385");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-69931974934150503L), (long) (-300551));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69931974933849952L) + "'", long2 == (-69931974933849952L));
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03386");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(21963942, 10398, 18, (-570400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03387");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1495740L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1495740 + "'", int1 == 1495740);
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03388");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 86563075L, (java.lang.Object) 6014L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03389");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(46851);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46851) + "'", int1 == (-46851));
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03390");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 1738657);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03391");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(48456409752000000L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03392");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1119, (-1715697100), (-1462491242));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1519234035) + "'", int3 == (-1519234035));
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03393");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(26511982, (-2065028));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 26511982 * -2065028");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03394");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-4918422756L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4918422756");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03395");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(100963445, (-8372910));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 100963445 * -8372910");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03396");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 590309465, (-756956234586347L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 590309465 * -756956234586347");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03397");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-3398104), (-601423), 106575000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3398104 for hi! must be in the range [-601423,106575000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03398");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1738657), 0, (-2235464), 586810735);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1738657) + "'", int4 == (-1738657));
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03399");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-185867227), (long) 230746822);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-416614049L) + "'", long2 == (-416614049L));
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03400");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 21064, (-102842949149280L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102842949170344L + "'", long2 == 102842949170344L);
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03401");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-52), 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5252) + "'", int2 == (-5252));
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03402");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-8700000), (-107726616), (-168573390));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03403");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1989686), 0, 520);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1989686 for  must be in the range [0,520]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03404");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1090328));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1090328) + "'", int1 == (-1090328));
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03405");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(63702620L, 3045228L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66747848L + "'", long2 == 66747848L);
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03406");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 171478832, (long) (-188114696));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16635864L) + "'", long2 == (-16635864L));
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03407");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2065033), (-1989861), 184, (-15651849));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03408");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9788, (java.lang.Object) (-89));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03409");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-76433), (-19), (-1277533));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03410");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 132, (java.lang.Object) 1712594601L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03411");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-18303L), (java.lang.Object) 3499569L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03412");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-7960085057754L), (-896371847163213190L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -7960085057754 * -896371847163213190");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03413");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-96), 655, (-257));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03414");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-221979522200L), (-4901292060000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5123271582200L) + "'", long2 == (-5123271582200L));
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03415");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(789, (-600832203), 3499650, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03416");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-590309465), (int) (byte) 0, 634);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03417");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-48014510));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48014510 + "'", int1 == 48014510);
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03418");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(709908, 709901, (-1142), 399618);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 217526 + "'", int4 == 217526);
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03419");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-146793024), 634344346);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 487551322 + "'", int2 == 487551322);
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03420");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3224329627922L, 700098822733030L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-696874493105108L) + "'", long2 == (-696874493105108L));
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03421");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-8700));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8700 + "'", int1 == 8700);
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03422");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(272209956366432L, (long) (-19));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5171989170962208L) + "'", long2 == (-5171989170962208L));
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03423");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1370574L, (long) 168544800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 231003120715200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03424");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 503932);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 503932 + "'", int1 == 503932);
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03425");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1989686), (java.lang.Object) (-99964856L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03426");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1147540070), (-1763450397), (-25));
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03427");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(185867148, 0, 17802);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3828 + "'", int3 == 3828);
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03428");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-539633), (int) (short) -1, 954811000, 9070);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03429");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 1588537255313989800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1588537255313989800L) + "'", long2 == (-1588537255313989800L));
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03430");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2658977L, 168472090L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 447963412451930L + "'", long2 == 447963412451930L);
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03431");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1990810, (-1755570876));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1990810 * -1755570876");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03432");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-106412530), (java.lang.Object) 7739630L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03433");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-34386308), (java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03434");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 634, 100490000, (-46322273));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03435");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(634344346, 4476722);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 638821068 + "'", int2 == 638821068);
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03436");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 115104, 157773616, 944118497);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03437");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-2065033), (-1174462), 99440784);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2065033 for  must be in the range [-1174462,99440784]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03438");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-87), 1221, 53248, (-601337));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03439");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(178215856L, 35000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6237554960000L + "'", long2 == 6237554960000L);
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03440");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2582129);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2582129) + "'", int1 == (-2582129));
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03441");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-188790000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-188790000) + "'", int1 == (-188790000));
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03442");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3480228), (long) 9169);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-31910210532L) + "'", long2 == (-31910210532L));
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03443");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(709901L, (long) (-317147951));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -225143647562851");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03444");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 0, (-152286));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03445");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-47234), 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-708510) + "'", int2 == (-708510));
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03446");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, 1989861, 451);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03447");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-190217798), 168579832);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03448");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(35517209338L, (long) 27);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35517209365L + "'", long2 == 35517209365L);
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03449");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-999900), (-86130), 833);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-43296) + "'", int3 == (-43296));
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03450");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-601292683), (-15651849));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -601292683 * -15651849");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03451");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(112110, (-13020480));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 112110 * -13020480");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03452");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1000), (-1174462), 10);
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03453");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(874263L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87426300 + "'", int2 == 87426300);
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03454");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(908660727, (-709960));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 908660727 * -709960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03455");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1147540070), 4479760, 9788);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03456");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-7889211), 56);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-441795816L) + "'", long2 == (-441795816L));
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03457");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 22246411L, (java.lang.Object) 177664191);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03458");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(19324562385800L, (-1278262));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 19324562385800 * -1278262");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03459");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2005430, (long) (-590309465));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1183824310394950L) + "'", long2 == (-1183824310394950L));
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03460");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 15345, 98640, (-61510));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03461");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 1, (long) (-34386308));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34386307L) + "'", long2 == (-34386307L));
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03462");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 590309465);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 590309465 + "'", int1 == 590309465);
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03463");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(171459354L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 171459354 + "'", int1 == 171459354);
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03464");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(620, 1530017442, 9788, 37948040);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12487942 + "'", int4 == 12487942);
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03465");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-148474462), (-709960));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -148474462 * -709960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03466");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 3337664, 230746822, 97);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3337664 for  must be in the range [230746822,97]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03467");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3398104, (-512632L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1741976849728L) + "'", long2 == (-1741976849728L));
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03468");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3509649, (-201));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-705439449L) + "'", long2 == (-705439449L));
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03469");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(635218511, 620, (-812374164), 590309465);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-767464499) + "'", int4 == (-767464499));
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03470");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1618160290106L), (-69931974934150503L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69933593094440609L) + "'", long2 == (-69933593094440609L));
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03471");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 487551322);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 487551322 + "'", int1 == 487551322);
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03472");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10552, (long) (-1196950));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12630216400L) + "'", long2 == (-12630216400L));
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03473");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-87), 0, 8209);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8123 + "'", int3 == 8123);
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03474");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-451556L), 46930);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-21191523080L) + "'", long2 == (-21191523080L));
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03475");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-99), (-1278262));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126547938 + "'", int2 == 126547938);
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03476");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-3499569), (long) (-450683));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3048886L) + "'", long2 == (-3048886L));
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03477");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-69933593094440609L), (java.lang.Object) 1167818605769088000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03478");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-704619699), (-323521822L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1028141521L) + "'", long2 == (-1028141521L));
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03479");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-15651849), 11, 188152939);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03480");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-441795816L), 533310184);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-235614207921390144L) + "'", long2 == (-235614207921390144L));
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03481");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 628056570, (-1695974308120618750L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 628056570 * -1695974308120618750");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03482");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-168644268L), (-37993868L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6407448057348624L + "'", long2 == 6407448057348624L);
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03483");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 153251, 351, 1174462);
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03484");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-620), (-1), (-349946851));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03485");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 155277600, 1517218488, 155277732);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03486");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(276116003176L, (long) 620);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 171191921969120L + "'", long2 == 171191921969120L);
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03487");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03488");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 2536427);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2536427 + "'", int1 == 2536427);
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03489");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 350035000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03490");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-99), 973781, (-963979), 1686886240);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 973682 + "'", int4 == 973682);
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03491");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 970000, (java.lang.Object) (-1845979L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03492");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2284622, 51, 1715697100);
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03493");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-5772L), (-1462491242L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1462497014L) + "'", long2 == (-1462497014L));
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03494");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(6289491L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6289491 + "'", int1 == 6289491);
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03495");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1785587), 114L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-203556918L) + "'", long2 == (-203556918L));
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03496");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-688), 32896872L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -22633047936");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03497");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-951493178), (-3034108));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -951493178 * -3034108");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03498");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(349956900, (-3398104));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 349956900 * -3398104");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03499");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 630000000, 100449343, 1763475345);
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03500");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-100459952), (-17899));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -100459952 * -17899");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }
}

