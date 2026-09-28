package org.joda.time.format;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendDayOfYear(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendFixedDecimal(dateTimeFieldType11, 33);
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
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (-33), true);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer4, (long) 32, chronology6, (int) (byte) 10, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        int int10 = textField8.estimatePrintedLength();
        int int11 = textField8.estimateParsedLength();
        int int12 = textField8.estimatePrintedLength();
        int int13 = textField8.estimatePrintedLength();
        int int14 = textField8.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField8.printTo(stringBuffer15, readablePartial16, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
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
        int int24 = timeZoneOffset5.estimatePrintedLength();
        int int25 = timeZoneOffset5.estimatePrintedLength();
        int int26 = timeZoneOffset5.estimatePrintedLength();
        java.io.Writer writer27 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        java.util.Locale locale32 = null;
        timeZoneOffset5.printTo(writer27, (long) '#', chronology29, 52, dateTimeZone31, locale32);
        int int34 = timeZoneOffset5.estimateParsedLength();
        int int35 = timeZoneOffset5.estimatePrintedLength();
        java.io.Writer writer36 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        java.util.Locale locale41 = null;
        timeZoneOffset5.printTo(writer36, (long) (byte) -1, chronology38, 0, dateTimeZone40, locale41);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 13 + "'", int25 == 13);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 13 + "'", int26 == 13);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 13 + "'", int34 == 13);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 13 + "'", int35 == 13);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral4 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.append((org.joda.time.format.DateTimePrinter) characterLiteral4, (org.joda.time.format.DateTimeParser) characterLiteral6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId9 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        java.util.Locale locale12 = null;
        timeZoneId9.printTo(stringBuffer10, readablePartial11, locale12);
        java.io.Writer writer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        java.util.Locale locale16 = null;
        timeZoneId9.printTo(writer14, readablePartial15, locale16);
        java.lang.StringBuffer stringBuffer18 = null;
        org.joda.time.ReadablePartial readablePartial19 = null;
        java.util.Locale locale20 = null;
        timeZoneId9.printTo(stringBuffer18, readablePartial19, locale20);
        int int22 = timeZoneId9.estimateParsedLength();
        int int23 = timeZoneId9.estimatePrintedLength();
        java.io.Writer writer24 = null;
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale26 = null;
        timeZoneId9.printTo(writer24, readablePartial25, locale26);
        java.io.Writer writer28 = null;
        org.joda.time.ReadablePartial readablePartial29 = null;
        java.util.Locale locale30 = null;
        timeZoneId9.printTo(writer28, readablePartial29, locale30);
        int int32 = timeZoneId9.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder2.append((org.joda.time.format.DateTimeParser) timeZoneId9);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder33.appendDayOfWeekText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertTrue("'" + timeZoneId9 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId9.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber4 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 35, true, (int) (short) 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        int int8 = paddedNumber4.parseInto(dateTimeParserBucket5, "hi!", 97);
        int int9 = paddedNumber4.estimatePrintedLength();
        int int10 = paddedNumber4.iMinPrintedDigits;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-98) + "'", int8 == (-98));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendSecondOfDay((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendOptional((org.joda.time.format.DateTimeParser) characterLiteral6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder4.appendWeekOfWeekyear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendMonthOfYearText();
        boolean boolean11 = dateTimeFormatterBuilder10.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendDayOfWeekText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (-34), true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = twoDigitYear3.parseInto(dateTimeParserBucket4, "", (-34));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -34");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfMinute(1, (-7));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendFractionOfDay(97, 3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder15.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField25 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType23, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField28 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType26, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder20.append((org.joda.time.format.DateTimePrinter) textField25, (org.joda.time.format.DateTimeParser) textField28);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder20.appendYearOfCentury(3, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder20.appendDayOfMonth(20);
        dateTimeFormatterBuilder34.clear();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap36 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder34.appendTimeZoneName(strMap36);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral39 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int40 = stringLiteral39.estimatePrintedLength();
        int int41 = stringLiteral39.estimateParsedLength();
        int int42 = stringLiteral39.estimatePrintedLength();
        int int43 = stringLiteral39.estimatePrintedLength();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap45 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName46 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap45);
        int int47 = timeZoneName46.estimateParsedLength();
        java.lang.StringBuffer stringBuffer48 = null;
        org.joda.time.ReadablePartial readablePartial49 = null;
        java.util.Locale locale50 = null;
        timeZoneName46.printTo(stringBuffer48, readablePartial49, locale50);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder52.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral56 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral58 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder54.append((org.joda.time.format.DateTimePrinter) characterLiteral56, (org.joda.time.format.DateTimeParser) characterLiteral58);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral61 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int62 = stringLiteral61.estimateParsedLength();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray63 = new org.joda.time.format.DateTimeParser[] { timeZoneName46, characterLiteral56, stringLiteral61 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser64 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray63);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser65 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray63);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser66 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray63);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder34.append((org.joda.time.format.DateTimePrinter) stringLiteral39, dateTimeParserArray63);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder15.append((org.joda.time.format.DateTimePrinter) stringLiteral39);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap69 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder68.appendTimeZoneShortName(strMap69);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder72 = dateTimeFormatterBuilder70.appendSecondOfMinute(3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder74 = dateTimeFormatterBuilder70.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder74.appendFractionOfSecond(4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20 + "'", int47 == 20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(dateTimeParserArray63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder70);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder72);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder74);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder77);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendDayOfYear((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder11.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField23 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType21, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField26 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType24, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimePrinter) textField23, (org.joda.time.format.DateTimeParser) textField26);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder15.append((org.joda.time.format.DateTimePrinter) textField23);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder28.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral31 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder29.append((org.joda.time.format.DateTimeParser) stringLiteral31);
        int int33 = stringLiteral31.estimateParsedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction37 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType34, (int) (byte) 0, (int) (byte) 1);
        int int38 = fraction37.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder10.append((org.joda.time.format.DateTimePrinter) stringLiteral31, (org.joda.time.format.DateTimeParser) fraction37);
        fraction37.iMaxDigits = (-34);
        int int42 = fraction37.estimatePrintedLength();
        int int43 = fraction37.iMinDigits;
        java.lang.StringBuffer stringBuffer44 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        java.util.Locale locale49 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction37.printTo(stringBuffer44, (long) (-3), chronology46, 34, dateTimeZone48, locale49);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-34) + "'", int42 == (-34));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFractionOfHour(4, 4);
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId12 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale15 = null;
        timeZoneId12.printTo(stringBuffer13, readablePartial14, locale15);
        java.io.Writer writer17 = null;
        org.joda.time.ReadablePartial readablePartial18 = null;
        java.util.Locale locale19 = null;
        timeZoneId12.printTo(writer17, readablePartial18, locale19);
        java.lang.StringBuffer stringBuffer21 = null;
        org.joda.time.ReadablePartial readablePartial22 = null;
        java.util.Locale locale23 = null;
        timeZoneId12.printTo(stringBuffer21, readablePartial22, locale23);
        int int25 = timeZoneId12.estimateParsedLength();
        java.io.Writer writer26 = null;
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale28 = null;
        timeZoneId12.printTo(writer26, readablePartial27, locale28);
        int int30 = timeZoneId12.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder8.appendOptional((org.joda.time.format.DateTimeParser) timeZoneId12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder31.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder31.appendMillisOfSecond((int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + timeZoneId12 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId12.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendMonthOfYearShortText();
        boolean boolean5 = dateTimeFormatterBuilder4.canBuildPrinter();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber10 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType6, (int) (short) -1, true, 32);
        boolean boolean11 = paddedNumber10.iSigned;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber15 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType12, (int) (short) 100, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = fixedNumber15.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) paddedNumber10, (org.joda.time.format.DateTimeParser) fixedNumber15);
        boolean boolean18 = fixedNumber15.iSigned;
        java.io.Writer writer19 = null;
        org.joda.time.ReadablePartial readablePartial20 = null;
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber15.printTo(writer19, readablePartial20, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendYear((int) 'a', (int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMonthOfYear(32);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendFractionOfHour(10, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfYear(6);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendFixedSignedDecimal(dateTimeFieldType12, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendTwoDigitWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder8.appendMillisOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder8.appendMinuteOfHour(10);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap16 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder8.appendTimeZoneName(strMap16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder11.appendFractionOfHour(100, (-2));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder11.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder32.appendEraText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder32.appendHourOfDay((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (short) 1, (int) (byte) 10);
        fraction3.iMaxDigits = (byte) -1;
        fraction3.iMaxDigits = 32;
        java.lang.StringBuffer stringBuffer8 = null;
        java.io.Writer writer9 = null;
        org.joda.time.Chronology chronology11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer8, writer9, (long) 52, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendFractionOfDay((int) '#', 3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendFractionOfHour(13, 4);
        boolean boolean16 = dateTimeFormatterBuilder12.canBuildPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) '#', false);
        int int4 = twoDigitYear3.estimateParsedLength();
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer5, 0L, chronology7, 6, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder49.appendYearOfCentury((-7), 0);
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
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 10, true);
        int int4 = unpaddedNumber3.iMaxParsedDigits;
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer5, (long) 13, chronology7, (int) 'a', dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendTwoDigitYear((-7));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatterBuilder8.toFormatter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder18.appendWeekOfWeekyear(0);
        dateTimeFormatterBuilder18.clear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber31 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType27, (int) 'a', true, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimePrinter) paddedNumber31);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder32.appendDayOfMonth((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder32.appendSecondOfDay((-34));
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendMonthOfYear(6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendHalfdayOfDayText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendFractionOfHour((int) '#', (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder7.appendMinuteOfDay((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral16 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int17 = characterLiteral16.estimateParsedLength();
        int int18 = characterLiteral16.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = null;
        int int22 = characterLiteral16.parseInto(dateTimeParserBucket19, "", (int) (byte) 10);
        int int23 = characterLiteral16.estimatePrintedLength();
        int int24 = characterLiteral16.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = null;
        int int28 = characterLiteral16.parseInto(dateTimeParserBucket25, "hi!", 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimeParser) characterLiteral16);
        int int30 = characterLiteral16.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = null;
        int int34 = characterLiteral16.parseInto(dateTimeParserBucket31, "", (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-11) + "'", int22 == (-11));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2) + "'", int34 == (-2));
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) ' ', true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder4.appendYearOfCentury((int) (byte) 100, 6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendFractionOfSecond((-21), (-1));
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendYearOfEra(2, 13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendTwoDigitYear((-7), true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendSecondOfMinute((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendYearOfEra((int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder11.appendWeekyear((-34), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 35, false);
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
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
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
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField8.printTo(writer12, (long) 2, chronology14, (int) (byte) -1, dateTimeZone16, locale17);
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
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        int int10 = textField8.estimatePrintedLength();
        int int11 = textField8.estimateParsedLength();
        int int12 = textField8.estimatePrintedLength();
        int int13 = textField8.estimateParsedLength();
        int int14 = textField8.estimatePrintedLength();
        int int15 = textField8.estimateParsedLength();
        java.io.Writer writer16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField8.printTo(writer16, readablePartial17, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
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
        int int20 = textField13.estimatePrintedLength();
        java.io.Writer writer21 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField13.printTo(writer21, (long) ' ', chronology23, (-3), dateTimeZone25, locale26);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder5.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendMonthOfYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder5.appendDayOfWeek((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendFractionOfDay(6, (int) ' ');
        boolean boolean17 = dateTimeFormatterBuilder13.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendTwoDigitWeekyear((-14));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder20.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder20.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder27.appendFractionOfSecond((int) (byte) 0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder27.appendDayOfWeek((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder33.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder33.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder33.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder37.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder40.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField45 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType43, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField48 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType46, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder40.append((org.joda.time.format.DateTimePrinter) textField45, (org.joda.time.format.DateTimeParser) textField48);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder37.append((org.joda.time.format.DateTimePrinter) textField45);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder50.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder51.appendClockhourOfHalfday(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder53.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder53.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder53.appendFractionOfMinute(6, (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatterBuilder53.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder27.append(dateTimeFormatter60);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder13.append(dateTimeFormatter60);
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId63 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer64 = null;
        org.joda.time.ReadablePartial readablePartial65 = null;
        java.util.Locale locale66 = null;
        timeZoneId63.printTo(stringBuffer64, readablePartial65, locale66);
        java.io.Writer writer68 = null;
        org.joda.time.ReadablePartial readablePartial69 = null;
        java.util.Locale locale70 = null;
        timeZoneId63.printTo(writer68, readablePartial69, locale70);
        java.lang.StringBuffer stringBuffer72 = null;
        org.joda.time.ReadablePartial readablePartial73 = null;
        java.util.Locale locale74 = null;
        timeZoneId63.printTo(stringBuffer72, readablePartial73, locale74);
        java.lang.StringBuffer stringBuffer76 = null;
        org.joda.time.ReadablePartial readablePartial77 = null;
        java.util.Locale locale78 = null;
        timeZoneId63.printTo(stringBuffer76, readablePartial77, locale78);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder80 = dateTimeFormatterBuilder13.appendOptional((org.joda.time.format.DateTimeParser) timeZoneId63);
        int int81 = timeZoneId63.estimatePrintedLength();
        java.io.Writer writer82 = null;
        org.joda.time.ReadablePartial readablePartial83 = null;
        java.util.Locale locale84 = null;
        timeZoneId63.printTo(writer82, readablePartial83, locale84);
        int int86 = timeZoneId63.estimatePrintedLength();
        java.io.Writer writer87 = null;
        org.joda.time.ReadablePartial readablePartial88 = null;
        java.util.Locale locale89 = null;
        timeZoneId63.printTo(writer87, readablePartial88, locale89);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertTrue("'" + timeZoneId63 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId63.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 32 + "'", int81 == 32);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 32 + "'", int86 == 32);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
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
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap24 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder18.appendTimeZoneName(strMap24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder18.appendYearOfEra((int) ' ', (-36));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder28.appendDayOfYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendLiteral("hi!");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder30.appendFractionOfDay(100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendClockhourOfHalfday((-19));
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder15.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder58.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear63 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType60, 6, true);
        int int64 = twoDigitYear63.estimatePrintedLength();
        int int65 = twoDigitYear63.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber69 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType66, 4, false);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = null;
        int int73 = fixedNumber69.parseInto(dateTimeParserBucket70, "hi!", (int) '4');
        int int74 = fixedNumber69.iMaxParsedDigits;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket75 = null;
        int int78 = fixedNumber69.parseInto(dateTimeParserBucket75, "hi!", 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder79 = dateTimeFormatterBuilder59.append((org.joda.time.format.DateTimePrinter) twoDigitYear63, (org.joda.time.format.DateTimeParser) fixedNumber69);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-53) + "'", int73 == (-53));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 4 + "'", int74 == 4);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder79);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder5.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendMonthOfYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder5.appendDayOfWeek((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendFractionOfDay(6, (int) ' ');
        boolean boolean17 = dateTimeFormatterBuilder13.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendTwoDigitYear(13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendHourOfDay(10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendYear((int) 'a', (int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder1.appendHourOfHalfday(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendFractionOfMinute((int) 'a', (-11));
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction13 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType10, (-1), (-11));
        int int14 = fraction13.estimateParsedLength();
        int int15 = fraction13.iMaxDigits;
        int int16 = fraction13.iMinDigits;
        int int17 = fraction13.estimatePrintedLength();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap19 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName20 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap19);
        int int21 = timeZoneName20.estimateParsedLength();
        java.lang.StringBuffer stringBuffer22 = null;
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale24 = null;
        timeZoneName20.printTo(stringBuffer22, readablePartial23, locale24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral30 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral32 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder28.append((org.joda.time.format.DateTimePrinter) characterLiteral30, (org.joda.time.format.DateTimeParser) characterLiteral32);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral35 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int36 = stringLiteral35.estimateParsedLength();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray37 = new org.joda.time.format.DateTimeParser[] { timeZoneName20, characterLiteral30, stringLiteral35 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser38 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray37);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser39 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray37);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser40 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray37);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder9.append((org.joda.time.format.DateTimePrinter) fraction13, dateTimeParserArray37);
        int int42 = fraction13.iMaxDigits;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int46 = fraction13.parseInto(dateTimeParserBucket43, "", (-21));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-11) + "'", int14 == (-11));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-11) + "'", int15 == (-11));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-11) + "'", int17 == (-11));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTimeParserArray37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-11) + "'", int42 == (-11));
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendMonthOfYear(6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendClockhourOfHalfday(18);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap15 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendTimeZoneShortName(strMap15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendTwoDigitYear(2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatterBuilder14.toFormatter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
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
        int int17 = timeZoneOffset5.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        int int21 = timeZoneOffset5.parseInto(dateTimeParserBucket18, "", 3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = null;
        int int25 = timeZoneOffset5.parseInto(dateTimeParserBucket22, "", 3);
        int int26 = timeZoneOffset5.estimatePrintedLength();
        int int27 = timeZoneOffset5.estimateParsedLength();
        java.lang.StringBuffer stringBuffer28 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        java.util.Locale locale33 = null;
        timeZoneOffset5.printTo(stringBuffer28, 10L, chronology30, 0, dateTimeZone32, locale33);
        java.lang.StringBuffer stringBuffer35 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        java.util.Locale locale40 = null;
        timeZoneOffset5.printTo(stringBuffer35, (long) (-34), chronology37, 2, dateTimeZone39, locale40);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 13 + "'", int17 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-4) + "'", int25 == (-4));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 13 + "'", int26 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13 + "'", int27 == 13);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendWeekOfWeekyear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendMonthOfYearText();
        java.lang.Class<?> wildcardClass8 = dateTimeFormatterBuilder7.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
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
        java.io.Writer writer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        java.util.Locale locale14 = null;
        timeZoneName2.printTo(writer12, readablePartial13, locale14);
        int int16 = timeZoneName2.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = timeZoneName2.parseInto(dateTimeParserBucket17, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendTwoDigitWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder8.appendLiteral("hi!");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder13.appendDayOfWeekShortText();
        dateTimeFormatterBuilder14.clear();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
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
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear18 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType15, 4, false);
        int int19 = twoDigitYear18.estimateParsedLength();
        int int20 = twoDigitYear18.estimateParsedLength();
        int int21 = twoDigitYear18.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId22 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer23 = null;
        org.joda.time.ReadablePartial readablePartial24 = null;
        java.util.Locale locale25 = null;
        timeZoneId22.printTo(stringBuffer23, readablePartial24, locale25);
        java.io.Writer writer27 = null;
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale29 = null;
        timeZoneId22.printTo(writer27, readablePartial28, locale29);
        java.lang.StringBuffer stringBuffer31 = null;
        org.joda.time.ReadablePartial readablePartial32 = null;
        java.util.Locale locale33 = null;
        timeZoneId22.printTo(stringBuffer31, readablePartial32, locale33);
        int int35 = timeZoneId22.estimateParsedLength();
        java.io.Writer writer36 = null;
        org.joda.time.ReadablePartial readablePartial37 = null;
        java.util.Locale locale38 = null;
        timeZoneId22.printTo(writer36, readablePartial37, locale38);
        java.io.Writer writer40 = null;
        org.joda.time.ReadablePartial readablePartial41 = null;
        java.util.Locale locale42 = null;
        timeZoneId22.printTo(writer40, readablePartial41, locale42);
        java.lang.StringBuffer stringBuffer44 = null;
        org.joda.time.ReadablePartial readablePartial45 = null;
        java.util.Locale locale46 = null;
        timeZoneId22.printTo(stringBuffer44, readablePartial45, locale46);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder12.append((org.joda.time.format.DateTimePrinter) twoDigitYear18, (org.joda.time.format.DateTimeParser) timeZoneId22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder12.appendTwoDigitWeekyear(0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + timeZoneId22 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId22.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendFractionOfDay(0, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendTwoDigitYear(6, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder6.appendHourOfHalfday(20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder6.appendFractionOfDay(33, 10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        fraction3.iMinDigits = (short) 1;
        fraction3.iMaxDigits = ' ';
        int int10 = fraction3.estimatePrintedLength();
        int int11 = fraction3.iMaxDigits;
        java.io.Writer writer12 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer12, 1L, chronology14, 100, dateTimeZone16, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendFractionOfSecond(100, 18);
        boolean boolean13 = dateTimeFormatterBuilder12.canBuildPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        int int8 = twoDigitYear3.parseInto(dateTimeParserBucket5, "hi!", (int) (short) 10);
        int int9 = twoDigitYear3.estimateParsedLength();
        int int10 = twoDigitYear3.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-11) + "'", int8 == (-11));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder21.appendTwoDigitYear((int) (byte) 10, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder21.appendCenturyOfEra((int) (byte) 0, (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder21.appendHalfdayOfDayText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + timeZoneId11 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId11.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
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
        int int17 = timeZoneOffset5.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        int int21 = timeZoneOffset5.parseInto(dateTimeParserBucket18, "", 3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = null;
        int int25 = timeZoneOffset5.parseInto(dateTimeParserBucket22, "", 3);
        int int26 = timeZoneOffset5.estimatePrintedLength();
        int int27 = timeZoneOffset5.estimateParsedLength();
        java.lang.StringBuffer stringBuffer28 = null;
        org.joda.time.ReadablePartial readablePartial29 = null;
        java.util.Locale locale30 = null;
        timeZoneOffset5.printTo(stringBuffer28, readablePartial29, locale30);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 13 + "'", int17 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-4) + "'", int25 == (-4));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 13 + "'", int26 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13 + "'", int27 == 13);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 13, 35);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendFractionOfDay(0, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendMillisOfSecond(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendMillisOfSecond(6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendLiteral("hi!");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear(4);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendTimeZoneName(strMap11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendSecondOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatterBuilder12.toFormatter();
        boolean boolean16 = dateTimeFormatterBuilder12.canBuildParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField20 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType18, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField23 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType21, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField26 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType24, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField29 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType27, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField32 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType30, true);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray33 = new org.joda.time.format.DateTimeParser[] { textField20, textField23, textField26, textField29, textField32 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser34 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray33);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser35 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray33);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser36 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray33);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder12.append(dateTimePrinter17, dateTimeParserArray33);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap39 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName40 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap39);
        int int41 = timeZoneName40.estimateParsedLength();
        java.lang.StringBuffer stringBuffer42 = null;
        org.joda.time.ReadablePartial readablePartial43 = null;
        java.util.Locale locale44 = null;
        timeZoneName40.printTo(stringBuffer42, readablePartial43, locale44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber49 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType46, (int) (short) 100, false);
        int int50 = fixedNumber49.iMaxParsedDigits;
        int int51 = fixedNumber49.iMaxParsedDigits;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = null;
        int int55 = fixedNumber49.parseInto(dateTimeParserBucket52, "hi!", (int) (short) 100);
        int int56 = fixedNumber49.estimateParsedLength();
        int int57 = fixedNumber49.iMinPrintedDigits;
        boolean boolean58 = fixedNumber49.iSigned;
        int int59 = fixedNumber49.iMaxParsedDigits;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder12.append((org.joda.time.format.DateTimePrinter) timeZoneName40, (org.joda.time.format.DateTimeParser) fixedNumber49);
        java.lang.StringBuffer stringBuffer61 = null;
        org.joda.time.ReadablePartial readablePartial62 = null;
        java.util.Locale locale63 = null;
        timeZoneName40.printTo(stringBuffer61, readablePartial62, locale63);
        java.lang.StringBuffer stringBuffer65 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        java.util.Locale locale70 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneName40.printTo(stringBuffer65, (long) '#', chronology67, (-19), dateTimeZone69, locale70);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeParserArray33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20 + "'", int41 == 20);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-101) + "'", int55 == (-101));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(' ');
        int int2 = characterLiteral1.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        int int6 = characterLiteral1.parseInto(dateTimeParserBucket3, "", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber10 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType7, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = null;
        int int14 = fixedNumber10.parseInto(dateTimeParserBucket11, "hi!", 6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = null;
        int int18 = fixedNumber10.parseInto(dateTimeParserBucket15, "hi!", 0);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral20 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int21 = stringLiteral20.estimatePrintedLength();
        int int22 = stringLiteral20.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber26 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType23, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = null;
        int int30 = fixedNumber26.parseInto(dateTimeParserBucket27, "hi!", 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = fixedNumber26.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset37 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        int int38 = timeZoneOffset37.estimateParsedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber42 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType39, (int) ' ', true);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear46 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType43, (-14), false);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField49 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType47, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField52 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType50, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField55 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType53, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField58 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType56, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField61 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType59, true);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray62 = new org.joda.time.format.DateTimeParser[] { textField49, textField52, textField55, textField58, textField61 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser63 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray62);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser64 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray62);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray65 = new org.joda.time.format.DateTimeParser[] { stringLiteral20, fixedNumber26, timeZoneOffset37, fixedNumber42, twoDigitYear46, matchingParser64 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder6.append((org.joda.time.format.DateTimePrinter) fixedNumber10, dateTimeParserArray65);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder66.appendLiteral("hi!");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder68.appendDayOfMonth((int) ' ');
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7) + "'", int14 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-7) + "'", int30 == (-7));
        org.junit.Assert.assertNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 13 + "'", int38 == 13);
        org.junit.Assert.assertNotNull(dateTimeParserArray62);
        org.junit.Assert.assertNotNull(dateTimeParserArray65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder70);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
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
        int int24 = timeZoneOffset5.estimatePrintedLength();
        int int25 = timeZoneOffset5.estimatePrintedLength();
        int int26 = timeZoneOffset5.estimatePrintedLength();
        int int27 = timeZoneOffset5.estimateParsedLength();
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 13 + "'", int25 == 13);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 13 + "'", int26 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13 + "'", int27 == 13);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMillisOfDay((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendFractionOfMinute(6, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder9.appendCenturyOfEra((int) (byte) 100, (-19));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder9.appendTimeZoneId();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendTimeZoneOffset("hi!", false, (int) ' ', (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder23.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendDayOfWeek((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder23.appendShortText(dateTimeFieldType27);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 13, false);
        int int4 = twoDigitYear3.estimateParsedLength();
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
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        int int5 = twoDigitYear3.estimateParsedLength();
        int int6 = twoDigitYear3.estimatePrintedLength();
        int int7 = twoDigitYear3.estimateParsedLength();
        int int8 = twoDigitYear3.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = null;
        int int12 = twoDigitYear3.parseInto(dateTimeParserBucket9, "", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 0, false);
        int int4 = unpaddedNumber3.estimateParsedLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) 'a', false);
        int int4 = unpaddedNumber3.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = unpaddedNumber3.iFieldType;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        int int9 = unpaddedNumber3.parseInto(dateTimeParserBucket6, "hi!", 0);
        boolean boolean10 = unpaddedNumber3.iSigned;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder1.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear9 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType6, (-21), false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder1.append((org.joda.time.format.DateTimePrinter) twoDigitYear9);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder1.appendCenturyOfEra(35, (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId14 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale17 = null;
        timeZoneId14.printTo(stringBuffer15, readablePartial16, locale17);
        java.io.Writer writer19 = null;
        org.joda.time.ReadablePartial readablePartial20 = null;
        java.util.Locale locale21 = null;
        timeZoneId14.printTo(writer19, readablePartial20, locale21);
        java.lang.StringBuffer stringBuffer23 = null;
        org.joda.time.ReadablePartial readablePartial24 = null;
        java.util.Locale locale25 = null;
        timeZoneId14.printTo(stringBuffer23, readablePartial24, locale25);
        int int27 = timeZoneId14.estimateParsedLength();
        java.io.Writer writer28 = null;
        org.joda.time.ReadablePartial readablePartial29 = null;
        java.util.Locale locale30 = null;
        timeZoneId14.printTo(writer28, readablePartial29, locale30);
        int int32 = timeZoneId14.estimatePrintedLength();
        int int33 = timeZoneId14.estimateParsedLength();
        int int34 = timeZoneId14.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder13.appendOptional((org.joda.time.format.DateTimeParser) timeZoneId14);
        java.lang.StringBuffer stringBuffer36 = null;
        org.joda.time.ReadablePartial readablePartial37 = null;
        java.util.Locale locale38 = null;
        timeZoneId14.printTo(stringBuffer36, readablePartial37, locale38);
        int int40 = timeZoneId14.estimatePrintedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + timeZoneId14 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId14.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder10.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendYearOfCentury(10, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder17.appendDayOfWeek((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendTwoDigitYear((-7));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket2 = null;
        int int5 = stringLiteral1.parseInto(dateTimeParserBucket2, "", (int) (short) 100);
        int int6 = stringLiteral1.estimatePrintedLength();
        int int7 = stringLiteral1.estimatePrintedLength();
        int int8 = stringLiteral1.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-101) + "'", int5 == (-101));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (byte) 0, false);
        int int4 = unpaddedNumber3.iMaxParsedDigits;
        int int5 = unpaddedNumber3.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendDayOfYear(2);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder0.appendCenturyOfEra(4, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendFractionOfSecond((int) (short) 0, 13);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction22 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType19, (int) (byte) 0, (int) (byte) 1);
        int int23 = fraction22.iMinDigits;
        int int24 = fraction22.iMaxDigits;
        int int25 = fraction22.iMaxDigits;
        fraction22.iMinDigits = 33;
        fraction22.iMinDigits = 32;
        int int30 = fraction22.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimeParser) fraction22);
        boolean boolean32 = dateTimeFormatterBuilder31.canBuildFormatter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendTwoDigitWeekyear((-4));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder19.appendTimeZoneId();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendDayOfYear(2);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder0.appendCenturyOfEra(4, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendFractionOfSecond((int) (short) 0, 13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendMonthOfYear(52);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder20.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendTimeZoneId();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (-7), false);
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
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
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
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction25 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType22, 97, (-21));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder21.appendOptional((org.joda.time.format.DateTimeParser) fraction25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (short) 10, 0);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer6, (long) 100, chronology8, (int) (short) 0, dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (short) 10, 0);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        int int6 = fraction3.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 97, true);
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
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (-3), 20);
        int int4 = fraction3.iMaxDigits;
        fraction3.iMinDigits = (short) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        boolean boolean22 = dateTimeFormatterBuilder21.canBuildPrinter();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber27 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType23, (int) (short) -1, true, 32);
        boolean boolean28 = paddedNumber27.iSigned;
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber32 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType29, (int) (short) 100, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = fixedNumber32.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder21.append((org.joda.time.format.DateTimePrinter) paddedNumber27, (org.joda.time.format.DateTimeParser) fixedNumber32);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = null;
        int int38 = fixedNumber32.parseInto(dateTimeParserBucket35, "", 3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = null;
        int int42 = fixedNumber32.parseInto(dateTimeParserBucket39, "", 1);
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral44 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int45 = characterLiteral44.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = null;
        int int49 = characterLiteral44.parseInto(dateTimeParserBucket46, "", 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral51 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int52 = stringLiteral51.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear56 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType53, (int) (short) 0, true);
        int int57 = twoDigitYear56.estimatePrintedLength();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap59 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName60 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap59);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction64 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType61, (int) (byte) 0, (int) (byte) 1);
        int int65 = fraction64.estimatePrintedLength();
        int int66 = fraction64.iMaxDigits;
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral68 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParser[] dateTimeParserArray69 = new org.joda.time.format.DateTimeParser[] { characterLiteral44, stringLiteral51, twoDigitYear56, timeZoneName60, fraction64, stringLiteral68 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser70 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray69);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser71 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray69);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser72 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray69);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder14.append((org.joda.time.format.DateTimePrinter) fixedNumber32, (org.joda.time.format.DateTimeParser) matchingParser72);
        int int74 = matchingParser72.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket75 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int78 = matchingParser72.parseInto(dateTimeParserBucket75, "hi!", 1);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-4) + "'", int38 == (-4));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2) + "'", int42 == (-2));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-2) + "'", int49 == (-2));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(dateTimeParserArray69);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 20 + "'", int74 == 20);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) '#', false);
        int int4 = fixedNumber3.iMinPrintedDigits;
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(writer5, (long) (-34), chronology7, (-34), dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendMinuteOfDay((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder18.appendFractionOfMinute(32, (-36));
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear29 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType26, (-21), false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder32.appendHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField37 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType35, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder34.appendOptional((org.joda.time.format.DateTimeParser) textField37);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimePrinter) twoDigitYear29, (org.joda.time.format.DateTimeParser) textField37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = textField37.parseInto(dateTimeParserBucket40, "hi!", (-7));
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName(32, strMap1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        timeZoneName2.printTo(stringBuffer3, readablePartial4, locale5);
        java.io.Writer writer7 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneName2.printTo(writer7, (long) 100, chronology9, 3, dateTimeZone11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendMonthOfYearShortText();
        boolean boolean5 = dateTimeFormatterBuilder4.canBuildPrinter();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber10 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType6, (int) (short) -1, true, 32);
        boolean boolean11 = paddedNumber10.iSigned;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber15 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType12, (int) (short) 100, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = fixedNumber15.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) paddedNumber10, (org.joda.time.format.DateTimeParser) fixedNumber15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder4.appendLiteral('a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder4.appendPattern("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendSecondOfMinute((int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber4 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 35, false, 20);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = paddedNumber4.iFieldType;
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = paddedNumber4.iFieldType;
        int int7 = paddedNumber4.estimateParsedLength();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            paddedNumber4.printTo(stringBuffer8, readablePartial9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeFieldType5);
        org.junit.Assert.assertNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendDayOfWeekShortText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap10 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendTimeZoneName(strMap10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder8.appendLiteral('#');
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendMonthOfYearShortText();
        boolean boolean5 = dateTimeFormatterBuilder4.canBuildPrinter();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber10 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType6, (int) (short) -1, true, 32);
        boolean boolean11 = paddedNumber10.iSigned;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber15 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType12, (int) (short) 100, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = fixedNumber15.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) paddedNumber10, (org.joda.time.format.DateTimeParser) fixedNumber15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder4.appendLiteral('a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder4.appendPattern("");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendHourOfHalfday((-98));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendLiteral("");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder22.appendTimeZoneOffset("hi!", "", false, (-7), (int) '#');
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (-7));
        fraction3.iMaxDigits = (short) 100;
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
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
        int int24 = timeZoneOffset5.estimatePrintedLength();
        int int25 = timeZoneOffset5.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer26 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        java.util.Locale locale31 = null;
        timeZoneOffset5.printTo(stringBuffer26, (long) (-11), chronology28, 32, dateTimeZone30, locale31);
        int int33 = timeZoneOffset5.estimatePrintedLength();
        java.io.Writer writer34 = null;
        org.joda.time.ReadablePartial readablePartial35 = null;
        java.util.Locale locale36 = null;
        timeZoneOffset5.printTo(writer34, readablePartial35, locale36);
        java.lang.StringBuffer stringBuffer38 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        java.util.Locale locale43 = null;
        timeZoneOffset5.printTo(stringBuffer38, (long) (-4), chronology40, (int) (short) -1, dateTimeZone42, locale43);
        java.io.Writer writer45 = null;
        org.joda.time.ReadablePartial readablePartial46 = null;
        java.util.Locale locale47 = null;
        timeZoneOffset5.printTo(writer45, readablePartial46, locale47);
        java.lang.StringBuffer stringBuffer49 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        java.util.Locale locale54 = null;
        timeZoneOffset5.printTo(stringBuffer49, (long) (-14), chronology51, (int) (byte) 10, dateTimeZone53, locale54);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 13 + "'", int25 == 13);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13 + "'", int33 == 13);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 97, false);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendDayOfMonth((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction28 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType25, (int) (byte) 0, (int) (byte) 1);
        int int29 = fraction28.estimateParsedLength();
        int int30 = fraction28.estimatePrintedLength();
        fraction28.iMinDigits = (short) 100;
        int int33 = fraction28.iMinDigits;
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral35 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int36 = characterLiteral35.estimateParsedLength();
        int int37 = characterLiteral35.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = null;
        int int41 = characterLiteral35.parseInto(dateTimeParserBucket38, "", (int) (byte) 10);
        int int42 = characterLiteral35.estimatePrintedLength();
        int int43 = characterLiteral35.estimateParsedLength();
        int int44 = characterLiteral35.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder22.append((org.joda.time.format.DateTimePrinter) fraction28, (org.joda.time.format.DateTimeParser) characterLiteral35);
        int int46 = characterLiteral35.estimateParsedLength();
        int int47 = characterLiteral35.estimateParsedLength();
        int int48 = characterLiteral35.estimatePrintedLength();
        int int49 = characterLiteral35.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = null;
        int int53 = characterLiteral35.parseInto(dateTimeParserBucket50, "", 0);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-11) + "'", int41 == (-11));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
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
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap21 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder17.appendTimeZoneName(strMap21);
        boolean boolean23 = dateTimeFormatterBuilder22.canBuildParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatterBuilder22.toFormatter();
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendDayOfYear((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder11.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField23 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType21, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField26 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType24, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimePrinter) textField23, (org.joda.time.format.DateTimeParser) textField26);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder15.append((org.joda.time.format.DateTimePrinter) textField23);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder28.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral31 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder29.append((org.joda.time.format.DateTimeParser) stringLiteral31);
        int int33 = stringLiteral31.estimateParsedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction37 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType34, (int) (byte) 0, (int) (byte) 1);
        int int38 = fraction37.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder10.append((org.joda.time.format.DateTimePrinter) stringLiteral31, (org.joda.time.format.DateTimeParser) fraction37);
        int int40 = fraction37.iMinDigits;
        java.lang.StringBuffer stringBuffer41 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        java.util.Locale locale46 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction37.printTo(stringBuffer41, (long) 'a', chronology43, 6, dateTimeZone45, locale46);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendFractionOfHour((int) 'a', (int) (byte) -1);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatterBuilder13.toParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendFractionOfDay((-2), (-53));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeParser14);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (-7), true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = twoDigitYear3.parseInto(dateTimeParserBucket4, "hi!", (int) (byte) 100);
        java.io.Writer writer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer8, readablePartial9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-101) + "'", int7 == (-101));
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (-2), false);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "hi!", (-34));
        int int8 = fixedNumber3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        java.util.Locale locale14 = null;
        fixedNumber3.printTo(stringBuffer9, (long) (-34), chronology11, 0, dateTimeZone13, locale14);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
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
        int int20 = timeZoneId0.estimatePrintedLength();
        int int21 = timeZoneId0.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = timeZoneId0.parseInto(dateTimeParserBucket22, "hi!", (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -101");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear24 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType21, 6, true);
        int int25 = twoDigitYear24.estimatePrintedLength();
        int int26 = twoDigitYear24.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber30 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType27, 18, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimePrinter) twoDigitYear24, (org.joda.time.format.DateTimeParser) unpaddedNumber30);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendDayOfMonth(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder31.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder34.appendDayOfWeekShortText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 2, true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = twoDigitYear3.parseInto(dateTimeParserBucket4, "", 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendTimeZoneShortName(strMap7);
        boolean boolean9 = dateTimeFormatterBuilder2.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder2.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder2.appendWeekOfWeekyear(52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber10 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType7, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = null;
        int int14 = fixedNumber10.parseInto(dateTimeParserBucket11, "hi!", 6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = null;
        int int18 = fixedNumber10.parseInto(dateTimeParserBucket15, "hi!", 0);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral20 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int21 = stringLiteral20.estimatePrintedLength();
        int int22 = stringLiteral20.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber26 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType23, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = null;
        int int30 = fixedNumber26.parseInto(dateTimeParserBucket27, "hi!", 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = fixedNumber26.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset37 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        int int38 = timeZoneOffset37.estimateParsedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber42 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType39, (int) ' ', true);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear46 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType43, (-14), false);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField49 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType47, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField52 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType50, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField55 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType53, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField58 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType56, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField61 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType59, true);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray62 = new org.joda.time.format.DateTimeParser[] { textField49, textField52, textField55, textField58, textField61 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser63 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray62);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser64 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray62);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray65 = new org.joda.time.format.DateTimeParser[] { stringLiteral20, fixedNumber26, timeZoneOffset37, fixedNumber42, twoDigitYear46, matchingParser64 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder6.append((org.joda.time.format.DateTimePrinter) fixedNumber10, dateTimeParserArray65);
        int int67 = fixedNumber10.iMinPrintedDigits;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = null;
        int int71 = fixedNumber10.parseInto(dateTimeParserBucket68, "", (int) (byte) 1);
        java.lang.StringBuffer stringBuffer72 = null;
        org.joda.time.ReadablePartial readablePartial73 = null;
        java.util.Locale locale74 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber10.printTo(stringBuffer72, readablePartial73, locale74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7) + "'", int14 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-7) + "'", int30 == (-7));
        org.junit.Assert.assertNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 13 + "'", int38 == 13);
        org.junit.Assert.assertNotNull(dateTimeParserArray62);
        org.junit.Assert.assertNotNull(dateTimeParserArray65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 32 + "'", int67 == 32);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-2) + "'", int71 == (-2));
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder1.appendFractionOfDay(0, 4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder1.appendDayOfYear((int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
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
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap15 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder12.appendTimeZoneName(strMap15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder12.appendClockhourOfHalfday((-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) 'a', false);
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
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) (short) 0, false);
        int int4 = unpaddedNumber3.estimateParsedLength();
        int int5 = unpaddedNumber3.iMaxParsedDigits;
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer6, (long) (-2), chronology8, (-34), dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
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
        org.joda.time.ReadablePartial readablePartial13 = null;
        java.util.Locale locale14 = null;
        timeZoneName2.printTo(stringBuffer12, readablePartial13, locale14);
        java.lang.StringBuffer stringBuffer16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        java.util.Locale locale18 = null;
        timeZoneName2.printTo(stringBuffer16, readablePartial17, locale18);
        java.io.Writer writer20 = null;
        org.joda.time.ReadablePartial readablePartial21 = null;
        java.util.Locale locale22 = null;
        timeZoneName2.printTo(writer20, readablePartial21, locale22);
        java.io.Writer writer24 = null;
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale26 = null;
        timeZoneName2.printTo(writer24, readablePartial25, locale26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder69.appendPattern("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder74 = dateTimeFormatterBuilder69.appendFractionOfSecond(33, 32);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder71);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder74);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
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
        java.io.Writer writer15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale17 = null;
        timeZoneId0.printTo(writer15, readablePartial16, locale17);
        java.lang.StringBuffer stringBuffer19 = null;
        org.joda.time.ReadablePartial readablePartial20 = null;
        java.util.Locale locale21 = null;
        timeZoneId0.printTo(stringBuffer19, readablePartial20, locale21);
        java.lang.StringBuffer stringBuffer23 = null;
        org.joda.time.ReadablePartial readablePartial24 = null;
        java.util.Locale locale25 = null;
        timeZoneId0.printTo(stringBuffer23, readablePartial24, locale25);
        java.lang.StringBuffer stringBuffer27 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        java.util.Locale locale32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(stringBuffer27, (long) (-33), chronology29, (int) (byte) 10, dateTimeZone31, locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
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
        int int14 = timeZoneId0.estimateParsedLength();
        int int15 = timeZoneId0.estimateParsedLength();
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendSecondOfDay((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendOptional((org.joda.time.format.DateTimeParser) characterLiteral6);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneShortName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset16 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        java.util.Locale locale22 = null;
        timeZoneOffset16.printTo(stringBuffer17, (long) 20, chronology19, (int) (byte) 10, dateTimeZone21, locale22);
        java.lang.StringBuffer stringBuffer24 = null;
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale26 = null;
        timeZoneOffset16.printTo(stringBuffer24, readablePartial25, locale26);
        java.lang.StringBuffer stringBuffer28 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        java.util.Locale locale33 = null;
        timeZoneOffset16.printTo(stringBuffer28, (long) (short) 1, chronology30, (int) (byte) 10, dateTimeZone32, locale33);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = null;
        int int38 = timeZoneOffset16.parseInto(dateTimeParserBucket35, "hi!", 2);
        java.lang.StringBuffer stringBuffer39 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        java.util.Locale locale44 = null;
        timeZoneOffset16.printTo(stringBuffer39, (long) 6, chronology41, (-1), dateTimeZone43, locale44);
        java.io.Writer writer46 = null;
        org.joda.time.ReadablePartial readablePartial47 = null;
        java.util.Locale locale48 = null;
        timeZoneOffset16.printTo(writer46, readablePartial47, locale48);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder50.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral54 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral56 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder52.append((org.joda.time.format.DateTimePrinter) characterLiteral54, (org.joda.time.format.DateTimeParser) characterLiteral56);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder10.append((org.joda.time.format.DateTimePrinter) timeZoneOffset16, (org.joda.time.format.DateTimeParser) characterLiteral56);
        int int59 = characterLiteral56.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer60 = null;
        org.joda.time.ReadablePartial readablePartial61 = null;
        java.util.Locale locale62 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral56.printTo(stringBuffer60, readablePartial61, locale62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-3) + "'", int38 == (-3));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction7 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType4, (int) (byte) 0, (int) (byte) 1);
        int int8 = fraction7.estimateParsedLength();
        fraction7.iMaxDigits = 3;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append((org.joda.time.format.DateTimePrinter) fraction7);
        fraction7.iMaxDigits = 2;
        int int14 = fraction7.estimateParsedLength();
        java.io.Writer writer15 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction7.printTo(writer15, (long) (-3), chronology17, (int) (byte) 100, dateTimeZone19, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendDayOfWeekShortText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap18 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder15.appendTimeZoneShortName(strMap18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber24 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType20, 35, true, (int) (short) 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = null;
        int int28 = paddedNumber24.parseInto(dateTimeParserBucket25, "hi!", 97);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimeParser) paddedNumber24);
        boolean boolean30 = paddedNumber24.iSigned;
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-98) + "'", int28 == (-98));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFractionOfHour(4, 4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfSecond((int) (byte) 100, (-101));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder11.appendMinuteOfDay((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder16.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder16.appendWeekyear(13, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendMillisOfSecond((int) '#');
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
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
        java.io.Writer writer35 = null;
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale37 = null;
        timeZoneOffset5.printTo(writer35, readablePartial36, locale37);
        java.lang.StringBuffer stringBuffer39 = null;
        org.joda.time.ReadablePartial readablePartial40 = null;
        java.util.Locale locale41 = null;
        timeZoneOffset5.printTo(stringBuffer39, readablePartial40, locale41);
        java.lang.StringBuffer stringBuffer43 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        java.util.Locale locale48 = null;
        timeZoneOffset5.printTo(stringBuffer43, (long) (short) 1, chronology45, 97, dateTimeZone47, locale48);
        java.lang.StringBuffer stringBuffer50 = null;
        org.joda.time.ReadablePartial readablePartial51 = null;
        java.util.Locale locale52 = null;
        timeZoneOffset5.printTo(stringBuffer50, readablePartial51, locale52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
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
        java.io.Writer writer15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale17 = null;
        timeZoneId0.printTo(writer15, readablePartial16, locale17);
        java.io.Writer writer19 = null;
        org.joda.time.ReadablePartial readablePartial20 = null;
        java.util.Locale locale21 = null;
        timeZoneId0.printTo(writer19, readablePartial20, locale21);
        int int23 = timeZoneId0.estimatePrintedLength();
        java.io.Writer writer24 = null;
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale26 = null;
        timeZoneId0.printTo(writer24, readablePartial25, locale26);
        java.io.Writer writer28 = null;
        org.joda.time.ReadablePartial readablePartial29 = null;
        java.util.Locale locale30 = null;
        timeZoneId0.printTo(writer28, readablePartial29, locale30);
        int int32 = timeZoneId0.estimatePrintedLength();
        int int33 = timeZoneId0.estimateParsedLength();
        java.lang.StringBuffer stringBuffer34 = null;
        org.joda.time.ReadablePartial readablePartial35 = null;
        java.util.Locale locale36 = null;
        timeZoneId0.printTo(stringBuffer34, readablePartial35, locale36);
        java.io.Writer writer38 = null;
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale40 = null;
        timeZoneId0.printTo(writer38, readablePartial39, locale40);
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.iMaxDigits;
        fraction3.iMaxDigits = 33;
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
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder57.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder57.appendTwoDigitYear((-11));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder57.appendTwoDigitYear(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder62.appendTwoDigitYear((int) (byte) -1, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder65.appendTwoDigitYear((-11), false);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap1);
        int int3 = timeZoneName2.estimateParsedLength();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        timeZoneName2.printTo(stringBuffer4, readablePartial5, locale6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral12 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral14 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder10.append((org.joda.time.format.DateTimePrinter) characterLiteral12, (org.joda.time.format.DateTimeParser) characterLiteral14);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral17 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int18 = stringLiteral17.estimateParsedLength();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray19 = new org.joda.time.format.DateTimeParser[] { timeZoneName2, characterLiteral12, stringLiteral17 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser20 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray19);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser21 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray19);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction25 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType22, (int) (short) 10, 0);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray26 = new org.joda.time.format.DateTimeParser[] { matchingParser21, fraction25 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser27 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray26);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser28 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray26);
        int int29 = matchingParser28.estimateParsedLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeParserArray19);
        org.junit.Assert.assertNotNull(dateTimeParserArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder22.appendDayOfWeekShortText();
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
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (-1), (-11));
        int int4 = fraction3.iMinDigits;
        java.lang.StringBuffer stringBuffer5 = null;
        java.io.Writer writer6 = null;
        org.joda.time.Chronology chronology8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer5, writer6, (long) (-4), chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendFractionOfDay(0, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatterBuilder7.toPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimePrinter8);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
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
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder18.appendCenturyOfEra((-21), (-11));
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
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay(2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendClockhourOfHalfday(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatterBuilder7.toFormatter();
        dateTimeFormatterBuilder7.clear();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber4 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 4, false, (int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = paddedNumber4.iFieldType;
        java.io.Writer writer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            paddedNumber4.printTo(writer6, (long) (byte) 0, chronology8, (int) '#', dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeFieldType5);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        int int4 = characterLiteral1.estimateParsedLength();
        int int5 = characterLiteral1.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        int int9 = characterLiteral1.parseInto(dateTimeParserBucket6, "hi!", (int) 'a');
        int int10 = characterLiteral1.estimateParsedLength();
        int int11 = characterLiteral1.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = null;
        int int15 = characterLiteral1.parseInto(dateTimeParserBucket12, "", 0);
        int int16 = characterLiteral1.estimateParsedLength();
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.ReadablePartial readablePartial18 = null;
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer17, readablePartial18, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-98) + "'", int9 == (-98));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendYearOfEra(2, 13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendTwoDigitYear((-7), true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendTwoDigitYear(100, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField24 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType22, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField27 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType25, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) textField24, (org.joda.time.format.DateTimeParser) textField27);
        int int29 = textField27.estimatePrintedLength();
        int int30 = textField27.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder18.appendOptional((org.joda.time.format.DateTimeParser) textField27);
        int int32 = textField27.estimatePrintedLength();
        int int33 = textField27.estimatePrintedLength();
        int int34 = textField27.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField40 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType38, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField43 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType41, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder35.append((org.joda.time.format.DateTimePrinter) textField40, (org.joda.time.format.DateTimeParser) textField43);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder35.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction50 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType47, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral52 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = null;
        int int56 = stringLiteral52.parseInto(dateTimeParserBucket53, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder46.append((org.joda.time.format.DateTimePrinter) fraction50, (org.joda.time.format.DateTimeParser) stringLiteral52);
        fraction50.iMaxDigits = 4;
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral61 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int62 = characterLiteral61.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = null;
        int int66 = characterLiteral61.parseInto(dateTimeParserBucket63, "", 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral68 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int69 = stringLiteral68.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear73 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType70, (int) (short) 0, true);
        int int74 = twoDigitYear73.estimatePrintedLength();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap76 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName77 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap76);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction81 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType78, (int) (byte) 0, (int) (byte) 1);
        int int82 = fraction81.estimatePrintedLength();
        int int83 = fraction81.iMaxDigits;
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral85 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParser[] dateTimeParserArray86 = new org.joda.time.format.DateTimeParser[] { characterLiteral61, stringLiteral68, twoDigitYear73, timeZoneName77, fraction81, stringLiteral85 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser87 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray86);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral89 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParser[] dateTimeParserArray90 = new org.joda.time.format.DateTimeParser[] { fraction50, matchingParser87, stringLiteral89 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser91 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray90);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder92 = dateTimeFormatterBuilder6.append((org.joda.time.format.DateTimePrinter) textField27, dateTimeParserArray90);
        int int93 = textField27.estimateParsedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-101) + "'", int56 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-2) + "'", int66 == (-2));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(dateTimeParserArray86);
        org.junit.Assert.assertNotNull(dateTimeParserArray90);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 6 + "'", int93 == 6);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
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
        boolean boolean22 = dateTimeFormatterBuilder21.canBuildParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber27 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType23, (int) (byte) 100, true, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder21.append((org.joda.time.format.DateTimePrinter) paddedNumber27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder21.appendYearOfCentury((-53), (int) ' ');
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        dateTimeFormatterBuilder8.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendHalfdayOfDayText();
        dateTimeFormatterBuilder10.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendMillisOfDay(52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
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
        int int25 = fraction15.estimateParsedLength();
        int int26 = fraction15.estimateParsedLength();
        fraction15.iMinDigits = 13;
        int int29 = fraction15.iMinDigits;
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 13 + "'", int29 == 13);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMillisOfDay((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfDay((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendSecondOfDay(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber17 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType14, (int) (short) 100, false);
        int int18 = fixedNumber17.iMaxParsedDigits;
        int int19 = fixedNumber17.iMaxParsedDigits;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset25 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer26 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        java.util.Locale locale31 = null;
        timeZoneOffset25.printTo(stringBuffer26, (long) 20, chronology28, (int) (byte) 10, dateTimeZone30, locale31);
        java.lang.StringBuffer stringBuffer33 = null;
        org.joda.time.ReadablePartial readablePartial34 = null;
        java.util.Locale locale35 = null;
        timeZoneOffset25.printTo(stringBuffer33, readablePartial34, locale35);
        java.lang.StringBuffer stringBuffer37 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        java.util.Locale locale42 = null;
        timeZoneOffset25.printTo(stringBuffer37, (long) (short) 1, chronology39, (int) (byte) 10, dateTimeZone41, locale42);
        int int44 = timeZoneOffset25.estimatePrintedLength();
        int int45 = timeZoneOffset25.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer46 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        java.util.Locale locale51 = null;
        timeZoneOffset25.printTo(stringBuffer46, (long) (-11), chronology48, 32, dateTimeZone50, locale51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField55 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType53, true);
        int int56 = textField55.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder57.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder57.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatterBuilder59.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder59.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder59.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder65.appendTimeZoneShortName();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber70 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType67, (int) ' ', true);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber74 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType71, (int) (short) 100, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = fixedNumber74.iFieldType;
        int int76 = fixedNumber74.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder65.append((org.joda.time.format.DateTimePrinter) fixedNumber70, (org.joda.time.format.DateTimeParser) fixedNumber74);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber81 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType78, 3, true);
        int int82 = unpaddedNumber81.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder83 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder85 = dateTimeFormatterBuilder83.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder87 = dateTimeFormatterBuilder85.appendHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField90 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType88, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder91 = dateTimeFormatterBuilder87.appendOptional((org.joda.time.format.DateTimeParser) textField90);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray92 = new org.joda.time.format.DateTimeParser[] { timeZoneOffset25, textField55, fixedNumber74, unpaddedNumber81, textField90 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder93 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) fixedNumber17, dateTimeParserArray92);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser94 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray92);
        int int95 = matchingParser94.estimateParsedLength();
        int int96 = matchingParser94.estimateParsedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 13 + "'", int44 == 13);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 13 + "'", int45 == 13);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 6 + "'", int56 == 6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertNull(dateTimeFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder77);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 3 + "'", int82 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder85);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder87);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder91);
        org.junit.Assert.assertNotNull(dateTimeParserArray92);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder93);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 100 + "'", int95 == 100);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 100 + "'", int96 == 100);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder24.appendTimeZoneOffset("hi!", "hi!", false, 1, 32);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendPattern("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder30.appendYear((int) '#', (-36));
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = dateTimeFormatterBuilder30.toPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimePrinter36);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) '#', strMap1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        timeZoneName2.printTo(stringBuffer3, readablePartial4, locale5);
        java.io.Writer writer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        timeZoneName2.printTo(writer7, readablePartial8, locale9);
        int int11 = timeZoneName2.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        java.util.Locale locale14 = null;
        timeZoneName2.printTo(stringBuffer12, readablePartial13, locale14);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMillisOfDay((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendFractionOfMinute(6, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder9.appendCenturyOfEra((int) (byte) 100, (-19));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendYearOfEra(97, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendFractionOfMinute((-3), (-34));
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
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
        org.joda.time.ReadablePartial readablePartial19 = null;
        java.util.Locale locale20 = null;
        timeZoneId0.printTo(writer18, readablePartial19, locale20);
        java.lang.StringBuffer stringBuffer22 = null;
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale24 = null;
        timeZoneId0.printTo(stringBuffer22, readablePartial23, locale24);
        int int26 = timeZoneId0.estimateParsedLength();
        java.io.Writer writer27 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        java.util.Locale locale32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(writer27, (long) 0, chronology29, (int) (short) 0, dateTimeZone31, locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
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
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser17 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray15);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser18 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray15);
        int int19 = matchingParser18.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = matchingParser18.parseInto(dateTimeParserBucket20, "", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeParserArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendFractionOfDay((int) '#', 3);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber17 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType13, (int) (byte) -1, false, (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder12.appendOptional((org.joda.time.format.DateTimeParser) paddedNumber17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
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
        int int19 = textField12.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = textField12.parseInto(dateTimeParserBucket20, "", (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) '#', true);
        int int4 = unpaddedNumber3.estimatePrintedLength();
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer5, (long) ' ', chronology7, (int) (byte) 0, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 20, true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer4, (long) '4', chronology6, 100, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket2 = null;
        int int5 = stringLiteral1.parseInto(dateTimeParserBucket2, "hi!", (int) (byte) 1);
        int int6 = stringLiteral1.estimateParsedLength();
        java.io.Writer writer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer7, readablePartial8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
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
        boolean boolean31 = dateTimeFormatterBuilder11.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder11.appendFractionOfMinute((int) (byte) 1, 20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder34.appendYear((-11), (-11));
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder20.appendLiteral("hi!");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder28.appendFractionOfHour(13, 32);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder31.appendFractionOfDay(3, 35);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTimeZoneId();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendTimeZoneName(strMap4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendDayOfYear((int) ' ');
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
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
        int int17 = timeZoneOffset5.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer18 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        java.util.Locale locale23 = null;
        timeZoneOffset5.printTo(stringBuffer18, 1L, chronology20, (int) (byte) 0, dateTimeZone22, locale23);
        int int25 = timeZoneOffset5.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer26 = null;
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale28 = null;
        timeZoneOffset5.printTo(stringBuffer26, readablePartial27, locale28);
        java.io.Writer writer30 = null;
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale32 = null;
        timeZoneOffset5.printTo(writer30, readablePartial31, locale32);
        java.lang.StringBuffer stringBuffer34 = null;
        org.joda.time.ReadablePartial readablePartial35 = null;
        java.util.Locale locale36 = null;
        timeZoneOffset5.printTo(stringBuffer34, readablePartial35, locale36);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 13 + "'", int17 == 13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 13 + "'", int25 == 13);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
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
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = null;
        int int37 = timeZoneOffset5.parseInto(dateTimeParserBucket34, "", (int) (byte) 1);
        java.lang.StringBuffer stringBuffer38 = null;
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale40 = null;
        timeZoneOffset5.printTo(stringBuffer38, readablePartial39, locale40);
        int int42 = timeZoneOffset5.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 13 + "'", int32 == 13);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13 + "'", int33 == 13);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 13 + "'", int42 == 13);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
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
        boolean boolean20 = dateTimeFormatterBuilder17.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder17.appendMonthOfYearShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendText(dateTimeFieldType22);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap1);
        int int3 = timeZoneName2.estimateParsedLength();
        int int4 = timeZoneName2.estimatePrintedLength();
        int int5 = timeZoneName2.estimateParsedLength();
        java.io.Writer writer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale8 = null;
        timeZoneName2.printTo(writer6, readablePartial7, locale8);
        int int10 = timeZoneName2.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale13 = null;
        timeZoneName2.printTo(stringBuffer11, readablePartial12, locale13);
        java.io.Writer writer15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale17 = null;
        timeZoneName2.printTo(writer15, readablePartial16, locale17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
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
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral16 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int17 = characterLiteral16.estimateParsedLength();
        int int18 = characterLiteral16.estimateParsedLength();
        int int19 = characterLiteral16.estimateParsedLength();
        int int20 = characterLiteral16.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = null;
        int int24 = characterLiteral16.parseInto(dateTimeParserBucket21, "hi!", (int) 'a');
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder14.append((org.joda.time.format.DateTimePrinter) characterLiteral16, dateTimeParserArray51);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder14.appendHourOfDay(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder14.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder57.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder57.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatterBuilder59.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder59.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder59.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatterBuilder59.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder56.append(dateTimeFormatter65);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction70 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType67, (-1), (-11));
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral72 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = null;
        int int76 = stringLiteral72.parseInto(dateTimeParserBucket73, "", (int) (short) 100);
        int int77 = stringLiteral72.estimatePrintedLength();
        int int78 = stringLiteral72.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder79 = dateTimeFormatterBuilder66.append((org.joda.time.format.DateTimePrinter) fraction70, (org.joda.time.format.DateTimeParser) stringLiteral72);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-98) + "'", int24 == (-98));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-2) + "'", int31 == (-2));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(dateTimeParserArray51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-101) + "'", int76 == (-101));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 3 + "'", int78 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder79);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
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
        dateTimeFormatterBuilder21.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder21.appendTwoDigitYear((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder21.appendMonthOfYear((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, 10, (int) (byte) 10);
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        timeZoneOffset5.printTo(stringBuffer6, (long) (-3), chronology8, (-1), dateTimeZone10, locale11);
        java.io.Writer writer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale15 = null;
        timeZoneOffset5.printTo(writer13, readablePartial14, locale15);
        java.io.Writer writer17 = null;
        org.joda.time.ReadablePartial readablePartial18 = null;
        java.util.Locale locale19 = null;
        timeZoneOffset5.printTo(writer17, readablePartial18, locale19);
        java.lang.StringBuffer stringBuffer21 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        java.util.Locale locale26 = null;
        timeZoneOffset5.printTo(stringBuffer21, (long) 18, chronology23, 20, dateTimeZone25, locale26);
        java.lang.StringBuffer stringBuffer28 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        java.util.Locale locale33 = null;
        timeZoneOffset5.printTo(stringBuffer28, (long) (-7), chronology30, (-34), dateTimeZone32, locale33);
        java.io.Writer writer35 = null;
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale37 = null;
        timeZoneOffset5.printTo(writer35, readablePartial36, locale37);
        java.lang.StringBuffer stringBuffer39 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        java.util.Locale locale44 = null;
        timeZoneOffset5.printTo(stringBuffer39, (long) 6, chronology41, 13, dateTimeZone43, locale44);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder2.appendTwoDigitWeekyear(6, false);
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatterBuilder11.toParser();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeParser12);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendPattern("");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap10 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendTimeZoneShortName(strMap10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendHalfdayOfDayText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder10.appendPattern("");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder10.appendMinuteOfHour((-2));
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
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        fraction3.iMinDigits = (short) 1;
        fraction3.iMaxDigits = ' ';
        int int10 = fraction3.iMinDigits;
        int int11 = fraction3.estimateParsedLength();
        int int12 = fraction3.iMinDigits;
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer13, readablePartial14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
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
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap21 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendTimeZoneName(strMap21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder18.appendClockhourOfHalfday((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendMinuteOfDay((-53));
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder7.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder7.appendDayOfYear(2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField23 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType21, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField26 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType24, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimePrinter) textField23, (org.joda.time.format.DateTimeParser) textField26);
        int int28 = textField26.estimatePrintedLength();
        int int29 = textField26.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId30 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer31 = null;
        org.joda.time.ReadablePartial readablePartial32 = null;
        java.util.Locale locale33 = null;
        timeZoneId30.printTo(stringBuffer31, readablePartial32, locale33);
        java.io.Writer writer35 = null;
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale37 = null;
        timeZoneId30.printTo(writer35, readablePartial36, locale37);
        java.lang.StringBuffer stringBuffer39 = null;
        org.joda.time.ReadablePartial readablePartial40 = null;
        java.util.Locale locale41 = null;
        timeZoneId30.printTo(stringBuffer39, readablePartial40, locale41);
        int int43 = timeZoneId30.estimateParsedLength();
        java.io.Writer writer44 = null;
        org.joda.time.ReadablePartial readablePartial45 = null;
        java.util.Locale locale46 = null;
        timeZoneId30.printTo(writer44, readablePartial45, locale46);
        int int48 = timeZoneId30.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField26, (org.joda.time.format.DateTimeParser) timeZoneId30);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimeParser) textField26);
        int int51 = textField26.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int55 = textField26.parseInto(dateTimeParserBucket52, "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertTrue("'" + timeZoneId30 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId30.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 6 + "'", int51 == 6);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder5.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendMonthOfYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder5.appendDayOfWeek((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder5.appendEraText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap15 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendTimeZoneName(strMap15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction7 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType4, (int) (byte) 0, (int) (byte) 1);
        int int8 = fraction7.estimateParsedLength();
        fraction7.iMaxDigits = 3;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append((org.joda.time.format.DateTimePrinter) fraction7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendSecondOfDay((int) ' ');
        boolean boolean14 = dateTimeFormatterBuilder11.canBuildParser();
        dateTimeFormatterBuilder11.clear();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (-7), true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        fixedNumber3.printTo(stringBuffer4, (long) (-101), chronology6, (int) (byte) 10, dateTimeZone8, locale9);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
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
        int int23 = fraction15.estimatePrintedLength();
        int int24 = fraction15.iMaxDigits;
        int int25 = fraction15.iMaxDigits;
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral12 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int13 = stringLiteral12.estimatePrintedLength();
        int int14 = stringLiteral12.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField20 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType18, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField23 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType21, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder15.append((org.joda.time.format.DateTimePrinter) textField20, (org.joda.time.format.DateTimeParser) textField23);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder15.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction30 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType27, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral32 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = null;
        int int36 = stringLiteral32.parseInto(dateTimeParserBucket33, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder26.append((org.joda.time.format.DateTimePrinter) fraction30, (org.joda.time.format.DateTimeParser) stringLiteral32);
        fraction30.iMaxDigits = 4;
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral41 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int42 = characterLiteral41.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = null;
        int int46 = characterLiteral41.parseInto(dateTimeParserBucket43, "", 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral48 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int49 = stringLiteral48.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear53 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType50, (int) (short) 0, true);
        int int54 = twoDigitYear53.estimatePrintedLength();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap56 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName57 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction61 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType58, (int) (byte) 0, (int) (byte) 1);
        int int62 = fraction61.estimatePrintedLength();
        int int63 = fraction61.iMaxDigits;
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral65 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParser[] dateTimeParserArray66 = new org.joda.time.format.DateTimeParser[] { characterLiteral41, stringLiteral48, twoDigitYear53, timeZoneName57, fraction61, stringLiteral65 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser67 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray66);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral69 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParser[] dateTimeParserArray70 = new org.joda.time.format.DateTimeParser[] { fraction30, matchingParser67, stringLiteral69 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser71 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray70);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder72 = dateTimeFormatterBuilder10.append((org.joda.time.format.DateTimePrinter) stringLiteral12, dateTimeParserArray70);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder72.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder75 = dateTimeFormatterBuilder72.appendDayOfWeek(0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-101) + "'", int36 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-2) + "'", int46 == (-2));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(dateTimeParserArray66);
        org.junit.Assert.assertNotNull(dateTimeParserArray70);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder72);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder75);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendFractionOfDay(0, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendClockhourOfHalfday((int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatterBuilder8.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendHourOfDay(13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder12.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder18.appendTimeZoneId();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap20 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTimeZoneShortName(strMap20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder22.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatterBuilder23.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder19.append(dateTimeFormatter27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder8.append(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.appendEraText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder21.appendFractionOfMinute((-4), (int) (byte) -1);
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
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendTwoDigitYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendMonthOfYearText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfMonth((-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
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
        java.lang.StringBuffer stringBuffer18 = null;
        org.joda.time.ReadablePartial readablePartial19 = null;
        java.util.Locale locale20 = null;
        timeZoneId0.printTo(stringBuffer18, readablePartial19, locale20);
        java.lang.StringBuffer stringBuffer22 = null;
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale24 = null;
        timeZoneId0.printTo(stringBuffer22, readablePartial23, locale24);
        java.io.Writer writer26 = null;
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale28 = null;
        timeZoneId0.printTo(writer26, readablePartial27, locale28);
        int int30 = timeZoneId0.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
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
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap18 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder4.appendTimeZoneName(strMap18);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTwoDigitYear(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder21.appendTimeZoneOffset("hi!", false, 18, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder21.appendSecondOfMinute(20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder21.appendTwoDigitWeekyear(33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder17.appendTwoDigitWeekyear((int) ' ', true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder17.appendTwoDigitYear(4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendMinuteOfDay((int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatterBuilder28.toFormatter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendMonthOfYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay(97);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder2.appendTimeZoneShortName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendClockhourOfHalfday((-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
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
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear25 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType22, 4, false);
        int int26 = twoDigitYear25.estimateParsedLength();
        int int27 = twoDigitYear25.estimateParsedLength();
        int int28 = twoDigitYear25.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder21.append((org.joda.time.format.DateTimeParser) twoDigitYear25);
        int int30 = twoDigitYear25.estimatePrintedLength();
        int int31 = twoDigitYear25.estimatePrintedLength();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) (byte) 100, strMap1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        timeZoneName2.printTo(stringBuffer3, readablePartial4, locale5);
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        timeZoneName2.printTo(stringBuffer7, readablePartial8, locale9);
        int int11 = timeZoneName2.estimateParsedLength();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        java.util.Locale locale14 = null;
        timeZoneName2.printTo(stringBuffer12, readablePartial13, locale14);
        java.lang.StringBuffer stringBuffer16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        java.util.Locale locale18 = null;
        timeZoneName2.printTo(stringBuffer16, readablePartial17, locale18);
        int int20 = timeZoneName2.estimateParsedLength();
        java.lang.StringBuffer stringBuffer21 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneName2.printTo(stringBuffer21, (long) (-3), chronology23, (-7), dateTimeZone25, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMillisOfDay((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendFractionOfMinute(6, (int) (short) -1);
        boolean boolean13 = dateTimeFormatterBuilder9.canBuildFormatter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
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
        java.lang.StringBuffer stringBuffer32 = null;
        org.joda.time.ReadablePartial readablePartial33 = null;
        java.util.Locale locale34 = null;
        timeZoneOffset5.printTo(stringBuffer32, readablePartial33, locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = null;
        int int39 = timeZoneOffset5.parseInto(dateTimeParserBucket36, "", 10);
        int int40 = timeZoneOffset5.estimateParsedLength();
        java.lang.StringBuffer stringBuffer41 = null;
        org.joda.time.ReadablePartial readablePartial42 = null;
        java.util.Locale locale43 = null;
        timeZoneOffset5.printTo(stringBuffer41, readablePartial42, locale43);
        java.io.Writer writer45 = null;
        org.joda.time.ReadablePartial readablePartial46 = null;
        java.util.Locale locale47 = null;
        timeZoneOffset5.printTo(writer45, readablePartial46, locale47);
        java.lang.StringBuffer stringBuffer49 = null;
        org.joda.time.ReadablePartial readablePartial50 = null;
        java.util.Locale locale51 = null;
        timeZoneOffset5.printTo(stringBuffer49, readablePartial50, locale51);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-11) + "'", int39 == (-11));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 13 + "'", int40 == 13);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendFractionOfSecond(6, 35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder17.appendDayOfMonth((-53));
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (-3), 20);
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
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneId();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneShortName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYearOfCentury(4, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendFractionOfHour(0, 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder15.appendSignedDecimal(dateTimeFieldType16, (-21), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
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
        org.joda.time.ReadablePartial readablePartial38 = null;
        java.util.Locale locale39 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral26.printTo(stringBuffer37, readablePartial38, locale39);
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
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
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
        int int24 = stringLiteral20.estimateParsedLength();
        int int25 = stringLiteral20.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = null;
        int int29 = stringLiteral20.parseInto(dateTimeParserBucket26, "", 18);
        java.lang.StringBuffer stringBuffer30 = null;
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale32 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral20.printTo(stringBuffer30, readablePartial31, locale32);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-19) + "'", int29 == (-19));
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction21 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType18, (int) (byte) 0, (int) (byte) 1);
        int int22 = fraction21.iMinDigits;
        int int23 = fraction21.iMaxDigits;
        int int24 = fraction21.iMaxDigits;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder15.appendOptional((org.joda.time.format.DateTimeParser) fraction21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder15.appendMinuteOfDay((int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber4 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, (int) (short) -1, true, 32);
        int int5 = paddedNumber4.estimatePrintedLength();
        boolean boolean6 = paddedNumber4.iSigned;
        boolean boolean7 = paddedNumber4.iSigned;
        java.io.Writer writer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            paddedNumber4.printTo(writer8, (long) (-21), chronology10, (-21), dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
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
        int int19 = textField13.estimateParsedLength();
        int int20 = textField13.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer21 = null;
        org.joda.time.ReadablePartial readablePartial22 = null;
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField13.printTo(stringBuffer21, readablePartial22, locale23);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTwoDigitYear((-21));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendMillisOfDay(0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) (short) 0, true);
        int int4 = twoDigitYear3.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        int int8 = twoDigitYear3.parseInto(dateTimeParserBucket5, "", (int) 'a');
        int int9 = twoDigitYear3.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = null;
        int int13 = twoDigitYear3.parseInto(dateTimeParserBucket10, "hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-98) + "'", int8 == (-98));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-33) + "'", int13 == (-33));
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendTwoDigitWeekyear(0, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber16 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType13, (int) (short) 0, false);
        int int17 = unpaddedNumber16.estimatePrintedLength();
        int int18 = unpaddedNumber16.estimatePrintedLength();
        int int19 = unpaddedNumber16.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder12.append((org.joda.time.format.DateTimeParser) unpaddedNumber16);
        java.lang.StringBuffer stringBuffer21 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber16.printTo(stringBuffer21, (long) 3, chronology23, (int) (byte) -1, dateTimeZone25, locale26);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 34, false);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfYear(3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneId();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber4 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 4, false, (int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = paddedNumber4.iFieldType;
        int int6 = paddedNumber4.iMinPrintedDigits;
        int int7 = paddedNumber4.iMinPrintedDigits;
        int int8 = paddedNumber4.iMinPrintedDigits;
        int int9 = paddedNumber4.estimateParsedLength();
        boolean boolean10 = paddedNumber4.iSigned;
        org.junit.Assert.assertNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (-101), false);
        int int4 = twoDigitYear3.estimatePrintedLength();
        int int5 = twoDigitYear3.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        int int9 = twoDigitYear3.parseInto(dateTimeParserBucket6, "hi!", 13);
        int int10 = twoDigitYear3.estimatePrintedLength();
        java.io.Writer writer11 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer11, (long) (-101), chronology13, 33, dateTimeZone15, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-14) + "'", int9 == (-14));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 0, false);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (int) 'a', true);
        int int4 = twoDigitYear3.estimateParsedLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
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
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction18 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType15, 10, 2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder19.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatterBuilder21.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder21.appendFractionOfHour(6, (int) (byte) 100);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap26 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder21.appendTimeZoneShortName(strMap26);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendMillisOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder29.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder30.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber36 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType32, (int) (short) -1, true, 32);
        int int37 = paddedNumber36.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder38.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder39.appendYear((int) 'a', (int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder42.appendPattern("");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral46 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int47 = stringLiteral46.estimatePrintedLength();
        int int48 = stringLiteral46.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber52 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType49, 4, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = fixedNumber52.iFieldType;
        int int54 = fixedNumber52.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction58 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType55, 20, 13);
        int int59 = fraction58.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder60.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder60.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder60.appendMonthOfYearShortText();
        boolean boolean65 = dateTimeFormatterBuilder64.canBuildPrinter();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber70 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType66, (int) (short) -1, true, 32);
        boolean boolean71 = paddedNumber70.iSigned;
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber75 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType72, (int) (short) 100, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = fixedNumber75.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder64.append((org.joda.time.format.DateTimePrinter) paddedNumber70, (org.joda.time.format.DateTimeParser) fixedNumber75);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear81 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType78, 100, true);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray82 = new org.joda.time.format.DateTimeParser[] { fixedNumber52, fraction58, paddedNumber70, twoDigitYear81 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder83 = dateTimeFormatterBuilder42.append((org.joda.time.format.DateTimePrinter) stringLiteral46, dateTimeParserArray82);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder84 = dateTimeFormatterBuilder30.append((org.joda.time.format.DateTimePrinter) paddedNumber36, dateTimeParserArray82);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser85 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray82);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder86 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) fraction18, dateTimeParserArray82);
        int int87 = fraction18.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket88 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int91 = fraction18.parseInto(dateTimeParserBucket88, "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 13 + "'", int59 == 13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNull(dateTimeFieldType76);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder77);
        org.junit.Assert.assertNotNull(dateTimeParserArray82);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder83);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder84);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMinuteOfHour((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField19 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType17, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField22 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType20, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder14.append((org.joda.time.format.DateTimePrinter) textField19, (org.joda.time.format.DateTimeParser) textField22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) textField19);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder24.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral27 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder25.append((org.joda.time.format.DateTimeParser) stringLiteral27);
        int int29 = stringLiteral27.estimateParsedLength();
        int int30 = stringLiteral27.estimateParsedLength();
        int int31 = stringLiteral27.estimateParsedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber35 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType32, (-14), false);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = fixedNumber35.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) stringLiteral27, (org.joda.time.format.DateTimeParser) fixedNumber35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = null;
        int int41 = stringLiteral27.parseInto(dateTimeParserBucket38, "", (-4));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket2 = null;
        int int5 = stringLiteral1.parseInto(dateTimeParserBucket2, "", (int) (short) -1);
        int int6 = stringLiteral1.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = null;
        int int10 = stringLiteral1.parseInto(dateTimeParserBucket7, "", (int) (byte) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = null;
        int int14 = stringLiteral1.parseInto(dateTimeParserBucket11, "", (-101));
        java.io.Writer writer15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer15, readablePartial16, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-101) + "'", int10 == (-101));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (-21), true);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear(4);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendTimeZoneName(strMap11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendSecondOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatterBuilder12.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder12.appendYearOfEra((int) '4', 18);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendSecondOfDay((int) 'a');
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
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
        boolean boolean22 = dateTimeFormatterBuilder21.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder21.appendHourOfHalfday(3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder21.appendYearOfEra(0, 6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder21.appendFractionOfMinute(4, 32);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder21.appendCenturyOfEra(18, 4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("", "hi!", true, (-34), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName(100, strMap1);
        java.io.Writer writer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneName2.printTo(writer3, (long) (byte) 100, chronology5, (int) (byte) 10, dateTimeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendTwoDigitWeekyear(32, true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendMonthOfYear(6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendClockhourOfHalfday(18);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder0.appendTimeZoneShortName();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendHourOfDay(32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendHourOfHalfday((-14));
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder1.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear9 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType6, (-21), false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder1.append((org.joda.time.format.DateTimePrinter) twoDigitYear9);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder1.appendCenturyOfEra(35, (int) (short) 10);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatterBuilder13.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendClockhourOfDay(13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder16.appendEraText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder16.appendYearOfCentury((-4), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeParser14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendDayOfYear((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder11.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField23 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType21, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField26 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType24, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimePrinter) textField23, (org.joda.time.format.DateTimeParser) textField26);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder15.append((org.joda.time.format.DateTimePrinter) textField23);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder28.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral31 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder29.append((org.joda.time.format.DateTimeParser) stringLiteral31);
        int int33 = stringLiteral31.estimateParsedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction37 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType34, (int) (byte) 0, (int) (byte) 1);
        int int38 = fraction37.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder10.append((org.joda.time.format.DateTimePrinter) stringLiteral31, (org.joda.time.format.DateTimeParser) fraction37);
        fraction37.iMaxDigits = (-34);
        int int42 = fraction37.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int46 = fraction37.parseInto(dateTimeParserBucket43, "", (int) (short) 100);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-34) + "'", int42 == (-34));
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
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
        org.joda.time.ReadablePartial readablePartial19 = null;
        java.util.Locale locale20 = null;
        timeZoneId0.printTo(writer18, readablePartial19, locale20);
        java.lang.StringBuffer stringBuffer22 = null;
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale24 = null;
        timeZoneId0.printTo(stringBuffer22, readablePartial23, locale24);
        java.lang.StringBuffer stringBuffer26 = null;
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale28 = null;
        timeZoneId0.printTo(stringBuffer26, readablePartial27, locale28);
        java.lang.StringBuffer stringBuffer30 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        java.util.Locale locale35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeZoneId0.printTo(stringBuffer30, 100L, chronology32, (int) '#', dateTimeZone34, locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (-21), (-3));
        fraction3.iMaxDigits = 1;
        fraction3.iMaxDigits = 'a';
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneId();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneShortName(strMap8);
        boolean boolean10 = dateTimeFormatterBuilder9.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendClockhourOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendClockhourOfHalfday(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendTwoDigitWeekyear((-21));
        dateTimeFormatterBuilder14.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder14.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder14.appendMonthOfYear(6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        int int10 = textField8.estimatePrintedLength();
        int int11 = textField8.estimateParsedLength();
        int int12 = textField8.estimatePrintedLength();
        int int13 = textField8.estimateParsedLength();
        int int14 = textField8.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = textField8.parseInto(dateTimeParserBucket15, "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
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
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap24 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendTimeZoneShortName(strMap24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 1, false);
        int int4 = unpaddedNumber3.estimatePrintedLength();
        int int5 = unpaddedNumber3.estimatePrintedLength();
        boolean boolean6 = unpaddedNumber3.iSigned;
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
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
        int int70 = twoDigitYear13.estimateParsedLength();
        int int71 = twoDigitYear13.estimatePrintedLength();
        int int72 = twoDigitYear13.estimatePrintedLength();
        int int73 = twoDigitYear13.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket74 = null;
        int int77 = twoDigitYear13.parseInto(dateTimeParserBucket74, "hi!", (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 4 + "'", int70 == 4);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-11) + "'", int77 == (-11));
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
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
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral16 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int17 = characterLiteral16.estimateParsedLength();
        int int18 = characterLiteral16.estimateParsedLength();
        int int19 = characterLiteral16.estimateParsedLength();
        int int20 = characterLiteral16.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = null;
        int int24 = characterLiteral16.parseInto(dateTimeParserBucket21, "hi!", (int) 'a');
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder14.append((org.joda.time.format.DateTimePrinter) characterLiteral16, dateTimeParserArray51);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder14.appendHourOfDay(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder55.appendEraText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-98) + "'", int24 == (-98));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-2) + "'", int31 == (-2));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(dateTimeParserArray51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (-1), false);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        fixedNumber3.printTo(writer4, (-1L), chronology6, (-98), dateTimeZone8, locale9);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = null;
        int int14 = fixedNumber3.parseInto(dateTimeParserBucket11, "hi!", (int) (byte) 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = null;
        int int18 = fixedNumber3.parseInto(dateTimeParserBucket15, "", 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-11) + "'", int14 == (-11));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder57.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder57.appendTwoDigitYear((-11));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder57.appendTwoDigitYear(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder62.appendTwoDigitYear((int) (byte) -1, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder62.appendShortText(dateTimeFieldType66);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-3) + "'", int45 == (-3));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendCenturyOfEra((int) 'a', (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendMillisOfSecond((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendLiteral("hi!");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.appendCenturyOfEra((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder7.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder7.appendDayOfYear(2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField23 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType21, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField26 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType24, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimePrinter) textField23, (org.joda.time.format.DateTimeParser) textField26);
        int int28 = textField26.estimatePrintedLength();
        int int29 = textField26.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId30 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer31 = null;
        org.joda.time.ReadablePartial readablePartial32 = null;
        java.util.Locale locale33 = null;
        timeZoneId30.printTo(stringBuffer31, readablePartial32, locale33);
        java.io.Writer writer35 = null;
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale37 = null;
        timeZoneId30.printTo(writer35, readablePartial36, locale37);
        java.lang.StringBuffer stringBuffer39 = null;
        org.joda.time.ReadablePartial readablePartial40 = null;
        java.util.Locale locale41 = null;
        timeZoneId30.printTo(stringBuffer39, readablePartial40, locale41);
        int int43 = timeZoneId30.estimateParsedLength();
        java.io.Writer writer44 = null;
        org.joda.time.ReadablePartial readablePartial45 = null;
        java.util.Locale locale46 = null;
        timeZoneId30.printTo(writer44, readablePartial45, locale46);
        int int48 = timeZoneId30.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) textField26, (org.joda.time.format.DateTimeParser) timeZoneId30);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimeParser) textField26);
        int int51 = textField26.estimateParsedLength();
        int int52 = textField26.estimatePrintedLength();
        int int53 = textField26.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int57 = textField26.parseInto(dateTimeParserBucket54, "", 18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertTrue("'" + timeZoneId30 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId30.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 6 + "'", int51 == 6);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 6 + "'", int52 == 6);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 6 + "'", int53 == 6);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
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
        org.joda.time.ReadablePartial readablePartial19 = null;
        java.util.Locale locale20 = null;
        timeZoneId0.printTo(writer18, readablePartial19, locale20);
        int int22 = timeZoneId0.estimatePrintedLength();
        int int23 = timeZoneId0.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFractionOfHour(4, 4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfSecond((int) (byte) 100, (-101));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder11.appendMinuteOfDay((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder17.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField29 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType27, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField32 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType30, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder24.append((org.joda.time.format.DateTimePrinter) textField29, (org.joda.time.format.DateTimeParser) textField32);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder21.append((org.joda.time.format.DateTimePrinter) textField29);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder34.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendClockhourOfHalfday(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder37.appendHourOfHalfday(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder39.appendDayOfMonth((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction45 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType42, (int) (byte) 0, (int) (byte) 1);
        int int46 = fraction45.estimateParsedLength();
        int int47 = fraction45.estimatePrintedLength();
        fraction45.iMinDigits = (short) 100;
        int int50 = fraction45.iMinDigits;
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral52 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int53 = characterLiteral52.estimateParsedLength();
        int int54 = characterLiteral52.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = null;
        int int58 = characterLiteral52.parseInto(dateTimeParserBucket55, "", (int) (byte) 10);
        int int59 = characterLiteral52.estimatePrintedLength();
        int int60 = characterLiteral52.estimateParsedLength();
        int int61 = characterLiteral52.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder39.append((org.joda.time.format.DateTimePrinter) fraction45, (org.joda.time.format.DateTimeParser) characterLiteral52);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder16.appendOptional((org.joda.time.format.DateTimeParser) characterLiteral52);
        int int64 = characterLiteral52.estimatePrintedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-11) + "'", int58 == (-11));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 18, true);
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
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
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
        org.joda.time.ReadablePartial readablePartial19 = null;
        java.util.Locale locale20 = null;
        timeZoneId0.printTo(writer18, readablePartial19, locale20);
        java.lang.StringBuffer stringBuffer22 = null;
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale24 = null;
        timeZoneId0.printTo(stringBuffer22, readablePartial23, locale24);
        java.lang.StringBuffer stringBuffer26 = null;
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale28 = null;
        timeZoneId0.printTo(stringBuffer26, readablePartial27, locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = timeZoneId0.parseInto(dateTimeParserBucket30, "", (-36));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -36");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('a');
        int int2 = characterLiteral1.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = null;
        int int6 = characterLiteral1.parseInto(dateTimeParserBucket3, "hi!", (int) (byte) 0);
        int int7 = characterLiteral1.estimateParsedLength();
        int int8 = characterLiteral1.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay(2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendClockhourOfHalfday(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneShortName(strMap13);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatterBuilder12.toPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimePrinter15);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4, false);
        int int4 = twoDigitYear3.estimateParsedLength();
        int int5 = twoDigitYear3.estimateParsedLength();
        int int6 = twoDigitYear3.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = null;
        int int10 = twoDigitYear3.parseInto(dateTimeParserBucket7, "hi!", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder1.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear9 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType6, (-21), false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder1.append((org.joda.time.format.DateTimePrinter) twoDigitYear9);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder1.appendCenturyOfEra(35, (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId14 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale17 = null;
        timeZoneId14.printTo(stringBuffer15, readablePartial16, locale17);
        java.io.Writer writer19 = null;
        org.joda.time.ReadablePartial readablePartial20 = null;
        java.util.Locale locale21 = null;
        timeZoneId14.printTo(writer19, readablePartial20, locale21);
        java.lang.StringBuffer stringBuffer23 = null;
        org.joda.time.ReadablePartial readablePartial24 = null;
        java.util.Locale locale25 = null;
        timeZoneId14.printTo(stringBuffer23, readablePartial24, locale25);
        int int27 = timeZoneId14.estimateParsedLength();
        java.io.Writer writer28 = null;
        org.joda.time.ReadablePartial readablePartial29 = null;
        java.util.Locale locale30 = null;
        timeZoneId14.printTo(writer28, readablePartial29, locale30);
        int int32 = timeZoneId14.estimatePrintedLength();
        int int33 = timeZoneId14.estimateParsedLength();
        int int34 = timeZoneId14.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder13.appendOptional((org.joda.time.format.DateTimeParser) timeZoneId14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder13.appendTimeZoneOffset("hi!", true, (-35), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + timeZoneId14 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId14.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder21.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatterBuilder22.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId24 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer25 = null;
        org.joda.time.ReadablePartial readablePartial26 = null;
        java.util.Locale locale27 = null;
        timeZoneId24.printTo(stringBuffer25, readablePartial26, locale27);
        java.io.Writer writer29 = null;
        org.joda.time.ReadablePartial readablePartial30 = null;
        java.util.Locale locale31 = null;
        timeZoneId24.printTo(writer29, readablePartial30, locale31);
        int int33 = timeZoneId24.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = null;
        int int37 = timeZoneId24.parseInto(dateTimeParserBucket34, "", (int) (byte) 0);
        java.lang.StringBuffer stringBuffer38 = null;
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale40 = null;
        timeZoneId24.printTo(stringBuffer38, readablePartial39, locale40);
        java.io.Writer writer42 = null;
        org.joda.time.ReadablePartial readablePartial43 = null;
        java.util.Locale locale44 = null;
        timeZoneId24.printTo(writer42, readablePartial43, locale44);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder22.appendOptional((org.joda.time.format.DateTimeParser) timeZoneId24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder46.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder46.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder48.appendTwoDigitYear((-1), false);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertTrue("'" + timeZoneId24 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId24.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        fraction3.iMinDigits = (short) 1;
        fraction3.iMaxDigits = ' ';
        fraction3.iMaxDigits = (-4);
        int int12 = fraction3.estimateParsedLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
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
        int int17 = timeZoneOffset5.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        int int21 = timeZoneOffset5.parseInto(dateTimeParserBucket18, "", 3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = null;
        int int25 = timeZoneOffset5.parseInto(dateTimeParserBucket22, "", 3);
        int int26 = timeZoneOffset5.estimateParsedLength();
        java.lang.StringBuffer stringBuffer27 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        java.util.Locale locale32 = null;
        timeZoneOffset5.printTo(stringBuffer27, (long) (-4), chronology29, (int) (short) 1, dateTimeZone31, locale32);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = null;
        int int37 = timeZoneOffset5.parseInto(dateTimeParserBucket34, "hi!", 13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = null;
        int int41 = timeZoneOffset5.parseInto(dateTimeParserBucket38, "hi!", 13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 13 + "'", int17 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-4) + "'", int25 == (-4));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 13 + "'", int26 == 13);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-14) + "'", int37 == (-14));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-14) + "'", int41 == (-14));
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int2 = stringLiteral1.estimatePrintedLength();
        int int3 = stringLiteral1.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = stringLiteral1.parseInto(dateTimeParserBucket4, "", (int) (short) 1);
        java.io.Writer writer8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer8, 100L, chronology10, 1, dateTimeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 33, true);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfMonth(3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendHourOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneName();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder6.appendSignedDecimal(dateTimeFieldType8, (-2), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendTwoDigitYear(4, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneShortName();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendMonthOfYearShortText();
        boolean boolean10 = dateTimeFormatterBuilder0.canBuildPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) ' ', true);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "hi!", 6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = null;
        int int11 = fixedNumber3.parseInto(dateTimeParserBucket8, "hi!", 0);
        int int12 = fixedNumber3.estimateParsedLength();
        boolean boolean13 = fixedNumber3.iSigned;
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = fixedNumber3.iFieldType;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = null;
        int int18 = fixedNumber3.parseInto(dateTimeParserBucket15, "", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-11) + "'", int18 == (-11));
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 1, true);
        int int4 = unpaddedNumber3.estimatePrintedLength();
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer5, (long) (byte) 10, chronology7, 32, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendDayOfYear((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendTwoDigitWeekyear(0, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder10.appendMonthOfYearText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap15 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder10.appendTimeZoneName(strMap15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) '#', true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        boolean boolean9 = dateTimeFormatterBuilder8.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendPattern("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder8.appendHourOfDay(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder8.appendDayOfYear(10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendTwoDigitWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendSecondOfMinute((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendMillisOfSecond((-98));
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendFractionOfHour((int) '#', (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendTimeZoneShortName();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder7.appendTwoDigitYear((-101));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendWeekOfWeekyear((-34));
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendWeekyear((int) (byte) 1, 100);
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset11 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        java.util.Locale locale17 = null;
        timeZoneOffset11.printTo(stringBuffer12, (long) 20, chronology14, (int) (byte) 10, dateTimeZone16, locale17);
        java.lang.StringBuffer stringBuffer19 = null;
        org.joda.time.ReadablePartial readablePartial20 = null;
        java.util.Locale locale21 = null;
        timeZoneOffset11.printTo(stringBuffer19, readablePartial20, locale21);
        int int23 = timeZoneOffset11.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder2.append((org.joda.time.format.DateTimePrinter) timeZoneOffset11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder24.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder25.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendHourOfHalfday(97);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 13 + "'", int23 == 13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((-2), strMap1);
        int int3 = timeZoneName2.estimateParsedLength();
        int int4 = timeZoneName2.estimateParsedLength();
        java.io.Writer writer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        timeZoneName2.printTo(writer5, readablePartial6, locale7);
        java.io.Writer writer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        timeZoneName2.printTo(writer9, readablePartial10, locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeZoneName2.parseInto(dateTimeParserBucket13, "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendTwoDigitWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder8.appendClockhourOfHalfday(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendHourOfDay(6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendTimeZoneShortName();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap18 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendTimeZoneName(strMap18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder17.appendCenturyOfEra((-35), 1);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendCenturyOfEra((int) 'a', (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatterBuilder12.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder9.append(dateTimeFormatter16);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder9.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendYear(6, (-33));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder19.appendHourOfHalfday(1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder16.appendClockhourOfHalfday((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendDayOfYear(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder20.appendFixedSignedDecimal(dateTimeFieldType23, 18);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendWeekyear((int) (byte) 1, 100);
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset11 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        java.util.Locale locale17 = null;
        timeZoneOffset11.printTo(stringBuffer12, (long) 20, chronology14, (int) (byte) 10, dateTimeZone16, locale17);
        java.lang.StringBuffer stringBuffer19 = null;
        org.joda.time.ReadablePartial readablePartial20 = null;
        java.util.Locale locale21 = null;
        timeZoneOffset11.printTo(stringBuffer19, readablePartial20, locale21);
        int int23 = timeZoneOffset11.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder2.append((org.joda.time.format.DateTimePrinter) timeZoneOffset11);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap25 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendTimeZoneName(strMap25);
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset32 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer33 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        java.util.Locale locale38 = null;
        timeZoneOffset32.printTo(stringBuffer33, (long) 20, chronology35, (int) (byte) 10, dateTimeZone37, locale38);
        java.lang.StringBuffer stringBuffer40 = null;
        org.joda.time.ReadablePartial readablePartial41 = null;
        java.util.Locale locale42 = null;
        timeZoneOffset32.printTo(stringBuffer40, readablePartial41, locale42);
        int int44 = timeZoneOffset32.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer45 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        java.util.Locale locale50 = null;
        timeZoneOffset32.printTo(stringBuffer45, 1L, chronology47, (int) (byte) 0, dateTimeZone49, locale50);
        int int52 = timeZoneOffset32.estimatePrintedLength();
        java.io.Writer writer53 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        java.util.Locale locale58 = null;
        timeZoneOffset32.printTo(writer53, (long) (-3), chronology55, 0, dateTimeZone57, locale58);
        java.io.Writer writer60 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        java.util.Locale locale65 = null;
        timeZoneOffset32.printTo(writer60, 0L, chronology62, 20, dateTimeZone64, locale65);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder26.appendOptional((org.joda.time.format.DateTimeParser) timeZoneOffset32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder67.appendWeekyear((-7), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 13 + "'", int23 == 13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 13 + "'", int44 == 13);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 13 + "'", int52 == 13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendYearOfEra((int) (byte) 100, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendWeekyear(2, (-3));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendMinuteOfDay(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder18.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset25 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer26 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        java.util.Locale locale31 = null;
        timeZoneOffset25.printTo(stringBuffer26, (long) 20, chronology28, (int) (byte) 10, dateTimeZone30, locale31);
        java.lang.StringBuffer stringBuffer33 = null;
        org.joda.time.ReadablePartial readablePartial34 = null;
        java.util.Locale locale35 = null;
        timeZoneOffset25.printTo(stringBuffer33, readablePartial34, locale35);
        java.lang.StringBuffer stringBuffer37 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        java.util.Locale locale42 = null;
        timeZoneOffset25.printTo(stringBuffer37, (long) (short) 1, chronology39, (int) (byte) 10, dateTimeZone41, locale42);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = null;
        int int47 = timeZoneOffset25.parseInto(dateTimeParserBucket44, "hi!", 2);
        java.io.Writer writer48 = null;
        org.joda.time.ReadablePartial readablePartial49 = null;
        java.util.Locale locale50 = null;
        timeZoneOffset25.printTo(writer48, readablePartial49, locale50);
        java.lang.StringBuffer stringBuffer52 = null;
        org.joda.time.ReadablePartial readablePartial53 = null;
        java.util.Locale locale54 = null;
        timeZoneOffset25.printTo(stringBuffer52, readablePartial53, locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = null;
        int int59 = timeZoneOffset25.parseInto(dateTimeParserBucket56, "", 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction63 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType60, (int) (short) -1, 0);
        fraction63.iMaxDigits = (short) -1;
        int int66 = fraction63.iMaxDigits;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) timeZoneOffset25, (org.joda.time.format.DateTimeParser) fraction63);
        int int68 = fraction63.iMinDigits;
        int int69 = fraction63.iMinDigits;
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction73 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType70, (-33), (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder74 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) fraction63, (org.joda.time.format.DateTimeParser) fraction73);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder11.appendFractionOfMinute(20, 18);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder79 = dateTimeFormatterBuilder77.appendDayOfYear(2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-3) + "'", int47 == (-3));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-11) + "'", int59 == (-11));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder74);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder77);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder79);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(' ');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = characterLiteral1.parseInto(dateTimeParserBucket2, "", (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset16 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        java.util.Locale locale22 = null;
        timeZoneOffset16.printTo(stringBuffer17, (long) 20, chronology19, (int) (byte) 10, dateTimeZone21, locale22);
        java.lang.StringBuffer stringBuffer24 = null;
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale26 = null;
        timeZoneOffset16.printTo(stringBuffer24, readablePartial25, locale26);
        java.lang.StringBuffer stringBuffer28 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        java.util.Locale locale33 = null;
        timeZoneOffset16.printTo(stringBuffer28, (long) (short) 1, chronology30, (int) (byte) 10, dateTimeZone32, locale33);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = null;
        int int38 = timeZoneOffset16.parseInto(dateTimeParserBucket35, "hi!", 2);
        java.lang.StringBuffer stringBuffer39 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        java.util.Locale locale44 = null;
        timeZoneOffset16.printTo(stringBuffer39, (long) 6, chronology41, (-1), dateTimeZone43, locale44);
        java.lang.StringBuffer stringBuffer46 = null;
        org.joda.time.ReadablePartial readablePartial47 = null;
        java.util.Locale locale48 = null;
        timeZoneOffset16.printTo(stringBuffer46, readablePartial47, locale48);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap51 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName52 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap51);
        int int53 = timeZoneName52.estimateParsedLength();
        java.lang.StringBuffer stringBuffer54 = null;
        org.joda.time.ReadablePartial readablePartial55 = null;
        java.util.Locale locale56 = null;
        timeZoneName52.printTo(stringBuffer54, readablePartial55, locale56);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder58.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral62 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral64 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder60.append((org.joda.time.format.DateTimePrinter) characterLiteral62, (org.joda.time.format.DateTimeParser) characterLiteral64);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral67 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int68 = stringLiteral67.estimateParsedLength();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray69 = new org.joda.time.format.DateTimeParser[] { timeZoneName52, characterLiteral62, stringLiteral67 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser70 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray69);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder10.append((org.joda.time.format.DateTimePrinter) timeZoneOffset16, dateTimeParserArray69);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder71.appendDayOfWeek(32);
        org.joda.time.format.DateTimeParser dateTimeParser74 = dateTimeFormatterBuilder71.toParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction78 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType75, (int) (byte) 0, (int) (byte) 1);
        int int79 = fraction78.estimatePrintedLength();
        int int80 = fraction78.iMaxDigits;
        fraction78.iMinDigits = (short) 1;
        int int83 = fraction78.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder84 = dateTimeFormatterBuilder71.append((org.joda.time.format.DateTimePrinter) fraction78);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder85 = dateTimeFormatterBuilder84.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder86 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder87 = dateTimeFormatterBuilder86.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder89 = dateTimeFormatterBuilder86.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder92 = dateTimeFormatterBuilder86.appendYearOfEra(1, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap93 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder94 = dateTimeFormatterBuilder86.appendTimeZoneShortName(strMap93);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder96 = dateTimeFormatterBuilder86.appendDayOfYear((int) (byte) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter97 = dateTimeFormatterBuilder86.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder98 = dateTimeFormatterBuilder85.append(dateTimeFormatter97);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-3) + "'", int38 == (-3));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 20 + "'", int53 == 20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(dateTimeParserArray69);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder71);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertNotNull(dateTimeParser74);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder84);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder85);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder87);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder89);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder92);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder94);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder96);
        org.junit.Assert.assertNotNull(dateTimeFormatter97);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder98);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder30.appendSecondOfDay(35);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName2 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) (short) -1, strMap1);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder1.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear9 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType6, (-21), false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder1.append((org.joda.time.format.DateTimePrinter) twoDigitYear9);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder1.appendCenturyOfEra(35, (int) (short) 10);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatterBuilder13.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendTimeZoneId();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeParser14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay(2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendTwoDigitYear(4, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendFractionOfDay(0, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder15.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendClockhourOfHalfday((int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatterBuilder21.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder9.append(dateTimeFormatter22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder9.appendHourOfHalfday((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral27 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int28 = characterLiteral27.estimateParsedLength();
        int int29 = characterLiteral27.estimateParsedLength();
        int int30 = characterLiteral27.estimateParsedLength();
        int int31 = characterLiteral27.estimatePrintedLength();
        int int32 = characterLiteral27.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder25.append((org.joda.time.format.DateTimeParser) characterLiteral27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = null;
        int int37 = characterLiteral27.parseInto(dateTimeParserBucket34, "", 0);
        java.io.Writer writer38 = null;
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale40 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral27.printTo(writer38, readablePartial39, locale40);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendFractionOfMinute(10, 20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendFractionOfMinute((int) 'a', (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder4.appendFractionOfSecond(13, (int) (short) 100);
        boolean boolean11 = dateTimeFormatterBuilder10.canBuildFormatter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendSecondOfDay((-33));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder18.appendFractionOfMinute((int) (byte) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder18.append(dateTimeParser26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No parser supplied");
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        int int4 = characterLiteral1.estimateParsedLength();
        int int5 = characterLiteral1.estimateParsedLength();
        int int6 = characterLiteral1.estimatePrintedLength();
        java.io.Writer writer7 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer7, (long) (-14), chronology9, (-14), dateTimeZone11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
        int int3 = textField2.estimatePrintedLength();
        int int4 = textField2.estimatePrintedLength();
        int int5 = textField2.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = textField2.parseInto(dateTimeParserBucket6, "hi!", 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField2 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
        int int3 = textField2.estimateParsedLength();
        int int4 = textField2.estimatePrintedLength();
        int int5 = textField2.estimatePrintedLength();
        java.io.Writer writer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField2.printTo(writer6, (long) (-98), chronology8, 0, dateTimeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendDayOfYear(2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField16 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType14, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField19 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType17, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) textField16, (org.joda.time.format.DateTimeParser) textField19);
        int int21 = textField19.estimatePrintedLength();
        int int22 = textField19.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId23 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer24 = null;
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale26 = null;
        timeZoneId23.printTo(stringBuffer24, readablePartial25, locale26);
        java.io.Writer writer28 = null;
        org.joda.time.ReadablePartial readablePartial29 = null;
        java.util.Locale locale30 = null;
        timeZoneId23.printTo(writer28, readablePartial29, locale30);
        java.lang.StringBuffer stringBuffer32 = null;
        org.joda.time.ReadablePartial readablePartial33 = null;
        java.util.Locale locale34 = null;
        timeZoneId23.printTo(stringBuffer32, readablePartial33, locale34);
        int int36 = timeZoneId23.estimateParsedLength();
        java.io.Writer writer37 = null;
        org.joda.time.ReadablePartial readablePartial38 = null;
        java.util.Locale locale39 = null;
        timeZoneId23.printTo(writer37, readablePartial38, locale39);
        int int41 = timeZoneId23.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField19, (org.joda.time.format.DateTimeParser) timeZoneId23);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder42.appendTwoDigitYear(18, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder45.appendMillisOfSecond(0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + timeZoneId23 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId23.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = fixedNumber3.iFieldType;
        int int5 = fixedNumber3.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = fixedNumber3.iFieldType;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = null;
        int int10 = fixedNumber3.parseInto(dateTimeParserBucket7, "hi!", (int) (byte) 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = null;
        int int14 = fixedNumber3.parseInto(dateTimeParserBucket11, "hi!", 4);
        java.lang.StringBuffer stringBuffer15 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(stringBuffer15, (long) (byte) 10, chronology17, (-7), dateTimeZone19, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-11) + "'", int10 == (-11));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5) + "'", int14 == (-5));
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendYearOfCentury(0, 97);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendYearOfEra(97, 32);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendLiteral('a');
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction18 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType15, (int) (short) -1, 0);
        fraction18.iMaxDigits = (short) -1;
        int int21 = fraction18.iMaxDigits;
        int int22 = fraction18.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder12.append((org.joda.time.format.DateTimePrinter) fraction18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatterBuilder0.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendTwoDigitWeekyear((-1), false);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap9 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap9);
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset16 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        int int17 = timeZoneOffset16.estimatePrintedLength();
        int int18 = timeZoneOffset16.estimateParsedLength();
        int int19 = timeZoneOffset16.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) timeZoneOffset16);
        java.io.Writer writer21 = null;
        org.joda.time.ReadablePartial readablePartial22 = null;
        java.util.Locale locale23 = null;
        timeZoneOffset16.printTo(writer21, readablePartial22, locale23);
        int int25 = timeZoneOffset16.estimateParsedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 13 + "'", int17 == 13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 13 + "'", int25 == 13);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
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
        int int23 = stringLiteral20.estimatePrintedLength();
        int int24 = stringLiteral20.estimateParsedLength();
        int int25 = stringLiteral20.estimateParsedLength();
        java.lang.StringBuffer stringBuffer26 = null;
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale28 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral20.printTo(stringBuffer26, readablePartial27, locale28);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber33 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType29, 2, false, 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = paddedNumber33.iFieldType;
        int int35 = paddedNumber33.iMaxParsedDigits;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder11.appendOptional((org.joda.time.format.DateTimeParser) paddedNumber33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) '#', false);
        int int4 = unpaddedNumber3.estimatePrintedLength();
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(writer5, (long) (-1), chronology7, (-4), dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
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
        int int20 = timeZoneId0.estimatePrintedLength();
        int int21 = timeZoneId0.estimatePrintedLength();
        int int22 = timeZoneId0.estimatePrintedLength();
        int int23 = timeZoneId0.estimateParsedLength();
        int int24 = timeZoneId0.estimateParsedLength();
        int int25 = timeZoneId0.estimateParsedLength();
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimateParsedLength();
        int int5 = fraction3.estimatePrintedLength();
        fraction3.iMinDigits = (short) 100;
        int int8 = fraction3.iMinDigits;
        fraction3.iMaxDigits = 35;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendMonthOfYearShortText();
        boolean boolean5 = dateTimeFormatterBuilder4.canBuildPrinter();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber10 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType6, (int) (short) -1, true, 32);
        boolean boolean11 = paddedNumber10.iSigned;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber15 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType12, (int) (short) 100, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = fixedNumber15.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) paddedNumber10, (org.joda.time.format.DateTimeParser) fixedNumber15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = null;
        int int21 = fixedNumber15.parseInto(dateTimeParserBucket18, "", 3);
        int int22 = fixedNumber15.estimateParsedLength();
        int int23 = fixedNumber15.iMinPrintedDigits;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = null;
        int int27 = fixedNumber15.parseInto(dateTimeParserBucket24, "hi!", (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-33) + "'", int27 == (-33));
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField13 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType11, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField16 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType14, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder8.append((org.joda.time.format.DateTimePrinter) textField13, (org.joda.time.format.DateTimeParser) textField16);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder8.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction23 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType20, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral25 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = null;
        int int29 = stringLiteral25.parseInto(dateTimeParserBucket26, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) fraction23, (org.joda.time.format.DateTimeParser) stringLiteral25);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear34 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType31, (int) (short) 0, true);
        int int35 = twoDigitYear34.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) twoDigitYear34);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder7.appendOptional((org.joda.time.format.DateTimeParser) twoDigitYear34);
        java.lang.StringBuffer stringBuffer38 = null;
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale40 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear34.printTo(stringBuffer38, readablePartial39, locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-101) + "'", int29 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfMinute(1, (-7));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendFractionOfDay(97, 3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder15.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField25 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType23, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField28 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType26, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder20.append((org.joda.time.format.DateTimePrinter) textField25, (org.joda.time.format.DateTimeParser) textField28);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder20.appendYearOfCentury(3, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder20.appendDayOfMonth(20);
        dateTimeFormatterBuilder34.clear();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap36 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder34.appendTimeZoneName(strMap36);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral39 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int40 = stringLiteral39.estimatePrintedLength();
        int int41 = stringLiteral39.estimateParsedLength();
        int int42 = stringLiteral39.estimatePrintedLength();
        int int43 = stringLiteral39.estimatePrintedLength();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap45 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName46 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap45);
        int int47 = timeZoneName46.estimateParsedLength();
        java.lang.StringBuffer stringBuffer48 = null;
        org.joda.time.ReadablePartial readablePartial49 = null;
        java.util.Locale locale50 = null;
        timeZoneName46.printTo(stringBuffer48, readablePartial49, locale50);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder52.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral56 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral58 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder54.append((org.joda.time.format.DateTimePrinter) characterLiteral56, (org.joda.time.format.DateTimeParser) characterLiteral58);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral61 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int62 = stringLiteral61.estimateParsedLength();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray63 = new org.joda.time.format.DateTimeParser[] { timeZoneName46, characterLiteral56, stringLiteral61 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser64 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray63);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser65 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray63);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser66 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray63);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder34.append((org.joda.time.format.DateTimePrinter) stringLiteral39, dateTimeParserArray63);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder15.append((org.joda.time.format.DateTimePrinter) stringLiteral39);
        int int69 = stringLiteral39.estimatePrintedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20 + "'", int47 == 20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(dateTimeParserArray63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendTwoDigitYear((-7));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendEraText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
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
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear25 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType22, 4, false);
        int int26 = twoDigitYear25.estimateParsedLength();
        int int27 = twoDigitYear25.estimateParsedLength();
        int int28 = twoDigitYear25.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder21.append((org.joda.time.format.DateTimeParser) twoDigitYear25);
        int int30 = twoDigitYear25.estimatePrintedLength();
        int int31 = twoDigitYear25.estimateParsedLength();
        java.lang.StringBuffer stringBuffer32 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        java.util.Locale locale37 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear25.printTo(stringBuffer32, (long) '#', chronology34, (-53), dateTimeZone36, locale37);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder1.appendFractionOfDay(0, 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendShortText(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay(2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendTwoDigitWeekyear(2, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder15.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder15.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendWeekOfWeekyear(4);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap26 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder23.appendTimeZoneName(strMap26);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendSecondOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatterBuilder27.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder9.append(dateTimeFormatter30);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder31.appendTwoDigitWeekyear((-36), true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "", true, 1, 13);
        java.io.Writer writer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        java.util.Locale locale11 = null;
        timeZoneOffset5.printTo(writer6, (long) 20, chronology8, (int) (byte) 0, dateTimeZone10, locale11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder13.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField25 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType23, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField28 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType26, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder20.append((org.joda.time.format.DateTimePrinter) textField25, (org.joda.time.format.DateTimeParser) textField28);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder17.append((org.joda.time.format.DateTimePrinter) textField25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder30.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral33 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder31.append((org.joda.time.format.DateTimeParser) stringLiteral33);
        int int35 = stringLiteral33.estimateParsedLength();
        int int36 = stringLiteral33.estimateParsedLength();
        int int37 = stringLiteral33.estimatePrintedLength();
        int int38 = stringLiteral33.estimateParsedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber42 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType39, (int) (byte) 0, false);
        int int43 = unpaddedNumber42.iMaxParsedDigits;
        int int44 = unpaddedNumber42.estimateParsedLength();
        int int45 = unpaddedNumber42.estimatePrintedLength();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray46 = new org.joda.time.format.DateTimeParser[] { timeZoneOffset5, stringLiteral33, unpaddedNumber42 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser47 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray46);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int51 = matchingParser47.parseInto(dateTimeParserBucket48, "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dateTimeParserArray46);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
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
        int int24 = stringLiteral20.estimatePrintedLength();
        int int25 = stringLiteral20.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = null;
        int int29 = stringLiteral20.parseInto(dateTimeParserBucket26, "", 0);
        java.io.Writer writer30 = null;
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale32 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral20.printTo(writer30, readablePartial31, locale32);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendMinuteOfDay(1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendTimeZoneShortName(strMap5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendDayOfWeekShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendFixedSignedDecimal(dateTimeFieldType10, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap2 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendTimeZoneName(strMap2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder1.appendHourOfDay((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendWeekOfWeekyear(13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        fraction3.iMinDigits = (short) 1;
        int int8 = fraction3.iMaxDigits;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 32, true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer4, (long) (short) 100, chronology6, (int) (byte) 1, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfDay(2, (-19));
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap16 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName17 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) (byte) 1, strMap16);
        int int18 = timeZoneName17.estimatePrintedLength();
        org.joda.time.format.DateTimeParser dateTimeParser19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) timeZoneName17, dateTimeParser19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No parser supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTwoDigitYear((int) (short) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatterBuilder9.toPrinter();
        java.io.Writer writer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter10.printTo(writer11, readablePartial12, locale13);
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
        org.junit.Assert.assertNotNull(dateTimePrinter10);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMillisOfDay((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfDay((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendSecondOfDay(3);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap14 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendTimeZoneName(strMap14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendFraction(dateTimeFieldType16, (-5), 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder18.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField30 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType28, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField33 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType31, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder25.append((org.joda.time.format.DateTimePrinter) textField30, (org.joda.time.format.DateTimeParser) textField33);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder22.append((org.joda.time.format.DateTimePrinter) textField30);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder35.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral38 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder36.append((org.joda.time.format.DateTimeParser) stringLiteral38);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder36.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder36.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder36.appendWeekOfWeekyear(0);
        dateTimeFormatterBuilder36.clear();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber49 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType45, (int) 'a', true, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder36.append((org.joda.time.format.DateTimePrinter) paddedNumber49);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder15.appendOptional((org.joda.time.format.DateTimeParser) paddedNumber49);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder51.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder52.appendLiteral("hi!");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendTimeZoneShortName(strMap7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendMillisOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder10.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber17 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType13, (int) (short) -1, true, 32);
        int int18 = paddedNumber17.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder19.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendYear((int) 'a', (int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendPattern("");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral27 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int28 = stringLiteral27.estimatePrintedLength();
        int int29 = stringLiteral27.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber33 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType30, 4, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = fixedNumber33.iFieldType;
        int int35 = fixedNumber33.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction39 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType36, 20, 13);
        int int40 = fraction39.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder41.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder41.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder41.appendMonthOfYearShortText();
        boolean boolean46 = dateTimeFormatterBuilder45.canBuildPrinter();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber51 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType47, (int) (short) -1, true, 32);
        boolean boolean52 = paddedNumber51.iSigned;
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber56 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType53, (int) (short) 100, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = fixedNumber56.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder45.append((org.joda.time.format.DateTimePrinter) paddedNumber51, (org.joda.time.format.DateTimeParser) fixedNumber56);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear62 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType59, 100, true);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray63 = new org.joda.time.format.DateTimeParser[] { fixedNumber33, fraction39, paddedNumber51, twoDigitYear62 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder23.append((org.joda.time.format.DateTimePrinter) stringLiteral27, dateTimeParserArray63);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) paddedNumber17, dateTimeParserArray63);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser66 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray63);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser67 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 13 + "'", int40 == 13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeParserArray63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneId();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneShortName(strMap8);
        boolean boolean10 = dateTimeFormatterBuilder9.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendClockhourOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatterBuilder9.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendMonthOfYearText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
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
        int int31 = textField27.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int35 = textField27.parseInto(dateTimeParserBucket32, "", (-53));
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
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
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = null;
        int int25 = timeZoneId11.parseInto(dateTimeParserBucket22, "", 0);
        int int26 = timeZoneId11.estimateParsedLength();
        java.lang.StringBuffer stringBuffer27 = null;
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale29 = null;
        timeZoneId11.printTo(stringBuffer27, readablePartial28, locale29);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = timeZoneId11.parseInto(dateTimeParserBucket31, "", 13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -13");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendCenturyOfEra((int) 'a', (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendTwoDigitYear((-3));
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatterBuilder9.toParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber16 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType13, 13, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder9.append((org.joda.time.format.DateTimePrinter) fixedNumber16);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder18.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatterBuilder19.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear27 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType24, (-21), false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) twoDigitYear27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder19.appendCenturyOfEra(35, (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId32 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer33 = null;
        org.joda.time.ReadablePartial readablePartial34 = null;
        java.util.Locale locale35 = null;
        timeZoneId32.printTo(stringBuffer33, readablePartial34, locale35);
        java.io.Writer writer37 = null;
        org.joda.time.ReadablePartial readablePartial38 = null;
        java.util.Locale locale39 = null;
        timeZoneId32.printTo(writer37, readablePartial38, locale39);
        java.lang.StringBuffer stringBuffer41 = null;
        org.joda.time.ReadablePartial readablePartial42 = null;
        java.util.Locale locale43 = null;
        timeZoneId32.printTo(stringBuffer41, readablePartial42, locale43);
        int int45 = timeZoneId32.estimateParsedLength();
        java.io.Writer writer46 = null;
        org.joda.time.ReadablePartial readablePartial47 = null;
        java.util.Locale locale48 = null;
        timeZoneId32.printTo(writer46, readablePartial47, locale48);
        int int50 = timeZoneId32.estimatePrintedLength();
        int int51 = timeZoneId32.estimateParsedLength();
        int int52 = timeZoneId32.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder31.appendOptional((org.joda.time.format.DateTimeParser) timeZoneId32);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder54.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder54.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder54.appendHalfdayOfDayText();
        boolean boolean59 = dateTimeFormatterBuilder54.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder54.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder61.appendHourOfDay(2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder61.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder61.appendClockhourOfHalfday(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatterBuilder61.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder53.append(dateTimeFormatter67);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder69.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder72 = dateTimeFormatterBuilder69.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder75 = dateTimeFormatterBuilder69.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder76 = dateTimeFormatterBuilder75.appendTimeZoneId();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap77 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder78 = dateTimeFormatterBuilder76.appendTimeZoneShortName(strMap77);
        boolean boolean79 = dateTimeFormatterBuilder78.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder81 = dateTimeFormatterBuilder78.appendClockhourOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter82 = dateTimeFormatterBuilder78.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder83 = dateTimeFormatterBuilder53.append(dateTimeFormatter82);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder84 = dateTimeFormatterBuilder9.append(dateTimeFormatter82);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeParser12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertTrue("'" + timeZoneId32 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId32.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 32 + "'", int45 == 32);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 32 + "'", int51 == 32);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder70);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder72);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder75);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder76);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder81);
        org.junit.Assert.assertNotNull(dateTimeFormatter82);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder83);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder84);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.iMaxDigits;
        fraction3.iMaxDigits = 13;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendYearOfEra(2, 13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendTwoDigitYear((-7), true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendTwoDigitYear(100, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField24 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType22, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField27 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType25, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder19.append((org.joda.time.format.DateTimePrinter) textField24, (org.joda.time.format.DateTimeParser) textField27);
        int int29 = textField27.estimatePrintedLength();
        int int30 = textField27.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder18.appendOptional((org.joda.time.format.DateTimeParser) textField27);
        int int32 = textField27.estimatePrintedLength();
        int int33 = textField27.estimatePrintedLength();
        int int34 = textField27.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField40 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType38, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField43 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType41, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder35.append((org.joda.time.format.DateTimePrinter) textField40, (org.joda.time.format.DateTimeParser) textField43);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder35.appendTwoDigitWeekyear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction50 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType47, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral52 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = null;
        int int56 = stringLiteral52.parseInto(dateTimeParserBucket53, "", (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder46.append((org.joda.time.format.DateTimePrinter) fraction50, (org.joda.time.format.DateTimeParser) stringLiteral52);
        fraction50.iMaxDigits = 4;
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral61 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int62 = characterLiteral61.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = null;
        int int66 = characterLiteral61.parseInto(dateTimeParserBucket63, "", 1);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral68 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        int int69 = stringLiteral68.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear73 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType70, (int) (short) 0, true);
        int int74 = twoDigitYear73.estimatePrintedLength();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap76 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName77 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap76);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction81 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType78, (int) (byte) 0, (int) (byte) 1);
        int int82 = fraction81.estimatePrintedLength();
        int int83 = fraction81.iMaxDigits;
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral85 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParser[] dateTimeParserArray86 = new org.joda.time.format.DateTimeParser[] { characterLiteral61, stringLiteral68, twoDigitYear73, timeZoneName77, fraction81, stringLiteral85 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser87 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray86);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral89 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParser[] dateTimeParserArray90 = new org.joda.time.format.DateTimeParser[] { fraction50, matchingParser87, stringLiteral89 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser91 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray90);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder92 = dateTimeFormatterBuilder6.append((org.joda.time.format.DateTimePrinter) textField27, dateTimeParserArray90);
        java.lang.StringBuffer stringBuffer93 = null;
        org.joda.time.Chronology chronology95 = null;
        org.joda.time.DateTimeZone dateTimeZone97 = null;
        java.util.Locale locale98 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField27.printTo(stringBuffer93, (long) 20, chronology95, 35, dateTimeZone97, locale98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-101) + "'", int56 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-2) + "'", int66 == (-2));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(dateTimeParserArray86);
        org.junit.Assert.assertNotNull(dateTimeParserArray90);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder92);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber4 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 4, false, (int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = paddedNumber4.iFieldType;
        boolean boolean6 = paddedNumber4.iSigned;
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            paddedNumber4.printTo(stringBuffer7, readablePartial8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber4 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, (int) (short) 0, false, (-101));
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder5.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendMonthOfYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder5.appendDayOfWeek((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendFractionOfDay(6, (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder13.appendPattern("");
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder13.appendFraction(dateTimeFieldType19, 2, (-36));
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset16 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        java.util.Locale locale22 = null;
        timeZoneOffset16.printTo(stringBuffer17, (long) 20, chronology19, (int) (byte) 10, dateTimeZone21, locale22);
        java.lang.StringBuffer stringBuffer24 = null;
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale26 = null;
        timeZoneOffset16.printTo(stringBuffer24, readablePartial25, locale26);
        java.lang.StringBuffer stringBuffer28 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        java.util.Locale locale33 = null;
        timeZoneOffset16.printTo(stringBuffer28, (long) (short) 1, chronology30, (int) (byte) 10, dateTimeZone32, locale33);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = null;
        int int38 = timeZoneOffset16.parseInto(dateTimeParserBucket35, "hi!", 2);
        java.lang.StringBuffer stringBuffer39 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        java.util.Locale locale44 = null;
        timeZoneOffset16.printTo(stringBuffer39, (long) 6, chronology41, (-1), dateTimeZone43, locale44);
        java.lang.StringBuffer stringBuffer46 = null;
        org.joda.time.ReadablePartial readablePartial47 = null;
        java.util.Locale locale48 = null;
        timeZoneOffset16.printTo(stringBuffer46, readablePartial47, locale48);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap51 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName timeZoneName52 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName((int) ' ', strMap51);
        int int53 = timeZoneName52.estimateParsedLength();
        java.lang.StringBuffer stringBuffer54 = null;
        org.joda.time.ReadablePartial readablePartial55 = null;
        java.util.Locale locale56 = null;
        timeZoneName52.printTo(stringBuffer54, readablePartial55, locale56);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder58.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral62 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral64 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder60.append((org.joda.time.format.DateTimePrinter) characterLiteral62, (org.joda.time.format.DateTimeParser) characterLiteral64);
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral67 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int68 = stringLiteral67.estimateParsedLength();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray69 = new org.joda.time.format.DateTimeParser[] { timeZoneName52, characterLiteral62, stringLiteral67 };
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser70 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray69);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder10.append((org.joda.time.format.DateTimePrinter) timeZoneOffset16, dateTimeParserArray69);
        int int72 = timeZoneOffset16.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int76 = timeZoneOffset16.parseInto(dateTimeParserBucket73, "hi!", (-14));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -14");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-3) + "'", int38 == (-3));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 20 + "'", int53 == 20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(dateTimeParserArray69);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 13 + "'", int72 == 13);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "", false, 2, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendMinuteOfDay(3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendDayOfWeek((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendLiteral("hi!");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMinuteOfHour(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatterBuilder6.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendHourOfHalfday((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder6.appendSecondOfMinute((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral13 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('a');
        int int14 = characterLiteral13.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = null;
        int int18 = characterLiteral13.parseInto(dateTimeParserBucket15, "hi!", (int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) characterLiteral13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder19.appendEraText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatterBuilder0.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder7.appendTimeZoneOffset("hi!", true, (int) '4', (int) '4');
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimeParser) textField31);
        int int38 = textField31.estimatePrintedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber42 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType39, (int) (short) 100, false);
        int int43 = fixedNumber42.iMaxParsedDigits;
        int int44 = fixedNumber42.iMaxParsedDigits;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = null;
        int int48 = fixedNumber42.parseInto(dateTimeParserBucket45, "hi!", (int) (short) 100);
        int int49 = fixedNumber42.estimateParsedLength();
        int int50 = fixedNumber42.iMinPrintedDigits;
        int int51 = fixedNumber42.estimatePrintedLength();
        int int52 = fixedNumber42.iMinPrintedDigits;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = null;
        int int56 = fixedNumber42.parseInto(dateTimeParserBucket53, "", (int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField31, (org.joda.time.format.DateTimeParser) fixedNumber42);
        int int58 = fixedNumber42.estimateParsedLength();
        int int59 = fixedNumber42.estimateParsedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 6 + "'", int38 == 6);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-101) + "'", int48 == (-101));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
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
        int int17 = timeZoneOffset5.estimatePrintedLength();
        int int18 = timeZoneOffset5.estimatePrintedLength();
        int int19 = timeZoneOffset5.estimateParsedLength();
        java.lang.StringBuffer stringBuffer20 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        java.util.Locale locale25 = null;
        timeZoneOffset5.printTo(stringBuffer20, (long) (-2), chronology22, (int) (byte) 10, dateTimeZone24, locale25);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 13 + "'", int17 == 13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder1.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear9 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType6, (-21), false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder1.append((org.joda.time.format.DateTimePrinter) twoDigitYear9);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder1.appendCenturyOfEra(35, (int) (short) 10);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatterBuilder13.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendClockhourOfDay(13);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap17 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendTimeZoneShortName(strMap17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear22 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType19, (-5), false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimePrinter) twoDigitYear22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeParser14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendMonthOfYear(6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTwoDigitWeekyear(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.appendFractionOfHour((-101), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTwoDigitYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendClockhourOfDay(2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendDayOfWeekText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
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
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap21 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendTimeZoneName(strMap21);
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset28 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer29 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        java.util.Locale locale34 = null;
        timeZoneOffset28.printTo(stringBuffer29, (long) 20, chronology31, (int) (byte) 10, dateTimeZone33, locale34);
        java.lang.StringBuffer stringBuffer36 = null;
        org.joda.time.ReadablePartial readablePartial37 = null;
        java.util.Locale locale38 = null;
        timeZoneOffset28.printTo(stringBuffer36, readablePartial37, locale38);
        java.lang.StringBuffer stringBuffer40 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        java.util.Locale locale45 = null;
        timeZoneOffset28.printTo(stringBuffer40, (long) (short) 1, chronology42, (int) (byte) 10, dateTimeZone44, locale45);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = null;
        int int50 = timeZoneOffset28.parseInto(dateTimeParserBucket47, "hi!", 2);
        java.io.Writer writer51 = null;
        org.joda.time.ReadablePartial readablePartial52 = null;
        java.util.Locale locale53 = null;
        timeZoneOffset28.printTo(writer51, readablePartial52, locale53);
        java.lang.StringBuffer stringBuffer55 = null;
        org.joda.time.ReadablePartial readablePartial56 = null;
        java.util.Locale locale57 = null;
        timeZoneOffset28.printTo(stringBuffer55, readablePartial56, locale57);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = null;
        int int62 = timeZoneOffset28.parseInto(dateTimeParserBucket59, "", 10);
        int int63 = timeZoneOffset28.estimateParsedLength();
        java.lang.StringBuffer stringBuffer64 = null;
        org.joda.time.ReadablePartial readablePartial65 = null;
        java.util.Locale locale66 = null;
        timeZoneOffset28.printTo(stringBuffer64, readablePartial65, locale66);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = dateTimeFormatterBuilder68.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder68.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder72 = dateTimeFormatterBuilder68.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeParser dateTimeParser73 = dateTimeFormatterBuilder68.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder74 = dateTimeFormatterBuilder68.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder76 = dateTimeFormatterBuilder74.appendMillisOfDay((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder79 = dateTimeFormatterBuilder74.appendFractionOfMinute((int) (byte) 100, (int) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber83 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType80, 1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder84 = dateTimeFormatterBuilder74.append((org.joda.time.format.DateTimePrinter) fixedNumber83);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder85 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimePrinter) timeZoneOffset28, (org.joda.time.format.DateTimeParser) fixedNumber83);
        java.lang.StringBuffer stringBuffer86 = null;
        org.joda.time.ReadablePartial readablePartial87 = null;
        java.util.Locale locale88 = null;
        timeZoneOffset28.printTo(stringBuffer86, readablePartial87, locale88);
        java.io.Writer writer90 = null;
        org.joda.time.ReadablePartial readablePartial91 = null;
        java.util.Locale locale92 = null;
        timeZoneOffset28.printTo(writer90, readablePartial91, locale92);
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-3) + "'", int50 == (-3));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-11) + "'", int62 == (-11));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 13 + "'", int63 == 13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder69);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder71);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder72);
        org.junit.Assert.assertNotNull(dateTimeParser73);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder74);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder76);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder79);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder84);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder85);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendHourOfHalfday(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTwoDigitWeekyear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendDayOfYear(20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder10.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder10.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder10.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendWeekOfWeekyear(4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendTwoDigitYear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral24 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        int int25 = stringLiteral24.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder20.appendOptional((org.joda.time.format.DateTimeParser) stringLiteral24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder20.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatterBuilder27.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder29.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder29.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder29.appendHalfdayOfDayText();
        boolean boolean34 = dateTimeFormatterBuilder29.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder29.appendMillisOfSecond((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendHourOfDay(2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder38.appendTwoDigitWeekyear(2, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder38.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder44.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder44.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder44.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder44.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder52.appendWeekOfWeekyear(4);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap55 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder52.appendTimeZoneName(strMap55);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder56.appendSecondOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatterBuilder56.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder38.append(dateTimeFormatter59);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder27.append(dateTimeFormatter59);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder7.append(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendMonthOfYearShortText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendYear(100, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatterBuilder17.toParser();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeParser19);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 1, false);
        int int4 = unpaddedNumber3.estimatePrintedLength();
        int int5 = unpaddedNumber3.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        int int9 = unpaddedNumber3.parseInto(dateTimeParserBucket6, "", (int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = unpaddedNumber3.iFieldType;
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpaddedNumber3.printTo(stringBuffer11, readablePartial12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-36) + "'", int9 == (-36));
        org.junit.Assert.assertNull(dateTimeFieldType10);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
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
        int int15 = timeZoneId0.estimateParsedLength();
        int int16 = timeZoneId0.estimatePrintedLength();
        int int17 = timeZoneId0.estimateParsedLength();
        java.lang.StringBuffer stringBuffer18 = null;
        org.joda.time.ReadablePartial readablePartial19 = null;
        java.util.Locale locale20 = null;
        timeZoneId0.printTo(stringBuffer18, readablePartial19, locale20);
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) ' ', (int) (byte) 10);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer4, (long) 33, chronology6, (int) (short) 1, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendMonthOfYearShortText();
        boolean boolean5 = dateTimeFormatterBuilder4.canBuildPrinter();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber10 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType6, (int) (short) -1, true, 32);
        boolean boolean11 = paddedNumber10.iSigned;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber15 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType12, (int) (short) 100, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = fixedNumber15.iFieldType;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.append((org.joda.time.format.DateTimePrinter) paddedNumber10, (org.joda.time.format.DateTimeParser) fixedNumber15);
        int int18 = fixedNumber15.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer19 = null;
        org.joda.time.ReadablePartial readablePartial20 = null;
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber15.printTo(stringBuffer19, readablePartial20, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, (int) 'a', true);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField7 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType5, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendOptional((org.joda.time.format.DateTimeParser) textField7);
        int int9 = textField7.estimatePrintedLength();
        int int10 = textField7.estimateParsedLength();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField7.printTo(stringBuffer11, readablePartial12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, (int) (byte) 1);
        int int4 = fraction3.estimatePrintedLength();
        int int5 = fraction3.iMaxDigits;
        fraction3.iMinDigits = (short) 1;
        int int8 = fraction3.estimateParsedLength();
        fraction3.iMinDigits = (byte) 10;
        int int11 = fraction3.estimatePrintedLength();
        java.io.Writer writer12 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer12, (long) ' ', chronology14, (-35), dateTimeZone16, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
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
        int int23 = fraction15.estimatePrintedLength();
        int int24 = fraction15.iMaxDigits;
        fraction15.iMinDigits = (-7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-101) + "'", int21 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction10 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType7, (int) (byte) 0, (int) (byte) 1);
        int int11 = fraction10.estimateParsedLength();
        fraction10.iMaxDigits = 3;
        int int14 = fraction10.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimeParser) fraction10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder18.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap24 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendTimeZoneShortName(strMap24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendMonthOfYearShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = dateTimeFormatterBuilder23.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder23.appendMonthOfYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder23.appendDayOfWeek((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder23.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder33.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendSecondOfDay((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral39 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder37.appendOptional((org.joda.time.format.DateTimeParser) characterLiteral39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatterBuilder40.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder32.append(dateTimeFormatter41);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder15.append(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimePrinter27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendFractionOfDay(0, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendHourOfHalfday(13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendFractionOfDay(0, 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder11.appendTimeZoneOffset("", false, (-35), (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendDayOfYear((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder11.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField23 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType21, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField26 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType24, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimePrinter) textField23, (org.joda.time.format.DateTimeParser) textField26);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder15.append((org.joda.time.format.DateTimePrinter) textField23);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder28.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral31 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder29.append((org.joda.time.format.DateTimeParser) stringLiteral31);
        int int33 = stringLiteral31.estimateParsedLength();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction37 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType34, (int) (byte) 0, (int) (byte) 1);
        int int38 = fraction37.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder10.append((org.joda.time.format.DateTimePrinter) stringLiteral31, (org.joda.time.format.DateTimeParser) fraction37);
        int int40 = stringLiteral31.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = null;
        int int44 = stringLiteral31.parseInto(dateTimeParserBucket41, "", (int) ' ');
        int int45 = stringLiteral31.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer46 = null;
        org.joda.time.ReadablePartial readablePartial47 = null;
        java.util.Locale locale48 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral31.printTo(stringBuffer46, readablePartial47, locale48);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-33) + "'", int44 == (-33));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap7);
        dateTimeFormatterBuilder0.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendMinuteOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendHourOfHalfday((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendMonthOfYearText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap16 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendTimeZoneShortName(strMap16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (-14), false);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = fixedNumber3.iFieldType;
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        fixedNumber3.printTo(writer5, (long) (-3), chronology7, (int) (byte) 1, dateTimeZone9, locale10);
        java.io.Writer writer12 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        java.util.Locale locale17 = null;
        fixedNumber3.printTo(writer12, (long) (-4), chronology14, (int) '4', dateTimeZone16, locale17);
        int int19 = fixedNumber3.estimatePrintedLength();
        org.junit.Assert.assertNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-14) + "'", int19 == (-14));
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendMinuteOfDay(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset13 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer14 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        java.util.Locale locale19 = null;
        timeZoneOffset13.printTo(stringBuffer14, (long) 20, chronology16, (int) (byte) 10, dateTimeZone18, locale19);
        java.lang.StringBuffer stringBuffer21 = null;
        org.joda.time.ReadablePartial readablePartial22 = null;
        java.util.Locale locale23 = null;
        timeZoneOffset13.printTo(stringBuffer21, readablePartial22, locale23);
        java.lang.StringBuffer stringBuffer25 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        java.util.Locale locale30 = null;
        timeZoneOffset13.printTo(stringBuffer25, (long) (short) 1, chronology27, (int) (byte) 10, dateTimeZone29, locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = null;
        int int35 = timeZoneOffset13.parseInto(dateTimeParserBucket32, "hi!", 2);
        java.io.Writer writer36 = null;
        org.joda.time.ReadablePartial readablePartial37 = null;
        java.util.Locale locale38 = null;
        timeZoneOffset13.printTo(writer36, readablePartial37, locale38);
        java.lang.StringBuffer stringBuffer40 = null;
        org.joda.time.ReadablePartial readablePartial41 = null;
        java.util.Locale locale42 = null;
        timeZoneOffset13.printTo(stringBuffer40, readablePartial41, locale42);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = null;
        int int47 = timeZoneOffset13.parseInto(dateTimeParserBucket44, "", 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction51 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType48, (int) (short) -1, 0);
        fraction51.iMaxDigits = (short) -1;
        int int54 = fraction51.iMaxDigits;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder7.append((org.joda.time.format.DateTimePrinter) timeZoneOffset13, (org.joda.time.format.DateTimeParser) fraction51);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-3) + "'", int35 == (-3));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-11) + "'", int47 == (-11));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
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
        dateTimeFormatterBuilder0.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder0.appendMillisOfDay(13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendDayOfWeek(20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-101) + "'", int26 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        int int4 = characterLiteral1.estimateParsedLength();
        int int5 = characterLiteral1.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        int int9 = characterLiteral1.parseInto(dateTimeParserBucket6, "hi!", (int) 'a');
        int int10 = characterLiteral1.estimateParsedLength();
        int int11 = characterLiteral1.estimatePrintedLength();
        java.io.Writer writer12 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer12, (long) (-2), chronology14, (-33), dateTimeZone16, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-98) + "'", int9 == (-98));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 33, true);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField5 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType3, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField8 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType6, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimePrinter) textField5, (org.joda.time.format.DateTimeParser) textField8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendMonthOfYear(6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.appendFractionOfDay((int) (short) 100, (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder12.appendFractionOfSecond(1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMillisOfDay((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfDay((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendSecondOfDay(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber17 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType14, (int) (short) 100, false);
        int int18 = fixedNumber17.iMaxParsedDigits;
        int int19 = fixedNumber17.iMaxParsedDigits;
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset25 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "hi!", true, (int) '#', (int) 'a');
        java.lang.StringBuffer stringBuffer26 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        java.util.Locale locale31 = null;
        timeZoneOffset25.printTo(stringBuffer26, (long) 20, chronology28, (int) (byte) 10, dateTimeZone30, locale31);
        java.lang.StringBuffer stringBuffer33 = null;
        org.joda.time.ReadablePartial readablePartial34 = null;
        java.util.Locale locale35 = null;
        timeZoneOffset25.printTo(stringBuffer33, readablePartial34, locale35);
        java.lang.StringBuffer stringBuffer37 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        java.util.Locale locale42 = null;
        timeZoneOffset25.printTo(stringBuffer37, (long) (short) 1, chronology39, (int) (byte) 10, dateTimeZone41, locale42);
        int int44 = timeZoneOffset25.estimatePrintedLength();
        int int45 = timeZoneOffset25.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer46 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        java.util.Locale locale51 = null;
        timeZoneOffset25.printTo(stringBuffer46, (long) (-11), chronology48, 32, dateTimeZone50, locale51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField55 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType53, true);
        int int56 = textField55.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder57.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder57.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatterBuilder59.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder59.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder59.appendMinuteOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder65.appendTimeZoneShortName();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber70 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType67, (int) ' ', true);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber74 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType71, (int) (short) 100, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = fixedNumber74.iFieldType;
        int int76 = fixedNumber74.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder65.append((org.joda.time.format.DateTimePrinter) fixedNumber70, (org.joda.time.format.DateTimeParser) fixedNumber74);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = null;
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber81 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType78, 3, true);
        int int82 = unpaddedNumber81.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder83 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder85 = dateTimeFormatterBuilder83.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder87 = dateTimeFormatterBuilder85.appendHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField90 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType88, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder91 = dateTimeFormatterBuilder87.appendOptional((org.joda.time.format.DateTimeParser) textField90);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray92 = new org.joda.time.format.DateTimeParser[] { timeZoneOffset25, textField55, fixedNumber74, unpaddedNumber81, textField90 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder93 = dateTimeFormatterBuilder11.append((org.joda.time.format.DateTimePrinter) fixedNumber17, dateTimeParserArray92);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket94 = null;
        int int97 = fixedNumber17.parseInto(dateTimeParserBucket94, "hi!", 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 13 + "'", int44 == 13);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 13 + "'", int45 == 13);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 6 + "'", int56 == 6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertNull(dateTimeFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder77);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 3 + "'", int82 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder85);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder87);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder91);
        org.junit.Assert.assertNotNull(dateTimeParserArray92);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder93);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder9.toFormatter();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendTimeZoneShortName(strMap11);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneShortName(strMap13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfYear(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder5.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendMonthOfYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder5.appendFractionOfDay(4, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder5.appendTwoDigitWeekyear((int) (byte) -1, true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (byte) 0, 97);
        int int4 = fraction3.estimateParsedLength();
        fraction3.iMaxDigits = (short) 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (-101), false);
        int int4 = twoDigitYear3.estimatePrintedLength();
        int int5 = twoDigitYear3.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        int int9 = twoDigitYear3.parseInto(dateTimeParserBucket6, "", (int) 'a');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = null;
        int int13 = twoDigitYear3.parseInto(dateTimeParserBucket10, "", (int) 'a');
        java.io.Writer writer14 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer14, (long) (-53), chronology16, (int) (byte) -1, dateTimeZone18, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-98) + "'", int9 == (-98));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-98) + "'", int13 == (-98));
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        boolean boolean5 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction10 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType7, (int) (byte) 0, (int) (byte) 1);
        int int11 = fraction10.estimateParsedLength();
        fraction10.iMaxDigits = 3;
        int int14 = fraction10.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder0.append((org.joda.time.format.DateTimeParser) fraction10);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap16 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap16);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder0.appendTimeZoneShortName();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('#');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        int int4 = characterLiteral1.estimateParsedLength();
        int int5 = characterLiteral1.estimatePrintedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = null;
        int int9 = characterLiteral1.parseInto(dateTimeParserBucket6, "hi!", (int) 'a');
        int int10 = characterLiteral1.estimateParsedLength();
        int int11 = characterLiteral1.estimatePrintedLength();
        int int12 = characterLiteral1.estimateParsedLength();
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer13, (long) (byte) -1, chronology15, 20, dateTimeZone17, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-98) + "'", int9 == (-98));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (-1), true);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (int) (short) 100, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = fixedNumber3.iFieldType;
        int int5 = fixedNumber3.estimatePrintedLength();
        int int6 = fixedNumber3.estimateParsedLength();
        int int7 = fixedNumber3.estimateParsedLength();
        int int8 = fixedNumber3.iMinPrintedDigits;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = fixedNumber3.parseInto(dateTimeParserBucket9, "hi!", (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendMinuteOfDay((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder18.appendFractionOfMinute(32, (-36));
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear29 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType26, (-21), false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendWeekOfWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder32.appendHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField37 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType35, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder34.appendOptional((org.joda.time.format.DateTimeParser) textField37);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimePrinter) twoDigitYear29, (org.joda.time.format.DateTimeParser) textField37);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder18.appendEraText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap41 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder40.appendTimeZoneShortName(strMap41);
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
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
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
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser17 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray15);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser18 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray15);
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser19 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray15);
        org.junit.Assert.assertNotNull(dateTimeParserArray15);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder9.toFormatter();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendTimeZoneShortName(strMap11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder13.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendTwoDigitYear((int) (short) -1, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatterBuilder14.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear22 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType19, (-21), false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder14.append((org.joda.time.format.DateTimePrinter) twoDigitYear22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder24.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder24.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder24.appendYearOfEra(1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder24.appendClockhourOfDay((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder32.appendWeekOfWeekyear(4);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap35 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder32.appendTimeZoneName(strMap35);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendSecondOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatterBuilder36.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder14.append(dateTimeFormatter39);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder12.append(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder2.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendFractionOfHour(6, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) (short) 100);
        boolean boolean9 = dateTimeFormatterBuilder8.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendPattern("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder8.appendHourOfDay(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder8.appendTwoDigitWeekyear((int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
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
}

