package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1989057L, 134785804193901L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1989057 * 134785804193901");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(115104);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-115104) + "'", int1 == (-115104));
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1989679), (-312315));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2301994) + "'", int2 == (-2301994));
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2235464), 102842949170344L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2235464 * 102842949170344");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-291727568998734L), 34969884374403792L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -291727568998734 * 34969884374403792");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-689793507L), (-1277533));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 881233968378231L + "'", long2 == 881233968378231L);
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(2005430, (-364));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-729976520) + "'", int2 == (-729976520));
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(185867227, 1788087917, 801902322, 1126887300);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 999000207 + "'", int4 == 999000207);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-352616255L), 156879);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-55318085468145L) + "'", long2 == (-55318085468145L));
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) '4', (-86), (-204685393));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-18000), 100962303, (-168579832), (-970000));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-66665530) + "'", int4 == (-66665530));
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-999900), (-221718630));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-222718530) + "'", int2 == (-222718530));
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(4479760, 158);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4479918 + "'", int2 == 4479918);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 152286, 351665413);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [152286,351665413]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 153428, (-729));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-111849012L) + "'", long2 == (-111849012L));
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1989524L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1989524) + "'", int1 == (-1989524));
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(106575000, 99593070, 420386456);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 106575000 + "'", int3 == 106575000);
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-317147951), (-1715159045), 14307000);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(592, 152286, (-868));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 3598, 1705, 17329373);
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(26511982, 171469054);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 26511982 * 171469054");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1463930970), (long) 19);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1463930951L) + "'", long2 == (-1463930951L));
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 87, 100963131, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-3499569));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3499569 + "'", int1 == 3499569);
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 32482053, (-1715159045), 420368508);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1737870), (-1277533), 0, (-1989524));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-8700), (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8683) + "'", int3 == (-8683));
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(22639478L, (-927286811700000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 927286834339478L + "'", long2 == 927286834339478L);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(100963131);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100963131) + "'", int1 == (-100963131));
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-600832203), 3909, 530216924);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 48456409752000000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 52, 8467);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 440284L + "'", long2 == 440284L);
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-38868600), 1784800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -38868600 * 1784800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3499550L, 304461011);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1065476531045050L + "'", long2 == 1065476531045050L);
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 947642470, (-1713170345), (-106394130));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 947642470 for hi! must be in the range [-1713170345,-106394130]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-708510), 8700, (-198112800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 908660727, 4479944L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 904180783L + "'", long2 == 904180783L);
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-34386390), 789, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-46322273));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46322273 + "'", int1 == 46322273);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (-2336523L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2336523L + "'", long2 == 2336523L);
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-14307), 949427270, 489444);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-99370817L), 3328133821432L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3328034450615L + "'", long2 == 3328034450615L);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-79), (-39575028L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3126427212L + "'", long2 == 3126427212L);
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2987409L, (java.lang.Object) 3499553);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-198112800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-198112800) + "'", int1 == (-198112800));
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3499553, 155279264, 695393, (-15961217));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(100459953, (-300969892), 952907498);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100459953 + "'", int3 == 100459953);
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-47234));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47234) + "'", int1 == (-47234));
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(304461011, (-2284512));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 302176499 + "'", int2 == 302176499);
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-34386390), 4479760, 449475895);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 410609746 + "'", int3 == 410609746);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-635218511), (-112210784083120731L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-112210784718339242L) + "'", long2 == (-112210784718339242L));
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-299823236L), (long) (-1196950));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 358873422330200L + "'", long2 == 358873422330200L);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1784800, 2536427, 231190314);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1784800 for hi! must be in the range [2536427,231190314]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 12487942, (-951492298), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12487942 for  must be in the range [-951492298,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-3036L), 3499118572225L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3499118575261L) + "'", long2 == (-3499118575261L));
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-330040725), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3481738, (java.lang.Object) (-301848066));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9700, (-16635864L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-161367880800L) + "'", long2 == (-161367880800L));
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 5740);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5740 + "'", int1 == 5740);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-61432903456277L), 2005438);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -61432903456277 * 2005438");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-27573844749680284L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(40322555L, 290872721443138160L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 40322555 * 290872721443138160");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-27), (-592169827));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-52), (-201), 1454523, 1482832281);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1481377506 + "'", int4 == 1481377506);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(257397490, 9070);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 257397490 * 9070");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-468), 249426407, 10000, (-503932));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-15963399L), (long) (-2005430));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 32013479256570");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3909), 62000, (-2065033));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-19), (-146793024));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -19 * -146793024");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1588537255313989800L, 7146781980L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1588537255313989800 * 7146781980");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 630000000, (-190217798), 1762676017);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) ' ', 3499553);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3499585 + "'", int2 == 3499585);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(4479760, (-944117276));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-939637516) + "'", int2 == (-939637516));
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(2936930686872L, (-61432903466918L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2936930686872 * -61432903466918");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1786407669));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1786407669 + "'", int1 == 1786407669);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(100962303, 1788087917);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1889050220 + "'", int2 == 1889050220);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(6289801L, (-3536656783084835815L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3536656783091125616L + "'", long2 == 3536656783091125616L);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2304264), (-954811));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2304264 * -954811");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-87), 100449343);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -87 * 100449343");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-8700000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8700000) + "'", int2 == (-8700000));
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-843852), (-1786407669), (-48014510));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(111, (-106412530), (-96));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-106412324) + "'", int3 == (-106412324));
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3499650, (-204298726), 947642470);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(257397490, 174629);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 257572119 + "'", int2 == 257572119);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 351665413, 635218511, 1482832080);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-99440784), (long) 6289801);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105730585L) + "'", long2 == (-105730585L));
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-9864), 6015, (-1925124040));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9864 for  must be in the range [6015,-1925124040]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(8209, (-204298726), 2065028, 112110);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-1413255605480L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1413255605480");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 374064183, (-9797), (-9864));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(34969884374403792L, (long) 15);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34969884374403777L + "'", long2 == 34969884374403777L);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(198109764L, (long) 601423);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 197508341L + "'", long2 == 197508341L);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 630000000, 695393, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(9593040347982992L, 152286);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 9593040347982992 * 152286");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1715696283), (long) (-8700000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1724396283L) + "'", long2 == (-1724396283L));
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) -1, 549, (-944117276));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(586809815, (int) (byte) 0, 185867148, (-1713149062));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9691, 22759878);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 220565977698L + "'", long2 == 220565977698L);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(833, 2294419);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2295252 + "'", int2 == 2295252);
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-106403849), 0, 108109069, (-2284512));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1023879406695015L, 3500415L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1023879406695015 * 3500415");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(427505903966756160L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 427505903966756160");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 26511433, (long) 47234);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26558667L + "'", long2 == 26558667L);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1737870));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1737870 + "'", int1 == 1737870);
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1620, (-580601), (-601292683));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1620 for hi! must be in the range [-580601,-601292683]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-301848066), 9864);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-301838202) + "'", int2 == (-301838202));
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-97), (-330040725), (-168573390));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(198114912L, (long) 629990222);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 828105134L + "'", long2 == 828105134L);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-97960), (-2658887L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2756847L) + "'", long2 == (-2756847L));
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(21114914816100000L, (-1760510613L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 21114914816100000 * -1760510613");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 350000, (-166315520939630L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 166315521289630L + "'", long2 == 166315521289630L);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 1722848668956L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1722848668956L + "'", long2 == 1722848668956L);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-49788140531L), (-1990661L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49790131192L) + "'", long2 == (-49790131192L));
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-15127560000L), (java.lang.Object) 64244);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-5252), 2252833699511782L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2252833699517034L) + "'", long2 == (-2252833699517034L));
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 19, 56611, 874263);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for hi! must be in the range [56611,874263]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1, (-11), (-9778));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-952907498), 479643, 1786407669);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1710528757), (-310), 0, 976536);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 363757 + "'", int4 == 363757);
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(445, 841);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 374245 + "'", int2 == 374245);
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(171478832, (-314));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 171478518 + "'", int2 == 171478518);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(246727979316L, 7090009575436800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 246727979316 * 7090009575436800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9169), (-601337), 64244);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9169) + "'", int3 == (-9169));
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-350000), (-1454874), 8209, (-1463930970));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1205574775L, 668113251143498516L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-668113249937923741L) + "'", long2 == (-668113249937923741L));
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1763460086), (long) (-420368508));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 741303085269371688L + "'", long2 == 741303085269371688L);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-873000L), (java.lang.Object) (-3038));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(16524, (-843852), 549);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-827878) + "'", int3 == (-827878));
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-920), (java.lang.Object) (-5434716000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(304461111, 0, 2294419);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1597671 + "'", int3 == 1597671);
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 3499585, (long) 16524);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 57827142540");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(7739630, (-80));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7739550 + "'", int2 == 7739550);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(168544800, 870, (-767464499), (-17423));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-598901407) + "'", int4 == (-598901407));
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(350, 789);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1139 + "'", int2 == 1139);
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1185347686), 19907100, 14428);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 479643);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 479643 + "'", int1 == 479643);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2294419);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2294419) + "'", int1 == (-2294419));
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(35517209338L, (-97405));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3459553775567890L) + "'", long2 == (-3459553775567890L));
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(51, (-16990520), 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 176411220, (-173467889L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 349879109L + "'", long2 == 349879109L);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-61510));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-61510) + "'", int2 == (-61510));
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-78346), 100459953, (-9169), (-1715697100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1989679), 1718668813);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1989679 * 1718668813");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1185347686));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1185347686 + "'", int1 == 1185347686);
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(489444, (-2304106), (-155277600));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-4060211908L), (java.lang.Object) 10100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1989700), 450, (-10100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1762759876L), (long) (-47525247));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1810285123L) + "'", long2 == (-1810285123L));
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-498646), 3398104, (-244802), (-498646));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10552, (java.lang.Object) (-5434716000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-3034108));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3034108 + "'", int1 == 3034108);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 487551322, (java.lang.Object) 105019800L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2250), (long) 13584346);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13586596L) + "'", long2 == (-13586596L));
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46322273, (-2959086L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-137071589522478L) + "'", long2 == (-137071589522478L));
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 695393, 299785985L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 208469075467105");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-878700L), (-890933386072745043L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -878700 * -890933386072745043");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-15961217), (-300490249));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-316451466) + "'", int2 == (-316451466));
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-315818831173L), (long) 586810735);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-316405641908L) + "'", long2 == (-316405641908L));
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-257), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1763460000, 350, (-47525247));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-401679315779397770L), 97180281L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-401679315682217489L) + "'", long2 == (-401679315682217489L));
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3328171833047L, (-1695974308120618750L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1695970979948785703L) + "'", long2 == (-1695970979948785703L));
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 576131381, 8209, (-1989861));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1463930970), (-1715160045), 1121717);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 168544800L, (java.lang.Object) 1802640000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2047501715L), (long) 9972);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2047511687L) + "'", long2 == (-2047511687L));
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(302176499, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 302176508 + "'", int2 == 302176508);
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 4479918, (-1890034360821320L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1890034356341402L) + "'", long2 == (-1890034356341402L));
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 112110, 127833122375L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14331371349461250L + "'", long2 == 14331371349461250L);
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2923493245953L), (-336230297424L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3259723543377L) + "'", long2 == (-3259723543377L));
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2110080), (long) (-298964462));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 630838931976960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 22759878, 302176508, 3499553);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-954811), 3491750L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4446561L) + "'", long2 == (-4446561L));
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1712671034), (-17424));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1712671034 * -17424");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1989700), (-8115884L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16148174394800L + "'", long2 == 16148174394800L);
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-587951), 634344346, (-66665530));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(122822368831956544L, 47620);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 122822368831956544 * 47620");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1618160290106L), 332622506970L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1950782797076L) + "'", long2 == (-1950782797076L));
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-372966671566984L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1505073, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(171459354, 176421201);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347880555 + "'", int2 == 347880555);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(8467);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8467) + "'", int1 == (-8467));
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(833830547273L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 833830547273");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-3480228), 151654554644L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-151658034872L) + "'", long2 == (-151658034872L));
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3075697651L, 168544800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 518392845448264800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-51), (-812374164), 2248540);
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 176421201, 299824116);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52895330633483316L + "'", long2 == 52895330633483316L);
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-100490000), 13584346, 709908);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1597671);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1597671 + "'", int1 == 1597671);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-812374164));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-812374164) + "'", int1 == (-812374164));
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-158), (-2235115L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2234957L + "'", long2 == 2234957L);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(46851, 19, 47525247, (-106403849));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-18832302128L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 576, (-349956900), 310);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-349956635) + "'", int4 == (-349956635));
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(954811000, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 954811000 + "'", int2 == 954811000);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-4901292060000L), (long) 947642470);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4902239702470L) + "'", long2 == (-4902239702470L));
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(911, (-1989687), (-1530017442), 22384927);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1988776) + "'", int4 == (-1988776));
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-86130), 1910207);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -86130 * 1910207");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9691, 11, 3499553);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9691 + "'", int3 == 9691);
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-15961567), 1023872406117175L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -15961567 * 1023872406117175");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1454523), 711148, 399618);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-15951520), (-1462491242), (-539633));
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 711052, 3045000, 3499585);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 711052 for  must be in the range [3045000,3499585]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(169182050, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 169182050 + "'", int2 == 169182050);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-168579832), (-10001));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1685966899832L + "'", long2 == 1685966899832L);
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-17802), (-9123345), (-1761479067));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 2658977, 1023872308938115L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1023872306279138L) + "'", long2 == (-1023872306279138L));
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-77338269012L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-77338269012L) + "'", long2 == (-77338269012L));
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(288303652);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-288303652) + "'", int1 == (-288303652));
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1454523);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1454523) + "'", int1 == (-1454523));
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(80, 24429098);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1954327840 + "'", int2 == 1954327840);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 21064, 99385044L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99406108L + "'", long2 == 99406108L);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(106584691L, (-1989861));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-212088719817951L) + "'", long2 == (-212088719817951L));
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2301994), (long) 608209176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-610511170L) + "'", long2 == (-610511170L));
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-97960), 35, (-100963131));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 217526, 106575000, 2294400);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 217526 for  must be in the range [106575000,2294400]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1989648L), (long) (-1174462));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3164110L) + "'", long2 == (-3164110L));
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1763460086), 296192052, 638821068);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(2877525000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2877525000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 449475895, (-17292594123200L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 449475895 * -17292594123200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-214183750), 2304106, 73710);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-677162), (long) (-17423));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 11798193526");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2983768123909261L, (java.lang.Object) (-1953880));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(108685080, 10001, 944118497, 9864);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 688309020, (-708510), 257572119);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(126482100, (-1995555));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 124486545 + "'", int2 == 124486545);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-700), (-226721592L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 226720892L + "'", long2 == 226720892L);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-442560), 504032, (-597509));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -442560 for  must be in the range [504032,-597509]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-100), (-843852), (int) ' ');
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) (-374064183));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1121717, 958464, 47525247);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1121717 + "'", int3 == 1121717);
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16929382), 9788);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16919594) + "'", int2 == (-16919594));
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(232883752);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-232883752) + "'", int1 == (-232883752));
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-412));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-412) + "'", int1 == (-412));
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeAdd((-1763460000), (-628056570));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -1763460000 + -628056570");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1789774L, 363757);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 651042820918L + "'", long2 == 651042820918L);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1737870, (-357591120), (-3035028));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-352818223) + "'", int3 == (-352818223));
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1718668813L, (long) (-349956635));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-601459554476924255L) + "'", long2 == (-601459554476924255L));
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-853901), 1482832281, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-210), (-767464499));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -210 * -767464499");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 168472090, (java.lang.Object) 1989057L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 9798);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9798 + "'", int1 == 9798);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1942080), (-2582129), (-704619699));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1942080 for hi! must be in the range [-2582129,-704619699]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-951493178), 577, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 700, 3499569, 6289491);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 700 for hi! must be in the range [3499569,6289491]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-188114696), 1711);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-188112985) + "'", int2 == (-188112985));
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 952907498, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1762759876L), 3053499302L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5382586050959606552");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3049267382L, (long) (-46322273));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3002945109L + "'", long2 == 3002945109L);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 576131381);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 576131381 + "'", int1 == 576131381);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 259940595, (long) 46920);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 12196412717400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 51, (-1761176514), 30906162);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2110080, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2110080 + "'", int2 == 2110080);
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(10, 105975160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 105975170 + "'", int2 == 105975170);
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3398104), (long) 1185347686);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4027934713187344L) + "'", long2 == (-4027934713187344L));
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 155277600, (java.lang.Object) 3499650L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1766929518, (-322), 231190314);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(197L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 197 + "'", int1 == 197);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 58975891968000L, (java.lang.Object) 997290191287369L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 86130, 176411200, 299824116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 106575000, (long) (-99440784));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -10597901554800000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1470988428, 302176499, (-1713170126));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-13020480), (-3664729514250000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3664729527270480L) + "'", long2 == (-3664729527270480L));
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-600832203), (-317147951));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -600832203 * -317147951");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(863097812129976L, (-7962730000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 863097812129976 * -7962730000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-5802206573999812L), (long) (-1989686));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -5802206573999812 * -1989686");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(71700L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 71700 + "'", int1 == 71700);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(98L, (-1682020L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-164837960) + "'", int2 == (-164837960));
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(168544800L, (-54948));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9261199670400L) + "'", long2 == (-9261199670400L));
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(420386456, 1495740, 3469518);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1945308 + "'", int3 == 1945308);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1616447619072L), (java.lang.Object) 171469054);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(524160);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-524160) + "'", int1 == (-524160));
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2599459800L), (-100188684));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 260436456472903200L + "'", long2 == 260436456472903200L);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(17802, 99370817, (-1761078660));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-208569710), 609053028);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 400483318 + "'", int2 == 400483318);
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(97770180L, (-1925124040));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-188219723913127200L) + "'", long2 == (-188219723913127200L));
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(576131381, 326128844);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 576131381 * 326128844");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-15805100), (java.lang.Object) (-49788140531L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-468), (-1989861));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9864, (-6289801), (-1794561));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4485377) + "'", int3 == (-4485377));
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2065028), 826237160L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 824172132L + "'", long2 == 824172132L);
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(5571553L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5571553 + "'", int1 == 5571553);
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-536575), (-148474462), (-106412530));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -536575 for  must be in the range [-148474462,-106412530]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 1620, (-168572690));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1763469777), (long) 34386408);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1729083369L) + "'", long2 == (-1729083369L));
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-17424), (-1713149062), (-8467));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-17424) + "'", int3 == (-17424));
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 95336384, (-2250), 1990710);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 95336384 for hi! must be in the range [-2250,1990710]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(695393, (-2284512), (-53816));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1535304) + "'", int3 == (-1535304));
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-329294901808158L), (long) 6289491);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-329294908097649L) + "'", long2 == (-329294908097649L));
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-14308));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14308) + "'", int1 == (-14308));
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-6717425867802L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(339160985L, (long) (-580601));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -196917207051985");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-204677760), (-152286), 487551322);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-149158L), 638821068);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-95285272860744L) + "'", long2 == (-95285272860744L));
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-161986), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-161986) + "'", int2 == (-161986));
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1221, (java.lang.Object) (-951492297));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(8, 1470988428);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 8 * 1470988428");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(711052, (-598901407), (-96), (-1535304));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 47525247, (long) (-164837960));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7833964763976120L) + "'", long2 == (-7833964763976120L));
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1), 32482053);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32482052 + "'", int2 == 32482052);
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 101);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 101 + "'", int1 == 101);
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 10018638241505L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3398104, (int) (byte) 0, (-17423), (-601292683));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 700, 48456408544815020L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 700 * 48456408544815020");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5802206573999812L), 1139);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6608713287785785868L) + "'", long2 == (-6608713287785785868L));
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(350000, 503932);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 853932 + "'", int2 == 853932);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 97960, 634344346);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62140372134160L + "'", long2 == 62140372134160L);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-288303652), (java.lang.Object) 600842000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 528938295, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 95336384, (-76433), (-1450647));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 95336384 for  must be in the range [-76433,-1450647]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(507005, 954811000, (-789), 949417406);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5899809 + "'", int4 == 5899809);
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(26511433, 0, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1989679), 1363364418L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2712657551841822L) + "'", long2 == (-2712657551841822L));
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-13020480), (-1462491242));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19042337966636160L + "'", long2 == 19042337966636160L);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2304264), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2304264L) + "'", long2 == (-2304264L));
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1737870, 872, (-16919594));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-109132037444917766L), (-77228082932L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -109132037444917766 * -77228082932");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-816756018), (-896371847163213190L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 896371846346457172L + "'", long2 == 896371846346457172L);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(358873422330200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 358873422330200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 96, (-3509649));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-336926304L) + "'", long2 == (-336926304L));
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-53248));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53248 + "'", int1 == 53248);
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3499569), 976536, (-10049));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 619, (-100490000), (-27826));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 619 for hi! must be in the range [-100490000,-27826]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1990710L), (-8467));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16855341570L + "'", long2 == 16855341570L);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1713149062), (long) 112110);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1713261172L) + "'", long2 == (-1713261172L));
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-17899), 3371552917992000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -17899 * 3371552917992000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 68800L, (java.lang.Object) 357120L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(11041219000L, (long) (-10100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11041229100L + "'", long2 == 11041229100L);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1370574, (-100460641), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(9169);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9169) + "'", int1 == (-9169));
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1878586821103608868L, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1878586821103608868 * 52");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 711148, 1705, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(711052);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-711052) + "'", int1 == (-711052));
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-18048122527557L), 1711);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30880337644650027L) + "'", long2 == (-30880337644650027L));
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(48014510, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48014510 + "'", int2 == 48014510);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-6143313703657988L), (-10147444357707714L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4004130654049726L + "'", long2 == 4004130654049726L);
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-54948), (-39585000), 601423);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-29017121375578L), (long) (-586809815));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -29017121375578 * -586809815");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1718668813, (-949427270), (-954811), 105975170);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20731669 + "'", int4 == 20731669);
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 400483318, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-76533), (-7355254410L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7355177877L + "'", long2 == 7355177877L);
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-4506), (-586809815), (-106412324));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4506 for  must be in the range [-586809815,-106412324]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 576, 0, (-30));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 576 for hi! must be in the range [0,-30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1505073, (-1450548), (-15951520));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1505073 for hi! must be in the range [-1450548,-15951520]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-97), 258759, 80, 171478832);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 258662 + "'", int4 == 258662);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-18), (-441), (-9797));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -18 for hi! must be in the range [-441,-9797]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 709960, (-1761078660), 46831);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(258662, 1454523, (-1519234035), (-1717685969));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(197, (-201));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-76433));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 76433 + "'", int1 == 76433);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2456901935445342L), (-197L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2456901935445145L) + "'", long2 == (-2456901935445145L));
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(601423);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-601423) + "'", int1 == (-601423));
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 688, 532427871);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 366310375248L + "'", long2 == 366310375248L);
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-111849012L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-111849012) + "'", int1 == (-111849012));
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-76433), (-87426300), 108109069);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-620), 46851);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29047620) + "'", int2 == (-29047620));
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 90);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 590319565L, (java.lang.Object) (-9719L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(2987409L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2987409 + "'", int1 == 2987409);
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 171478832, (-1943880L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 173422712L + "'", long2 == 173422712L);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 926161, (-16990520), (-1285742));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(4476722, (-35), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-207514663720000L), (long) 95336384);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-207514568383616L) + "'", long2 == (-207514568383616L));
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(15345, 100963445);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100978790 + "'", int2 == 100978790);
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2252832755393285L, (java.lang.Object) (-36069449L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-17424));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-17424) + "'", int1 == (-17424));
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(249426407);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-249426407) + "'", int1 == (-249426407));
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 176411220);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 176411220 + "'", int1 == 176411220);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6959097919711L), (java.lang.Object) (-944117276L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-301848066), (-173543860), (-843852));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-129148057) + "'", int3 == (-129148057));
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 549, (-610511170L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 610511719L + "'", long2 == 610511719L);
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 310, (-25), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1329383L), (java.lang.Object) 339160985L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(988966305600L, (long) (-848595844));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 988966305600 * -848595844");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3002945109L, 11);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33032396199L + "'", long2 == 33032396199L);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(688309020, (-152286), 350);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-83850) + "'", int3 == (-83850));
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-10001), (-61510));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [-10001,-61510]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1945308, 620);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1206090960L + "'", long2 == 1206090960L);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(440284L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 440284 + "'", int1 == 440284);
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1, 299785985, 2582129);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-198121500L), (-79));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15651598500L + "'", long2 == 15651598500L);
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 951502398, (-5234757L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4980883838447286");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-949427270), 119398608L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1068825878L) + "'", long2 == (-1068825878L));
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1788088016), 34386390);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1753701626) + "'", int2 == (-1753701626));
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-329294901808158L), (long) 3398104);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-329294905206262L) + "'", long2 == (-329294905206262L));
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-76433), 156879, 35000, (-8372910));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(130289873L, (long) (-537804800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 668094673L + "'", long2 == 668094673L);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3499569), 153251, (-687800606));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-244802), 3480228, (-951493178));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -244802 for  must be in the range [3480228,-951493178]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-97960), (java.lang.Object) 315638545L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(339160985, (-963979), 449475895);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 339160985 + "'", int3 == 339160985);
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 600842000, 31508272, (-934667));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 709908, (long) 1482832281);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1483542189L + "'", long2 == 1483542189L);
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2219805000L), (-15514L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2219789486L) + "'", long2 == (-2219789486L));
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 350035111L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(783775357050000L, (long) 999000207);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 783775357050000 * 999000207");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(168472090);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-168472090) + "'", int1 == (-168472090));
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 46920, (long) (-8700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55620L + "'", long2 == 55620L);
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-620), 504032, (-1717685969));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9719), (-920));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8941480 + "'", int2 == 8941480);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1990613L), 1890034360661700L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1990613 * 1890034360661700");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-53816), 93686632872L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5041839834639552");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-5434716000L), 221881485L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5656597485L) + "'", long2 == (-5656597485L));
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-34386307L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34386307L) + "'", long2 == (-34386307L));
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 87);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 87 + "'", int1 == 87);
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3469518), (-19), 630000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 169182050, (-15961217), (-288303652));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 169182050 for hi! must be in the range [-15961217,-288303652]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 86130, (long) 1470988428);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 126696233303640");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 349956900, 5148, (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-22), 479643);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10552146L) + "'", long2 == (-10552146L));
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-18000), 376L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6768000) + "'", int2 == (-6768000));
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-301848066));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 301848066 + "'", int1 == 301848066);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 16524, 634, 592);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16524 for  must be in the range [634,592]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 450, 27, (-204298726));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-729976520), 5740, (-349956635));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1715156650));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1715156650 + "'", int1 == 1715156650);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3469518), 2284709, (-1784800), (-122484040));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-80), (-106412530), 185867148, 1221);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3480228, (-189935540116495599L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3480228 * -189935540116495599");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 99593070, (java.lang.Object) (-180870L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-816756018), (-1784800), 304461011);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(97180281L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97180281 + "'", int1 == 97180281);
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-14227));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-17423));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17423 + "'", int1 == 17423);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-53816), (-52), 635218511);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -53816 for  must be in the range [-52,635218511]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(48456411467159045L, (long) (-148474462));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48456411318684583L + "'", long2 == 48456411318684583L);
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-524160), 349956900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 349432740 + "'", int2 == 349432740);
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-226721592L), (-206502800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46818643568457600L + "'", long2 == 46818643568457600L);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1990710);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1990710 + "'", int1 == 1990710);
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1950782797076L), (long) (-709960));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1950782087116L) + "'", long2 == (-1950782087116L));
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3536656467266061812L, (long) (-257397490));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3536656467266061812 * -257397490");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 532281952, 1990710, (-14428));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-6142282650476246L), (-1028141521L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6142281622334725L) + "'", long2 == (-6142281622334725L));
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1761394973, (-8683));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15294192550559L) + "'", long2 == (-15294192550559L));
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(226720892L, (long) 157773616);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 384494508L + "'", long2 == 384494508L);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-221718630), 0, 115104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1142, 1715697100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1715698242 + "'", int2 == 1715698242);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(11, 100459953, (-106575000), (-489951));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-5625086) + "'", int4 == (-5625086));
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-15127560000L), (long) 524160);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15127035840L) + "'", long2 == (-15127035840L));
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9123345), 1766929518, (-1450548), (-47620));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-63864) + "'", int4 == (-63864));
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1010, (java.lang.Object) (-1715156650));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-767464499), 10047);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-767454452) + "'", int2 == (-767454452));
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2159885535598L), 48014600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2159885535598 * 48014600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-105840302582167054L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -105840302582167054");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-151069740), (-1763460000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 266405443700400000L + "'", long2 == 266405443700400000L);
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16990520), (-1989687));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18980207) + "'", int2 == (-18980207));
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-148474462), (long) 1999672);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-150474134L) + "'", long2 == (-150474134L));
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2248228L, (long) 8700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19559583600L + "'", long2 == 19559583600L);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(350034159L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 350034159 + "'", int1 == 350034159);
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-873));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 873 + "'", int1 == 873);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(46831, 299785985, (-100188684), 1174365);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4256334) + "'", int4 == (-4256334));
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-80635680));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 80635680 + "'", int1 == 80635680);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-201), 51, (-54948));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -201 for hi! must be in the range [51,-54948]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-146793024), (-1761079449));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -146793024 * -1761079449");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1761479067), (long) 18000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-31706623206000L) + "'", long2 == (-31706623206000L));
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1953880), (long) 954811);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1865586116680");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(22199491L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22199491 + "'", int1 == 22199491);
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-8751067110L), (java.lang.Object) (-790000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-399618), (long) (-3277662));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1309812733116");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 56, 46930);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1762676017), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1762676017L) + "'", long2 == (-1762676017L));
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 171478518, 920, (-107726616));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 171478518 for hi! must be in the range [920,-107726616]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(217526, 4033340, (-374064183));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-451), 634, 489444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 488360 + "'", int3 == 488360);
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-6717378342455L), (long) (-87426300));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -6717378342455 * -87426300");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (short) -1, 62, 532426752);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hi! must be in the range [62,532426752]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-101335430L), (-874263));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88593817038090L + "'", long2 == 88593817038090L);
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 288303652, (-4506), (-5));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 288303652 for hi! must be in the range [-4506,-5]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-590309465));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 590309465 + "'", int1 == 590309465);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 107222400L, (java.lang.Object) (-147666024L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2065033));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2065033 + "'", int1 == 2065033);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-18000), 201372638, 64, 302176508);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 201354638 + "'", int4 == 201354638);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(22199491L, 2936930686872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2936908487381L) + "'", long2 == (-2936908487381L));
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(440284L, (long) 210);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 92459640L + "'", long2 == 92459640L);
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-330040725), (java.lang.Object) 201354638);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1724396283L), (-155757153L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1880153436L) + "'", long2 == (-1880153436L));
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 3038, (-14149), 3509649);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 100449343, 0, (-48014510));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3126427212L, (-6717425867802L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6720552295014L + "'", long2 == 6720552295014L);
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-27826), (long) (-48014510));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47986684L + "'", long2 == 47986684L);
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-9169), 880, (-1763425054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9169 for  must be in the range [880,-1763425054]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2284709, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 100449343, 61414968000789L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61415068450132L + "'", long2 == 61415068450132L);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-3034108), (-99), 296192052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3034108 for  must be in the range [-99,296192052]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(43296, 0, 197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 132 + "'", int3 == 132);
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(911);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-911) + "'", int1 == (-911));
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(489951, 3828);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 493779 + "'", int2 == 493779);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1738657, (-301838202), 112110);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(776875860L, (-214183750));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-166394184979275000L) + "'", long2 == (-166394184979275000L));
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-168644268L), 1788087917);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-301550777882109756L) + "'", long2 == (-301550777882109756L));
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1482832281, 769351440L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 713480841L + "'", long2 == 713480841L);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(6022437L, (-16987813610L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16981791173L) + "'", long2 == (-16981791173L));
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(151226407392820942L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 151226407392820942");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 351665413, (long) (-1995555));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -701767673239215");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-15127035840L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -15127035840");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1967089), (-1879789912), 249426407, 185867227);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 14307000, 37128L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14344128L + "'", long2 == 14344128L);
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(99L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(129948442624L, (-29017121375578L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29147069818202L + "'", long2 == 29147069818202L);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-10049), 304461011, (-27));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

