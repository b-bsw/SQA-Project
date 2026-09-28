package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

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
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1025353728);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1025353728 + "'", int1 == 1025353728);
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1563864028), (java.lang.Object) (-1213583));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-48512377), 107336979);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -48512377 * 107336979");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(447039252150L, (-29363988780540L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29811028032690L + "'", long2 == 29811028032690L);
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-610511170L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-610511170) + "'", int1 == (-610511170));
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 655, 1469009104L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1469008449L) + "'", long2 == (-1469008449L));
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 99440784);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-949426390), 233904432, (-468));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(168504917, (-61510));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 168443407 + "'", int2 == 168443407);
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 4479918, (-208569710), (-301848066));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4479918 for hi! must be in the range [-208569710,-301848066]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-169096781), 26511982, 252802, (-38868600));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-64244), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-4580870), 231793424);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -4580870 * 231793424");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 6962363402025L, (java.lang.Object) (-308759394));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1999672), (-88481780), 812374164, 942883156);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 823081499 + "'", int4 == 823081499);
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1786407669), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1786407669 * 35");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1990810, (long) (-115104));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2105914L + "'", long2 == 2105914L);
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2295252, (long) (-448826));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1030168774152L) + "'", long2 == (-1030168774152L));
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(172893415187088L, (long) 583633684);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 172893415187088 * 583633684");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-193913417), 1738657, (-1185347686), 219304298);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-192174760) + "'", int4 == (-192174760));
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 18980207, 32666863L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51647070L + "'", long2 == 51647070L);
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 620, 56, (-767454452));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1638607297, (-326232), 2065028, (-2466));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2587005341892608L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-314527061), 638821068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -314527061 * 638821068");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 40322560, (-352039597), 3598);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(16354172234400L, (long) 12195475);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16354184429875L + "'", long2 == 16354184429875L);
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 199359, 154650012, 1715159733);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 304461111, 1277553L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 388965205741383L + "'", long2 == 388965205741383L);
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(44199872L, 83836111906170L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 44199872 * 83836111906170");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-139503336), (-152286));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-139655622) + "'", int2 == (-139655622));
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-106412530), (-728), 1925133904, (-1761078660));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1025206), 11884449421090080L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1025206 * 11884449421090080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3398104, (-84756249), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-846183179790L), (-30032076683980800L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -846183179790 * -30032076683980800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1974990), (java.lang.Object) (-173467889L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-61431955824448L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-959232), (-939637516));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -959232 * -939637516");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 2376658, 640810929, 101009154);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2376658 for  must be in the range [640810929,101009154]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1755920876), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-128133992));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-128133992) + "'", int1 == (-128133992));
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 258662, (-32091971), 870);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 99684041, (-57069L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99741110L + "'", long2 == 99741110L);
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3333540690718362L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3333540690718362");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1712594601, (-633115409));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1084270031263306809L) + "'", long2 == (-1084270031263306809L));
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1989861, 24429098, 587204001, (-597509));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2615899881150087168L, (long) 10047);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2615899881150097215L + "'", long2 == 2615899881150097215L);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1491865899480L), (java.lang.Object) (-16793243214800L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-10), (-2078213173));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2078213183) + "'", int2 == (-2078213183));
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-880), 1481377506, 1180099792);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -880 for  must be in the range [1481377506,1180099792]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 34875834, (java.lang.Object) 60512695340828866L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1764621518L), (java.lang.Object) (-103168000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 250462763508300L, (java.lang.Object) 73477967816424400L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1788088016, (-1763460000), (-442560));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(65147352L, 48321945L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3148046760239640L + "'", long2 == 3148046760239640L);
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-34386308), 259940595);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 225554287 + "'", int2 == 225554287);
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(32666863L, 6407448057348624L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 32666863 * 6407448057348624");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3517500094266600L, (java.lang.Object) 157062400L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1001404800L), (long) 976536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -977907837772800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(6289801, 101010340, 3469518);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 300969900, (java.lang.Object) 8123);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1711), (-420368508));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1711 * -420368508");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(326128844, 587204001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 913332845 + "'", int2 == 913332845);
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-580601));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-169871L), (long) (-2005438));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1835567L + "'", long2 == 1835567L);
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1245167L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1245167 + "'", int1 == 1245167);
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-349956635), (-1196950));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -349956635 * -1196950");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-357591120), 1761730, (-950048943));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1694976160L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1694976160 + "'", int1 == 1694976160);
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(34015933755L, (long) (-87426300));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33928507455L + "'", long2 == 33928507455L);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 159247253, (-266405443701358364L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-266405443542111111L) + "'", long2 == (-266405443542111111L));
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-167743998851204100L), (-9788));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -167743998851204100 * -9788");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-158), (-300979678), (-1535304));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-299444533) + "'", int3 == (-299444533));
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-153251), 959344, (-188114696));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-300551), (java.lang.Object) 3035028);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-303085597500000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -303085597500000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5758, (-17899), (-139503336), (-1711));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-12141) + "'", int4 == (-12141));
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 125795450L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-273456367L), (-1463930951L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 400321239399315017");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-214183750), (-122484040), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -214183750 for  must be in the range [-122484040,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-498646), (-211916938), (-377));
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-314527061));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 314527061 + "'", int1 == 314527061);
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1454523), 144581126778895500L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 144581126777440977L + "'", long2 == 144581126777440977L);
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(46895);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46895) + "'", int1 == (-46895));
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1989700, (java.lang.Object) 9972);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 2384403, 12412083862844086L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12412083865228489L + "'", long2 == 12412083865228489L);
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(358873422330200L, (long) (-1621913841));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 358873422330200 * -1621913841");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1131200L), (-14488763809333905L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1131200 * -14488763809333905");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-155757153L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-155757153) + "'", int1 == (-155757153));
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 155277797, 0, (-711052));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 1, (-18980207), 126482100, 153428);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(126482100, 27, (-485588104));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 112110, 819000, 942883156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1206090960, 0, (-349957368), (-1981541));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-185812352) + "'", int4 == (-185812352));
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1974990), 36237190012352L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36237191987342L) + "'", long2 == (-36237191987342L));
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1755570876));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1755570876 + "'", int1 == 1755570876);
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 760787, 3509649, 5899809);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 760787 for  must be in the range [3509649,5899809]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(107222400);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-107222400) + "'", int1 == (-107222400));
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-166558919), 954811000, (-1528073662));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -166558919 for hi! must be in the range [954811000,-1528073662]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-300979678), (-939637516), 49439738, 45091);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1517218488, 66558);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100983028124304L + "'", long2 == 100983028124304L);
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-326232), (-954536506));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -326232 * -954536506");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-349956635), 872, 695393);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3614852345498L), (long) (-111849012));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3614964194510L) + "'", long2 == (-3614964194510L));
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-2858763));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2858763) + "'", int1 == (-2858763));
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-212411343), 1737870, 14343);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1686037017, (-300969892));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1385067125 + "'", int2 == 1385067125);
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-521191424), (-46));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(347695, (-1942080), (-3770626));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-490002), 1899810000, 9972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -490002 for hi! must be in the range [1899810000,9972]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 950048943, (-106403849), (-54920));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-12595644), 21963942, (-1519234035));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1785587), (-79), 99684041);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97898534 + "'", int4 == 97898534);
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-323442480), 180346924, 17802);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(17663697000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 17663697000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 174629, (long) 1155965);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 201865011985");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-6960), (long) 10545454);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10552414L) + "'", long2 == (-10552414L));
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 168472090L, (java.lang.Object) (-752492324741815224L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-853932), 1943430, 4043031);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(168443407);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-168443407) + "'", int1 == (-168443407));
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-304687800), (-47620));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14509233036000L + "'", long2 == 14509233036000L);
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(17981, 0, (-1649662), 201);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1631883) + "'", int4 == (-1631883));
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-54944543953908756L), (long) (-952907498));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-54944543001001258L) + "'", long2 == (-54944543001001258L));
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-64244), 1025206, (-1738657));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1995555), (-1621913841), (-301838202));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1995555 for  must be in the range [-1621913841,-301838202]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(85229052L, 1492005);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127162171729260L + "'", long2 == 127162171729260L);
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-249426407), (-412), 8700);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1025353728, 351665413, (-249426407));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-314527061), (-10690349L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3362404052034289L + "'", long2 == 3362404052034289L);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-31069120), 1517218488, 4479918);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3349062, 87426300);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3349062 * 87426300");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(8700, 176421201);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 8700 * 176421201");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-539633), 247971533, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(157922, (-103661485));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 157922 * -103661485");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10545454, 0, 3480228);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 104767 + "'", int3 == 104767);
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-169096781), 533310184, (-633647202), (-600832203));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-620236597) + "'", int4 == (-620236597));
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-952557498), (-166558919), 47525347, (-317333540));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-2889995522168L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2889995522168");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 7, 9798, (-1174461));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7 for  must be in the range [9798,-1174461]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(3509649, 15409940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18919589 + "'", int2 == 18919589);
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(666098988L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 666098988 + "'", int1 == 666098988);
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(4240387, 155988945);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 4240387 * 155988945");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-85369496), 2294400, (-1990388), 37948040);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36740191 + "'", int4 == 36740191);
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(332622506970L, (-22112703));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7355182707743039910L) + "'", long2 == (-7355182707743039910L));
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-12397742974332520L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -12397742974332520");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-76533), 3909, (-2304264));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -76533 for hi! must be in the range [3909,-2304264]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2250), 42307341, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1722847825104L, (long) (-970111));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1671353626459466544");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-294334110769387857L), (java.lang.Object) 79637871300L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-316451466), (-99114930L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-415566396L) + "'", long2 == (-415566396L));
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(231190314, (-1990611));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 231190314 * -1990611");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(63864, (-12595644), 331157);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 63864 + "'", int3 == 63864);
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(71700, 5220530, 9691);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1234120, 104767, (-208847451), 99835728);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1338887 + "'", int4 == 1338887);
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 231793424, 40322555L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 272115979L + "'", long2 == 272115979L);
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1859882812L), (long) (-2051278));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3815136694833736");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(24429098, 64, 745188990, 17981);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1530017442, 6237554960000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1530017442 * 6237554960000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1889050220, 17466817670L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19355867890L + "'", long2 == 19355867890L);
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(634344346, 0, 1763460000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 634344346 + "'", int3 == 634344346);
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(18852380639933256L, 61577039813520000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 18852380639933256 * 61577039813520000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1023872308394916L, 760787);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1023872308394916 * 760787");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2304263), 10000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5220530, 351375808428575L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 5220530 * 351375808428575");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-11));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(600814779, (-1715696283), 812374164, 349829);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-96), (-10047), (-2987409));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-1944900), 2284709);
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-6915), 71700, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 168472109, (long) 299795783);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 50507227831316347");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2439621, 94226189490L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 229876190629783290L + "'", long2 == 229876190629783290L);
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 709311654578808L, (java.lang.Object) 592);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-344489), (-450684));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -344489 * -450684");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(299315786L, (long) (-1762675999));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2061991785L + "'", long2 == 2061991785L);
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1462491242), 489951, 709790);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 543958 + "'", int3 == 543958);
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-30032076683980800L), (java.lang.Object) 108109069);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-87));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-87) + "'", int1 == (-87));
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-18048022692349L), (-3045000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -18048022692349 * -3045000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3996818972L, (-37993768L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3958825204L + "'", long2 == 3958825204L);
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(53446626006960990L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 53446626006960990");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-257), (-100449343), (-1755570876));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -257 for  must be in the range [-100449343,-1755570876]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(219899);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-219899) + "'", int1 == (-219899));
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-155757153L), (java.lang.Object) 112127724398080L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(504032L, (long) 848047583);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 848551615L + "'", long2 == 848551615L);
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 132, 219304298, 8123);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 458793393, (java.lang.Object) (-221718630));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-7889211));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7889211) + "'", int1 == (-7889211));
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2536427, 633115409);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2536427 * 633115409");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 188112985, 959334, (-1995555));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-129224490), 180346924);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51122434 + "'", int2 == 51122434);
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-617272946947079546L), (-8002818715384005L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-625275765662463551L) + "'", long2 == (-625275765662463551L));
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1548000), (-41399300675255439L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1548000 * -41399300675255439");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10049, (-106575000), 6960);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-106571912) + "'", int3 == (-106571912));
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1715696283), (-17935552074L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16219855791L + "'", long2 == 16219855791L);
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-301424041786728630L), 27166902510L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-301424014619826120L) + "'", long2 == (-301424014619826120L));
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 69748100, (-1482832281), (-17899));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-29047620), (-99440784), 12195475);
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(218684298L, (long) 99768);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 218584530L + "'", long2 == 218584530L);
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1753263, (-10985));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1742278 + "'", int2 == 1742278);
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-136724), (-445627), (-139655622), 71700);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-582351) + "'", int4 == (-582351));
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1185347686), 30906162, 149767755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 122129848 + "'", int3 == 122129848);
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-434897505), (-1532599571), (-112110));
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-152286), (-49522428), 9553);
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(168504917, 132, 19907100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9249165 + "'", int3 == 9249165);
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-655556), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-655556) + "'", int2 == (-655556));
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2304106), 350000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1954106) + "'", int2 == (-1954106));
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-882074));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 882074 + "'", int1 == 882074);
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 7018146835128L, (java.lang.Object) (-909846561072878L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1483542189L, (long) 115104);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1483657293L + "'", long2 == 1483657293L);
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 715471229, (-1075328), (-3035028));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-372984608215199L), (long) (-711052));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -372984608215199 * -711052");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1755920876));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1755920876 + "'", int1 == 1755920876);
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-4061026062L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4061026062L) + "'", long2 == (-4061026062L));
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 100459953, (long) (-1259474));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99200479L + "'", long2 == 99200479L);
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 63702693L, (java.lang.Object) (-1621913841));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(66558, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 865254 + "'", int2 == 865254);
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-848595844), 0, 503932, (-14307));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-863620));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 863620 + "'", int1 == 863620);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 101009154);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 101009154 + "'", int1 == 101009154);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(562466456350656L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 562466456350656");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2923493245953L), (java.lang.Object) 18919589);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1794989), 1517218488);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1794989 * 1517218488");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-415654715L), 1023872308448164L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023871892793449L + "'", long2 == 1023871892793449L);
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-954811), 304461111, (-16919594));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -954811 for hi! must be in the range [304461111,-16919594]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(479643L, (long) (-111));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53240373L) + "'", long2 == (-53240373L));
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-85369496), (-214173761), 760787);
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-14149), 129926115);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -14149 * 129926115");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(66947207, 620);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 66947207 * 620");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 5899809, (-314527061), (-34978320));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5899809 for  must be in the range [-314527061,-34978320]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-146793024), (long) 2288107);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-144504917L) + "'", long2 == (-144504917L));
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9477L, (java.lang.Object) 99835728);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(129926115);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-129926115) + "'", int1 == (-129926115));
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(42307341);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-42307341) + "'", int1 == (-42307341));
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2219805000L), (java.lang.Object) 62000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 586810735, (long) 9798);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5749571581530");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-300969892), (-12141), 3499585);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-53553755), (java.lang.Object) (-1944900));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(576131381, (-1454874));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 574676507 + "'", int2 == 574676507);
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 351, (-592169827));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 911, 1174365, (-63864));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-94107847976232L), (-1763459996L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -94107847976232 * -1763459996");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(609053028L, (long) (-219899));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 609272927L + "'", long2 == 609272927L);
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1950782797076L), (long) 1945308);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1950784742384L) + "'", long2 == (-1950784742384L));
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(312598477, (-1999671), (-199359), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4074) + "'", int4 == (-4074));
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 252294596, (-352813075), (-1989686));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-106820930), (long) (-186412));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-107007342L) + "'", long2 == (-107007342L));
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-184), (-157922), 0);
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3328440011854L, (java.lang.Object) 1712604379);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(198112800, 64244);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 198177044 + "'", int2 == 198177044);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(67276566, (-386075249));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-318798683) + "'", int2 == (-318798683));
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1763459996L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1763459996) + "'", int1 == (-1763459996));
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 18919589, 3277662, 3349062);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(221244466068L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1442485561737636505L, 890876710L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1442485561737636505 * 890876710");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(63649227);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-63649227) + "'", int1 == (-63649227));
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 445, 843887, (-3760577));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 445 for  must be in the range [843887,-3760577]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9076L, (java.lang.Object) 300979678);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1025206, (-2922338));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1897132) + "'", int2 == (-1897132));
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-109132037444917766L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -109132037444917766");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-159247253), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-159247253L) + "'", long2 == (-159247253L));
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-6143307333500510L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(219514554L, 942883156);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 206976575463452424L + "'", long2 == 206976575463452424L);
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3499553, (-450683));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3499553 * -450683");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 926179236, (java.lang.Object) (-394742519564892L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 100962303, (-17802));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-168572690), (long) (-1715697100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1884269790L) + "'", long2 == (-1884269790L));
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1585661515680L), 874263L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1585660641417L) + "'", long2 == (-1585660641417L));
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(4937697877816L, (long) (-2304264));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4937700182080L + "'", long2 == 4937700182080L);
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-184225), (-1221), (-108109069), (-132));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-185446) + "'", int4 == (-185446));
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (short) -1, (-9651L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9650L + "'", long2 == 9650L);
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-32091561), (-56464401015740232L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -32091561 * -56464401015740232");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 947642470, 3349062, 66534);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 947642470 for hi! must be in the range [3349062,66534]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-1831453200L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2284741), 3652836L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -8345784175476");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 695393, 299795783, 1139);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-351), (java.lang.Object) (-595172455245621079L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-54948), 15172184748L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -833681207533104");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-339652578854649060L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -339652578854649060");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1944900), 6407448057348624L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1944900 * 6407448057348624");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-101), 1010, (-603474758));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2997), (long) 349829);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 346832L + "'", long2 == 346832L);
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3394243441710L), (java.lang.Object) 53724488442210L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(374245, (-1766617203), 3561650);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 374245 + "'", int3 == 374245);
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-896371847163213190L), (long) (-308759394));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -896371847163213190 * -308759394");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(629990222, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-450684), (-210559234), (-22199491));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-300969900), (-14227));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -300969900 * -14227");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-61510), 351665413, 54920);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) -1, 442560, (-869115), 1988776);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 442559 + "'", int4 == 442559);
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 10689680, (long) (-153066));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10842746L + "'", long2 == 10842746L);
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1174461), (-549));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1175010) + "'", int2 == (-1175010));
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 121054688, (-530216924), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-448826), (-208569710), 1711678817);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-448826) + "'", int3 == (-448826));
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-76533), 1221, 20731669, 89186674);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 68379694 + "'", int4 == 68379694);
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(88593817038090L, 357613683);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 88593817038090 * 357613683");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1910207, (-601337));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1910207 * -601337");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 125783592);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 125783592 + "'", int1 == 125783592);
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1025206));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1025206) + "'", int1 == (-1025206));
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-46), (-2045516132L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 94093742072");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-54920), (-10221043));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -54920 * -10221043");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-27));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-27) + "'", int1 == (-27));
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1989687), 1989861);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3959200563507L) + "'", long2 == (-3959200563507L));
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 5220530, 22240825200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22246045730L + "'", long2 == 22246045730L);
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-10100), 950100085, 711052);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-532281952), (-595172455245621079L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 595172454713339127L + "'", long2 == 595172454713339127L);
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1737870), (-451), (-2295252));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 47620, 9864, 86130);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3333540690718362L), 10018356553040L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3323522334165322L) + "'", long2 == (-3323522334165322L));
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1938372, (-954536506), (-168573390));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1938372 for hi! must be in the range [-954536506,-168573390]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 920, 53248, (-999900));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 920 for  must be in the range [53248,-999900]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 219899, (-300979678), (-580601));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 35000, (-8700), (-970111));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 155277600, (-107726638), 185867148);
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2987409L, 7089931017340773L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7089931020328182L + "'", long2 == 7089931020328182L);
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-6915), (long) 1763460086);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1763453171L + "'", long2 == 1763453171L);
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 15345);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15345 + "'", int1 == 15345);
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-640941), (-1185347686));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [-640941,-1185347686]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-22199491), (-1585660641417L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1585682840908L) + "'", long2 == (-1585682840908L));
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 1715160045);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1715160045L) + "'", long2 == (-1715160045L));
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-105975170));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 105975170 + "'", int1 == 105975170);
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(80635684, 532281952, 130141, 106412530);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 81505686 + "'", int4 == 81505686);
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-41404775));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 41404775 + "'", int1 == 41404775);
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 638821068, 1753263, (-54920));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 638821068 for  must be in the range [1753263,-54920]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(14308, 494910, 833, 274176451);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 509218 + "'", int4 == 509218);
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1816), (-4485377));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4487193) + "'", int2 == (-4487193));
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1462491241L), 244598366660L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-246060857901L) + "'", long2 == (-246060857901L));
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 152257, (-916521966637200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-916521966484943L) + "'", long2 == (-916521966484943L));
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1954106), (-27898616), 47610286);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1954106) + "'", int3 == (-1954106));
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(4004130654049726L, 85229052);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 4004130654049726 * 85229052");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-12141));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12141 + "'", int1 == 12141);
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 715471229, (-10), 153428);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-16067817816692118L), (-1048248288540722L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -16067817816692118 * -1048248288540722");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-11), 9123345);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100356795) + "'", int2 == (-100356795));
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(949426390);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-949426390) + "'", int1 == (-949426390));
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(168472109, (-1075328));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 167396781 + "'", int2 == 167396781);
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-167908226L), (long) (-32091561));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5388437077080786L + "'", long2 == 5388437077080786L);
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-100449343), 315638545L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 215189202L + "'", long2 == 215189202L);
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-635218511), 46818643568457600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -635218511 * 46818643568457600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2295252));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2295252 + "'", int1 == 2295252);
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-234356), (-944117276));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-944351632) + "'", int2 == (-944351632));
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-186412), 10001, 349829);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-10047), (-1762675999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-45120L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-45120) + "'", int1 == (-45120));
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1954327840, 351375808265460L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 351377762593300L + "'", long2 == 351377762593300L);
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(230746822, 442560, 634);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(150146624591787L, (-6143307333500510L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 150146624591787 * -6143307333500510");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-843887), 3598);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -843887 * 3598");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(100978790, (-1212378), 2376658);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 485754 + "'", int3 == 485754);
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(76279426, (-1763469777));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 76279426 * -1763469777");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3035028L), (-8252422149000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3035028 * -8252422149000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1889050220, (-3394243441710L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1889050220 * -3394243441710");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-164261393856L), (long) (-350000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-164261043856L) + "'", long2 == (-164261043856L));
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(304989469628640240L, (-5234757L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 304989469623405483L + "'", long2 == 304989469623405483L);
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-32348768), 6694097919331338L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -32348768 * 6694097919331338");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-527981586660499855L), (long) (-10689661));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -527981586660499855 * -10689661");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-33108325), (-100188239), (-9537));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-33108325) + "'", int3 == (-33108325));
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1519234035), (long) 177781774);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1697015809L) + "'", long2 == (-1697015809L));
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 406062L, (java.lang.Object) (-139655622));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 633647822);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-633647822L) + "'", long2 == (-633647822L));
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-31706623206000L), (java.lang.Object) 10100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(4479760);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4479760) + "'", int1 == (-4479760));
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 64, 66558, (-9778));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) -1, (-47610286));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47610286 + "'", int2 == 47610286);
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-27409742280L), (-202050186));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5538143525886064080L + "'", long2 == 5538143525886064080L);
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(236129206, 700229040);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 936358246 + "'", int2 == 936358246);
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-42307341), 17802, (-15805100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(440284L, (long) (-9999));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 450283L + "'", long2 == 450283L);
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-8209), (-1532599571), 18, 32091870);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7801164 + "'", int4 == 7801164);
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(304989469623405483L, (-873812));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 304989469623405483 * -873812");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 210);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 210 + "'", int1 == 210);
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(149248, (-523), (-107726616), (-9123345));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98454547) + "'", int4 == (-98454547));
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-3483304));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3483304) + "'", int1 == (-3483304));
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(126482100, (-610511170), (-185446), (-1119));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-168070) + "'", int4 == (-168070));
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 608209176, (java.lang.Object) (-32083661));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(954811, (-1259474), 33108325);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 954811 + "'", int3 == 954811);
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(124486545, 450);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 124486545 * 450");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-8700000), (-130200));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -8700000 * -130200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1175010), (-18371294726400000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1175010 * -18371294726400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-210), 108685080, (-2582129), 1470988428);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 108684870 + "'", int4 == 108684870);
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-5571553));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5571553) + "'", int1 == (-5571553));
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 13393, 350035111L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4688020241623");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-84756249), 580601, (-580601));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -84756249 for  must be in the range [580601,-580601]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-120480045), (-129224490), (-87));
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1990710, 1505073);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1990710 * 1505073");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(544849712088L, (long) 3499569);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1906739162082090072L + "'", long2 == 1906739162082090072L);
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 586810735, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 586810735L + "'", long2 == 586810735L);
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3035028, (-168472090), (-30352410));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2682116663065632L), (java.lang.Object) (-1582215500L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-17965), (-10689680));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -17965 * -10689680");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(210, (-1762675999));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 210 * -1762675999");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-951492298), 1718668813);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -951492298 * 1718668813");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2966L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2966) + "'", int1 == (-2966));
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-3480228));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(80, (-10398), (-601337), 947642470);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10318) + "'", int4 == (-10318));
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-23067514), 1989861, 17802);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) (-300490149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(304989469623405483L, (long) 1470998628);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 304989469623405483 * 1470998628");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3258179373094625L, (long) 1482832281);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3258180855926906L + "'", long2 == 3258180855926906L);
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(315640672L, (-45783438));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14451115136790336L) + "'", long2 == (-14451115136790336L));
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 105840302932360535L, (java.lang.Object) (-1585661515680L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1715149542), (-711052));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1715860594) + "'", int2 == (-1715860594));
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1010899), 246727979316L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-246728990215L) + "'", long2 == (-246728990215L));
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-607951483), 2005430);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -607951483 * 2005430");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-190217798), (-139503336), (-53318417), 1692170940);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1415768224 + "'", int4 == 1415768224);
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-99), (long) (-2966));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 293634L + "'", long2 == 293634L);
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1530020623L), 602790802266828L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 602789272246205L + "'", long2 == 602789272246205L);
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1794561, 115522675200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 207312487529587200L + "'", long2 == 207312487529587200L);
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 5220579, 155988945, 63649227);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5220579 for hi! must be in the range [155988945,63649227]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 493779, 34969884374403777L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 493779 * 34969884374403777");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-185812352), 47234, (-157922));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -185812352 for  must be in the range [47234,-157922]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-297481271), 171459354, (-10689680));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-708129348), (-600832203));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1308961551) + "'", int2 == (-1308961551));
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 149248, 600842000, 125967105);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-100459952), 94401367, (-843852));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-31916932), (java.lang.Object) (-789467264));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 188112985, (-27409742280L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27597855265L + "'", long2 == 27597855265L);
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3996819140L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3996819140L + "'", long2 == 3996819140L);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-210559234), (-1990710), 21963942);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-16929382), 6289801, (-1786407669));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(881233968378231L, (-1989524));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 881233968378231 * -1989524");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-17899), 3909, 73710, (-394648137));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1742278, 0, (-212411343), 99835208);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1742278 + "'", int4 == 1742278);
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 168443407, (-10037L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1690666476059");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1753701626), (-3396800), (-1713149062));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1715160045), 2005438, (-82215000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(155988945, (-1548000), (-580601), 1517218488);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 154440945 + "'", int4 == 154440945);
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 167335, (-103661485), 146361530);
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2208289L), (-49522428));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 109359833005692L + "'", long2 == 109359833005692L);
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-704619699), (-64244));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-704683943) + "'", int2 == (-704683943));
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(185877195);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-185877195) + "'", int1 == (-185877195));
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-38164L), (long) (-128133992));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-128172156L) + "'", long2 == (-128172156L));
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 85229052L, (java.lang.Object) (-7889211));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-34386307L), (-221156712468L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-221191098775L) + "'", long2 == (-221191098775L));
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 129926115, 0, 63649178);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 129926115 for  must be in the range [0,63649178]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-10047), 87410194, 233904432);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10047 for hi! must be in the range [87410194,233904432]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-168573390), 509218, (-130200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-31706623206000L), (long) 1025353728);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-31707648559728L) + "'", long2 == (-31707648559728L));
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-112110), (-62000), (-105975170));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -112110 for  must be in the range [-62000,-105975170]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-10969865), 9, 80635684);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69665811 + "'", int4 == 69665811);
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(35032L, (long) (-1788088016));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1788052984L) + "'", long2 == (-1788052984L));
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-17899), (-1925124040));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -17899 * -1925124040");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 848047583, 52, 677162);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-9737812), 272209956366432L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-272209966104244L) + "'", long2 == (-272209966104244L));
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-655556));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 655556 + "'", int1 == 655556);
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-168472090), (-27), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -168472090 for hi! must be in the range [-27,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(872, (-448826));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-391376272) + "'", int2 == (-391376272));
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3005272), (-1760510603), 4909);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3005272) + "'", int3 == (-3005272));
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-726563905100L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-20199512268L), (long) (-1563864028));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -20199512268 * -1563864028");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1370574, 5899809, 709901);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-448826), (-64244), (-15961217));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) -1, (-211672136), (-1715697100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-54948), 0, 638821068);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -54948 for hi! must be in the range [0,638821068]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 60512695038980800L, (java.lang.Object) 233904432);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1766929518), (-1631883), (-3480386), (-920));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-992165) + "'", int4 == (-992165));
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(7739630L, (-198L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7739828L + "'", long2 == 7739828L);
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 574676507, (-1631883), (-60437));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(5220579, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5220641 + "'", int2 == 5220641);
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-353600846), (long) (-1656143));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-351944703L) + "'", long2 == (-351944703L));
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-300969892), (-1010899), 1762676017);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -300969892 for  must be in the range [-1010899,1762676017]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(121054052L, (long) (-1785587));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 119268465L + "'", long2 == 119268465L);
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(23038755894L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 23038755894");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 12141, 290872717359585830L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 290872717359597971L + "'", long2 == 290872717359597971L);
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2284709, (-10049), 229788587);
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(73381892, 13594);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 73395486 + "'", int2 == 73395486);
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-314), (-105975170), (-1705));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-105973780) + "'", int3 == (-105973780));
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(316339074L, (long) (-314));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99330469236L) + "'", long2 == (-99330469236L));
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-36236678380355L), 1023872308403125L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -36236678380355 * 1023872308403125");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 634344346, 489444, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 634344346 for  must be in the range [489444,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-767464499), (-1718668813));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1319017299515969687L + "'", long2 == 1319017299515969687L);
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3483304), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3483304) + "'", int2 == (-3483304));
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1023879406695015L, (long) 204685393);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1023879406695015 * 204685393");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 110L, (java.lang.Object) 445);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(108685080, (-10), 126482100, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(352039597, 1535634, 14308, 100962303);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50731243 + "'", int4 == 50731243);
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(132752378724L, 48418L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 132752427142L + "'", long2 == 132752427142L);
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) 0, 951372194, (-1990710));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [951372194,-1990710]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 354520488, 0, 9691);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-149158L), 1765497216L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -263338033744128");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-100), 532423755, (-113827897));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -100 for hi! must be in the range [532423755,-113827897]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3778206), (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 377820600 + "'", int2 == 377820600);
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-709901), 2284709);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -709901 * 2284709");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 474143286250L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-34386408), 442560, 520);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 5220530, (java.lang.Object) (-8683));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(169182050, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 169182050 * 56");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2051278), 97, (-934667));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2051278 for hi! must be in the range [97,-934667]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2051648L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(38868600, 533301015, (-1738657));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-76433), (-4479760), 841);
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-22112703));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22112703 + "'", int1 == 22112703);
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2235464), 1763475345, 3045000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9762233596310000L, (java.lang.Object) 17981);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(99, (-3034108), (-4446561), (-2466));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3034009) + "'", int4 == (-3034009));
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(590319565L, (long) (-1944900));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 588374665L + "'", long2 == 588374665L);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(88593817038090L, (-24523640481L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 88593817038090 * -24523640481");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-696874493105108L), (long) 998888097);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-696875491993205L) + "'", long2 == (-696875491993205L));
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2005733, (-708510), 952906578);
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 6960, 1694976160, 518500854);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

