package org.joda.time.format;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField2.printTo(stringBuffer3, readablePartial4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer4, (long) (short) -1, chronology6, (int) (byte) 100, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = twoDigitYear3.parseInto(dateTimeParserBucket4, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
        java.io.Writer writer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField2.printTo(writer3, (long) (short) -1, chronology5, 100, dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType1, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(writer0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField11 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType9, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField14 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType12, true);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray15 = new org.joda.time.format.DateTimeParser[] { textField2, textField5, textField8, textField11, textField14 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser16 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = matchingParser16.parseInto(dateTimeParserBucket17, "hi!", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeParserArray15);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        java.lang.Class<?> wildcardClass4 = dateTimeFormatterBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType4, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName.SHORT_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        int int3 = textField2.estimatePrintedLength();
        java.io.Writer writer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField2.printTo(writer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendShortText(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer4, 0L, chronology6, (int) (short) 0, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        java.io.Writer writer18 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField12.printTo(writer18, 100L, chronology20, (int) ' ', dateTimeZone22, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendFractionOfDay(0, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendPattern("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer5, readablePartial6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendFraction(dateTimeFieldType9, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = textField2.parseInto(dateTimeParserBucket3, "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer4, writer5, (long) 6, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer4, 100L, chronology6, (int) (byte) 1, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField8.printTo(stringBuffer10, (long) (byte) 0, chronology12, 6, dateTimeZone14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket2 = null;
        int int5 = stringLiteral1.parseInto(dateTimeParserBucket2, "", (int) (short) -1);
        java.io.Writer writer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer6, readablePartial7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType6, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFixedDecimal(dateTimeFieldType9, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("", "hi!", true, 4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField8.printTo(stringBuffer10, readablePartial11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimePrinter dateTimePrinter1 = dateTimeFormatterBuilder0.toPrinter();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        java.lang.StringBuffer stringBuffer18 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField12.printTo(stringBuffer18, (long) (short) 0, chronology20, 0, dateTimeZone22, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField11 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType9, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField14 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType12, true);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray15 = new org.joda.time.format.DateTimeParser[] { textField2, textField5, textField8, textField11, textField14 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser16 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = matchingParser16.parseInto(dateTimeParserBucket17, "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeParserArray15);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        java.lang.StringBuffer stringBuffer18 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField12.printTo(stringBuffer18, (long) 1, chronology20, (-1), dateTimeZone22, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer4, (-1L), chronology6, (int) '#', dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField11 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType9, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField14 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType12, true);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray15 = new org.joda.time.format.DateTimeParser[] { textField2, textField5, textField8, textField11, textField14 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser16 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray15);
        java.lang.Class<?> wildcardClass17 = dateTimeParserArray15.getClass();
        org.junit.Assert.assertNotNull(dateTimeParserArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer4, (long) (byte) 1, chronology6, 4, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        int int5 = twoDigitYear3.estimateParsedLength();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer6, readablePartial7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        fraction3.iMaxDigits = 3;
        int int7 = fraction3.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = fraction3.parseInto(dateTimeParserBucket8, "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket2 = null;
        int int5 = stringLiteral1.parseInto(dateTimeParserBucket2, "", (int) (short) 100);
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(stringBuffer6, (long) (byte) 1, chronology8, (int) '#', dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-101) + "'", int5 == (-101));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder1.appendText(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendSignedDecimal(dateTimeFieldType5, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int2 = stringLiteral1.estimatePrintedLength();
        java.io.Writer writer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer3, (long) 10, chronology5, 3, dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendFraction(dateTimeFieldType9, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendShortText(dateTimeFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        int int0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName.LONG_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        java.lang.StringBuffer stringBuffer5 = null;
        java.io.Writer writer6 = null;
        org.joda.time.Chronology chronology8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer5, writer6, (long) 0, chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder4.appendFractionOfDay((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendYearOfCentury(3, 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendText(dateTimeFieldType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder18.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder18.appendSignedDecimal(dateTimeFieldType20, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendFixedDecimal(dateTimeFieldType3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendDecimal(dateTimeFieldType5, 20, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendFractionOfHour(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        java.io.Writer writer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer3, (long) 10, chronology5, (int) '4', dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.StringBuffer stringBuffer0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, 0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer3, readablePartial4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendWeekyear((int) ' ', (int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendShortText(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        java.io.Writer writer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField2.printTo(writer3, readablePartial4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) ' ', true);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(writer4, (long) 3, chronology6, 1, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder17.appendYear(20, 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder21.appendFraction(dateTimeFieldType22, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer5, (long) (byte) 10, chronology7, (int) 'a', dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendShortText(dateTimeFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendFraction(dateTimeFieldType8, (-101), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendFractionOfMinute((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendMinuteOfDay((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendWeekyear((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder17.appendYear(20, 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder17.appendSignedDecimal(dateTimeFieldType22, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendMillisOfDay((-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        fraction3.iMinDigits = 0;
        java.io.Writer writer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer7, readablePartial8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFixedSignedDecimal(dateTimeFieldType4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        java.io.Writer writer2 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer2, (long) (short) 0, chronology4, (-101), dateTimeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer5, (long) '4', chronology7, 0, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (short) -1, 0);
        java.io.Writer writer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendYearOfCentury(3, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendDayOfYear((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder0.appendFixedSignedDecimal(dateTimeFieldType15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket2 = null;
        int int5 = stringLiteral1.parseInto(dateTimeParserBucket2, "", (int) (short) 100);
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(stringBuffer6, (long) 6, chronology8, 0, dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-101) + "'", int5 == (-101));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "hi!", 6);
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(stringBuffer8, readablePartial9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField8.printTo(stringBuffer10, readablePartial11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFractionOfHour(4, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder8.appendTimeZoneOffset("", false, (int) (short) 0, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer4, (long) 1, chronology6, 0, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        fraction3.iMaxDigits = 3;
        int int7 = fraction3.estimatePrintedLength();
        fraction3.iMaxDigits = 20;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = fraction3.parseInto(dateTimeParserBucket10, "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendFractionOfDay((int) '#', 3);
        java.lang.Class<?> wildcardClass13 = dateTimeFormatterBuilder9.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        timeZoneOffset5.printTo(stringBuffer6, (long) 20, chronology8, (int) (byte) 10, dateTimeZone10, locale11);
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale15 = null;
        timeZoneOffset5.printTo(stringBuffer13, readablePartial14, locale15);
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        java.util.Locale locale22 = null;
        timeZoneOffset5.printTo(stringBuffer17, (long) (short) 1, chronology19, (int) (byte) 10, dateTimeZone21, locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = null;
        int int27 = timeZoneOffset5.parseInto(dateTimeParserBucket24, "hi!", 2);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = timeZoneOffset5.parseInto(dateTimeParserBucket28, "", (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -101");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer3, (long) 100, chronology5, (-1), dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendCenturyOfEra((int) 'a', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder6.appendTimeZoneOffset("", "", false, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField5.printTo(writer10, readablePartial11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (short) 0, false);
        java.io.Writer writer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendYearOfCentury(3, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendDayOfYear((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendDayOfMonth((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        int int3 = textField2.estimatePrintedLength();
        int int4 = textField2.estimatePrintedLength();
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField2.printTo(writer5, readablePartial6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction15 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType12, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral17 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        int int21 = stringLiteral17.parseInto(dateTimeParserBucket18, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) fraction15, (org.joda.time.format.DateTimeParser) stringLiteral17);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder11.appendText(dateTimeFieldType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendLiteral(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder5.appendTimeZoneOffset("", false, (-2), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendFixedSignedDecimal(dateTimeFieldType10, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        boolean boolean7 = dateTimeFormatterBuilder2.canBuildFormatter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder18.appendHalfdayOfDayText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendSecondOfMinute((-53));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMinuteOfHour(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder4.appendFraction(dateTimeFieldType7, (int) (byte) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.io.Writer writer0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(writer0, 0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeZoneId0.parseInto(dateTimeParserBucket5, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder1.append(dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No formatter supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int2 = stringLiteral1.estimatePrintedLength();
        java.io.Writer writer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer3, (long) (short) 10, chronology5, (int) (short) 1, dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        int int3 = textField2.estimatePrintedLength();
        int int4 = textField2.estimatePrintedLength();
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField2.printTo(writer5, 0L, chronology7, (-3), dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendDayOfYear((-53));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.append(dateTimeFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No formatter supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendMillisOfSecond(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "hi!", 6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = null;
        int int11 = fixedNumber3.parseInto(dateTimeParserBucket8, "hi!", 0);
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(stringBuffer12, readablePartial13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) (short) 100, false);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(stringBuffer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTimeZoneOffset("hi!", true, (int) '4', (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder12.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField24 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType22, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField27 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType25, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) textField24, (org.joda.time.format.DateTimeParser) textField27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder16.append((org.joda.time.format.DateTimePrinter) textField24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimeParser) textField24);
        java.lang.StringBuffer stringBuffer31 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        java.util.Locale locale36 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField24.printTo(stringBuffer31, (long) 32, chronology33, 3, dateTimeZone35, locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber4 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 4, false, (int) (byte) 1);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            paddedNumber4.printTo(stringBuffer5, (long) (short) 10, chronology7, 3, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(writer0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4, false);
        int int4 = twoDigitYear3.estimateParsedLength();
        java.lang.Class<?> wildcardClass5 = twoDigitYear3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        int int10 = textField8.estimatePrintedLength();
        java.io.Writer writer11 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField8.printTo(writer11, (long) (byte) 10, chronology13, 32, dateTimeZone15, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        int int6 = characterLiteral1.parseInto(dateTimeParserBucket3, "", 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral8 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int9 = stringLiteral8.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear13 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType10, (int) (short) 0, true);
        int int14 = twoDigitYear13.estimatePrintedLength();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap16 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName17 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction21 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType18, (int) (byte) 0, (int) (byte) 1);
        int int22 = fraction21.estimatePrintedLength();
        int int23 = fraction21.iMaxDigits;
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral25 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParser[] dateTimeParserArray26 = new org.joda.time.format.DateTimeParser[] { characterLiteral1, stringLiteral8, twoDigitYear13, timeZoneName17, fraction21, stringLiteral25 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser27 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = matchingParser27.parseInto(dateTimeParserBucket28, "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTimeParserArray26);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        fraction3.iMinDigits = (short) 1;
        java.io.Writer writer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer8, readablePartial9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.io.Writer writer0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(writer0, (-101));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral20 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimeParser) stringLiteral20);
        java.io.Writer writer22 = null;
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral20.printTo(writer22, readablePartial23, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatterBuilder0.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendTwoDigitWeekyear((-1), false);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendDecimal(dateTimeFieldType9, (-53), 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        fraction3.iMinDigits = (short) 1;
        java.io.Writer writer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer8, (long) (byte) 1, chronology10, (int) (short) 100, dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendText(dateTimeFieldType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap19 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendTimeZoneName(strMap19);
        boolean boolean21 = dateTimeFormatterBuilder20.canBuildParser();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket2 = null;
        int int5 = stringLiteral1.parseInto(dateTimeParserBucket2, "", (int) (short) -1);
        java.io.Writer writer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer6, (long) (short) 1, chronology8, (int) (byte) 1, dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral4 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.append((org.joda.time.format.DateTimePrinter) characterLiteral4, (org.joda.time.format.DateTimeParser) characterLiteral6);
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral4.printTo(stringBuffer8, (long) 10, chronology10, 3, dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimatePrintedLength();
        java.io.Writer writer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer3, readablePartial4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfSecond((-11), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.io.Writer writer1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(writer1, (long) (byte) 1, chronology3, (int) ' ', dateTimeZone5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral20 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimeParser) stringLiteral20);
        java.lang.StringBuffer stringBuffer22 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        java.util.Locale locale27 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral20.printTo(stringBuffer22, (long) 10, chronology24, (-11), dateTimeZone26, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.io.Writer writer0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(writer0, (int) (byte) 0);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTimeZoneOffset("hi!", true, (int) '4', (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder12.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField24 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType22, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField27 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType25, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) textField24, (org.joda.time.format.DateTimeParser) textField27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder16.append((org.joda.time.format.DateTimePrinter) textField24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimeParser) textField24);
        java.lang.StringBuffer stringBuffer31 = null;
        org.joda.time.ReadablePartial readablePartial32 = null;
        java.util.Locale locale33 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField24.printTo(stringBuffer31, readablePartial32, locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer5, readablePartial6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "hi!", 6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = null;
        int int11 = fixedNumber3.parseInto(dateTimeParserBucket8, "hi!", 0);
        int int12 = fixedNumber3.estimateParsedLength();
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(stringBuffer13, readablePartial14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        int int3 = textField2.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField2.printTo(stringBuffer4, (long) 'a', chronology6, 0, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder18.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder18.appendDecimal(dateTimeFieldType20, 4, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.StringBuffer stringBuffer0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, (-11));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (short) 0, false);
        int int4 = unpaddedNumber3.estimatePrintedLength();
        int int5 = unpaddedNumber3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer6, (long) ' ', chronology8, 4, dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        fraction3.iMaxDigits = 3;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = fraction3.parseInto(dateTimeParserBucket7, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendSecondOfDay((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendOptional((org.joda.time.format.DateTimeParser) characterLiteral6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder4.appendFixedSignedDecimal(dateTimeFieldType8, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear(4);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendTimeZoneName(strMap11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder8.appendFixedDecimal(dateTimeFieldType13, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "hi!", 6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = null;
        int int11 = fixedNumber3.parseInto(dateTimeParserBucket8, "hi!", 0);
        java.io.Writer writer12 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(writer12, (long) (-1), chronology14, 100, dateTimeZone16, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral20 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimeParser) stringLiteral20);
        java.lang.StringBuffer stringBuffer22 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        java.util.Locale locale27 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral20.printTo(stringBuffer22, (long) (short) 1, chronology24, 100, dateTimeZone26, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        int int10 = textField8.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField8.printTo(stringBuffer11, readablePartial12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMillisOfDay((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendMillisOfSecond((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (short) -1, 0);
        java.lang.StringBuffer stringBuffer4 = null;
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer4, writer5, (long) (-7), chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap1);
        int int3 = timeZoneName2.estimateParsedLength();
        int int4 = timeZoneName2.estimatePrintedLength();
        int int5 = timeZoneName2.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeZoneName2.parseInto(dateTimeParserBucket6, "", 20);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -20");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        int int18 = textField12.estimateParsedLength();
        java.lang.StringBuffer stringBuffer19 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField12.printTo(stringBuffer19, (long) (short) 1, chronology21, 20, dateTimeZone23, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendYear((int) 'a', (int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder1.appendText(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
        int int3 = textField2.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = textField2.parseInto(dateTimeParserBucket4, "", 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (short) 1, (int) (byte) 10);
        java.lang.StringBuffer stringBuffer4 = null;
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer4, writer5, (long) (byte) 100, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.iMinDigits;
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer5, (long) 4, chronology7, (-1), dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) (short) 100, false);
        int int4 = fixedNumber3.iMaxParsedDigits;
        int int5 = fixedNumber3.iMaxParsedDigits;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        int int9 = fixedNumber3.parseInto(dateTimeParserBucket6, "hi!", (int) (short) 100);
        int int10 = fixedNumber3.estimateParsedLength();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(stringBuffer11, readablePartial12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        int int6 = fraction3.iMaxDigits;
        java.io.Writer writer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer7, readablePartial8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        fraction3.iMinDigits = 0;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = fraction3.parseInto(dateTimeParserBucket7, "", 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneId0.printTo(writer5, readablePartial6, locale7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(stringBuffer9, (long) (byte) 100, chronology11, (int) (short) -1, dateTimeZone13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendCenturyOfEra((int) 'a', (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYearOfEra(100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder9.appendTimeZoneOffset("hi!", "hi!", false, (-3), 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendText(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int2 = stringLiteral1.estimatePrintedLength();
        java.io.Writer writer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer3, readablePartial4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) (short) 100, false);
        int int4 = fixedNumber3.iMaxParsedDigits;
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(stringBuffer5, (long) 'a', chronology7, (-11), dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer5, (long) (-7), chronology7, 0, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendSignedDecimal(dateTimeFieldType4, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField7 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType5, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendOptional((org.joda.time.format.DateTimeParser) textField7);
        java.io.Writer writer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField7.printTo(writer9, readablePartial10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (short) 0, false);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer4, (long) (-11), chronology6, (int) (short) 1, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        fraction3.iMaxDigits = 3;
        int int7 = fraction3.estimatePrintedLength();
        java.io.Writer writer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer8, readablePartial9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfHour((-21), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral4 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.append((org.joda.time.format.DateTimePrinter) characterLiteral4, (org.joda.time.format.DateTimeParser) characterLiteral6);
        java.io.Writer writer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral4.printTo(writer8, (long) 20, chronology10, (-101), dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "hi!", 6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = null;
        int int11 = fixedNumber3.parseInto(dateTimeParserBucket8, "hi!", 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = fixedNumber3.iFieldType;
        java.io.Writer writer13 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(writer13, (long) (short) -1, chronology15, (-11), dateTimeZone17, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dateTimeFieldType12);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction8 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType5, (int) (byte) 0, (int) (byte) 1);
        int int9 = fraction8.estimateParsedLength();
        fraction8.iMaxDigits = 3;
        int int12 = fraction8.estimatePrintedLength();
        fraction8.iMaxDigits = 20;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimeParser) fraction8);
        java.lang.StringBuffer stringBuffer16 = null;
        java.io.Writer writer17 = null;
        org.joda.time.Chronology chronology19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction8.printTo(stringBuffer16, writer17, (long) ' ', chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        int int4 = characterLiteral1.estimateParsedLength();
        int int5 = characterLiteral1.estimateParsedLength();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer6, readablePartial7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("", "hi!", true, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendHourOfHalfday(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder5.appendFraction(dateTimeFieldType6, (int) (byte) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (short) 0, false);
        int int4 = unpaddedNumber3.estimatePrintedLength();
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer5, readablePartial6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction8 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType5, (int) (byte) 0, (int) (byte) 1);
        int int9 = fraction8.estimateParsedLength();
        fraction8.iMaxDigits = 3;
        int int12 = fraction8.estimatePrintedLength();
        fraction8.iMaxDigits = 20;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimeParser) fraction8);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder4.appendFixedSignedDecimal(dateTimeFieldType16, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int2 = stringLiteral1.estimateParsedLength();
        java.io.Writer writer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer3, (long) (-101), chronology5, (-101), dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        fraction3.iMinDigits = (short) 1;
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer8, (long) '#', chronology10, 4, dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer4, (long) (-1), chronology6, (int) (short) 100, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 3, true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer4, (long) (short) 10, chronology6, (int) 'a', dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        fraction3.iMaxDigits = 3;
        int int7 = fraction3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer8, (long) 1, chronology10, (int) '#', dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        java.io.Writer writer2 = null;
        org.joda.time.ReadablePartial readablePartial3 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer2, readablePartial3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendMonthOfYear(6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendHourOfHalfday((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendFractionOfHour((-14), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        int int10 = textField8.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField8.printTo(stringBuffer11, readablePartial12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber4 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 2, false, 10);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            paddedNumber4.printTo(stringBuffer5, readablePartial6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "hi!", 6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = null;
        int int11 = fixedNumber3.parseInto(dateTimeParserBucket8, "hi!", 0);
        int int12 = fixedNumber3.estimateParsedLength();
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(stringBuffer13, readablePartial14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendSecondOfDay((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMinuteOfDay(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder6.appendTimeZoneOffset("hi!", false, 10, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        fraction3.iMaxDigits = 3;
        int int7 = fraction3.estimateParsedLength();
        int int8 = fraction3.iMaxDigits;
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer9, readablePartial10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction8 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType5, (int) (byte) 0, (int) (byte) 1);
        int int9 = fraction8.estimateParsedLength();
        fraction8.iMaxDigits = 3;
        int int12 = fraction8.estimatePrintedLength();
        fraction8.iMaxDigits = 20;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimeParser) fraction8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendMonthOfYearText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendDayOfMonth((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = fixedNumber3.iFieldType;
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(stringBuffer5, readablePartial6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeFieldType4);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendSecondOfDay((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendOptional((org.joda.time.format.DateTimeParser) characterLiteral6);
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral6.printTo(stringBuffer8, readablePartial9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendClockhourOfHalfday(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder20.appendEraText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendSecondOfDay((-53));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTimeZoneOffset("hi!", true, (int) '4', (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder12.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField24 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType22, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField27 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType25, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) textField24, (org.joda.time.format.DateTimeParser) textField27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder16.append((org.joda.time.format.DateTimePrinter) textField24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimeParser) textField24);
        java.io.Writer writer31 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        java.util.Locale locale36 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField24.printTo(writer31, 1L, chronology33, (int) (short) -1, dateTimeZone35, locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral20 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimeParser) stringLiteral20);
        int int22 = stringLiteral20.estimateParsedLength();
        int int23 = stringLiteral20.estimateParsedLength();
        java.io.Writer writer24 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        java.util.Locale locale29 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral20.printTo(writer24, (long) (short) 100, chronology26, (int) '4', dateTimeZone28, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "", (int) '4');
        java.io.Writer writer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(writer8, 0L, chronology10, 6, dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-53) + "'", int7 == (-53));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) (short) 100, false);
        int int4 = fixedNumber3.iMaxParsedDigits;
        int int5 = fixedNumber3.iMaxParsedDigits;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        int int9 = fixedNumber3.parseInto(dateTimeParserBucket6, "hi!", (int) (short) 100);
        java.io.Writer writer10 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(writer10, (long) (short) -1, chronology12, 13, dateTimeZone14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneId0.printTo(writer5, readablePartial6, locale7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        timeZoneId0.printTo(stringBuffer9, readablePartial10, locale11);
        int int13 = timeZoneId0.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = timeZoneId0.parseInto(dateTimeParserBucket14, "hi!", (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendSecondOfDay((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendOptional((org.joda.time.format.DateTimeParser) characterLiteral6);
        int int8 = characterLiteral6.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral6.printTo(stringBuffer9, 100L, chronology11, (-7), dateTimeZone13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = characterLiteral1.parseInto(dateTimeParserBucket4, "", (int) (byte) 10);
        int int8 = characterLiteral1.estimatePrintedLength();
        java.io.Writer writer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer9, readablePartial10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-11) + "'", int7 == (-11));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendYearOfCentury(3, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendDayOfMonth(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendFraction(dateTimeFieldType15, (-11), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        int int8 = twoDigitYear3.parseInto(dateTimeParserBucket5, "", 6);
        java.io.Writer writer9 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer9, (long) (-3), chronology11, (-2), dateTimeZone13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8 == (-7));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "hi!", 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = fixedNumber3.iFieldType;
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(stringBuffer9, (-1L), chronology11, 2, dateTimeZone13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertNull(dateTimeFieldType8);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendCenturyOfEra((int) 'a', (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYearOfEra(100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.appendTimeZoneOffset("", false, (-21), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendHourOfHalfday(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMinuteOfDay((-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendTwoDigitYear((-7));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder4.appendYear(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        int int6 = characterLiteral1.parseInto(dateTimeParserBucket3, "", 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral8 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int9 = stringLiteral8.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear13 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType10, (int) (short) 0, true);
        int int14 = twoDigitYear13.estimatePrintedLength();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap16 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName17 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction21 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType18, (int) (byte) 0, (int) (byte) 1);
        int int22 = fraction21.estimatePrintedLength();
        int int23 = fraction21.iMaxDigits;
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral25 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParser[] dateTimeParserArray26 = new org.joda.time.format.DateTimeParser[] { characterLiteral1, stringLiteral8, twoDigitYear13, timeZoneName17, fraction21, stringLiteral25 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser27 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = matchingParser27.parseInto(dateTimeParserBucket28, "hi!", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTimeParserArray26);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.io.Writer writer1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(writer1, (long) (short) 0, chronology3, (int) (short) 0, dateTimeZone5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (short) -1, 0);
        int int4 = fraction3.iMinDigits;
        java.lang.StringBuffer stringBuffer5 = null;
        java.io.Writer writer6 = null;
        org.joda.time.Chronology chronology8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer5, writer6, 1L, chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneId0.printTo(writer5, readablePartial6, locale7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        timeZoneId0.printTo(stringBuffer9, readablePartial10, locale11);
        int int13 = timeZoneId0.estimateParsedLength();
        int int14 = timeZoneId0.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale17 = null;
        timeZoneId0.printTo(stringBuffer15, readablePartial16, locale17);
        java.lang.StringBuffer stringBuffer19 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(stringBuffer19, 0L, chronology21, (int) (short) 10, dateTimeZone23, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 3, true);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer4, (long) 32, chronology6, 3, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatterBuilder7.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.append(dateTimeFormatter9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendPattern("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction15 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType12, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral17 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        int int21 = stringLiteral17.parseInto(dateTimeParserBucket18, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) fraction15, (org.joda.time.format.DateTimeParser) stringLiteral17);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear26 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType23, (int) (short) 0, true);
        int int27 = twoDigitYear26.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) twoDigitYear26);
        java.io.Writer writer29 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        java.util.Locale locale34 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear26.printTo(writer29, (long) (byte) 100, chronology31, 6, dateTimeZone33, locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap1);
        int int3 = timeZoneName2.estimateParsedLength();
        int int4 = timeZoneName2.estimatePrintedLength();
        int int5 = timeZoneName2.estimateParsedLength();
        java.io.Writer writer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale8 = null;
        timeZoneName2.printTo(writer6, readablePartial7, locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeZoneName2.parseInto(dateTimeParserBucket10, "hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.appendWeekyear((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap19 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendTimeZoneName(strMap19);
        java.lang.Class<?> wildcardClass21 = dateTimeFormatterBuilder17.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(writer0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        int int6 = characterLiteral1.parseInto(dateTimeParserBucket3, "", 1);
        java.io.Writer writer7 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer7, (long) (short) 100, chronology9, 1, dateTimeZone11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendYear((int) (byte) 10, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendMinuteOfHour((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = characterLiteral1.parseInto(dateTimeParserBucket2, "hi!", (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay(2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendClockhourOfHalfday(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendFixedSignedDecimal(dateTimeFieldType13, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction15 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType12, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral17 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        int int21 = stringLiteral17.parseInto(dateTimeParserBucket18, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) fraction15, (org.joda.time.format.DateTimeParser) stringLiteral17);
        java.io.Writer writer23 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        java.util.Locale locale28 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral17.printTo(writer23, (long) ' ', chronology25, (-53), dateTimeZone27, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4, true);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(writer4, (long) (-21), chronology6, 13, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneId0.printTo(writer5, readablePartial6, locale7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        timeZoneId0.printTo(stringBuffer9, readablePartial10, locale11);
        int int13 = timeZoneId0.estimateParsedLength();
        java.io.Writer writer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        java.util.Locale locale16 = null;
        timeZoneId0.printTo(writer14, readablePartial15, locale16);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = timeZoneId0.parseInto(dateTimeParserBucket18, "", (-14));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -14");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        fraction3.iMinDigits = 0;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = fraction3.parseInto(dateTimeParserBucket7, "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap1);
        java.io.Writer writer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        timeZoneName2.printTo(writer3, readablePartial4, locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZoneName2.parseInto(dateTimeParserBucket7, "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendYearOfCentury(3, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendMinuteOfDay((-53));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        int int10 = textField5.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField5.printTo(stringBuffer11, readablePartial12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendCenturyOfEra((int) 'a', (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId11 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        java.util.Locale locale14 = null;
        timeZoneId11.printTo(stringBuffer12, readablePartial13, locale14);
        java.io.Writer writer16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        java.util.Locale locale18 = null;
        timeZoneId11.printTo(writer16, readablePartial17, locale18);
        int int20 = timeZoneId11.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder9.append((org.joda.time.format.DateTimePrinter) timeZoneId11);
        java.io.Writer writer22 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        java.util.Locale locale27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId11.printTo(writer22, (long) (-14), chronology24, (-53), dateTimeZone26, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + timeZoneId11 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId11.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        fraction3.iMaxDigits = 3;
        int int7 = fraction3.estimatePrintedLength();
        fraction3.iMaxDigits = 20;
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer10, (long) 32, chronology12, 0, dateTimeZone14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendDayOfYear(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder0.appendFixedDecimal(dateTimeFieldType11, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        fraction3.iMaxDigits = 3;
        int int7 = fraction3.estimatePrintedLength();
        fraction3.iMaxDigits = 20;
        java.io.Writer writer10 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer10, (long) 20, chronology12, 3, dateTimeZone14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4, false);
        int int4 = twoDigitYear3.estimateParsedLength();
        int int5 = twoDigitYear3.estimateParsedLength();
        java.io.Writer writer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer6, readablePartial7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTimeZoneOffset("hi!", true, (int) '4', (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder12.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField24 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType22, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField27 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType25, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) textField24, (org.joda.time.format.DateTimeParser) textField27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder16.append((org.joda.time.format.DateTimePrinter) textField24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimeParser) textField24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder11.appendFractionOfHour((int) '4', (-1));
        dateTimeFormatterBuilder33.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder33.appendWeekOfWeekyear((-21));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) (short) 100, false);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendClockhourOfHalfday(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendSecondOfMinute((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField11 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType9, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField14 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType12, true);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray15 = new org.joda.time.format.DateTimeParser[] { textField2, textField5, textField8, textField11, textField14 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser16 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray15);
        int int17 = matchingParser16.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = matchingParser16.parseInto(dateTimeParserBucket18, "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeParserArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(writer0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendDayOfMonth((-21));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (short) 0, false);
        int int4 = unpaddedNumber3.estimatePrintedLength();
        int int5 = unpaddedNumber3.estimatePrintedLength();
        int int6 = unpaddedNumber3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer7, readablePartial8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) -1, true);
        java.io.Writer writer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimatePrintedLength();
        int int4 = characterLiteral1.estimateParsedLength();
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer5, readablePartial6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 3, true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer4, (long) ' ', chronology6, (-21), dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMinuteOfHour(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder4.appendDecimal(dateTimeFieldType7, (-7), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = characterLiteral1.parseInto(dateTimeParserBucket4, "", (int) (byte) 10);
        java.io.Writer writer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer8, (long) (short) 0, chronology10, (int) (short) 0, dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-11) + "'", int7 == (-11));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneId0.printTo(writer5, readablePartial6, locale7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        timeZoneId0.printTo(stringBuffer9, readablePartial10, locale11);
        int int13 = timeZoneId0.estimateParsedLength();
        java.io.Writer writer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        java.util.Locale locale16 = null;
        timeZoneId0.printTo(writer14, readablePartial15, locale16);
        int int18 = timeZoneId0.estimatePrintedLength();
        java.io.Writer writer19 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(writer19, (long) (-21), chronology21, (-1), dateTimeZone23, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear(4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendTwoDigitYear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral14 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int15 = stringLiteral14.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder10.appendOptional((org.joda.time.format.DateTimeParser) stringLiteral14);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendSecondOfDay(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder16.appendHourOfDay((-98));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendShortText(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        int int8 = timeZoneId0.parseInto(dateTimeParserBucket5, "hi!", 1);
        java.io.Writer writer9 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(writer9, (long) (-101), chronology11, (int) 'a', dateTimeZone13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder4.appendMonthOfYearText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4, false);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer4, (long) (byte) 0, chronology6, (-11), dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFractionOfHour(4, 4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendClockhourOfHalfday(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder11.appendSignedDecimal(dateTimeFieldType14, (int) (byte) 100, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (short) 0, false);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer4, (long) 3, chronology6, (int) (byte) 10, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 3, true);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer4, (long) 10, chronology6, 20, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendFractionOfDay(0, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType6, (int) (short) -1, (-53));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        fraction3.iMinDigits = 0;
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer7, readablePartial8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer3, (long) (short) 1, chronology5, (int) (short) 100, dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer5, readablePartial6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "", (int) '4');
        java.io.Writer writer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(writer8, readablePartial9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-53) + "'", int7 == (-53));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        int int4 = characterLiteral1.estimateParsedLength();
        int int5 = characterLiteral1.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer6, (long) (-3), chronology8, (int) (byte) 10, dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (-101), false);
        int int4 = twoDigitYear3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer5, (long) (short) 100, chronology7, (int) '#', dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int2 = stringLiteral1.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(stringBuffer3, readablePartial4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatterBuilder0.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendClockhourOfHalfday((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 2, true);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer4, (long) (byte) 1, chronology6, (-98), dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendTimeZoneShortName(strMap7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendDayOfMonth((-14));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('a');
        java.lang.StringBuffer stringBuffer2 = null;
        org.joda.time.ReadablePartial readablePartial3 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer2, readablePartial3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay(2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendMonthOfYearText();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder7.appendFraction(dateTimeFieldType11, 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        int int6 = characterLiteral1.parseInto(dateTimeParserBucket3, "hi!", 20);
        java.io.Writer writer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer7, readablePartial8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-21) + "'", int6 == (-21));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int2 = stringLiteral1.estimatePrintedLength();
        int int3 = stringLiteral1.estimatePrintedLength();
        int int4 = stringLiteral1.estimateParsedLength();
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer5, (long) 10, chronology7, (int) (short) 10, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap1);
        int int3 = timeZoneName2.estimateParsedLength();
        int int4 = timeZoneName2.estimateParsedLength();
        int int5 = timeZoneName2.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneName2.printTo(stringBuffer6, (long) 32, chronology8, 32, dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendMillisOfSecond((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder20.appendDayOfWeekText();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder20.appendFraction(dateTimeFieldType22, (-11), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneId0.printTo(writer5, readablePartial6, locale7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(stringBuffer9, (long) 1, chronology11, (int) (byte) 100, dateTimeZone13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        int int8 = twoDigitYear3.parseInto(dateTimeParserBucket5, "", 6);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer9, (long) 0, chronology11, 100, dateTimeZone13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8 == (-7));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral4 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.append((org.joda.time.format.DateTimePrinter) characterLiteral4, (org.joda.time.format.DateTimeParser) characterLiteral6);
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral6.printTo(stringBuffer8, 0L, chronology10, 20, dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear(4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendTwoDigitYear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral14 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int15 = stringLiteral14.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder10.appendOptional((org.joda.time.format.DateTimeParser) stringLiteral14);
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.ReadablePartial readablePartial18 = null;
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral14.printTo(stringBuffer17, readablePartial18, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        int int10 = textField8.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = textField8.parseInto(dateTimeParserBucket11, "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral4 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.append((org.joda.time.format.DateTimePrinter) characterLiteral4, (org.joda.time.format.DateTimeParser) characterLiteral6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder2.appendPattern("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatterBuilder0.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendShortText(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneId0.printTo(writer5, readablePartial6, locale7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        timeZoneId0.printTo(stringBuffer9, readablePartial10, locale11);
        int int13 = timeZoneId0.estimateParsedLength();
        java.io.Writer writer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        java.util.Locale locale16 = null;
        timeZoneId0.printTo(writer14, readablePartial15, locale16);
        java.io.Writer writer18 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(writer18, (long) '#', chronology20, (int) (byte) 1, dateTimeZone22, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendSecondOfDay((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(writer0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((-1), strMap1);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField7 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType5, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendOptional((org.joda.time.format.DateTimeParser) textField7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = textField7.parseInto(dateTimeParserBucket9, "", (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4, false);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer4, (long) (byte) 100, chronology6, (int) (short) 1, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) (short) 100, false);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(writer4, (long) 20, chronology6, 13, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendFractionOfMinute(10, 20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder1.appendSecondOfMinute((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = fraction3.parseInto(dateTimeParserBucket5, "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.StringBuffer stringBuffer0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, (-98));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendMonthOfYearShortText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendYearOfCentury((-14), (-14));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = dateTimeFormatterBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendYearOfEra(2, 13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendTwoDigitYear((-7), true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendTwoDigitYear(100, true);
        dateTimeFormatterBuilder12.clear();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 3, true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer4, (long) (-14), chronology6, (int) (short) 10, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendFixedDecimal(dateTimeFieldType9, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int2 = stringLiteral1.estimateParsedLength();
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(stringBuffer3, readablePartial4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendClockhourOfHalfday(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder20.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendLiteral("");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder20.appendDayOfWeek((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        int int4 = characterLiteral1.estimateParsedLength();
        int int5 = characterLiteral1.estimateParsedLength();
        java.io.Writer writer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer6, (long) 1, chronology8, 0, dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int2 = stringLiteral1.estimatePrintedLength();
        java.io.Writer writer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer3, readablePartial4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction15 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType12, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral17 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        int int21 = stringLiteral17.parseInto(dateTimeParserBucket18, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) fraction15, (org.joda.time.format.DateTimeParser) stringLiteral17);
        java.lang.StringBuffer stringBuffer23 = null;
        java.io.Writer writer24 = null;
        org.joda.time.Chronology chronology26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction15.printTo(stringBuffer23, writer24, (long) 10, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder17.appendFractionOfSecond((int) 'a', (int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder21.appendFraction(dateTimeFieldType22, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear13 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType10, (int) (short) 0, true);
        int int14 = twoDigitYear13.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = null;
        int int18 = twoDigitYear13.parseInto(dateTimeParserBucket15, "", 6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder19.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder19.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField31 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType29, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField34 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType32, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder26.append((org.joda.time.format.DateTimePrinter) textField31, (org.joda.time.format.DateTimeParser) textField34);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder23.append((org.joda.time.format.DateTimePrinter) textField31);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder36.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder36.appendYear(20, 4);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral42 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = null;
        int int46 = stringLiteral42.parseInto(dateTimeParserBucket43, "hi!", 20);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap48 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName49 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap48);
        int int50 = timeZoneName49.estimateParsedLength();
        java.lang.StringBuffer stringBuffer51 = null;
        org.joda.time.ReadablePartial readablePartial52 = null;
        java.util.Locale locale53 = null;
        timeZoneName49.printTo(stringBuffer51, readablePartial52, locale53);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder55.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral59 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral61 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder57.append((org.joda.time.format.DateTimePrinter) characterLiteral59, (org.joda.time.format.DateTimeParser) characterLiteral61);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral64 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int65 = stringLiteral64.estimateParsedLength();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray66 = new org.joda.time.format.DateTimeParser[] { timeZoneName49, characterLiteral59, stringLiteral64 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser67 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray66);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder36.append((org.joda.time.format.DateTimePrinter) stringLiteral42, dateTimeParserArray66);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) twoDigitYear13, dateTimeParserArray66);
        java.lang.StringBuffer stringBuffer70 = null;
        org.joda.time.ReadablePartial readablePartial71 = null;
        java.util.Locale locale72 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear13.printTo(stringBuffer70, readablePartial71, locale72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-21) + "'", int46 == (-21));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 20 + "'", int50 == 20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(dateTimeParserArray66);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder69);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) -1, true);
        int int4 = twoDigitYear3.estimateParsedLength();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer5, 0L, chronology7, (int) (byte) 1, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfMonth(3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendPattern("");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendFixedSignedDecimal(dateTimeFieldType7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder18.appendHalfdayOfDayText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.appendSecondOfDay((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField24 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType22, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField27 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType25, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) textField24, (org.joda.time.format.DateTimeParser) textField27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimeParser) textField27);
        int int30 = textField27.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer31 = null;
        org.joda.time.ReadablePartial readablePartial32 = null;
        java.util.Locale locale33 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField27.printTo(stringBuffer31, readablePartial32, locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = characterLiteral1.parseInto(dateTimeParserBucket4, "", (int) (byte) 10);
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer8, readablePartial9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-11) + "'", int7 == (-11));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int2 = stringLiteral1.estimatePrintedLength();
        int int3 = stringLiteral1.estimateParsedLength();
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer4, (long) (short) 0, chronology6, (-21), dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction15 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType12, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral17 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        int int21 = stringLiteral17.parseInto(dateTimeParserBucket18, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) fraction15, (org.joda.time.format.DateTimeParser) stringLiteral17);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendWeekOfWeekyear((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder22.appendCenturyOfEra((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        timeZoneOffset5.printTo(stringBuffer6, (long) 20, chronology8, (int) (byte) 10, dateTimeZone10, locale11);
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale15 = null;
        timeZoneOffset5.printTo(stringBuffer13, readablePartial14, locale15);
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        java.util.Locale locale22 = null;
        timeZoneOffset5.printTo(stringBuffer17, (long) (short) 1, chronology19, (int) (byte) 10, dateTimeZone21, locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = null;
        int int27 = timeZoneOffset5.parseInto(dateTimeParserBucket24, "hi!", 2);
        java.lang.StringBuffer stringBuffer28 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        java.util.Locale locale33 = null;
        timeZoneOffset5.printTo(stringBuffer28, (long) 6, chronology30, (-1), dateTimeZone32, locale33);
        int int35 = timeZoneOffset5.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int39 = timeZoneOffset5.parseInto(dateTimeParserBucket36, "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 13 + "'", int35 == 13);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        java.lang.StringBuffer stringBuffer2 = null;
        org.joda.time.ReadablePartial readablePartial3 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(stringBuffer2, readablePartial3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendHourOfHalfday(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendSecondOfDay((-14));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        int int6 = fraction3.iMaxDigits;
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer7, readablePartial8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendYearOfEra(2, 13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendTwoDigitYear((-7), true);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder6.appendFraction(dateTimeFieldType10, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatterBuilder6.toParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder6.appendDecimal(dateTimeFieldType8, (-98), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "", (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = fixedNumber3.parseInto(dateTimeParserBucket8, "hi!", (-98));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-53) + "'", int7 == (-53));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendFractionOfDay(0, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendTwoDigitYear(6, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendHourOfDay((-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        int int6 = characterLiteral1.parseInto(dateTimeParserBucket3, "hi!", 20);
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer7, readablePartial8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-21) + "'", int6 == (-21));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName(32, strMap1);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = timeZoneName2.parseInto(dateTimeParserBucket3, "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 3, true);
        java.io.Writer writer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer5, (long) (byte) -1, chronology7, (-101), dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction8 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType5, (int) (byte) 0, (int) (byte) 1);
        int int9 = fraction8.estimateParsedLength();
        fraction8.iMaxDigits = 3;
        int int12 = fraction8.estimatePrintedLength();
        fraction8.iMaxDigits = 20;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimeParser) fraction8);
        java.lang.StringBuffer stringBuffer16 = null;
        java.io.Writer writer17 = null;
        org.joda.time.Chronology chronology19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction8.printTo(stringBuffer16, writer17, 0L, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4, false);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(stringBuffer4, 1L, chronology6, (-14), dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendYear((int) 'a', (int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMonthOfYear(32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendHourOfHalfday((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        int int13 = textField12.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber24 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType21, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = null;
        int int28 = fixedNumber24.parseInto(dateTimeParserBucket25, "hi!", 6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = null;
        int int32 = fixedNumber24.parseInto(dateTimeParserBucket29, "hi!", 0);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral34 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int35 = stringLiteral34.estimatePrintedLength();
        int int36 = stringLiteral34.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber40 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType37, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = null;
        int int44 = fixedNumber40.parseInto(dateTimeParserBucket41, "hi!", 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = fixedNumber40.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset51 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        int int52 = timeZoneOffset51.estimateParsedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber56 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType53, (int) ' ', true);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear60 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType57, (-14), false);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField63 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType61, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField66 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType64, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField69 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType67, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField72 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType70, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField75 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType73, true);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray76 = new org.joda.time.format.DateTimeParser[] { textField63, textField66, textField69, textField72, textField75 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser77 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray76);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser78 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray76);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray79 = new org.joda.time.format.DateTimeParser[] { stringLiteral34, fixedNumber40, timeZoneOffset51, fixedNumber56, twoDigitYear60, matchingParser78 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder80 = dateTimeFormatterBuilder20.append((org.joda.time.format.DateTimePrinter) fixedNumber24, dateTimeParserArray79);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder81 = dateTimeFormatterBuilder9.append((org.joda.time.format.DateTimePrinter) textField12, dateTimeParserArray79);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder83 = dateTimeFormatterBuilder81.appendText(dateTimeFieldType82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-7) + "'", int28 == (-7));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-7) + "'", int44 == (-7));
        org.junit.Assert.assertNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 13 + "'", int52 == 13);
        org.junit.Assert.assertNotNull(dateTimeParserArray76);
        org.junit.Assert.assertNotNull(dateTimeParserArray79);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder80);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder81);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        timeZoneOffset5.printTo(stringBuffer6, (long) 20, chronology8, (int) (byte) 10, dateTimeZone10, locale11);
        java.io.Writer writer13 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        java.util.Locale locale18 = null;
        timeZoneOffset5.printTo(writer13, (long) (-101), chronology15, (int) (short) -1, dateTimeZone17, locale18);
        int int20 = timeZoneOffset5.estimateParsedLength();
        java.lang.Class<?> wildcardClass21 = timeZoneOffset5.getClass();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        int int4 = characterLiteral1.estimateParsedLength();
        int int5 = characterLiteral1.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        int int9 = characterLiteral1.parseInto(dateTimeParserBucket6, "hi!", (int) 'a');
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer10, readablePartial11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-98) + "'", int9 == (-98));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int2 = stringLiteral1.estimateParsedLength();
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(stringBuffer3, (long) 32, chronology5, (-53), dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField11 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType9, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField14 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType12, true);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray15 = new org.joda.time.format.DateTimeParser[] { textField2, textField5, textField8, textField11, textField14 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser16 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray15);
        int int17 = matchingParser16.estimateParsedLength();
        int int18 = matchingParser16.estimateParsedLength();
        int int19 = matchingParser16.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = matchingParser16.parseInto(dateTimeParserBucket20, "hi!", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeParserArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendFractionOfHour((int) '#', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendHourOfDay((-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral4 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.append((org.joda.time.format.DateTimePrinter) characterLiteral4, (org.joda.time.format.DateTimeParser) characterLiteral6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = characterLiteral6.parseInto(dateTimeParserBucket8, "", (-21));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -21");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        fraction3.iMinDigits = 0;
        java.io.Writer writer7 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer7, (long) 32, chronology9, (-53), dateTimeZone11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer4, (-1L), chronology6, (int) 'a', dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        java.io.Writer writer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer3, (-1L), chronology5, (-21), dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMinuteOfHour((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder4.appendFixedDecimal(dateTimeFieldType7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap1);
        int int3 = timeZoneName2.estimateParsedLength();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneName2.printTo(stringBuffer4, (long) 20, chronology6, (-98), dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField10 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType8, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField13 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType11, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder5.append((org.joda.time.format.DateTimePrinter) textField10, (org.joda.time.format.DateTimeParser) textField13);
        int int15 = textField13.estimatePrintedLength();
        int int16 = textField13.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.appendOptional((org.joda.time.format.DateTimeParser) textField13);
        java.lang.StringBuffer stringBuffer18 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField13.printTo(stringBuffer18, (-1L), chronology20, (int) 'a', dateTimeZone22, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField24 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType22, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField27 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType25, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) textField24, (org.joda.time.format.DateTimeParser) textField27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimeParser) textField27);
        int int30 = textField27.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer31 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        java.util.Locale locale36 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField27.printTo(stringBuffer31, (long) ' ', chronology33, (int) (short) 0, dateTimeZone35, locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap1);
        java.io.Writer writer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        timeZoneName2.printTo(writer3, readablePartial4, locale5);
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneName2.printTo(stringBuffer7, (long) 'a', chronology9, 6, dateTimeZone11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (short) 0, false);
        int int4 = unpaddedNumber3.estimatePrintedLength();
        int int5 = unpaddedNumber3.estimatePrintedLength();
        int int6 = unpaddedNumber3.estimatePrintedLength();
        java.io.Writer writer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer7, readablePartial8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendFractionOfSecond((int) (byte) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendDayOfWeek((-14));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendYearOfCentury(3, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendDayOfYear((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendTimeZoneName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendPattern("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.iMinDigits;
        int int5 = fraction3.iMaxDigits;
        java.io.Writer writer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer6, (long) (-1), chronology8, 3, dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        java.lang.StringBuffer stringBuffer18 = null;
        org.joda.time.ReadablePartial readablePartial19 = null;
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField12.printTo(stringBuffer18, readablePartial19, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction15 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType12, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral17 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        int int21 = stringLiteral17.parseInto(dateTimeParserBucket18, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) fraction15, (org.joda.time.format.DateTimeParser) stringLiteral17);
        java.io.Writer writer23 = null;
        org.joda.time.ReadablePartial readablePartial24 = null;
        java.util.Locale locale25 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral17.printTo(writer23, readablePartial24, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendFractionOfDay(0, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendMillisOfSecond(10);
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendOptional(dateTimeParser9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No parser supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction15 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType12, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral17 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        int int21 = stringLiteral17.parseInto(dateTimeParserBucket18, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) fraction15, (org.joda.time.format.DateTimeParser) stringLiteral17);
        fraction15.iMaxDigits = 4;
        fraction15.iMaxDigits = (-11);
        java.lang.StringBuffer stringBuffer27 = null;
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale29 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction15.printTo(stringBuffer27, readablePartial28, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        int int10 = textField8.estimatePrintedLength();
        int int11 = textField8.estimateParsedLength();
        java.io.Writer writer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField8.printTo(writer12, readablePartial13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendClockhourOfHalfday((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        int int10 = textField8.estimatePrintedLength();
        java.io.Writer writer11 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField8.printTo(writer11, (long) (-101), chronology13, (int) (short) 1, dateTimeZone15, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        int int6 = characterLiteral1.parseInto(dateTimeParserBucket3, "", 1);
        java.io.Writer writer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer7, readablePartial8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction15 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType12, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral17 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        int int21 = stringLiteral17.parseInto(dateTimeParserBucket18, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) fraction15, (org.joda.time.format.DateTimeParser) stringLiteral17);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear26 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType23, (int) (short) 0, true);
        int int27 = twoDigitYear26.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) twoDigitYear26);
        java.lang.StringBuffer stringBuffer29 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        java.util.Locale locale34 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear26.printTo(stringBuffer29, (long) (short) 100, chronology31, 20, dateTimeZone33, locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendClockhourOfHalfday(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendHourOfHalfday(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder22.appendDayOfWeekText();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder23.appendDecimal(dateTimeFieldType24, 3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap7);
        dateTimeFormatterBuilder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder0.toFormatter();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Both printing and parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneId0.printTo(writer5, readablePartial6, locale7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        timeZoneId0.printTo(stringBuffer9, readablePartial10, locale11);
        int int13 = timeZoneId0.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = timeZoneId0.parseInto(dateTimeParserBucket14, "", (-14));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -14");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap1);
        int int3 = timeZoneName2.estimateParsedLength();
        int int4 = timeZoneName2.estimateParsedLength();
        int int5 = timeZoneName2.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeZoneName2.parseInto(dateTimeParserBucket6, "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        fraction3.iMinDigits = 0;
        java.io.Writer writer7 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer7, (long) 13, chronology9, (-98), dateTimeZone11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = characterLiteral1.parseInto(dateTimeParserBucket4, "", (int) (byte) 10);
        int int8 = characterLiteral1.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer9, 0L, chronology11, (int) ' ', dateTimeZone13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-11) + "'", int7 == (-11));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendDecimal(dateTimeFieldType7, 2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        fraction3.iMinDigits = (short) 1;
        java.lang.StringBuffer stringBuffer8 = null;
        java.io.Writer writer9 = null;
        org.joda.time.Chronology chronology11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer8, writer9, (long) 100, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendYear((int) (byte) 10, 2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField14 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType12, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField17 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType15, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder9.append((org.joda.time.format.DateTimePrinter) textField14, (org.joda.time.format.DateTimeParser) textField17);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder9.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction24 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType21, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral26 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = null;
        int int30 = stringLiteral26.parseInto(dateTimeParserBucket27, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder20.append((org.joda.time.format.DateTimePrinter) fraction24, (org.joda.time.format.DateTimeParser) stringLiteral26);
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral33 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int34 = characterLiteral33.estimateParsedLength();
        int int35 = characterLiteral33.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder8.append((org.joda.time.format.DateTimePrinter) stringLiteral26, (org.joda.time.format.DateTimeParser) characterLiteral33);
        java.lang.StringBuffer stringBuffer37 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        java.util.Locale locale42 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral26.printTo(stringBuffer37, (long) (-2), chronology39, (int) '4', dateTimeZone41, locale42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-101) + "'", int30 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber4 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 4, false, (int) (byte) 1);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            paddedNumber4.printTo(stringBuffer5, readablePartial6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        int int6 = characterLiteral1.parseInto(dateTimeParserBucket3, "hi!", 20);
        int int7 = characterLiteral1.estimatePrintedLength();
        java.io.Writer writer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer8, readablePartial9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-21) + "'", int6 == (-21));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (short) 0, false);
        int int4 = unpaddedNumber3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer5, (long) (-101), chronology7, (-14), dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        int int8 = twoDigitYear3.parseInto(dateTimeParserBucket5, "", 13);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer9, readablePartial10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-14) + "'", int8 == (-14));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendYearOfCentury(3, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendDayOfMonth(20);
        dateTimeFormatterBuilder14.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendTimeZoneId();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        int int6 = timeZoneOffset5.estimateParsedLength();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        timeZoneOffset5.printTo(stringBuffer7, readablePartial8, locale9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendClockhourOfHalfday(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder20.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder20.appendFractionOfMinute(6, (int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder20.appendFixedSignedDecimal(dateTimeFieldType27, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        java.io.Writer writer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField2.printTo(writer3, 1L, chronology5, (-21), dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField10 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType8, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField13 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType11, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder5.append((org.joda.time.format.DateTimePrinter) textField10, (org.joda.time.format.DateTimeParser) textField13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder5.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction20 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType17, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral22 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = null;
        int int26 = stringLiteral22.parseInto(dateTimeParserBucket23, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder16.append((org.joda.time.format.DateTimePrinter) fraction20, (org.joda.time.format.DateTimeParser) stringLiteral22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder0.appendOptional((org.joda.time.format.DateTimeParser) stringLiteral22);
        java.io.Writer writer29 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        java.util.Locale locale34 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral22.printTo(writer29, (long) (short) 1, chronology31, (-2), dateTimeZone33, locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-101) + "'", int26 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap1);
        int int3 = timeZoneName2.estimateParsedLength();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        timeZoneName2.printTo(stringBuffer4, readablePartial5, locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeZoneName2.parseInto(dateTimeParserBucket8, "", (-21));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -21");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        int int5 = twoDigitYear3.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = twoDigitYear3.parseInto(dateTimeParserBucket6, "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendYearOfEra(2, 13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder3.appendTimeZoneOffset("hi!", "", false, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendMillisOfSecond(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendHourOfDay((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket2 = null;
        int int5 = stringLiteral1.parseInto(dateTimeParserBucket2, "hi!", 20);
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(stringBuffer6, (long) 3, chronology8, 10, dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-21) + "'", int5 == (-21));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTimeZoneOffset("hi!", true, (int) '4', (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder12.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField24 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType22, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField27 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType25, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) textField24, (org.joda.time.format.DateTimeParser) textField27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder16.append((org.joda.time.format.DateTimePrinter) textField24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimeParser) textField24);
        java.io.Writer writer31 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        java.util.Locale locale36 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField24.printTo(writer31, (long) (-7), chronology33, 32, dateTimeZone35, locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('4');
        java.lang.StringBuffer stringBuffer2 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer2, (long) 3, chronology4, (-7), dateTimeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        java.lang.Class<?> wildcardClass8 = dateTimeFormatterBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField10 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType8, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField13 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType11, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder5.append((org.joda.time.format.DateTimePrinter) textField10, (org.joda.time.format.DateTimeParser) textField13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder5.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction20 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType17, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral22 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = null;
        int int26 = stringLiteral22.parseInto(dateTimeParserBucket23, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder16.append((org.joda.time.format.DateTimePrinter) fraction20, (org.joda.time.format.DateTimeParser) stringLiteral22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder0.appendOptional((org.joda.time.format.DateTimeParser) stringLiteral22);
        java.lang.StringBuffer stringBuffer29 = null;
        org.joda.time.ReadablePartial readablePartial30 = null;
        java.util.Locale locale31 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral22.printTo(stringBuffer29, readablePartial30, locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-101) + "'", int26 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4, false);
        java.io.Writer writer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendYearOfCentury(3, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendDayOfMonth(20);
        dateTimeFormatterBuilder14.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendPattern("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 0, false);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = twoDigitYear3.parseInto(dateTimeParserBucket4, "", (-98));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendTwoDigitWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFixedSignedDecimal(dateTimeFieldType12, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction8 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType5, (int) (byte) 0, (int) (byte) 1);
        int int9 = fraction8.estimateParsedLength();
        fraction8.iMaxDigits = 3;
        int int12 = fraction8.estimatePrintedLength();
        fraction8.iMaxDigits = 20;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimeParser) fraction8);
        boolean boolean16 = dateTimeFormatterBuilder4.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder4.appendMillisOfDay((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder4.appendTimeZoneOffset("hi!", "", false, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendDayOfYear((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendHourOfDay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        int int8 = twoDigitYear3.parseInto(dateTimeParserBucket5, "", 6);
        java.io.Writer writer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer9, readablePartial10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8 == (-7));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendTwoDigitWeekyear((-3));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendYear((-98), 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendTwoDigitWeekyear((-3));
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction24 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType21, (int) (short) -1, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder17.append((org.joda.time.format.DateTimeParser) fraction24);
        java.io.Writer writer26 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        java.util.Locale locale31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction24.printTo(writer26, (long) (-98), chronology28, (int) (short) 0, dateTimeZone30, locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        java.io.Writer writer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer3, (long) 10, chronology5, (-3), dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendSecondOfDay((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendOptional((org.joda.time.format.DateTimeParser) characterLiteral6);
        int int8 = characterLiteral6.estimatePrintedLength();
        java.io.Writer writer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral6.printTo(writer9, readablePartial10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder1.appendFractionOfDay(0, 4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendYearOfCentury((int) '#', 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendCenturyOfEra((int) 'a', (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYearOfEra(100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendSecondOfMinute((-21));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("", "hi!", false, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        fraction3.iMaxDigits = 3;
        int int7 = fraction3.estimatePrintedLength();
        fraction3.iMaxDigits = 20;
        int int10 = fraction3.iMinDigits;
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer11, (long) 13, chronology13, 35, dateTimeZone15, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("", "hi!", false, (-21), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        java.io.Writer writer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer4, (long) (-3), chronology6, (-14), dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral4 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.append((org.joda.time.format.DateTimePrinter) characterLiteral4, (org.joda.time.format.DateTimeParser) characterLiteral6);
        java.io.Writer writer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral6.printTo(writer8, (long) 4, chronology10, 0, dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        java.io.Writer writer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendMinuteOfDay((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder17.appendDayOfMonth(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendMillisOfDay((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneId0.printTo(writer5, readablePartial6, locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeZoneId0.parseInto(dateTimeParserBucket9, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((-3), strMap1);
        java.io.Writer writer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneName2.printTo(writer3, (long) 1, chronology5, (int) (short) 10, dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (-21), false);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer4, (long) (-11), chronology6, 3, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral20 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimeParser) stringLiteral20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder18.appendMonthOfYearText();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder23.appendDecimal(dateTimeFieldType24, (-11), (-14));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneId0.printTo(writer5, readablePartial6, locale7);
        java.io.Writer writer9 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(writer9, (long) (-53), chronology11, 20, dateTimeZone13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) (byte) 100, strMap1);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = timeZoneName2.parseInto(dateTimeParserBucket3, "", 20);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -20");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (short) 0, false);
        int int4 = unpaddedNumber3.estimateParsedLength();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer5, (long) (short) 100, chronology7, 3, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendYear((int) 'a', (int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMonthOfYear(32);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder4.appendYearOfEra((int) (short) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder4.appendDayOfWeek((-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 1, false);
        java.io.Writer writer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendFractionOfHour(1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendTwoDigitYear(0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        timeZoneOffset5.printTo(stringBuffer6, (long) 20, chronology8, (int) (byte) 10, dateTimeZone10, locale11);
        java.io.Writer writer13 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        java.util.Locale locale18 = null;
        timeZoneOffset5.printTo(writer13, (long) (byte) 100, chronology15, (-101), dateTimeZone17, locale18);
        int int20 = timeZoneOffset5.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int2 = stringLiteral1.estimateParsedLength();
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(stringBuffer3, (long) (-101), chronology5, (int) (byte) 1, dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay(2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendClockhourOfHalfday(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder7.appendClockhourOfDay(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendText(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendTimeZoneShortName(strMap7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendMillisOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder8.appendFixedDecimal(dateTimeFieldType11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendSecondOfDay((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendText(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        fraction3.iMaxDigits = 3;
        int int7 = fraction3.estimatePrintedLength();
        fraction3.iMaxDigits = 20;
        int int10 = fraction3.iMinDigits;
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer11, (long) (short) 100, chronology13, (int) (short) 0, dateTimeZone15, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        fraction3.iMaxDigits = 3;
        int int7 = fraction3.estimateParsedLength();
        java.lang.StringBuffer stringBuffer8 = null;
        java.io.Writer writer9 = null;
        org.joda.time.Chronology chronology11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer8, writer9, (long) (short) 1, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (short) -1, 0);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (short) 0, false);
        int int4 = unpaddedNumber3.estimateParsedLength();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer5, (long) (short) 1, chronology7, (-21), dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear(4);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendTimeZoneName(strMap11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendSecondOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendClockhourOfDay(1);
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset23 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer24 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        java.util.Locale locale29 = null;
        timeZoneOffset23.printTo(stringBuffer24, (long) 20, chronology26, (int) (byte) 10, dateTimeZone28, locale29);
        java.lang.StringBuffer stringBuffer31 = null;
        org.joda.time.ReadablePartial readablePartial32 = null;
        java.util.Locale locale33 = null;
        timeZoneOffset23.printTo(stringBuffer31, readablePartial32, locale33);
        java.lang.StringBuffer stringBuffer35 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        java.util.Locale locale40 = null;
        timeZoneOffset23.printTo(stringBuffer35, (long) (short) 1, chronology37, (int) (byte) 10, dateTimeZone39, locale40);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = null;
        int int45 = timeZoneOffset23.parseInto(dateTimeParserBucket42, "hi!", 2);
        java.lang.StringBuffer stringBuffer46 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        java.util.Locale locale51 = null;
        timeZoneOffset23.printTo(stringBuffer46, (long) 6, chronology48, (-1), dateTimeZone50, locale51);
        java.io.Writer writer53 = null;
        org.joda.time.ReadablePartial readablePartial54 = null;
        java.util.Locale locale55 = null;
        timeZoneOffset23.printTo(writer53, readablePartial54, locale55);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder15.append((org.joda.time.format.DateTimePrinter) timeZoneOffset23);
        java.io.Writer writer58 = null;
        org.joda.time.ReadablePartial readablePartial59 = null;
        java.util.Locale locale60 = null;
        timeZoneOffset23.printTo(writer58, readablePartial59, locale60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-3) + "'", int45 == (-3));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "hi!", 6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = null;
        int int11 = fixedNumber3.parseInto(dateTimeParserBucket8, "hi!", 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = fixedNumber3.iFieldType;
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(stringBuffer13, 10L, chronology15, (-101), dateTimeZone17, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dateTimeFieldType12);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneId0.printTo(writer5, readablePartial6, locale7);
        int int9 = timeZoneId0.estimateParsedLength();
        java.io.Writer writer10 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(writer10, (long) (-21), chronology12, 20, dateTimeZone14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendYearOfCentury(3, 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneName(strMap13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendSignedDecimal(dateTimeFieldType15, (-1), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder1.appendFractionOfDay(0, 4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendClockhourOfHalfday(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendText(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap1);
        int int3 = timeZoneName2.estimateParsedLength();
        int int4 = timeZoneName2.estimatePrintedLength();
        int int5 = timeZoneName2.estimateParsedLength();
        int int6 = timeZoneName2.estimateParsedLength();
        java.io.Writer writer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        timeZoneName2.printTo(writer7, readablePartial8, locale9);
        java.io.Writer writer11 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneName2.printTo(writer11, (long) 2, chronology13, (-2), dateTimeZone15, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (short) 0, false);
        int int4 = unpaddedNumber3.estimatePrintedLength();
        int int5 = unpaddedNumber3.estimatePrintedLength();
        int int6 = unpaddedNumber3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer7, (long) (-2), chronology9, (int) (short) 1, dateTimeZone11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendYearOfEra(2, 13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendTwoDigitYear((-7), true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendTwoDigitYear(100, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder6.appendCenturyOfEra((-101), (-98));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 1, false);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer4, (long) 1, chronology6, (int) 'a', dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder17.appendDecimal(dateTimeFieldType19, (-21), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        fraction3.iMaxDigits = 3;
        int int7 = fraction3.estimatePrintedLength();
        fraction3.iMaxDigits = 20;
        int int10 = fraction3.iMinDigits;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = fraction3.parseInto(dateTimeParserBucket11, "hi!", (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendFractionOfDay((int) '#', 3);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendShortText(dateTimeFieldType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 2, true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer4, (long) 35, chronology6, (-101), dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral4 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.append((org.joda.time.format.DateTimePrinter) characterLiteral4, (org.joda.time.format.DateTimeParser) characterLiteral6);
        java.io.Writer writer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral4.printTo(writer8, 0L, chronology10, (int) (short) -1, dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('a');
        java.lang.StringBuffer stringBuffer2 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer2, 100L, chronology4, (int) (byte) 100, dateTimeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = fixedNumber3.iFieldType;
        int int5 = fixedNumber3.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = fixedNumber3.iFieldType;
        int int7 = fixedNumber3.estimateParsedLength();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(stringBuffer8, (long) 35, chronology10, (-98), dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        int int13 = textField12.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber24 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType21, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = null;
        int int28 = fixedNumber24.parseInto(dateTimeParserBucket25, "hi!", 6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = null;
        int int32 = fixedNumber24.parseInto(dateTimeParserBucket29, "hi!", 0);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral34 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int35 = stringLiteral34.estimatePrintedLength();
        int int36 = stringLiteral34.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber40 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType37, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = null;
        int int44 = fixedNumber40.parseInto(dateTimeParserBucket41, "hi!", 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = fixedNumber40.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset51 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        int int52 = timeZoneOffset51.estimateParsedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber56 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType53, (int) ' ', true);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear60 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType57, (-14), false);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField63 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType61, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField66 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType64, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField69 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType67, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField72 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType70, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField75 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType73, true);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray76 = new org.joda.time.format.DateTimeParser[] { textField63, textField66, textField69, textField72, textField75 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser77 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray76);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser78 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray76);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray79 = new org.joda.time.format.DateTimeParser[] { stringLiteral34, fixedNumber40, timeZoneOffset51, fixedNumber56, twoDigitYear60, matchingParser78 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder80 = dateTimeFormatterBuilder20.append((org.joda.time.format.DateTimePrinter) fixedNumber24, dateTimeParserArray79);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder81 = dateTimeFormatterBuilder9.append((org.joda.time.format.DateTimePrinter) textField12, dateTimeParserArray79);
        java.lang.StringBuffer stringBuffer82 = null;
        org.joda.time.ReadablePartial readablePartial83 = null;
        java.util.Locale locale84 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField12.printTo(stringBuffer82, readablePartial83, locale84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-7) + "'", int28 == (-7));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-7) + "'", int44 == (-7));
        org.junit.Assert.assertNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 13 + "'", int52 == 13);
        org.junit.Assert.assertNotNull(dateTimeParserArray76);
        org.junit.Assert.assertNotNull(dateTimeParserArray79);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder80);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder81);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendFractionOfDay(0, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendYear((int) (short) 10, 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendSignedDecimal(dateTimeFieldType10, 3, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder2.appendFractionOfDay((-101), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear(4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendTwoDigitYear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral14 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int15 = stringLiteral14.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder10.appendOptional((org.joda.time.format.DateTimeParser) stringLiteral14);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder10.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatterBuilder17.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendMinuteOfHour((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder17.appendHourOfHalfday((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 100, true);
        java.io.Writer writer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatterBuilder12.toParser();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeParser13);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendSecondOfDay((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMillisOfSecond((-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral4 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.append((org.joda.time.format.DateTimePrinter) characterLiteral4, (org.joda.time.format.DateTimeParser) characterLiteral6);
        java.io.Writer writer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral6.printTo(writer8, readablePartial9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        int int6 = characterLiteral1.parseInto(dateTimeParserBucket3, "hi!", 20);
        java.io.Writer writer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer7, readablePartial8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-21) + "'", int6 == (-21));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneId0.printTo(writer5, readablePartial6, locale7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        timeZoneId0.printTo(stringBuffer9, readablePartial10, locale11);
        int int13 = timeZoneId0.estimateParsedLength();
        java.io.Writer writer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        java.util.Locale locale16 = null;
        timeZoneId0.printTo(writer14, readablePartial15, locale16);
        int int18 = timeZoneId0.estimatePrintedLength();
        int int19 = timeZoneId0.estimateParsedLength();
        java.io.Writer writer20 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        java.util.Locale locale25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(writer20, (long) (short) 10, chronology22, (-98), dateTimeZone24, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction8 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType5, (int) (byte) 0, (int) (byte) 1);
        int int9 = fraction8.estimateParsedLength();
        fraction8.iMaxDigits = 3;
        int int12 = fraction8.estimatePrintedLength();
        fraction8.iMaxDigits = 20;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimeParser) fraction8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder15.appendTimeZoneOffset("hi!", "", false, 1, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder15.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder23.appendFraction(dateTimeFieldType24, 100, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField10 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType8, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField13 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType11, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder5.append((org.joda.time.format.DateTimePrinter) textField10, (org.joda.time.format.DateTimeParser) textField13);
        int int15 = textField13.estimatePrintedLength();
        int int16 = textField13.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.appendOptional((org.joda.time.format.DateTimeParser) textField13);
        int int18 = textField13.estimatePrintedLength();
        int int19 = textField13.estimatePrintedLength();
        java.io.Writer writer20 = null;
        org.joda.time.ReadablePartial readablePartial21 = null;
        java.util.Locale locale22 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField13.printTo(writer20, readablePartial21, locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 0, false);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer4, (long) (byte) -1, chronology6, (int) (byte) -1, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear(4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendTwoDigitYear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral14 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int15 = stringLiteral14.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder10.appendOptional((org.joda.time.format.DateTimeParser) stringLiteral14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder10.appendTimeZoneOffset("hi!", true, 0, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction15 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType12, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral17 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        int int21 = stringLiteral17.parseInto(dateTimeParserBucket18, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) fraction15, (org.joda.time.format.DateTimeParser) stringLiteral17);
        fraction15.iMaxDigits = 4;
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral26 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int27 = characterLiteral26.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = null;
        int int31 = characterLiteral26.parseInto(dateTimeParserBucket28, "", 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral33 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int34 = stringLiteral33.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear38 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType35, (int) (short) 0, true);
        int int39 = twoDigitYear38.estimatePrintedLength();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap41 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName42 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction46 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType43, (int) (byte) 0, (int) (byte) 1);
        int int47 = fraction46.estimatePrintedLength();
        int int48 = fraction46.iMaxDigits;
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral50 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParser[] dateTimeParserArray51 = new org.joda.time.format.DateTimeParser[] { characterLiteral26, stringLiteral33, twoDigitYear38, timeZoneName42, fraction46, stringLiteral50 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser52 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray51);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral54 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParser[] dateTimeParserArray55 = new org.joda.time.format.DateTimeParser[] { fraction15, matchingParser52, stringLiteral54 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser56 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray55);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int60 = matchingParser56.parseInto(dateTimeParserBucket57, "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-2) + "'", int31 == (-2));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(dateTimeParserArray51);
        org.junit.Assert.assertNotNull(dateTimeParserArray55);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction8 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType5, (int) (byte) 0, (int) (byte) 1);
        int int9 = fraction8.estimateParsedLength();
        fraction8.iMaxDigits = 3;
        int int12 = fraction8.estimatePrintedLength();
        fraction8.iMaxDigits = 20;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimeParser) fraction8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder15.appendTimeZoneOffset("hi!", "", false, 1, (int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendFixedSignedDecimal(dateTimeFieldType23, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap1);
        int int3 = timeZoneName2.estimateParsedLength();
        int int4 = timeZoneName2.estimateParsedLength();
        int int5 = timeZoneName2.estimatePrintedLength();
        java.io.Writer writer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneName2.printTo(writer6, (long) (-101), chronology8, (int) (short) 0, dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendYear((int) (byte) 10, 2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField14 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType12, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField17 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType15, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder9.append((org.joda.time.format.DateTimePrinter) textField14, (org.joda.time.format.DateTimeParser) textField17);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder9.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction24 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType21, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral26 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = null;
        int int30 = stringLiteral26.parseInto(dateTimeParserBucket27, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder20.append((org.joda.time.format.DateTimePrinter) fraction24, (org.joda.time.format.DateTimeParser) stringLiteral26);
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral33 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int34 = characterLiteral33.estimateParsedLength();
        int int35 = characterLiteral33.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder8.append((org.joda.time.format.DateTimePrinter) stringLiteral26, (org.joda.time.format.DateTimeParser) characterLiteral33);
        java.io.Writer writer37 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        java.util.Locale locale42 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral26.printTo(writer37, (long) (-3), chronology39, (int) 'a', dateTimeZone41, locale42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-101) + "'", int30 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName(32, strMap1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneName2.printTo(stringBuffer3, (long) (short) -1, chronology5, (int) '4', dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear(4);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendTimeZoneName(strMap11);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = dateTimeFormatterBuilder8.toPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimePrinter13);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        int int6 = characterLiteral1.parseInto(dateTimeParserBucket3, "hi!", 20);
        int int7 = characterLiteral1.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = characterLiteral1.parseInto(dateTimeParserBucket8, "hi!", (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-21) + "'", int6 == (-21));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendMonthOfYearShortText();
        boolean boolean5 = dateTimeFormatterBuilder4.canBuildPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendFractionOfDay(0, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 2, true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendClockhourOfHalfday((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTimeZoneOffset("hi!", true, (int) '4', (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder12.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField24 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType22, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField27 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType25, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) textField24, (org.joda.time.format.DateTimeParser) textField27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder16.append((org.joda.time.format.DateTimePrinter) textField24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimeParser) textField24);
        java.io.Writer writer31 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        java.util.Locale locale36 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField24.printTo(writer31, 0L, chronology33, (int) ' ', dateTimeZone35, locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        int int5 = twoDigitYear3.estimateParsedLength();
        int int6 = twoDigitYear3.estimatePrintedLength();
        int int7 = twoDigitYear3.estimateParsedLength();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer8, 0L, chronology10, (int) '4', dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendTwoDigitWeekyear((-3));
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction24 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType21, (int) (short) -1, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder17.append((org.joda.time.format.DateTimeParser) fraction24);
        fraction24.iMaxDigits = (-1);
        int int28 = fraction24.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer29 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        java.util.Locale locale34 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction24.printTo(stringBuffer29, (long) 32, chronology31, 0, dateTimeZone33, locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder1.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear9 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType6, (-21), false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder1.append((org.joda.time.format.DateTimePrinter) twoDigitYear9);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder1.appendCenturyOfEra(35, (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendMillisOfDay(1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int2 = stringLiteral1.estimatePrintedLength();
        int int3 = stringLiteral1.estimatePrintedLength();
        int int4 = stringLiteral1.estimateParsedLength();
        int int5 = stringLiteral1.estimateParsedLength();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("", "hi!", false, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction8 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType5, (int) (byte) 0, (int) (byte) 1);
        int int9 = fraction8.estimateParsedLength();
        fraction8.iMaxDigits = 3;
        int int12 = fraction8.estimatePrintedLength();
        fraction8.iMaxDigits = 20;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimeParser) fraction8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendHalfdayOfDayText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap17 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendTimeZoneShortName(strMap17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.appendCenturyOfEra((-7), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (-21), true);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer4, (long) (byte) 10, chronology6, (int) '#', dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        timeZoneOffset5.printTo(stringBuffer6, (long) 20, chronology8, (int) (byte) 10, dateTimeZone10, locale11);
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale15 = null;
        timeZoneOffset5.printTo(stringBuffer13, readablePartial14, locale15);
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        java.util.Locale locale22 = null;
        timeZoneOffset5.printTo(stringBuffer17, (long) (short) 1, chronology19, (int) (byte) 10, dateTimeZone21, locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = null;
        int int27 = timeZoneOffset5.parseInto(dateTimeParserBucket24, "hi!", 2);
        java.io.Writer writer28 = null;
        org.joda.time.ReadablePartial readablePartial29 = null;
        java.util.Locale locale30 = null;
        timeZoneOffset5.printTo(writer28, readablePartial29, locale30);
        int int32 = timeZoneOffset5.estimateParsedLength();
        int int33 = timeZoneOffset5.estimatePrintedLength();
        java.io.Writer writer34 = null;
        org.joda.time.ReadablePartial readablePartial35 = null;
        java.util.Locale locale36 = null;
        timeZoneOffset5.printTo(writer34, readablePartial35, locale36);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 13 + "'", int32 == 13);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13 + "'", int33 == 13);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder17.appendFractionOfMinute((int) (short) -1, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction8 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType5, (int) (byte) 0, (int) (byte) 1);
        int int9 = fraction8.estimateParsedLength();
        fraction8.iMaxDigits = 3;
        int int12 = fraction8.estimatePrintedLength();
        fraction8.iMaxDigits = 20;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimeParser) fraction8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.appendDayOfMonth((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendCenturyOfEra((-2), (-33));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        int int13 = textField12.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber24 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType21, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = null;
        int int28 = fixedNumber24.parseInto(dateTimeParserBucket25, "hi!", 6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = null;
        int int32 = fixedNumber24.parseInto(dateTimeParserBucket29, "hi!", 0);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral34 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int35 = stringLiteral34.estimatePrintedLength();
        int int36 = stringLiteral34.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber40 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType37, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = null;
        int int44 = fixedNumber40.parseInto(dateTimeParserBucket41, "hi!", 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = fixedNumber40.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset51 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        int int52 = timeZoneOffset51.estimateParsedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber56 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType53, (int) ' ', true);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear60 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType57, (-14), false);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField63 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType61, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField66 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType64, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField69 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType67, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField72 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType70, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField75 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType73, true);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray76 = new org.joda.time.format.DateTimeParser[] { textField63, textField66, textField69, textField72, textField75 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser77 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray76);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser78 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray76);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray79 = new org.joda.time.format.DateTimeParser[] { stringLiteral34, fixedNumber40, timeZoneOffset51, fixedNumber56, twoDigitYear60, matchingParser78 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder80 = dateTimeFormatterBuilder20.append((org.joda.time.format.DateTimePrinter) fixedNumber24, dateTimeParserArray79);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder81 = dateTimeFormatterBuilder9.append((org.joda.time.format.DateTimePrinter) textField12, dateTimeParserArray79);
        java.io.Writer writer82 = null;
        org.joda.time.ReadablePartial readablePartial83 = null;
        java.util.Locale locale84 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField12.printTo(writer82, readablePartial83, locale84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-7) + "'", int28 == (-7));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-7) + "'", int44 == (-7));
        org.junit.Assert.assertNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 13 + "'", int52 == 13);
        org.junit.Assert.assertNotNull(dateTimeParserArray76);
        org.junit.Assert.assertNotNull(dateTimeParserArray79);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder80);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder81);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        int int6 = characterLiteral1.parseInto(dateTimeParserBucket3, "hi!", 20);
        int int7 = characterLiteral1.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer8, readablePartial9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-21) + "'", int6 == (-21));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.StringBuffer stringBuffer0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, (-33));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) (short) 100, false);
        int int4 = fixedNumber3.iMaxParsedDigits;
        int int5 = fixedNumber3.iMaxParsedDigits;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        int int9 = fixedNumber3.parseInto(dateTimeParserBucket6, "hi!", (int) (short) 100);
        int int10 = fixedNumber3.estimateParsedLength();
        int int11 = fixedNumber3.iMinPrintedDigits;
        int int12 = fixedNumber3.estimateParsedLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap1);
        int int3 = timeZoneName2.estimateParsedLength();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        timeZoneName2.printTo(stringBuffer4, readablePartial5, locale6);
        java.io.Writer writer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale10 = null;
        timeZoneName2.printTo(writer8, readablePartial9, locale10);
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneName2.printTo(stringBuffer12, 0L, chronology14, 1, dateTimeZone16, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber4 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, (int) (short) -1, true, 32);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            paddedNumber4.printTo(stringBuffer5, (long) (-2), chronology7, 35, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (-2), (int) (short) 10);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer4, (long) 'a', chronology6, (-2), dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendYear((int) 'a', (int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMonthOfYear(32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendDayOfMonth((-33));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 3, true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer4, (long) (byte) 10, chronology6, (-33), dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder17.appendYear(20, 4);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral23 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = null;
        int int27 = stringLiteral23.parseInto(dateTimeParserBucket24, "hi!", 20);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap29 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName30 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap29);
        int int31 = timeZoneName30.estimateParsedLength();
        java.lang.StringBuffer stringBuffer32 = null;
        org.joda.time.ReadablePartial readablePartial33 = null;
        java.util.Locale locale34 = null;
        timeZoneName30.printTo(stringBuffer32, readablePartial33, locale34);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral40 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral42 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder38.append((org.joda.time.format.DateTimePrinter) characterLiteral40, (org.joda.time.format.DateTimeParser) characterLiteral42);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral45 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int46 = stringLiteral45.estimateParsedLength();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray47 = new org.joda.time.format.DateTimeParser[] { timeZoneName30, characterLiteral40, stringLiteral45 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser48 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray47);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder17.append((org.joda.time.format.DateTimePrinter) stringLiteral23, dateTimeParserArray47);
        java.io.Writer writer50 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        java.util.Locale locale55 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral23.printTo(writer50, (long) (short) 0, chronology52, 0, dateTimeZone54, locale55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-21) + "'", int27 == (-21));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20 + "'", int31 == 20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dateTimeParserArray47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        fraction3.iMinDigits = (short) 1;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = fraction3.parseInto(dateTimeParserBucket8, "hi!", (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimatePrintedLength();
        int int3 = characterLiteral1.estimatePrintedLength();
        int int4 = characterLiteral1.estimatePrintedLength();
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer5, (long) (-53), chronology7, (int) (short) -1, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendFractionOfDay(0, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendTwoDigitYear(6, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendTwoDigitWeekyear(2, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder6.appendFixedSignedDecimal(dateTimeFieldType13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMillisOfDay((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendFractionOfMinute(6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendYearOfEra((-98), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder5.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendMonthOfYear((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFixedDecimal(dateTimeFieldType12, (-98));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (short) 0, false);
        int int4 = unpaddedNumber3.estimateParsedLength();
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer5, readablePartial6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) (short) 100, false);
        int int4 = fixedNumber3.iMaxParsedDigits;
        int int5 = fixedNumber3.iMaxParsedDigits;
        int int6 = fixedNumber3.estimateParsedLength();
        int int7 = fixedNumber3.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneId0.printTo(writer5, readablePartial6, locale7);
        int int9 = timeZoneId0.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = null;
        int int13 = timeZoneId0.parseInto(dateTimeParserBucket10, "", (int) (byte) 0);
        java.lang.StringBuffer stringBuffer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        java.util.Locale locale16 = null;
        timeZoneId0.printTo(stringBuffer14, readablePartial15, locale16);
        java.io.Writer writer18 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(writer18, (long) (short) 1, chronology20, 2, dateTimeZone22, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        int int6 = characterLiteral1.parseInto(dateTimeParserBucket3, "", 1);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = characterLiteral1.parseInto(dateTimeParserBucket7, "", (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendYearOfCentury(3, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder0.appendYearOfCentury((-101), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder17.appendYear(20, 4);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral23 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = null;
        int int27 = stringLiteral23.parseInto(dateTimeParserBucket24, "hi!", 20);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap29 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName30 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap29);
        int int31 = timeZoneName30.estimateParsedLength();
        java.lang.StringBuffer stringBuffer32 = null;
        org.joda.time.ReadablePartial readablePartial33 = null;
        java.util.Locale locale34 = null;
        timeZoneName30.printTo(stringBuffer32, readablePartial33, locale34);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral40 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral42 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder38.append((org.joda.time.format.DateTimePrinter) characterLiteral40, (org.joda.time.format.DateTimeParser) characterLiteral42);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral45 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int46 = stringLiteral45.estimateParsedLength();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray47 = new org.joda.time.format.DateTimeParser[] { timeZoneName30, characterLiteral40, stringLiteral45 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser48 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray47);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder17.append((org.joda.time.format.DateTimePrinter) stringLiteral23, dateTimeParserArray47);
        java.io.Writer writer50 = null;
        org.joda.time.ReadablePartial readablePartial51 = null;
        java.util.Locale locale52 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral23.printTo(writer50, readablePartial51, locale52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-21) + "'", int27 == (-21));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20 + "'", int31 == 20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dateTimeParserArray47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatterBuilder17.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder17.appendText(dateTimeFieldType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField7 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType5, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendOptional((org.joda.time.format.DateTimeParser) textField7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendLiteral('4');
        dateTimeFormatterBuilder8.clear();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.iMinDigits;
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer5, (long) (short) 1, chronology7, 1, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (-21), true);
        java.io.Writer writer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 1, false);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer4, (long) 3, chronology6, 10, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendClockhourOfHalfday(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder20.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendLiteral("");
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder20.appendFraction(dateTimeFieldType24, (-4), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 2, true);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer4, (long) 6, chronology6, 4, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendTwoDigitWeekyear((-3));
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction24 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType21, (int) (short) -1, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder17.append((org.joda.time.format.DateTimeParser) fraction24);
        fraction24.iMaxDigits = (-1);
        java.io.Writer writer28 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        java.util.Locale locale33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction24.printTo(writer28, (long) (-14), chronology30, (int) (byte) -1, dateTimeZone32, locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
        int int3 = textField2.estimatePrintedLength();
        int int4 = textField2.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = textField2.parseInto(dateTimeParserBucket5, "hi!", (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField12 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField15 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField12, (org.joda.time.format.DateTimeParser) textField15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) textField12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendMillisOfSecond((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder20.appendTimeZoneOffset("hi!", true, (int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        int int4 = characterLiteral1.estimateParsedLength();
        int int5 = characterLiteral1.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        int int9 = characterLiteral1.parseInto(dateTimeParserBucket6, "hi!", (int) 'a');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = characterLiteral1.parseInto(dateTimeParserBucket10, "hi!", (-14));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -14");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-98) + "'", int9 == (-98));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField5.printTo(stringBuffer10, (long) (byte) 10, chronology12, 35, dateTimeZone14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("", "hi!", false, (-98), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

