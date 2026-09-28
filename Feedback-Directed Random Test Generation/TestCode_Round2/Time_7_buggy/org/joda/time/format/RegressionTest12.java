package org.joda.time.format;

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
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        java.lang.Integer int9 = dateTimeFormatter8.getPivotYear();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        int int15 = dateTimeFormatter14.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter14.withZone(dateTimeZone16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withChronology(chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter19.withPivotYear(0);
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter19.withLocale(locale24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter25.withZoneUTC();
        boolean boolean27 = dateTimeFormatter25.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter25.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeFormatter25.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter8.withZone(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2000 + "'", int15 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withDefaultYear((-1));
        boolean boolean10 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withLocale(locale12);
        int int14 = dateTimeFormatter13.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withZoneUTC();
        org.joda.time.Chronology chronology18 = dateTimeFormatter17.getChronology();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeFormatter17.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withPivotYear((int) 'a');
        java.lang.Integer int22 = dateTimeFormatter17.getPivotYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNull(int22);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withDefaultYear((-1));
        boolean boolean10 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology12 = dateTimeFormatter2.getChronology();
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTimeFormatter2.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withDefaultYear((-1));
        boolean boolean10 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withLocale(locale12);
        boolean boolean14 = dateTimeFormatter2.isPrinter();
        java.util.Locale locale15 = dateTimeFormatter2.getLocale();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter7.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withPivotYear((int) (byte) 100);
        int int11 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.Chronology chronology12 = dateTimeFormatter10.getChronolgy();
        java.util.Locale locale13 = dateTimeFormatter10.getLocale();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNull(locale13);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) (byte) 100);
        java.lang.Integer int8 = dateTimeFormatter7.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((int) 'a');
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        int int17 = dateTimeFormatter16.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter16.withZone(dateTimeZone18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter16.withZoneUTC();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withChronology(chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter21.withPivotYear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withZone(dateTimeZone26);
        org.joda.time.Chronology chronology28 = dateTimeFormatter27.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withDefaultYear((int) '#');
        boolean boolean31 = dateTimeFormatter30.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter32 = null;
        org.joda.time.format.DateTimeParser dateTimeParser33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter32, dateTimeParser33);
        int int35 = dateTimeFormatter34.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter34.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimeParser dateTimeParser38 = dateTimeFormatter37.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter37.withPivotYear((java.lang.Integer) (-1));
        boolean boolean41 = dateTimeFormatter37.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter37.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter37.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.format.DateTimePrinter dateTimePrinter45 = null;
        org.joda.time.format.DateTimeParser dateTimeParser46 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter45, dateTimeParser46);
        int int48 = dateTimeFormatter47.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter47.withZone(dateTimeZone49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter47.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter47.withZoneUTC();
        org.joda.time.Chronology chronology53 = dateTimeFormatter47.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter54 = dateTimeFormatter47.getPrinter();
        java.lang.Integer int55 = dateTimeFormatter47.getPivotYear();
        boolean boolean56 = dateTimeFormatter47.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone57 = dateTimeFormatter47.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter58 = null;
        org.joda.time.format.DateTimeParser dateTimeParser59 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter58, dateTimeParser59);
        int int61 = dateTimeFormatter60.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter60.withZone(dateTimeZone62);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter60.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter60.withZoneUTC();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter65.withChronology(chronology66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter65.withPivotYear((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter70 = null;
        org.joda.time.format.DateTimeParser dateTimeParser71 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter70, dateTimeParser71);
        int int73 = dateTimeFormatter72.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = dateTimeFormatter72.withZone(dateTimeZone74);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter72.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter72.withZoneUTC();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = dateTimeFormatter77.withChronology(chronology78);
        org.joda.time.DateTimeZone dateTimeZone80 = dateTimeFormatter79.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = dateTimeFormatter69.withZone(dateTimeZone80);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter82 = dateTimeFormatter47.withZone(dateTimeZone80);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter37.withZone(dateTimeZone80);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter84 = dateTimeFormatter30.withZone(dateTimeZone80);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter11.withZone(dateTimeZone80);
        java.io.Writer writer86 = null;
        org.joda.time.ReadableInstant readableInstant87 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer86, readableInstant87);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2000 + "'", int17 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2000 + "'", int35 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNull(dateTimeParser38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2000 + "'", int48 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNull(chronology53);
        org.junit.Assert.assertNull(dateTimePrinter54);
        org.junit.Assert.assertNull(int55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(dateTimeZone57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2000 + "'", int61 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2000 + "'", int73 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter75);
        org.junit.Assert.assertNotNull(dateTimeFormatter76);
        org.junit.Assert.assertNotNull(dateTimeFormatter77);
        org.junit.Assert.assertNotNull(dateTimeFormatter79);
        org.junit.Assert.assertNotNull(dateTimeZone80);
        org.junit.Assert.assertNotNull(dateTimeFormatter81);
        org.junit.Assert.assertNotNull(dateTimeFormatter82);
        org.junit.Assert.assertNotNull(dateTimeFormatter83);
        org.junit.Assert.assertNotNull(dateTimeFormatter84);
        org.junit.Assert.assertNotNull(dateTimeFormatter85);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withChronology(chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTimeFormatter13.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withPivotYear(0);
        java.util.Locale locale17 = dateTimeFormatter13.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter13.withPivotYear((java.lang.Integer) 2000);
        boolean boolean20 = dateTimeFormatter13.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter13.withZoneUTC();
        boolean boolean22 = dateTimeFormatter21.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter21.getParser();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dateTimeParser23);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withChronology(chronology7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        boolean boolean11 = dateTimeFormatter8.isParser();
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(appendable12, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear((int) (byte) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter7.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withDefaultYear((int) (byte) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        int int18 = dateTimeFormatter17.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withZone(dateTimeZone19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withOffsetParsed();
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withLocale(locale22);
        org.joda.time.Chronology chronology24 = dateTimeFormatter21.getChronolgy();
        org.joda.time.Chronology chronology25 = dateTimeFormatter21.getChronology();
        org.joda.time.Chronology chronology26 = dateTimeFormatter21.getChronology();
        boolean boolean27 = dateTimeFormatter21.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter21.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        int int32 = dateTimeFormatter31.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter31.withZone(dateTimeZone33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter31.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter31.withZoneUTC();
        org.joda.time.Chronology chronology37 = dateTimeFormatter31.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter38 = dateTimeFormatter31.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter39 = null;
        org.joda.time.format.DateTimeParser dateTimeParser40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter39, dateTimeParser40);
        int int42 = dateTimeFormatter41.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter41.withZone(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter41.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter41.withZoneUTC();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter46.withChronology(chronology47);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeFormatter48.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter31.withZone(dateTimeZone49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter28.withZone(dateTimeZone49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter10.withZone(dateTimeZone49);
        boolean boolean53 = dateTimeFormatter10.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone55 = dateTimeFormatter10.getZone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2000 + "'", int18 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNull(chronology24);
        org.junit.Assert.assertNull(chronology25);
        org.junit.Assert.assertNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2000 + "'", int32 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNull(chronology37);
        org.junit.Assert.assertNull(dateTimePrinter38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2000 + "'", int42 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNull(dateTimeZone55);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean7 = dateTimeFormatter6.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter6.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter10.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withPivotYear(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTimeFormatter13.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimePrinter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 10);
        java.util.Locale locale6 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        int int8 = dateTimeFormatter2.getDefaultYear();
        boolean boolean9 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withPivotYear(1);
        java.lang.Class<?> wildcardClass12 = dateTimeFormatter11.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withChronology(chronology7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        int int17 = dateTimeFormatter16.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter16.withDefaultYear((int) (short) 10);
        java.util.Locale locale20 = dateTimeFormatter16.getLocale();
        java.lang.Integer int21 = dateTimeFormatter16.getPivotYear();
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter16.withLocale(locale22);
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        int int27 = dateTimeFormatter26.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter26.withZone(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter26.withZoneUTC();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter30.withChronology(chronology31);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        int int36 = dateTimeFormatter35.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter35.withZone(dateTimeZone37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter35.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter35.withZoneUTC();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withChronology(chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter40.withPivotYear((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter45 = null;
        org.joda.time.format.DateTimeParser dateTimeParser46 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter45, dateTimeParser46);
        int int48 = dateTimeFormatter47.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter47.withZone(dateTimeZone49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter47.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter47.withZoneUTC();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter52.withChronology(chronology53);
        org.joda.time.DateTimeZone dateTimeZone55 = dateTimeFormatter54.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter44.withZone(dateTimeZone55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter30.withZone(dateTimeZone55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter16.withZone(dateTimeZone55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter8.withZone(dateTimeZone55);
        boolean boolean60 = dateTimeFormatter8.isParser();
        // The following exception was thrown during execution in test generation
        try {
            long long62 = dateTimeFormatter8.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2000 + "'", int17 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2000 + "'", int27 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2000 + "'", int36 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2000 + "'", int48 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withChronology(chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 0);
        java.lang.Appendable appendable15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(appendable15, readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        int int11 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withZone(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withChronology(chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeFormatter17.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter2.withZone(dateTimeZone18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter2.withPivotYear((int) (byte) 100);
        java.util.Locale locale22 = dateTimeFormatter21.getLocale();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter21.withChronology(chronology23);
        int int25 = dateTimeFormatter24.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter24.withPivotYear((int) '#');
        java.lang.Appendable appendable28 = null;
        org.joda.time.ReadablePartial readablePartial29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter27.printTo(appendable28, readablePartial29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2000 + "'", int25 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter7.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withPivotYear((int) (byte) 100);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withChronology(chronology11);
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuffer13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology8 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withDefaultYear(10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter11.withChronology(chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withPivotYear((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = dateTimeFormatter17.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withChronology(chronology7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((int) (byte) 100);
        boolean boolean15 = dateTimeFormatter12.isParser();
        boolean boolean16 = dateTimeFormatter12.isPrinter();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withLocale(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter12.withPivotYear((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dateTimeFormatter12.print(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withDefaultYear((int) (short) 10);
        boolean boolean10 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withDefaultYear((int) (short) -1);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        int int16 = dateTimeFormatter15.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withZone(dateTimeZone17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter15.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        int int24 = dateTimeFormatter23.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withZone(dateTimeZone25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter28.withChronology(chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeFormatter30.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter15.withZone(dateTimeZone31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter15.withPivotYear((int) (byte) 100);
        java.util.Locale locale35 = dateTimeFormatter34.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = null;
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        int int39 = dateTimeFormatter38.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter38.withZone(dateTimeZone40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter38.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter38.withZoneUTC();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter43.withChronology(chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter43.withPivotYear(0);
        java.util.Locale locale48 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter43.withLocale(locale48);
        org.joda.time.Chronology chronology50 = dateTimeFormatter49.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser51 = dateTimeFormatter49.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter52 = null;
        org.joda.time.format.DateTimeParser dateTimeParser53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter52, dateTimeParser53);
        int int55 = dateTimeFormatter54.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter54.withZone(dateTimeZone56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter54.withZoneUTC();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter58.withChronology(chronology59);
        org.joda.time.format.DateTimePrinter dateTimePrinter61 = null;
        org.joda.time.format.DateTimeParser dateTimeParser62 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter61, dateTimeParser62);
        int int64 = dateTimeFormatter63.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter63.withZone(dateTimeZone65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter63.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter63.withZoneUTC();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter68.withChronology(chronology69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter68.withPivotYear((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter73 = null;
        org.joda.time.format.DateTimeParser dateTimeParser74 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter73, dateTimeParser74);
        int int76 = dateTimeFormatter75.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = dateTimeFormatter75.withZone(dateTimeZone77);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = dateTimeFormatter75.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = dateTimeFormatter75.withZoneUTC();
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter82 = dateTimeFormatter80.withChronology(chronology81);
        org.joda.time.DateTimeZone dateTimeZone83 = dateTimeFormatter82.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter84 = dateTimeFormatter72.withZone(dateTimeZone83);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter58.withZone(dateTimeZone83);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter49.withZone(dateTimeZone83);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter87 = dateTimeFormatter34.withZone(dateTimeZone83);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter88 = dateTimeFormatter2.withZone(dateTimeZone83);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime90 = dateTimeFormatter2.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2000 + "'", int24 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2000 + "'", int39 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNull(chronology50);
        org.junit.Assert.assertNull(dateTimeParser51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2000 + "'", int55 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2000 + "'", int64 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
        org.junit.Assert.assertNotNull(dateTimeFormatter70);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2000 + "'", int76 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter78);
        org.junit.Assert.assertNotNull(dateTimeFormatter79);
        org.junit.Assert.assertNotNull(dateTimeFormatter80);
        org.junit.Assert.assertNotNull(dateTimeFormatter82);
        org.junit.Assert.assertNotNull(dateTimeZone83);
        org.junit.Assert.assertNotNull(dateTimeFormatter84);
        org.junit.Assert.assertNotNull(dateTimeFormatter85);
        org.junit.Assert.assertNotNull(dateTimeFormatter86);
        org.junit.Assert.assertNotNull(dateTimeFormatter87);
        org.junit.Assert.assertNotNull(dateTimeFormatter88);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withChronology(chronology7);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        int int12 = dateTimeFormatter11.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter11.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withPivotYear((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        int int24 = dateTimeFormatter23.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withZone(dateTimeZone25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter28.withChronology(chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeFormatter30.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter20.withZone(dateTimeZone31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter6.withZone(dateTimeZone31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter33.withPivotYear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter35.withDefaultYear(2000);
        java.io.Writer writer38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter37.printTo(writer38, readableInstant39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2000 + "'", int24 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        boolean boolean8 = dateTimeFormatter2.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronology();
        java.lang.Integer int11 = dateTimeFormatter2.getPivotYear();
        org.joda.time.Chronology chronology12 = dateTimeFormatter2.getChronolgy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(chronology12);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear(10);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        int int13 = dateTimeFormatter12.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withZoneUTC();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withChronology(chronology17);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        int int22 = dateTimeFormatter21.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter21.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter21.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter21.withZoneUTC();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withChronology(chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter26.withPivotYear((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter31 = null;
        org.joda.time.format.DateTimeParser dateTimeParser32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter31, dateTimeParser32);
        int int34 = dateTimeFormatter33.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter33.withZone(dateTimeZone35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter33.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter33.withZoneUTC();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter38.withChronology(chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeFormatter40.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter30.withZone(dateTimeZone41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter16.withZone(dateTimeZone41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter2.withZone(dateTimeZone41);
        org.joda.time.format.DateTimePrinter dateTimePrinter45 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter2.withZone(dateTimeZone46);
        // The following exception was thrown during execution in test generation
        try {
            long long49 = dateTimeFormatter47.parseMillis("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2000 + "'", int22 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2000 + "'", int34 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNull(dateTimePrinter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withChronology(chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        int int15 = dateTimeFormatter14.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter14.withZone(dateTimeZone16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withChronology(chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeFormatter21.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter11.withZone(dateTimeZone22);
        int int24 = dateTimeFormatter11.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter11.withPivotYear((int) (short) -1);
        boolean boolean27 = dateTimeFormatter11.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter11.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = dateTimeFormatter11.getPrinter();
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter11.withLocale(locale30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2000 + "'", int15 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2000 + "'", int24 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(dateTimePrinter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean7 = dateTimeFormatter6.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        boolean boolean10 = dateTimeFormatter8.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        int int15 = dateTimeFormatter14.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter14.withZone(dateTimeZone16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withChronology(chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter19.withPivotYear((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        int int27 = dateTimeFormatter26.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter26.withZone(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter26.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter26.withZoneUTC();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter31.withChronology(chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeFormatter33.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter23.withZone(dateTimeZone34);
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = null;
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        int int39 = dateTimeFormatter38.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter38.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter41.withDefaultYear((int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter41.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter44.withPivotYear((java.lang.Integer) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter44.withPivotYear(0);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeFormatter44.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter35.withZone(dateTimeZone49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter8.withZone(dateTimeZone49);
        org.joda.time.format.DateTimePrinter dateTimePrinter52 = dateTimeFormatter51.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser53 = dateTimeFormatter51.getParser();
        boolean boolean54 = dateTimeFormatter51.isOffsetParsed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2000 + "'", int15 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2000 + "'", int27 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2000 + "'", int39 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNull(dateTimePrinter52);
        org.junit.Assert.assertNull(dateTimeParser53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withChronology(chronology7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 10);
        java.util.Locale locale15 = dateTimeFormatter12.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = dateTimeFormatter12.getPrinter();
        boolean boolean17 = dateTimeFormatter12.isParser();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(dateTimePrinter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 10);
        java.util.Locale locale6 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        int int8 = dateTimeFormatter2.getDefaultYear();
        boolean boolean9 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withPivotYear(1);
        boolean boolean12 = dateTimeFormatter11.isPrinter();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withPivotYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter9.print((long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }
}

