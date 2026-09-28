package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

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
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1528073662), 0, 1174365, 583633684);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 219304298 + "'", int4 == 219304298);
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-208569710), (-62086), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -208569710 for  must be in the range [-62086,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1753263, (long) (-193913417));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 195666680L + "'", long2 == 195666680L);
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(11398, 3337664);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3349062 + "'", int2 == 3349062);
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(61432696953477L, (long) 46322273);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 61432696953477 * 46322273");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(47525247, (-198112800), 199879);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-150787433) + "'", int3 == (-150787433));
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 586809815, (java.lang.Object) (-64096656225000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1763460000, (-1618160290106L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1763460000 * -1618160290106");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1108968198273600L, (long) (-350035111));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1108968548308711L + "'", long2 == 1108968548308711L);
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 1174573);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6350471609670L), (long) 132);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-838262252476440L) + "'", long2 == (-838262252476440L));
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(9762233596310000L, (long) 908660727);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9762232687649273L + "'", long2 == 9762232687649273L);
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-4652513355229353540L), (long) (-199359));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4652513355229353540 * -199359");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(47234L, (-34386408L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1624207595472");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-45783438), (-49522428));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-95305866) + "'", int2 == (-95305866));
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 590309465, 350035000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 206628973581275000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1761393376L, 896371846346457172L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 896371848107850548L + "'", long2 == 896371848107850548L);
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-41404775), 128814969);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87410194 + "'", int2 == 87410194);
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 807776505975780L, (java.lang.Object) 155277797L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-5740), (-2065033), 400795139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5740) + "'", int3 == (-5740));
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 90, (-524160), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 90 for hi! must be in the range [-524160,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-22));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-22) + "'", int1 == (-22));
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(35, (-1185347686), (-374064183), (-99990000));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-363125099) + "'", int4 == (-363125099));
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(926161, (-869115));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57046 + "'", int2 == 57046);
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-185867148));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 185867148 + "'", int1 == 185867148);
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 629990222, 202685432, 399618);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 629990222 for  must be in the range [202685432,399618]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1784800, (long) 539633);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1245167L + "'", long2 == 1245167L);
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-942883156), 947642470);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4759314 + "'", int2 == 4759314);
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(139392400854662760L, (-11767907424L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 139392400854662760 * -11767907424");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 954811000, 101931854, (-812374164));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 954811000 for  must be in the range [101931854,-812374164]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(586810735, (-2295252));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 584515483 + "'", int2 == 584515483);
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9123345, (-1761176514));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16067820943119330L) + "'", long2 == (-16067820943119330L));
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-970000), (-150787433), (-46851));
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(34969884374403777L, 212411343);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 34969884374403777 * 212411343");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 180882L, (java.lang.Object) (-15359825771300L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(17935449195L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-198112800), (-1766617203));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -198112800 * -1766617203");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(78821091321L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 78821091321");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-58976258072827L), 48456411318636963L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -58976258072827 * 48456411318636963");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(23038755894L, (long) (-577));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13293362150838L) + "'", long2 == (-13293362150838L));
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1649662), (-586809815), 600842000, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(20731669, (-8536194));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12195475 + "'", int2 == 12195475);
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1462491241L), (java.lang.Object) 106584691L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2582129), (-1530017442));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1532599571) + "'", int2 == (-1532599571));
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-704619699));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-497209), (-244802), 19907100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-3035028));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3035028 + "'", int1 == 3035028);
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 986060405, (long) (-911));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -898301028955");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 18980207, (java.lang.Object) 100963131);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 349956900, 843887, (-1686886240));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 349956900 for hi! must be in the range [843887,-1686886240]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 45976945);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2103102), (-1999672), (-1142));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2103102 for hi! must be in the range [-1999672,-1142]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(479643L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-121325387313600L), (long) (-29047620));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-121325416361220L) + "'", long2 == (-121325416361220L));
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3496556L, (-2529996136059146L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2529996139555702L + "'", long2 == 2529996139555702L);
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(201354638, (-2103102));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 199251536 + "'", int2 == 199251536);
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 207586242, (long) (-597509));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 206988733L + "'", long2 == 206988733L);
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(290872721443138160L, 4083552330L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 290872717359585830L + "'", long2 == 290872717359585830L);
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 336751238245786L, (java.lang.Object) (-708129449));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(576, (-1999671), (-1761176514));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(66947207, (-46322264), (-100459952), (-314527061));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-200015116), (-1119));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 223816914804L + "'", long2 == 223816914804L);
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 11862880, (-111849012), 115104);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11862880 for  must be in the range [-111849012,115104]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-13293362150838L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -13293362150838");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(600832203, (-17424));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 600814779 + "'", int2 == 600814779);
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 2440438, 310, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2440438 for  must be in the range [310,15]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-222718530), (-8332947), 18686280);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -222718530 for hi! must be in the range [-8332947,18686280]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 26626279399558L, (java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-15651849), (-204298726), 0);
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1738657, 0, (-349956635));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(1183824151547750L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1183824151547750");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(4043031, 230746822);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 4043031 * 230746822");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 339160985, 959334, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 339160985 for hi! must be in the range [959334,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-538255), (java.lang.Object) 100964278L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-65066), (long) 31285122);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2035597748052L) + "'", long2 == (-2035597748052L));
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(26511982, 47234, 199251536, (-301848066));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-4710915), 954811000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 950100085 + "'", int2 == 950100085);
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-853932), (-85342), 951502398);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 950733809 + "'", int3 == 950733809);
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10545454, (-1925124040), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(5758, 180346924);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 5758 * 180346924");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(18686280, 1786407669);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 18686280 * 1786407669");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-816756018), 0, (-171478832), 35000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-130700686) + "'", int4 == (-130700686));
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-89177173), 695393);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-88481780) + "'", int2 == (-88481780));
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1989648L), 440284L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1549364L) + "'", long2 == (-1549364L));
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(102843302071766L, (-47234));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4857700530057795244L) + "'", long2 == (-4857700530057795244L));
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5220579, (-106394130), 12487942);
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 12487942);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12487942 + "'", int1 == 12487942);
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-169871L), 3509768L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3339897L + "'", long2 == 3339897L);
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2658977, (-68277286));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-65618309) + "'", int2 == (-65618309));
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-6564960), 10497554);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3932594 + "'", int2 == 3932594);
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 352818223);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-352818223L) + "'", long2 == (-352818223L));
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-523), 479643, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(949417406, 420358630);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 949417406 * 420358630");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(17423, (-4665), (-549));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3162) + "'", int3 == (-3162));
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9875, 48014510);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 474143286250L + "'", long2 == 474143286250L);
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1785587), (-1974990));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3760577) + "'", int2 == (-3760577));
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(970111L, (-84506912257482L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 970111 * -84506912257482");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1715156650), 42307341, 1715159045);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1630546760 + "'", int3 == 1630546760);
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-302176508), (-173543860), 801902322);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(64244, (-1), (-212411343), (-3499650));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-208847451) + "'", int4 == (-208847451));
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(14428, (-66665530));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 14428 * -66665530");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1786407669, (-2987409));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1786407669 * -2987409");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(185877195, 60336);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 185937531 + "'", int2 == 185937531);
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1255055775887355204L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 129926115);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 129926115 + "'", int1 == 129926115);
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-5802204807995135L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5802204807995135");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 21064, (-4506), (-167335));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21064 for  must be in the range [-4506,-167335]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-34386307L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34386307) + "'", int1 == (-34386307));
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1715696283), (-100459953));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1715696283 * -100459953");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(35, (-18000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17965) + "'", int2 == (-17965));
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1025206), 789, 2074908);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-166558919), (-6564960), 1185347686);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1025353728 + "'", int3 == 1025353728);
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-813548518L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-813548518) + "'", int1 == (-813548518));
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2110080, 11);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23210880L + "'", long2 == 23210880L);
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-970111), 1185347686, 168504917);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(952907498, (-201), 3652836);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3117618 + "'", int3 == 3117618);
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-156879), 198112800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 197955921 + "'", int2 == 197955921);
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(144581126778895500L, (long) 533310184);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 144581126778895500 * 533310184");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-950048943), 1491868123022L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -950048943 * 1491868123022");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(3909, (-537804800), (-951492298));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(487551322, (-577));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 487551322 * -577");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-103647573), (-198112800), 8941480);
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2284741);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2284741) + "'", int1 == (-2284741));
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 7451, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-40322560));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 48321945, (-3532739400000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3532787721945L + "'", long2 == 3532787721945L);
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 99835728, 52, (-136724));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(34385857, 157773616);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 192159473 + "'", int2 == 192159473);
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(582328281600L, (long) (-1715149542));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 582328281600 * -1715149542");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 101009154, (long) (-17864));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1804427527056");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1943780, 152286, 24429098, (-576));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 100449343);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2078227400), (java.lang.Object) 126482100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(60617119500000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 60617119500000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-79), (-47524559L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-47524638L) + "'", long2 == (-47524638L));
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(635218511, 14308, 9989);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(92459640L, (long) (-2288107));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 94747747L + "'", long2 == 94747747L);
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-60437), 168579832);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10188459306584L) + "'", long2 == (-10188459306584L));
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(299785985, 4710915);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 299785985 * 4710915");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2582129), (-827878), (-468), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-377) + "'", int4 == (-377));
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 177664191, 715471229, (-1711678817));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-188790000), (long) 1762676017);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-332775605249430000L) + "'", long2 == (-332775605249430000L));
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(249426407, (-1454874));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 247971533 + "'", int2 == 247971533);
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-105840301098685982L), 1677066125837579400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1782906426936265382L) + "'", long2 == (-1782906426936265382L));
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-349956067), 40322560, (-1715697100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 149767755, 711148, (-67250068));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 149767755 for hi! must be in the range [711148,-67250068]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-14307), (long) (-130700686));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 130686379L + "'", long2 == 130686379L);
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-16805452L), 86563075L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-103368527L) + "'", long2 == (-103368527L));
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 173543841, 997272303356728L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 173543841 * 997272303356728");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 635218511, 96, (-10047));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-100459953), (-86));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1989524), (java.lang.Object) (-21191523080L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 34386408, (-66558), (-47620));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34386408 for  must be in the range [-66558,-47620]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-1890034360821320L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-122484040), (-100490000), 128814969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 106820930 + "'", int3 == 106820930);
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 14428, 1737870);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [14428,1737870]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-96));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-96) + "'", int1 == (-96));
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1786407669, 18867);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1786407669 * 18867");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2582129));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2582129 + "'", int1 == 2582129);
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-551461), 9875, (-157922));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1010, (-48512377));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-48997500770L) + "'", long2 == (-48997500770L));
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 37948040, (long) (-37243837));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 75191877L + "'", long2 == 75191877L);
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 326128844, (java.lang.Object) 3491750L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-169916106));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 169916106 + "'", int1 == 169916106);
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 339160985, 47967680L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16268765596964800L + "'", long2 == 16268765596964800L);
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-187954262), (-34386307L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6463052955090434");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-521191424), (long) 1785587);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -930632631205888");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 1786633493);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 240395115572925L, (java.lang.Object) 85229052);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(988966297330L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 988966297330");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1711678817, 324783680L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2036462497L + "'", long2 == 2036462497L);
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-626882108), (-67634529), (-729976520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 259940595, 1454524, (-1766617203));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3001260454776L), 843887);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2532724681399554312L) + "'", long2 == (-2532724681399554312L));
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-401679315779397770L), (-190043702986380L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -401679315779397770 * -190043702986380");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1234120), (-399618));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 493176566160L + "'", long2 == 493176566160L);
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1234120, (-2304106), (-297481271));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(57431568324L, (long) 2582129);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57434150453L + "'", long2 == 57434150453L);
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 528938295, (-416614049L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 112324246L + "'", long2 == 112324246L);
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(8259371599815000L, (-39585000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 8259371599815000 * -39585000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-729976520), 48321945, 11862880);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-952557498));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-952557498) + "'", int1 == (-952557498));
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 451, (-708129449), 1737870);
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-14428), 43048525, (-204298726), 10497554);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-171762184) + "'", int4 == (-171762184));
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1505073, (java.lang.Object) 1139);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-300969892), (-1761730), 868, 1482832281);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1180099792 + "'", int4 == 1180099792);
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1508037, 0, 959344);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 62000, 49, 197);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-244802), 1111, 192159473, (-4485355));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 157773616, 98640, 1630546760);
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 64244, (-186412), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 64244 for  must be in the range [-186412,10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1838776), (-67634529));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-69473305) + "'", int2 == (-69473305));
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1942080), (long) 52357656);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -101682756564480");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 257397490L, (java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 159779046, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-159247253), 17423);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -159247253 * 17423");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-38868600), (-89), (-15805100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3496505L, (-131986800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-461492506134000L) + "'", long2 == (-461492506134000L));
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5434716000L), 5081281L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27615319151196000L) + "'", long2 == (-27615319151196000L));
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-711052), 1023876541100647L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -711052 * 1023876541100647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-9999), 197955921, 285842568);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(107222400L, (long) 27);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 107222373L + "'", long2 == 107222373L);
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 21963942, (-108685080));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) ' ', 2536427, 85342);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 586810735, (-52), (-7889211));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(709908, (-82215000), 503932, 2065033);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1233314 + "'", int4 == 1233314);
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-110929581440L), (java.lang.Object) 2983768024077089L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-168491100L), 163299L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27514428138900L) + "'", long2 == (-27514428138900L));
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-441), 350);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-91) + "'", int2 == (-91));
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-112210783781272665L), 106394130L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -112210783781272665 * 106394130");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 47525247, 8941480, (-317147951));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-47610286), 649332, (-18000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-53553755), (-4256334), 100963131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51665711 + "'", int3 == 51665711);
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2294419), (-48512377), 31285122);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2294419) + "'", int3 == (-2294419));
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (-210L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 210L + "'", long2 == 210L);
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 41511168L, (java.lang.Object) (-18));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1117990796L), 27L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -30185751492");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 533304932, (-188114696), (-349957368));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1620, (-47620));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-77144400) + "'", int2 == (-77144400));
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1126887300, (-949427270), (-204298726));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-363369790) + "'", int3 == (-363369790));
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 3398104);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3398104 + "'", int1 == 3398104);
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2078227400), 1174365);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2077053035) + "'", int2 == (-2077053035));
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1786407669), 219899, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-310), 20, (-22112703));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1766617203), (-1802640000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1766617203 * -1802640000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(260436456472903200L, (long) 14747244);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 260436456458155956L + "'", long2 == 260436456458155956L);
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(204621149, (-129224490), (-106412530), 53248);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-31069120) + "'", int4 == (-31069120));
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(7102785476L, (long) 890891138);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7993676614L + "'", long2 == 7993676614L);
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 352818223, (-523), 949426390);
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8700000), (-214050));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1862235000000L + "'", long2 == 1862235000000L);
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(16524, 9070, 204685393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16524 + "'", int3 == 16524);
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-201), (-47620), 2111643072, 4909);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(102098278L, (-159355803655506150L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 102098278 * -159355803655506150");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 4240387, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4240387L + "'", long2 == 4240387L);
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(53724488442210L, (long) (-1563864028));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53726052306238L + "'", long2 == 53726052306238L);
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-151658034872L), (-2088424857434370L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -151658034872 * -2088424857434370");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 1, (-57378098), 155279264);
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1715697100, 149767755, (-9719), 649332);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 347695 + "'", int4 == 347695);
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(498646, (-299552));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 498646 * -299552");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-91));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 91L + "'", long2 == 91L);
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 528938295, (-896371847163213190L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-896371846634274895L) + "'", long2 == (-896371846634274895L));
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(20, 46920);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46940 + "'", int2 == 46940);
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 131567583380400L, (java.lang.Object) 339160985L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-4761114), 22199491, (-489444), 9553);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-26553) + "'", int4 == (-26553));
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-99375055L), (-732190580753198L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 732190481378143L + "'", long2 == 732190481378143L);
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1174462, (-132), 344919305, (-592));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 99, (-299785985));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 99684041);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1725430130L, (long) (-129279438));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -223062637514666940");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(688309020, 2294400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 690603420 + "'", int2 == 690603420);
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(7664124L, (-349957368));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2682116663065632L) + "'", long2 == (-2682116663065632L));
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-53248), (-153268L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 8161214464");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(169182050, (-65618309), 34386308);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-30827186) + "'", int3 == (-30827186));
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-341736148L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-341736148L) + "'", long2 == (-341736148L));
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1938372), 9797, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1938372 for hi! must be in the range [9797,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-173612538), 950100085, (-185867227));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(66947207, 539633);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 66947207 * 539633");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-515974));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 3349062);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3349062 + "'", int1 == 3349062);
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1106816), (-1761112650), (-57378098));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-312315), 232883752, (-1010899));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-150173177138L), 1762676017);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -150173177138 * 1762676017");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-582302736L), (long) (-102950433));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-479352303L) + "'", long2 == (-479352303L));
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(4479918, 954811);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 4479918 * 954811");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(4083552330L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4083552330");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 71700, 583633684, 590309465);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 71700 for hi! must be in the range [583633684,590309465]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 39341073, (long) (-166558919));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6552606591180087");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-329330765), (-951492297), 1762675999);
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 107336979, 19907100, 69748100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 107336979 for  must be in the range [19907100,69748100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(192159473, 600842000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 192159473 * 600842000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 14307, (-1713170126));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-24510324992682L) + "'", long2 == (-24510324992682L));
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1692170940, (-85342), (-249426407));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(353600846);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-353600846) + "'", int1 == (-353600846));
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1482832281);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1482832281) + "'", int1 == (-1482832281));
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 587204001);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-171762184), (-1713254), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-9778));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9778 + "'", int1 == 9778);
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 12100448, (-193913417), 1802640000);
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-188112985), (-767454452), (-353600846));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2111643072), (long) (-1686886240));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3562101641948129280L + "'", long2 == 3562101641948129280L);
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 629990222, (-190217798), (-502));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 629990222 for hi! must be in the range [-190217798,-502]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3664729527270480L), 533310184);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3664729527270480 * 533310184");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 171469054, 5, (-210559234));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(99835728, (-100459953), (-729976520));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(221244466068L, (long) (-67634529));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 221244466068 * -67634529");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1802640000, 4043031, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(30906162L, (-350035111));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10818241846253982L) + "'", long2 == (-10818241846253982L));
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 19, 52, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 709790, (-6983102989863L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6983102280073L) + "'", long2 == (-6983102280073L));
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(107336979, 300979678, (-951493178), 96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-543176618) + "'", int4 == (-543176618));
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1712594601, (-1491865900688L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1712594601 * -1491865900688");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 199359, 152257, 1324326);
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-349957368), 126482100, (-32348768), (-350035111));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 2005438, (-445L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005883L + "'", long2 == 2005883L);
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(711052, (-200015116));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-199304064) + "'", int2 == (-199304064));
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(450, 711148, 1943430, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-300551), (-4580870), 45091);
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-640941), (-66665530), 1910207);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-640941) + "'", int3 == (-640941));
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-954811000), (long) (-451));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-954811451L) + "'", long2 == (-954811451L));
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-25), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1715698242, 3509649, 257572119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 191323416 + "'", int3 == 191323416);
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-153251));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-153251) + "'", int1 == (-153251));
    }

    @Test
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-167335));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 167335 + "'", int1 == 167335);
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 447963412451930L, (java.lang.Object) 1990710L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-909846561072878L), 549);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-499505762029010022L) + "'", long2 == (-499505762029010022L));
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(54920);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-54920) + "'", int1 == (-54920));
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1528073662), 1492005, 531793, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 352818223, (java.lang.Object) 117217427058L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-44735852), (-18000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44753852) + "'", int2 == (-44753852));
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1943430), (-298964462), 192159473);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1943430) + "'", int3 == (-1943430));
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(177664191);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-177664191) + "'", int1 == (-177664191));
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-7014485612706255950L), (java.lang.Object) 1491865899490L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-326227937093079000L), 231190314);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -326227937093079000 * 231190314");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-363125099), (-173612538));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -363125099 * -173612538");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(8665465796034198L, 172893415187088L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 8665465796034198 * 172893415187088");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-927286817838000L), 2248540);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -927286817838000 * 2248540");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 420368508, (-1925124040), (-450684));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-204685393), (-164837960), (-1838776));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -204685393 for hi! must be in the range [-164837960,-1838776]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-298735764L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 219304298, 3517500094266600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 219304298 * 3517500094266600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(4, 80635680);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80635684 + "'", int2 == 80635684);
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-841625754L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-908496748L), 1174573);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1067095750788604L) + "'", long2 == (-1067095750788604L));
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1481377506, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(400795139);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-400795139) + "'", int1 == (-400795139));
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 39341073, (-1482832281));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-58336213013577513L) + "'", long2 == (-58336213013577513L));
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 198112800, (long) (-412));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 198112388L + "'", long2 == 198112388L);
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-633115409), 76279426);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-556835983) + "'", int2 == (-556835983));
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-299931L), (-9719L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-290212L) + "'", long2 == (-290212L));
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(48321945, 1712594601, (-2078227400), 69748100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-386075249) + "'", int4 == (-386075249));
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1686886240), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2078213173), 1761394244, (-1024844251));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-203626876L), 126482100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-330108976L) + "'", long2 == (-330108976L));
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-497209));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 497209 + "'", int1 == 497209);
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 339161818, (-949417406), (-2304106));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-607951483) + "'", int4 == (-607951483));
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(769351440L, (-2208289L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1698950322086160");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-704792495));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-704792495) + "'", int1 == (-704792495));
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-201), (-85342), 168573390, (-2112178));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-8002818715384005L), (-48512377));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -8002818715384005 * -48512377");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1423185088314780L, (java.lang.Object) (-222718530));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-767464499), 106820930);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-81981271525164070L) + "'", long2 == (-81981271525164070L));
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(22632004046400L, 258662);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5854039430649916800L + "'", long2 == 5854039430649916800L);
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 9788, 9762233596310000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9762233596300212L) + "'", long2 == (-9762233596300212L));
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(489951, 66534, (-1717685969), 954811000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1621913841) + "'", int4 == (-1621913841));
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(349879109L, 167756399L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 517635508L + "'", long2 == 517635508L);
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3509768L, (long) (-132));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-463289376) + "'", int2 == (-463289376));
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2222074195L), 304469091L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-676552910286206745L) + "'", long2 == (-676552910286206745L));
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(489951, (-944118497));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 489951 * -944118497");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 167756399L, (java.lang.Object) (-403568L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1597671, (-1712671034), 7735307);
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-357544679), (long) 835739);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-356708940L) + "'", long2 == (-356708940L));
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-363369790), 32482053, 39341073);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -363369790 for  must be in the range [32482053,39341073]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-25801760L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-25801760) + "'", int1 == (-25801760));
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 942883156, 577142280, (-8332947));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 942883156 for  must be in the range [577142280,-8332947]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 234356, 1838776);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-704619699), (-108109069), 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1802640001, (-2304106), 9999);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2311731921440455L), (-11269L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2311731921451724L) + "'", long2 == (-2311731921451724L));
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 812374164, (-67634529));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-54944543953908756L) + "'", long2 == (-54944543953908756L));
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 201, 451, 80635680);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2295252), (-150173177138L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 344685285172348776L + "'", long2 == 344685285172348776L);
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(11, (-412), (-87426300), 949348709);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-401) + "'", int4 == (-401));
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1715159045, (long) 13393);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 22971125089685");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(633115409, 531793);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 633647202 + "'", int2 == 633647202);
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(585912, 2005430);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2591342 + "'", int2 == 2591342);
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-299823236L), 741303085269371688L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -299823236 * 741303085269371688");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-24510324992682L), (-1715159124));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -24510324992682 * -1715159124");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-939637516), (-210559234), (-951493178));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-105975170), 76279426, (-88481780));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5203027), 0, 686, 926161);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 349829 + "'", int4 == 349829);
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-108685080), 25311043);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-83374037) + "'", int2 == (-83374037));
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1221, (long) (-7862735));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -9600399435");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(47986684L, 2248228L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 107885006595952");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10, 9, (-556835983));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3045000), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3045000) + "'", int2 == (-3045000));
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-34386307), 1505073, 3398104);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -34386307 for hi! must be in the range [1505073,3398104]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 73381944, (java.lang.Object) 1990810);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-882074L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 247971533, (-164261393856L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 247971533 * -164261393856");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1765498096L, (long) (-489951));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1765988047L + "'", long2 == 1765988047L);
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3760577), (-10049), (-299315787), (-1989861));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3770626) + "'", int4 == (-3770626));
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 0, (int) '4');
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1705));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1705) + "'", int1 == (-1705));
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 95336384);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-100459952), (-234356), (-64244), (-954536506));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-332775605249430000L), (java.lang.Object) (-82215000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1838776, (-489444), 1686886240);
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-16067820943119330L), 3126427212L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16067817816692118L) + "'", long2 == (-16067817816692118L));
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1755920876), 1481377506, (-1715159045));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1482832281), (java.lang.Object) (-198112800));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(4637904, (-812374164), 14227, 9999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 219899, 5148, 1945308);
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(629990222, 296189014);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 926179236 + "'", int2 == 926179236);
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-8990), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8990) + "'", int2 == (-8990));
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2304106, (-300969900), (-16103806));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 52357656, (-95285272860744L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-95285220503088L) + "'", long2 == (-95285220503088L));
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3483304, 638821068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3483304 * 638821068");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(533301015, (-8332947), 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10985) + "'", int3 == (-10985));
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(121054052L, 1061007010754880L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1061007131808932L + "'", long2 == 1061007131808932L);
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-9169), (-300551), 1788087917);
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1989861), (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1989866) + "'", int2 == (-1989866));
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 3038, (long) 176421201);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 535967608638");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 185867148, (-100188239));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18621702246072372L) + "'", long2 == (-18621702246072372L));
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-489951), 826237160L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-404815722779160L) + "'", long2 == (-404815722779160L));
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1967089));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1967089 + "'", int1 == 1967089);
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 302176499, 949417406, (-468));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(297515510254075L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 297515510254075");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-882074L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-882074) + "'", int1 == (-882074));
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-89), (-48139530));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4284418170L + "'", long2 == 4284418170L);
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3461473L, (-2607624158878330L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2607624155416857L) + "'", long2 == (-2607624155416857L));
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 350034159);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 350034159 + "'", int1 == 350034159);
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-8536194), (-587951), (-3499650));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5252), (-100963131), (-451), 176411220);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 75443289 + "'", int4 == 75443289);
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(13, 10, (-450));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2658977, (-312315));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2346662 + "'", int2 == 2346662);
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-19), 9864, 951372194, (-149158));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-595172454895665012L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-441074950995328L), (long) 1943430);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -441074950995328 * 1943430");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-524160), 853932);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 329772 + "'", int2 == 329772);
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1463930951L), 779L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1140402210829L) + "'", long2 == (-1140402210829L));
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 169182050, (-100188684), 100962303);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 169182050 for hi! must be in the range [-100188684,100962303]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-22177769L), (-301838202));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6694097919331338L + "'", long2 == 6694097919331338L);
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1528073662), (-1898020700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 369947038L + "'", long2 == 369947038L);
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-32), 374245, (-47610286));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-47610286));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47610286 + "'", int1 == 47610286);
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(5971014243592524L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5971014243592524");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9798, 709960);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6956188080L + "'", long2 == 6956188080L);
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-308759394), 8700);
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 67276566, 315638545L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 21235077404836470");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(669, 100963445, 801902322, (-1649662));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 115104, (-3396800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-390985267200L) + "'", long2 == (-390985267200L));
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(911, (-503932), 159779046, 655);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1711);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1711) + "'", int1 == (-1711));
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2336523L), (-1616447619072L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3776867040256966656L + "'", long2 == 3776867040256966656L);
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-709292L), (-326227937093079000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -709292 * -326227937093079000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-9948500L), (java.lang.Object) (-489444L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(13238313787314L, 10018356553040L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3219957234274L + "'", long2 == 3219957234274L);
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-316040549803L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-316040549803L) + "'", long2 == (-316040549803L));
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-999900));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-999900) + "'", int1 == (-999900));
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(526667328L, (long) 950733809);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477401137L + "'", long2 == 1477401137L);
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(27898616, 299795783, 640810929);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 368913763 + "'", int3 == 368913763);
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-87426300), (-1147540070), (-81725049));
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 95781, 4479760, (-1988776));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1454524), 2005430, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 167335, 1715698242, (-155277600));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 167335 for  must be in the range [1715698242,-155277600]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1712671034), (-115104), (-200015116));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-53318417));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 60336, 808191813, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-688), (long) (-10047));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6912336L + "'", long2 == 6912336L);
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 204685393, (-3996518737L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3791833344L) + "'", long2 == (-3791833344L));
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(83836111906170L, 3536656467292573245L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3536572631180667075L) + "'", long2 == (-3536572631180667075L));
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-129279438), (-3396800), (-399618), 168573390);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36296771 + "'", int4 == 36296771);
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-869115), (-1989648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2858763) + "'", int2 == (-2858763));
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-164838092), (-1277533), (-95305866));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-377), (-66558), 1665447152);
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-115104), (-1845979L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1961083L) + "'", long2 == (-1961083L));
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-121655424L), (long) (-863620));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-122519044L) + "'", long2 == (-122519044L));
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-1450647), (-16929382), 73710);
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1454523), 709790L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1032405880170");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 949427270, (long) (-2294419));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2178383967406130");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-601337), (-1010L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-600327L) + "'", long2 == (-600327L));
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-153066), (-635218511), 0);
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1741976849728L), (-55318085468145L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-57060062317873L) + "'", long2 == (-57060062317873L));
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2301994), (-214173761));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2301994 * -214173761");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 15, 153428, (-53553755));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2103102), (-441795816L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 929141664221232L + "'", long2 == 929141664221232L);
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-3509649), 351655538, (-22112703));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3509649 for  must be in the range [351655538,-22112703]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 52, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-57378098), (-10985));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-634344346), 1910207, (-709901), (-6915));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-448826) + "'", int4 == (-448826));
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(53816, (-69473305), (-1761079449));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3337664, 489444);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1633599618816L + "'", long2 == 1633599618816L);
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-789467264), (-2005438), 66558);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 37948040, (-951502398), 576693690);
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-210));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 210 + "'", int1 == 210);
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-22112703), 601423, (-249426407));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -22112703 for  must be in the range [601423,-249426407]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 299315787, 7, 1692170940);
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 600814779, (-511785248));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-307488140672580192L) + "'", long2 == (-307488140672580192L));
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 353600846, (-489444), 4074452);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 353600846 for hi! must be in the range [-489444,4074452]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1722847825104L, 1590095446380L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 132752378724L + "'", long2 == 132752378724L);
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (byte) 100, (long) 920);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92000 + "'", int2 == 92000);
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 62, 5807908034418378L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5807908034418440L + "'", long2 == 5807908034418440L);
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 2820975, 302176508, (-91));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2820975 for  must be in the range [302176508,-91]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1711678817, (long) (-543176618));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2254855435L + "'", long2 == 2254855435L);
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(129926115, (-537804800), 335272134);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 129926115 + "'", int3 == 129926115);
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(180882L, 1980223L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2161105L + "'", long2 == 2161105L);
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-538255), (-323521822L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 322983567L + "'", long2 == 322983567L);
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44L) + "'", long2 == (-44L));
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1196082674834130L, 447963412451930L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1644046087286060L + "'", long2 == 1644046087286060L);
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(688, 5148, 5220530, 94401367);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 89186674 + "'", int4 == 89186674);
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 5065060L, (java.lang.Object) (-153066));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-122519044L), (java.lang.Object) (-48950451));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2150167L, 826237160L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 828387327L + "'", long2 == 828387327L);
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(350035111, 4485377);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 354520488 + "'", int2 == 354520488);
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(4480369, (-939637516));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-935157147) + "'", int2 == (-935157147));
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(350034159L, 1450732L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 351484891L + "'", long2 == 351484891L);
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-511785248), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-102950433), (-711052), (-211916938), 15345);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-103661485) + "'", int4 == (-103661485));
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(959334, 34875834, (-105975170), (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-70140002) + "'", int4 == (-70140002));
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1761079449));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1761079449) + "'", int1 == (-1761079449));
    }
}

