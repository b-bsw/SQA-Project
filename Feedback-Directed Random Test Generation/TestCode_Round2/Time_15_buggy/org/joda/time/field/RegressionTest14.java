package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

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
    public void test07001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07001");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-112185551037401280L), (long) 66369120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-112185550971032160L) + "'", long2 == (-112185550971032160L));
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07002");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-158847200L), 602790802266828L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -158847200 * 602790802266828");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07003");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 695393, (-61510), (-1519234035));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 695393 for  must be in the range [-61510,-1519234035]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07004");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-54948), 1712671034);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-94107847976232L) + "'", long2 == (-94107847976232L));
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07005");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-52));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-52) + "'", int1 == (-52));
    }

    @Test
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07006");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1763460086), (-709960), 926161);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1763460086 for hi! must be in the range [-709960,926161]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07007");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-952907498), (-1762675999), (-1762676017));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07008");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-64), (-171469054), 1889050220);
    }

    @Test
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07009");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 950048943, (java.lang.Object) (-69484049908553L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07010");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 197L, (java.lang.Object) 161986);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07011");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1155965, (java.lang.Object) 8665465796034198L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07012");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1023876541100647L, 63702593L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023876604803240L + "'", long2 == 1023876604803240L);
    }

    @Test
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07013");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-96), 668113250567367135L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -96 * 668113250567367135");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07014");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(8209L, (-403568L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3312889712L) + "'", long2 == (-3312889712L));
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07015");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 2295252, 18000, 353600846);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2295252 + "'", int4 == 2295252);
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07016");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(6959098070575L, (long) 299824116);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6958798246459L + "'", long2 == 6958798246459L);
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07017");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-628056570), 0, (-1713170126), (-19));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-628056570) + "'", int4 == (-628056570));
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07018");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 62, (-952557498), (-1981541));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 62 for hi! must be in the range [-952557498,-1981541]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07019");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2078213173), 125783592, (-79));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07020");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(13905705031704L, (long) (-108109069));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 13905705031704 * -108109069");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07021");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 18867, (-108109069), 3483304);
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07022");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-186412), (-2922338), 0);
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07023");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(185867227, (-312315), (-288303652), (-601292683));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07024");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 853932, (-1990710), 590309465);
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07025");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 2111643072);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2111643072L) + "'", long2 == (-2111643072L));
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07026");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(15546705L, (-1762759876L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27405107778008580L) + "'", long2 == (-27405107778008580L));
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07027");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 833, (-47585L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48418L + "'", long2 == 48418L);
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07028");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(172893415034802L, (long) 9700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1677066125837579400L + "'", long2 == 1677066125837579400L);
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07029");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(35517209365L, (long) 108685080);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35625894445L + "'", long2 == 35625894445L);
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07030");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 880, (long) (-101));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 779L + "'", long2 == 779L);
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07031");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-310), (-6564960), (-6289801));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6328990) + "'", int3 == (-6328990));
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07032");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-489951), 7451, 2005438);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1508037 + "'", int4 == 1508037);
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07033");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(39341073, (-816756018), (-4), 1763475345);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 986060405 + "'", int4 == 986060405);
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07034");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1988776), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1988776) + "'", int2 == (-1988776));
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07035");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(347880555, (-198112800), 3561650, 312598477);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 149767755 + "'", int4 == 149767755);
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07036");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) ' ', (-1010899));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32348768) + "'", int2 == (-32348768));
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07037");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(926161, (-580601), 169182050);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 926161 + "'", int3 == 926161);
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07038");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-103647573), 6962363402025L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -103647573 * 6962363402025");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07039");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-7833964763976120L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7833964763976120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07040");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(29414448413L, 2065028L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 60741659577400564");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07041");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(47986684L, (-1142));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-54800793128L) + "'", long2 == (-54800793128L));
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07042");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(66369120, 95781);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66464901 + "'", int2 == 66464901);
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07043");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2234454L, (java.lang.Object) 3026075L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07044");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 106575000, (long) 4476722);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102098278L + "'", long2 == 102098278L);
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07045");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-100459952), 14747244, (-89177173));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07046");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-7550420), 783775357050000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -7550420 * 783775357050000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07047");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 80, 101);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8080L + "'", long2 == 8080L);
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07048");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(157922);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-157922) + "'", int1 == (-157922));
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07049");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(30906162, (int) (short) -1, 107222400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30906162 + "'", int3 == 30906162);
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07050");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(530216924, 232883752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 530216924 * 232883752");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07051");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-27898616));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27898616 + "'", int1 == 27898616);
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07052");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 100964278);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100964278 + "'", int1 == 100964278);
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07053");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 3398104, (-6717425867802L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6717429265906L + "'", long2 == 6717429265906L);
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07054");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6657622930L), (long) (-1763425054));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8421047984L) + "'", long2 == (-8421047984L));
    }

    @Test
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07055");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9788880), 2014471);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -9788880 * 2014471");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07056");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-66558));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-66558) + "'", int1 == (-66558));
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07057");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1784800, 2150267, (-1990388));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1784800 for  must be in the range [2150267,-1990388]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07058");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(66747848, 1174573, (-863620));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07059");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(177781774, 155277732);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 177781774 * 155277732");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07060");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(30906162, (-1710528757), 230746822);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30906162 + "'", int3 == 30906162);
    }

    @Test
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07061");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2284709, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2284741 + "'", int2 == 2284741);
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07062");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-302176508), 339161818, (-100459952));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07063");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-729), 913384904274010256L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-913384904274010985L) + "'", long2 == (-913384904274010985L));
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07064");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1762759876L), (long) 2288107);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4033383211594732L) + "'", long2 == (-4033383211594732L));
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07065");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-204298726), (-1755570876), 8730);
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07066");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(35691361L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35691361 + "'", int1 == 35691361);
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07067");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1664, 14016356901396972L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14016356901395308L) + "'", long2 == (-14016356901395308L));
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07068");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 63244232, 16143426, 2065028);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 63244232 for  must be in the range [16143426,2065028]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07069");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 18, (java.lang.Object) 199359);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07070");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-9123345));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9123345 + "'", int1 == 9123345);
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07071");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3034108), (-204685393));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3034108 * -204685393");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07072");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1715697100, 1738657, (-592169827));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07073");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-3480386), (-1989700), 99768);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3480386 for  must be in the range [-1989700,99768]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07074");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-8002818715384005L), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8002818715384015L) + "'", long2 == (-8002818715384015L));
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07075");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-16990520), 2959176, (-498646));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07076");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-352818223), 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-352818133) + "'", int2 == (-352818133));
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07077");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-4485350), (-5), (-330040725), 951372194);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4485355) + "'", int4 == (-4485355));
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07078");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-21674210715L), (-17424));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 377651447498160L + "'", long2 == 377651447498160L);
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07079");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(86130, (-2065028), (-3909));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1974990) + "'", int3 == (-1974990));
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07080");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(9221291488125370368L, 3053498160L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 9221291488125370368 * 3053498160");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07081");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(2076974496576L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2076974496576");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07082");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1763460086), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1763460086) + "'", int2 == (-1763460086));
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07083");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(688, 1715159045);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1715159733 + "'", int2 == 1715159733);
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07084");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 301848066, 3499569, (-1519234035));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 301848066 for  must be in the range [3499569,-1519234035]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07085");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 285247083614292030L, (java.lang.Object) 3996819140L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07086");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(49439738, (-18000), (-944118497));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07087");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-168572690), (-609053028));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -168572690 * -609053028");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07088");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 30906162, (long) 827878);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 25586531584236");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07089");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 107336979, 700, 949427270);
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07090");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10497554, (java.lang.Object) (-846183179790L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07091");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(451, 4479918, (-1990611), 155277600);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4480369 + "'", int4 == 4480369);
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07092");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 9788, (long) 155277732);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 155287520L + "'", long2 == 155287520L);
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07093");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(99406108L, (long) (-570400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-56701244003200L) + "'", long2 == (-56701244003200L));
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07094");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 31362155, (java.lang.Object) (-1925124040));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07095");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 49439738, (long) (-1989679));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51429417L + "'", long2 == 51429417L);
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07096");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(20731669);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-20731669) + "'", int1 == (-20731669));
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07097");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 1620, (-530216924), 100449343);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1620 + "'", int4 == 1620);
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07098");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-944118497), (-4485350));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4234701900518950L + "'", long2 == 4234701900518950L);
    }

    @Test
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07099");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(41511168L, (-5802206573999812L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 41511168 * -5802206573999812");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07100");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-399618), 1938372, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07101");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-308759394), 99835208, (-8536194), (-1174461));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2795634) + "'", int4 == (-2795634));
    }

    @Test
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07102");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-190043702731531L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-190043702731531L) + "'", long2 == (-190043702731531L));
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07103");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-57378098), (-4256334), (-874263));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -57378098 for hi! must be in the range [-4256334,-874263]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07104");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-62086), 0, (-1711678817));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07105");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-14227), 600842000, (-5203027));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07106");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-102950433), 2294419);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-236211429533427L) + "'", long2 == (-236211429533427L));
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07107");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 314527061);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 314527061 + "'", int1 == 314527061);
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07108");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-81725049), (-951492298), (-352818223));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07109");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-17424), 1794561, (-46322264));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07110");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-944117276), (java.lang.Object) (-1925124040));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07111");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-6717425867802L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07112");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(630000000, 12100448);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 642100448 + "'", int2 == 642100448);
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07113");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-343864080), 153251, 159247253, (-1713170345));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07114");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(608209176, 0, 99835728, (-113827897));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07115");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(34875834, 0, 3561650);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2820975 + "'", int3 == 2820975);
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07116");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 99835208, (-100460641), (-3611760));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07117");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3038, (long) (-1713170135));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5204610870130L) + "'", long2 == (-5204610870130L));
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07118");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 493779);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 493779 + "'", int1 == 493779);
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07119");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 0, (-32348768), (-148474462), (-1056));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-32348768) + "'", int4 == (-32348768));
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07120");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5899809, 1121717, 100490000, 1738657);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07121");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 100964278, 44, (-1715696724));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07122");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1206090960L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1206090960 + "'", int1 == 1206090960);
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07123");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 47525347, 1711678817, (-1710528757));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07124");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2111643072);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2111643072) + "'", int1 == (-2111643072));
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07125");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-64), (-1056));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1120) + "'", int2 == (-1120));
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07126");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 107222400, 47525247, (-15951520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07127");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-110929580820L), (long) 620);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-110929581440L) + "'", long2 == (-110929581440L));
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07128");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 47525347, (-13020480), (-180346924));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47525347 for hi! must be in the range [-13020480,-180346924]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07129");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1988776), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07130");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 11398, (-317147951));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3614852345498L) + "'", long2 == (-3614852345498L));
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07131");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(8209, (-32091870));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32083661) + "'", int2 == (-32083661));
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07132");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-23869018920L), (long) 351665413);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23517353507L) + "'", long2 == (-23517353507L));
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07133");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1715698242, 0, (-1221), (-633115409));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07134");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-33108325), 42307341);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1400725195713825L) + "'", long2 == (-1400725195713825L));
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07135");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 185867227, 272209956366432L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 185867227 * 272209956366432");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07136");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-300979678L), 218684298L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-82295380L) + "'", long2 == (-82295380L));
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07137");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2250), 1111L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2499750L) + "'", long2 == (-2499750L));
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07138");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-106412530), (-20731669), (-3509649));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07139");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1766929518), (-1786407669), 908660727, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07140");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 973781, 6015, (-168579832));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07141");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-18400), (long) 204621149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-204639549L) + "'", long2 == (-204639549L));
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07142");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(812374164, (-8700000), (-8990));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4580870) + "'", int3 == (-4580870));
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 168579832, 2294722);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [168579832,2294722]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07144");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 61577039813520000L, (java.lang.Object) 314968500L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07145");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 841, 1715697100, 285842568);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07146");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3999997833L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3999997833");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07147");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2288107);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2288107) + "'", int1 == (-2288107));
    }

    @Test
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07148");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2235464L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2235464L) + "'", long2 == (-2235464L));
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07149");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1786633493, (-655556), 149158);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1786633493 for  must be in the range [-655556,149158]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07150");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(9797);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9797) + "'", int1 == (-9797));
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07151");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 374064183, 34386408, (-1784714));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07152");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(576693690);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-576693690) + "'", int1 == (-576693690));
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07153");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-357608543), 63864);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-357544679) + "'", int2 == (-357544679));
    }

    @Test
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07154");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 1711678817, 155988945);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [1711678817,155988945]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07155");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-291727568998734L), (java.lang.Object) (-595172454895665012L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07156");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-83850), (-1763450397), 87426300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-83850) + "'", int3 == (-83850));
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07157");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 76279426, (long) (-54920));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 76334346L + "'", long2 == 76334346L);
    }

    @Test
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07158");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 347880555, 9070);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [347880555,9070]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07159");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1990710, (-300969900), 156879, (-8536194));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07160");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 191697613242651163L, (java.lang.Object) (-833426L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07161");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-18000), (-77338269012L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1392088842216000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07162");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(56929, (-1838776));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1781847) + "'", int2 == (-1781847));
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07163");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 99768, (java.lang.Object) 144581126778895500L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07164");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5625086), (-7633));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -5625086 * -7633");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07165");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(22240825200L, 9593040347982992L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 22240825200 * 9593040347982992");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07166");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(73477967816424400L, (-69931977800325472L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 73477967816424400 * -69931977800325472");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07167");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-1761079449), (-669));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [-1761079449,-669]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07168");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1681112017, (-9989));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1681112017 * -9989");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07169");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(17287395, (-83850), 169182050, 66369120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07170");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-92956L), (java.lang.Object) 239543574400L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07171");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 9999, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9999L + "'", long2 == 9999L);
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07172");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-84205710L), (-1119));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 94226189490L + "'", long2 == 94226189490L);
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07173");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(126765561, 18686280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 126765561 * 18686280");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07174");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-15328905L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15328905L) + "'", long2 == (-15328905L));
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07175");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(489951);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-489951) + "'", int1 == (-489951));
    }

    @Test
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07176");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-2597131568123601488L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07177");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(11, 1712604379, 700229040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07178");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-15952400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07179");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-970111), (long) 126765561);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 125795450L + "'", long2 == 125795450L);
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07180");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 339160985, (-1058238078051775698L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 339160985 * -1058238078051775698");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07181");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-300490249), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-300490149) + "'", int2 == (-300490149));
    }

    @Test
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07182");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-952907498), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-952907498) + "'", int2 == (-952907498));
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07183");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-592169827));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07184");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3034108, 1508037);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3034108 * 1508037");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07185");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 288303652);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 288303652 + "'", int1 == 288303652);
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07186");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-416614049L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-416614049L) + "'", long2 == (-416614049L));
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07187");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(18980207, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18980207 + "'", int2 == 18980207);
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07188");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3561650, 293357, (-9169));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07189");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 1, 1989861);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1989861L + "'", long2 == 1989861L);
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07190");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1989687), 11, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07191");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-17423), 10497554);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -17423 * 10497554");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07192");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 649332, (-105975170), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 649332 for hi! must be in the range [-105975170,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07193");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9778), 5148, (-1989687));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07194");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-232883752), 640810929, (-708510));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07195");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 628056570, 99835728, 176411220);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07196");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(231190314, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07197");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 302176499);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 302176499 + "'", int1 == 302176499);
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07198");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1925133904);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1925133904 + "'", int1 == 1925133904);
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07199");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1711678817), (-35032), 66369120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14829161 + "'", int3 == 14829161);
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07200");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2536427, 479553L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1216351177131L + "'", long2 == 1216351177131L);
    }

    @Test
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07201");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1738657, 259940595);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1738657 * 259940595");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07202");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1995685L), 668094673L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 666098988L + "'", long2 == 666098988L);
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07203");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(221881485L, (long) 677162);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 150249710145570");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07204");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-22), 420368508, (-47610286));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07205");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(73381944, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 73381892 + "'", int2 == 73381892);
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07206");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-302176508), 63702638, 99, 107336979);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 83536773 + "'", int4 == 83536773);
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07207");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1546727669760L, 99775601L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1546727669760 * 99775601");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07208");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 101009154, (-3499118575261L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3499017566107L) + "'", long2 == (-3499017566107L));
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07209");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 976536, (long) 101931854);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 99540124977744");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07210");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-204677760), 1763475345);
    }

    @Test
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07211");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-66534));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 66534 + "'", int1 == 66534);
    }

    @Test
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07212");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-17935455200L), (long) 34875834);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -625513958269636800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07213");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(47525347, (-3909), 239466083, (-32091561));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07214");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2047511687L), (long) (-1995555));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2045516132L) + "'", long2 == (-2045516132L));
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07215");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1481858267L, (java.lang.Object) 127769419782L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07216");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-308759394), (-32091870), (-9123345), 89178884);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52357656 + "'", int4 == 52357656);
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07217");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1024844251));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1024844251) + "'", int1 == (-1024844251));
    }

    @Test
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07218");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3461473L, (java.lang.Object) 8342398507184L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07219");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(6720552295014L, (-32091561));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 6720552295014 * -32091561");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07220");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 117265441568L, (java.lang.Object) (-198L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07221");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 53248, (-330040725), (-244802));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53248 for hi! must be in the range [-330040725,-244802]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07222");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-412), 920, 520);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07223");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 100964278, 709960, (-54920));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07224");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-39575028L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07225");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(100963445, (-6768000), (-1221));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-538255) + "'", int3 == (-538255));
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07226");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2111643072L), 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8446572288L) + "'", long2 == (-8446572288L));
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07227");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 5220579, (-76433));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07228");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(9134282668241652L, (-16929382));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 9134282668241652 * -16929382");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07229");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(85229052, (-84385200));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 85229052 * -84385200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07230");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1989700, 1715698242);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1717687942 + "'", int2 == 1717687942);
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07231");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-498646), (java.lang.Object) 1495740L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07232");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(252802, 22384927);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 252802 * 22384927");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07233");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(26626279399558L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07234");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-10689661), 2865594368L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2854904707L + "'", long2 == 2854904707L);
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07235");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(950048943, 1989700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 952038643 + "'", int2 == 952038643);
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07236");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (int) (byte) 0, 54920);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07237");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1989861, (-100459952));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1989861 * -100459952");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07238");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(99440784, 352039597);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 99440784 * 352039597");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07239");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 22759878, 257572119, (-8990));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07240");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-185867227), 1850695);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -185867227 * 1850695");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07241");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-296155431279L), (-2716524810L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -296155431279 * -2716524810");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07242");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(841, (-352818223), (-64), (-302176508));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07243");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(6014L, (-715355672426360000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 6014 * -715355672426360000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07244");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1763460086), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07245");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-349956635));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-349956635) + "'", int1 == (-349956635));
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07246");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 868, (-640941), 47620);
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07247");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(44, 843737, (-96990431));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07248");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-1942080), 352818223);
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07249");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-32320L), 13594);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-439358080L) + "'", long2 == (-439358080L));
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07250");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1761730), (-8990));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1761730 * -8990");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07251");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(420386456, 976536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 420386456 * 976536");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07252");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(908660727);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-908660727) + "'", int1 == (-908660727));
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07253");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1761176514), 63864);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1761112650) + "'", int2 == (-1761112650));
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07254");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3461866), (-1712671034));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3461866 * -1712671034");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07255");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-359321571L), 40322555L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14488763809333905L) + "'", long2 == (-14488763809333905L));
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07256");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 202685432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 202685432 + "'", int2 == 202685432);
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07257");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 970111, 4479760, 1989700);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 970111 for hi! must be in the range [4479760,1989700]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07258");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-34288769L), (-84393900L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2893762942109100L + "'", long2 == 2893762942109100L);
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07259");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) (-2005438));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07260");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(949417406, 760787, (-1712671034));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07261");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 5220530, (-3328434791324L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3328440011854L + "'", long2 == 3328440011854L);
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07262");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-149158), 13393, (-32091561));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07263");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 959334, 649332);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 622926264888L + "'", long2 == 622926264888L);
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07264");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(35000, (-2065028), 1517218488, 709960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07265");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(26511982);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-26511982) + "'", int1 == (-26511982));
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07266");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10308, 843852, 2376658);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07267");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9700), (-83850), (-1974990));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07268");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(2104522840635L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2104522840635");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07269");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 801902322, 2529996135906080L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 801902322 * 2529996135906080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07270");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1530017442), (-17423));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26657493891966L + "'", long2 == 26657493891966L);
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07271");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(71355223200L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07272");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1784714), 2004988, 1705);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1784714 for hi! must be in the range [2004988,1705]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07273");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1481678848L, (-1745996));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2587005341892608L) + "'", long2 == (-2587005341892608L));
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07274");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 149767755, (-1755570876), 204685393);
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07275");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(2104522840635L, 34999199570L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2104522840635 * 34999199570");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07276");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 973682, 18867, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07277");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1454523, 15);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21817845L + "'", long2 == 21817845L);
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07278");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3038, (java.lang.Object) (-114080));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07279");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-18), 843737, (-1794561));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07280");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-415654715L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07281");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-7833964763976120L), 2959276401L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -7833964763976120 * 2959276401");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07282");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2288107), 317049115);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2288107 * 317049115");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07283");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-6328990), (-1185347686), (-2301994));
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07284");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(3483304);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3483304) + "'", int1 == (-3483304));
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07285");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-9328848826035L), 252802);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2358351640919300070L) + "'", long2 == (-2358351640919300070L));
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07286");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(61577039813520000L, (long) (-1763425054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 61577039813520000 * -1763425054");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07287");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 100, 5220579, (-1784800), 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-136724) + "'", int4 == (-136724));
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07288");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 880, (-708510), 198112800);
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07289");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 711129L, (java.lang.Object) (-84385200));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07290");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(350034159, (-156879), (-169916106), (-37243837));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-48139530) + "'", int4 == (-48139530));
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07291");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-66558));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 66558 + "'", int1 == 66558);
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07292");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1802640001, (java.lang.Object) 602790802266828L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07293");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-167335), (-86));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14390810 + "'", int2 == 14390810);
    }

    @Test
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07294");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(7978668911586900L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 7978668911586900");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07295");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(97770171L, 66124332L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 163894503L + "'", long2 == 163894503L);
    }

    @Test
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07296");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1023872308403125L, (-3536656783084835815L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3537680655393238940L + "'", long2 == 3537680655393238940L);
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07297");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 336751288252588L, (java.lang.Object) (-1023872306279138L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07298");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1664, (-502));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1162 + "'", int2 == 1162);
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07299");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1000, (-37984149816402L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-37984149815402L) + "'", long2 == (-37984149815402L));
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07300");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9070), (-15952400), 848047583, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07301");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-48014510), (-1715160045), (-57378098), 14227);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-41404775) + "'", int4 == (-41404775));
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07302");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(14182403597802L, (long) 951492297);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14183355090099L + "'", long2 == 14183355090099L);
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07303");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-76533), (-1174461), (-843887));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07304");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1859882812L), 147147648302611619L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 147147646442728807L + "'", long2 == 147147646442728807L);
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07305");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(17423L, (long) (-6915));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-120480045) + "'", int2 == (-120480045));
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07306");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1713170126), (-97960), (-954811));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07307");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(189935540116053039L, (long) (-2301994));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 189935540118355033L + "'", long2 == 189935540118355033L);
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07308");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2384403, (-1185347686));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2826346578541458L) + "'", long2 == (-2826346578541458L));
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07309");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-100459952), (-249426407));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 25057364874752464L + "'", long2 == 25057364874752464L);
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07310");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2795634), 20731669, 1715698242);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1692170940 + "'", int3 == 1692170940);
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07311");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-949426390));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 949426390 + "'", int1 == 949426390);
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07312");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2110080), 5220530, (-1999671));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2110080 for hi! must be in the range [5220530,-1999671]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07313");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1450647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1450647) + "'", int1 == (-1450647));
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07314");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 301848066, (-48014510), 1155965);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07315");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-302176508), 258759, (-954536506));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -302176508 for  must be in the range [258759,-954536506]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07316");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-174627086564L), (long) 174629);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -30494953499584756");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07317");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10047, (-103647573), (-26511982), (-108685080));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07318");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 34875834);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07319");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(46242L, (long) 34386390);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1590095446380L + "'", long2 == 1590095446380L);
    }

    @Test
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07320");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1025206));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1025206 + "'", int1 == 1025206);
    }

    @Test
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07321");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-34978320L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34978320) + "'", int1 == (-34978320));
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07322");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1492005, 132, (-2922338));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07323");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-3333540690718362L), 1370574L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3333540692088936L) + "'", long2 == (-3333540692088936L));
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07324");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-3038), (-17423), (-204614145));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3038 for  must be in the range [-17423,-204614145]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07325");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2301994), 507005);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1794989) + "'", int2 == (-1794989));
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07326");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-101931854), (int) (short) 0, 230746822);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 128814969 + "'", int3 == 128814969);
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07327");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 789, 15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07328");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2111643072, (-12595644), (-767464499));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07329");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-490002), 42307341, (-1760510603));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07330");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9989, 586809815, (-106575000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07331");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-14227), (long) 503932);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-518159L) + "'", long2 == (-518159L));
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07332");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(33032396199L, 266405443700400000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 33032396199 * 266405443700400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07333");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9788880), 230746822, (-17287395), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3778206) + "'", int4 == (-3778206));
    }

    @Test
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07334");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 312598477, 2284709, (-157922));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07335");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 198112800, (long) (-300969892));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 499082692L + "'", long2 == 499082692L);
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07336");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1686037017, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07337");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 709790, 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36199290L + "'", long2 == 36199290L);
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07338");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1000, 874263, (-1989524));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1000 for  must be in the range [874263,-1989524]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07339");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-3499650));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3499650 + "'", int1 == 3499650);
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07340");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(171478518, 2536427);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 171478518 * 2536427");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07341");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2301994), 0, 301848066);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 299546073 + "'", int3 == 299546073);
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07342");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-944117276L), 173189501395600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-173190445512876L) + "'", long2 == (-173190445512876L));
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07343");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 97960, 3398104, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07344");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1007695210654L), 184);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-185415918760336L) + "'", long2 == (-185415918760336L));
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07345");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-151485400L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-151485400) + "'", int1 == (-151485400));
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07346");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(5571553);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5571553) + "'", int1 == (-5571553));
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07347");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-204677760), 16524, (-9700));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07348");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(155988945, 155279264);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 311268209 + "'", int2 == 311268209);
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07349");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3480228L), (long) 177781774);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-618721107764472L) + "'", long2 == (-618721107764472L));
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07350");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(710383712L, 4234701900518950L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4234702610902662L + "'", long2 == 4234702610902662L);
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07351");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 7451, (long) 1454874);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1447423L) + "'", long2 == (-1447423L));
    }

    @Test
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07352");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-85342), 0, (-3035028));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -85342 for hi! must be in the range [0,-3035028]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07353");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9875, (-322));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9553 + "'", int2 == 9553);
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07354");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 4476722, 89372027, 3181);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07355");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(13986);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-13986) + "'", int1 == (-13986));
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07356");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(489099555867174L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 489099555867174");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07357");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-10000), 3181, 1174462, (-920));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07358");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-300969900), 176411220);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -300969900 * 176411220");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07359");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1106816), (java.lang.Object) 123153344092200L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07360");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(954811000, 609053028);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1563864028 + "'", int2 == 1563864028);
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07361");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3480228, (long) (-100189684));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-348682943567952L) + "'", long2 == (-348682943567952L));
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07362");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-696874493105108L), 190043702733236L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -696874493105108 * 190043702733236");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07363");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-204614145), (-22), (-711052));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07364");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 157922, 10398, 125783592);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 157922 + "'", int4 == 157922);
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07365");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-518159L), 377651447498160L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -518159 * 377651447498160");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07366");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1563864028);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1563864028) + "'", int1 == (-1563864028));
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07367");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4027424899L), (long) (-60437));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 243405478620863L + "'", long2 == 243405478620863L);
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07368");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-8990), 198112800, (-939637516));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07369");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-10689680));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10689680 + "'", int1 == 10689680);
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07370");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 324823060, 1943780, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07371");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-167743998851204100L), 35625894445L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-167744034477098545L) + "'", long2 == (-167744034477098545L));
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07372");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1638607297, 9070, (-939637516));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07373");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-26020763), (-7633), 695393, 1692170940);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1665447152 + "'", int4 == 1665447152);
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07374");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(5220530, 1786407669, (-869115));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07375");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-46322273), 3181, (-47525247));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07376");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-451), 0, (-605984));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07377");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10552, (-41404775), 812374164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10552 + "'", int3 == 10552);
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07378");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1174462), (java.lang.Object) 507861150L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07379");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1713170135), (java.lang.Object) 97770171L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07380");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 32482052);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07381");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-10147444357707714L), (java.lang.Object) 285842568);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07382");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3598, 399618, 201);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07383");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 3499569, 14428);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07384");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-44767137209877264L), 3499650);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -44767137209877264 * 3499650");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07385");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(39341073, 0, (-1762676017), (-536575));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1722798370) + "'", int4 == (-1722798370));
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07386");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-530216924), (-2235464), (-54920));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-344489) + "'", int3 == (-344489));
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07387");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-5772L), (long) (-1989861));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1995633L) + "'", long2 == (-1995633L));
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07388");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-17935542210L), (java.lang.Object) (-37984149816402L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07389");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 942883156, (-21104292), 1117972070);
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07390");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-6915), 649332, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07391");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3720938900L), (long) 3038);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3720935862L) + "'", long2 == (-3720935862L));
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07392");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(32666863L, 3496505L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29170358L + "'", long2 == 29170358L);
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07393");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-9778), (-47585), (-169916106));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9778 for hi! must be in the range [-47585,-169916106]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07394");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-631518), 5899809, 76279426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69748100 + "'", int4 == 69748100);
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07395");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1711678817), (long) (-97970));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1711580847L) + "'", long2 == (-1711580847L));
    }

    @Test
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07396");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-729976520), (-343864080), 9788);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07397");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-110929581440L), (-3312889712L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -110929581440 * -3312889712");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07398");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2304264), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2304263) + "'", int2 == (-2304263));
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07399");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-92377287293020L), (long) 1664);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-92377287294684L) + "'", long2 == (-92377287294684L));
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07400");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1715149542), 996654445261089318L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1715149542 * 996654445261089318");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07401");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1450548));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1450548) + "'", int1 == (-1450548));
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07402");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 27293758363296000L, (java.lang.Object) 54300239014089600L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07403");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(102843302575698L, (long) 503932);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102843302071766L + "'", long2 == 102843302071766L);
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07404");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 339160985, 25311043, (-16929382));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07405");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-171469054), (-9691), (-970000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07406");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(171478518, 124486545, 8700, (-316451466));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07407");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 970111, (-168472090), (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07408");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-61432903466918L), (long) (-89));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-61432903467007L) + "'", long2 == (-61432903467007L));
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07409");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-9737812), (-1696938508761228203L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -9737812 * -1696938508761228203");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07410");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(97090543L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9709054300L + "'", long2 == 9709054300L);
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07411");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(32482072, 90, (-188112985));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07412");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-952907498), 349432740);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-603474758) + "'", int2 == (-603474758));
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07413");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1491865899490L, (long) 3561650);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1491869461140L + "'", long2 == 1491869461140L);
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07414");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 299546073, (-21104292), (-1990611));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07415");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(959334, (-82215000), (-538255), 288303652);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 207586242 + "'", int4 == 207586242);
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07416");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-330040725), 709960);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-329330765) + "'", int2 == (-329330765));
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07417");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-2005430), 1762675999, (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07418");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(8080L, (long) (-304461011));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 304469091L + "'", long2 == 304469091L);
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07419");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3965232332375580L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3965232332375580");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07420");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 53248, (-9), 95781);
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07421");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(63702693L, (long) 634);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63703327L + "'", long2 == 63703327L);
    }

    @Test
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07422");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1495740, (long) 951492297);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1423185088314780L + "'", long2 == 1423185088314780L);
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07423");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3509768L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07424");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 16143426, 311268209, (-1185347686));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07425");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 1889050220, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07426");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 13584346, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07427");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(13238313787314L, 1762675999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 13238313787314 * 1762675999");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07428");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1705);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1705) + "'", int1 == (-1705));
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07429");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(532426752, (-2997));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 532423755 + "'", int2 == 532423755);
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07430");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2987409, 1999672, (-171469054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2987409 for hi! must be in the range [1999672,-171469054]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07431");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1713149062), (long) 9070);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -15538261992340");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07432");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(66947207, 212411343, 54920);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07433");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1938372);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1938372) + "'", int1 == (-1938372));
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07434");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-53318417), 7355177877L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-392166441155060709L) + "'", long2 == (-392166441155060709L));
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07435");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-106412530), (-30), (-27826));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -106412530 for  must be in the range [-30,-27826]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07436");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-22177769L), 9972);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-221156712468L) + "'", long2 == (-221156712468L));
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07437");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9553, 299785985, (-950048943));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07438");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 400483318, 0, (-9719));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07439");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1470988428), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07440");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6960), (java.lang.Object) (-32900781L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07441");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1119, 0, (-47610286), (-32348768));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-45783438) + "'", int4 == (-45783438));
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07442");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-180346924));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 180346924 + "'", int1 == 180346924);
    }

    @Test
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07443");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 18867, (long) (-450684));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-431817L) + "'", long2 == (-431817L));
    }

    @Test
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07444");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(27166902510L, (long) (-100460641));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2729204440139108910");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07445");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2065033), (-812374164));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2065033 * -812374164");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07446");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-17935552074L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -17935552074");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07447");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-344489), (long) (-1715149542));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714805053L + "'", long2 == 1714805053L);
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07448");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1410L, (-32));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-45120L) + "'", long2 == (-45120L));
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07449");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(9788);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9788) + "'", int1 == (-9788));
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07450");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(954811000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-954811000) + "'", int1 == (-954811000));
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07451");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9778, (-107726616), (-16990520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07452");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-193913417));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-193913417) + "'", int1 == (-193913417));
    }

    @Test
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07453");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1710528757), 30453054657L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1710528757 * 30453054657");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07454");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-14149), (-1056), (-920));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07455");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(234356, 0, (-669), (-4761114));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07456");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2581684), (long) 293357);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -757355073188");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07457");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(489099555867174L, (-667524577533L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 489767080444707L + "'", long2 == 489767080444707L);
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07458");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 904180783, (long) 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 904180783000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07459");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 374064183, 3499553, 2987409);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07460");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9989, (-214183750));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-214173761) + "'", int2 == (-214173761));
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07461");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 8941480, 442560, 1794561);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07462");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-12999571302859200L), (long) 1788087917);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -12999571302859200 * 1788087917");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07463");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-633115409), 6720552295014L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -633115409 * 6720552295014");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07464");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-13586596L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07465");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 257572119, (-107726616), 52672);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 257572119 for hi! must be in the range [-107726616,52672]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07466");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(900L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 900L + "'", long2 == 900L);
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07467");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-200015116), 155279264, (-236129206), 5220530);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-44735852) + "'", int4 == (-44735852));
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07468");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(668094673L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 668094673 + "'", int1 == 668094673);
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07469");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(101931854, 1155965);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 101931854 * 1155965");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07470");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-100460641), (-728), (-132));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -100460641 for  must be in the range [-728,-132]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07471");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 351665413, 99593070, 169182050);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 351665413 for hi! must be in the range [99593070,169182050]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07472");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 63244232, 226720892L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14338788692894944L + "'", long2 == 14338788692894944L);
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07473");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 353600846, (-603474758), (-10049));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 353600846 for  must be in the range [-603474758,-10049]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07474");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 399618, (-590309465), (-202050186));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07475");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) (-3035028));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3035028L) + "'", long2 == (-3035028L));
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07476");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 600832203, (long) (-2250));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600829953L + "'", long2 == 600829953L);
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07477");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-348682943567952L), 47967680L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -348682943567952 * 47967680");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07478");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-4779922815L), (long) 586809815);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5366732630L) + "'", long2 == (-5366732630L));
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07479");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1131200), (java.lang.Object) 709960);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07480");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 258759);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 258759 + "'", int1 == 258759);
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07481");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-43048525));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43048525 + "'", int1 == 43048525);
    }

    @Test
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07482");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1686886240, (-2078227400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3505733204650976000L) + "'", long2 == (-3505733204650976000L));
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07483");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-595172454895665012L), (long) (-349956067));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-595172455245621079L) + "'", long2 == (-595172455245621079L));
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07484");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-273471229583899974L), (java.lang.Object) 1295163613744L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07485");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeAdd((-633115409), (-1753701626));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -633115409 + -1753701626");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07486");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(352818223, 105975170);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 458793393 + "'", int2 == 458793393);
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07487");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1517218488), 7839386027744120400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7839386026226901912L + "'", long2 == 7839386026226901912L);
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07488");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-299785985));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 299785985 + "'", int1 == 299785985);
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07489");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1023872306159452L, (java.lang.Object) 19907100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07490");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-503932), 43296, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07491");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1563864028, 11041229100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12605093128L + "'", long2 == 12605093128L);
    }

    @Test
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07492");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(52672, (-1174462), (-1989648), (-349946851));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07493");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-315818831173L), (long) 212411343);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -315818831173 * 212411343");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07494");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-394648137), (long) 532427871);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-210121667377026327L) + "'", long2 == (-210121667377026327L));
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07495");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1385095, 2005733);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3390828 + "'", int2 == 3390828);
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07496");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(46920, 2959176, 1945308);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07497");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-171478832), (-53553755), (-357544679));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07498");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(8665465796034198L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8665465796034198L + "'", long2 == 8665465796034198L);
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07499");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1450548), 1139, 442560, (-103647573));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07500");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(80635680, 34386308, (-3277662), 872);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3005272) + "'", int4 == (-3005272));
    }
}

