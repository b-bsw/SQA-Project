package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1454523), (-882000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2336523L) + "'", long2 == (-2336523L));
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(351, 2284622);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 801902322 + "'", int2 == 801902322);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-97970), 46831, 532426752);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 532281952 + "'", int3 == 532281952);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-8700000), 9864);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6138000L), (-729L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6138729L) + "'", long2 == (-6138729L));
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6959097919711L), 6015L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6959097913696L) + "'", long2 == (-6959097913696L));
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1989700, (-1715160045));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1713170345) + "'", int2 == (-1713170345));
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-949427270), (-198112800));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1147540070) + "'", int2 == (-1147540070));
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 620, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 620 for hi! must be in the range [0,32]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3075697651L, (java.lang.Object) (-489444L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-5434716000000L), (long) 833);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5434715999167L) + "'", long2 == (-5434715999167L));
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-15951520));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15951520) + "'", int1 == (-15951520));
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 171469054, (long) 1117972070);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 191697613241321780L + "'", long2 == 191697613241321780L);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-268883609400L), (-315818774104L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46935164704L + "'", long2 == 46935164704L);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-51), 111, 1010, 1990810);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1989861 + "'", int4 == 1989861);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(9589215427000L, (-3996339497L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 9589215427000 * -3996339497");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1989700), (-503932), (-6915));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-498646) + "'", int3 == (-498646));
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-7633), (-789));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6022437L + "'", long2 == 6022437L);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-728), 46930, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-76533), (-1174462), 576);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-728), 709901, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-61432903456869L), (long) (-10049));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-61432903466918L) + "'", long2 == (-61432903466918L));
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1802640000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1802640000 + "'", int1 == 1802640000);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9169, (long) 351655538);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3224329627922L + "'", long2 == 3224329627922L);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 47525247, (-132), 688);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 0, (-62000), 870);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9875, (-1174462), (-86));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 874263, (long) (-789));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-689793507L) + "'", long2 == (-689793507L));
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(13, (-5), (-84385200), 630000000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3496505L, (long) (-9700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33916098500L) + "'", long2 == (-33916098500L));
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(420386456, (-349956900), 9788, (-188790000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-204677760), (-87), 2294400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-17935456080L), (long) (-86130));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17935542210L) + "'", long2 == (-17935542210L));
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-3996509288L), 63702620L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4060211908L) + "'", long2 == (-4060211908L));
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-7962730000L), (long) (-3398104));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 27058184663920000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(46930, (-1785587));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1738657) + "'", int2 == (-1738657));
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 504032, (long) 350);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176411200 + "'", int2 == 176411200);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3053499302L, (-69484049307216L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3053499302 * -69484049307216");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-6138729L), (long) 1788088016);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -10976587758371664");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 629990222);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 56611, 4000008832L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 226444499988352");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) -1, (-14307));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14308) + "'", int2 == (-14308));
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-489444), 95781, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1763460086), (-1763460086));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1763460086 * -1763460086");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(24429098, 62000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 24429098 * 62000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 155279264);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 155279264 + "'", int1 == 155279264);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-33916098500L), 874263L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33916972763L) + "'", long2 == (-33916972763L));
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(10100L, 10398);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105019800L + "'", long2 == 105019800L);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-14307), 158);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14149) + "'", int2 == (-14149));
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1), (-210));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 210 + "'", int2 == 210);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1000, 111, 10000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-970111L), 339458290L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-329312221170190L) + "'", long2 == (-329312221170190L));
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-27), (-6915), (-17899));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(198112800, 9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 115104, (-1763460086), 257397490);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1989861);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1989861) + "'", int1 == (-1989861));
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) -1, (-1788088016), (-2065028));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(197L, (long) (-155277600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 155277797L + "'", long2 == 155277797L);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 709908, (-204677760), (-3480228));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(90L, 2658977L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2658887L) + "'", long2 == (-2658887L));
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-300969900), 20, 1788088016);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 18000, 10000, 833);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1989700), 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1989687) + "'", int2 == (-1989687));
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(106575000, 949427270);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 106575000 * 949427270");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(132, 19, 168544800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 132 + "'", int3 == 132);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-89), (-18), (-300551));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9589215427000L, 507005);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4861780167566135000L + "'", long2 == 4861780167566135000L);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 78821101293L, (java.lang.Object) 126482100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2658887L), (-300969900));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 800244954501300L + "'", long2 == 800244954501300L);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 168544800, 5148, (-1989861));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 5148, 198109764L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 198114912L + "'", long2 == 198114912L);
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2284512L), (-220968810L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 218684298L + "'", long2 == 218684298L);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1999671), (-6915), (-9999), (-688));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4506) + "'", int4 == (-4506));
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-62000), (-86), (-580601), (-688));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-62086) + "'", int4 == (-62086));
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) '#', 841, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for  must be in the range [841,5]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 100459953, (-3038), (-106575000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100459953 for  must be in the range [-3038,-106575000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5, (-1989700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9948500L) + "'", long2 == (-9948500L));
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(198112800, 100, 1664, (-51));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 100, 350);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 450 + "'", int2 == 450);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2161648995684L), (long) (-1763460086));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2159885535598L) + "'", long2 == (-2159885535598L));
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1000), 19907100, (-349946851), (-27));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-330040725) + "'", int4 == (-330040725));
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-198122588L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-198122588L) + "'", long2 == (-198122588L));
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1119, (java.lang.Object) 1943780);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-80), 874263, 9169);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-147147648399672000L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 155277600, 27, (-1285742));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 100, (-61432903456869L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6143290345686900L) + "'", long2 == (-6143290345686900L));
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 62000, (int) ' ', 2294400);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1989861, (java.lang.Object) (-617272946947079546L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-880), (-15951520));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15952400) + "'", int2 == (-15952400));
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(520, (-317147951), (-1763425054));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(35, 10000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 350000 + "'", int2 == 350000);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-592));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-592) + "'", int1 == (-592));
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(350035111);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-350035111) + "'", int1 == (-350035111));
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(4476722, (-244802));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4231920 + "'", int2 == 4231920);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1142, 111, 16524);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9788, 157773616, (-62086));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-951492298), (-10100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-951502398) + "'", int2 == (-951502398));
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3480386), (long) (-843852));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2936930686872L + "'", long2 == 2936930686872L);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2065028), (-153066), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(668113251143498516L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 668113251143498516");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1450548), (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1450647) + "'", int2 == (-1450647));
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-9), (-1761479067), (-580601));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-87), 87, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-582302736L), (java.lang.Object) (-833426L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1010L), (java.lang.Object) (-1802640000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(399618, (-1761479067));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1761079449) + "'", int2 == (-1761079449));
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(198112800, 789, (-9788880));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3328133821432L), (long) (-1715160045));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3328133821432 * -1715160045");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 31508272, 0, 600832203);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1943430));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1943430 + "'", int1 == 1943430);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 9, 635218511, 577142280);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9 for hi! must be in the range [635218511,577142280]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 115104, 9972, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-951502398), 350035111, (-1989861));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -951502398 for  must be in the range [350035111,-1989861]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-3499569), 1010);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-592));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1402774760439L, (long) (-9788880));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1402774760439 * -9788880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-204677760), 83022336L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-121655424L) + "'", long2 == (-121655424L));
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1989687), 163L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1989524L) + "'", long2 == (-1989524L));
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-688), (-1989700));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1990388) + "'", int2 == (-1990388));
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-80), (long) (-1763425054));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 141074004320L + "'", long2 == 141074004320L);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1715696283), 970000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1715696283 * 970000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2284709, (-9719), (-1), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3514807760678400L), (long) 210);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-738109629742464000L) + "'", long2 == (-738109629742464000L));
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 176411200, 19, (-951492297));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(870, (-254849));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-221718630) + "'", int2 == (-221718630));
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1784800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1784800 + "'", int1 == 1784800);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(99835208L, (-3036L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99832172L + "'", long2 == 99832172L);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(19324562385800L, (-47524559));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 19324562385800 * -47524559");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 450, (-9651L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9201L) + "'", long2 == (-9201L));
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2103102L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2103102) + "'", int1 == (-2103102));
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1450732L, (long) 3909);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5670911388L + "'", long2 == 5670911388L);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(101L, (-1010L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1111L + "'", long2 == 1111L);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(99899989L, 34386308);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3435191790950612L + "'", long2 == 3435191790950612L);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 10100, (-5), 155277600);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1802640000), (-8209), 600842000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 168579832, 520, 841);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 168579832 for hi! must be in the range [520,841]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 9999, (-2110080L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -21098689920");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 549, (-19), 184);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-951492297), (long) 576);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-951491721L) + "'", long2 == (-951491721L));
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1174462, (java.lang.Object) (-188114696));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-951492297), 115104, (-1713170345));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 629990222, 1517218488, 10398);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 87, (java.lang.Object) (-951502398));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-868), (-52), 1943780);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 709960, (java.lang.Object) 32896872L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-17899), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17802) + "'", int2 == (-17802));
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3996508940L, (-310000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3996818940L + "'", long2 == 3996818940L);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1763460086), 878171L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1548619507182706L) + "'", long2 == (-1548619507182706L));
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-949427270), (-108109069), 1999672);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3469518), 1010);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3469518 * 1010");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(949427270L, 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 949427360L + "'", long2 == 949427360L);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeAdd((-1715697100), (-1763460000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -1715697100 + -1763460000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-576), 629990222, 0, 310);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-9700), 163L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9537L) + "'", long2 == (-9537L));
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-221718630));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-221718630) + "'", int1 == (-221718630));
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-169871L), 199308L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -33856649268");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(48456409752000520L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1738657));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1738657 + "'", int1 == 1738657);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-100), 10552, 1989861);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -100 for  must be in the range [10552,1989861]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1722847825104L, (long) (-843852));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1722848668956L + "'", long2 == 1722848668956L);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-489951));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-489951) + "'", int1 == (-489951));
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-97970), 210, 46831);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-3038));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3038 + "'", int1 == 3038);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5802204811239936L), 1990710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -5802204811239936 * 1990710");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-100490000), (-204677760), 3509649, (-158));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(709790L, (-147147648399672000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 147147648400381790L + "'", long2 == 147147648400381790L);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(7739630L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7739630 + "'", int1 == 7739630);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 141074004320L, (java.lang.Object) 1495740L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-48014510), 3045000, 450);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) -1, 9700, (-1450548));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(10001);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10001) + "'", int1 == (-10001));
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1712671034), 970111, 1142);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(62000, 10049, (-1713170345));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 185867227, (-210));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(801902322, 10552, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) ' ', 677162, (-80));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-2110080), (-86), (-3469518));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2110080 for  must be in the range [-86,-3469518]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-84385200), (long) (-8700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-84393900L) + "'", long2 == (-84393900L));
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1763425054), 4231920, (-350035111));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-336230297424L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -336230297424");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 351655538);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 351655538 + "'", int1 == 351655538);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3035028), (-498646), (-9700), 947642470);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 944118497 + "'", int4 == 944118497);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-153066), 3908L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-149158L) + "'", long2 == (-149158L));
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-86130));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 86130 + "'", int1 == 86130);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-7098290050L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 9972, (long) 2959176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2949204L) + "'", long2 == (-2949204L));
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10001, 350000, 99440784);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-153066), (-10049));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-163115) + "'", int2 == (-163115));
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 3045000, (-451556L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3496556L + "'", long2 == 3496556L);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1010, (-62086), 2284709);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-185867227), (java.lang.Object) 10049);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(185867227);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-185867227) + "'", int1 == (-185867227));
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-108109069));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 108109069 + "'", int1 == 108109069);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-103393920L), (-9537L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 986067815040");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-689793507L), (java.lang.Object) 122377675L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(9864);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9864) + "'", int1 == (-9864));
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(34386390, 489444, (-498646), 257397490);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34875834 + "'", int4 == 34875834);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(20, 0, 18000, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1802640000, 577142280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1802640000 * 577142280");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9700, (-163115));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1582215500L) + "'", long2 == (-1582215500L));
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2284622, (java.lang.Object) 6022437L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-86130));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-86130) + "'", int1 == (-86130));
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1, 576, 0, 100962303);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 577 + "'", int4 == 577);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 168544800, (-53248), 115104);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 168544800 for hi! must be in the range [-53248,115104]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(10398);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10398) + "'", int1 == (-10398));
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 46935164704L, (java.lang.Object) 600842000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(1722848668956L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1722848668956");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 130289873L, (java.lang.Object) 970111L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 185867227, (java.lang.Object) 3509649);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1763469777), (long) 709901);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1762759876L) + "'", long2 == (-1762759876L));
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-729L), 98049000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-71477721000000L) + "'", long2 == (-71477721000000L));
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1616447619072L), (long) 1712671034);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1618160290106L) + "'", long2 == (-1618160290106L));
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-5237327346300000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5237327346300000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8700), 948554270L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8252422149000L) + "'", long2 == (-8252422149000L));
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 168544800, (int) (byte) 10, 949427270);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-37993768L), 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-37993868L) + "'", long2 == (-37993868L));
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(180882L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(46930, (-79));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46851 + "'", int2 == 46851);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1), (java.lang.Object) 349956900);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-79), (long) 34875834);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2755190886");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-153066), 0, 16524);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-949427270), (-214183750), 185867227);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 630000000, 634, 1989700);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1990710), (-204677760), (-868), (-27));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-412) + "'", int4 == (-412));
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 947642470);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 947642470 + "'", int1 == 947642470);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-300968758L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2294419, 399618, (-9788880), (-1763460086));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-214183750), (-592), (-3499569), (-350035111));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-221718630), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 46851, (-3480386), (-1763460000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-19), 52, 577142280);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -19 for hi! must be in the range [52,577142280]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-99), 9169);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9070 + "'", int2 == 9070);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(700L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 700 + "'", int1 == 700);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(3499650, 111, (-14307));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-47524559), (-17802), 184);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2110080));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2110080 + "'", int1 == 2110080);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(970000, (-300551), (-1788088016), (-1010899));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1786407669) + "'", int4 == (-1786407669));
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1989524L), 1620);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3223028880L) + "'", long2 == (-3223028880L));
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(620);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-620) + "'", int1 == (-620));
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 19, (java.lang.Object) (-53248));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10999L, (java.lang.Object) 155277600);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(3509649);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3509649) + "'", int1 == (-3509649));
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 9, 257397490, (-8700));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9 for  must be in the range [257397490,-8700]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-350035111), 489444);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2065028), (-171478832));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-173543860) + "'", int2 == (-173543860));
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-163115), 31508272, (-62000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) '#', 64244L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2248540 + "'", int2 == 2248540);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9864, (-163115));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-153251) + "'", int2 == (-153251));
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(53248, 2284622, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 350035111, (-1454523), 9700);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 52, 0, 10100);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-366104800L), 47234L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17292594123200L) + "'", long2 == (-17292594123200L));
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 62000, 3509649, 9700);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 56611, 254849, (-9700));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56611 for  must be in the range [254849,-9700]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3469518, (-498646));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3469518 * -498646");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3996509289L, (long) 833);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3329092237737L + "'", long2 == 3329092237737L);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(34386390);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34386390) + "'", int1 == (-34386390));
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-949427270));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-949427270) + "'", int2 == (-949427270));
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3329092237737L, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3329092237737L + "'", long2 == 3329092237737L);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46831, 6015L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 281688465L + "'", long2 == 281688465L);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 947642470, 20, (-951493178));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 420386456, (java.lang.Object) (-15951520));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1111L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1111 + "'", int1 == 1111);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 970111L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-198112800), (long) (-47525247));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9415359753861600L + "'", long2 == 9415359753861600L);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 62000, (-1763460086), 32482053);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4000008832000L), (-47524559));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4000008832000 * -47524559");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1111, 349956900, (-580601), 1620);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-539633) + "'", int4 == (-539633));
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 600842000, (long) 10047);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6036659574000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1738657, 874263, 310);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 100963445, 198109764L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-97146319L) + "'", long2 == (-97146319L));
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 32482053, 0, (-79));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1221, (long) 709908);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 711129L + "'", long2 == 711129L);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-47524559), (-1738657), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-843852), (long) 34386408);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29017039163616L) + "'", long2 == (-29017039163616L));
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3398104), 87, 833);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-873), 126482100, (-86));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 97, (int) ' ', (-863620));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hi! must be in the range [32,-863620]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-576), 24429098, 18000, (-1174462));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(100962303, 973781, (-66534), 351);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-65066) + "'", int4 == (-65066));
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1715696283), 532281952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1715696283 * 532281952");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-111));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-111) + "'", int1 == (-111));
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1470988428, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3996509289L, (long) 46831);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3996556120L + "'", long2 == 3996556120L);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-76533), 3481738);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1117972070, 16348845600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17466817670L + "'", long2 == 17466817670L);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-9691), 19, 420386456);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(48456409752000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 48456409752000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(151654554644L, 98049000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 151654554644 * 98049000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-300979678), (-1010899));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -300979678 * -1010899");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-489951), 9999, 2284622);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -489951 for  must be in the range [9999,2284622]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(100459953);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100459953) + "'", int1 == (-100459953));
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-8209));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8209 + "'", int1 == 8209);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 257397490, 3045000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 783775357050000L + "'", long2 == 783775357050000L);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 97, 158, (-100490000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1715160045), (-951492298), 1784800);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-372984608205200L), (long) (-9999));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-372984608215199L) + "'", long2 == (-372984608215199L));
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9875, 351655538);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 351665413 + "'", int2 == 351665413);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(14307, (-80), 1664, 171469054);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14227 + "'", int4 == 14227);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 350035111, (-153066), 1763460086);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1722847825104L, 158);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 272209956366432L + "'", long2 == 272209956366432L);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-198112800), (-5), 1990710, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(46831, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1784780L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1784780L) + "'", long2 == (-1784780L));
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 20, 0, (-2065028));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3244012L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3244012L + "'", long2 == 3244012L);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(700);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-700) + "'", int1 == (-700));
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 620, (-188114696), 2110080);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2103102), 0, 970111, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-970111L), 324783680L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-315076220588480L) + "'", long2 == (-315076220588480L));
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-65066), 86130, (-9788880), 257397490);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21064 + "'", int4 == 21064);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-963979), (java.lang.Object) (-9788880));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(47234L, 688);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32496992L + "'", long2 == 32496992L);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-5802204807995135L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 503932, 13, (-3035028));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 503932 for hi! must be in the range [13,-3035028]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3461473L, (long) 62);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3461411L + "'", long2 == 3461411L);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-8700), 1000, (-2065028));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 1, 8209, (-89));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 97, 8, 3499650);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-171469054), 17319362033L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2969734623682026782");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3499650L, (-276464450L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-967528812442500L) + "'", long2 == (-967528812442500L));
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 947642470, 7739630, (-3038));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-688), (-10398), (-204677760));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(3499650, 62000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3561650 + "'", int2 == 3561650);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(10200L, (long) 1470988428);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1470998628L + "'", long2 == 1470998628L);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1788088016, 46851, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1788088016 for  must be in the range [46851,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(944118497);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-944118497) + "'", int1 == (-944118497));
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(10100, (-53248));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-537804800) + "'", int2 == (-537804800));
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 218684298L, (java.lang.Object) (-210));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-97970), 479553L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -46981807410");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 800244954501300L, (java.lang.Object) 7098300099L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-880), (-349956900), (-3480386));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -880 for  must be in the range [-349956900,-3480386]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-300551), 600842000, 0, (-171469054));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-34386390), (-372966672741349L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -34386390 * -372966672741349");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-729L), 141074004320L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-102842949149280L) + "'", long2 == (-102842949149280L));
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(62000, 1943430);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005430 + "'", int2 == 2005430);
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-14149), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(63702720L, (-1761079449));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-112185551037401280L) + "'", long2 == (-112185551037401280L));
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-19), 310, (-1454874));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 2005430, 24429098);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [2005430,24429098]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1943780, (int) '4', 4479760);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1943780 + "'", int3 == 1943780);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1784800);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1784800 + "'", int1 == 1784800);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10), (-9864));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98640 + "'", int2 == 98640);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(169792L, (long) 10398);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1765497216L + "'", long2 == 1765497216L);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-62000), (-1715696283), (-9864));
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(63702720L, 34254574200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2182109548981824000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1763425054), 51, 350000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1763425054 for  must be in the range [51,350000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-951493178), (long) (-503932));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 479487860175896");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(98640, 1943430, (-330040725));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(7739630, 1788088016, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-9797), (-951492298), (-1763460000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9797 for  must be in the range [-951492298,-1763460000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-412), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-312) + "'", int2 == (-312));
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-47524559L), (-17935455200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17887930641L + "'", long2 == 17887930641L);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(949427270, 1174462, (-82215000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-132));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 132 + "'", int1 == 132);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 101L, (java.lang.Object) 9076L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3996509288L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3996509288");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1802640000), 4476722, 709901);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(19907100, 4479760, 9700, (-1763469777));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-450684L), 281688465L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-126952484160060L) + "'", long2 == (-126952484160060L));
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10049, 0, (-1763469777));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1715160045), 1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1715159045) + "'", int2 == (-1715159045));
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1653L), (-36069449L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 59622799197");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3045000), (-843852), 0, 339160985);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 335272134 + "'", int4 == 335272134);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-863620), (-1999672), (-1990710), (-62086));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-934667) + "'", int4 == (-934667));
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-47525247), 49, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(635218511, (-1788088016), 16524, 335272134);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 188152939 + "'", int4 == 188152939);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3038, (-173543860), 14307);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9778, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-17899), (-537804800), (-111));
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-880), (-10100), 3509649, 21064);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(48456409752000000L, (long) (-1715159045));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48456411467159045L + "'", long2 == 48456411467159045L);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 191697613241321780L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2110080L), (-301934196L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 299824116L + "'", long2 == 299824116L);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-47524559), (-1715159045));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -47524559 * -1715159045");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 35, (-1450548), 947642470);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-580601), (-1763469764L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023872308448164L + "'", long2 == 1023872308448164L);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 35032);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35032 + "'", int1 == 35032);
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-173543860), 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-173543841) + "'", int2 == (-173543841));
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-153251));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 153251 + "'", int1 == 153251);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-19), 592);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11248L) + "'", long2 == (-11248L));
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-214183750), 13, (-14149));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -214183750 for  must be in the range [13,-14149]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(350, 3499650, (-789));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 100, (java.lang.Object) (-3996509288L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 3469518, (-89), (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3469518 for hi! must be in the range [-89,32]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-10100), (-1715160045), (int) (short) 1, 700);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 655 + "'", int4 == 655);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(872, (int) (short) 0, (-10001));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-62086), (long) 21064);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-41022L) + "'", long2 == (-41022L));
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-19), 335272134);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6370170546L) + "'", long2 == (-6370170546L));
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(17319362042L, (long) 1802640000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 17319362042 * 1802640000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9076L, (long) 630000000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5717880000000L + "'", long2 == 5717880000000L);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-79), 3461473L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-273456367L) + "'", long2 == (-273456367L));
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6959097913696L), 10049);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69931974934731104L) + "'", long2 == (-69931974934731104L));
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 9700, (-188114696), 350035111);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 126482100, (-171478832), 254849);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1664, 349956900);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 582328281600L + "'", long2 == 582328281600L);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-17802), (-3045000), 210);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-82215000), (-79), (-27));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-951492298), (-153066), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-27826) + "'", int3 == (-27826));
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(46851, 100962303);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101009154 + "'", int2 == 101009154);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-14149), 0);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 32482053, 14227, 10049);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 257397490, (-10001), (-10398));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3514807760678400L), (long) 34386408);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3514807760678400 * 34386408");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(35032);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35032) + "'", int1 == (-35032));
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 9875, (int) (short) 1, (-537804800));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9875 for  must be in the range [1,-537804800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(90L, 479553L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 479643L + "'", long2 == 479643L);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-582302736L), (long) (-48014510));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27958980540699360L + "'", long2 == 27958980540699360L);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 132);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 132 + "'", int1 == 132);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-131986800L), 1117972070);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-147557556008676000L) + "'", long2 == (-147557556008676000L));
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 870, (java.lang.Object) (-3480228));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(576, (-254849));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-146793024) + "'", int2 == (-146793024));
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(350034159L, (-833426L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-291727568998734L) + "'", long2 == (-291727568998734L));
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 947642470, (long) (-934667));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -885730144507490");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 115104, (-843852), (-1715696283));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-9537L), (java.lang.Object) 168579832);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(20, 335272134);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 335272154 + "'", int2 == 335272154);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2159885535598L), 489951);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1058238078051775698L) + "'", long2 == (-1058238078051775698L));
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(101L, 351655538);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35517209338L + "'", long2 == 35517209338L);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 155277600, (long) (-1784800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 157062400L + "'", long2 == 157062400L);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-15514L), (-617272946631430954L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -15514 * -617272946631430954");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-101), 9999, 349956900, 46831);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(789, (int) (byte) 1, 20, (-10398));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-372966672750000L), (-1761479067));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -372966672750000 * -1761479067");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(176411200, 10001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176421201 + "'", int2 == 176421201);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 520, 99835208L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99835728L + "'", long2 == 99835728L);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(677162);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-677162) + "'", int1 == (-677162));
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-112700L), (long) (-9999));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1126887300L + "'", long2 == 1126887300L);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(87, 9788);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9875 + "'", int2 == 9875);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (byte) 0, 9, (-163115));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [9,-163115]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 185867227, 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6505352945L + "'", long2 == 6505352945L);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-61432903456277L), (-870L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53446626006960990L + "'", long2 == 53446626006960990L);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2235464L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2235464) + "'", int1 == (-2235464));
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1454523), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1454524) + "'", int2 == (-1454524));
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1144627548L), (long) 3481738);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3985293229718424");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9788, (int) (short) 10, 198112800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9788 + "'", int3 == 9788);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(3499553, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 304461111 + "'", int2 == 304461111);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3034108), (-951502398), (-244802));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3034108) + "'", int3 == (-3034108));
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3499568L, (-153268L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3652836L + "'", long2 == 3652836L);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-84393900L), (-1713170345));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 144581126778895500L + "'", long2 == 144581126778895500L);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1763460086, (-1763460086));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1763460086 * -1763460086");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 870, 127833122375L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127833123245L + "'", long2 == 127833123245L);
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(8209, (-1285742));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1277533) + "'", int2 == (-1277533));
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-14149), 504032, 944118497, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1010899), (-100490000), 34386390);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1010899) + "'", int3 == (-1010899));
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(281688465L, 64244L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 18096793745460");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1058238078051775698L), (java.lang.Object) 350);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-951493178), (long) (-163115));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 155202809729470");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-489951), 4000008832L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1959808327247232");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(99L, (-9691));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-959409L) + "'", long2 == (-959409L));
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1763460086), 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1763459996L) + "'", long2 == (-1763459996L));
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(592, (-158), 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-330040725), (-100490000), (-17802));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(34386408);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34386408) + "'", int1 == (-34386408));
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1470988428);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1470988428) + "'", int1 == (-1470988428));
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(176421201, 635218511);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 176421201 * 635218511");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 872, 14227, 176411200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(63702820L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63702820L + "'", long2 == 63702820L);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1784800, (java.lang.Object) 63702593L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-10100), 351655538, 112110);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10100 for  must be in the range [351655538,112110]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 801902322, (long) (-17899));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 801884423L + "'", long2 == 801884423L);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-101));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 101 + "'", int1 == 101);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1989687), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1989686) + "'", int2 == (-1989686));
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-372968475389952L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -372968475389952");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-3480228));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3480228 + "'", int1 == 3480228);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2959176, (-48014510), (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2959176 for hi! must be in the range [-48014510,32]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 56611, 21064, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1454524), (long) (-853901));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2308425L) + "'", long2 == (-2308425L));
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2248540, (-1763425054));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1761176514) + "'", int2 == (-1761176514));
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(99832172L, 17319362033L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1729029529408725676");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 532281952, (java.lang.Object) (-1999672));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 9972, 9700);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1989686), (-1715696283));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1717685969) + "'", int2 == (-1717685969));
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 324783600L, (java.lang.Object) 7090009575436800L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1010L), (-168473100L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 168472090L + "'", long2 == 168472090L);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(99881989L, 9700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 968855293300L + "'", long2 == 968855293300L);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-951492298), 2658977L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2529996136059146L) + "'", long2 == (-2529996136059146L));
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-244802), 31508272);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -244802 * 31508272");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-96));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96 + "'", int1 == 96);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 350000, (-198121500L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 198471500L + "'", long2 == 198471500L);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-127769401782L), (-62086));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7932691079037252L + "'", long2 == 7932691079037252L);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-19), 95781, 2110080);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2294400, 9864);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2304264 + "'", int2 == 2304264);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 254849, 19);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4842131L + "'", long2 == 4842131L);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2304264);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2304264) + "'", int1 == (-2304264));
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1943430), (-620), (-1784800), (-153066));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-312315) + "'", int4 == (-312315));
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(833, 872);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1705 + "'", int2 == 1705);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-336230297424L), (java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1943780, (-3034108));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1090328) + "'", int2 == (-1090328));
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(7932691079037252L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7932691079037252L + "'", long2 == 7932691079037252L);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3053499302L, (long) 4231920);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3049267382L + "'", long2 == 3049267382L);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(99440784);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-99440784) + "'", int1 == (-99440784));
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(78821091321L, 3075697651L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 78821091321 * 3075697651");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(147147648400381790L, 97770171L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 147147648302611619L + "'", long2 == 147147648302611619L);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1010, (-951502398), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

