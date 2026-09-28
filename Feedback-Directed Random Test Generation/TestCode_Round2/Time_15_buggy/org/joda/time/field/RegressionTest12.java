package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test06001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06001");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1802640000, 6289801, 2658977);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1802640000 for  must be in the range [6289801,2658977]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1712671034), 201372638, (-312), (-1715697100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(5220530, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5220579 + "'", int2 == 5220579);
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-188790000), 878171L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -165789903090000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(34386390, 97960, 100963445);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 34386390 + "'", int3 == 34386390);
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(168472090, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 168472109 + "'", int2 == 168472109);
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-767454452), 234356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -767454452 * 234356");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-100490000), 3499569);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-96990431) + "'", int2 == (-96990431));
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-32091971), 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32091870) + "'", int2 == (-32091870));
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-708129449), (-1713254), (-2005438));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(180882L, (-114270654247874256L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 114270654248055138L + "'", long2 == 114270654248055138L);
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-188112985), (-81725049), (-1713170345));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-16929382), (-1890034360821320L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -16929382 * -1890034360821320");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 46930, (long) 688);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46242L + "'", long2 == 46242L);
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(22632004046400L, (long) (-2581684));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22632006628084L + "'", long2 == 22632006628084L);
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3510537456600000L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-100460641), 2294400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-230496894710400L) + "'", long2 == (-230496894710400L));
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-106462890));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106462890 + "'", int1 == 106462890);
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-601423), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-601423L) + "'", long2 == (-601423L));
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(35814600L, 700098822733030L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 35814600 * 700098822733030");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2065028), (-1713170345), (int) (short) 10);
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3045228L, (-15963399L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-48612189609972L) + "'", long2 == (-48612189609972L));
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1234120), 257397490L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 256163370L + "'", long2 == 256163370L);
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 35000, 2111643072, 176421201);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(4231920, 12100448, 620, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 3909, (-1760510603), 686);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3909 for hi! must be in the range [-1760510603,686]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(999000207, (-112110));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 998888097 + "'", int2 == 998888097);
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1454524, (-598901407), (-214183750), (-8700));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-169096781) + "'", int4 == (-169096781));
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 111, (-3277662), (-1710528757));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-6407448056860264L), (long) 11862880);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6407448068723144L) + "'", long2 == (-6407448068723144L));
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(107222400L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 107222400 + "'", int1 == 107222400);
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-64));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(22759878, (-1454524));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 22759878 * -1454524");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1785587));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1785587 + "'", int1 == 1785587);
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-15359825779200L), (-7900L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15359825771300L) + "'", long2 == (-15359825771300L));
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(48456409753999671L, 1442485561737636505L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1490941971491636176L + "'", long2 == 1490941971491636176L);
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 236129206, (long) 533304932);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-297175726L) + "'", long2 == (-297175726L));
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-288303652), 8, (-300490249));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2161649352804L, (-580601));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1255055775887355204L) + "'", long2 == (-1255055775887355204L));
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(32482072, (-1196950), 14308, 801902322);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31285122 + "'", int4 == 31285122);
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(101010340, (-350000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 101010340 * -350000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1711, (-89178884));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-89177173) + "'", int2 == (-89177173));
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1196950), (-863620));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1196950 * -863620");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 95781, 1023872306159452L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 95781 * 1023872306159452");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 3398104, (long) 43296);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3441400L + "'", long2 == 3441400L);
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(952906578, 843852, 34385857);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13730410 + "'", int3 == 13730410);
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-111849012), 531793, (-843852));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(155277732, (-208569710), 4485377, (-17899));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1715696283), (-1794561), (-450684));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1715696283 for  must be in the range [-1794561,-450684]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 843887, 947642470);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 799703161080890L + "'", long2 == 799703161080890L);
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1454874), (-161986), 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-157922) + "'", int3 == (-157922));
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(10047L, (long) 171478832);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1722847825104L + "'", long2 == 1722847825104L);
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1535304), 952907498);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 951372194 + "'", int2 == 951372194);
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-7355254410L), (java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-853932), 576, (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-130200), (-83850));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-214050) + "'", int2 == (-214050));
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1761176514), (long) (-153066));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 269576244291924L + "'", long2 == 269576244291924L);
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-156879));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-156879) + "'", int2 == (-156879));
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(1402774760439L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1402774760439");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-2065033), 16143426, (-54920));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2065033 for  must be in the range [16143426,-54920]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(320016841L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 320016841 + "'", int1 == 320016841);
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(479643);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-479643) + "'", int1 == (-479643));
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(38868600, 1990710, (-874263));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 39350610, 947642470L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37290309256406700L + "'", long2 == 37290309256406700L);
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(489951, (-5588424), (-1761730), 695393);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-184225) + "'", int4 == (-184225));
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-700), 249426407, (-4485377), 71700);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1213583) + "'", int4 == (-1213583));
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-4295873299791840000L), (-732190580753198L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4295873299791840000 * -732190580753198");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1788088016), (-1712671034), (-949427270));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1024844251) + "'", int3 == (-1024844251));
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2219795222L), (long) 999000207);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2217575886275610954");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1715156650), 0, (-97970));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-949427270));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 949427270 + "'", int1 == 949427270);
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1715160045), (-75571671168000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1715160045 * -75571671168000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-4710915));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4710915 + "'", int1 == 4710915);
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-301848066L), (-52));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15696099432L + "'", long2 == 15696099432L);
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1890034356341402L), (long) 1761730);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1890034356341402 * 1761730");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-54920), 0, 2536427);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -54920 for  must be in the range [0,2536427]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 14016356901396972L, (java.lang.Object) 98049000000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1953880), 304461011, (-2582129), (-2078213173));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 16524, 317049115, (-868));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16524 for hi! must be in the range [317049115,-868]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(129926115, 400795139, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-17935542210L), (-35709260L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17971251470L) + "'", long2 == (-17971251470L));
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-954536506), 19559583600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18605047094L + "'", long2 == 18605047094L);
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3965232332375580L), (-1234120));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3965232332375580 * -1234120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(304461011);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-304461011) + "'", int1 == (-304461011));
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 26511433, 3536656467266061812L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3536656467292573245L + "'", long2 == 3536656467292573245L);
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2294722, (-816756018));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2294722 * -816756018");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 533301015, (-71477721000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 533301015 * -71477721000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-352818223), 5148);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-352813075) + "'", int2 == (-352813075));
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 100963131, (long) (-1715696283));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1816659414L + "'", long2 == 1816659414L);
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-53248), (-29047620));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1546727669760L + "'", long2 == 1546727669760L);
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-14149), (java.lang.Object) 896371846346457172L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-15951520), (long) 853932);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16805452L) + "'", long2 == (-16805452L));
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-107726638), 6967931721816L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -107726638 * 6967931721816");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-14428), (java.lang.Object) (-214050));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 157773616, 954811000, (-586809815));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-300551));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-300551) + "'", int1 == (-300551));
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3045228L, 78843055263L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 240095079492434964");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5827584583260000L), (-708129348));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -5827584583260000 * -708129348");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(531793, (-620), (-1535304));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 129926115, 317049115, (-85342));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(6022437L, 100090844L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 602790802266828L + "'", long2 == 602790802266828L);
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(185867148, 10047);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 185877195 + "'", int2 == 185877195);
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-4710915), (-171469132L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 807776505975780L + "'", long2 == 807776505975780L);
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-586809815), (-32091971), (-1784714));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 100.0f, (java.lang.Object) 190043702733236L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(314968481L, 17450732799940608L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17450732484972127L) + "'", long2 == (-17450732484972127L));
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1712594601, 293357, (-84385200));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1712594601 for hi! must be in the range [293357,-84385200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(99370817, 97960, (-352813075));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(97179060L, (long) 9875);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97188935L + "'", long2 == 97188935L);
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-577), (-323442480), (-6129), 15345);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13393 + "'", int4 == 13393);
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 349956635, 2076974496576L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 349956635 * 2076974496576");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 300969900, (-17424));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 890876710L, (java.lang.Object) 15345);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 487551322, (long) 1289151020);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-801599698L) + "'", long2 == (-801599698L));
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-14149), 628023133, 1763475345, 1142);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) '#', (-1277533), (-9537));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1450548), (-3720938900L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5397400479517200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1712671034);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1712671034 + "'", int1 == 1712671034);
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-84393900L), (long) 47525247);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36868653L) + "'", long2 == (-36868653L));
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1221);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1221) + "'", int1 == (-1221));
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-677162), (-173543841), 3034108);
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-188112985), 10047L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1889971160295L) + "'", long2 == (-1889971160295L));
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1784800), 1737870);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1784800 * 1737870");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-873812), 628023133, 217526);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -873812 for hi! must be in the range [628023133,217526]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3652836, (-1695974308120618750L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3652836 * -1695974308120618750");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-350L), (-451));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 157850L + "'", long2 == 157850L);
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-310), 5220579, 14227);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1766617203), (-1995685L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1764621518L) + "'", long2 == (-1764621518L));
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1117972070, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-15952400), (long) (-700));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 11166680000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-204298726), 549);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(455569728, 1686037017);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 455569728 * 1686037017");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(996654445261089318L, (long) (-15651849));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 996654445261089318 * -15651849");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(177664191, 168472090, 249426407);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 177664191 + "'", int3 == 177664191);
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-843852), (long) 440284);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-403568L) + "'", long2 == (-403568L));
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3652836L, (java.lang.Object) (-4485377));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 55620L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55620L + "'", long2 == 55620L);
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-5827586045757014L), (long) (-35032));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -5827586045757014 * -35032");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-47525247), (-204677760));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -47525247 * -204677760");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(19042337966636160L, (long) (-920));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19042337966635240L + "'", long2 == 19042337966635240L);
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1788088016, (-1454523));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1786633493 + "'", int2 == 1786633493);
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(341736148L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-341736148L) + "'", long2 == (-341736148L));
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-970000), 184, (-1056));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -970000 for hi! must be in the range [184,-1056]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(199308L, (long) 63649178);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63848486L + "'", long2 == 63848486L);
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 99440784, 8700, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1717685969), (int) (short) 1, (-843887), 1121717);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 252802 + "'", int4 == 252802);
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-48950451), 532281952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -48950451 * 532281952");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2065033), (-48512377), 3034108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2065033) + "'", int3 == (-2065033));
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-121655424L), 100090844L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -12176594065337856");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10000, 577, (-13020480));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-166315520939630L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -166315520939630");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-107726638), (-38868600), (-950048943));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1491865419927L), 480761L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1491865900688L) + "'", long2 == (-1491865900688L));
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-6768000), (-9), (-18000), (-942883156));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-704619699), 101, 1385095);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -704619699 for hi! must be in the range [101,1385095]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 161986, (long) (-317147951));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-51373527990686L) + "'", long2 == (-51373527990686L));
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1738657, (-868), (-9989));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(594427L, (-131986800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-131392373L) + "'", long2 == (-131392373L));
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1766929518), (java.lang.Object) (-333499135200L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(35, 374064183);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 35 * 374064183");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-48014510), 117265441568L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 117217427058L + "'", long2 == 117217427058L);
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-300969892), 301848066, 171459354);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -300969892 for hi! must be in the range [301848066,171459354]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-521191424), (-1024844251), 952907498);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-521191424) + "'", int3 == (-521191424));
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 445, (-6959097913696L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3096798571594720");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 633115409, (long) (-185867227));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 818982636L + "'", long2 == 818982636L);
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1737870), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-349956900), 833);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-349956067) + "'", int2 == (-349956067));
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1715159045), (-489951), (-1761079449));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-450684), (-163115), 112110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99768 + "'", int3 == 99768);
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-32091870), 350035111, 258662);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(198112800, 7739630);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 198112800 * 7739630");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-310), (-3034108), 22384927, 609053028);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 583633684 + "'", int4 == 583633684);
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(339161818, (-85250028), (-709901), (-349956635));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(89372027, 19907100, 0, 789);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(54920, 533304932, (-17362154));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-244597842500L), (-880));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 215246101400000L + "'", long2 == 215246101400000L);
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-76433), (-204685393));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15644718643169L + "'", long2 == 15644718643169L);
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-954536506), 234356, 2440438, (-6915));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-9719L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9719) + "'", int1 == (-9719));
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2987409);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2987409) + "'", int1 == (-2987409));
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3509649), 2304106, 911);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-106575000), (-17362154), (-6960));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1718668813L, (-34013868722L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35732537535L + "'", long2 == 35732537535L);
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-874263));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 874263 + "'", int1 == 874263);
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(3469518);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3469518) + "'", int1 == (-3469518));
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 14428, (-16990520), 351);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14428 for  must be in the range [-16990520,351]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 8941480, (-1763450397), (-1147540070));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8941480 for hi! must be in the range [-1763450397,-1147540070]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 239543574400L, (java.lang.Object) (-874263));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(22240825200L, (-527981586660499855L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 22240825200 * -527981586660499855");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 7739630, (-951492298), 34386390);
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 601423, 8372910, 99593070);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 601423 for  must be in the range [8372910,99593070]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3034108, (-951493178), 498646);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 0, 1715698242);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1715698242 + "'", int2 == 1715698242);
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1713170126), 166315521289630L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1713170126 * 166315521289630");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-125953558L), (-291727565551190L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -125953558 * -291727565551190");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-19L), (long) (-97405));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1850695 + "'", int2 == 1850695);
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 87426300, 234356);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20488877962800L + "'", long2 == 20488877962800L);
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-17424), 64, (-970111));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 533310184, (java.lang.Object) 493779);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 46831);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46831 + "'", int1 == 46831);
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(9070);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9070) + "'", int1 == (-9070));
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-688), (-300551), (-1686886240));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 524160, (-197L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 523963L + "'", long2 == 523963L);
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-911), 619, (-44));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-5625086), 157773616, (-257397490));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-155757153L), (long) (-963979));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 150146624591787L + "'", long2 == 150146624591787L);
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-30352410), 14343, (-9864));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -30352410 for  must be in the range [14343,-9864]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-15961567), (-8700000), (-489951), (-10047));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-186412) + "'", int4 == (-186412));
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(590309473, 1492005);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 590309473 * 1492005");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1810285123L), (long) (-1715697100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3525982223L) + "'", long2 == (-3525982223L));
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-106575000), (long) (-3034108));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-109609108L) + "'", long2 == (-109609108L));
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(6015L, 349879109L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2104522840635L + "'", long2 == 2104522840635L);
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-301838202), 26511433);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8002163269163466L) + "'", long2 == (-8002163269163466L));
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(630000000, (-2065033), (-1056), (-1450548));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-576));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 576 + "'", int1 == 576);
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(4479918, 586810735, 14428);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 16524, (-531793), 4240387);
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 93686632872L, (java.lang.Object) (-339652577372970212L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2441599512L, (java.lang.Object) 4479944L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-148971690L), (long) 709901);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105755151702690L) + "'", long2 == (-105755151702690L));
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-188112985));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 188112985 + "'", int1 == 188112985);
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(18980207, (-105975170), (-944117276), (-635218511));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-704792495) + "'", int4 == (-704792495));
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1802640000, (long) (-1715156650));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3517796650L + "'", long2 == 3517796650L);
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-13068L), (-2949204L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 38540197872");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-54948), (-108685080), 400795139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-54948) + "'", int3 == (-54948));
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1000, 144581126778895500L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1000 * 144581126778895500");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(35032, 67276566);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 35032 * 67276566");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-32091561), (-959409L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-31132152L) + "'", long2 == (-31132152L));
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-950048943));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-950048943) + "'", int1 == (-950048943));
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 843852, (-161986), (-954536506));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-85342));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 85342 + "'", int1 == 85342);
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(60336L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60336 + "'", int1 == 60336);
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1763460086), (-1548000), (-949512368));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(843912L, 41029162590L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41030006502L + "'", long2 == 41030006502L);
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(10049, (-1718668813));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 10049 * -1718668813");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-64244), 539633);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -64244 * 539633");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 4479760, 63780902, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4479760 for  must be in the range [63780902,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(299745722, 400483318);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700229040 + "'", int2 == 700229040);
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-15952400), (int) (byte) 100, 3499650);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1990388), 12487942);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10497554 + "'", int2 == 10497554);
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 249426407, (long) (-351));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -87548668857");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-46322273), 3441400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49763673L) + "'", long2 == (-49763673L));
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 121054688, 1450732L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 175617909631616");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-106412530), 10001, (-57378098));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -106412530 for  must be in the range [10001,-57378098]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-37102379881248L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -37102379881248");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-100189684));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100189684) + "'", int1 == (-100189684));
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 958464, (-34386308), 999000207);
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1990611);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1990611) + "'", int1 == (-1990611));
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 76433, 169389L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-92956L) + "'", long2 == (-92956L));
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1794561), 1705);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1792856) + "'", int2 == (-1792856));
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(201, 13393);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13594 + "'", int2 == 13594);
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 53446626006960990L, (java.lang.Object) (-133313658L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(47986684L, (long) (-40322560));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7664124L + "'", long2 == 7664124L);
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(335272134, 1945308);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 335272134 * 1945308");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3996819140L, 34875834);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 139392400854662760L + "'", long2 == 139392400854662760L);
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-167335));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1761394244, (java.lang.Object) 363757);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1450647, (-102950433), (-312), (-711052));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 999000207, 17466817670L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16467817463L) + "'", long2 == (-16467817463L));
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(17935455210L, (long) 6015);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17935449195L + "'", long2 == 17935449195L);
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1174462));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1174462 + "'", int1 == 1174462);
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(71700, (-204685393), 451);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-204614145) + "'", int3 == (-204614145));
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9788880), 3499569, (-53248));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-46), (-105840302582228171L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4868653918782495866");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-299315787), (-5203027), 301848066);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7735307 + "'", int3 == 7735307);
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1717685969), (-1763469777), 1945308);
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(874263L, (long) 168573390);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-167699127L) + "'", long2 == (-167699127L));
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1001404800L), (long) 159779046);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-841625754L) + "'", long2 == (-841625754L));
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 350035111, (-61510), 4074452);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 350035111 for hi! must be in the range [-61510,4074452]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-173543841), 18686280, 3481738);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(10858867146354L, 19559583600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 10858867146354 * 19559583600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeAdd((-952907498), (-1715696283));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -952907498 + -1715696283");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(172893415187088L, (-790000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 172893414397088L + "'", long2 == 172893414397088L);
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-708129449), (-711052));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 503516860970348L + "'", long2 == 503516860970348L);
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(47652415, 874263);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 47652415 * 874263");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(16524, (-2997));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49522428) + "'", int2 == (-49522428));
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 61577039813520000L, (java.lang.Object) 320016841);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-301848066), 634344346, 212411343);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-13091808990485L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -13091808990485");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 2150267, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2150167L + "'", long2 == 2150167L);
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (short) 0, 46831, 451);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [46831,451]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 451, 46930);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21165430L + "'", long2 == 21165430L);
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(82215010L, (long) 350034159);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28778061882526590L + "'", long2 == 28778061882526590L);
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-224854000L), (-3164110L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 711462789940000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-450683), (-544372324350570L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 544372323899887L + "'", long2 == 544372323899887L);
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(22199491);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-22199491) + "'", int1 == (-22199491));
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-4197738823980000L), (java.lang.Object) (-22));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9778, 1712594601);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1712604379 + "'", int2 == 1712604379);
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 14307, (java.lang.Object) (-291727568998734L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-100963131));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100963131 + "'", int1 == 100963131);
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-357591120), (-412), 835739);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -357591120 for hi! must be in the range [-412,835739]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 97960, (long) (-164838092));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 164936052L + "'", long2 == 164936052L);
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(700098822733030L, (long) (-1999662));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 700098822733030 * -1999662");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 296192052, 63649178);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18852380639933256L + "'", long2 == 18852380639933256L);
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 20714400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20714400 + "'", int2 == 20714400);
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1763469777), (-1999672), (-297481271));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1715156650, (long) 16524);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28341248484600L + "'", long2 == 28341248484600L);
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1995555), 296192052, (-66665530));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-554152210812027L), 171459354);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -554152210812027 * 171459354");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1989648L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1989648) + "'", int1 == (-1989648));
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) '#', (-190217798));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6657622930L) + "'", long2 == (-6657622930L));
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-112210784083120731L), (long) 1954327840);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -112210784083120731 * 1954327840");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2078213173L), (-17810538L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37014094689817074L + "'", long2 == 37014094689817074L);
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-4761114), 3438639, (-76433), (-357608543));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-7889211), 350000, (-352818223));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-167335), 949417406, 349432740);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -167335 for  must be in the range [949417406,349432740]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10000, (-86130), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1755570876), (-1535304), (-1056));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(111L, (-372966672750049L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-41399300675255439L) + "'", long2 == (-41399300675255439L));
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1816), 163143504L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-163145320L) + "'", long2 == (-163145320L));
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2219789486L), (long) 2284709);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2222074195L) + "'", long2 == (-2222074195L));
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-204298726), (-9286460), (-18980207));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -204298726 for hi! must be in the range [-9286460,-18980207]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-51328436000L), 600832203);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -51328436000 * 600832203");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-207514568383616L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -207514568383616");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-595172454895665012L), (java.lang.Object) 799703161080890L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-100188684), 0, (-1715149542));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-451));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 451 + "'", int1 == 451);
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1712594601, (-106412324), (-100460641));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1712594601 for  must be in the range [-106412324,-100460641]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(17319362033L, (-9778));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-169348721958674L) + "'", long2 == (-169348721958674L));
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 489444, (-301934196L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-147779880627024L) + "'", long2 == (-147779880627024L));
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(339458290L, (long) (-1925133904));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1585675614L) + "'", long2 == (-1585675614L));
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1950782797076L), 168472090L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1950782797076 * 168472090");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1155965, 201, 954811000, 184);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-235614207921390144L), (long) (-2051278));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-235614207919338866L) + "'", long2 == (-235614207919338866L));
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100) + "'", int1 == (-100));
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 9999, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-9123345), (long) (-6129));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55916981505L + "'", long2 == 55916981505L);
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 819000, (-1761078660), 168579832);
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-204685393));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 204685393 + "'", int1 == 204685393);
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-11), (-1329383L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14623213L + "'", long2 == 14623213L);
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-490002), (-8683), 9700);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(98640);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-98640) + "'", int1 == (-98640));
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 530216924);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 530216924 + "'", int1 == 530216924);
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(715471229L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 715471229 + "'", int1 == 715471229);
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1111, (-85342), (-709960), (-153251));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-640941) + "'", int4 == (-640941));
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-89178884), (long) 155277732);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-244456616L) + "'", long2 == (-244456616L));
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3652836, 15345, (-1713254));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-299315787), (-4761114), (-323442480));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-6289801), (-69484049307216L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69484055597017L) + "'", long2 == (-69484055597017L));
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-300551), 198112800, 45091, 4485377);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2439621 + "'", int4 == 2439621);
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-952907498), 669, 3499553);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2288107 + "'", int3 == 2288107);
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1718668813), (-592), (-9989));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(155277797, 711148);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 155988945 + "'", int2 == 155988945);
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 171469054, 633115409);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108559700254053086L + "'", long2 == 108559700254053086L);
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9989), (-1548000), 950048943);
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1442485561737636505L, (java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-29503627297L), (-1715159045));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -29503627297 * -1715159045");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(616792578L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-942883156));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 942883156 + "'", int1 == 942883156);
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-7960085057754L), (-17474639284L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7942610418470L) + "'", long2 == (-7942610418470L));
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(395558000L, (-33916972763L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 395558000 * -33916972763");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1111, (-600832203));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-667524577533L) + "'", long2 == (-667524577533L));
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-30), 230746822, 586810735, (-5252));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1989861), 154650012, (-10047));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 4710915, 63702638, (-208569710));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-14308), (-7889211), (-609053028));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-152286), (-374064183), (-14307));
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(4937590151200L, (long) (-107726616));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4937697877816L + "'", long2 == 4937697877816L);
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1711, 2005733, (-15651849));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-304461011), (-100460641), (-202050186));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 126482100, 188112985, 695393);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-19), 669, (-6564960));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 890891138, 0, 1788088016);
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-34386408), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-343864080) + "'", int2 == (-343864080));
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 1142);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-420368508));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 420368508 + "'", int1 == 420368508);
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1462491242), (-515974), (-1786407669));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1462491242 for  must be in the range [-515974,-1786407669]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(352818223);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-352818223) + "'", int1 == (-352818223));
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-67634529), (long) (-9691));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 655446220539L + "'", long2 == 655446220539L);
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(218684298L, 315640672L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-96956374L) + "'", long2 == (-96956374L));
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-601423L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-32091971), 231190314, (-236129206), (-84756249));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-103647573) + "'", int4 == (-103647573));
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(14428, 100964278);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 14428 * 100964278");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-6138729L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 159247253, (java.lang.Object) 14623213L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 188152939, 853932, (-1999672));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-168254564), (int) (short) -1, (-10969865));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(3611760);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3611760) + "'", int1 == (-3611760));
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1816), 94401367, 400483318);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1816 for  must be in the range [94401367,400483318]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-4), 34386390);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-137545560) + "'", int2 == (-137545560));
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3394243441710L), 610511719L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3393632929991L) + "'", long2 == (-3393632929991L));
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-944117276), (-2235464), 9798);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1106816) + "'", int3 == (-1106816));
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 715471229, (java.lang.Object) (-1551034517760L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-64244), (long) 715471229);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-715535473L) + "'", long2 == (-715535473L));
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-544372316461359L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -544372316461359");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 299315787, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 299315786L + "'", long2 == 299315786L);
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1131200L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1131200) + "'", int1 == (-1131200));
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(25311043, (-537804800), (-708510));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-511785248) + "'", int3 == (-511785248));
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1784800), 100978790);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1784800 * 100978790");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(835739, (-188790000), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-187954262) + "'", int3 == (-187954262));
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 841, 10100, 9797);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 11862880, 73381944, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11862880 for  must be in the range [73381944,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10497554, (long) 2536427);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26626279399558L + "'", long2 == 26626279399558L);
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 43296, (-1147540070), 252802);
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(231121797399352L, (-595172454895646199L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 595403576693045551L + "'", long2 == 595403576693045551L);
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1000), (-586809815), 853901);
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(50006802L, 336751238245786L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 336751288252588L + "'", long2 == 336751288252588L);
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(410609746, 999000207, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 410609746, 3328034450615L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 410609746 * 3328034450615");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-76433), (-129148057));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-129224490) + "'", int2 == (-129224490));
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 958464);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 958464 + "'", int1 == 958464);
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 1482832080, 302176499);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 549, 67276566, 126547938);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 25311043, 0, 168472109);
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-106412530), 576693690, (-1131200), (-68277286));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 586809815, (-151069740), 344919305);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(155277600, 14343, (-970111));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-49790131192L), (-1255055775887355204L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -49790131192 * -1255055775887355204");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-601423), (-48014510), (-153251));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-601423) + "'", int3 == (-601423));
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-27573844749680284L), (java.lang.Object) (-84393900L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1221, 635218511);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 775601801931L + "'", long2 == 775601801931L);
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-442560));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 442560 + "'", int1 == 442560);
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 633115409, (-8683), 100964278);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 633115409 for  must be in the range [-8683,100964278]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1483542189L, (-105840302582228171L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105840301098685982L) + "'", long2 == (-105840301098685982L));
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-202050186));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3496556L, (java.lang.Object) 3469518);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-22112703), 1988776);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-43977213021528L) + "'", long2 == (-43977213021528L));
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 853932);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 853932 + "'", int1 == 853932);
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 5758, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5758L + "'", long2 == 5758L);
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3002945109L, (long) 1785587);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5362019748343983");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6717425867802L), 1546727669760L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -6717425867802 * 1546727669760");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 926161, (int) ' ', 60336);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 926161 for hi! must be in the range [32,60336]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 1943430);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1943430L) + "'", long2 == (-1943430L));
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1028141521L), (java.lang.Object) 102842602671947L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-17287395), (-60437), 583633684, 2987409);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(99370817, (-1738657), 952906578);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99370817 + "'", int3 == 99370817);
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(98640, 43296, 2284622, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-298964462), 420358630, 8209, 1784800);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 585912 + "'", int4 == 585912);
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(171459354, 27, (-1942080));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-117895782673235220L), 3955580L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -117895782673235220 * 3955580");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 232883752, 2295252, 1990388);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 232883752 for hi! must be in the range [2295252,1990388]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-949417406), 1910207, 299785985);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-200015116), (long) (-3611760));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-203626876L) + "'", long2 == (-203626876L));
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2987409, (-1713170126), 1117972070);
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-667524577533L), (-539633));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 360218290347865389L + "'", long2 == 360218290347865389L);
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-2235464), (-3031430));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 700229040);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700229040 + "'", int2 == 700229040);
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 4909, 9477L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4568L) + "'", long2 == (-4568L));
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-441), 171478832, 32482072);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3034108, 304461011, 18980207);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-874263));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-498646), (java.lang.Object) (-3664729514250000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 171469054, (-4256334));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-729829564488036L) + "'", long2 == (-729829564488036L));
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-536575), 47525347, 709960, 3398104);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1290307 + "'", int4 == 1290307);
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-502), (-83850));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42092700 + "'", int2 == 42092700);
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1112665094448052L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(8646142997073452L, 19322798960746L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8665465796034198L + "'", long2 == 8665465796034198L);
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-14307), (-1763469777));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -14307 * -1763469777");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1463930970), 161986, (-201));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-688), 1715698242);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -688 * 1715698242");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-63864), (int) (short) -1, 155277600);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 302176508, 34385857);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10390598192847356L + "'", long2 == 10390598192847356L);
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-709960), 488360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -709960 * 488360");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-81725049), (-100490000), (-288303652));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -81725049 for  must be in the range [-100490000,-288303652]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(638821068, (-48512377), (-539633), (-450684));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-497209) + "'", int4 == (-497209));
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 184, (java.lang.Object) (-207514663720000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(299785985, 1784800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 299785985 * 1784800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-950048943), (-169409513819L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 168459464876L + "'", long2 == 168459464876L);
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 56, (-3031430));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [56,-3031430]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(48456408802476250L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 48456408802476250");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-34089228354420L), (long) (-106412324));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34089334766744L) + "'", long2 == (-34089334766744L));
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 317049115);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 317049115 + "'", int1 == 317049115);
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2248540, (-1710528757), 952906578);
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-9123345), (java.lang.Object) (-3328392039093L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 20714400, (java.lang.Object) (-3525982223L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(1065476531045050L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1065476531045050");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 240395115572925L, (java.lang.Object) (-99990000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-628056570), 1174462);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-626882108) + "'", int2 == (-626882108));
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-200015116), 1638607297, 176411220);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-281698083), (java.lang.Object) 351375808265460L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-949512368), (-1989670L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-951502038L) + "'", long2 == (-951502038L));
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-37243837), (-5203027));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 193780689494599L + "'", long2 == 193780689494599L);
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 87426300, (-1989524), 503932);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 87426300 for hi! must be in the range [-1989524,503932]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1463930970), 1715698242, (-498646));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1463930970 for hi! must be in the range [1715698242,-498646]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 3598, 7451, 1620);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3598 for  must be in the range [7451,1620]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1838776, (-173543860), 46920, (-9999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 35032);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35032L + "'", long2 == 35032L);
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 100, (long) 958464);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-958364L) + "'", long2 == (-958364L));
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 6289801, 3509649, 304461011);
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16929382), 66369120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49439738 + "'", int2 == 49439738);
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(41511168L, 1155435314060L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 41511168 * 1155435314060");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-15951520), (-152286));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16103806) + "'", int2 == (-16103806));
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1990710L, (long) (-53318417));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-106141505906070L) + "'", long2 == (-106141505906070L));
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-47524559));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47524559 + "'", int1 == 47524559);
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(197, (-61510), 56611, (-64));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3509649), 870);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3509649 * 870");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 351655538, (-304461011), (-1766929518));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(17450731328951671L, (long) (-47585));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 17450731328951671 * -47585");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) -1, 257572119, 4909);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hi! must be in the range [257572119,4909]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(304461011, 10, 1000, 299824116);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4637904 + "'", int4 == 4637904);
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(341736148L, 163299L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55805171232252L + "'", long2 == 55805171232252L);
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 533310184, (-576));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-307186665984L) + "'", long2 == (-307186665984L));
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1990611), (-880), 0, 3611760);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1620270 + "'", int4 == 1620270);
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(8990);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8990) + "'", int1 == (-8990));
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2959176, (java.lang.Object) (-61432903466918L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(185867227, (int) (byte) 1, (-17287395));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-67250068));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-67250068) + "'", int1 == (-67250068));
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 76433, (-174627162997L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-174627086564L) + "'", long2 == (-174627086564L));
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(48014510, 420358630, (-848595844));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

