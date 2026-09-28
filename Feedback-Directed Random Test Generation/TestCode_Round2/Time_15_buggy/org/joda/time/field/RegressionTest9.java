package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(872L, 22632004046400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-22632004045528L) + "'", long2 == (-22632004045528L));
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-16919594), (long) 1620);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27409742280L) + "'", long2 == (-27409742280L));
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(34386308, 90, (-9864));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 210, (-35), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 954811, 76433, 1762675999);
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 4476722, (long) (-1450647));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3026075L + "'", long2 == 3026075L);
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-273471229715886774L), (-1454523));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -273471229715886774 * -1454523");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2248228L, (java.lang.Object) 21064);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2248540, 24429098, 7451);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-106394130), (-9788880), 34386308);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(86130, 1943430, (-868), (-257397490));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(4033340, 9691);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4043031 + "'", int2 == 4043031);
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(40322555L, 3996509289L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 161149465613713395L + "'", long2 == 161149465613713395L);
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-63864), 3996818972L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-255252846827808L) + "'", long2 == (-255252846827808L));
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 201354638, 577, (-704619699));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1762676017, 688309020, 539633);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1762676017 for  must be in the range [688309020,539633]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-291727568998734L), 3447544L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-291727565551190L) + "'", long2 == (-291727565551190L));
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(700099020854530L, 153251);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 700099020854530 * 153251");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(86130, 970111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 86130 * 970111");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-15961567), 910L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15960657L) + "'", long2 == (-15960657L));
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 48456409752000000L, (java.lang.Object) 97770180L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-16981791173L), 863097812129976L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -16981791173 * 863097812129976");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-9651L), (-372966672741349L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3599501358626759199");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-756956234586347L), 7739630L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-756956242325977L) + "'", long2 == (-756956242325977L));
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-207514568383616L), (java.lang.Object) (-1695970979948785703L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-8209), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 34386408, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34386408 for  must be in the range [0,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2065033), (-951502398), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2065033) + "'", int3 == (-2065033));
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(801884423L, (-756956242325977L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 801884423 * -756956242325977");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-44));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-111), (java.lang.Object) 577142281L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1450647, (long) (-2294419));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3328392039093L) + "'", long2 == (-3328392039093L));
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-335208917473000L), 1117972070);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -335208917473000 * 1117972070");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2294419, (-34386390));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32091971) + "'", int2 == (-32091971));
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1802640000, 26511433, 349432740);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(163299L, (long) (-188790000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30829218210000L) + "'", long2 == (-30829218210000L));
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(351655538, 302176499, 479643, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1121717, 97180281, (-4506));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1481678848L, (long) (-10221043));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -15144303217598464");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-944117276), 1234120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-942883156) + "'", int2 == (-942883156));
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1715697100, 789, (-1174462));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1995685L), (java.lang.Object) (-1890034360821320L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-150474134L), 17329373);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2607622394937982L) + "'", long2 == (-2607622394937982L));
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1763450397), (-62000), (-25));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1763450397 for  must be in the range [-62000,-25]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(53248, (-576));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52672 + "'", int2 == 52672);
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-209963625615216L), 63702693L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-209963689317909L) + "'", long2 == (-209963689317909L));
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 34875834, (java.lang.Object) (-880));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 168579832, 6069060510816L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6068891930984L) + "'", long2 == (-6068891930984L));
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(493779, (-85250028));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-84756249) + "'", int2 == (-84756249));
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(9989);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9989) + "'", int1 == (-9989));
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-580601), (-816756018), (-9864), 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-6129) + "'", int4 == (-6129));
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1989524L), (-3499650));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6962637666600L + "'", long2 == 6962637666600L);
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 489951, (-1715696724), (-10047));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2235464L), 1023879406695015L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2235464 * 1023879406695015");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1755570876), (-350000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1755920876) + "'", int2 == (-1755920876));
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1620, (-155277600), (-570400));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1620 for hi! must be in the range [-155277600,-570400]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 45091, (-1715160045), 351655538);
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-587951), 608209176, 709908);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1410L, (long) 351);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 494910 + "'", int2 == 494910);
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3328133821432L), 7739550);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3328133821432 * 7739550");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(370758906605749440L, 2110080);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 370758906605749440 * 2110080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 152286, (-96), (-951493178));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1482832080, 10552, (-46));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 201354638, 3499118563149L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 201354638 * 3499118563149");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9999, 52672);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 526667328L + "'", long2 == 526667328L);
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(299785985);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-299785985) + "'", int1 == (-299785985));
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-17864), (java.lang.Object) (-1068825878L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(99, (-32091971), (-312));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-32091561) + "'", int3 == (-32091561));
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-310), 10100, (-350035111));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(185867227, (-168579832));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17287395 + "'", int2 == 17287395);
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(9593040347982992L, (long) (-708510));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 9593040347982992 * -708510");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(101009154, 299785985);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 400795139 + "'", int2 == 400795139);
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-756956063135674L), (-6983102989863L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-749972960145811L) + "'", long2 == (-749972960145811L));
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(112110, (-106575000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-106462890) + "'", int2 == (-106462890));
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(530216924);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-530216924) + "'", int1 == (-530216924));
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3509768L, 73477967816424400L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3509768 * 73477967816424400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-339652578854649060L), 1481678848L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-339652577372970212L) + "'", long2 == (-339652577372970212L));
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 634, 231190314, 1990810);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-450684), 5148);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -450684 * 5148");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1705, (-17802));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30352410) + "'", int2 == (-30352410));
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-15951520), 1126887300);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -15951520 * 1126887300");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-129148057), 80635680, (-1755920876), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-48512377) + "'", int4 == (-48512377));
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1867778970252L, 157062400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1867936032652L + "'", long2 == 1867936032652L);
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-349946851), (java.lang.Object) 87426300);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-32091561), 1588537255313989800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -32091561 * 1588537255313989800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2304264), (-1766929518), (-349956635));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 873, 3499550L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3055107150");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 6962637666600L, (java.lang.Object) (-169871L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 48456408803446250L, (java.lang.Object) (-8252422149000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 351665413, 9700, 400795139);
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-84385200));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-84385200) + "'", int1 == (-84385200));
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(10798665292800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 10798665292800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-48014510), (long) (-843852));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 40517140292520");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 15345, (java.lang.Object) 20731669);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-587951), 4476722);
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1454524));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1454524 + "'", int1 == 1454524);
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(141074004320L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 141074004320");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-275138387L), (long) (-873812));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-274264575L) + "'", long2 == (-274264575L));
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3499569), 171478518, (-188112985));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3055503590L, (-1028141521L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3141490108443560390");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 577142280, 1167818605769088000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 577142280 * 1167818605769088000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-167335), 1715698242, 577142280);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -167335 for hi! must be in the range [1715698242,577142280]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(635218511, (-2103102));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 633115409 + "'", int2 == 633115409);
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-16987813610L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -16987813610");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(127833122375L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1715697100, (-1989687), 633115409);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1715697100 for hi! must be in the range [-1989687,633115409]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(48014600L, (long) (-4));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48014596L + "'", long2 == 48014596L);
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-19), 11, (-728));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(420386456, (-27826));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 420358630 + "'", int2 == 420358630);
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(582328281600L, (long) 489444);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 582328771044L + "'", long2 == 582328771044L);
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-450683), (-316451466), (-357608543));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -450683 for  must be in the range [-316451466,-357608543]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 159779046, (-81725049), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-244802));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-244802) + "'", int1 == (-244802));
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 10552, (-3034108));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(3329092237737L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3329092237737");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(288303652, 231190314, (int) (short) 0, (-10398));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1.0d, (java.lang.Object) 32L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1990710L, 33032396199L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 65757921437311290");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 576131381, (-6959097919711L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6959674051092L + "'", long2 == 6959674051092L);
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 22199491, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 710383712L + "'", long2 == 710383712L);
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-78346), (-536575), 2536427);
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-18), 80635680, 0, 34386390);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11862880 + "'", int4 == 11862880);
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(114L, (-99375055L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99375169L + "'", long2 == 99375169L);
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 176411220, (java.lang.Object) 608209176);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2376658, (-539633), (-47234));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-85342) + "'", int3 == (-85342));
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 688, (-19L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 669L + "'", long2 == 669L);
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1221, 236129206, 304461111);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-47585L), (long) 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4710915) + "'", int2 == (-4710915));
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-14308));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14308 + "'", int1 == 14308);
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-164837960), (-132));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-164838092) + "'", int2 == (-164838092));
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1943780), (-600842000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1943780 * -600842000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-99), (java.lang.Object) (-3996509288L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 2005430, (-6717378342455L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6717380347885L + "'", long2 == 6717380347885L);
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1431L), (-873));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1249263L + "'", long2 == 1249263L);
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(336751238245786L, 106584691L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 336751131661095L + "'", long2 == 336751131661095L);
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(590309465, 8, 56611, 1715156650);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 590309473 + "'", int4 == 590309473);
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1760510603), (-201), (-79));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-312315), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-80635680), 954811000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-76991834256480000L) + "'", long2 == (-76991834256480000L));
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1995555), 288303652, 635218511);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 344919305 + "'", int3 == 344919305);
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(7090009575436800L, 78558096027L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7089931017340773L + "'", long2 == 7089931017340773L);
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-111), (-503932), 217526);
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9169), (-3480386));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -9169 * -3480386");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(299785985L, 951502398);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 285247083614292030L + "'", long2 == 285247083614292030L);
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 5148, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5148L + "'", long2 == 5148L);
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(16524, 0, 3611760, (-9989));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-10100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10100 + "'", int1 == 10100);
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(819000, (-18000), 1517218488, (-299315787));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-171478832), (-68697));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -171478832 * -68697");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 80);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 80 + "'", int1 == 80);
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 8700, (long) 973781);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 8471894700");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-34386408), (-349956635), (-450683));
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-708129348), (-101));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-708129449) + "'", int2 == (-708129449));
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 106575000, 999000207, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-586809815), 9989, 201372638);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 30906162, 1765497216, 124486545);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 30906162 for hi! must be in the range [1765497216,124486545]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(4842131L, 101009154);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 489099555867174L + "'", long2 == 489099555867174L);
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-9261199670400L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(609053028L, (long) 7739550);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 616792578L + "'", long2 == 616792578L);
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-32091561), 592, 95336384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 63244232 + "'", int3 == 63244232);
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-350000), 201, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -350000 for  must be in the range [201,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 350035111, 48456409752010398L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-48456409401975287L) + "'", long2 == (-48456409401975287L));
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-101), (-17423), (-598901407));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-106394130), 27273296640L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27166902510L + "'", long2 == 27166902510L);
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 14428, (-489444), (-204685393));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(15172184748L, (long) 843887);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15171340861L + "'", long2 == 15171340861L);
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(30453054657L, (long) (-1715697100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 30453054657 * -1715697100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1765497216, (-185867227), (-399618));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-89178884) + "'", int3 == (-89178884));
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(9070, 46322273);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 9070 * 46322273");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10, (-299785985), 1174365);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3371552917992000000L, 339161818);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3371552917992000000 * 339161818");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-106412530), 711148, (-34386408));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2284709, (-76433));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-174627162997L) + "'", long2 == (-174627162997L));
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 168472090, (-1470988428), (-590309465));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-204677760), 198112800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6564960) + "'", int2 == (-6564960));
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 711052, (-1454524), 532281952);
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-9719), (java.lang.Object) 1505073L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1023876541100647L, (java.lang.Object) 11041229100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-167335), (-8683), (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-188114696), (-2304264), (-62000), (-54920));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-60437) + "'", int4 == (-60437));
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 4479918, 8700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38975286600L + "'", long2 == 38975286600L);
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(3038L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3038 + "'", int1 == 3038);
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3337664, (-317147951));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3337664 * -317147951");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-709960), (-46851));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -709960 * -46851");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1999662), 776875860L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1553489135959320");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 479643);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-9261199670400L), (-16635864L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -9261199670400 * -16635864");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1108968198273600L, (java.lang.Object) (-597509));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-16919594), 451);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -16919594 * 451");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 100459953, 0, 97960);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100459953 for  must be in the range [0,97960]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 56611, (long) (-963979));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-54571815169L) + "'", long2 == (-54571815169L));
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 126482100, (int) '4', 1142);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-33916098500L), (java.lang.Object) (-8699039L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(171478518, 590309473, 304461111);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(9778, 176411200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 9778 * 176411200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-620), 1664, (-1755920876));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1007695204639L), (-69933593094440609L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1007695204639 * -69933593094440609");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-97943307050667180L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -97943307050667180");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-4), 0, (-863620));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4 for  must be in the range [0,-863620]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-268883609400L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 95781, 853932, (-185867227));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 95781 for hi! must be in the range [853932,-185867227]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 952906578, (java.lang.Object) (-942883156));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3510537456600000L, 6962637666600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3517500094266600L + "'", long2 == 3517500094266600L);
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1715696724), (java.lang.Object) (-592));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3499568L, (-1762759876L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6168898053733568L) + "'", long2 == (-6168898053733568L));
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3499550L, (long) (-1943780));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5443330L + "'", long2 == 5443330L);
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1988776), 3053498160L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3051509384L + "'", long2 == 3051509384L);
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 608209176, (java.lang.Object) 1788088016);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(201372638, 507005, (-2065033), (-61117));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-515974) + "'", int4 == (-515974));
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-188114696), (-952557498), 420386456);
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-326227937093079000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -326227937093079000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-767464499), 126547938, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-288303652), (-97146319L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 28007638546056988");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 351655538, (-164838092), (-87426300));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-5171989170962208L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5171989170962208");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(106575000, (-87426300), (-158));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-68277286) + "'", int3 == (-68277286));
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 198112800, (java.lang.Object) 1685966899832L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 257397490, 493779, 3909);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-188114696), (-767454452), (-949417406));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 14307000, (java.lang.Object) 420358630);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1454523, 56);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 81453288L + "'", long2 == 81453288L);
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 420358630, 590309465, 504032);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 420358630 for hi! must be in the range [590309465,504032]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-100188684));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100188684) + "'", int2 == (-100188684));
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-100), 2295252, 1762675999);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(634344346);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-634344346) + "'", int1 == (-634344346));
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(874089L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 874089 + "'", int1 == 874089);
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-326227937093079000L), 95781);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -326227937093079000 * 95781");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(201372638, (-99440784));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101931854 + "'", int2 == 101931854);
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1980223L, (-1762676017));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3490491590411791L) + "'", long2 == (-3490491590411791L));
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-934667), 3480228, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-489951), (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-490002) + "'", int2 == (-490002));
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1108968198273600L, (java.lang.Object) (-5203027));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5203027), (-14227), (-80), (-2235464));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 19907100, 400795139);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7978668911586900L + "'", long2 == 7978668911586900L);
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 5220530, (-539633), (-9169));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1712671034, (long) (-152286));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -260815821083724");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-33916098500L), 2987409L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -101321257903786500");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(494910, (-874263), (-171478832), (-1942080));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-169916106) + "'", int4 == (-169916106));
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1117972070, (java.lang.Object) 1722847825104L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 95781, (long) (-498646));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 594427L + "'", long2 == 594427L);
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-349956900), 62000, 8990);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -349956900 for hi! must be in the range [62000,8990]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3996818972L, (long) 420386456);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1680208562912643232");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1953880), 115104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1838776) + "'", int2 == (-1838776));
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(100964278L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100964278 + "'", int1 == 100964278);
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 872L, (java.lang.Object) (-450683L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-708129449), (-1950782087116L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -708129449 * -1950782087116");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 107747840109832L, (java.lang.Object) (-106394130));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(14307000L, 1023879406695015L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1023879392388015L) + "'", long2 == (-1023879392388015L));
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 350, 808191813, (-171478832));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 350 for hi! must be in the range [808191813,-171478832]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1713170126), (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1713170135) + "'", int2 == (-1713170135));
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9700, (-300551), 8700);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-299552) + "'", int3 == (-299552));
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1715159045), (-299315787), (-708510));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1715159045 for  must be in the range [-299315787,-708510]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3499483L), (java.lang.Object) (-7962730000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1763460086), 504032);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-888840314066752L) + "'", long2 == (-888840314066752L));
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2301994), 171478518);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-394742519564892L) + "'", long2 == (-394742519564892L));
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1705, (java.lang.Object) 10049);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-112210783781272665L), (long) (-9999));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -112210783781272665 * -9999");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 18, (long) 532427871);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9583701678L + "'", long2 == 9583701678L);
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-97960));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-97960) + "'", int1 == (-97960));
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-164837960), (-288303652), 1761730);
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1763425054), (-211672136), 947642470);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1763425054 for hi! must be in the range [-211672136,947642470]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1761394973, 8123);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1761394973 * 8123");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 947642470, (-61432903466918L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-61431955824448L) + "'", long2 == (-61431955824448L));
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-11248L), 824172132L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 824160884L + "'", long2 == 824160884L);
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-9797));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9797 + "'", int1 == 9797);
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(7932691079037252L, (-1715160045));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 7932691079037252 * -1715160045");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 52672, (long) 12100448);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 637354797056");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2102400L), (long) (-3480228));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 7316831347200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(185867148);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-185867148) + "'", int1 == (-185867148));
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 149158, (-110929580820L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -16546034415949560");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 6015, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-729), (long) 8700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7971L + "'", long2 == 7971L);
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1794561));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1794561 + "'", int1 == 1794561);
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-16929382), (-84385200), (-1999662));
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(105975170);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-105975170) + "'", int1 == (-105975170));
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-204298726), 2248540);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-202050186) + "'", int2 == (-202050186));
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-954811), (-8209), 80635680);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1762675999, (-15951520), (-729));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(4043031, (-80));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-323442480) + "'", int2 == (-323442480));
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9788, 520, 9797, 19907100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10308 + "'", int4 == 10308);
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(9989, 2005438);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 9989 * 2005438");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(711148, (-1717685969));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 711148 * -1717685969");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(60336L, (long) (-48512377));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-48452041L) + "'", long2 == (-48452041L));
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-357591120), 1990810, 638821068);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -357591120 for  must be in the range [1990810,638821068]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1454874, 695393);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2150267 + "'", int2 == 2150267);
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 586810735);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 34386390);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34386390 + "'", int1 == 34386390);
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6142282650476246L), (java.lang.Object) (-61432903466918L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-310000L), 151226407392820942L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -310000 * 151226407392820942");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1718668813));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1718668813 + "'", int1 == 1718668813);
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-17802), (-78346), 2440438);
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(351);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-351) + "'", int1 == (-351));
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-18000), (-1942080), (-1762676017));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-47525247), 4476722);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43048525) + "'", int2 == (-43048525));
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1023872308938115L, (-1999671));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1023872308938115 * -1999671");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-9989), (long) (-853901));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 843912L + "'", long2 == 843912L);
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3996508940L, (long) (-1999662));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7991667059978280L) + "'", long2 == (-7991667059978280L));
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-708129348), (-944117276));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 668557151089416048L + "'", long2 == 668557151089416048L);
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-944117276L), (long) (-244802));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 231121797399352L + "'", long2 == 231121797399352L);
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-100459952), 374064183, (-709960));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-76433), 9875);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-66558) + "'", int2 == (-66558));
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(954811, (-23067514));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22112703) + "'", int2 == (-22112703));
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1967089), (-236129206), 2294400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1967089) + "'", int3 == (-1967089));
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-76433), 87426300);
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(339161818, (-100459952), (-35032), 62000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 686 + "'", int4 == 686);
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-18832302128L), (long) (-16919594));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 318634906091096032L + "'", long2 == 318634906091096032L);
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 304461011);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 8467, (java.lang.Object) 3480228);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-6564960), (-198112800), (-537804800));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2456901935445145L), (java.lang.Object) 19907100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-760147277873592L), (-18400));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -760147277873592 * -18400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1715156650, 9589215427000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1715156650 * 9589215427000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 43296, (-1023872306279138L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023872306322434L + "'", long2 == 1023872306322434L);
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9798, 299785985);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 299795783 + "'", int2 == 299795783);
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 13584346, (long) (-1763460086));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1777044432L + "'", long2 == 1777044432L);
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1761078660), 0, 1117972070, (-816756018));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-351));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 351 + "'", int1 == 351);
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(669L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 669 + "'", int1 == 669);
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2110080), 1788088016);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2110080 * 1788088016");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 3499569, (-756956063145646L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3499569 * -756956063145646");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1450647, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-97405), 349956900, 14308);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -97405 for  must be in the range [349956900,14308]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9691, 12100448);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 117265441568L + "'", long2 == 117265441568L);
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-450683), 30906162, (-628056570));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 524160, (-288303652), (-106462890));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-160197868720494L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) 0, 601423);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-153251), (-273471229583899974L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -153251 * -273471229583899974");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(586809815, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2005438);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2005438) + "'", int1 == (-2005438));
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(240395216033566L, (long) (-100460641));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 240395115572925L + "'", long2 == 240395115572925L);
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 399618, (-55318085468145L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 399618 * -55318085468145");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-99440784), (-3509649));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-102950433) + "'", int2 == (-102950433));
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1990388));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1990388 + "'", int1 == 1990388);
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-18980207));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18980207 + "'", int1 == 18980207);
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3611760, (-30), 100449343, (-15961217));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-30352410), (-16929382), (-1755570876));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-942883156), (long) (-34386408));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-908496748L) + "'", long2 == (-908496748L));
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(176411200, 1370574);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 177781774 + "'", int2 == 177781774);
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-1710528757), (-1761479067));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [-1710528757,-1761479067]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2304264, 451, (-299785985), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-297481271) + "'", int4 == (-297481271));
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-97405));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97405 + "'", int1 == 97405);
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1762676017, 176411220, 3611760);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-129148057), (-2304264));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -129148057 * -2304264");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-300969892), (-16990520), (-221718630));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1121617, 5148, (-168572690));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1121617 for  must be in the range [5148,-168572690]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-950048943));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 950048943 + "'", int1 == 950048943);
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46831, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-300969900), (-812374164));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 244500170901663600L + "'", long2 == 244500170901663600L);
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3536656783091125616L, (-1967089));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3536656783091125616 * -1967089");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-34386307L), (java.lang.Object) 3244012L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-102737953872L), (java.lang.Object) (-1710528757));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1, 577142280, (-601292683));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1 for  must be in the range [577142280,-601292683]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-942883156), (-1713170345), (-1450548));
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-300969900));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 300969900 + "'", int1 == 300969900);
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-441), 0, (-601292683));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -441 for hi! must be in the range [0,-601292683]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1765498096L, 166315521289630L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 166317286787726L + "'", long2 == 166317286787726L);
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-601292683), 105975160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -601292683 * 105975160");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 11862880);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11862880 + "'", int1 == 11862880);
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 100, (long) (-18980207));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1898020700L) + "'", long2 == (-1898020700L));
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 14428, (-87), 590309465);
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 445);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-445L) + "'", long2 == (-445L));
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-232883752), (-1788088016), 80);
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(873, (-9778));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8536194) + "'", int2 == (-8536194));
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 400795139, 493779, (-100188684));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-84432785L), (-3327897692226L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -84432785 * -3327897692226");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-257), (-323442480));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -257 * -323442480");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-221718630), 634, 0, (-301848066));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 15172184880L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1028141521L), (long) (-4710915));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4843487313401715");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-47620), 48456411318684583L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48456411318636963L + "'", long2 == 48456411318636963L);
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3480228, (long) 503932);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1753798256496L + "'", long2 == 1753798256496L);
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-450), 339161818);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -450 * 339161818");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2304264L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2304264) + "'", int1 == (-2304264));
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-106412324), (java.lang.Object) (-4665));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-300969892));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 300969892 + "'", int1 == 300969892);
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1710528757), (long) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -13684230056");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-323442480));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-323442480) + "'", int1 == (-323442480));
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-2582129));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2582129) + "'", int1 == (-2582129));
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-10100), (-2304264), 709790, 34386308);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31362155 + "'", int4 == 31362155);
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2065033, 9875);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2074908 + "'", int2 == 2074908);
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(449475895, 34875834);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 449475895 * 34875834");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(609053028);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-609053028) + "'", int1 == (-609053028));
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(11, 0, (-3509649), 7451);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-592169827), (java.lang.Object) (-12999571302859200L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(4479944L, (long) (-601337));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5081281L + "'", long2 == 5081281L);
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-816756018), (java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(105840302930257433L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 105840302930257433");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 10100, 335272154, 302176499);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10100 for hi! must be in the range [335272154,302176499]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 479643L, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9798, 236129206, (-201));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 620L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-54920));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 54920 + "'", int1 == 54920);
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1010, 853932, (-2110080));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-22112703), 112110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -22112703 * 112110");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1144627548L), 99832172L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-114270654247874256L) + "'", long2 == (-114270654247874256L));
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-23067514), 3034108, 577142280);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 9864, (-291727565551190L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 291727565561054L + "'", long2 == 291727565561054L);
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(3461411L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3461411 + "'", int1 == 3461411);
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-586809815));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 586809815 + "'", int1 == 586809815);
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 212411343, (java.lang.Object) 53724488442210L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 46930, 1, (-816756018));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46930 for hi! must be in the range [1,-816756018]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-8683));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8683) + "'", int1 == (-8683));
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(4842131L, 87426300);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 423329597445300L + "'", long2 == 423329597445300L);
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 4476722, 913384904274010256L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-913384904269533534L) + "'", long2 == (-913384904269533534L));
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1450548), (-147666024L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 214196655781152");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-168491100L), (-132));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22240825200L + "'", long2 == 22240825200L);
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-206502800L), (-61432903456277L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61432696953477L + "'", long2 == 61432696953477L);
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9169, (-1990710));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1981541) + "'", int2 == (-1981541));
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(949417406, (-102950433), 100459953);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-67634529) + "'", int3 == (-67634529));
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-4485377));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4485377 + "'", int1 == 4485377);
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(350000, 0, (-351));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 48014510, 31508272, 709908);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 3499569, 68800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 240770347200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-68697), 949417406);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 949348709 + "'", int2 == 949348709);
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(335272154, (-300490249), (-10398), 711052);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 152257 + "'", int4 == 152257);
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 37948040, 239466083, (-4256334));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-942883156), 1761730, (-314));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1010L, (-33751711242L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34089228354420L) + "'", long2 == (-34089228354420L));
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(479553L, (-1491865899480L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1491865419927L) + "'", long2 == (-1491865419927L));
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 97, (java.lang.Object) 927286834339478L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-97), (int) (byte) 1, (-1967089));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-314), (-10221043));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(32482053, 19, (-598901407), 1117972070);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32482072 + "'", int4 == 32482072);
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(997290191287369L, 17887930641L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 997272303356728L + "'", long2 == 997272303356728L);
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-967528812442500L), (-1713170126));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -967528812442500 * -1713170126");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1185347686), (-451), (-173543841));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-709960), (-580601), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3244012L, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-106412530), (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3724438550L) + "'", long2 == (-3724438550L));
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-206502800L), (-1810285123L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 373828946697844400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1712671034), 2065028, (-4506));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 400795139);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3076404213829409432L), 494910);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3076404213829409432 * 494910");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-597509), 1530017442);
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10047, 970111, 0, (-634344346));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 711052);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 711052L + "'", long2 == 711052L);
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(111, 90, (-15961217));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-75571671168000L), 22759878);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -75571671168000 * 22759878");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(22199491L, (long) 1370574);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 30426045177834L + "'", long2 == 30426045177834L);
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(15345, 0, (-35032));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-9691), (-944117276), 296192052);
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-8700000), 8941480, 1786407669, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 1142, (-530216924), 8209);
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 629990222, (-43048525), 168544800);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 629990222 for  must be in the range [-43048525,168544800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5220530, (-190217798), 301848066, 976536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-16990520), (-211916938), 3611760, 299795783);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 67276566 + "'", int4 == 67276566);
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-687800606), (-1925124040), 335272134);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-687800606) + "'", int3 == (-687800606));
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(302176508);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-302176508) + "'", int1 == (-302176508));
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1715159045), (-1761078660));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9797, 9070);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18867 + "'", int2 == 18867);
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 896371846346457172L, (java.lang.Object) (-300551));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-171478832), (-3277662), (-1995555));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(10404838080000L, (-97146319L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 10404838080000 * -97146319");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 31508272, 3438639);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108345572921808L + "'", long2 == 108345572921808L);
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-349956635));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 349956635 + "'", int1 == 349956635);
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1794561), 479643, 1766929518, (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(96, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1056) + "'", int2 == (-1056));
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(101931854);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-101931854) + "'", int1 == (-101931854));
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1715159045), (-1715160045), (-412));
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-374064183));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 374064183 + "'", int1 == 374064183);
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(609053028L, (long) (-87426300));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 521626728L + "'", long2 == 521626728L);
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3496556L, (java.lang.Object) (-2456901935445342L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 349432740, (long) 4043031);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1412767400234940");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1766929518), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1766929518) + "'", int2 == (-1766929518));
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 168472090, (-8252422149000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 168472090 * -8252422149000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-677162), 80, (-848595844));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1695974308120618750L), (-1741976849728L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1695974308120618750 * -1741976849728");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 17287395, 16524, 669);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1505073, (-10001), 1715156650);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1505073 + "'", int3 == 1505073);
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3909, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3499553, (-760147122595992L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3499553 * -760147122595992");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-244597842500L), (long) 524160);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-244598366660L) + "'", long2 == (-244598366660L));
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(15651598500L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 15651598500");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 3461411, (-2599459800L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -8997798745777800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1530017442), (-23869018920L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22339001478L + "'", long2 == 22339001478L);
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1753701626), 37948040, (-25));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1753701626 for  must be in the range [37948040,-25]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-401679315779397770L), (-512632L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -401679315779397770 * -512632");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 100459953, 62, 99440784);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(302176508, 0, 711148);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 649332 + "'", int3 == 649332);
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3396800), (-1147540070), (-498646));
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1737870), (-316451466));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1737870 * -316451466");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 592, (-84385200));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [592,-84385200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(302176508, 300969900, 634);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-789), 0, (-2065033), (-944118497));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(48456411467159045L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-537804800), 711148, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3499650), (-954811), 99370817);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-174627162997L), (-687800606));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -174627162997 * -687800606");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-620), 301848066, 14227, (-1925124040));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-10047), (long) 185867227);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1867408029669");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2658977L, (java.lang.Object) 31362155);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 152286, (-14307), (-949417406));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-171478832));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-99370817), 176421201, 655);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-43296), (-6915));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [-43296,-6915]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-704619699), (-109132037444917766L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -704619699 * -109132037444917766");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 339161818, 20731669, (-6768000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-108685080), 17329373, (-708129348));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(872, 350, (-873812), (-3396800));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

