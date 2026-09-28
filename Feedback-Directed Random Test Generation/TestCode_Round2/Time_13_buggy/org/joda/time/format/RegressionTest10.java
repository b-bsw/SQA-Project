package org.joda.time.format;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter fieldFormatter0 = null;
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix2 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        int int5 = simpleAffix2.scan("", 100);
        int int8 = simpleAffix2.scan("", (int) (short) 1);
        int int11 = simpleAffix2.scan("hi!", 52);
        int int13 = simpleAffix2.calculatePrintedLength((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter fieldFormatter14 = new org.joda.time.format.PeriodFormatterBuilder.FieldFormatter(fieldFormatter0, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-101) + "'", int5 == (-101));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-53) + "'", int11 == (-53));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.rejectSignedValues(false);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.appendYears();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder5.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder5.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder8.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = periodFormatterBuilder8.maximumParsedDigits((int) ' ');
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder13 = periodFormatterBuilder11.appendLiteral("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder14 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder16 = periodFormatterBuilder14.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder17 = periodFormatterBuilder14.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder19 = periodFormatterBuilder17.appendPrefix("");
        org.joda.time.format.PeriodPrinter periodPrinter20 = periodFormatterBuilder19.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder.Literal literal21 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder22 = periodFormatterBuilder13.append(periodPrinter20, (org.joda.time.format.PeriodParser) literal21);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal23 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder24 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder26 = periodFormatterBuilder24.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder27 = periodFormatterBuilder24.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder28 = periodFormatterBuilder27.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder30 = periodFormatterBuilder27.maximumParsedDigits((int) ' ');
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder32 = periodFormatterBuilder30.appendLiteral("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder33 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder35 = periodFormatterBuilder33.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder36 = periodFormatterBuilder33.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder38 = periodFormatterBuilder36.appendPrefix("");
        org.joda.time.format.PeriodPrinter periodPrinter39 = periodFormatterBuilder38.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder.Literal literal40 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder41 = periodFormatterBuilder32.append(periodPrinter39, (org.joda.time.format.PeriodParser) literal40);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder42 = periodFormatterBuilder13.append((org.joda.time.format.PeriodPrinter) literal23, (org.joda.time.format.PeriodParser) literal40);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal43 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder44 = periodFormatterBuilder4.append((org.joda.time.format.PeriodPrinter) literal40, (org.joda.time.format.PeriodParser) literal43);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder45 = periodFormatterBuilder44.printZeroNever();
        org.joda.time.format.PeriodPrinter periodPrinter46 = periodFormatterBuilder44.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder48 = periodFormatterBuilder44.appendPrefix("");
        org.joda.time.format.PeriodPrinter periodPrinter49 = periodFormatterBuilder44.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder50 = periodFormatterBuilder44.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder51 = periodFormatterBuilder44.appendDays();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder53 = periodFormatterBuilder44.appendSuffix("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder54 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder55 = periodFormatterBuilder54.printZeroAlways();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder57 = periodFormatterBuilder55.minimumPrintedDigits((int) (short) 10);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder58 = periodFormatterBuilder57.appendDays();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder61 = periodFormatterBuilder57.appendSuffix("hi!", "hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder63 = periodFormatterBuilder57.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder64 = periodFormatterBuilder63.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder66 = periodFormatterBuilder64.maximumParsedDigits((-16));
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder67 = periodFormatterBuilder64.printZeroRarelyFirst();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder68 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder70 = periodFormatterBuilder68.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder71 = periodFormatterBuilder68.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder72 = periodFormatterBuilder68.printZeroRarelyFirst();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder74 = periodFormatterBuilder72.minimumPrintedDigits(0);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder75 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder77 = periodFormatterBuilder75.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder78 = periodFormatterBuilder75.appendWeeks();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder79 = periodFormatterBuilder78.printZeroAlways();
        org.joda.time.format.PeriodFormatter periodFormatter80 = periodFormatterBuilder79.toFormatter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder81 = periodFormatterBuilder72.append(periodFormatter80);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder82 = periodFormatterBuilder67.append(periodFormatter80);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder83 = periodFormatterBuilder44.append(periodFormatter80);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder11);
        org.junit.Assert.assertNotNull(periodFormatterBuilder13);
        org.junit.Assert.assertNotNull(periodFormatterBuilder16);
        org.junit.Assert.assertNotNull(periodFormatterBuilder17);
        org.junit.Assert.assertNotNull(periodFormatterBuilder19);
        org.junit.Assert.assertNotNull(periodPrinter20);
        org.junit.Assert.assertNotNull(literal21);
        org.junit.Assert.assertNotNull(periodFormatterBuilder22);
        org.junit.Assert.assertNotNull(literal23);
        org.junit.Assert.assertNotNull(periodFormatterBuilder26);
        org.junit.Assert.assertNotNull(periodFormatterBuilder27);
        org.junit.Assert.assertNotNull(periodFormatterBuilder28);
        org.junit.Assert.assertNotNull(periodFormatterBuilder30);
        org.junit.Assert.assertNotNull(periodFormatterBuilder32);
        org.junit.Assert.assertNotNull(periodFormatterBuilder35);
        org.junit.Assert.assertNotNull(periodFormatterBuilder36);
        org.junit.Assert.assertNotNull(periodFormatterBuilder38);
        org.junit.Assert.assertNotNull(periodPrinter39);
        org.junit.Assert.assertNotNull(literal40);
        org.junit.Assert.assertNotNull(periodFormatterBuilder41);
        org.junit.Assert.assertNotNull(periodFormatterBuilder42);
        org.junit.Assert.assertNotNull(literal43);
        org.junit.Assert.assertNotNull(periodFormatterBuilder44);
        org.junit.Assert.assertNotNull(periodFormatterBuilder45);
        org.junit.Assert.assertNotNull(periodPrinter46);
        org.junit.Assert.assertNotNull(periodFormatterBuilder48);
        org.junit.Assert.assertNotNull(periodPrinter49);
        org.junit.Assert.assertNotNull(periodFormatterBuilder50);
        org.junit.Assert.assertNotNull(periodFormatterBuilder51);
        org.junit.Assert.assertNotNull(periodFormatterBuilder53);
        org.junit.Assert.assertNotNull(periodFormatterBuilder55);
        org.junit.Assert.assertNotNull(periodFormatterBuilder57);
        org.junit.Assert.assertNotNull(periodFormatterBuilder58);
        org.junit.Assert.assertNotNull(periodFormatterBuilder61);
        org.junit.Assert.assertNotNull(periodFormatterBuilder63);
        org.junit.Assert.assertNotNull(periodFormatterBuilder64);
        org.junit.Assert.assertNotNull(periodFormatterBuilder66);
        org.junit.Assert.assertNotNull(periodFormatterBuilder67);
        org.junit.Assert.assertNotNull(periodFormatterBuilder70);
        org.junit.Assert.assertNotNull(periodFormatterBuilder71);
        org.junit.Assert.assertNotNull(periodFormatterBuilder72);
        org.junit.Assert.assertNotNull(periodFormatterBuilder74);
        org.junit.Assert.assertNotNull(periodFormatterBuilder77);
        org.junit.Assert.assertNotNull(periodFormatterBuilder78);
        org.junit.Assert.assertNotNull(periodFormatterBuilder79);
        org.junit.Assert.assertNotNull(periodFormatter80);
        org.junit.Assert.assertNotNull(periodFormatterBuilder81);
        org.junit.Assert.assertNotNull(periodFormatterBuilder82);
        org.junit.Assert.assertNotNull(periodFormatterBuilder83);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix5 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix6 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix9 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix12 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix13 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix9, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix12);
        int int15 = pluralAffix12.calculatePrintedLength((int) (byte) 100);
        int int18 = pluralAffix12.parse("hi!", (int) (byte) 0);
        int int21 = pluralAffix12.parse("hi!", (-11));
        int int24 = pluralAffix12.scan("", (-36));
        int int27 = pluralAffix12.scan("hi!", (int) '4');
        int int30 = pluralAffix12.scan("", (int) (byte) 0);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix31 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix12);
        int int34 = pluralAffix5.scan("", 97);
        java.io.Writer writer35 = null;
        // The following exception was thrown during execution in test generation
        try {
            pluralAffix5.printTo(writer35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-53) + "'", int27 == (-53));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-98) + "'", int34 == (-98));
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        int int5 = pluralAffix2.scan("hi!", (int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix8 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix11 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix12 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix8, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix11);
        int int15 = pluralAffix8.parse("", (int) '#');
        int int17 = pluralAffix8.calculatePrintedLength((-36));
        int int19 = pluralAffix8.calculatePrintedLength((int) (short) 1);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix20 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix8);
        int int23 = pluralAffix2.parse("", (int) (short) 10);
        int int26 = pluralAffix2.parse("hi!", (int) '#');
        int int29 = pluralAffix2.parse("hi!", (int) (short) 100);
        int int31 = pluralAffix2.calculatePrintedLength(35);
        int int33 = pluralAffix2.calculatePrintedLength(15);
        int int36 = pluralAffix2.scan("", 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-11) + "'", int23 == (-11));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-36) + "'", int26 == (-36));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-101) + "'", int29 == (-101));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-53) + "'", int36 == (-53));
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix5 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix6 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5);
        int int8 = pluralAffix5.calculatePrintedLength((int) (byte) 100);
        int int11 = pluralAffix5.parse("hi!", (int) (byte) 0);
        int int14 = pluralAffix5.parse("hi!", (-11));
        int int17 = pluralAffix5.scan("", (-36));
        int int20 = pluralAffix5.scan("", (int) (byte) 10);
        int int23 = pluralAffix5.scan("", (int) (byte) 10);
        int int26 = pluralAffix5.scan("", 100);
        int int29 = pluralAffix5.scan("", 0);
        int int32 = pluralAffix5.parse("hi!", (-7));
        int int35 = pluralAffix5.parse("", 97);
        int int37 = pluralAffix5.calculatePrintedLength((int) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-11) + "'", int20 == (-11));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-11) + "'", int23 == (-11));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-101) + "'", int26 == (-101));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-98) + "'", int35 == (-98));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix5 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix6 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix8 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        int int11 = simpleAffix8.scan("", 0);
        int int13 = simpleAffix8.calculatePrintedLength((int) 'a');
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix14 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix8);
        int int17 = simpleAffix8.scan("hi!", 35);
        int int20 = simpleAffix8.scan("hi!", 10);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix23 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix26 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix27 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix23, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix26);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix30 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix33 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix34 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix30, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix33);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix35 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix27, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix34);
        int int38 = compositeAffix34.scan("", (int) 'a');
        int int40 = compositeAffix34.calculatePrintedLength((int) (short) 100);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix43 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix46 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix47 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix43, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix46);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix50 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix53 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix54 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix50, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix53);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix55 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix47, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix54);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix56 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix34, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix54);
        int int58 = compositeAffix54.calculatePrintedLength(1);
        int int61 = compositeAffix54.parse("", (-33));
        int int64 = compositeAffix54.scan("hi!", (-53));
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix65 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix8, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix54);
        int int68 = simpleAffix8.scan("hi!", (int) (byte) 1);
        int int71 = simpleAffix8.scan("hi!", 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-36) + "'", int17 == (-36));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-11) + "'", int20 == (-11));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-98) + "'", int38 == (-98));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 6 + "'", int40 == 6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-33) + "'", int61 == (-33));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-36) + "'", int71 == (-36));
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder1.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder1.appendSeparatorIfFieldsAfter("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder7.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder7.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder12 = periodFormatterBuilder10.appendSeparatorIfFieldsAfter("hi!");
        java.lang.Object[] objArray14 = new java.lang.Object[] { (byte) -1, periodFormatterBuilder1, periodFormatterBuilder12, "" };
        java.util.ArrayList<java.lang.Object> objList15 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList15, objArray14);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite17 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite18 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite19 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite20 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = composite20.countFieldsToPrint(readablePeriod21, (int) ' ', locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder10);
        org.junit.Assert.assertNotNull(periodFormatterBuilder12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix1 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        int int4 = simpleAffix1.scan("", 100);
        int int7 = simpleAffix1.parse("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-101) + "'", int4 == (-101));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder3.maximumParsedDigits((int) ' ');
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder6.appendLiteral("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = periodFormatterBuilder9.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder12 = periodFormatterBuilder9.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder14 = periodFormatterBuilder12.appendPrefix("");
        org.joda.time.format.PeriodPrinter periodPrinter15 = periodFormatterBuilder14.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder.Literal literal16 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder17 = periodFormatterBuilder8.append(periodPrinter15, (org.joda.time.format.PeriodParser) literal16);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal18 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder19 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder21 = periodFormatterBuilder19.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder22 = periodFormatterBuilder19.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder23 = periodFormatterBuilder22.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder25 = periodFormatterBuilder22.maximumParsedDigits((int) ' ');
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder27 = periodFormatterBuilder25.appendLiteral("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder28 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder30 = periodFormatterBuilder28.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder31 = periodFormatterBuilder28.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder33 = periodFormatterBuilder31.appendPrefix("");
        org.joda.time.format.PeriodPrinter periodPrinter34 = periodFormatterBuilder33.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder.Literal literal35 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder36 = periodFormatterBuilder27.append(periodPrinter34, (org.joda.time.format.PeriodParser) literal35);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder37 = periodFormatterBuilder8.append((org.joda.time.format.PeriodPrinter) literal18, (org.joda.time.format.PeriodParser) literal35);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        java.util.Locale locale40 = null;
        int int41 = literal18.countFieldsToPrint(readablePeriod38, 6, locale40);
        org.joda.time.ReadWritablePeriod readWritablePeriod42 = null;
        java.util.Locale locale45 = null;
        int int46 = literal18.parseInto(readWritablePeriod42, "", 3, locale45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        java.util.Locale locale49 = null;
        int int50 = literal18.countFieldsToPrint(readablePeriod47, (int) (byte) 0, locale49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        java.util.Locale locale52 = null;
        int int53 = literal18.calculatePrintedLength(readablePeriod51, locale52);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder11);
        org.junit.Assert.assertNotNull(periodFormatterBuilder12);
        org.junit.Assert.assertNotNull(periodFormatterBuilder14);
        org.junit.Assert.assertNotNull(periodPrinter15);
        org.junit.Assert.assertNotNull(literal16);
        org.junit.Assert.assertNotNull(periodFormatterBuilder17);
        org.junit.Assert.assertNotNull(literal18);
        org.junit.Assert.assertNotNull(periodFormatterBuilder21);
        org.junit.Assert.assertNotNull(periodFormatterBuilder22);
        org.junit.Assert.assertNotNull(periodFormatterBuilder23);
        org.junit.Assert.assertNotNull(periodFormatterBuilder25);
        org.junit.Assert.assertNotNull(periodFormatterBuilder27);
        org.junit.Assert.assertNotNull(periodFormatterBuilder30);
        org.junit.Assert.assertNotNull(periodFormatterBuilder31);
        org.junit.Assert.assertNotNull(periodFormatterBuilder33);
        org.junit.Assert.assertNotNull(periodPrinter34);
        org.junit.Assert.assertNotNull(literal35);
        org.junit.Assert.assertNotNull(periodFormatterBuilder36);
        org.junit.Assert.assertNotNull(periodFormatterBuilder37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-4) + "'", int46 == (-4));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        int int5 = pluralAffix2.scan("hi!", (int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix8 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix11 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix12 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix8, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix11);
        int int15 = pluralAffix8.parse("", (int) '#');
        int int17 = pluralAffix8.calculatePrintedLength((-36));
        int int19 = pluralAffix8.calculatePrintedLength((int) (short) 1);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix20 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix8);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix23 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix26 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix27 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix23, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix26);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix30 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix33 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix34 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix30, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix33);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix35 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix27, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix34);
        int int38 = compositeAffix34.scan("", (int) 'a');
        int int40 = compositeAffix34.calculatePrintedLength((int) (short) 100);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix43 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix46 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix47 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix43, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix46);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix50 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix53 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix54 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix50, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix53);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix55 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix47, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix54);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix56 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix34, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix54);
        int int58 = compositeAffix54.calculatePrintedLength(1);
        int int61 = compositeAffix54.scan("hi!", (int) (short) 0);
        int int64 = compositeAffix54.parse("", (-2));
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix65 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix8, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix54);
        java.io.Writer writer66 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeAffix65.printTo(writer66, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-98) + "'", int38 == (-98));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 6 + "'", int40 == 6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-2) + "'", int64 == (-2));
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix5 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix6 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix8 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        int int11 = simpleAffix8.scan("", 0);
        int int13 = simpleAffix8.calculatePrintedLength((int) 'a');
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix14 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix8);
        int int17 = pluralAffix5.parse("hi!", 0);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix20 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        int int23 = pluralAffix20.scan("hi!", (int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix26 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix29 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix30 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix26, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix29);
        int int33 = pluralAffix26.parse("", (int) '#');
        int int35 = pluralAffix26.calculatePrintedLength((-36));
        int int37 = pluralAffix26.calculatePrintedLength((int) (short) 1);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix38 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix20, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix26);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix41 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix44 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix45 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix41, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix44);
        int int47 = pluralAffix44.calculatePrintedLength((int) (byte) 100);
        int int50 = pluralAffix44.parse("hi!", (int) (byte) 0);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix51 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix38, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix44);
        int int54 = compositeAffix38.scan("", (int) (byte) 10);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix55 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix38);
        int int58 = pluralAffix5.parse("hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-36) + "'", int33 == (-36));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-11) + "'", int54 == (-11));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-53) + "'", int58 == (-53));
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder1.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder1.appendSeparatorIfFieldsAfter("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder7.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder7.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder12 = periodFormatterBuilder10.appendSeparatorIfFieldsAfter("hi!");
        java.lang.Object[] objArray14 = new java.lang.Object[] { (byte) -1, periodFormatterBuilder1, periodFormatterBuilder12, "" };
        java.util.ArrayList<java.lang.Object> objList15 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList15, objArray14);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite17 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite18 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite19 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite20 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite21 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite22 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.ReadWritablePeriod readWritablePeriod23 = null;
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = composite22.parseInto(readWritablePeriod23, "hi!", 0, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder10);
        org.junit.Assert.assertNotNull(periodFormatterBuilder12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.rejectSignedValues(false);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.appendMinutes();
        periodFormatterBuilder3.clear();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder3.appendPrefix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder3.appendSecondsWithOptionalMillis();
        periodFormatterBuilder8.clear();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder8.appendDays();
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder10);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix5 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix6 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5);
        int int9 = pluralAffix2.parse("", (int) '#');
        int int12 = pluralAffix2.scan("hi!", 1);
        int int15 = pluralAffix2.scan("", 0);
        int int18 = pluralAffix2.parse("", (int) (byte) -1);
        int int21 = pluralAffix2.parse("", (-4));
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix24 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix27 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix30 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix31 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix27, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix30);
        int int33 = pluralAffix30.calculatePrintedLength(100);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix34 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix24, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix30);
        int int37 = pluralAffix30.parse("", (int) (byte) 1);
        int int39 = pluralAffix30.calculatePrintedLength(35);
        int int41 = pluralAffix30.calculatePrintedLength((-7));
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix44 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        int int47 = pluralAffix44.scan("hi!", (int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix50 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix53 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix54 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix50, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix53);
        int int57 = pluralAffix50.parse("", (int) '#');
        int int59 = pluralAffix50.calculatePrintedLength((-36));
        int int61 = pluralAffix50.calculatePrintedLength((int) (short) 1);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix62 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix44, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix50);
        int int65 = pluralAffix50.scan("", 0);
        int int68 = pluralAffix50.parse("", (-53));
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix69 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix30, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix50);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix70 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix30);
        int int72 = pluralAffix30.calculatePrintedLength((-53));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-36) + "'", int9 == (-36));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-36) + "'", int57 == (-36));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 52 + "'", int68 == 52);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 3 + "'", int72 == 3);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder0.appendPrefix("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder0.appendYears();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder6.appendSeconds();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder6.appendSeparatorIfFieldsAfter("hi!");
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatterBuilder6.toFormatter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = periodFormatterBuilder6.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder14 = periodFormatterBuilder11.appendSuffix("", "hi!");
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertNotNull(periodFormatterBuilder11);
        org.junit.Assert.assertNotNull(periodFormatterBuilder14);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder1.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder1.appendSeparatorIfFieldsAfter("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder7.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder7.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder12 = periodFormatterBuilder10.appendSeparatorIfFieldsAfter("hi!");
        java.lang.Object[] objArray14 = new java.lang.Object[] { (byte) -1, periodFormatterBuilder1, periodFormatterBuilder12, "" };
        java.util.ArrayList<java.lang.Object> objList15 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList15, objArray14);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite17 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite18 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite19 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite20 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList15);
        org.joda.time.ReadWritablePeriod readWritablePeriod21 = null;
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = composite20.parseInto(readWritablePeriod21, "", 1, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder10);
        org.junit.Assert.assertNotNull(periodFormatterBuilder12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendYears();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder2.appendSeparatorIfFieldsAfter("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder2.rejectSignedValues(true);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder2.printZeroRarelyLast();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder2.appendSeparatorIfFieldsAfter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot have two adjacent separators");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix5 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix6 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix9 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix12 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix13 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix9, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix12);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix14 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix6, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix13);
        int int17 = compositeAffix13.scan("", (int) 'a');
        int int20 = compositeAffix13.scan("hi!", (int) 'a');
        int int22 = compositeAffix13.calculatePrintedLength((int) (short) -1);
        int int25 = compositeAffix13.parse("hi!", (-33));
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix28 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix31 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix32 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix28, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix31);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix35 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix38 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix39 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix35, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix38);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix40 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix32, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix39);
        int int43 = compositeAffix39.scan("", (int) 'a');
        int int45 = compositeAffix39.calculatePrintedLength((int) (short) 100);
        int int48 = compositeAffix39.scan("", 3);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix49 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix13, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix39);
        int int52 = compositeAffix13.parse("", (int) (short) 1);
        int int55 = compositeAffix13.parse("hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-98) + "'", int17 == (-98));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-98) + "'", int20 == (-98));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-33) + "'", int25 == (-33));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-98) + "'", int43 == (-98));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 6 + "'", int45 == 6);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-4) + "'", int48 == (-4));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-2) + "'", int52 == (-2));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder2.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder2.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder4.appendSecondsWithOptionalMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder5.appendWeeks();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder5.appendSuffix("hi!", "hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder12 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder14 = periodFormatterBuilder12.maximumParsedDigits((int) (byte) -1);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder24 = periodFormatterBuilder12.appendSeparator("hi!", "", strArray23);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal26 = new org.joda.time.format.PeriodFormatterBuilder.Literal("");
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        java.util.Locale locale28 = null;
        int int29 = literal26.calculatePrintedLength(readablePeriod27, locale28);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder30 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder32 = periodFormatterBuilder30.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder33 = periodFormatterBuilder30.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder34 = periodFormatterBuilder33.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder36 = periodFormatterBuilder33.maximumParsedDigits((int) ' ');
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder38 = periodFormatterBuilder36.appendLiteral("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder39 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder41 = periodFormatterBuilder39.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder42 = periodFormatterBuilder39.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder44 = periodFormatterBuilder42.appendPrefix("");
        org.joda.time.format.PeriodPrinter periodPrinter45 = periodFormatterBuilder44.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder.Literal literal46 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder47 = periodFormatterBuilder38.append(periodPrinter45, (org.joda.time.format.PeriodParser) literal46);
        org.joda.time.format.PeriodFormatterBuilder.Separator separator50 = new org.joda.time.format.PeriodFormatterBuilder.Separator("", "", strArray23, (org.joda.time.format.PeriodPrinter) literal26, (org.joda.time.format.PeriodParser) literal46, true, false);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal52 = new org.joda.time.format.PeriodFormatterBuilder.Literal("");
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        java.util.Locale locale54 = null;
        int int55 = literal52.calculatePrintedLength(readablePeriod53, locale54);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal56 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.ReadWritablePeriod readWritablePeriod57 = null;
        java.util.Locale locale60 = null;
        int int61 = literal56.parseInto(readWritablePeriod57, "", 10, locale60);
        org.joda.time.ReadWritablePeriod readWritablePeriod62 = null;
        java.util.Locale locale65 = null;
        int int66 = literal56.parseInto(readWritablePeriod62, "hi!", (int) ' ', locale65);
        org.joda.time.format.PeriodFormatterBuilder.Separator separator67 = separator50.finish((org.joda.time.format.PeriodPrinter) literal52, (org.joda.time.format.PeriodParser) literal56);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder69 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder71 = periodFormatterBuilder69.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder72 = periodFormatterBuilder69.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder74 = periodFormatterBuilder69.appendSeparatorIfFieldsAfter("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder75 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder77 = periodFormatterBuilder75.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder78 = periodFormatterBuilder75.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder80 = periodFormatterBuilder78.appendSeparatorIfFieldsAfter("hi!");
        java.lang.Object[] objArray82 = new java.lang.Object[] { (byte) -1, periodFormatterBuilder69, periodFormatterBuilder80, "" };
        java.util.ArrayList<java.lang.Object> objList83 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList83, objArray82);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite85 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList83);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite86 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList83);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite87 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList83);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder88 = periodFormatterBuilder5.append((org.joda.time.format.PeriodPrinter) literal52, (org.joda.time.format.PeriodParser) composite87);
        org.joda.time.ReadWritablePeriod readWritablePeriod89 = null;
        java.util.Locale locale92 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int93 = composite87.parseInto(readWritablePeriod89, "", 3, locale92);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder14);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(periodFormatterBuilder24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(periodFormatterBuilder32);
        org.junit.Assert.assertNotNull(periodFormatterBuilder33);
        org.junit.Assert.assertNotNull(periodFormatterBuilder34);
        org.junit.Assert.assertNotNull(periodFormatterBuilder36);
        org.junit.Assert.assertNotNull(periodFormatterBuilder38);
        org.junit.Assert.assertNotNull(periodFormatterBuilder41);
        org.junit.Assert.assertNotNull(periodFormatterBuilder42);
        org.junit.Assert.assertNotNull(periodFormatterBuilder44);
        org.junit.Assert.assertNotNull(periodPrinter45);
        org.junit.Assert.assertNotNull(literal46);
        org.junit.Assert.assertNotNull(periodFormatterBuilder47);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(literal56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-11) + "'", int61 == (-11));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-33) + "'", int66 == (-33));
        org.junit.Assert.assertNotNull(separator67);
        org.junit.Assert.assertNotNull(periodFormatterBuilder71);
        org.junit.Assert.assertNotNull(periodFormatterBuilder72);
        org.junit.Assert.assertNotNull(periodFormatterBuilder74);
        org.junit.Assert.assertNotNull(periodFormatterBuilder77);
        org.junit.Assert.assertNotNull(periodFormatterBuilder78);
        org.junit.Assert.assertNotNull(periodFormatterBuilder80);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(periodFormatterBuilder88);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroAlways();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendSeconds();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder2.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder2.appendHours();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder4.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder5.appendMinutes();
        periodFormatterBuilder5.clear();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder5.appendDays();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder5.printZeroIfSupported();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroAlways();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.minimumPrintedDigits((int) (short) 10);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendDays();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder4.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder4.appendSeparator("hi!", "");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder8.appendLiteral("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = periodFormatterBuilder10.appendSecondsWithMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder12 = periodFormatterBuilder10.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder14 = periodFormatterBuilder12.maximumParsedDigits(1);
        periodFormatterBuilder12.clear();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder10);
        org.junit.Assert.assertNotNull(periodFormatterBuilder11);
        org.junit.Assert.assertNotNull(periodFormatterBuilder12);
        org.junit.Assert.assertNotNull(periodFormatterBuilder14);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix5 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix6 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5);
        int int9 = pluralAffix2.parse("", (int) '#');
        int int11 = pluralAffix2.calculatePrintedLength((-36));
        int int13 = pluralAffix2.calculatePrintedLength((int) (short) 1);
        int int15 = pluralAffix2.calculatePrintedLength((int) (short) 0);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix18 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix21 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix22 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix18, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix21);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix25 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix28 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix29 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix25, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix28);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix30 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix22, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix29);
        int int33 = compositeAffix29.scan("", (int) 'a');
        int int35 = compositeAffix29.calculatePrintedLength((int) (short) 100);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix38 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix41 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix42 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix38, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix41);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix45 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix48 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix49 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix45, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix48);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix50 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix42, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix49);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix51 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix29, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix49);
        int int54 = compositeAffix49.parse("", (int) (short) 10);
        int int56 = compositeAffix49.calculatePrintedLength((int) '4');
        int int58 = compositeAffix49.calculatePrintedLength(35);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix59 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix49);
        int int62 = compositeAffix49.scan("", 97);
        int int65 = compositeAffix49.parse("hi!", (-98));
        java.io.Writer writer66 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeAffix49.printTo(writer66, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-36) + "'", int9 == (-36));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-98) + "'", int33 == (-98));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-11) + "'", int54 == (-11));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 6 + "'", int56 == 6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 6 + "'", int58 == 6);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-98) + "'", int62 == (-98));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-98) + "'", int65 == (-98));
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter fieldFormatter0 = null;
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix3 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix6 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix7 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix3, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix6);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix9 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        int int12 = simpleAffix9.scan("", 0);
        int int14 = simpleAffix9.calculatePrintedLength((int) 'a');
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix15 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix6, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix9);
        int int18 = simpleAffix9.scan("hi!", 35);
        int int21 = simpleAffix9.scan("hi!", 10);
        int int23 = simpleAffix9.calculatePrintedLength(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter fieldFormatter24 = new org.joda.time.format.PeriodFormatterBuilder.FieldFormatter(fieldFormatter0, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-36) + "'", int18 == (-36));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix5 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix6 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix8 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        int int11 = simpleAffix8.scan("", 0);
        int int13 = simpleAffix8.calculatePrintedLength((int) 'a');
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix14 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix8);
        int int17 = simpleAffix8.scan("hi!", 35);
        int int20 = simpleAffix8.parse("hi!", 0);
        int int23 = simpleAffix8.scan("hi!", 35);
        int int25 = simpleAffix8.calculatePrintedLength((int) (short) 1);
        int int28 = simpleAffix8.parse("hi!", 0);
        int int31 = simpleAffix8.parse("hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-36) + "'", int17 == (-36));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-36) + "'", int23 == (-36));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder3.maximumParsedDigits((int) ' ');
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder6.appendLiteral("hi!");
        periodFormatterBuilder6.clear();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder6.appendHours();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = periodFormatterBuilder10.printZeroRarelyLast();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder12 = periodFormatterBuilder11.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder13 = periodFormatterBuilder11.appendMillis();
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder10);
        org.junit.Assert.assertNotNull(periodFormatterBuilder11);
        org.junit.Assert.assertNotNull(periodFormatterBuilder12);
        org.junit.Assert.assertNotNull(periodFormatterBuilder13);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix5 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix6 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix9 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix12 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix13 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix9, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix12);
        int int15 = pluralAffix12.calculatePrintedLength((int) (byte) 100);
        int int18 = pluralAffix12.parse("hi!", (int) (byte) 0);
        int int21 = pluralAffix12.parse("hi!", (-11));
        int int24 = pluralAffix12.scan("", (-36));
        int int27 = pluralAffix12.scan("hi!", (int) '4');
        int int30 = pluralAffix12.scan("", (int) (byte) 0);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix31 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix12);
        int int33 = compositeAffix31.calculatePrintedLength(52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-53) + "'", int27 == (-53));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix5 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix6 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5);
        int int8 = pluralAffix5.calculatePrintedLength((int) (byte) 100);
        int int11 = pluralAffix5.parse("hi!", (int) (byte) 0);
        int int14 = pluralAffix5.parse("hi!", (-11));
        int int17 = pluralAffix5.scan("", (-36));
        int int20 = pluralAffix5.scan("", (int) (byte) 10);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix23 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix26 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix27 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix23, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix26);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix28 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix26);
        int int31 = compositeAffix28.scan("", (int) (short) -1);
        int int34 = compositeAffix28.scan("hi!", 3);
        int int37 = compositeAffix28.parse("hi!", (-7));
        int int39 = compositeAffix28.calculatePrintedLength((int) (short) 0);
        int int42 = compositeAffix28.scan("", (int) (byte) -1);
        int int45 = compositeAffix28.parse("hi!", (int) (short) 10);
        java.io.Writer writer46 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeAffix28.printTo(writer46, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-11) + "'", int20 == (-11));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-4) + "'", int34 == (-4));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-7) + "'", int37 == (-7));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6 + "'", int39 == 6);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-11) + "'", int45 == (-11));
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        int int5 = pluralAffix2.parse("", 1);
        int int7 = pluralAffix2.calculatePrintedLength((int) (short) -1);
        int int10 = pluralAffix2.scan("hi!", (int) (byte) 10);
        int int13 = pluralAffix2.scan("", (int) (short) 10);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pluralAffix2.printTo(stringBuffer14, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-11) + "'", int10 == (-11));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-11) + "'", int13 == (-11));
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.joda.time.format.PeriodFormatterBuilder.Literal literal1 = new org.joda.time.format.PeriodFormatterBuilder.Literal("hi!");
        org.joda.time.ReadWritablePeriod readWritablePeriod2 = null;
        java.util.Locale locale5 = null;
        int int6 = literal1.parseInto(readWritablePeriod2, "hi!", (int) (short) 1, locale5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder3.appendHours();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder5.appendYears();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder6.appendSeparator("hi!");
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        int int5 = pluralAffix2.scan("hi!", (int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix8 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix11 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix12 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix8, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix11);
        int int15 = pluralAffix8.parse("", (int) '#');
        int int17 = pluralAffix8.calculatePrintedLength((-36));
        int int19 = pluralAffix8.calculatePrintedLength((int) (short) 1);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix20 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix8);
        int int23 = pluralAffix8.scan("", (int) (short) -1);
        int int26 = pluralAffix8.scan("", (-101));
        int int29 = pluralAffix8.parse("", (-11));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.appendWeeks();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.printZeroAlways();
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatterBuilder4.toFormatter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder4.appendSeparator("hi!", "");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder8.appendSecondsWithMillis();
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.appendWeeks();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.printZeroAlways();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder3.appendHours();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder3.appendSecondsWithOptionalMillis();
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroAlways();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendSeconds();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder2.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder2.appendMillis3Digit();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder4.appendDays();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder5.printZeroAlways();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder5.appendSecondsWithMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder7.printZeroRarelyLast();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder8.appendWeeks();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = periodFormatterBuilder9.appendPrefix("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder13 = periodFormatterBuilder9.appendPrefix("hi!");
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder11);
        org.junit.Assert.assertNotNull(periodFormatterBuilder13);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder3.appendSeparatorIfFieldsAfter("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder3.appendPrefix("hi!", "");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder3.minimumPrintedDigits((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder13 = periodFormatterBuilder3.appendSuffix("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No field to apply suffix to");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder10);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder3.maximumParsedDigits((int) ' ');
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder6.appendLiteral("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = periodFormatterBuilder9.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder12 = periodFormatterBuilder9.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder14 = periodFormatterBuilder12.appendPrefix("");
        org.joda.time.format.PeriodPrinter periodPrinter15 = periodFormatterBuilder14.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder.Literal literal16 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder17 = periodFormatterBuilder8.append(periodPrinter15, (org.joda.time.format.PeriodParser) literal16);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal18 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder19 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder21 = periodFormatterBuilder19.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder22 = periodFormatterBuilder19.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder23 = periodFormatterBuilder22.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder25 = periodFormatterBuilder22.maximumParsedDigits((int) ' ');
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder27 = periodFormatterBuilder25.appendLiteral("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder28 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder30 = periodFormatterBuilder28.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder31 = periodFormatterBuilder28.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder33 = periodFormatterBuilder31.appendPrefix("");
        org.joda.time.format.PeriodPrinter periodPrinter34 = periodFormatterBuilder33.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder.Literal literal35 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder36 = periodFormatterBuilder27.append(periodPrinter34, (org.joda.time.format.PeriodParser) literal35);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder37 = periodFormatterBuilder8.append((org.joda.time.format.PeriodPrinter) literal18, (org.joda.time.format.PeriodParser) literal35);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder38 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder40 = periodFormatterBuilder38.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder41 = periodFormatterBuilder38.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder43 = periodFormatterBuilder41.appendPrefix("");
        org.joda.time.format.PeriodFormatter periodFormatter44 = periodFormatterBuilder43.toFormatter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder45 = periodFormatterBuilder37.append(periodFormatter44);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder47 = periodFormatterBuilder37.appendLiteral("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder48 = periodFormatterBuilder37.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder50 = periodFormatterBuilder48.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder51 = periodFormatterBuilder50.appendSecondsWithMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder53 = periodFormatterBuilder51.appendSuffix("hi!");
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder11);
        org.junit.Assert.assertNotNull(periodFormatterBuilder12);
        org.junit.Assert.assertNotNull(periodFormatterBuilder14);
        org.junit.Assert.assertNotNull(periodPrinter15);
        org.junit.Assert.assertNotNull(literal16);
        org.junit.Assert.assertNotNull(periodFormatterBuilder17);
        org.junit.Assert.assertNotNull(literal18);
        org.junit.Assert.assertNotNull(periodFormatterBuilder21);
        org.junit.Assert.assertNotNull(periodFormatterBuilder22);
        org.junit.Assert.assertNotNull(periodFormatterBuilder23);
        org.junit.Assert.assertNotNull(periodFormatterBuilder25);
        org.junit.Assert.assertNotNull(periodFormatterBuilder27);
        org.junit.Assert.assertNotNull(periodFormatterBuilder30);
        org.junit.Assert.assertNotNull(periodFormatterBuilder31);
        org.junit.Assert.assertNotNull(periodFormatterBuilder33);
        org.junit.Assert.assertNotNull(periodPrinter34);
        org.junit.Assert.assertNotNull(literal35);
        org.junit.Assert.assertNotNull(periodFormatterBuilder36);
        org.junit.Assert.assertNotNull(periodFormatterBuilder37);
        org.junit.Assert.assertNotNull(periodFormatterBuilder40);
        org.junit.Assert.assertNotNull(periodFormatterBuilder41);
        org.junit.Assert.assertNotNull(periodFormatterBuilder43);
        org.junit.Assert.assertNotNull(periodFormatter44);
        org.junit.Assert.assertNotNull(periodFormatterBuilder45);
        org.junit.Assert.assertNotNull(periodFormatterBuilder47);
        org.junit.Assert.assertNotNull(periodFormatterBuilder48);
        org.junit.Assert.assertNotNull(periodFormatterBuilder50);
        org.junit.Assert.assertNotNull(periodFormatterBuilder51);
        org.junit.Assert.assertNotNull(periodFormatterBuilder53);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.maximumParsedDigits((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder12 = periodFormatterBuilder0.appendSeparator("hi!", "", strArray11);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder14 = periodFormatterBuilder12.maximumParsedDigits((int) (byte) 100);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder15 = periodFormatterBuilder14.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder16 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder18 = periodFormatterBuilder16.rejectSignedValues(false);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder20 = periodFormatterBuilder16.appendSeparatorIfFieldsAfter("");
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatterBuilder20.toFormatter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder22 = periodFormatterBuilder15.append(periodFormatter21);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder23 = periodFormatterBuilder22.appendMillis3Digit();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder25 = periodFormatterBuilder22.minimumPrintedDigits(1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder26 = periodFormatterBuilder25.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder27 = periodFormatterBuilder26.appendSecondsWithOptionalMillis();
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(periodFormatterBuilder12);
        org.junit.Assert.assertNotNull(periodFormatterBuilder14);
        org.junit.Assert.assertNotNull(periodFormatterBuilder15);
        org.junit.Assert.assertNotNull(periodFormatterBuilder18);
        org.junit.Assert.assertNotNull(periodFormatterBuilder20);
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNotNull(periodFormatterBuilder22);
        org.junit.Assert.assertNotNull(periodFormatterBuilder23);
        org.junit.Assert.assertNotNull(periodFormatterBuilder25);
        org.junit.Assert.assertNotNull(periodFormatterBuilder26);
        org.junit.Assert.assertNotNull(periodFormatterBuilder27);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix5 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix6 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix9 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix12 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix13 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix9, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix12);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix14 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix6, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix13);
        int int17 = compositeAffix13.scan("", (int) 'a');
        int int19 = compositeAffix13.calculatePrintedLength((int) (short) 100);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix22 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix25 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix26 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix22, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix25);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix29 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix32 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix33 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix29, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix32);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix34 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix26, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix33);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix35 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix13, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix33);
        int int37 = compositeAffix33.calculatePrintedLength(1);
        int int40 = compositeAffix33.parse("", (-33));
        int int43 = compositeAffix33.scan("hi!", (-53));
        int int46 = compositeAffix33.scan("", 35);
        int int48 = compositeAffix33.calculatePrintedLength(0);
        int int50 = compositeAffix33.calculatePrintedLength((-4));
        int int53 = compositeAffix33.parse("", (-36));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-98) + "'", int17 == (-98));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-33) + "'", int40 == (-33));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-36) + "'", int46 == (-36));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6 + "'", int48 == 6);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 6 + "'", int50 == 6);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-36) + "'", int53 == (-36));
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix5 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix6 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5);
        int int8 = pluralAffix5.calculatePrintedLength((int) '4');
        int int11 = pluralAffix5.scan("", (-53));
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pluralAffix5.printTo(writer12, (-98));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix5 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix6 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix5);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix9 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix12 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix13 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix9, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix12);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix14 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix6, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix13);
        int int17 = compositeAffix13.scan("", (int) 'a');
        int int20 = compositeAffix13.scan("hi!", (int) 'a');
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix23 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        int int26 = pluralAffix23.scan("hi!", (int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix29 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix32 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix33 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix29, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix32);
        int int35 = pluralAffix32.calculatePrintedLength((int) (byte) 100);
        int int38 = pluralAffix32.parse("hi!", (int) (byte) 0);
        int int41 = pluralAffix32.parse("hi!", (-11));
        int int44 = pluralAffix32.scan("", (-36));
        int int47 = pluralAffix32.scan("", (int) (byte) 10);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix48 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix23, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix32);
        int int51 = compositeAffix48.scan("", 32);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix52 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix13, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix48);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix55 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix58 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix59 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix55, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix58);
        int int61 = pluralAffix58.calculatePrintedLength((int) (byte) 100);
        int int64 = pluralAffix58.parse("hi!", (int) (byte) 0);
        int int67 = pluralAffix58.parse("hi!", (-11));
        int int70 = pluralAffix58.scan("", (-36));
        int int73 = pluralAffix58.scan("hi!", (int) '4');
        int int76 = pluralAffix58.parse("", (int) (byte) 10);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix77 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix52, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix58);
        int int80 = compositeAffix52.scan("", (int) (byte) -1);
        int int83 = compositeAffix52.parse("", (int) '4');
        java.lang.StringBuffer stringBuffer84 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeAffix52.printTo(stringBuffer84, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-98) + "'", int17 == (-98));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-98) + "'", int20 == (-98));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-11) + "'", int47 == (-11));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-33) + "'", int51 == (-33));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 35 + "'", int70 == 35);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-53) + "'", int73 == (-53));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-11) + "'", int76 == (-11));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-53) + "'", int83 == (-53));
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder4.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder4.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder7.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder7.maximumParsedDigits((int) ' ');
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder12 = periodFormatterBuilder10.appendLiteral("hi!");
        periodFormatterBuilder10.clear();
        org.joda.time.format.PeriodPrinter periodPrinter14 = periodFormatterBuilder10.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder15 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder17 = periodFormatterBuilder15.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder18 = periodFormatterBuilder15.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder20 = periodFormatterBuilder18.appendPrefix("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder21 = periodFormatterBuilder18.appendYears();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder22 = periodFormatterBuilder21.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder23 = periodFormatterBuilder22.appendMillis();
        org.joda.time.format.PeriodParser periodParser24 = periodFormatterBuilder22.toParser();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder25 = periodFormatterBuilder3.append(periodPrinter14, periodParser24);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder26 = periodFormatterBuilder3.appendSecondsWithOptionalMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder28 = periodFormatterBuilder26.appendSuffix("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder29 = periodFormatterBuilder26.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder30 = periodFormatterBuilder29.appendYears();
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder10);
        org.junit.Assert.assertNotNull(periodFormatterBuilder12);
        org.junit.Assert.assertNotNull(periodPrinter14);
        org.junit.Assert.assertNotNull(periodFormatterBuilder17);
        org.junit.Assert.assertNotNull(periodFormatterBuilder18);
        org.junit.Assert.assertNotNull(periodFormatterBuilder20);
        org.junit.Assert.assertNotNull(periodFormatterBuilder21);
        org.junit.Assert.assertNotNull(periodFormatterBuilder22);
        org.junit.Assert.assertNotNull(periodFormatterBuilder23);
        org.junit.Assert.assertNotNull(periodParser24);
        org.junit.Assert.assertNotNull(periodFormatterBuilder25);
        org.junit.Assert.assertNotNull(periodFormatterBuilder26);
        org.junit.Assert.assertNotNull(periodFormatterBuilder28);
        org.junit.Assert.assertNotNull(periodFormatterBuilder29);
        org.junit.Assert.assertNotNull(periodFormatterBuilder30);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        int int5 = pluralAffix2.scan("hi!", (int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix8 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix11 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("", "hi!");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix12 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix8, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix11);
        int int14 = pluralAffix11.calculatePrintedLength((int) (byte) 100);
        int int17 = pluralAffix11.parse("hi!", (int) (byte) 0);
        int int20 = pluralAffix11.parse("hi!", (-11));
        int int23 = pluralAffix11.scan("", (-36));
        int int26 = pluralAffix11.scan("", (int) (byte) 10);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix27 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) pluralAffix11);
        int int30 = compositeAffix27.scan("", 32);
        int int33 = compositeAffix27.scan("", (-98));
        int int36 = compositeAffix27.scan("", (-7));
        java.io.Writer writer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeAffix27.printTo(writer37, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-11) + "'", int26 == (-11));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-33) + "'", int30 == (-33));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-98) + "'", int33 == (-98));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-7) + "'", int36 == (-7));
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroAlways();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.minimumPrintedDigits((int) (short) 10);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatterBuilder3.toParser();
        org.joda.time.format.PeriodFormatterBuilder.Literal literal5 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.ReadWritablePeriod readWritablePeriod6 = null;
        java.util.Locale locale9 = null;
        int int10 = literal5.parseInto(readWritablePeriod6, "", 10, locale9);
        org.joda.time.ReadWritablePeriod readWritablePeriod11 = null;
        java.util.Locale locale14 = null;
        int int15 = literal5.parseInto(readWritablePeriod11, "hi!", (int) ' ', locale14);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder24 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder26 = periodFormatterBuilder24.rejectSignedValues(false);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder27 = periodFormatterBuilder24.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder28 = periodFormatterBuilder24.appendYears();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder29 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder31 = periodFormatterBuilder29.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder32 = periodFormatterBuilder29.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder33 = periodFormatterBuilder32.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder35 = periodFormatterBuilder32.maximumParsedDigits((int) ' ');
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder37 = periodFormatterBuilder35.appendLiteral("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder38 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder40 = periodFormatterBuilder38.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder41 = periodFormatterBuilder38.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder43 = periodFormatterBuilder41.appendPrefix("");
        org.joda.time.format.PeriodPrinter periodPrinter44 = periodFormatterBuilder43.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder.Literal literal45 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder46 = periodFormatterBuilder37.append(periodPrinter44, (org.joda.time.format.PeriodParser) literal45);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal47 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder48 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder50 = periodFormatterBuilder48.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder51 = periodFormatterBuilder48.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder52 = periodFormatterBuilder51.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder54 = periodFormatterBuilder51.maximumParsedDigits((int) ' ');
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder56 = periodFormatterBuilder54.appendLiteral("hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder57 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder59 = periodFormatterBuilder57.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder60 = periodFormatterBuilder57.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder62 = periodFormatterBuilder60.appendPrefix("");
        org.joda.time.format.PeriodPrinter periodPrinter63 = periodFormatterBuilder62.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder.Literal literal64 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder65 = periodFormatterBuilder56.append(periodPrinter63, (org.joda.time.format.PeriodParser) literal64);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder66 = periodFormatterBuilder37.append((org.joda.time.format.PeriodPrinter) literal47, (org.joda.time.format.PeriodParser) literal64);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal67 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder68 = periodFormatterBuilder28.append((org.joda.time.format.PeriodPrinter) literal64, (org.joda.time.format.PeriodParser) literal67);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder69 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder71 = periodFormatterBuilder69.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder72 = periodFormatterBuilder69.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder73 = periodFormatterBuilder72.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder74 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder76 = periodFormatterBuilder74.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder77 = periodFormatterBuilder74.appendMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder79 = periodFormatterBuilder77.appendPrefix("");
        org.joda.time.format.PeriodPrinter periodPrinter80 = periodFormatterBuilder79.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder81 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder83 = periodFormatterBuilder81.maximumParsedDigits((int) (byte) -1);
        org.joda.time.format.PeriodParser periodParser84 = periodFormatterBuilder81.toParser();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder85 = periodFormatterBuilder72.append(periodPrinter80, periodParser84);
        org.joda.time.format.PeriodFormatterBuilder.Separator separator88 = new org.joda.time.format.PeriodFormatterBuilder.Separator("hi!", "hi!", strArray23, (org.joda.time.format.PeriodPrinter) literal67, periodParser84, true, false);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder89 = periodFormatterBuilder3.append((org.joda.time.format.PeriodPrinter) literal5, (org.joda.time.format.PeriodParser) separator88);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder91 = periodFormatterBuilder89.appendPrefix("");
        org.joda.time.format.PeriodPrinter periodPrinter92 = periodFormatterBuilder91.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder94 = periodFormatterBuilder91.minimumPrintedDigits((int) (byte) 1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodParser4);
        org.junit.Assert.assertNotNull(literal5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-11) + "'", int10 == (-11));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-33) + "'", int15 == (-33));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(periodFormatterBuilder26);
        org.junit.Assert.assertNotNull(periodFormatterBuilder27);
        org.junit.Assert.assertNotNull(periodFormatterBuilder28);
        org.junit.Assert.assertNotNull(periodFormatterBuilder31);
        org.junit.Assert.assertNotNull(periodFormatterBuilder32);
        org.junit.Assert.assertNotNull(periodFormatterBuilder33);
        org.junit.Assert.assertNotNull(periodFormatterBuilder35);
        org.junit.Assert.assertNotNull(periodFormatterBuilder37);
        org.junit.Assert.assertNotNull(periodFormatterBuilder40);
        org.junit.Assert.assertNotNull(periodFormatterBuilder41);
        org.junit.Assert.assertNotNull(periodFormatterBuilder43);
        org.junit.Assert.assertNotNull(periodPrinter44);
        org.junit.Assert.assertNotNull(literal45);
        org.junit.Assert.assertNotNull(periodFormatterBuilder46);
        org.junit.Assert.assertNotNull(literal47);
        org.junit.Assert.assertNotNull(periodFormatterBuilder50);
        org.junit.Assert.assertNotNull(periodFormatterBuilder51);
        org.junit.Assert.assertNotNull(periodFormatterBuilder52);
        org.junit.Assert.assertNotNull(periodFormatterBuilder54);
        org.junit.Assert.assertNotNull(periodFormatterBuilder56);
        org.junit.Assert.assertNotNull(periodFormatterBuilder59);
        org.junit.Assert.assertNotNull(periodFormatterBuilder60);
        org.junit.Assert.assertNotNull(periodFormatterBuilder62);
        org.junit.Assert.assertNotNull(periodPrinter63);
        org.junit.Assert.assertNotNull(literal64);
        org.junit.Assert.assertNotNull(periodFormatterBuilder65);
        org.junit.Assert.assertNotNull(periodFormatterBuilder66);
        org.junit.Assert.assertNotNull(literal67);
        org.junit.Assert.assertNotNull(periodFormatterBuilder68);
        org.junit.Assert.assertNotNull(periodFormatterBuilder71);
        org.junit.Assert.assertNotNull(periodFormatterBuilder72);
        org.junit.Assert.assertNotNull(periodFormatterBuilder73);
        org.junit.Assert.assertNotNull(periodFormatterBuilder76);
        org.junit.Assert.assertNotNull(periodFormatterBuilder77);
        org.junit.Assert.assertNotNull(periodFormatterBuilder79);
        org.junit.Assert.assertNotNull(periodPrinter80);
        org.junit.Assert.assertNotNull(periodFormatterBuilder83);
        org.junit.Assert.assertNotNull(periodParser84);
        org.junit.Assert.assertNotNull(periodFormatterBuilder85);
        org.junit.Assert.assertNotNull(periodFormatterBuilder89);
        org.junit.Assert.assertNotNull(periodFormatterBuilder91);
        org.junit.Assert.assertNotNull(periodPrinter92);
        org.junit.Assert.assertNotNull(periodFormatterBuilder94);
    }
}

